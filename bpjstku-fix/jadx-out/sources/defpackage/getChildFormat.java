package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class getChildFormat {
    private static Integer INotificationSideChannel = null;
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object();
    private static Boolean cancelAll = null;
    private static boolean onTransact = true;
    private String RemoteActionCompatParcelizer;
    public boolean TuitionPaymentFragmentbindingInflater1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f921a;
    public final Future<SharedPreferences> asInterface;
    public String b;
    private final Future<SharedPreferences> cancel;
    public final Future<SharedPreferences> g;
    public final Future<SharedPreferences> notify;
    public final Object asBinder = new Object();
    private JSONObject INotificationSideChannelStubProxy = null;
    private Map<String, String> INotificationSideChannelDefault = null;
    public boolean d = false;
    private final SharedPreferences.OnSharedPreferenceChangeListener INotificationSideChannelStub = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: getChildFormat.5
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            synchronized (getChildFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getChildFormat.this.INotificationSideChannelStubProxy();
                getChildFormat.TuitionPaymentFragmentbindingInflater1();
            }
        }
    };

    static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1() {
        onTransact = false;
        return false;
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("people_distinct_id", null);
    }

    public getChildFormat(Future<SharedPreferences> future, Future<SharedPreferences> future2, Future<SharedPreferences> future3, Future<SharedPreferences> future4) {
        this.asInterface = future;
        this.cancel = future2;
        this.notify = future3;
        this.g = future4;
    }

    public final void b(JSONObject jSONObject) {
        synchronized (this.asBinder) {
            JSONObject jSONObjectB = b();
            Iterator<String> itKeys = jSONObjectB.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject.put(next, jSONObjectB.get(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final Map<String, String> cancelAll() {
        synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (onTransact || this.INotificationSideChannelDefault == null) {
                INotificationSideChannelStubProxy();
                onTransact = false;
            }
        }
        return this.INotificationSideChannelDefault;
    }

    public final String a() {
        String str;
        synchronized (this) {
            if (!this.d) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            str = this.b;
        }
        return str;
    }

    public final boolean INotificationSideChannel() {
        boolean z;
        synchronized (this) {
            if (!this.d) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            z = this.TuitionPaymentFragmentbindingInflater1;
        }
        return z;
    }

    public final String g() {
        String str;
        synchronized (this) {
            if (!this.d) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return str;
    }

    public final String d() {
        synchronized (this) {
            if (!this.d) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return null;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }

    public final String cancel() {
        String str;
        synchronized (this) {
            if (!this.d) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
            str = this.RemoteActionCompatParcelizer;
        }
        return str;
    }

    public final void asBinder() {
        synchronized (this) {
            try {
                SharedPreferences.Editor editorEdit = this.cancel.get().edit();
                editorEdit.clear();
                editorEdit.apply();
                INotificationSideChannelDefault();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2.getCause());
            } catch (ExecutionException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public final Map<String, Long> onTransact() {
        HashMap map = new HashMap();
        try {
            for (Map.Entry<String, ?> entry : this.notify.get().getAll().entrySet()) {
                map.put(entry.getKey(), Long.valueOf(entry.getValue().toString()));
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        } catch (ExecutionException e3) {
            e3.printStackTrace();
        }
        return map;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        try {
            SharedPreferences.Editor editorEdit = this.notify.get().edit();
            editorEdit.remove(str);
            editorEdit.apply();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        } catch (ExecutionException e3) {
            e3.printStackTrace();
        }
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (this) {
            z = false;
            try {
                z = this.g.get().getBoolean(str, false);
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                e2.getCause();
            }
        }
        return z;
    }

    public final void d(String str) {
        synchronized (this) {
            try {
                SharedPreferences.Editor editorEdit = this.g.get().edit();
                editorEdit.putBoolean(str, true);
                editorEdit.apply();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                e2.getCause();
            }
        }
    }

    public final boolean TuitionPaymentFragmentbindingInflater1(String str) {
        synchronized (this) {
            if (str == null) {
                return false;
            }
            try {
                Integer numValueOf = Integer.valueOf(str);
                try {
                    if (INotificationSideChannel == null) {
                        Integer numValueOf2 = Integer.valueOf(this.g.get().getInt("latest_version_code", -1));
                        INotificationSideChannel = numValueOf2;
                        if (numValueOf2.intValue() == -1) {
                            INotificationSideChannel = numValueOf;
                            SharedPreferences.Editor editorEdit = this.g.get().edit();
                            editorEdit.putInt("latest_version_code", numValueOf.intValue());
                            editorEdit.apply();
                        }
                    }
                    if (INotificationSideChannel.intValue() < numValueOf.intValue()) {
                        SharedPreferences.Editor editorEdit2 = this.g.get().edit();
                        editorEdit2.putInt("latest_version_code", numValueOf.intValue());
                        editorEdit2.apply();
                        return true;
                    }
                } catch (InterruptedException unused) {
                } catch (ExecutionException e2) {
                    e2.getCause();
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z, String str) {
        boolean zBooleanValue;
        synchronized (this) {
            if (cancelAll == null) {
                try {
                    try {
                        SharedPreferences sharedPreferences = this.g.get();
                        StringBuilder sb = new StringBuilder("has_launched_");
                        sb.append(str);
                        if (sharedPreferences.getBoolean(sb.toString(), false)) {
                            cancelAll = Boolean.FALSE;
                        } else {
                            Boolean boolValueOf = Boolean.valueOf(!z);
                            cancelAll = boolValueOf;
                            if (!boolValueOf.booleanValue()) {
                                asInterface(str);
                            }
                        }
                    } catch (ExecutionException unused) {
                        cancelAll = Boolean.FALSE;
                    }
                } catch (InterruptedException unused2) {
                    cancelAll = Boolean.FALSE;
                }
            }
            zBooleanValue = cancelAll.booleanValue();
        }
        return zBooleanValue;
    }

    public final void asInterface(String str) {
        synchronized (this) {
            try {
                SharedPreferences.Editor editorEdit = this.g.get().edit();
                StringBuilder sb = new StringBuilder("has_launched_");
                sb.append(str);
                editorEdit.putBoolean(sb.toString(), true);
                editorEdit.apply();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                e2.getCause();
            }
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        SharedPreferences sharedPreferences;
        boolean zBooleanValue;
        synchronized (this) {
            if (this.f921a == null) {
                try {
                    sharedPreferences = this.g.get();
                } catch (InterruptedException unused) {
                    sharedPreferences = null;
                } catch (ExecutionException e2) {
                    e2.getCause();
                    sharedPreferences = null;
                }
                if (sharedPreferences != null) {
                    this.f921a = Boolean.valueOf(sharedPreferences.getBoolean("opt_out_".concat(String.valueOf(str)), false));
                }
            }
            zBooleanValue = this.f921a.booleanValue();
        }
        return zBooleanValue;
    }

    public JSONObject b() {
        if (this.INotificationSideChannelStubProxy == null) {
            INotificationSideChannelDefault();
        }
        return this.INotificationSideChannelStubProxy;
    }

    private void INotificationSideChannelDefault() {
        JSONObject jSONObject;
        try {
            try {
                try {
                    this.INotificationSideChannelStubProxy = new JSONObject(this.cancel.get().getString("super_properties", "{}"));
                } catch (ExecutionException e2) {
                    e2.getCause();
                    if (this.INotificationSideChannelStubProxy == null) {
                        jSONObject = new JSONObject();
                        this.INotificationSideChannelStubProxy = jSONObject;
                    }
                }
            } catch (InterruptedException unused) {
                if (this.INotificationSideChannelStubProxy == null) {
                    jSONObject = new JSONObject();
                    this.INotificationSideChannelStubProxy = jSONObject;
                }
            } catch (JSONException unused2) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (this.INotificationSideChannelStubProxy == null) {
                    jSONObject = new JSONObject();
                    this.INotificationSideChannelStubProxy = jSONObject;
                }
            }
        } catch (Throwable th) {
            if (this.INotificationSideChannelStubProxy == null) {
                this.INotificationSideChannelStubProxy = new JSONObject();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void INotificationSideChannelStubProxy() {
        this.INotificationSideChannelDefault = new HashMap();
        try {
            SharedPreferences sharedPreferences = this.asInterface.get();
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this.INotificationSideChannelStub);
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.INotificationSideChannelStub);
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                this.INotificationSideChannelDefault.put(entry.getKey(), entry.getValue().toString());
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException e2) {
            e2.getCause();
        }
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        JSONObject jSONObject = this.INotificationSideChannelStubProxy;
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.toString();
        try {
            SharedPreferences.Editor editorEdit = this.cancel.get().edit();
            editorEdit.putString("super_properties", string);
            editorEdit.apply();
        } catch (InterruptedException unused) {
        } catch (ExecutionException e2) {
            e2.getCause();
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this.cancel.get();
        } catch (InterruptedException unused) {
            sharedPreferences = null;
        } catch (ExecutionException e2) {
            e2.getCause();
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedPreferences.getString("events_distinct_id", null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sharedPreferences.getBoolean("events_user_id_present", false);
        this.RemoteActionCompatParcelizer = sharedPreferences.getString("people_distinct_id", null);
        this.b = sharedPreferences.getString("anonymous_id", null);
        this.TuitionPaymentFragmentbindingInflater1 = sharedPreferences.getBoolean("had_persisted_distinct_id", false);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            this.b = UUID.randomUUID().toString();
            StringBuilder sb = new StringBuilder("$device:");
            sb.append(this.b);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            asInterface();
        }
        this.d = true;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        try {
            SharedPreferences sharedPreferences = this.g.get();
            StringBuilder sb = new StringBuilder("opt_out_");
            sb.append(str);
            return sharedPreferences.contains(sb.toString());
        } catch (InterruptedException unused) {
            return false;
        } catch (ExecutionException e2) {
            e2.getCause();
            return false;
        }
    }

    public final void asInterface() {
        try {
            SharedPreferences.Editor editorEdit = this.cancel.get().edit();
            editorEdit.putString("events_distinct_id", this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            editorEdit.putBoolean("events_user_id_present", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            editorEdit.putString("people_distinct_id", this.RemoteActionCompatParcelizer);
            editorEdit.putString("anonymous_id", this.b);
            editorEdit.putBoolean("had_persisted_distinct_id", this.TuitionPaymentFragmentbindingInflater1);
            editorEdit.apply();
        } catch (InterruptedException unused) {
        } catch (ExecutionException e2) {
            e2.getCause();
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SharedPreferences.Editor editor) {
        editor.apply();
    }
}
