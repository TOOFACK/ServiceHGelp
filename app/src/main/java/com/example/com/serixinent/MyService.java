package com.example.com.serixinent;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MyService extends Service {
    MyTask mytask;
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mytask = new MyTask();
        mytask.execute();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        System.out.println("Сосать");
        super.onDestroy();
        mytask.cancel(true);
    }
}
class MyTask extends AsyncTask<Void,Integer,Integer>{


    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
        System.out.println(integer);
    }

    @Override
    protected Integer doInBackground(Void... voids) {

        for(int i = 0; i<5; i++){
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        System.out.println(values[0]);

    }


}

