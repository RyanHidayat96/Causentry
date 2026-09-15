package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.SimpleArrayMap;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.PointerIconCompat;
import com.bpjstku.data.scholarship.model.request.ScholarshipPhotoPersonForInsert;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.deInitSession;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzy
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern zzd = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final Context zzf;
    private final zzw zzg;
    private final ScheduledExecutorService zzh;
    private Messenger zzj;
    private zzd zzk;
    private final SimpleArrayMap zze = new SimpleArrayMap();
    private final Messenger zzi = new Messenger(new zzae(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.zzf = context;
        this.zzg = new zzw(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzh = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task zza(Bundle bundle) throws Exception {
        return zzi(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    static /* synthetic */ void zzc(Rpc rpc, Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new zzc());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof zzd) {
                rpc.zzk = (zzd) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                rpc.zzj = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        if (!Objects.equals(intent2.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
            Log.isLoggable("Rpc", 3);
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = zzd.matcher(stringExtra);
            if (!matcher.matches()) {
                Log.isLoggable("Rpc", 3);
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", strGroup2);
                rpc.zzh(strGroup, extras);
                return;
            }
            return;
        }
        String stringExtra2 = intent2.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (stringExtra2 == null) {
            intent2.getExtras();
            return;
        }
        if (!stringExtra2.startsWith("|")) {
            synchronized (rpc.zze) {
                for (int i = 0; i < rpc.zze.getSize(); i++) {
                    rpc.zzh((String) rpc.zze.keyAt(i), intent2.getExtras());
                }
            }
            return;
        }
        String[] strArrSplit = stringExtra2.split("\\|");
        if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
            return;
        }
        String str = strArrSplit[2];
        String strSubstring = strArrSplit[3];
        if (strSubstring.startsWith(":")) {
            strSubstring = strSubstring.substring(1);
        }
        rpc.zzh(str, intent2.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, strSubstring).getExtras());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    private final Task zze(Bundle bundle) {
        final String strZzf = zzf();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zze) {
            this.zze.put(strZzf, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzg.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zzg(this.zzf, intent);
        StringBuilder sb = new StringBuilder("|ID|");
        sb.append(strZzf);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            intent.getExtras();
        }
        intent.putExtra("google.messenger", this.zzi);
        if (this.zzj != null || this.zzk != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.zzj;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.zzk.zzb(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.zzg.zzb() == 2) {
                    this.zzf.sendBroadcast(intent);
                } else {
                    this.zzf.startService(intent);
                }
            }
        } else if (this.zzg.zzb() == 2) {
            this.zzf.sendBroadcast(intent);
        } else {
            this.zzf.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.zzh.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            private static final byte[] $$a = {109, 7, 114, -90};
            private static final int $$b = 18;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60045, 60047, 60052, 60056, 60062, 60090, 60123, 60072, 60060, 60034, 60061, 60085, 60057, 60078, 60063, 59744, 60035, 59747, 59749, 60107, 60119, 60041, 60102, 60095, 60058, 60059, 60050, 60084, 60049, 60054, 60043, 60093, 60098, 60067, 60046, 60089, 60051, 60075, 60055, 60117, 59745, 60040, 59746, 60110, 60088, 60086, 60053, 60048, 60044};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57190;
            private static int[] b = {-89616915, -1956372716, 376091747, 1770464394, 768503534, 638279706, 921036676, 727673777, -1096945539, 380058015, 751051167, 1043607080, -371390030, -1645320981, 57401694, -114979161, 978433172, -1521812142};

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = b;
                char c = '0';
                int i3 = -1870535734;
                int i4 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = $10 + 75;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i5] = Integer.valueOf(iArr2[i8]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i5;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", c) + 3292, ExpandableListView.getPackedPositionType(0L) + 31, 1948206109, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i8++;
                            c = '0';
                            i3 = -1870535734;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i9 = $11 + 91;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = b;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i11 = 0;
                    while (i11 < length3) {
                        try {
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = Integer.valueOf(iArr5[i11]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), 3290 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 1948206109, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i11++;
                            iArr5 = iArr5;
                            i4 = 1;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iArr5 = iArr6;
                }
                char c2 = 0;
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i12 = 17;
                    for (int i13 = 1; i12 > i13; i13 = 1) {
                        int i14 = $11 + 45;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                            try {
                                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2558, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, 683220507, false, $$c((byte) 56, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                                i12 += 47;
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), 2559 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - TextUtils.indexOf("", "", 0, 0), 683220507, false, $$c((byte) 56, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i12--;
                        }
                    }
                    int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.red(0) + 28879), Color.red(0) + 348, View.combineMeasuredStates(0, 0) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    c2 = 0;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            private static void a(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = 47;
                int i5 = 1770390596;
                Object obj2 = null;
                if (cArr2 != null) {
                    int i6 = $11 + 69;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) i4;
                                byte b4 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), ((Process.getThreadPriority(0) + 20) >> 6) + 2267, ((Process.getThreadPriority(0) + 20) >> 6) + 33, -1927765101, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i8++;
                            i4 = 47;
                            i5 = 1770390596;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b5 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267, 33 - (Process.myPid() >> 22), -1927765101, false, $$c((byte) 47, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            int i9 = $11 + 83;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.red(0) + 3261, 30 - KeyEvent.getDeadChar(0, 0), -127612708, false, $$c((byte) 48, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b7 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getLongPressTimeout() >> 16)), 595 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 17 - TextUtils.getOffsetBefore("", 0), 1570859318, false, $$c((byte) ($$b | 32), b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    int i12 = $10 + 51;
                                    $11 = i12 % 128;
                                    int i13 = i12 % 2;
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } else {
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i18 = 0; i18 < i; i18++) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.zza.zzd(strZzf, scheduledFutureSchedule, task);
                    int i3 = 8 / 0;
                } else {
                    this.zza.zzd(strZzf, scheduledFutureSchedule, task);
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
            }

            public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2) {
                int i3;
                int i4;
                int[] iArr;
                int i5;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i6;
                int i7;
                int i8;
                byte bIndexOf;
                int tapTimeout;
                int i9;
                int i10;
                char[] cArr;
                byte trimmedLength;
                String str = "";
                int i11 = 2;
                int i12 = 2 % 2;
                if (context != null) {
                    try {
                        char[] cArr2 = {'.', '\t', 26, 1, '*', 18, 23, 0, 21, 19, 2, 27, 5, 11, 29, '\r', 27, Typography.quote, 26, 1, '*', 18, 23, 0, 21, 19, 16, '0', 27, '\b', 13796};
                        int i13 = 26 - (~(-(KeyEvent.getMaxKeyCode() >> 16)));
                        int i14 = TuitionPaymentFragmentbindingInflater1;
                        int i15 = ((i14 | 25) << 1) - (i14 ^ 25);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                        int i16 = i15 % 2;
                        Object[] objArr = new Object[1];
                        a(cArr2, (byte) i13, 30 - (~(-(-KeyEvent.keyCodeFromString("")))), objArr);
                        try {
                            Object[] objArr2 = {(String) objArr[0]};
                            char[] cArr3 = {31, 21, 3, 21, 18, '%', '\'', 6, 6, 31, 22, 27, 2, '\b', Typography.amp, 25, 29, 6, '%', '(', 15, ',', 13854, 13854, '(', ' ', '/', 15, 16, '(', 22, 27, '-', 4, 23, '!', 31, '-'};
                            int i17 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            int i18 = ~i17;
                            int i19 = ~i;
                            int i20 = (~(((-116) ^ i19) | ((-116) & i19))) | i18;
                            int i21 = ~((i ^ 115) | (i & 115));
                            int i22 = (((i17 * (-563)) + 64975) - (~(((i20 ^ i21) | (i21 & i20)) * (-564)))) - 1;
                            int i23 = i18 | 115;
                            int i24 = i22 + ((~((i23 & i) | (i23 ^ i))) * 1128);
                            int i25 = ~((i18 ^ i19) | (i18 & i19));
                            int i26 = ~((i17 ^ 115) | (i17 & 115));
                            byte b2 = (byte) (i24 + (((i25 & i26) | (i25 ^ i26)) * 564));
                            int i27 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int i28 = (i27 & 37) + (i27 | 37);
                            Object[] objArr3 = new Object[1];
                            a(cArr3, b2, i28, objArr3);
                            Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                            char[] cArr4 = {'+', 23, 7, '\b', 27, Typography.quote, 26, 1, '*', 18, 23, 0, 21, 19, 16, '0', '\b', 25, 4, '/', 21, 28, 5, 23, 20, 0, 25, 2, '\r', '!', 13933};
                            byte bLastIndexOf = (byte) (TextUtils.lastIndexOf("", '0') + 113);
                            int i29 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i30 = (i29 ^ 31) + ((i29 & 31) << 1);
                            Object[] objArr4 = new Object[1];
                            a(cArr4, bLastIndexOf, i30, objArr4);
                            try {
                                Object[] objArr5 = {(String) objArr4[0]};
                                char[] cArr5 = {31, 21, 3, 21, 18, '%', '\'', 6, 6, 31, 22, 27, 2, '\b', Typography.amp, 25, 29, 6, '%', '(', 15, ',', 13854, 13854, '(', ' ', '/', 15, 16, '(', 22, 27, '-', 4, 23, '!', 31, '-'};
                                byte b3 = (byte) (114 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))));
                                int i31 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i32 = (i31 * 866) - 32832;
                                int i33 = ~((~i31) | i19);
                                int i34 = -(-((((-39) ^ i33) | ((-39) & i33)) * (-865)));
                                int i35 = (i32 & i34) + (i34 | i32) + ((~((i31 ^ i) | (i31 & i))) * 865);
                                int i36 = ~(((-39) & i19) | ((-39) ^ i19));
                                int i37 = ~((i31 & i19) | (i19 ^ i31));
                                int i38 = ((i37 & i36) | (i36 ^ i37)) * 865;
                                int i39 = (i35 ^ i38) + ((i35 & i38) << 1);
                                Object[] objArr6 = new Object[1];
                                a(cArr5, b3, i39, objArr6);
                                Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                                int i40 = TuitionPaymentFragmentbindingInflater1;
                                int i41 = (i40 ^ 69) + ((i40 & 69) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i41 % 128;
                                try {
                                    if (i41 % 2 != 0) {
                                        iArr = new int[]{218539708, 2024746113, 1133627974, -965355914, -1304308019, -128931890, -1096396786, -116983544, 13260722, 960890957, -2116825244, 96115108, 1537438301, -979951145};
                                        i5 = -(ViewConfiguration.getMaximumFlingVelocity() >> 108);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i6 = 102;
                                    } else {
                                        iArr = new int[]{218539708, 2024746113, 1133627974, -965355914, -1304308019, -128931890, -1096396786, -116983544, 13260722, 960890957, -2116825244, 96115108, 1537438301, -979951145};
                                        i5 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i6 = 23;
                                    }
                                    int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i43 = ((i42 | 51) << 1) - (i42 ^ 51);
                                    int i44 = i43 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i44;
                                    int i45 = i43 % 2 == 0 ? (471 % i5) % (471 << i6) : (i5 * 471) + (i6 * 471);
                                    int i46 = (-470) * ((i5 ^ i6) | (i5 & i6));
                                    int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                                    int i48 = ~i5;
                                    int i49 = ~i6;
                                    int i50 = ~((i48 ^ i49) | (i48 & i49));
                                    int i51 = i44 + 67;
                                    Object obj = objNewInstance2;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                                    int i52 = i51 % 2;
                                    int i53 = (~((i6 ^ (-1)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) | i50;
                                    int i54 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i55 = i53 | (~((i54 & i5) | (i54 ^ i5) | i6));
                                    int i56 = ((i44 | 97) << 1) - (i44 ^ 97);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i56 % 128;
                                    if (i56 % 2 != 0) {
                                        int i57 = -((i55 & (-470)) + (i55 | (-470)));
                                        i7 = ((i47 | i57) << 1) - (i57 ^ i47);
                                        int i58 = ~i6;
                                        i8 = ~((i58 & i5) | (i58 ^ i5) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    } else {
                                        int i59 = i55 * (-470);
                                        int i60 = ((i59 & i47) << 1) + (i47 ^ i59);
                                        int i61 = (i49 ^ i5) | (i49 & i5);
                                        i7 = i60;
                                        i8 = ~((i61 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i61 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    }
                                    int i62 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-1);
                                    int i63 = (i62 & i5) | (i62 ^ i5);
                                    int i64 = ~((i63 & i6) | (i63 ^ i6));
                                    int i65 = i7 + (470 * ((i8 & i64) | (i8 ^ i64)));
                                    Object[] objArr7 = new Object[1];
                                    c(iArr, i65, objArr7);
                                    Class<?> cls = Class.forName((String) objArr7[0]);
                                    char[] cArr6 = {11, 1, 2, Typography.dollar, 31, '\n', '-', 26, 11, 1, 3, 31, '-', 25, 11, 1, 13903};
                                    int i66 = TuitionPaymentFragmentbindingInflater1;
                                    int i67 = ((i66 | 27) << 1) - (i66 ^ 27);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i67 % 128;
                                    if (i67 % 2 != 0) {
                                        bIndexOf = (byte) (63 >>> TextUtils.indexOf((CharSequence) "", '|'));
                                        tapTimeout = 31 << (ViewConfiguration.getTapTimeout() << 4);
                                    } else {
                                        int i68 = -TextUtils.indexOf((CharSequence) "", '0');
                                        bIndexOf = (byte) ((i68 ^ 102) + ((i68 & 102) << 1));
                                        int i69 = -(ViewConfiguration.getTapTimeout() >> 16);
                                        tapTimeout = (i69 | 17) + (i69 & 17);
                                    }
                                    Object[] objArr8 = new Object[1];
                                    a(cArr6, bIndexOf, tapTimeout, objArr8);
                                    Object objInvoke = cls.getMethod((String) objArr8[0], null).invoke(context, null);
                                    int i70 = TuitionPaymentFragmentbindingInflater1;
                                    int i71 = (i70 ^ 59) + ((i70 & 59) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i71 % 128;
                                    int i72 = i71 % 2;
                                    try {
                                        int i73 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                        int i74 = ((i73 | 23) << 1) - (i73 ^ 23);
                                        Object[] objArr9 = new Object[1];
                                        c(new int[]{218539708, 2024746113, 1133627974, -965355914, -1304308019, -128931890, -1096396786, -116983544, 13260722, 960890957, -2116825244, 96115108, 1537438301, -979951145}, i74, objArr9);
                                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                                        char[] cArr7 = {11, 1, 2, Typography.dollar, 31, '\n', '-', 26, 11, 1, '\n', 25, ' ', 1};
                                        int i75 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                        byte b4 = (byte) ((i75 ^ 92) + ((i75 & 92) << 1));
                                        int i76 = -Color.argb(0, 0, 0, 0);
                                        int i77 = i76 * (-344);
                                        int i78 = ((i77 | (-4816)) << 1) - (i77 ^ (-4816));
                                        int i79 = ~i76;
                                        int i80 = ~((i79 ^ (-15)) | (i79 & (-15)));
                                        int i81 = ~i76;
                                        int i82 = ~((i81 & i) | (i81 ^ i));
                                        int i83 = ((i80 & i82) | (i80 ^ i82)) * 345;
                                        int i84 = ((i78 | i83) << 1) - (i83 ^ i78);
                                        int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
                                        TuitionPaymentFragmentbindingInflater1 = i85 % 128;
                                        if (i85 % 2 == 0) {
                                            throw null;
                                        }
                                        int i86 = ~((i79 ^ i19) | (i79 & i19));
                                        int i87 = ~(((-15) ^ i76) | (i76 & (-15)));
                                        int i88 = (i84 - (~(345 * ((i86 ^ i87) | (i87 & i86))))) - 1;
                                        int i89 = (i79 ^ (-15)) | (i79 & (-15));
                                        Object[] objArr10 = new Object[1];
                                        a(cArr7, b4, (i88 - (~((~((i89 & i) | (i89 ^ i))) * 345))) - 1, objArr10);
                                        Object objInvoke2 = cls2.getMethod((String) objArr10[0], null).invoke(context, null);
                                        int i90 = TuitionPaymentFragmentbindingInflater1 + 7;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i90 % 128;
                                        int i91 = i90 % 2;
                                        try {
                                            Object[] objArr11 = {objInvoke2, 64};
                                            char[] cArr8 = {25, '-', 21, 28, 5, 23, 18, '#', 4, 3, '+', 4, 11, 4, 4, Typography.dollar, 31, 30, '(', Typography.amp, 31, '\n', '-', 26, 11, 1, 3, 31, '-', 25, 11, 1, 13869};
                                            int i92 = -Process.getGidForName("");
                                            int i93 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                            int i94 = i93 * 491;
                                            int i95 = ((i94 | (-16137)) << 1) - (i94 ^ (-16137));
                                            int i96 = ~i93;
                                            int i97 = (i96 & (-34)) | (i96 ^ (-34));
                                            int i98 = ~i;
                                            int i99 = (i95 - (~(-(-(((i97 & i98) | (i97 ^ i98)) * (-490)))))) - 1;
                                            int i100 = ~((-34) | i93);
                                            int i101 = ~(((-34) & i) | ((-34) ^ i));
                                            int i102 = -(-(((i100 & i101) | (i100 ^ i101)) * 490));
                                            int i103 = (((i99 ^ i102) + ((i102 & i99) << 1)) - (~(-(-((~i93) * 490))))) - 1;
                                            Object[] objArr12 = new Object[1];
                                            a(cArr8, (byte) (((i92 | 68) << 1) - (i92 ^ 68)), i103, objArr12);
                                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                                            int i104 = -KeyEvent.keyCodeFromString("");
                                            int i105 = (i104 ^ 14) + ((i104 & 14) << 1);
                                            Object[] objArr13 = new Object[1];
                                            c(new int[]{-140829444, -419924059, 850805882, -1554366495, 1750486695, -2144339684, -1657816568, -19300094, 2134892447, -574978357}, i105, objArr13);
                                            Object objInvoke3 = cls3.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                            int[] iArr2 = {-1860441987, -1521267715, -1294672521, -601409102, -1902863181, -1107607249, 927554479, -2080974220, -168673928, 1687621547, 974990721, -1280284037, 961951208, -1835852020, -321632808, -1291535637, 1481502655, 617251906};
                                            int i106 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int i107 = i106 * 989;
                                            int i108 = (i107 & (-28623)) + (i107 | (-28623));
                                            int i109 = ((-30) ^ i98) | ((-30) & i98);
                                            int i110 = ~((i109 & i106) | (i109 ^ i106));
                                            int i111 = (i106 ^ 29) | (i106 & 29);
                                            int i112 = ~((i111 & i) | (i111 ^ i));
                                            int i113 = -(-(((i110 & i112) | (i110 ^ i112)) * 988));
                                            int i114 = ((((i108 | i113) << 1) - (i108 ^ i113)) - (~(-(-(((i106 ^ (-30)) | (i106 & (-30))) * (-988)))))) - 1;
                                            int i115 = ~i106;
                                            int i116 = TuitionPaymentFragmentbindingInflater1;
                                            int i117 = (i116 ^ 123) + ((i116 & 123) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i117 % 128;
                                            int i118 = i117 % 2;
                                            int i119 = ~((i115 & (-30)) | (i115 ^ (-30)));
                                            int i120 = ~((-30) | i);
                                            int i121 = (i119 ^ i120) | (i119 & i120);
                                            int i122 = i106 | i98;
                                            int i123 = ~((i122 & 29) | (i122 ^ 29));
                                            int i124 = i114 + (988 * ((i123 & i121) | (i121 ^ i123)));
                                            Object[] objArr14 = new Object[1];
                                            c(iArr2, i124, objArr14);
                                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                                            int i125 = -AndroidCharacter.getMirror('0');
                                            int i126 = (((i125 * 367) + 21286) - (~(((i125 ^ 58) | (i125 & 58)) * (-366)))) - 1;
                                            int i127 = ((~(((-59) ^ i) | ((-59) & i))) | i125) * (-366);
                                            int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                                            int i129 = ~i125;
                                            int i130 = ~((i129 & 58) | (i129 ^ 58));
                                            int i131 = ((-59) & i125) | ((-59) ^ i125);
                                            int i132 = ~((i131 & i) | (i131 ^ i));
                                            Object[] objArr15 = new Object[1];
                                            c(new int[]{1995056504, 977397984, -1468670036, 1498365403, 1380749620, 1496246265, 526578889, -2147304643}, (i128 - (~(((i130 & i132) | (i130 ^ i132)) * 366))) - 1, objArr15);
                                            Object[] objArr16 = (Object[]) cls4.getField((String) objArr15[0]).get(objInvoke3);
                                            int length = objArr16.length;
                                            int i133 = 0;
                                            while (true) {
                                                if (i133 < length) {
                                                    int i134 = TuitionPaymentFragmentbindingInflater1;
                                                    int i135 = (i134 ^ 51) + ((i134 & 51) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i135 % 128;
                                                    int i136 = i135 % i11;
                                                    Object obj2 = objArr16[i133];
                                                    int i137 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                    int i138 = (i137 * (-167)) - 1002;
                                                    int i139 = ~i137;
                                                    int i140 = ~((i139 ^ (-7)) | (i139 & (-7)));
                                                    int i141 = ~(((-7) ^ i) | ((-7) & i));
                                                    int i142 = -(-(((i140 ^ i141) | (i140 & i141)) * 336));
                                                    int i143 = (((i138 & i142) + (i142 | i138)) - (~(((~(i137 | 6)) | (~((i137 ^ i) | (i137 & i)))) * (-168)))) - 1;
                                                    int i144 = ~((i19 ^ i137) | (i137 & i19));
                                                    int i145 = -(-(((i144 & (-7)) | ((-7) ^ i144)) * 168));
                                                    int i146 = (i143 ^ i145) + ((i145 & i143) << 1);
                                                    Object[] objArr17 = new Object[1];
                                                    c(new int[]{1979379088, 217893206, -1046603269, -1825033278, -6222071, 31698662}, i146, objArr17);
                                                    try {
                                                        Object[] objArr18 = {(String) objArr17[0]};
                                                        char[] cArr9 = {31, 21, 3, 21, '(', '#', 5, 4, 28, 27, 22, 5, 11, '%', 4, 5, 22, 0, '%', '.', 0, 25, 5, 22, '\f', 24, '\n', 31, 2, 5, Typography.amp, 31, 4, 2, 0, 23, 13920};
                                                        int i147 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                        int i148 = ~(((-127) ^ i19) | ((-127) & i19));
                                                        int i149 = ~(((-127) ^ i147) | ((-127) & i147));
                                                        int i150 = (i148 ^ i149) | (i148 & i149);
                                                        int i151 = ~((i19 ^ i147) | (i19 & i147));
                                                        int i152 = (i150 ^ i151) | (i150 & i151);
                                                        int i153 = TuitionPaymentFragmentbindingInflater1 + 21;
                                                        Object[] objArr19 = objArr16;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i153 % 128;
                                                        int i154 = i153 % i11;
                                                        int i155 = ~(((i147 ^ (-1)) & 126) | (i147 ^ ComposerKt.defaultsKey) | i);
                                                        int i156 = (i147 * (-589)) + 74466 + (590 * ((i155 & i152) | (i152 ^ i155)));
                                                        int i157 = ~(((-127) ^ i98) | ((-127) & i98));
                                                        int i158 = ~((-127) | i147);
                                                        int i159 = i156 + (((i158 & i157) | (i157 ^ i158) | (~((i19 ^ i147) | (i19 & i147)))) * (-1180));
                                                        int i160 = ~((~i147) | i19);
                                                        int i161 = ~((i19 ^ 126) | (i19 & 126));
                                                        int i162 = -(-(((i160 & i161) | (i160 ^ i161)) * 590));
                                                        byte b5 = (byte) ((i159 & i162) + (i162 | i159));
                                                        int iRed = Color.red(0);
                                                        int i163 = ((iRed | 37) << 1) - (iRed ^ 37);
                                                        Object[] objArr20 = new Object[1];
                                                        a(cArr9, b5, i163, objArr20);
                                                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                                                        Object[] objArr21 = new Object[1];
                                                        c(new int[]{-2027748692, 536669990, -1909899427, -1131222167, 354154497, 89362532, -1223350763, -71496606}, 10 - (~(-(-(Process.myPid() >> 22)))), objArr21);
                                                        Object objInvoke4 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr18);
                                                        int i164 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                        int i165 = (i164 ^ 29) + ((i164 & 29) << 1);
                                                        TuitionPaymentFragmentbindingInflater1 = i165 % 128;
                                                        int i166 = 28;
                                                        if (i165 % i11 == 0) {
                                                            try {
                                                                i9 = 0;
                                                                i10 = 1;
                                                                cArr = new char[]{25, '-', 21, 28, 5, 23, 18, '#', 4, 3, '+', 4, 11, 4, 4, Typography.dollar, 31, 30, '#', 11, 22, '\f', '-', 25, 6, 29, 25, 0};
                                                                i166 = 77;
                                                                trimmedLength = (byte) (42 - TextUtils.getTrimmedLength(str));
                                                            } catch (Throwable th) {
                                                                Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            cArr = new char[]{25, '-', 21, 28, 5, 23, 18, '#', 4, 3, '+', 4, 11, 4, 4, Typography.dollar, 31, 30, '#', 11, 22, '\f', '-', 25, 6, 29, 25, 0};
                                                            int i167 = -TextUtils.getTrimmedLength(str);
                                                            i10 = 1;
                                                            trimmedLength = (byte) ((i167 ^ 50) + ((i167 & 50) << 1));
                                                            i9 = 0;
                                                        }
                                                        int i168 = -KeyEvent.normalizeMetaState(i9);
                                                        int i169 = ((i166 | i168) << 1) - (i168 ^ i166);
                                                        Object[] objArr22 = new Object[i10];
                                                        a(cArr, trimmedLength, i169, objArr22);
                                                        Class<?> cls6 = Class.forName((String) objArr22[i9]);
                                                        int i170 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        Object[] objArr23 = new Object[1];
                                                        a(new char[]{2, 3, '%', 7, 2, 5, 0, 26, 22, 25, 13868}, (byte) ((i170 ^ 74) + ((i170 & 74) << 1)), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr23);
                                                        try {
                                                            Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr23[0], null).invoke(obj2, null))};
                                                            char[] cArr10 = {31, 21, 3, 21, '(', '#', 5, 4, 28, 27, 22, 5, 11, '%', 4, 5, 22, 0, '%', '.', 0, 25, 5, 22, '\f', 24, '\n', 31, 2, 5, Typography.amp, 31, 4, 2, 0, 23, 13920};
                                                            int capsMode = TextUtils.getCapsMode(str, 0, 0);
                                                            int deadChar = KeyEvent.getDeadChar(0, 0);
                                                            int i171 = ~deadChar;
                                                            int i172 = (i171 ^ (-38)) | (i171 & (-38));
                                                            int i173 = ~((i172 ^ i) | (i172 & i));
                                                            int i174 = (deadChar ^ 37) | (deadChar & 37);
                                                            int i175 = ~((i174 ^ i) | (i174 & i));
                                                            int i176 = ((deadChar * 70) - 2516) + (((i173 ^ i175) | (i175 & i173)) * 69);
                                                            int i177 = ~((i171 ^ 37) | (i171 & 37));
                                                            int i178 = ~(i171 | i);
                                                            int i179 = (i177 & i178) | (i177 ^ i178);
                                                            int i180 = ~((i ^ 37) | (i & 37));
                                                            int i181 = ((i176 + (((i179 & i180) | (i179 ^ i180)) * (-69))) - (~((~(((-38) & deadChar) | ((-38) ^ deadChar))) * 69))) - 1;
                                                            Object[] objArr25 = new Object[1];
                                                            a(cArr10, (byte) ((capsMode & 125) + (capsMode | 125)), i181, objArr25);
                                                            Class<?> cls7 = Class.forName((String) objArr25[0]);
                                                            char[] cArr11 = {11, 1, 4, 11, 22, 25, 2, 5, '.', 2, 22, 0, 24, '\f', 24, 5, 22, 3, 13852};
                                                            int capsMode2 = TextUtils.getCapsMode(str, 0, 0);
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i182 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
                                                            TuitionPaymentFragmentbindingInflater1 = i182 % 128;
                                                            int i183 = i182 % 2;
                                                            int i184 = (-589) * capsMode2;
                                                            int i185 = (i184 ^ 17139) + ((i184 & 17139) << 1);
                                                            int i186 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                            int i187 = length;
                                                            int i188 = ~(((-30) ^ i186) | ((-30) & i186));
                                                            int i189 = ~(((-30) ^ capsMode2) | ((-30) & capsMode2));
                                                            int i190 = (i188 ^ i189) | (i188 & i189);
                                                            int i191 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                            int i192 = i133;
                                                            int i193 = ~((i191 ^ capsMode2) | (i191 & capsMode2));
                                                            int i194 = (i190 ^ i193) | (i190 & i193);
                                                            int i195 = ~capsMode2;
                                                            int i196 = ~((i195 ^ 29) | (i195 & 29) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                                            int i197 = -(-(((i194 ^ i196) | (i194 & i196)) * 590));
                                                            int i198 = (i185 & i197) + (i197 | i185);
                                                            int i199 = ~((-30) | i186);
                                                            int i200 = ~(((-30) ^ capsMode2) | ((-30) & capsMode2));
                                                            int i201 = (i199 ^ i200) | (i200 & i199);
                                                            int i202 = ~(capsMode2 | i191);
                                                            int i203 = ((i201 & i202) | (i201 ^ i202)) * (-1180);
                                                            int i204 = (i198 & i203) + (i203 | i198);
                                                            int i205 = ~((i195 ^ i186) | (i195 & i186));
                                                            int i206 = ~((i191 ^ 29) | (i191 & 29));
                                                            int i207 = ((i205 & i206) | (i205 ^ i206)) * 590;
                                                            byte b6 = (byte) (((i204 | i207) << 1) - (i207 ^ i204));
                                                            int i208 = -Gravity.getAbsoluteGravity(0, 0);
                                                            int i209 = i208 * (-51);
                                                            int i210 = (i209 & PointerIconCompat.TYPE_CROSSHAIR) + (i209 | PointerIconCompat.TYPE_CROSSHAIR);
                                                            int i211 = (~((i19 ^ i208) | (i19 & i208) | 19)) * 52;
                                                            int i212 = (i210 & i211) + (i211 | i210);
                                                            int i213 = ~(((-20) & i19) | ((-20) ^ i19));
                                                            int i214 = ~(((-20) & i208) | ((-20) ^ i208));
                                                            int i215 = (i213 & i214) | (i213 ^ i214);
                                                            int i216 = ~((i98 ^ i208) | (i98 & i208));
                                                            int i217 = ((i215 & i216) | (i215 ^ i216)) * (-52);
                                                            int i218 = (i212 & i217) + (i217 | i212);
                                                            int i219 = ~i208;
                                                            int i220 = ~((i219 & i19) | (i219 ^ i19));
                                                            int i221 = ~((~i208) | 19);
                                                            int i222 = (i218 - (~(-(-(((i221 & i220) | (i220 ^ i221)) * 52))))) - 1;
                                                            Object[] objArr26 = new Object[1];
                                                            a(cArr11, b6, i222, objArr26);
                                                            Object objInvoke5 = cls7.getMethod((String) objArr26[0], InputStream.class).invoke(objInvoke4, objArr24);
                                                            try {
                                                                int i223 = -TextUtils.getOffsetBefore(str, 0);
                                                                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                                                int i224 = pressedStateDuration * (-743);
                                                                int i225 = ((i224 | (-25262)) << 1) - (i224 ^ (-25262));
                                                                int i226 = (pressedStateDuration ^ 34) | (pressedStateDuration & 34);
                                                                int i227 = i225 + (((~i226) | (~((pressedStateDuration ^ i) | (pressedStateDuration & i))) | (~((i ^ 34) | (i & 34)))) * (-744));
                                                                int i228 = ~pressedStateDuration;
                                                                int i229 = ~((i228 & (-35)) | (i228 ^ (-35)));
                                                                int i230 = i227 + (((i229 & i19) | (i19 ^ i229)) * 744) + (((i226 ^ i) | (i226 & i)) * 744);
                                                                Object[] objArr27 = new Object[1];
                                                                a(new char[]{31, 21, 3, 21, '(', '#', 5, 4, 28, 27, 22, 5, 11, '%', 4, 5, 22, 0, '(', ' ', '/', 15, 30, '.', 0, 25, 5, 22, '\f', 24, '\n', 31, 2, 5}, (byte) (((i223 | 67) << 1) - (i223 ^ 67)), i230, objArr27);
                                                                Class<?> cls8 = Class.forName((String) objArr27[0]);
                                                                int iResolveSize = View.resolveSize(0, 0);
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i231 = iResolveSize * (-115);
                                                                int i232 = (i231 & (-13570)) + (i231 | (-13570));
                                                                int i233 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                int i234 = (i233 & iResolveSize) | (i233 ^ iResolveSize);
                                                                int i235 = (~((i234 & 118) | (i234 ^ 118))) * (-116);
                                                                int i236 = (i232 ^ i235) + ((i235 & i232) << 1);
                                                                int i237 = ((iResolveSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iResolveSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 116;
                                                                int i238 = ~iResolveSize;
                                                                int i239 = ~((i238 & (-119)) | (i238 ^ (-119)));
                                                                int i240 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-119)) | ((-119) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                                byte b7 = (byte) (((((i236 | i237) << 1) - (i237 ^ i236)) - (~(-(-(((i240 & i239) | (i239 ^ i240)) * 116))))) - 1);
                                                                int i241 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                int i242 = (i241 & 23) + (i241 | 23);
                                                                Object[] objArr28 = new Object[1];
                                                                a(new char[]{11, 1, 0, '\b', '!', '\r', ' ', 0, 4, 2, 29, '/', 13856, 13856, '#', 23, 25, '/', 5, 24, 31, 23, 13932}, b7, i242, objArr28);
                                                                if (!objNewInstance.equals(cls8.getMethod((String) objArr28[0], null).invoke(objInvoke5, null))) {
                                                                    int i243 = TuitionPaymentFragmentbindingInflater1;
                                                                    int i244 = ((i243 | 59) << 1) - (i243 ^ 59);
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i244 % 128;
                                                                    int i245 = i244 % 2;
                                                                    try {
                                                                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                                                                        int i246 = absoluteGravity * 595;
                                                                        int i247 = (i246 & (-79529)) + (i246 | (-79529));
                                                                        int i248 = ~absoluteGravity;
                                                                        int i249 = ~((i248 & 67) | (i248 ^ 67));
                                                                        int i250 = ~((i19 ^ 67) | (i19 & 67));
                                                                        int i251 = i247 + (((i249 & i250) | (i249 ^ i250)) * (-1188));
                                                                        int i252 = ~absoluteGravity;
                                                                        int i253 = ~((i252 & 67) | (i252 ^ 67));
                                                                        int i254 = ~(((-68) ^ i) | ((-68) & i));
                                                                        int i255 = (i253 & i254) | (i253 ^ i254);
                                                                        int i256 = ~(i19 | absoluteGravity);
                                                                        int i257 = i251 + (((i255 & i256) | (i255 ^ i256)) * 594);
                                                                        int i258 = (~(((-68) ^ i19) | ((-68) & i19))) | (~(((-68) & absoluteGravity) | ((-68) ^ absoluteGravity)));
                                                                        int i259 = ~((absoluteGravity & i19) | (i19 ^ absoluteGravity));
                                                                        byte b8 = (byte) ((i257 - (~(-(-(((i258 & i259) | (i258 ^ i259)) * 594))))) - 1);
                                                                        int i260 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i261 = i260 * 569;
                                                                        int i262 = ((i261 | 19346) << 1) - (i261 ^ 19346);
                                                                        int i263 = ~i260;
                                                                        int i264 = ~((i263 ^ (-35)) | (i263 & (-35)));
                                                                        int i265 = ~i260;
                                                                        int i266 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                        int i267 = ~((i265 ^ i266) | (i265 & i266));
                                                                        int i268 = (i264 ^ i267) | (i267 & i264);
                                                                        int i269 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                        String str2 = str;
                                                                        int i270 = ((~((-35) | i269)) | i268) * (-1136);
                                                                        int i271 = (i262 ^ i270) + ((i270 & i262) << 1);
                                                                        int i272 = ~((i263 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i263 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                        int i273 = ~(((-35) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-35) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                        int i274 = (i272 & i273) | (i272 ^ i273);
                                                                        int i275 = ~((i269 ^ i260) | (i269 & i260) | 34);
                                                                        int i276 = (i271 - (~(-(-(((i274 & i275) | (i274 ^ i275)) * (-568)))))) - 1;
                                                                        int i277 = (~((i266 ^ i260) | (i260 & i266))) | (~((i266 ^ 34) | (i266 & 34)));
                                                                        int i278 = i265 | (-35);
                                                                        int i279 = ~((i278 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i278 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                        int i280 = (i276 - (~(-(-(((i277 & i279) | (i277 ^ i279)) * 568))))) - 1;
                                                                        Object[] objArr29 = new Object[1];
                                                                        a(new char[]{31, 21, 3, 21, '(', '#', 5, 4, 28, 27, 22, 5, 11, '%', 4, 5, 22, 0, '(', ' ', '/', 15, 30, '.', 0, 25, 5, 22, '\f', 24, '\n', 31, 2, 5}, b8, i280, objArr29);
                                                                        Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                        char[] cArr12 = {11, 1, 0, '\b', '!', '\r', ' ', 0, 4, 2, 29, '/', 13856, 13856, '#', 23, 25, '/', 5, 24, 31, 23, 13932};
                                                                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                                        int i281 = (keyRepeatDelay * 371) - (-43778);
                                                                        int i282 = TuitionPaymentFragmentbindingInflater1;
                                                                        int i283 = i282 + 107;
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i283 % 128;
                                                                        int i284 = i283 % 2;
                                                                        int i285 = ~(((-119) ^ i19) | ((-119) & i19));
                                                                        int i286 = ~keyRepeatDelay;
                                                                        int i287 = ~(i286 | i);
                                                                        int i288 = -(-((-370) * ((i285 & i287) | (i285 ^ i287))));
                                                                        int i289 = (i281 & i288) + (i281 | i288);
                                                                        int i290 = ~((i286 ^ i19) | (i286 & i19));
                                                                        int i291 = ~((-119) | i);
                                                                        int i292 = (i290 & i291) | (i290 ^ i291);
                                                                        int i293 = ~(keyRepeatDelay | 118);
                                                                        int i294 = (i289 - (~(-(-(((i292 & i293) | (i292 ^ i293)) * (-370)))))) - 1;
                                                                        int i295 = ~((keyRepeatDelay & 118) | (keyRepeatDelay ^ 118));
                                                                        int i296 = (i282 & 17) + (i282 | 17);
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i296 % 128;
                                                                        int i297 = i296 % 2;
                                                                        int i298 = 370 * i295;
                                                                        byte b9 = (byte) (((i294 | i298) << 1) - (i298 ^ i294));
                                                                        int i299 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i300 = i299 * 471;
                                                                        int i301 = (i300 ^ 11304) + ((i300 & 11304) << 1) + (((i299 ^ 24) | (i299 & 24)) * (-470));
                                                                        int i302 = ~i299;
                                                                        int i303 = ~((i302 & (-25)) | (i302 ^ (-25)));
                                                                        int i304 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                        int i305 = ((i304 | 57) << 1) - (i304 ^ 57);
                                                                        TuitionPaymentFragmentbindingInflater1 = i305 % 128;
                                                                        int i306 = i305 % 2;
                                                                        int i307 = (((-25) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-25) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) ^ (-1);
                                                                        int i308 = (i307 & i303) | (i303 ^ i307);
                                                                        int i309 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                        int i310 = (i309 & i299) | (i309 ^ i299);
                                                                        int i311 = ~((i310 ^ 24) | (i310 & 24));
                                                                        int i312 = (i301 - (~(-(-((-470) * ((i308 & i311) | (i308 ^ i311))))))) - 1;
                                                                        int i313 = ((-25) ^ i299) | (i299 & (-25));
                                                                        int i314 = ~((i313 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i313 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                                        int i315 = ~(i310 | 24);
                                                                        int i316 = i312 + (((i314 & i315) | (i314 ^ i315)) * 470);
                                                                        Object[] objArr30 = new Object[1];
                                                                        a(cArr12, b9, i316, objArr30);
                                                                        Object objInvoke6 = cls9.getMethod((String) objArr30[0], null).invoke(objInvoke5, null);
                                                                        Object obj3 = obj;
                                                                        if (!obj3.equals(objInvoke6)) {
                                                                            i133 = i192 + 1;
                                                                            int i317 = TuitionPaymentFragmentbindingInflater1 + 73;
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i317 % 128;
                                                                            if (i317 % 2 != 0) {
                                                                                int i318 = 4 % 3;
                                                                            }
                                                                            obj = obj3;
                                                                            objArr16 = objArr19;
                                                                            str = str2;
                                                                            length = i187;
                                                                            i11 = 2;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                int i319 = (i & (-2)) | (i19 & 1);
                                                                Object[] objArr31 = new Object[4];
                                                                objArr31[0] = new int[]{i};
                                                                objArr31[1] = new int[1];
                                                                int[] iArr3 = new int[1];
                                                                objArr31[2] = iArr3;
                                                                int i320 = TuitionPaymentFragmentbindingInflater1;
                                                                int i321 = i320 + 81;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i321 % 128;
                                                                int i322 = i321 % 2;
                                                                iArr3[0] = i319;
                                                                int i323 = ((i320 | 125) << 1) - (i320 ^ 125);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i323 % 128;
                                                                int i324 = i323 % 2;
                                                                objArr31[3] = null;
                                                                int iMyPid = Process.myPid();
                                                                int i325 = 1796620560 + (((-61435862) | iMyPid) * 614);
                                                                int i326 = ~iMyPid;
                                                                int i327 = i325 + (((~((-990401248) | i326)) | 939528202 | (~((-950091019) | i326))) * (-1228)) + (((~(i326 | (-10562817))) | (~((-50873046) | i326))) * 614);
                                                                int i328 = TuitionPaymentFragmentbindingInflater1;
                                                                int i329 = (i328 & 85) + (i328 | 85);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i329 % 128;
                                                                int i330 = i329 % 2;
                                                                int i331 = i327 + 16;
                                                                int i332 = ((i2 | i331) << 1) - (i2 ^ i331);
                                                                int i333 = i332 ^ (i332 << 13);
                                                                int i334 = i333 ^ (i333 >>> 17);
                                                                int i335 = i334 << 5;
                                                                int i336 = (i328 ^ 35) + ((i328 & 35) << 1);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i336 % 128;
                                                                int i337 = i336 % 2;
                                                                ((int[]) objArr31[1])[0] = ((~i335) & i334) | ((~i334) & i335);
                                                                return objArr31;
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                Object[] objArr32 = {new int[]{i}, new int[1], new int[]{i}, null};
                int i338 = ~i;
                int i339 = ~(744969189 | i338);
                int i340 = 943188664 + ((i339 | (-704658961)) * 764) + (((~(i338 | (-704658961))) | 671093248) * (-1528)) + (((-107441654) | i339) * 764);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ScholarshipPhotoPersonForInsert.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i341 = -(-(i340 * 367));
                int i342 = TuitionPaymentFragmentbindingInflater1;
                int i343 = (i342 ^ 27) + ((i342 & 27) << 1);
                int i344 = i343 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i344;
                if (i343 % 2 != 0) {
                    int i345 = (i341 - (~(-((-366) >>> i340)))) - 1;
                    int i346 = ~i340;
                    i4 = (i345 - (~(-((~((i346 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i346 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) - 366)))) - 1;
                    i3 = 1;
                } else {
                    int i347 = -(-(i340 * (-366)));
                    int i348 = (i341 & i347) + (i341 | i347);
                    int i349 = ~i340;
                    int i350 = i348 - (~(-(-((~((i349 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i349 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) * (-366)))));
                    i3 = 1;
                    i4 = i350 - 1;
                }
                int i351 = (i344 ^ 15) + ((i344 & 15) << i3);
                TuitionPaymentFragmentbindingInflater1 = i351 % 128;
                int i352 = i351 % 2;
                int i353 = ~(((-1) ^ i340) | i340);
                int i354 = ~i340;
                int i355 = 366 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i354) | (i354 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) | i353);
                int i356 = i2 + (i4 & i355) + (i355 | i4);
                int i357 = i356 << 13;
                int i358 = (i356 | i357) & (~(i356 & i357));
                int i359 = i358 >>> 17;
                int i360 = ((~i358) & i359) | ((~i359) & i358);
                ((int[]) objArr32[1])[0] = i360 ^ (i360 << 5);
                return objArr32;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(short r6, short r7, short r8) {
                /*
                    byte[] r0 = com.google.android.gms.cloudmessaging.zzad.$$a
                    int r6 = r6 + 66
                    int r8 = r8 + 4
                    int r7 = r7 * 2
                    int r7 = 1 - r7
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r6 = r7
                    r3 = r8
                    r4 = r2
                    goto L29
                L13:
                    r3 = r2
                L14:
                    int r8 = r8 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r7) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r4 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L29:
                    int r8 = -r8
                    int r6 = r6 + r8
                    r8 = r3
                    r3 = r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzad.$$c(short, short, short):java.lang.String");
            }
        });
        return taskCompletionSource.getTask();
    }

    private static String zzf() {
        String string;
        synchronized (Rpc.class) {
            int i = zza;
            zza = i + 1;
            string = Integer.toString(i);
        }
        return string;
    }

    private static void zzg(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
            }
            intent.putExtra("app", zzb);
        }
    }

    private final void zzh(String str, Bundle bundle) {
        synchronized (this.zze) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zze.remove(str);
            if (taskCompletionSource == null) {
                return;
            }
            taskCompletionSource.setResult(bundle);
        }
    }

    private static boolean zzi(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task<CloudMessage> getProxiedNotificationData() {
        return this.zzg.zza() >= 241100000 ? zzv.zzb(this.zzf).zzd(5, Bundle.EMPTY).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task<Void> messageHandled(CloudMessage cloudMessage) {
        if (this.zzg.zza() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
        Integer numZza = cloudMessage.zza();
        if (numZza != null) {
            bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numZza.intValue());
        }
        return zzv.zzb(this.zzf).zzc(3, bundle);
    }

    public Task<Bundle> send(final Bundle bundle) {
        if (this.zzg.zza() < 12000000) {
            return this.zzg.zzb() != 0 ? zze(bundle).continueWithTask(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.zza.zzb(bundle, task);
                }
            }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzv.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(String.valueOf(task.getException()))));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    public Task<Void> setRetainProxiedNotifications(boolean z) {
        if (this.zzg.zza() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z);
        return zzv.zzb(this.zzf).zzc(4, bundle);
    }

    final /* synthetic */ Task zzb(Bundle bundle, Task task) throws Exception {
        return (task.isSuccessful() && zzi((Bundle) task.getResult())) ? zze(bundle).onSuccessTask(zzc, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Rpc.zza((Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void zzd(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
