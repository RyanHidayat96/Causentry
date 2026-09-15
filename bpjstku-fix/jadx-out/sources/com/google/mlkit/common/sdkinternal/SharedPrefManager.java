package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModel;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class SharedPrefManager {
    public static final Component<?> COMPONENT = Component.builder(SharedPrefManager.class).add(Dependency.required((Class<?>) MlKitContext.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.common.sdkinternal.zzs
        @Override // com.google.firebase.components.ComponentFactory
        public final Object create(ComponentContainer componentContainer) {
            return new SharedPrefManager((Context) componentContainer.get(Context.class));
        }
    }).build();
    public static final String PREF_FILE = "com.google.mlkit.internal";
    private final Context zza;

    public static SharedPrefManager getInstance(MlKitContext mlKitContext) {
        return (SharedPrefManager) mlKitContext.get(SharedPrefManager.class);
    }

    private final SharedPreferences zzc() {
        return this.zza.getSharedPreferences(PREF_FILE, 0);
    }

    public void clearDownloadingModelInfo(RemoteModel remoteModel) {
        synchronized (this) {
            zzc().edit().remove(String.format("downloading_model_id_%s", remoteModel.getUniqueModelNameForPersist())).remove(String.format("downloading_model_hash_%s", remoteModel.getUniqueModelNameForPersist())).remove(String.format("downloading_model_type_%s", getDownloadingModelHash(remoteModel))).remove(String.format("downloading_begin_time_%s", remoteModel.getUniqueModelNameForPersist())).remove(String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist())).apply();
        }
    }

    public void clearIncompatibleModelInfo(RemoteModel remoteModel) {
        synchronized (this) {
            zzc().edit().remove(String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist())).remove("app_version").apply();
        }
    }

    public void clearLatestModelHash(RemoteModel remoteModel) {
        synchronized (this) {
            zzc().edit().remove(String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist())).commit();
        }
    }

    public String getDownloadingModelHash(RemoteModel remoteModel) {
        String string;
        synchronized (this) {
            string = zzc().getString(String.format("downloading_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
        }
        return string;
    }

    public Long getDownloadingModelId(RemoteModel remoteModel) {
        synchronized (this) {
            long j = zzc().getLong(String.format("downloading_model_id_%s", remoteModel.getUniqueModelNameForPersist()), -1L);
            if (j < 0) {
                return null;
            }
            return Long.valueOf(j);
        }
    }

    public String getIncompatibleModelHash(RemoteModel remoteModel) {
        String string;
        synchronized (this) {
            string = zzc().getString(String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
        }
        return string;
    }

    public String getLatestModelHash(RemoteModel remoteModel) {
        String string;
        synchronized (this) {
            string = zzc().getString(String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), null);
        }
        return string;
    }

    public String getMlSdkInstanceId() {
        synchronized (this) {
            String string = zzc().getString("ml_sdk_instance_id", null);
            if (string != null) {
                return string;
            }
            String string2 = UUID.randomUUID().toString();
            zzc().edit().putString("ml_sdk_instance_id", string2).apply();
            return string2;
        }
    }

    public long getModelDownloadBeginTimeMs(RemoteModel remoteModel) {
        long j;
        synchronized (this) {
            j = zzc().getLong(String.format("downloading_begin_time_%s", remoteModel.getUniqueModelNameForPersist()), 0L);
        }
        return j;
    }

    public long getModelFirstUseTimeMs(RemoteModel remoteModel) {
        long j;
        synchronized (this) {
            j = zzc().getLong(String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist()), 0L);
        }
        return j;
    }

    public String getPreviousAppVersion() {
        String string;
        synchronized (this) {
            string = zzc().getString("app_version", null);
        }
        return string;
    }

    public void setDownloadingModelInfo(long j, ModelInfo modelInfo) {
        synchronized (this) {
            String modelNameForPersist = modelInfo.getModelNameForPersist();
            zzc().edit().putString(String.format("downloading_model_hash_%s", modelNameForPersist), modelInfo.getModelHash()).putLong(String.format("downloading_model_id_%s", modelNameForPersist), j).putLong(String.format("downloading_begin_time_%s", modelNameForPersist), SystemClock.elapsedRealtime()).apply();
        }
    }

    public void setIncompatibleModelInfo(RemoteModel remoteModel, String str, String str2) {
        synchronized (this) {
            zzc().edit().putString(String.format("bad_hash_%s", remoteModel.getUniqueModelNameForPersist()), str).putString("app_version", str2).apply();
        }
    }

    public void setLatestModelHash(RemoteModel remoteModel, String str) {
        synchronized (this) {
            zzc().edit().putString(String.format("current_model_hash_%s", remoteModel.getUniqueModelNameForPersist()), str).apply();
        }
    }

    public void setModelFirstUseTimeMs(RemoteModel remoteModel, long j) {
        synchronized (this) {
            zzc().edit().putLong(String.format("model_first_use_time_%s", remoteModel.getUniqueModelNameForPersist()), j).apply();
        }
    }

    public final String zza(String str, long j) {
        String string;
        synchronized (this) {
            string = zzc().getString(String.format("cached_local_model_hash_%1s_%2s", Preconditions.checkNotNull(str), Long.valueOf(j)), null);
        }
        return string;
    }

    public final void zzb(String str, long j, String str2) {
        synchronized (this) {
            zzc().edit().putString(String.format("cached_local_model_hash_%1s_%2s", Preconditions.checkNotNull(str), Long.valueOf(j)), str2).apply();
        }
    }

    public SharedPrefManager(Context context) {
        this.zza = context;
    }
}
