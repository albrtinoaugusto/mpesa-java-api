package main;

import main.Constant;
import java.util.Map;

import com.fc.sdk.APIContext;
import com.fc.sdk.APIMethodType;
import com.fc.sdk.APIRequest;
import com.fc.sdk.APIResponse;

public class Controller
{

    // Metodo para efectuar pagamento
    public boolean doPayment(String phone, String amount, String pack, String reference)
    {
        
        boolean done = false;
        
        APIContext context = new APIContext();
        // Set API key that can be found in the user profile section
        context.setApiKey(Constant.APIKEY);
        // Set Public key that can be found in the user profile section
        context.setPublicKey(Constant.PUBLICKEY);
        // Set SSL true or false
        context.setSsl(true);
        // Set the method type of the HTTP Request (GET, POST, PUT)
        context.setMethodType(APIMethodType.POST);
        // Set the address of the API Server
        context.setAddress(Constant.SERVERAPI);
        // Set the TCP port of the API Server
        context.setPort(18346);
        // Set path for the API
        context.setPath(Constant.SERVERPATH);

        // Add Header
        context.addHeader("Origin", "*");

        // Set parameters used for the API
        context.addParameter(Constant.TRANSITION_KEY_REF, Constant.TRANSITION_VALUE_REF);
        context.addParameter("input_Amount", amount);
        context.addParameter("input_CustomerMSISDN", phone);
        context.addParameter("input_ServiceProviderCode", "171717");
        context.addParameter("input_TransactionReference", reference);

        // Create API request and execute it.
        APIRequest request = new APIRequest(context);
        APIResponse response = request.execute();

        // Print results to the console
        if (response != null)
        {
            System.out.println(response.getStatusCode() + " - " + response.getReason());
            System.out.println(response.getResult());

            for (Map.Entry<String, String> entry : response.getParameters().entrySet())
            {
                System.out.println(entry.getKey() + ":" + response.getParameter(entry.getKey()));
            }
            
            done = true;
        }

        return done;
    }

}
