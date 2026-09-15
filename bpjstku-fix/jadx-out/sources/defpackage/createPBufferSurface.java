package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class createPBufferSurface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f887a = "device_id.xml";
    private static String asBinder = "device_id";
    Boolean TuitionPaymentFragmentbindingInflater1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    String b;
    String d;
    String g;

    public createPBufferSurface(Context context) {
        this.b = b(context);
    }

    private String b(Context context) {
        String string;
        synchronized (GLUtils.class) {
            String str = this.b;
            if (str != null) {
                return str;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("device_id.xml", 0);
            String string2 = sharedPreferences.getString("device_id", null);
            if (string2 != null) {
                return UUID.fromString(string2).toString();
            }
            String string3 = Settings.Secure.getString(context.getContentResolver(), "android_id");
            try {
                if (!"9774d56d682e549c".equals(string3)) {
                    string = UUID.nameUUIDFromBytes(string3.getBytes("utf8")).toString();
                } else {
                    string = UUID.randomUUID().toString();
                }
                sharedPreferences.edit().putString("device_id", string.toString()).commit();
                return string;
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public /* synthetic */ createPBufferSurface() {
    }
}
