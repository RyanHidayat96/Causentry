package com.bpjstku.data.lib;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001H&¢\u0006\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/lib/PreferenceManager;", "", "", "p0", "", "p1", "getBoolean", "(Ljava/lang/String;Z)Z", "", "saveBoolean", "(Ljava/lang/String;Z)V", "", "getInt", "(Ljava/lang/String;I)I", "saveInt", "(Ljava/lang/String;I)V", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "saveString", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getLong", "(Ljava/lang/String;J)J", "saveLong", "(Ljava/lang/String;J)V", "", "getFloat", "(Ljava/lang/String;F)F", "saveFloat", "(Ljava/lang/String;F)V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "getObject", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "saveObject", "(Ljava/lang/String;Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PreferenceManager {
    boolean getBoolean(String p0, boolean p1);

    float getFloat(String p0, float p1);

    int getInt(String p0, int p1);

    long getLong(String p0, long p1);

    <T> T getObject(String p0, Class<T> p1);

    String getString(String p0, String p1);

    void saveBoolean(String p0, boolean p1);

    void saveFloat(String p0, float p1);

    void saveInt(String p0, int p1);

    void saveLong(String p0, long p1);

    void saveObject(String p0, Object p1);

    void saveString(String p0, String p1);

    static /* synthetic */ boolean getBoolean$default(PreferenceManager preferenceManager, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return preferenceManager.getBoolean(str, z);
    }

    static /* synthetic */ int getInt$default(PreferenceManager preferenceManager, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return preferenceManager.getInt(str, i);
    }

    static /* synthetic */ String getString$default(PreferenceManager preferenceManager, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return preferenceManager.getString(str, str2);
    }

    static /* synthetic */ long getLong$default(PreferenceManager preferenceManager, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        return preferenceManager.getLong(str, j);
    }

    static /* synthetic */ float getFloat$default(PreferenceManager preferenceManager, String str, float f, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloat");
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return preferenceManager.getFloat(str, f);
    }
}
