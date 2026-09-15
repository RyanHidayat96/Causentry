package defpackage;

import com.dynatrace.android.agent.EventType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class isPrimary extends lambdanew3androidxcameracoreSurfaceRequest {
    private static SurfaceRequestExternalSyntheticLambda3 INotificationSideChannelDefault;
    static final String INotificationSideChannelStub;
    private static boolean IconCompatParcelizer;
    private static int MediaBrowserCompat;
    private static int RemoteActionCompatParcelizer;
    private static volatile isPrimary connect;
    private static List<isPrimary> read;
    private volatile long disconnect;
    private volatile boolean getExtras;
    volatile int getInterfaceDescriptor;
    private volatile boolean getItem;
    private volatile boolean getNotifyChildrenChangedOptions;
    private volatile boolean getRoot;
    private volatile int getSessionToken;
    private boolean isConnected;
    private volatile Timer search;
    private volatile boolean sendCustomAction;
    private boolean write;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("DTXAutoAction");
        INotificationSideChannelStub = sb.toString();
        RemoteActionCompatParcelizer = onTransformationInfoUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1().cancelAll;
        MediaBrowserCompat = onTransformationInfoUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1().getNotifyChildrenChangedOptions;
        IconCompatParcelizer = true;
        INotificationSideChannelDefault = null;
        read = Collections.synchronizedList(new ArrayList(5));
    }

    protected isPrimary(String str, mergeConfigs mergeconfigs, int i, boolean z) {
        super(str, EventType.ACTION_AUTO, 0L, mergeconfigs, i, true, null);
        this.disconnect = 0L;
        this.getSessionToken = 0;
        this.getInterfaceDescriptor = 0;
        this.getItem = false;
        this.getExtras = false;
        this.getRoot = false;
        this.sendCustomAction = false;
        this.write = false;
        this.search = null;
        this.isConnected = false;
        getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, 1, a(), this, mergeconfigs, i, new String[0]);
    }

    public static isPrimary read() {
        return connect;
    }

    public static void b(SurfaceRequestTransformationInfo surfaceRequestTransformationInfo) {
        RemoteActionCompatParcelizer = surfaceRequestTransformationInfo.cancelAll;
        MediaBrowserCompat = surfaceRequestTransformationInfo.getNotifyChildrenChangedOptions;
        IconCompatParcelizer = surfaceRequestTransformationInfo.IconCompatParcelizer;
        INotificationSideChannelDefault = surfaceRequestTransformationInfo.d;
    }

    private static isPrimary TuitionPaymentFragmentspecialinlinedviewModeldefault2(isPrimary isprimary) {
        isPrimary isprimary2;
        synchronized (isPrimary.class) {
            isprimary2 = connect;
            connect = isprimary;
            if (isprimary2 != null) {
                read.add(isprimary2);
            }
        }
        return isprimary2;
    }

    public static void IconCompatParcelizer() {
        ArrayList arrayList;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((isPrimary) null);
        synchronized (read) {
            arrayList = new ArrayList(read);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((isPrimary) it.next()).MediaBrowserCompat();
            } catch (Exception unused) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.a("GAUA close all internal errors");
                }
            }
        }
    }

    public final void getNotifyChildrenChangedOptions() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(RemoteActionCompatParcelizer);
        connect();
    }

    public final void disconnect() {
        if (this.search == null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(RemoteActionCompatParcelizer);
        }
    }

    private void TuitionPaymentFragmentbindingInflater1(long j, long j2, int i, boolean z) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: startTimer for %s delay=%dms period=%dms #period=%d", this.asBinder, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
        TimerTask timerTask = new TimerTask(i, z) { // from class: isPrimary.5
            private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private int b;

            {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
                this.b = i;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                int i2 = this.b;
                if (i2 > 0) {
                    this.b = i2 - 1;
                    if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        return;
                    }
                } else {
                    isPrimary isprimary = isPrimary.this;
                    isprimary.TuitionPaymentFragmentspecialinlinedviewModeldefault2(isprimary.b(false));
                }
                isPrimary.this.b(this.b);
            }
        };
        for (int i2 = 3; i2 > 0; i2--) {
            try {
                b(true).schedule(timerTask, j, j2);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            } catch (IllegalStateException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int i2;
        this.getNotifyChildrenChangedOptions = true;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: onTimerPop for %s intv=%d WR=%d action=%d", this.asBinder, Integer.valueOf(i), Integer.valueOf(this.getSessionToken), Integer.valueOf(this.getInterfaceDescriptor)));
        }
        if (!this.sendCustomAction) {
            b(this, true);
        }
        if (this.getSessionToken > 0 || this.getInterfaceDescriptor > 0) {
            if (!this.sendCustomAction) {
                this.sendCustomAction = true;
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: starting waiting period for %s", this.asBinder));
                }
                long jG = ((long) MediaBrowserCompat) - (g() - onTransact());
                if (jG > 1000) {
                    i2 = 1000;
                } else {
                    if (jG < 0) {
                        jG = 0;
                    }
                    i2 = 100;
                }
                long j = i2;
                TuitionPaymentFragmentbindingInflater1(j, j, Math.round(jG / i2) - 1, true);
                return;
            }
            if (i > 0) {
                return;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(false));
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: closing %s", this.asBinder));
        }
        MediaBrowserCompat();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Timer timer) {
        this.getNotifyChildrenChangedOptions = this.sendCustomAction;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            StringBuilder sb = new StringBuilder("onUA: cancel timer=");
            sb.append(timer);
            sb.append(" graceTimeOver=");
            sb.append(this.getNotifyChildrenChangedOptions);
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    public final Timer b(boolean z) {
        Timer timer;
        synchronized (this) {
            try {
                if (z) {
                    if (this.search != null) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.search);
                    }
                    timer = new Timer(INotificationSideChannelStub);
                    this.search = timer;
                } else {
                    timer = this.search;
                    this.search = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return timer;
    }

    private void b(isPrimary isprimary, boolean z) {
        synchronized (this) {
            if (connect == isprimary) {
                connect = null;
                if (z) {
                    read.add(isprimary);
                }
            }
        }
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    protected final SurfaceRequestExternalSyntheticLambda2 INotificationSideChannelDefault() {
        if (this.getNotifyChildrenChangedOptions) {
            return null;
        }
        return super.INotificationSideChannelDefault();
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    protected final void b(isServiced isserviced) {
        if (isserviced == null) {
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: add child %s to %s", isserviced.asBinder, this.asBinder));
        }
        int iCancelAll = isserviced.cancelAll();
        boolean z = true;
        if (iCancelAll == 5) {
            this.getInterfaceDescriptor++;
            this.getExtras = true;
        } else {
            if (iCancelAll == 100 || iCancelAll == 110) {
                this.getSessionToken++;
                this.getItem = true;
                return;
            }
            switch (AnonymousClass4.TuitionPaymentFragmentbindingInflater1[isserviced.TuitionPaymentFragmentspecialinlinedviewModeldefault2().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    z = false;
                    break;
            }
            this.getRoot = z;
        }
    }

    /* JADX INFO: renamed from: isPrimary$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] TuitionPaymentFragmentbindingInflater1;

        static {
            int[] iArr = new int[EventType.values().length];
            TuitionPaymentFragmentbindingInflater1 = iArr;
            try {
                iArr[EventType.VALUE_INT64.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.VALUE_DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.VALUE_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.ERROR_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.ERROR_EXCEPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TuitionPaymentFragmentbindingInflater1[EventType.NAMED_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    protected final boolean INotificationSideChannelStub() {
        return super.INotificationSideChannelStub();
    }

    @Override // defpackage.isServiced
    protected final long asBinder() {
        if (this.getItem || this.getExtras) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: use adjusted eT=%d dur=%d", Long.valueOf(this.disconnect), Long.valueOf(this.disconnect - onTransact())));
            }
            return this.disconnect;
        }
        if (this.disconnect > 0) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA (empty): use adjusted eT=%d dur=%d", Long.valueOf(this.disconnect), Long.valueOf(this.disconnect - onTransact())));
            }
            return this.disconnect;
        }
        return super.asBinder();
    }

    public final void connect() {
        synchronized (this) {
            if (cancel()) {
                return;
            }
            this.disconnect = g();
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: new eT=%d dur=%d", Long.valueOf(this.disconnect), Long.valueOf(this.disconnect - onTransact())));
            }
        }
    }

    public final int TuitionPaymentFragmentbindingInflater1(long j) {
        if (cancel()) {
            return this.getSessionToken;
        }
        if (this.getSessionToken > 0 && j == this.asInterface) {
            connect();
            this.getSessionToken--;
        }
        return this.getSessionToken;
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    public final void RemoteActionCompatParcelizer() {
        this.write = true;
        MediaBrowserCompat();
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest, defpackage.isServiced
    public final StringBuilder b() {
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.protocolId);
        sb.append("&na=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&ca=");
        sb.append(this.asInterface);
        sb.append("&pa=");
        sb.append(a());
        sb.append("&s0=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        sb.append("&t0=");
        sb.append(onTransact());
        sb.append("&s1=");
        sb.append(((lambdanew3androidxcameracoreSurfaceRequest) this).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("&t1=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3() - onTransact());
        sb.append("&mo=");
        sb.append("0");
        sb.append("&fw=");
        sb.append(((lambdanew3androidxcameracoreSurfaceRequest) this).onTransact ? "1" : "0");
        return sb;
    }

    public static isPrimary TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, mergeConfigs mergeconfigs, int i) {
        isPrimary isprimary = new isPrimary(str, mergeconfigs, i, true);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(isprimary);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: new GAUA %s @ %d", str, Long.valueOf(isprimary.onTransact())));
        }
        if (INotificationSideChannelDefault != null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("invoking the AUA modifier on the current auto action");
            }
            new updateTransformationInfo(isprimary);
        }
        return isprimary;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[EDGE_INSN: B:35:0x00af->B:37:0x00bb BREAK  A[LOOP:0: B:29:0x0098->B:42:?]] */
    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    public final void MediaBrowserCompat() {
        boolean z = false;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(false));
        boolean z2 = true;
        this.sendCustomAction = true;
        this.getNotifyChildrenChangedOptions = true;
        b(this, false);
        read.remove(this);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: leave %s - abandon=%b WR=%b action=%b modified=%b eT=%d", this.asBinder, Boolean.valueOf(this.write), Boolean.valueOf(this.getItem), Boolean.valueOf(this.getExtras), Boolean.valueOf(this.getRoot), Long.valueOf(this.disconnect)));
        }
        if (this.write) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
            return;
        }
        if (((!this.getItem && !this.getExtras) || this.disconnect <= 0) && !IconCompatParcelizer && !this.getRoot) {
            z2 = false;
        }
        if (!z2 || this.getInterfaceDescriptor <= 0) {
            z = z2;
        } else {
            String str = this.asBinder;
            StringBuilder sb = new StringBuilder("Loading ");
            sb.append(lambdaprovideSurface5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (str.equals(sb.toString())) {
                Vector<isServiced> interfaceDescriptor = getInterfaceDescriptor();
                if (interfaceDescriptor.size() > 0) {
                    Iterator<isServiced> it = interfaceDescriptor.iterator();
                    do {
                        if (!it.hasNext()) {
                            if (interfaceDescriptor.get(0) instanceof CaptureNode1ExternalSyntheticLambda0) {
                                ((CaptureNode1ExternalSyntheticLambda0) interfaceDescriptor.get(0)).RemoteActionCompatParcelizer();
                            }
                        }
                    } while (!(it.next() instanceof setCameraCaptureCallback));
                    z = z2;
                } else {
                    z = z2;
                }
            } else {
                z = z2;
            }
        }
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(z);
    }

    @Override // defpackage.lambdanew3androidxcameracoreSurfaceRequest
    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        if (str.startsWith("MT_3_")) {
            this.getSessionToken--;
        } else {
            this.getInterfaceDescriptor--;
        }
        super.TuitionPaymentFragmentbindingInflater1(str);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(false));
        if (i <= 0) {
            b(0);
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: start grace period for %s", this.asBinder));
        }
        long j = i;
        TuitionPaymentFragmentbindingInflater1(j, j, 0, false);
    }
}
