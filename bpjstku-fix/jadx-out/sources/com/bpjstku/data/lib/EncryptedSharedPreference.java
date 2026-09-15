package com.bpjstku.data.lib;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.di.ApiModuleKt;
import com.google.gson.Gson;
import defpackage.MediaBrowserCompatItemCallback;
import defpackage.MediaBrowserCompatMediaBrowserImplApi21;
import defpackage.MediaBrowserCompatMediaBrowserImplApi211;
import defpackage.MediaBrowserCompatMediaBrowserImplApi213;
import defpackage.MediaBrowserCompatMediaBrowserImplApi217;
import defpackage.MediaBrowserCompatMediaBrowserImplApi23;
import defpackage.MediaBrowserCompatMediaBrowserImplApi26;
import defpackage.MediaBrowserCompatMediaBrowserImplBase3;
import defpackage.isCurrent;
import defpackage.onItemLoaded;
import defpackage.onReceiveResult;
import defpackage.onResult;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010#2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\r¢\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106"}, d2 = {"Lcom/bpjstku/data/lib/EncryptedSharedPreference;", "Lcom/bpjstku/data/lib/PreferenceManager;", "Landroid/content/Context;", "p0", "", "p1", "Lcom/google/gson/Gson;", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/gson/Gson;)V", "", "getBoolean", "(Ljava/lang/String;Z)Z", "", "saveBoolean", "(Ljava/lang/String;Z)V", "", "getInt", "(Ljava/lang/String;I)I", "saveInt", "(Ljava/lang/String;I)V", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "saveString", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getLong", "(Ljava/lang/String;J)J", "saveLong", "(Ljava/lang/String;J)V", "", "getFloat", "(Ljava/lang/String;F)F", "saveFloat", "(Ljava/lang/String;F)V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "getObject", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "", "saveObject", "(Ljava/lang/String;Ljava/lang/Object;)V", "clean", "()V", "context", "Landroid/content/Context;", "prefName", "Ljava/lang/String;", "gson", "Lcom/google/gson/Gson;", "LonItemLoaded;", "mPreferences$delegate", "Lkotlin/Lazy;", "getMPreferences", "()LonItemLoaded;", "mPreferences"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncryptedSharedPreference implements PreferenceManager {
    public static final int $stable = 8;
    private final Context context;
    private final Gson gson;

    /* JADX INFO: renamed from: mPreferences$delegate, reason: from kotlin metadata */
    private final Lazy mPreferences;
    private final String prefName;

    public EncryptedSharedPreference(Context context, String str, Gson gson) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.context = context;
        this.prefName = str;
        this.gson = gson;
        this.mPreferences = LazyKt.lazy(new Function0() { // from class: com.bpjstku.data.lib.EncryptedSharedPreference$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EncryptedSharedPreference.mPreferences_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final onItemLoaded getMPreferences() {
        Object value = this.mPreferences.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (onItemLoaded) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final onItemLoaded mPreferences_delegate$lambda$0(EncryptedSharedPreference encryptedSharedPreference) throws Throwable {
        onReceiveResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new onReceiveResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1(encryptedSharedPreference.context, encryptedSharedPreference.prefName, (byte) 0);
        char[] charArray = ApiModuleKt.getAppSignature().toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        if (charArray == null || charArray.length == 0) {
            charArray = null;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.f1303a = charArray;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MediaBrowserCompatMediaBrowserImplApi26();
        byte[] bytes = ApiModuleKt.getContentKeyDigest().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact = new MediaBrowserCompatMediaBrowserImplApi217(bytes);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel = new SecureRandom();
        Context context = encryptedSharedPreference.context;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        onReceiveResult.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(context, string);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.asInterface == null) {
            throw new IllegalArgumentException("No encryption fingerprint is set - see encryptionFingerprint() methods");
        }
        MediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.b;
        Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        MediaBrowserCompatMediaBrowserImplApi23 mediaBrowserCompatMediaBrowserImplApi23 = new MediaBrowserCompatMediaBrowserImplApi23(tuitionPaymentFragmentbindingInflater1, (byte) 0);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                throw new IllegalStateException("enabling kitkat support will prevent using custom encryption implementation");
            }
            MediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B = MediaBrowserCompatMediaBrowserImplApi23.b(mediaBrowserCompatMediaBrowserImplApi23);
            tuitionPaymentFragmentbindingInflater1B.b = new onResult(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.INotificationSideChannel, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.d);
            tuitionPaymentFragmentbindingInflater1B.asBinder = -19;
            Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1B.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new MediaBrowserCompatMediaBrowserImplApi23(tuitionPaymentFragmentbindingInflater1B, (byte) 0));
        }
        if (mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            MediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1B2 = MediaBrowserCompatMediaBrowserImplApi23.b(mediaBrowserCompatMediaBrowserImplApi23);
            tuitionPaymentFragmentbindingInflater1B2.b = new MediaBrowserCompatItemCallback(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.INotificationSideChannel, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.d);
            Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            mediaBrowserCompatMediaBrowserImplApi23 = new MediaBrowserCompatMediaBrowserImplApi23(tuitionPaymentFragmentbindingInflater1B2, (byte) 0);
        }
        MediaBrowserCompatMediaBrowserImplApi213 mediaBrowserCompatMediaBrowserImplApi213 = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.asInterface;
        MediaBrowserCompatMediaBrowserImplBase3 mediaBrowserCompatMediaBrowserImplBase3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.onTransact;
        SecureRandom secureRandom = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.INotificationSideChannel;
        boolean z = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        MediaBrowserCompatMediaBrowserImplApi211.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MediaBrowserCompatMediaBrowserImplApi211.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaBrowserCompatMediaBrowserImplApi23, mediaBrowserCompatMediaBrowserImplApi213, mediaBrowserCompatMediaBrowserImplBase3, secureRandom, false, Collections.unmodifiableList(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        MediaBrowserCompatMediaBrowserImplApi21 mediaBrowserCompatMediaBrowserImplApi21 = mediaBrowserCompatMediaBrowserImplApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        SharedPreferences sharedPreferences = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.cancelAll;
        return new isCurrent(tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.g, tuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.asBinder, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.f1303a, tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.cancel);
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final boolean getBoolean(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getBoolean(p0, p1);
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final void saveBoolean(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putBoolean(p0, p1).apply();
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final int getInt(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getInt(p0, p1);
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final void saveInt(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putInt(p0, p1).apply();
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final String getString(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String string = getMPreferences().getString(p0, p1);
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final void saveString(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getMPreferences().edit().putString(p0, p1).apply();
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final long getLong(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getLong(p0, p1);
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final void saveLong(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putLong(p0, p1).apply();
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final float getFloat(String p0, float p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getFloat(p0, p1);
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final void saveFloat(String p0, float p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putFloat(p0, p1).apply();
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final <T> T getObject(String p0, Class<T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String string$default = PreferenceManager.getString$default(this, p0, null, 2, null);
        if (string$default.length() <= 0) {
            return null;
        }
        try {
            return (T) this.gson.fromJson(string$default, (Class) p1);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bpjstku.data.lib.PreferenceManager
    public final void saveObject(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getMPreferences().edit().putString(p0, this.gson.toJson(p1)).apply();
    }

    public final void clean() {
        getMPreferences().edit().clear().apply();
    }
}
