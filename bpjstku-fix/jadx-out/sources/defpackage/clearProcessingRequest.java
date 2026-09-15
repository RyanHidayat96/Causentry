package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.esafirm.imagepicker.features.ImagePickerConfig;
import com.esafirm.imagepicker.features.ReturnMode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class clearProcessingRequest {
    public createProcessingRequest TuitionPaymentFragmentbindingInflater1;
    public ImagePipeline TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ImagePickerConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lambdasendError7 f358a;
    private int asBinder;
    public final RecyclerView asInterface;
    Parcelable b;
    public int d;
    public GridLayoutManager g;
    private static final byte[] $$c = {39, 27, 2, 54};
    private static final int $$f = 36;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, 70, 6, -35, -23, -9, 52, -68, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -68, -17, -17, 58, -64, -20, -14, -17, 6, -20, -3, -25, -11, 7, -17, -13, -16, -4, 46, -38, -15, -35, -25, -11, 3, -20, -4, -9, -24, 36, -55, -9, -14, 4, -30, 69, -55, -45, -8, -20, -12, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 116;
    private static final byte[] $$a = {1, 115, -83, 116, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 66;
    private static int INotificationSideChannel = 0;
    private static int cancel = 1;
    private static long cancelAll = -6377398940819159759L;
    private static int notify = -981105359;
    private static char onTransact = 1739;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r7 = 13 - r7
            int r8 = r8 * 3
            int r8 = 100 - r8
            byte[] r0 = defpackage.clearProcessingRequest.$$a
            int r1 = 11 - r6
            byte[] r1 = new byte[r1]
            int r6 = 10 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clearProcessingRequest.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r9 = r9 * 59
            int r9 = 63 - r9
            int r7 = r7 * 7
            int r7 = r7 + 53
            byte[] r0 = defpackage.clearProcessingRequest.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            int r8 = r8 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clearProcessingRequest.f(byte, byte, short, java.lang.Object[]):void");
    }

    public clearProcessingRequest(RecyclerView recyclerView, ImagePickerConfig imagePickerConfig, int i) {
        this.asInterface = recyclerView;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imagePickerConfig;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = recyclerView.getContext();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = 5;
        if (i == 1) {
            int i6 = INotificationSideChannel + 5;
            cancel = i6 % 128;
            if (i6 % 2 != 0) {
                i5 = 3;
            }
        }
        this.d = i5;
        if (i == 1) {
            int i7 = INotificationSideChannel + 77;
            cancel = i7 % 128;
            int i8 = i7 % 2;
            i2 = 2;
        } else {
            i2 = 4;
        }
        this.asBinder = i2;
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
            i3 = this.d;
        } else if (this.asInterface.getAdapter() == null || (this.asInterface.getAdapter() instanceof createProcessingRequest)) {
            int i9 = INotificationSideChannel + 101;
            int i10 = i9 % 128;
            cancel = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 63;
            INotificationSideChannel = i12 % 128;
            int i13 = i12 % 2;
            i3 = this.asBinder;
        } else {
            int i14 = cancel + 123;
            INotificationSideChannel = i14 % 128;
            int i15 = i14 % 2;
            i3 = this.d;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i3);
        this.g = gridLayoutManager;
        this.asInterface.setLayoutManager(gridLayoutManager);
        this.asInterface.setHasFixedSize(true);
        TuitionPaymentFragmentbindingInflater1(i3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(int i) {
        int i2 = 2 % 2;
        int i3 = cancel;
        int i4 = i3 + 107;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        lambdasendError7 lambdasenderror7 = this.f358a;
        if (lambdasenderror7 != null) {
            int i6 = i3 + 123;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            this.asInterface.removeItemDecoration(lambdasenderror7);
        }
        lambdasendError7 lambdasenderror8 = new lambdasendError7(i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getResources().getDimensionPixelSize(R.dimen.ef_item_padding));
        this.f358a = lambdasenderror8;
        this.asInterface.addItemDecoration(lambdasenderror8);
        this.g.setSpanCount(i);
        int i8 = cancel + 99;
        INotificationSideChannel = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1235 - Drawable.resolveOpacity(0, 0), Color.blue(0) + 35, -653973969, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int doubleTapTimeout = 2764 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int defaultSize = 14 - View.getDefaultSize(0, 0);
                    byte b3 = $$c[2];
                    byte b4 = (byte) (b3 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, doubleTapTimeout, defaultSize, 1504416861, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43325), 252 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - (ViewConfiguration.getTouchSlop() >> 8), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (65199 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int mirror = 2939 - AndroidCharacter.getMirror('0');
                    int iGreen = Color.green(0) + 17;
                    byte b5 = (byte) ($$c[2] - 1);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, mirror, iGreen, 2012627446, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (cancelAll ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) notify) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) onTransact) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $11 + 59;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        boolean z;
        int i = 2 % 2;
        int i2 = cancel + 19;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.asInterface.getAdapter();
            throw null;
        }
        if (this.asInterface.getAdapter() == null || (this.asInterface.getAdapter() instanceof createProcessingRequest)) {
            Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            return (str == null || str.length() == 0) ? context.getString(R.string.ef_title_folder) : str;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel == 1) {
            Context context2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
            return (str2 == null || str2.length() == 0) ? context2.getString(R.string.ef_title_select_image) : str2;
        }
        int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
        if (str3 != null) {
            int i3 = INotificationSideChannel + 81;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            if (str3.length() != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        if (!(!z) || size != 0) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d == 999) {
                return String.format(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.ef_selected), Integer.valueOf(size));
            }
            return String.format(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.ef_selected_with_limit), Integer.valueOf(size), Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d));
        }
        Context context3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
        if (str4 != null && str4.length() != 0) {
            int i5 = INotificationSideChannel + 31;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            return str4;
        }
        int i7 = cancel + 21;
        INotificationSideChannel = i7 % 128;
        if (i7 % 2 == 0) {
            return context3.getString(R.string.ef_title_select_image);
        }
        context3.getString(R.string.ef_title_select_image);
        obj.hashCode();
        throw null;
    }

    public final void b(List<lambdaprocessInputPacket5> list) {
        int i = 2 % 2;
        createProcessingRequest createprocessingrequest = this.TuitionPaymentFragmentbindingInflater1;
        if (list != null) {
            int i2 = INotificationSideChannel + 79;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            createprocessingrequest.b.clear();
            createprocessingrequest.b.addAll(list);
        }
        createprocessingrequest.notifyDataSetChanged();
        TuitionPaymentFragmentbindingInflater1(this.asBinder);
        this.asInterface.setAdapter(this.TuitionPaymentFragmentbindingInflater1);
        if (this.b != null) {
            int i4 = cancel + 57;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 == 0) {
                this.g.setSpanCount(this.asBinder);
                this.asInterface.getLayoutManager().onRestoreInstanceState(this.b);
            } else {
                this.g.setSpanCount(this.asBinder);
                this.asInterface.getLayoutManager().onRestoreInstanceState(this.b);
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v53, types: [boolean, int] */
    public final boolean b() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 123;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iMyTid = (Process.myTid() >> 22) + 876;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
            byte[] bArr = $$a;
            byte b = bArr[11];
            byte b2 = bArr[0];
            Object[] objArr3 = new Object[1];
            c(b, b2, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyTid, iLastIndexOf, -1199417970, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{154, 14350, 62136, 46742}, (char) (ImageFormat.getBitsPerPixel(0) + 1), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), new char[]{24995, 2035, 37396, 56948, 56508, 36653, 38480, 41365, 15294, 31649, 25879, 28100, 38574, 48793, 25132, 22882, 11251, 59946, 50672, 25275, 202, 13531}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{29631, 2663, 58233, 61844}, (char) (38116 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 2030724979 - View.resolveSizeAndState(0, 0, 0), new char[]{10595, 30264, 29940, 30431, 29618, 32425, 2326, 1113, 1990, 11539, 13984, 44628, 2019, 46184, 64237}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int i4 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int iBlue = Color.blue(0) + 10;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[8];
            byte b4 = bArr2[11];
            Object[] objArr6 = new Object[1];
            c(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, i4, iBlue, 254769921, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int iArgb = 876 - Color.argb(0, 0, 0, 0);
                int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                c((byte) 3, bArr3[11], bArr3[0], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iArgb, iIndexOf, 1324201839, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ((~((~iIdentityHashCode) | 736886783)) * 130) + 1003982032 + (((~(iIdentityHashCode | 736886783)) | 696435714) * 130) + 792551258;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{29273, 25436, 3643, 13980}, (char) (39950 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{60015, 26494, 46366, 45347, 51058, 9267, Typography.doublePrime, 22147, 44375, 65277, 7231, 50719, 13653, 47154, 19291, 28777}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{12201, 11412, 7237, 25727}, (char) (32541 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{26467, 4123, 45937, 21048, 33863, 32687, 15669, 38029, 8528, 8462, 35645, 25588, 38954, 8468, 28376, 44281}, objArr10);
            try {
                Object[] objArr11 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 792551258};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[64];
                byte b6 = b5;
                Object[] objArr12 = new Object[1];
                f(b5, b6, b6, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b7 = bArr4[66];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                f(b7, b8, b8, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 877;
                    int mirror = AndroidCharacter.getMirror('0') - '&';
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    c((byte) 3, bArr5[11], bArr5[0], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iLastIndexOf2, mirror, 1324201839, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{154, 14350, 62136, 46742}, (char) KeyEvent.normalizeMetaState(0), Process.myTid() >> 22, new char[]{24995, 2035, 37396, 56948, 56508, 36653, 38480, 41365, 15294, 31649, 25879, 28100, 38574, 48793, 25132, 22882, 11251, 59946, 50672, 25275, 202, 13531}, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{29631, 2663, 58233, 61844}, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38115), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2030724978, new char[]{10595, 30264, 29940, 30431, 29618, 32425, 2326, 1113, 1990, 11539, 13984, 44628, 2019, 46184, 64237}, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iBlue2 = 876 - Color.blue(0);
                        int iRed = Color.red(0) + 10;
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[8];
                        byte b10 = bArr6[11];
                        Object[] objArr18 = new Object[1];
                        c(b9, b10, b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, iBlue2, iRed, 254769921, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                        int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr7 = $$a;
                        byte b11 = bArr7[11];
                        byte b12 = bArr7[0];
                        Object[] objArr19 = new Object[1];
                        c(b11, b12, b12, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, packedPositionGroup, tapTimeout, -1199417970, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i8 = ((int[]) objArr[2])[0];
        int i9 = ((int[]) objArr[0])[0];
        if (i9 == i8) {
            int i10 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i11 = i10 + (-110414582) + (((~((~iIdentityHashCode2) | 95652967)) | 38564496) * 529) + (((~(iIdentityHashCode2 | 95652967)) | 55342738) * 529);
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr2[1])[0] = i13 ^ (i13 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    int i14 = INotificationSideChannel + 27;
                    cancel = i14 % 128;
                    int i15 = i14 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i9];
            int i16 = i9 - 1;
            iArr[i16] = 1;
            Toast.makeText((Context) null, iArr[((i9 * i16) % 2) - 1], 1).show();
            int i17 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i18 = ~iIdentityHashCode3;
            int i19 = i17 + 1249361524 + (((~((-595128080) | i18)) | 559940612) * 184) + ((iIdentityHashCode3 | (-670625776)) * (-184)) + ((~((-635438309) | i18)) * 184);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[1])[0] = i21 ^ (i21 << 5);
        }
        if (!(this.asInterface.getAdapter() == null || (this.asInterface.getAdapter() instanceof createProcessingRequest))) {
            int i22 = cancel + 115;
            INotificationSideChannel = i22 % 128;
            if (i22 % 2 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll != ReturnMode.ALL && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll != ReturnMode.GALLERY_ONLY) {
                int i23 = cancel + 89;
                int i24 = i23 % 128;
                INotificationSideChannel = i24;
                int i25 = i23 % 2;
                int i26 = ((int[]) objArr2[1])[0];
                int i27 = i26 * i26;
                int i28 = -(1770021160 * i26);
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                int i30 = -(i26 * (-1955553498));
                int i31 = (((i29 | i30) << 1) - (i30 ^ i29)) - 1867053583;
                int i32 = i31 >> 19;
                int i33 = (((i32 | (-16383)) << 1) - (i32 ^ (-16383))) / 8192;
                int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
                int i35 = ((i31 | i34) << 1) - (i34 ^ i31);
                int i36 = i31 >> 21;
                int i37 = ((i36 & (-4095)) + (i36 | (-4095))) / 2048;
                int i38 = (-(((i37 ^ 1) + ((i37 & 1) << 1)) ^ i35)) + 5;
                int i39 = i38 >> 19;
                int i40 = (((i39 | (-16383)) << 1) - (i39 ^ (-16383))) / 8192;
                ?? r2 = 3630 / ((i38 & (-(((i40 ^ 1) + ((i40 & 1) << 1)) + 1))) * 726);
                int i41 = i24 + 11;
                cancel = i41 % 128;
                int i42 = i41 % 2;
                return r2;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = defpackage.clearProcessingRequest.$$c
            int r7 = r7 + 4
            int r6 = r6 + 102
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clearProcessingRequest.$$g(byte, byte, short):java.lang.String");
    }
}
