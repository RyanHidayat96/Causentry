package com.bpjstku.data.lib;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010#2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Lcom/bpjstku/data/lib/OtherPreferences;", "", "Landroid/content/Context;", "p0", "", "p1", "Lcom/google/gson/Gson;", "p2", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/gson/Gson;)V", "", "getBoolean", "(Ljava/lang/String;Z)Z", "", "saveBoolean", "(Ljava/lang/String;Z)V", "", "getInt", "(Ljava/lang/String;I)I", "saveInt", "(Ljava/lang/String;I)V", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "saveString", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getLong", "(Ljava/lang/String;J)J", "saveLong", "(Ljava/lang/String;J)V", "", "getFloat", "(Ljava/lang/String;F)F", "saveFloat", "(Ljava/lang/String;F)V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "getObject", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "saveObject", "(Ljava/lang/String;Ljava/lang/Object;)V", "clean", "()V", "context", "Landroid/content/Context;", "prefName", "Ljava/lang/String;", "gson", "Lcom/google/gson/Gson;", "Landroid/content/SharedPreferences;", "mPreferences$delegate", "Lkotlin/Lazy;", "getMPreferences", "()Landroid/content/SharedPreferences;", "mPreferences"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OtherPreferences {
    public static final int $stable = 8;
    private final Context context;
    private final Gson gson;

    /* JADX INFO: renamed from: mPreferences$delegate, reason: from kotlin metadata */
    private final Lazy mPreferences;
    private final String prefName;

    public OtherPreferences(Context context, String str, Gson gson) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.context = context;
        this.prefName = str;
        this.gson = gson;
        this.mPreferences = LazyKt.lazy(new Function0() { // from class: com.bpjstku.data.lib.OtherPreferences$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtherPreferences.mPreferences_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final SharedPreferences getMPreferences() {
        Object value = this.mPreferences.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences mPreferences_delegate$lambda$0(OtherPreferences otherPreferences) {
        return otherPreferences.context.getSharedPreferences(otherPreferences.prefName, 0);
    }

    public final boolean getBoolean(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getBoolean(p0, p1);
    }

    public final void saveBoolean(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putBoolean(p0, p1).apply();
    }

    public final int getInt(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getInt(p0, p1);
    }

    public final void saveInt(String p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putInt(p0, p1).apply();
    }

    public final String getString(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String string = getMPreferences().getString(p0, p1);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void saveString(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getMPreferences().edit().putString(p0, p1).apply();
    }

    public final long getLong(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getLong(p0, p1);
    }

    public final void saveLong(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putLong(p0, p1).apply();
    }

    public final float getFloat(String p0, float p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getMPreferences().getFloat(p0, p1);
    }

    public final void saveFloat(String p0, float p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        getMPreferences().edit().putFloat(p0, p1).apply();
    }

    public final <T> T getObject(String p0, Class<T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String string = getString(p0, "");
        if (string.length() <= 0) {
            return null;
        }
        try {
            return (T) this.gson.fromJson(string, (Class) p1);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void saveObject(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        getMPreferences().edit().putString(p0, this.gson.toJson(p1)).apply();
    }

    public final void clean() {
        Set<String> setKeySet = getMPreferences().getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (!Intrinsics.areEqual((String) obj, "CLAIM_STATUS")) {
                arrayList.add(obj);
            }
        }
        SharedPreferences.Editor editorEdit = getMPreferences().edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
