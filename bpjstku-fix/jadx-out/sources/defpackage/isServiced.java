package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.crash.PlatformType;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class isServiced {
    public static AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicInteger(0);
    protected int INotificationSideChannel;
    boolean TuitionPaymentFragmentbindingInflater1;
    public EventType TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long f1229a;
    public String asBinder;
    public long asInterface;
    public int b;
    public mergeConfigs cancel;
    public long cancelAll;
    public boolean d;
    public long g;
    protected String notify;
    private int onTransact;

    protected long asBinder() {
        return 0L;
    }

    public isServiced(String str, EventType eventType, long j, int i, long j2, long j3, mergeConfigs mergeconfigs, int i2, boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.asBinder = "";
        this.cancel = mergeconfigs;
        this.onTransact = 6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = eventType;
        this.g = j2;
        this.f1229a = j3;
        this.cancelAll = j;
        this.asInterface = 0L;
        this.b = i;
        this.INotificationSideChannel = i2;
        this.d = true;
        if (str == null) {
            this.asBinder = "";
        } else {
            this.asBinder = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
        if (j == 0) {
            long jTuitionPaymentFragmentbindingInflater1 = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
            synchronized (mergeconfigs) {
                if (jTuitionPaymentFragmentbindingInflater1 > mergeconfigs.TuitionPaymentFragmentbindingInflater1) {
                    mergeconfigs.TuitionPaymentFragmentbindingInflater1 = jTuitionPaymentFragmentbindingInflater1;
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    }

    public isServiced(String str, int i, EventType eventType, long j, mergeConfigs mergeconfigs, int i2, boolean z) {
        this.g = -1L;
        this.f1229a = -1L;
        this.cancelAll = 0L;
        this.d = false;
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.asBinder = "";
        this.asInterface = 0L;
        this.cancel = mergeconfigs;
        this.onTransact = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = eventType;
        long jTuitionPaymentFragmentbindingInflater1 = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - mergeconfigs.g;
        this.g = jTuitionPaymentFragmentbindingInflater1;
        this.f1229a = jTuitionPaymentFragmentbindingInflater1;
        this.cancelAll = j;
        this.asInterface = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.b = ViewPort.b();
        this.INotificationSideChannel = i2;
        this.d = i != 5;
        if (str == null) {
            this.asBinder = "";
        } else {
            this.asBinder = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
        if (j == 0) {
            long jTuitionPaymentFragmentbindingInflater2 = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
            synchronized (mergeconfigs) {
                if (jTuitionPaymentFragmentbindingInflater2 > mergeconfigs.TuitionPaymentFragmentbindingInflater1) {
                    mergeconfigs.TuitionPaymentFragmentbindingInflater1 = jTuitionPaymentFragmentbindingInflater2;
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    public isServiced(String str, int i, mergeConfigs mergeconfigs, int i2, boolean z) {
        this.g = -1L;
        this.f1229a = -1L;
        this.cancelAll = 0L;
        this.d = false;
        this.TuitionPaymentFragmentbindingInflater1 = true;
        this.asBinder = "";
        this.asInterface = 0L;
        this.onTransact = i;
        this.asInterface = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.cancel = mergeconfigs;
        this.INotificationSideChannel = i2;
        if (str == null) {
            this.asBinder = "";
        } else {
            this.asBinder = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentbindingInflater1 = false;
        this.d = true;
    }

    public final boolean INotificationSideChannel() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    protected final long g() {
        return SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.cancel.g;
    }

    private void TuitionPaymentFragmentbindingInflater1(long j) {
        if (this.d) {
            return;
        }
        this.f1229a = j;
        this.d = true;
        if (this.cancelAll == 0) {
            mergeConfigs mergeconfigs = this.cancel;
            long jTuitionPaymentFragmentbindingInflater1 = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1();
            synchronized (mergeconfigs) {
                if (jTuitionPaymentFragmentbindingInflater1 > mergeconfigs.TuitionPaymentFragmentbindingInflater1) {
                    mergeconfigs.TuitionPaymentFragmentbindingInflater1 = jTuitionPaymentFragmentbindingInflater1;
                }
            }
        }
    }

    protected final void INotificationSideChannelStubProxy() {
        long jAsBinder = asBinder();
        if (jAsBinder > 0) {
            TuitionPaymentFragmentbindingInflater1(jAsBinder);
        } else {
            TuitionPaymentFragmentbindingInflater1(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.cancel.g);
        }
    }

    public final boolean cancel() {
        return this.d;
    }

    public final long a() {
        return this.cancelAll;
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
        this.cancelAll = j;
    }

    public int cancelAll() {
        return this.onTransact;
    }

    public final long onTransact() {
        return this.g;
    }

    public final void b(long j) {
        this.g = j;
    }

    protected final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.f1229a;
    }

    public final EventType TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.b;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        this.b = i;
    }

    public StringBuilder b() {
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.protocolId);
        switch (AnonymousClass5.TuitionPaymentFragmentbindingInflater1[this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal()]) {
            case 1:
                TuitionPaymentFragmentbindingInflater1(sb);
                sb.append("&vl=");
                sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify));
                break;
            case 2:
                TuitionPaymentFragmentbindingInflater1(sb);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    sb.append("&vl=");
                    if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                        sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                break;
            case 3:
                TuitionPaymentFragmentbindingInflater1(sb);
                sb.append("&vl=");
                sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify));
                break;
            case 4:
                TuitionPaymentFragmentbindingInflater1(sb);
                break;
            case 5:
                TuitionPaymentFragmentbindingInflater1(sb);
                break;
            case 6:
                TuitionPaymentFragmentbindingInflater1(sb);
                sb.append("&ev=");
                sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify));
                sb.append("&tt=");
                sb.append(PlatformType.CUSTOM.protocolValue);
                break;
            case 7:
                sb.append("&na=");
                sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
                    sb.append("&pl=");
                    if (!strTuitionPaymentFragmentspecialinlinedviewModeldefault4.isEmpty()) {
                        sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                    }
                }
                sb.append("&t0=");
                sb.append(this.g);
                break;
        }
        sb.append("&fw=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? "1" : "0");
        return sb;
    }

    /* JADX INFO: renamed from: isServiced$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[EventType.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[EventType.VALUE_DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.VALUE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.VALUE_INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.NAMED_EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.IDENTIFY_USER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.ERROR_INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.SELF_MONITORING_EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(StringBuilder sb) {
        sb.append("&na=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&pa=");
        sb.append(this.cancelAll);
        sb.append("&s0=");
        sb.append(this.b);
        sb.append("&t0=");
        sb.append(this.g);
    }

    public final int d() {
        return this.INotificationSideChannel;
    }

    public final mergeConfigs asInterface() {
        return this.cancel;
    }
}
