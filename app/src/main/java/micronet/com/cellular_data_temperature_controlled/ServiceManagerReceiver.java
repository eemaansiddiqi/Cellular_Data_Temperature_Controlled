package micronet.com.cellular_data_temperature_controlled;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;


/**
 * Created by eemaan.siddiqi on 1/13/2017.
 */
public class ServiceManagerReceiver extends BroadcastReceiver {
    public static final String ACTION_START_SERVICE = "micronet.com.cellular_data_temperature_controlled.START_SERVICE";
    public static final String ACTION_PAUSE_SERVICE = "micronet.com.cellular_data_temperature_controlled.PAUSE_SERVICE";
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(ACTION_PAUSE_SERVICE)) {
            // TODO: pause service
            Intent service = new Intent(context,Cellular_Data_Service.class);
            context.stopService(service);
            Log.d(TAG, "Service Paused   ");

        } else if(intent.getAction().equals(ACTION_START_SERVICE) ) {
            // TODO: start service
            Intent service = new Intent(context,Cellular_Data_Service.class);
            context.startService(service);
        }
    }
}
