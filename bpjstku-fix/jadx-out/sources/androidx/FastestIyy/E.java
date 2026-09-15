package androidx.FastestIyy;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class E extends AbstractC0201w {
    public E(Context context) {
        super(context);
    }

    public final void a() {
        a0.a(3, new b0() { // from class: androidx.FastestIyy.E$$ExternalSyntheticLambda0
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.b(jSONArray);
            }
        });
        a0.a(98, new b0() { // from class: androidx.FastestIyy.E$$ExternalSyntheticLambda1
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.c(jSONArray);
            }
        });
        a0.a(283, new b0() { // from class: androidx.FastestIyy.E$$ExternalSyntheticLambda2
            @Override // androidx.FastestIyy.b0
            public final Object a(JSONArray jSONArray) {
                return this.f$0.d(jSONArray);
            }
        });
    }

    public final Object b(JSONArray jSONArray) {
        boolean z;
        try {
            File file = new File(AbstractC0201w.a(jSONArray));
            z = !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c(JSONArray jSONArray) throws ClassNotFoundException {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        String str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.crypto.state", "");
        return Boolean.valueOf(TextUtils.isEmpty(str) || TextUtils.equals(str, "unencrypted"));
    }

    public final Object d(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("downloads", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("externalstorage", Environment.getExternalStorageDirectory().getAbsolutePath());
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
