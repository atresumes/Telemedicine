package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.MainThread;
import com.google.android.gms.internal.zzaub;
import com.google.android.gms.internal.zzaub.zza;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements zza {
    private zzaub zzbqj;

    private zzaub zzJS() {
        if (this.zzbqj == null) {
            this.zzbqj = new zzaub(this);
        }
        return this.zzbqj;
    }

    public void doStartService(Context context, Intent intent) {
    }

    @MainThread
    public void onReceive(Context context, Intent intent) {
        zzJS().onReceive(context, intent);
    }
}
