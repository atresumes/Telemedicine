package com.google.android.gms.ads.identifier;

import android.support.annotation.WorkerThread;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class zza {
    @WorkerThread
    public void zzu(String str) {
        String valueOf;
        Throwable e;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= 300) {
                Log.w("HttpUrlPinger", new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (Throwable e2) {
            valueOf = String.valueOf(e2.getMessage());
            Log.w("HttpUrlPinger", new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(valueOf).toString(), e2);
        } catch (IOException e3) {
            e2 = e3;
            valueOf = String.valueOf(e2.getMessage());
            Log.w("HttpUrlPinger", new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString(), e2);
        } catch (RuntimeException e4) {
            e2 = e4;
            valueOf = String.valueOf(e2.getMessage());
            Log.w("HttpUrlPinger", new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString(), e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
