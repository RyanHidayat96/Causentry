package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentTransaction;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class getNumberOfTargets implements Cloneable {
    private int INotificationSideChannel;
    private int INotificationSideChannelDefault;
    private byte[] INotificationSideChannelStub;
    private int INotificationSideChannelStubProxy;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat;
    private int MediaBrowserCompatCallbackHandler;
    private int MediaBrowserCompatConnectionCallback;
    private boolean RemoteActionCompatParcelizer;
    public getPrimarySurfaceEdge TuitionPaymentFragmentbindingInflater1;
    public int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f958a;
    public int asBinder;
    private int[] asInterface;
    public int[] b;
    private int cancel;
    private int cancelAll;
    private int connect;
    public int d;
    private int disconnect;
    private int g;
    private boolean getExtras;
    private int[] getInterfaceDescriptor;
    private int getItem;
    private int getNotifyChildrenChangedOptions;
    private int getRoot;
    private int getServiceComponent;
    private int getSessionToken;
    private byte[] handleMessage;
    private int isConnected;
    private int notify;
    private getPrimarySurfaceEdge onConnected;
    private boolean onConnectionSuspended;
    private byte[] onTransact;
    private int read;
    private int search;
    private int sendCustomAction;
    private int setCallbacksMessenger;
    private byte[] setInternalConnectionCallback;
    private byte[] subscribe;
    private short[] unsubscribe;
    private int write;
    private static final byte[] $$c = {25, -93, -120, -48};
    private static final int $$f = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -56, 58, -24, 9, 2, 7, 6, 10, 9, -40, 58, 3, 5, -10, -14, 32, 24, -10, 14, -50, 23, 51, 6, -1, 10, 5, 21, 4, -10, 26, -4, 13, 6, 12, -25, 21, 19, 13, 9, 0, 0, -28, 40, 24, -6, 1, 9, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, 6, 4, -4, 5, 13, -1, 18, 4, 12, 5, 4, 12, -2, 6, 25, -6, 3, 25, -35, 41, -4, 8, 14, -1, 8, 8, 2, 27, -2, 15, -59};
    private static final int $$e = 128;
    private static final byte[] $$a = {33, -59, 107, -108, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 92;
    private static int MediaBrowserCompatCustomActionCallback = 0;
    private static int onProgressUpdate = 1;
    private static long onConnectionFailed = -3835907958299383250L;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 107 - r6
            int r8 = r8 * 3
            int r8 = r8 + 84
            byte[] r0 = defpackage.getNumberOfTargets.$$a
            int r7 = r7 * 15
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumberOfTargets.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getNumberOfTargets.$$d
            int r7 = r7 * 31
            int r7 = 115 - r7
            int r8 = r8 * 44
            int r8 = r8 + 4
            int r9 = r9 * 8
            int r9 = r9 + 45
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-7)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumberOfTargets.f(short, int, int, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(onConnectionFailed ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 71;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 5;
        }
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(onConnectionFailed)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (-16775860) - Color.rgb(0, 0, 0), View.MeasureSpec.getSize(0) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 468 - (ViewConfiguration.getScrollBarSize() >> 8), 13 - TextUtils.indexOf("", ""), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public final getNumberOfTargets TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onProgressUpdate + 41;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            getNumberOfTargets getnumberoftargets = (getNumberOfTargets) clone();
            this.onTransact = new byte[256];
            Object obj = null;
            this.unsubscribe = null;
            this.setInternalConnectionCallback = null;
            this.handleMessage = null;
            this.subscribe = null;
            this.getInterfaceDescriptor = null;
            int i4 = MediaBrowserCompatCustomActionCallback + 35;
            onProgressUpdate = i4 % 128;
            if (i4 % 2 != 0) {
                return getnumberoftargets;
            }
            obj.hashCode();
            throw null;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public getNumberOfTargets(ByteBuffer byteBuffer) {
        this(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public getNumberOfTargets(byte[] bArr, int i, int i2) {
        this.getSessionToken = 1;
        this.onTransact = new byte[256];
        this.notify = 0;
        this.INotificationSideChannelDefault = 0;
        this.getItem = 0;
        this.onConnectionSuspended = false;
        this.cancelAll = 0;
        this.setCallbacksMessenger = Integer.MAX_VALUE;
        this.INotificationSideChannelStub = bArr;
        this.IconCompatParcelizer = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
        this.f958a = 0;
        this.asBinder = 0;
        this.b = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r3 = r6.INotificationSideChannelStub;
        r4 = r6.IconCompatParcelizer;
        r6.f958a = r2 + 1;
        r2 = r3[r4 + r2] & kotlin.UByte.MAX_VALUE;
        r1 = r1 + 89;
        defpackage.getNumberOfTargets.onProgressUpdate = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r2 >= r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 >= r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.getNumberOfTargets.MediaBrowserCompatCustomActionCallback
            int r2 = r1 + 71
            int r3 = r2 % 128
            defpackage.getNumberOfTargets.onProgressUpdate = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L19
            int r2 = r6.f958a
            int r4 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r5 = 99
            int r5 = r5 / r3
            if (r2 < r4) goto L20
            goto L1f
        L19:
            int r2 = r6.f958a
            int r4 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r2 < r4) goto L20
        L1f:
            return r3
        L20:
            byte[] r3 = r6.INotificationSideChannelStub
            int r4 = r6.IconCompatParcelizer
            int r5 = r2 + 1
            r6.f958a = r5
            int r4 = r4 + r2
            r2 = r3[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 89
            int r3 = r1 % 128
            defpackage.getNumberOfTargets.onProgressUpdate = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L37
            return r2
        L37:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumberOfTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault2():int");
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onProgressUpdate;
        int i5 = i4 + 97;
        MediaBrowserCompatCustomActionCallback = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = this.f958a;
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i6 < i7) {
            int iMin = Math.min(i7 - i6, i2);
            System.arraycopy(this.INotificationSideChannelStub, this.IconCompatParcelizer + this.f958a, bArr, i, iMin);
            this.f958a += iMin;
            return iMin;
        }
        int i8 = i4 + 67;
        MediaBrowserCompatCustomActionCallback = i8 % 128;
        int i9 = i8 % 2;
        return -1;
    }

    private int TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        int i2 = onProgressUpdate + 93;
        MediaBrowserCompatCustomActionCallback = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.notify = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = 0;
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 > 0) {
            while (true) {
                try {
                    int i5 = this.notify;
                    if (i4 >= i5 || (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.onTransact, i4, i5 - i4)) == -1) {
                        break;
                    }
                    i4 += iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (i4 < this.notify) {
                this.asBinder = 1;
            }
        }
        int i6 = onProgressUpdate + 79;
        MediaBrowserCompatCustomActionCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    private int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionCallback + 125;
        onProgressUpdate = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i * 3;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        try {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, 0, i5);
        } catch (Exception e2) {
            e2.printStackTrace();
            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 < i5) {
            int i7 = MediaBrowserCompatCustomActionCallback + 5;
            onProgressUpdate = i7 % 128;
            if (i7 % 2 == 0) {
                this.asBinder = 1;
                return null;
            }
            this.asBinder = 1;
            return null;
        }
        int[] iArr = new int[256];
        int i8 = 0;
        while (i8 < i) {
            int i9 = onProgressUpdate + 69;
            MediaBrowserCompatCustomActionCallback = i9 % 128;
            int i10 = i9 % 2;
            byte b = bArr[i6];
            byte b2 = bArr[i6 + 1];
            int i11 = i6 + 3;
            iArr[i8] = (bArr[i6 + 2] & UByte.MAX_VALUE) | ((b & UByte.MAX_VALUE) << 16) | ViewCompat.MEASURED_STATE_MASK | ((b2 & UByte.MAX_VALUE) << 8);
            i8++;
            i6 = i11;
        }
        return iArr;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionCallback + 35;
        onProgressUpdate = i2 % 128;
        int i3 = i2 % 2;
        boolean z = false;
        String string = "";
        for (int i4 = 0; i4 < 6; i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append((char) TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            string = sb.toString();
        }
        if (!string.startsWith("GIF")) {
            this.asBinder = 1;
            return;
        }
        this.d = TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 128) != 0) {
            int i5 = MediaBrowserCompatCustomActionCallback + 49;
            onProgressUpdate = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            int i7 = onProgressUpdate + 81;
            MediaBrowserCompatCustomActionCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        this.RemoteActionCompatParcelizer = z;
        this.INotificationSideChannelStubProxy = 2 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 7);
        this.cancel = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.MediaBrowserCompatCallbackHandler = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (this.RemoteActionCompatParcelizer) {
            if (this.asBinder == 0) {
                int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.INotificationSideChannelStubProxy);
                this.b = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.g = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[this.cancel];
            } else {
                int i9 = onProgressUpdate + 125;
                MediaBrowserCompatCustomActionCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 4 % 2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0744  */
    /* JADX WARN: Code duplicated, block: B:139:0x0746  */
    /* JADX WARN: Code duplicated, block: B:177:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:178:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:180:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:182:0x07ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:185:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:186:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:187:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:189:0x07fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v165, types: [short] */
    /* JADX WARN: Type inference failed for: r0v167 */
    private getPrimarySurfaceEdge a() throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i;
        boolean z;
        int i2;
        int i3;
        short s;
        int i4 = 2 % 2;
        this.write = TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8);
        this.getNotifyChildrenChangedOptions = TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8);
        this.read = TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8);
        this.connect = TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i5 = 0;
        boolean z2 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 128) != 0;
        this.getExtras = z2;
        boolean z3 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 64) != 0;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2266;
            int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b = bArr[40];
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, i6, touchSlop, -887667012, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{58134, 16437, 21767, 58231, 41846, 19, 54771, 25564, 57945, 308, 54483, 25248, 57657, 718, 55289, 24637, 57359, 1006, 54915, 26411, 59387, 1214, 53371, 26177, 59093, 1462}, ViewConfiguration.getEdgeSlop() >> 16, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{61335, 2966, 37922, 61426, 51313, 19378, 5331, 2265, 61124, 19099, 5622, 2523, 60850, 18815, 5790, 2845, 60574, 18515, 6071}, KeyEvent.normalizeMetaState(0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c4 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iResolveSize = 2267 - View.resolveSize(0, 0);
            int i7 = 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            byte b4 = bArr2[7];
            Object[] objArr6 = new Object[1];
            c(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, iResolveSize, i7, -874156483, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int i8 = 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr7 = new Object[1];
                c(b5, bArr3[5], b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, i8, doubleTapTimeout, -654680577, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i9 = ((int[]) objArr8[0])[0];
            int i10 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i11 = 1675184891 + ((810812332 | iElapsedRealtime) * 376) + (((~((~iElapsedRealtime) | 896352345)) | 1049508) * (-376)) + (((~(iElapsedRealtime | (-896352346))) | (-87639030)) * 376) + 1348331481;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
            c = 3;
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{20168, 53217, 15338, 20137, 41162, 36807, 47902, 24672, 20359, 36576, 47678, 24860, 19689, 36121, 47434, 25596, 19945, 35882, 47214, 25755, 19006, 35648, 48782, 26091, 19260, 35425, 48552, 26327, 18537, 34957}, (-1) - TextUtils.lastIndexOf("", '0'), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{41654, 24809, 50145, 41685, 7741, 8404, 17155, 56983, 41971, 8687, 16933, 57220, 41094, 8721, 16733, 56652, 41397, 8992, 16485, 55916, 42585, 9295}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i14 = MediaBrowserCompatCustomActionCallback + 81;
                onProgressUpdate = i14 % 128;
                int i15 = i14 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            e(new char[]{59794, 47688, 34685, 59896, 10230, 64097, 1947, 59215, 59548, 64332, 1708, 58976, 60341, 63726, 1534, 58519, 60033, 63892, 1256, 58275}, View.MeasureSpec.getSize(0), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            e(new char[]{52968, 48412, 5494, 52865, 39278, 64816, 38275, 23000, 53180, 64541, 38066, 22767, 52448, 65525, 38869, 23070, 52683, 65243, 38626, 23859}, View.MeasureSpec.getMode(0), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, 1348331481};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[40];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                f(b6, b7, b7, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b8 = bArr4[46];
                byte b9 = b8;
                Object[] objArr15 = new Object[1];
                f(b8, b9, b9, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2267;
                        int longPressTimeout = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        c(b10, bArr5[5], b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, maximumDrawingCacheSize, longPressTimeout, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{58134, 16437, 21767, 58231, 41846, 19, 54771, 25564, 57945, 308, 54483, 25248, 57657, 718, 55289, 24637, 57359, 1006, 54915, 26411, 59387, 1214, 53371, 26177, 59093, 1462}, Gravity.getAbsoluteGravity(0, 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{61335, 2966, 37922, 61426, 51313, 19378, 5331, 2265, 61124, 19099, 5622, 2523, 60850, 18815, 5790, 2845, 60574, 18515, 6071}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
                            int mode = View.MeasureSpec.getMode(0) + 33;
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            byte b12 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            c(b11, b12, b12, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, doubleTapTimeout2, mode, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2267;
                            int i16 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            byte[] bArr7 = $$a;
                            byte b13 = bArr7[40];
                            byte b14 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            c(b13, b14, b14, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, minimumFlingVelocity, i16, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[c])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = MediaBrowserCompatCustomActionCallback + 51;
            onProgressUpdate = i19 % 128;
            int i20 = i19 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i24 = ~startUptimeMillis;
            int i25 = i21 + (-1508809689) + (((~(startUptimeMillis | 105590849)) | (~((-4718593) | i24)) | (-803994724)) * (-68)) + ((~((-698403875) | i24)) * (-68)) + (((~((-105590850) | i24)) | (-703122467)) * 68);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr21[2])[0] = i27 ^ (i27 << 5);
            objArr2 = objArr21;
            c2 = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    int i28 = MediaBrowserCompatCustomActionCallback + 39;
                    onProgressUpdate = i28 % 128;
                    int i29 = i28 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i18];
            int i30 = i18 - 1;
            iArr[i30] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i30) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i31 = ((int[]) objArr[2])[0];
            int i32 = ((int[]) objArr[0])[0];
            int i33 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i34 = ~iElapsedRealtime2;
            int i35 = i31 + (-560742069) + (((~((-717149098) | i34)) | 713741057) * 98) + (((~(i34 | (-91564219))) | (-717149098) | (~(91564218 | iElapsedRealtime2))) * (-49)) + (((~(iElapsedRealtime2 | (-717149098))) | (-805305276)) * 49);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            c2 = 2;
            ((int[]) objArr2[2])[0] = i37 ^ (i37 << 5);
        }
        this.MediaBrowserCompat = z3;
        int i38 = ((int[]) objArr2[c2])[0];
        int i39 = i38 * i38;
        int i40 = -(1045937491 * i38);
        int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
        int i42 = -(i38 * 1249590083);
        int i43 = (((i41 | i42) << 1) - (i42 ^ i41)) - (-165592569);
        int i44 = i43 >> 28;
        int i45 = (((i44 | (-31)) << 1) - (i44 ^ (-31))) / 16;
        int i46 = (i45 ^ 1) + ((i45 & 1) << 1);
        int i47 = ((i43 | i46) << 1) - (i46 ^ i43);
        int i48 = i43 >> 19;
        int i49 = ((i48 ^ (-16383)) + ((i48 & (-16383)) << 1)) / 8192;
        int i50 = -(((i49 ^ 1) + ((i49 & 1) << 1)) ^ i47);
        int i51 = (i50 ^ 3) + ((i50 & 3) << 1);
        int i52 = i51 >> 19;
        int i53 = (((i52 & (-16383)) + (i52 | (-16383))) / 8192) - (-1);
        int i54 = (10842 / (((-(((i53 | 1) << 1) - (i53 ^ 1))) & i51) * 1807)) << (7 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.disconnect = i54;
        if (z2) {
            int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i54);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.asInterface = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        } else {
            this.asInterface = this.b;
            if (this.cancel == this.MediaBrowserCompatConnectionCallback) {
                this.g = 0;
            }
        }
        if (this.asInterface == null) {
            this.asBinder = 1;
        }
        if (this.asBinder != 0) {
            int i55 = onProgressUpdate + 73;
            MediaBrowserCompatCustomActionCallback = i55 % 128;
            int i56 = i55 % 2;
            return null;
        }
        int i57 = this.read * this.connect;
        byte[] bArr8 = this.subscribe;
        if (bArr8 == null || bArr8.length < i57) {
            this.subscribe = new byte[i57];
        }
        if (this.unsubscribe == null) {
            this.unsubscribe = new short[4096];
        }
        if (this.setInternalConnectionCallback == null) {
            this.setInternalConnectionCallback = new byte[4096];
        }
        if (this.handleMessage == null) {
            int i58 = MediaBrowserCompatCustomActionCallback + 21;
            onProgressUpdate = i58 % 128;
            int i59 = i58 % 2;
            this.handleMessage = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i60 = 1 << iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i61 = i60 + 2;
        int i62 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        int i63 = (1 << i62) - 1;
        for (int i64 = 0; i64 < i60; i64++) {
            this.unsubscribe[i64] = 0;
            this.setInternalConnectionCallback[i64] = (byte) i64;
        }
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int iTuitionPaymentFragmentbindingInflater1 = 0;
        int i71 = 0;
        loop1: while (true) {
            int i72 = -1;
            while (true) {
                if (i68 >= i57) {
                    break loop1;
                }
                if (i69 != 0) {
                    i2 = i57;
                    i3 = i62;
                } else if (i5 >= i65) {
                    int i73 = i70 & i63;
                    i70 >>= i65;
                    i5 -= i65;
                    if (i73 > i61) {
                        break loop1;
                    }
                    i2 = i57;
                    if (i73 == i60 + 1) {
                        break loop1;
                    }
                    if (i73 == i60) {
                        break;
                    }
                    if (i72 == -1) {
                        this.handleMessage[i69] = this.setInternalConnectionCallback[i73];
                        i69++;
                        i66 = i73;
                        i72 = i66;
                        i57 = i2;
                    } else {
                        if (i73 == i61) {
                            this.handleMessage[i69] = (byte) i66;
                            s = i72;
                            i69++;
                        } else {
                            s = i73;
                        }
                        while (s > i60) {
                            this.handleMessage[i69] = this.setInternalConnectionCallback[s];
                            s = this.unsubscribe[s];
                            i69++;
                            i62 = i62;
                        }
                        i3 = i62;
                        byte[] bArr9 = this.setInternalConnectionCallback;
                        int i74 = bArr9[s] & UByte.MAX_VALUE;
                        if (i61 >= 4096) {
                            int i75 = onProgressUpdate + 105;
                            MediaBrowserCompatCustomActionCallback = i75 % 128;
                            int i76 = i75 % 2;
                            break loop1;
                        }
                        byte b15 = (byte) i74;
                        this.handleMessage[i69] = b15;
                        this.unsubscribe[i61] = (short) i72;
                        bArr9[i61] = b15;
                        i61++;
                        if ((i61 & i63) == 0 && i61 < 4096) {
                            i65++;
                            i63 += i61;
                        }
                        i69++;
                        i66 = i74;
                        i72 = i73;
                    }
                } else {
                    if (iTuitionPaymentFragmentbindingInflater1 == 0) {
                        iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
                        if (iTuitionPaymentFragmentbindingInflater1 <= 0) {
                            break loop1;
                        }
                        i71 = 0;
                    }
                    i70 += (this.onTransact[i71] & UByte.MAX_VALUE) << i5;
                    i5 += 8;
                    i71++;
                    iTuitionPaymentFragmentbindingInflater1--;
                }
                i69--;
                this.subscribe[i67] = this.handleMessage[i69];
                i68++;
                i67++;
                i57 = i2;
                i60 = i60;
                i62 = i3;
            }
            i65 = i62;
            i57 = i2;
        }
        this.setCallbacksMessenger = i67;
        do {
            TuitionPaymentFragmentbindingInflater1();
            if (this.notify <= 0) {
                break;
            }
            int i77 = MediaBrowserCompatCustomActionCallback + 107;
            onProgressUpdate = i77 % 128;
            if (i77 % 2 == 0) {
                int i78 = 7 / 0;
                if (this.asBinder != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.asBinder != 0) {
                z = true;
            } else {
                z = false;
            }
        } while (!z);
        if (this.asBinder != 0) {
            return null;
        }
        this.INotificationSideChannel++;
        int i79 = this.getItem;
        if (i79 == 2) {
            int i80 = MediaBrowserCompatCustomActionCallback + 59;
            onProgressUpdate = i80 % 128;
            int i81 = i80 % 2;
            if (this.getInterfaceDescriptor == null) {
                this.getInterfaceDescriptor = new int[this.d * this.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            }
            Arrays.fill(this.getInterfaceDescriptor, !this.onConnectionSuspended ? this.getRoot : 0);
        } else {
            int[] iArr2 = this.getInterfaceDescriptor;
            if (iArr2 == null) {
                int[] iArr3 = new int[this.d * this.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                this.getInterfaceDescriptor = iArr3;
                getPrimarySurfaceEdge getprimarysurfaceedge = this.onConnected;
                if (getprimarysurfaceedge != null) {
                    Bitmap bitmap = getprimarysurfaceedge.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int[] iArr4 = this.getInterfaceDescriptor;
                    int i82 = this.d;
                    bitmap.getPixels(iArr4, 0, i82, 0, 0, i82, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    Arrays.fill(iArr3, 0);
                }
            } else if (i79 == 3) {
                getPrimarySurfaceEdge getprimarysurfaceedge2 = this.onConnected;
                if (getprimarysurfaceedge2 != null) {
                    Bitmap bitmap2 = getprimarysurfaceedge2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int[] iArr5 = this.getInterfaceDescriptor;
                    int i83 = this.d;
                    bitmap2.getPixels(iArr5, 0, i83, 0, 0, i83, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    Arrays.fill(iArr2, 0);
                }
            }
        }
        int i84 = 0;
        int i85 = 8;
        int i86 = 1;
        int i87 = 0;
        while (true) {
            int i88 = this.connect;
            if (i84 >= i88) {
                break;
            }
            int i89 = onProgressUpdate + 101;
            MediaBrowserCompatCustomActionCallback = i89 % 128;
            if (i89 % 2 != 0) {
                int i90 = 13 / 0;
                if (this.MediaBrowserCompat) {
                    if (i87 < i88) {
                        i86++;
                        if (i86 != 2) {
                            i87 = 4;
                        } else if (i86 != 3) {
                            i85 = 4;
                            i87 = 2;
                        } else if (i86 == 4) {
                            i85 = 2;
                            i87 = 1;
                        }
                    }
                    i = i87 + i85;
                } else {
                    i = i87;
                    i87 = i84;
                }
            } else if (this.MediaBrowserCompat) {
                if (i87 < i88) {
                    i86++;
                    if (i86 != 2) {
                        i87 = 4;
                    } else if (i86 != 3) {
                        i85 = 4;
                        i87 = 2;
                    } else if (i86 == 4) {
                        i85 = 2;
                        i87 = 1;
                    }
                }
                i = i87 + i85;
            } else {
                i = i87;
                i87 = i84;
            }
            int i91 = i87 + this.getNotifyChildrenChangedOptions;
            if (i91 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                int i92 = this.d;
                int i93 = i91 * i92;
                int i94 = this.write + i93;
                int i95 = this.read;
                int i96 = i94 + i95;
                int i97 = i93 + i92;
                if (i97 < i96) {
                    i96 = i97;
                }
                for (int i98 = i95 * i84; i94 < i96 && i98 < this.setCallbacksMessenger; i98++) {
                    int i99 = this.subscribe[i98] & UByte.MAX_VALUE;
                    if (!this.onConnectionSuspended || i99 != this.MediaBrowserCompatConnectionCallback) {
                        this.getInterfaceDescriptor[i94] = this.asInterface[i99];
                    }
                    i94++;
                }
            }
            i84++;
            i87 = i;
        }
        getPrimarySurfaceEdge getprimarysurfaceedge3 = new getPrimarySurfaceEdge(Bitmap.createBitmap(this.getInterfaceDescriptor, this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Bitmap.Config.ARGB_4444), this.cancelAll);
        int i100 = this.INotificationSideChannelDefault;
        if (i100 != 0) {
            int i101 = MediaBrowserCompatCustomActionCallback + 51;
            onProgressUpdate = i101 % 128;
            if (i101 % 2 != 0 ? i100 == 1 : i100 == 1) {
                this.onConnected = getprimarysurfaceedge3;
            } else if (i100 == 2) {
                this.onConnected = null;
            }
        } else {
            this.onConnected = getprimarysurfaceedge3;
        }
        this.getItem = this.INotificationSideChannelDefault;
        this.getServiceComponent = this.write;
        this.search = this.getNotifyChildrenChangedOptions;
        this.sendCustomAction = this.read;
        this.isConnected = this.connect;
        this.getRoot = this.g;
        this.INotificationSideChannelDefault = 0;
        this.onConnectionSuspended = false;
        this.cancelAll = 0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        this.setCallbacksMessenger = Integer.MAX_VALUE;
        return getprimarysurfaceedge3;
    }

    public final getPrimarySurfaceEdge b() {
        synchronized (this) {
            while (true) {
                int i = this.asBinder;
                if (i != 0 || i != 0) {
                    break;
                    break;
                }
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 33) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 249) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 255) {
                                TuitionPaymentFragmentbindingInflater1();
                                String string = "";
                                for (int i2 = 0; i2 < 11; i2++) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append((char) this.onTransact[i2]);
                                    string = sb.toString();
                                }
                                if (string.equals("NETSCAPE2.0")) {
                                    do {
                                        TuitionPaymentFragmentbindingInflater1();
                                        byte[] bArr = this.onTransact;
                                        if (bArr[0] == 1) {
                                            this.getSessionToken = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
                                        }
                                        if (this.notify <= 0) {
                                            break;
                                        }
                                    } while (this.asBinder == 0);
                                } else {
                                    do {
                                        TuitionPaymentFragmentbindingInflater1();
                                        if (this.notify <= 0) {
                                            break;
                                        }
                                    } while (this.asBinder == 0);
                                }
                            } else {
                                do {
                                    TuitionPaymentFragmentbindingInflater1();
                                    if (this.notify <= 0) {
                                        break;
                                    }
                                } while (this.asBinder == 0);
                            }
                        } else {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i3 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 28) >> 2;
                            this.INotificationSideChannelDefault = i3;
                            if (i3 == 0) {
                                this.INotificationSideChannelDefault = 1;
                            }
                            this.onConnectionSuspended = (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & 1) != 0;
                            this.cancelAll = (TuitionPaymentFragmentspecialinlinedviewModeldefault2() | (TuitionPaymentFragmentspecialinlinedviewModeldefault2() << 8)) * 10;
                            this.MediaBrowserCompatConnectionCallback = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                    } else {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 44) {
                            getPrimarySurfaceEdge getprimarysurfaceedgeA = a();
                            this.TuitionPaymentFragmentbindingInflater1 = getprimarysurfaceedgeA;
                            return getprimarysurfaceedgeA;
                        }
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 59) {
                            this.asBinder = -1;
                            return null;
                        }
                        this.asBinder = 1;
                    }
                }
            }
            this.asBinder = 1;
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, byte r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 107 - r7
            int r9 = r9 * 2
            int r9 = r9 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = defpackage.getNumberOfTargets.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getNumberOfTargets.$$g(short, byte, int):java.lang.String");
    }
}
