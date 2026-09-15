package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.mixpanel.android.mpmetrics.MPDbAdapter;
import com.mixpanel.android.util.RemoteService;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.codec.binary.Hex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class forceSetProvider {
    private static final Map<Context, forceSetProvider> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap();
    public final d TuitionPaymentFragmentbindingInflater1 = new d();
    protected final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    protected final calculateOutConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static class asInterface extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private forceSetProvider(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = calculateOutConfig.b(context);
        new sendCameraCaptureResultToChild().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static forceSetProvider TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
        forceSetProvider forcesetprovider;
        Map<Context, forceSetProvider> map = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (!map.containsKey(applicationContext)) {
                forcesetprovider = new forceSetProvider(applicationContext);
                map.put(applicationContext, forcesetprovider);
            } else {
                forcesetprovider = map.get(applicationContext);
            }
        }
        return forcesetprovider;
    }

    public final void b(b bVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = bVar;
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
    }

    public final void TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        messageObtain.arg1 = 0;
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(messageObtain);
    }

    protected static MPDbAdapter TuitionPaymentFragmentbindingInflater1(Context context) {
        return MPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
    }

    protected static RemoteService TuitionPaymentFragmentbindingInflater1() {
        return new sendCameraCaptureResultToChild();
    }

    public static class b extends TuitionPaymentFragmentbindingInflater1 {
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final JSONObject TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public b(String str, JSONObject jSONObject, String str2) {
            this(str, jSONObject, str2, false, new JSONObject());
        }

        public b(String str, JSONObject jSONObject, String str2, boolean z, JSONObject jSONObject2) {
            super(str2, jSONObject);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jSONObject2;
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends TuitionPaymentFragmentbindingInflater1 {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(JSONObject jSONObject, String str) {
            super(str, jSONObject);
        }

        public final String toString() {
            return this.TuitionPaymentFragmentbindingInflater1.toString();
        }
    }

    public static class asBinder extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final String TuitionPaymentFragmentbindingInflater1;

        public asBinder(String str, String str2) {
            super(str2);
            this.TuitionPaymentFragmentbindingInflater1 = str;
        }

        public final String toString() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }
    }

    static class TuitionPaymentFragmentbindingInflater1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final JSONObject TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(String str, JSONObject jSONObject) {
            super(str);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.get(next);
                    } catch (AssertionError unused) {
                        jSONObject.remove(next);
                    } catch (JSONException unused2) {
                    }
                }
            }
            this.TuitionPaymentFragmentbindingInflater1 = jSONObject;
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public final String b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            this.b = str;
        }
    }

    public class d {
        Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        getChildSurface b;
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f903a = 0;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private long g = -1;

        public d() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1(handlerThread.getLooper());
        }

        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Message message) {
            synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                Handler handler = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (handler == null) {
                    StringBuilder sb = new StringBuilder("Dead mixpanel worker dropping a message: ");
                    sb.append(message.what);
                    forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                } else {
                    handler.sendMessage(message);
                }
            }
        }

        class TuitionPaymentFragmentbindingInflater1 extends Handler {
            private int TuitionPaymentFragmentbindingInflater1;
            private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private MPDbAdapter b;

            public TuitionPaymentFragmentbindingInflater1(Looper looper) {
                super(looper);
                this.b = null;
                d.this.b = getChildSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                String str;
                String str2;
                String str3;
                Boolean boolValueOf;
                Object obj;
                if (this.b == null) {
                    forceSetProvider forcesetprovider = forceSetProvider.this;
                    MPDbAdapter mPDbAdapterTuitionPaymentFragmentbindingInflater1 = forceSetProvider.TuitionPaymentFragmentbindingInflater1(forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    this.b = mPDbAdapterTuitionPaymentFragmentbindingInflater1;
                    mPDbAdapterTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(System.currentTimeMillis() - forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, MPDbAdapter.Table.EVENTS);
                    this.b.TuitionPaymentFragmentbindingInflater1(System.currentTimeMillis() - forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, MPDbAdapter.Table.PEOPLE);
                }
                try {
                    boolean z = false;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    z = false;
                    z = false;
                    if (message.what == 0) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) message.obj;
                        MPDbAdapter.Table table = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.has("$distinct_id") ^ true ? MPDbAdapter.Table.ANONYMOUS_PEOPLE : MPDbAdapter.Table.PEOPLE;
                        forceSetProvider forcesetprovider2 = forceSetProvider.this;
                        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Queuing people record for sending later");
                        forceSetProvider forcesetprovider3 = forceSetProvider.this;
                        StringBuilder sb = new StringBuilder("    ");
                        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
                        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                        str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                        int iB = this.b.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, str2, table);
                        if (!(!tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.has("$distinct_id"))) {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = iB;
                        }
                    } else if (message.what == 3) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) message.obj;
                        forceSetProvider forcesetprovider4 = forceSetProvider.this;
                        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Queuing group record for sending later");
                        forceSetProvider forcesetprovider5 = forceSetProvider.this;
                        StringBuilder sb2 = new StringBuilder("    ");
                        sb2.append(tuitionPaymentFragmentspecialinlinedviewModeldefault2.toString());
                        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
                        str2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.b(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, str2, MPDbAdapter.Table.GROUPS);
                    } else if (message.what == 1) {
                        b bVar = (b) message.obj;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = bVar.TuitionPaymentFragmentbindingInflater1;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("mp_lib", "android");
                            jSONObject3.put("$lib_version", "7.3.1");
                            jSONObject3.put("$os", "Android");
                            Object obj2 = "UNKNOWN";
                            jSONObject3.put("$os_version", Build.VERSION.RELEASE == null ? "UNKNOWN" : Build.VERSION.RELEASE);
                            jSONObject3.put("$manufacturer", Build.MANUFACTURER == null ? "UNKNOWN" : Build.MANUFACTURER);
                            jSONObject3.put("$brand", Build.BRAND == null ? "UNKNOWN" : Build.BRAND);
                            if (Build.MODEL != null) {
                                obj2 = Build.MODEL;
                            }
                            jSONObject3.put("$model", obj2);
                            DisplayMetrics displayMetrics = d.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            jSONObject3.put("$screen_dpi", displayMetrics.densityDpi);
                            jSONObject3.put("$screen_height", displayMetrics.heightPixels);
                            jSONObject3.put("$screen_width", displayMetrics.widthPixels);
                            Object obj3 = d.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (obj3 != null) {
                                jSONObject3.put("$app_version", obj3);
                                jSONObject3.put("$app_version_string", obj3);
                            }
                            Integer num = d.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (num != null) {
                                Object objValueOf = String.valueOf(num);
                                jSONObject3.put("$app_release", objValueOf);
                                jSONObject3.put("$app_build_number", objValueOf);
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(d.this.b.b.booleanValue());
                            if (boolValueOf2 != null) {
                                jSONObject3.put("$has_nfc", boolValueOf2.booleanValue());
                            }
                            Boolean boolValueOf3 = Boolean.valueOf(d.this.b.asInterface.booleanValue());
                            if (boolValueOf3 != null) {
                                jSONObject3.put("$has_telephone", boolValueOf3.booleanValue());
                            }
                            TelephonyManager telephonyManager = (TelephonyManager) d.this.b.TuitionPaymentFragmentbindingInflater1.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
                            if (networkOperatorName != null && !networkOperatorName.trim().isEmpty()) {
                                jSONObject3.put("$carrier", networkOperatorName);
                            }
                            getChildSurface getchildsurface = d.this.b;
                            if (getchildsurface.TuitionPaymentFragmentbindingInflater1.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) getchildsurface.TuitionPaymentFragmentbindingInflater1.getSystemService("connectivity")).getActiveNetworkInfo();
                                if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected()) {
                                    z = true;
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } else {
                                boolValueOf = null;
                            }
                            if (boolValueOf != null) {
                                jSONObject3.put("$wifi", boolValueOf.booleanValue());
                            }
                            Object objTuitionPaymentFragmentbindingInflater1 = d.this.b.TuitionPaymentFragmentbindingInflater1();
                            if (objTuitionPaymentFragmentbindingInflater1 != null) {
                                jSONObject3.put("$bluetooth_enabled", objTuitionPaymentFragmentbindingInflater1);
                            }
                            getChildSurface getchildsurface2 = d.this.b;
                            if (getchildsurface2.TuitionPaymentFragmentbindingInflater1.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                                obj = "ble";
                            } else if (getchildsurface2.TuitionPaymentFragmentbindingInflater1.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                                obj = "classic";
                            } else {
                                obj = "none";
                            }
                            jSONObject3.put("$bluetooth_version", obj);
                            jSONObject3.put("token", bVar.b);
                            if (jSONObject2 != null) {
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    jSONObject3.put(next, jSONObject2.get(next));
                                }
                            }
                            jSONObject.put(NotificationCompat.CATEGORY_EVENT, bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            jSONObject.put("properties", jSONObject3);
                            jSONObject.put("$mp_metadata", bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            forceSetProvider forcesetprovider6 = forceSetProvider.this;
                            forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Queuing event for sending later");
                            forceSetProvider forcesetprovider7 = forceSetProvider.this;
                            StringBuilder sb3 = new StringBuilder("    ");
                            sb3.append(jSONObject.toString());
                            forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb3.toString());
                            str3 = bVar.b;
                            try {
                                str2 = str3;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.b(jSONObject, str3, MPDbAdapter.Table.EVENTS);
                            } catch (JSONException unused) {
                                String str4 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                str = str3;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3;
                                str2 = str;
                            }
                        } catch (JSONException unused2) {
                            str3 = null;
                        }
                    } else if (message.what == 4) {
                        asBinder asbinder = (asBinder) message.obj;
                        String str5 = asbinder.TuitionPaymentFragmentbindingInflater1;
                        str2 = asbinder.b;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2, str5);
                    } else {
                        if (message.what != 7) {
                            if (message.what == 8) {
                                asInterface asinterface = (asInterface) message.obj;
                                this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(asinterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3, asinterface.b);
                            } else if (message.what == 2) {
                                forceSetProvider forcesetprovider8 = forceSetProvider.this;
                                forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Flushing queue due to scheduled or forced flush");
                                d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(d.this);
                                str = (String) message.obj;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, str);
                            } else if (message.what != 6) {
                                if (message.what == 5) {
                                    Thread.currentThread().getId();
                                    synchronized (d.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                        MPDbAdapter.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        tuitionPaymentFragmentbindingInflater1.close();
                                        tuitionPaymentFragmentbindingInflater1.b.delete();
                                        d.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                                        Looper.myLooper().quit();
                                    }
                                } else if (message.what == 9) {
                                    getUseCaseEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2((File) message.obj);
                                } else {
                                    Objects.toString(message);
                                }
                            } else {
                                str = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) message.obj).b;
                                this.b.b(MPDbAdapter.Table.EVENTS, str);
                                this.b.b(MPDbAdapter.Table.PEOPLE, str);
                                this.b.b(MPDbAdapter.Table.GROUPS, str);
                                this.b.b(MPDbAdapter.Table.ANONYMOUS_PEOPLE, str);
                            }
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3;
                            str2 = null;
                        } else {
                            str = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3) message.obj).b;
                            this.b.b(MPDbAdapter.Table.ANONYMOUS_PEOPLE, str);
                        }
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3;
                        str2 = str;
                    }
                    if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 >= forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == -2) && this.TuitionPaymentFragmentbindingInflater1 <= 0 && str2 != null) {
                        forceSetProvider forcesetprovider9 = forceSetProvider.this;
                        StringBuilder sb4 = new StringBuilder("Flushing queue due to bulk upload limit (");
                        sb4.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sb4.append(") for project ");
                        sb4.append(str2);
                        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb4.toString());
                        d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(d.this);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, str2);
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0 || hasMessages(2, str2)) {
                        return;
                    }
                    forceSetProvider forcesetprovider10 = forceSetProvider.this;
                    StringBuilder sb5 = new StringBuilder("Queue depth ");
                    sb5.append(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sb5.append(" - Adding flush in ");
                    sb5.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb5.toString());
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 0) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 2;
                        messageObtain.obj = str2;
                        messageObtain.arg1 = 1;
                        sendMessageDelayed(messageObtain, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                } catch (RuntimeException unused3) {
                    synchronized (d.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        d.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                        try {
                            Looper.myLooper().quit();
                        } catch (Exception unused4) {
                        }
                    }
                }
            }

            private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MPDbAdapter mPDbAdapter, String str) throws Throwable {
                forceSetProvider forcesetprovider = forceSetProvider.this;
                if (!forceSetProvider.TuitionPaymentFragmentbindingInflater1().b(forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
                    forceSetProvider forcesetprovider2 = forceSetProvider.this;
                    forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Not flushing data to Mixpanel because the device is not connected to the internet.");
                } else {
                    b(mPDbAdapter, str, MPDbAdapter.Table.EVENTS, forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface);
                    b(mPDbAdapter, str, MPDbAdapter.Table.PEOPLE, forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll);
                    b(mPDbAdapter, str, MPDbAdapter.Table.GROUPS, forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f350a);
                }
            }

            /* JADX WARN: Code duplicated, block: B:48:0x013c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:49:0x0134 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:51:0x0028 A[SYNTHETIC] */
            private void b(MPDbAdapter mPDbAdapter, String str, MPDbAdapter.Table table, String str2) throws Throwable {
                boolean z;
                forceSetProvider forcesetprovider = forceSetProvider.this;
                RemoteService remoteServiceTuitionPaymentFragmentbindingInflater1 = forceSetProvider.TuitionPaymentFragmentbindingInflater1();
                String[] strArrTuitionPaymentFragmentbindingInflater1 = mPDbAdapter.TuitionPaymentFragmentbindingInflater1(table, str);
                Integer numValueOf = 0;
                if (strArrTuitionPaymentFragmentbindingInflater1 != null) {
                    numValueOf = Integer.valueOf(strArrTuitionPaymentFragmentbindingInflater1[2]);
                }
                while (strArrTuitionPaymentFragmentbindingInflater1 != null && numValueOf.intValue() > 0) {
                    String str3 = strArrTuitionPaymentFragmentbindingInflater1[0];
                    String str4 = strArrTuitionPaymentFragmentbindingInflater1[1];
                    String strB = getChildRotationDegrees.b(str4);
                    HashMap map = new HashMap();
                    map.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, strB);
                    if (calculateOutConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        map.put("verbose", "1");
                    }
                    try {
                        try {
                            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = remoteServiceTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, map, forceSetProvider.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                            if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                try {
                                    forceSetProvider forcesetprovider2 = forceSetProvider.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Response was null, unexpected failure posting to ");
                                    sb.append(str2);
                                    sb.append(".");
                                    forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                                } catch (OutOfMemoryError | MalformedURLException unused) {
                                    z = false;
                                    if (!z) {
                                    }
                                    forceSetProvider forcesetprovider3 = forceSetProvider.this;
                                    forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Not retrying this batch of events, deleting them from DB.");
                                    mPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, table, str);
                                    strArrTuitionPaymentFragmentbindingInflater1 = mPDbAdapter.TuitionPaymentFragmentbindingInflater1(table, str);
                                    if (strArrTuitionPaymentFragmentbindingInflater1 != null) {
                                        numValueOf = Integer.valueOf(strArrTuitionPaymentFragmentbindingInflater1[2]);
                                    }
                                }
                                removeMessages(2, str);
                                long jMax = Math.max(((long) Math.pow(2.0d, this.TuitionPaymentFragmentbindingInflater1)) * 60000, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jMax;
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.min(jMax, 600000L);
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 2;
                                messageObtain.obj = str;
                                sendMessageDelayed(messageObtain, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                this.TuitionPaymentFragmentbindingInflater1++;
                                forceSetProvider forcesetprovider4 = forceSetProvider.this;
                                StringBuilder sb2 = new StringBuilder("Retrying this batch of events in ");
                                sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                sb2.append(" ms");
                                forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
                                return;
                            }
                            try {
                                String str5 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, Hex.DEFAULT_CHARSET_NAME);
                                if (this.TuitionPaymentFragmentbindingInflater1 > 0) {
                                    this.TuitionPaymentFragmentbindingInflater1 = 0;
                                    removeMessages(2, str);
                                }
                                forceSetProvider forcesetprovider5 = forceSetProvider.this;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Successfully posted to ");
                                sb3.append(str2);
                                sb3.append(": \n");
                                sb3.append(str4);
                                forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb3.toString());
                                forceSetProvider forcesetprovider6 = forceSetProvider.this;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Response was ");
                                sb4.append(str5);
                                forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb4.toString());
                                forceSetProvider forcesetprovider7 = forceSetProvider.this;
                                forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Not retrying this batch of events, deleting them from DB.");
                                mPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, table, str);
                                strArrTuitionPaymentFragmentbindingInflater1 = mPDbAdapter.TuitionPaymentFragmentbindingInflater1(table, str);
                                if (strArrTuitionPaymentFragmentbindingInflater1 != null) {
                                    numValueOf = Integer.valueOf(strArrTuitionPaymentFragmentbindingInflater1[2]);
                                }
                            } catch (UnsupportedEncodingException e2) {
                                throw new RuntimeException("UTF not supported on this platform?", e2);
                            }
                        } catch (OutOfMemoryError | MalformedURLException unused2) {
                            z = true;
                        }
                        if (!z) {
                            removeMessages(2, str);
                            long jMax2 = Math.max(((long) Math.pow(2.0d, this.TuitionPaymentFragmentbindingInflater1)) * 60000, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jMax2;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Math.min(jMax2, 600000L);
                            Message messageObtain2 = Message.obtain();
                            messageObtain2.what = 2;
                            messageObtain2.obj = str;
                            sendMessageDelayed(messageObtain2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            this.TuitionPaymentFragmentbindingInflater1++;
                            forceSetProvider forcesetprovider8 = forceSetProvider.this;
                            StringBuilder sb5 = new StringBuilder("Retrying this batch of events in ");
                            sb5.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            sb5.append(" ms");
                            forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb5.toString());
                            return;
                        }
                        forceSetProvider forcesetprovider9 = forceSetProvider.this;
                        forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Not retrying this batch of events, deleting them from DB.");
                        mPDbAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str3, table, str);
                        strArrTuitionPaymentFragmentbindingInflater1 = mPDbAdapter.TuitionPaymentFragmentbindingInflater1(table, str);
                        if (strArrTuitionPaymentFragmentbindingInflater1 != null) {
                            numValueOf = Integer.valueOf(strArrTuitionPaymentFragmentbindingInflater1[2]);
                        }
                    } catch (RemoteService.ServiceUnavailableException e3) {
                        forceSetProvider forcesetprovider10 = forceSetProvider.this;
                        StringBuilder sb6 = new StringBuilder("Cannot post message to ");
                        sb6.append(str2);
                        sb6.append(".");
                        forceSetProvider.TuitionPaymentFragmentbindingInflater1(sb6.toString(), e3);
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = e3.mRetryAfter * 1000;
                    } catch (SocketTimeoutException e4) {
                        forceSetProvider forcesetprovider11 = forceSetProvider.this;
                        StringBuilder sb7 = new StringBuilder("Cannot post message to ");
                        sb7.append(str2);
                        sb7.append(".");
                        forceSetProvider.TuitionPaymentFragmentbindingInflater1(sb7.toString(), e4);
                    } catch (IOException e5) {
                        forceSetProvider forcesetprovider12 = forceSetProvider.this;
                        StringBuilder sb8 = new StringBuilder("Cannot post message to ");
                        sb8.append(str2);
                        sb8.append(".");
                        forceSetProvider.TuitionPaymentFragmentbindingInflater1(sb8.toString(), e5);
                    }
                }
            }
        }

        static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(d dVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = dVar.f903a;
            long j2 = 1 + j;
            long j3 = dVar.g;
            if (j3 > 0) {
                long j4 = ((jCurrentTimeMillis - j3) + (dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * j)) / j2;
                dVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j4;
                forceSetProvider forcesetprovider = forceSetProvider.this;
                StringBuilder sb = new StringBuilder("Average send frequency approximately ");
                sb.append(j4 / 1000);
                sb.append(" seconds.");
                forceSetProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
            }
            dVar.g = jCurrentTimeMillis;
            dVar.f903a = j2;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentbindingInflater1 {
        public final String toString() {
            return this.TuitionPaymentFragmentbindingInflater1.toString();
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Thread.currentThread().getId();
    }

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(String str, Throwable th) {
        Thread.currentThread().getId();
    }
}
