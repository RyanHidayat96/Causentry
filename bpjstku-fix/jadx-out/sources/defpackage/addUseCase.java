package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.autofill.HintConstants;
import androidx.core.os.EnvironmentCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.dynatrace.android.agent.metrics.ConnectionType;
import com.google.firebase.messaging.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class addUseCase {
    private static volatile addUseCase INotificationSideChannelDefault;
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean INotificationSideChannel;
    private final getLayoutDirection INotificationSideChannelStub;
    private final getScaleType RemoteActionCompatParcelizer;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f255a;
    public Long asInterface;
    public checkEffectTargets b;
    public String cancel;
    public Long d;
    public String g;
    public String getInterfaceDescriptor;
    public String notify;
    public String onTransact;
    private String read;
    private final Context write;
    public volatile ConnectionType TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ConnectionType.OFFLINE;
    public String cancelAll = null;
    public int asBinder = 0;
    public int TuitionPaymentFragmentbindingInflater1 = Integer.MIN_VALUE;
    public getSessionConfigCameraCaptureCallbacks INotificationSideChannelStubProxy = null;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("AndroidMetrics");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
        INotificationSideChannelDefault = null;
    }

    private addUseCase(Context context) {
        this.write = context;
        if (context == null) {
            this.RemoteActionCompatParcelizer = null;
            this.INotificationSideChannelStub = null;
        } else {
            this.RemoteActionCompatParcelizer = new getScaleType(context, new getRotation());
            this.INotificationSideChannelStub = getLayoutDirection.b(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[Catch: all -> 0x01a6, SYNTHETIC, TryCatch #2 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0071, B:11:0x0089, B:13:0x0095, B:14:0x009d, B:20:0x00cb, B:25:0x00d8, B:53:0x0114, B:27:0x00dc, B:52:0x010f, B:22:0x00cf, B:24:0x00d3, B:41:0x00f7, B:47:0x0106, B:49:0x010a, B:43:0x00fb, B:45:0x00ff, B:58:0x0122, B:64:0x0131, B:69:0x013e, B:66:0x0135, B:68:0x0139, B:60:0x0126, B:62:0x012a, B:70:0x013f, B:72:0x0143, B:73:0x015d, B:82:0x01a2, B:76:0x0168, B:78:0x0176, B:80:0x017a, B:81:0x0180), top: B:93:0x0007, inners: #1, #4, #6, #9, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010f A[Catch: all -> 0x01a6, PHI: r3
  0x010f: PHI (r3v9 long) = (r3v8 long), (r3v14 long) binds: [B:50:0x010c, B:28:0x00de] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0071, B:11:0x0089, B:13:0x0095, B:14:0x009d, B:20:0x00cb, B:25:0x00d8, B:53:0x0114, B:27:0x00dc, B:52:0x010f, B:22:0x00cf, B:24:0x00d3, B:41:0x00f7, B:47:0x0106, B:49:0x010a, B:43:0x00fb, B:45:0x00ff, B:58:0x0122, B:64:0x0131, B:69:0x013e, B:66:0x0135, B:68:0x0139, B:60:0x0126, B:62:0x012a, B:70:0x013f, B:72:0x0143, B:73:0x015d, B:82:0x01a2, B:76:0x0168, B:78:0x0176, B:80:0x017a, B:81:0x0180), top: B:93:0x0007, inners: #1, #4, #6, #9, #10, #12 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static addUseCase b() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        if (INotificationSideChannelDefault == null) {
            synchronized (addUseCase.class) {
                if (INotificationSideChannelDefault == null) {
                    INotificationSideChannelDefault = new addUseCase(lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().g);
                    addUseCase addusecase = INotificationSideChannelDefault;
                    addusecase.onTransact = Build.MANUFACTURER;
                    addusecase.INotificationSideChannel = willNotProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    addusecase.read = Build.VERSION.RELEASE;
                    StringBuilder sb = new StringBuilder("Android ");
                    sb.append(addusecase.read);
                    addusecase.cancel = sb.toString();
                    addusecase.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (String) ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1473072283, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1473072285, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    addusecase.notify = Build.MODEL;
                    Locale locale = Locale.getDefault();
                    String language = locale.getLanguage();
                    if (locale.getCountry().length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(language);
                        sb2.append("_");
                        sb2.append(locale.getCountry());
                        language = sb2.toString();
                    }
                    addusecase.getInterfaceDescriptor = language;
                    long jLongValue = 0;
                    Long lValueOf = 0L;
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        lValueOf = Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
                    }
                    FileReader fileReader2 = null;
                    getsessionconfigcameracapturecallbacks = null;
                    getsessionconfigcameracapturecallbacks = null;
                    getSessionConfigCameraCaptureCallbacks getsessionconfigcameracapturecallbacks = null;
                    if (addusecase.d == null) {
                        try {
                            fileReader = new FileReader("/proc/meminfo");
                            try {
                                bufferedReader = new BufferedReader(fileReader, 8192);
                                try {
                                    try {
                                        jLongValue = Long.valueOf(bufferedReader.readLine().split("\\s+")[1]).longValue();
                                        bufferedReader.close();
                                        fileReader.close();
                                        try {
                                            fileReader.close();
                                        } catch (IOException unused) {
                                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                ViewPort.TuitionPaymentFragmentbindingInflater1("Could not close input stream");
                                            }
                                        }
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused2) {
                                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                ViewPort.TuitionPaymentFragmentbindingInflater1("Could not close input stream");
                                            }
                                        }
                                    } catch (IOException unused3) {
                                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            ViewPort.TuitionPaymentFragmentbindingInflater1("Unable to measure total memory");
                                        }
                                        if (fileReader != null) {
                                            try {
                                                fileReader.close();
                                            } catch (IOException unused4) {
                                                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                    ViewPort.TuitionPaymentFragmentbindingInflater1("Could not close input stream");
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException unused5) {
                                                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                        ViewPort.TuitionPaymentFragmentbindingInflater1("Could not close input stream");
                                                    }
                                                }
                                            }
                                        } else if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        return INotificationSideChannelDefault;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileReader2 = fileReader;
                                    if (fileReader2 == null) {
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                            throw th;
                                        }
                                        throw th;
                                    }
                                    try {
                                        fileReader2.close();
                                    } catch (IOException unused6) {
                                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                            ViewPort.TuitionPaymentFragmentbindingInflater1("Could not close input stream");
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (IOException unused7) {
                                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                ViewPort.TuitionPaymentFragmentbindingInflater1("Could not close input stream");
                                                throw th;
                                            }
                                            throw th;
                                        }
                                    }
                                    throw th;
                                    throw th;
                                }
                            } catch (IOException unused8) {
                                bufferedReader = null;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = null;
                                fileReader2 = fileReader;
                                if (fileReader2 == null) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        throw th;
                                    }
                                    throw th;
                                }
                                fileReader2.close();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                    throw th;
                                }
                                throw th;
                                throw th;
                            }
                        } catch (IOException unused9) {
                            fileReader = null;
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = null;
                            if (fileReader2 == null) {
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                    throw th;
                                }
                                throw th;
                            }
                            fileReader2.close();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                throw th;
                            }
                            throw th;
                            throw th;
                        }
                        addusecase.d = Long.valueOf(jLongValue / 1024);
                    }
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Verbose metrics updated in %s ms", Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - lValueOf.longValue())));
                    }
                    addusecase.TuitionPaymentFragmentbindingInflater1();
                    addusecase.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    Context context = addusecase.write;
                    if (context != null) {
                        Display display = ((DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplay(0);
                        if (display == null) {
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Could not find a default Display");
                            }
                        } else {
                            getSessionConfigCameraCaptureCallbacks.b bVar = new getSessionConfigCameraCaptureCallbacks.b();
                            DisplayMetrics displayMetricsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(display);
                            bVar.TuitionPaymentFragmentbindingInflater1 = displayMetricsTuitionPaymentFragmentspecialinlinedviewModeldefault2.density;
                            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = displayMetricsTuitionPaymentFragmentspecialinlinedviewModeldefault2.densityDpi;
                            Point pointTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CaptureNode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(display);
                            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = pointTuitionPaymentFragmentspecialinlinedviewModeldefault1.x;
                            bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = pointTuitionPaymentFragmentspecialinlinedviewModeldefault1.y;
                            getsessionconfigcameracapturecallbacks = new getSessionConfigCameraCaptureCallbacks(bVar, (byte) 0);
                        }
                    }
                    addusecase.INotificationSideChannelStubProxy = getsessionconfigcameracapturecallbacks;
                }
            }
        }
        return INotificationSideChannelDefault;
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        Long lValueOf = 0L;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            lValueOf = Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
        }
        a();
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Basic metrics updated in %s ms", Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - lValueOf.longValue())));
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Long lValueOf = 0L;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            lValueOf = Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
        }
        asBinder();
        Context context = this.write;
        if (context != null) {
            this.asBinder = context.getResources().getConfiguration().orientation;
        }
        getLayoutDirection getlayoutdirection = this.INotificationSideChannelStub;
        if (getlayoutdirection != null) {
            this.TuitionPaymentFragmentbindingInflater1 = getlayoutdirection.b();
        }
        asInterface();
        getScaleType getscaletype = this.RemoteActionCompatParcelizer;
        if (getscaletype != null) {
            this.b = getscaletype.TuitionPaymentFragmentbindingInflater1();
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Common metrics updated in %s ms", Long.valueOf(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - lValueOf.longValue())));
        }
    }

    private void a() {
        Context context = this.write;
        if (context != null) {
            this.g = null;
            try {
                String networkOperatorName = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
                if (networkOperatorName != null) {
                    if (networkOperatorName == null) {
                        networkOperatorName = EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    this.g = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(networkOperatorName, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                }
            } catch (Exception e2) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.d(e2.toString());
                }
            }
        }
    }

    private void asBinder() {
        ConnectionType connectionType;
        String subtypeName;
        NetworkInfo networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null || !networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.isAvailable() || !networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.isConnected()) {
            connectionType = ConnectionType.OFFLINE;
        } else {
            switch (networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.getType()) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                    connectionType = ConnectionType.MOBILE;
                    break;
                case 1:
                case 13:
                    connectionType = ConnectionType.WIFI;
                    break;
                case 6:
                case 7:
                case 8:
                default:
                    connectionType = ConnectionType.OTHER;
                    break;
                case 9:
                    connectionType = ConnectionType.LAN;
                    break;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = connectionType;
        int i = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.ordinal()];
        if (i == 1) {
            this.cancelAll = "802.11x";
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.cancelAll = "Ethernet";
                return;
            } else {
                this.cancelAll = null;
                return;
            }
        }
        switch (networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                subtypeName = "2G";
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                subtypeName = "3G";
                break;
            case 13:
            case 18:
            case 19:
                subtypeName = "4G";
                break;
            case 20:
                subtypeName = "5G";
                break;
            default:
                subtypeName = networkInfoTuitionPaymentFragmentspecialinlinedviewModeldefault1.getSubtypeName();
                break;
        }
        this.cancelAll = subtypeName;
    }

    /* JADX INFO: renamed from: addUseCase$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[ConnectionType.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[ConnectionType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[ConnectionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[ConnectionType.LAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void asInterface() {
        ActivityManager activityManagerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (activityManagerTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.asInterface = null;
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManagerTuitionPaymentFragmentspecialinlinedviewModeldefault3.getMemoryInfo(memoryInfo);
        this.asInterface = Long.valueOf(memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    private ActivityManager TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        try {
            return (ActivityManager) this.write.getSystemService("activity");
        } catch (Exception e2) {
            if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return null;
            }
            ViewPort.d(e2.toString());
            return null;
        }
    }

    public final NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Context context = this.write;
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e2) {
            if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return null;
            }
            ViewPort.d(e2.toString());
            return null;
        }
    }
}
