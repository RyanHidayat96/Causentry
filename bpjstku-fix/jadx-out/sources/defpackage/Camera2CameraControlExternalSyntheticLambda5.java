package defpackage;

import android.R;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bpjstku.di.ApiModuleKt;
import com.bpjstku.util.utils.CommonUtilsKt$compressImageFile$1;
import com.bpjstku.util.utils.CommonUtilsKt$compressImageNotCrop$1;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.internal.bind.TypeAdapters;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import com.yalantis.ucrop.UCrop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraControlExternalSyntheticLambda5 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ActionMode.Callback {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {83, -44, 103, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 59;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int b = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = -7925699903101832850L;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r0 = 53 - r7
                byte[] r1 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r8 = r8 * 14
                int r8 = r8 + 84
                int r6 = 144 - r6
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2e
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(short, short, int, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.argb(0, 0, 0, 0)), 2624 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 39423), (ViewConfiguration.getEdgeSlop() >> 16) + 481, TextUtils.lastIndexOf("", '0', 0, 0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i4 = $10 + 69;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $11 + 17;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, View.combineMeasuredStates(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            b = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(menu, "");
            menu.removeItem(R.id.copy);
            menu.removeItem(R.id.paste);
            menu.removeItem(R.id.cut);
            menu.removeItem(R.id.selectAll);
            menu.removeItem(R.id.selectTextMode);
            menu.removeItem(R.id.shareText);
            menu.removeItem(R.id.undo);
            if (Build.VERSION.SDK_INT >= 26) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                b = i4 % 128;
                int i5 = i4 % 2;
                menu.removeItem(R.id.autofill);
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                b = i6 % 128;
                int i7 = i6 % 2;
            }
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
            b = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int i = 2 % 2;
            int i2 = b + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(menuItem, "");
            int i4 = b + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            int i = 2 % 2;
            int i2 = b + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            int i = 2 % 2;
            int i2 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(menu, "");
            return i3 != 0;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0688 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:101:0x0689  */
        /* JADX WARN: Code duplicated, block: B:103:0x068e  */
        /* JADX WARN: Code duplicated, block: B:118:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:32:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:34:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:36:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:39:0x0218  */
        /* JADX WARN: Code duplicated, block: B:41:0x021e  */
        /* JADX WARN: Code duplicated, block: B:50:0x0284  */
        /* JADX WARN: Code duplicated, block: B:52:0x0293  */
        /* JADX WARN: Code duplicated, block: B:55:0x02ac A[Catch: Exception -> 0x0537, TRY_LEAVE, TryCatch #3 {Exception -> 0x0537, blocks: (B:47:0x027e, B:53:0x0295, B:54:0x02a9, B:55:0x02ac), top: B:118:0x027e }] */
        /* JADX WARN: Code duplicated, block: B:59:0x02d3 A[Catch: all -> 0x03b4, TryCatch #1 {all -> 0x03b4, blocks: (B:57:0x02c6, B:59:0x02d3, B:60:0x0311), top: B:115:0x02c6, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x03bf A[Catch: Exception -> 0x0539, TRY_LEAVE, TryCatch #2 {Exception -> 0x0539, blocks: (B:64:0x03b7, B:66:0x03bd, B:67:0x03be, B:68:0x03bf, B:70:0x0422, B:74:0x0446, B:78:0x04af, B:83:0x050d, B:87:0x052f, B:89:0x0535, B:90:0x0536, B:75:0x0450, B:57:0x02c6, B:59:0x02d3, B:60:0x0311, B:79:0x04b8, B:81:0x04c5, B:82:0x0506), top: B:117:0x0282, inners: #1, #5 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0442  */
        /* JADX WARN: Code duplicated, block: B:75:0x0450 A[Catch: Exception -> 0x0539, TRY_LEAVE, TryCatch #2 {Exception -> 0x0539, blocks: (B:64:0x03b7, B:66:0x03bd, B:67:0x03be, B:68:0x03bf, B:70:0x0422, B:74:0x0446, B:78:0x04af, B:83:0x050d, B:87:0x052f, B:89:0x0535, B:90:0x0536, B:75:0x0450, B:57:0x02c6, B:59:0x02d3, B:60:0x0311, B:79:0x04b8, B:81:0x04c5, B:82:0x0506), top: B:117:0x0282, inners: #1, #5 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x04c5 A[Catch: all -> 0x052e, TryCatch #5 {all -> 0x052e, blocks: (B:79:0x04b8, B:81:0x04c5, B:82:0x0506), top: B:122:0x04b8, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0513  */
        /* JADX WARN: Code duplicated, block: B:92:0x0539 A[PHI: r22
  0x0539: PHI (r22v4 int) = (r22v3 int), (r22v6 int), (r22v7 int) binds: [B:91:0x0537, B:112:0x0539, B:84:0x0511] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:95:0x0553  */
        /* JADX WARN: Code duplicated, block: B:97:0x0584  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i6;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            String str;
            float minVolume;
            int i14;
            int i15;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i16;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i17;
            Object obj;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            Object[] objArr2;
            int i18;
            int i19 = 2 % 2;
            int i20 = b;
            int i21 = (i20 ^ 31) + ((i20 & 31) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i21 % 128;
            Object obj2 = null;
            if (i21 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (context != null) {
                int i22 = i20 + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i22 % 128;
                if (i22 % 2 != 0) {
                    throw null;
                }
                try {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{55316, 34570, 26163, 50484, 42078, 841, 57975, 16684, 8350, 36739, 28337, 52666, 44252, 3014, 60143, 18852, 10534, 34875, 30505, 54850, 46404, 5224, 62327}, MotionEvent.axisFromString("") + 24338, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{55314, 24227, 54631, 19501, 49865, 31098, 61483, 30457, 60814, 25695, 39679, 4525, 34942, 3852, 34294, 15462, 45859, 10745}, 34482 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
                    Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                    int i23 = -View.MeasureSpec.getSize(0);
                    int i24 = ((i23 | 739) << 1) - (i23 ^ 739);
                    Object[] objArr5 = new Object[1];
                    a(new char[]{55316, 56056, 56791, 53422, 54166, 54899, 51523, 52334, 53006, 49633, 50373, 51136, 64180, 64924, 61547, 62230, 63029, 59659, 60333, 61165, 57785, 58522, 59291, 39545, 40286, 36927, 37647, 38381, 35022, 35756, 36518, 33126, 33907, 34649}, i24, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    int i25 = -(ViewConfiguration.getEdgeSlop() >> 16);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                    b = i26 % 128;
                    int i27 = i26 % 2;
                    int i28 = ~i25;
                    int i29 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i30 = (((i25 * (-433)) - 8346024) - (~(-(-(((~(((-38640) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-38640) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2))) | (~((i28 ^ i29) | (i28 & i29)))) * 217))))) - 1;
                    int i31 = ~i25;
                    int i32 = ~((i31 ^ (-38640)) | ((-38640) & i31));
                    int i33 = ~((i31 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i31 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i34 = -(-(((i32 ^ i33) | (i33 & i32)) * 217));
                    int i35 = (i30 & i34) + (i34 | i30);
                    int i36 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i37 = ~((i36 & (-38640)) | ((-38640) ^ i36));
                    int i38 = i35 + (((i37 & i25) | (i25 ^ i37)) * 217);
                    Object[] objArr6 = new Object[1];
                    a(new char[]{55315, 20214, 62922, 7391, 33722}, i38, objArr6);
                    int i39 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                    int i40 = -i39;
                    int i41 = ((i39 & i40) | (i39 ^ i40)) >> 31;
                    int i42 = (~i41) & i;
                    int i43 = i41 & (i ^ 1);
                    i4 = (i43 & i42) | (i42 ^ i43);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char pressedStateDuration = (char) (16949 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int iMyTid = (Process.myTid() >> 22) + 2739;
                    int iLastIndexOf = 12 - TextUtils.lastIndexOf("", '0', 0);
                    byte b2 = $$a[7];
                    Object[] objArr7 = new Object[1];
                    c((short) 141, b2, b2, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(pressedStateDuration, iMyTid, iLastIndexOf, 1501733736, false, (String) objArr7[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (16949 - TextUtils.indexOf("", ""));
                    int i44 = 2740 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iRed = Color.red(0) + 13;
                    byte b3 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((short) 89, b3, b3, objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, i44, iRed, 47863026, false, (String) objArr8[0], null);
                }
                Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                int i45 = b + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
                int i46 = i45 % 2;
                boolean zContains = set.contains(obj3);
                if (i46 == 0) {
                    if (!zContains) {
                        i5 = b + 113;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                        if (i5 % 2 != 0) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') + 16901);
                                int doubleTapTimeout = 2739 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13;
                                Object[] objArr9 = new Object[1];
                                c((short) 37, (byte) 15, $$a[7], objArr9);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, doubleTapTimeout, keyRepeatTimeout, 631063962, false, (String) objArr9[0], null);
                            }
                            set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null));
                            obj2.hashCode();
                            throw null;
                        }
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 16950);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2739;
                            int i47 = 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            i6 = 631063962;
                            Object[] objArr10 = new Object[1];
                            c((short) 37, (byte) 15, $$a[7], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, packedPositionGroup, i47, 631063962, false, (String) objArr10[0], null);
                        }
                        if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null))) {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i48 = b;
                                i17 = (i48 & 125) + (i48 | 125);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    Object[] objArr11 = new Object[1];
                                    a(new char[]{55386, 45369, 2643, 58221, 31998, 54737, 44781, 14339, 37193, 27179, 50051, 23770, 13810, 36612, 6246, 61814, 19072, 9134, 48354, 5657, 61222, 30793, 53649, 43702, 968, 40282, 30253, 53061}, 29900 << MotionEvent.axisFromString(""), objArr11);
                                    obj = objArr11[0];
                                } else {
                                    int i49 = -(-MotionEvent.axisFromString(""));
                                    int i50 = (i49 & 26922) + (i49 | 26922);
                                    Object[] objArr12 = new Object[1];
                                    a(new char[]{55386, 45369, 2643, 58221, 31998, 54737, 44781, 14339, 37193, 27179, 50051, 23770, 13810, 36612, 6246, 61814, 19072, 9134, 48354, 5657, 61222, 30793, 53649, 43702, 968, 40282, 30253, 53061}, i50, objArr12);
                                    obj = objArr12[0];
                                }
                                Object[] objArr13 = {(String) obj};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int iAlpha = Color.alpha(0) + 993;
                                    int iMyPid = 8 - (Process.myPid() >> 22);
                                    byte[] bArr = $$a;
                                    short s = bArr[7];
                                    Object[] objArr14 = new Object[1];
                                    c(s, (byte) (s | 52), bArr[5], objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iAlpha, iMyPid, 410748506, false, (String) objArr14[0], new Class[]{String.class});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr13)).longValue();
                                long j = 1907719407;
                                long j2 = -751;
                                long j3 = -1;
                                long j4 = j ^ j3;
                                long j5 = jLongValue ^ j3;
                                i6 = i4;
                                long j6 = i;
                                long j7 = (j2 * j) + (j2 * jLongValue) + (((long) 1504) * (((j4 | j5) ^ j3) | ((j4 | j6) ^ j3)));
                                long j8 = j4 | jLongValue;
                                long j9 = j7 + (((long) (-1504)) * ((j6 | j8) ^ j3)) + (((long) 752) * ((j3 ^ (j5 | j)) | (j8 ^ j3))) + ((long) (-2108637644));
                                int i51 = ~((-604053825) | i);
                                int i52 = 780534154 + ((25199624 | i51) * (-476)) + (i51 * 952);
                                int i53 = ~i;
                                int i54 = i52 + ((~((-604053825) | i53)) * 476);
                                TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i55 = ((int) (j9 >> 32)) & i54;
                                int i56 = ((int) j9) & ((-1216677445) + ((1602874624 | i) * (-50)) + (((~((-1250536705) | i)) | (~((-4329558) | i53))) * 50) + (((~(i53 | 1602874624)) | (~((-1254866262) | i53)) | 4329557) * 50));
                                i7 = (i55 & i56) | (i55 ^ i56);
                                TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            } else {
                                i6 = i4;
                                char[] cArr = {55364};
                                int trimmedLength = TextUtils.getTrimmedLength("");
                                int i57 = trimmedLength * (-520);
                                int i58 = (i57 & 27332442) + (i57 | 27332442);
                                int i59 = ~trimmedLength;
                                int i60 = (i59 & 52361) | (i59 ^ 52361);
                                int i61 = -(-((~((i60 & i) | (i60 ^ i))) * 521));
                                int i62 = ((((i58 | i61) << 1) - (i61 ^ i58)) - (~(-(-((~(((-52362) & trimmedLength) | ((-52362) ^ trimmedLength))) * (-1042)))))) - 1;
                                int i63 = ~((-52362) | trimmedLength);
                                int i64 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i65 = ((i64 | 91) << 1) - (i64 ^ 91);
                                b = i65 % 128;
                                int i66 = i65 % 2;
                                int i67 = ~trimmedLength;
                                int i68 = ~i;
                                int i69 = (i67 & i68) | (i67 ^ i68);
                                Object[] objArr15 = new Object[1];
                                a(cArr, i62 + (521 * ((~((i69 & 52361) | (i69 ^ 52361))) | i63)), objArr15);
                                str = (String) objArr15[0];
                                char[] cArr2 = {55303, 22405, 51045, 30412, 58988, 5644, 34234, 13643, 42218, 54403, 17441, 62412, 25444};
                                minVolume = AudioTrack.getMinVolume();
                                i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                                b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    i15 = (minVolume > 1.0f ? 1 : (minVolume == 1.0f ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    i16 = ((-518) >>> i15) >>> (-1);
                                } else {
                                    i15 = (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1));
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i70 = i15 * (-518);
                                    i16 = (i70 | (-19045306)) + (i70 & (-19045306));
                                }
                                int i71 = ~i15;
                                int i72 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i71);
                                int i73 = i16 + (519 * ((i72 & 36767) | (i72 ^ 36767)));
                                int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                                int i75 = i74 % 128;
                                b = i75;
                                int i76 = i74 % 2;
                                int i77 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i78 = (i71 & i77) | (i71 ^ i77);
                                int i79 = ~((i78 & 36767) | (i78 ^ 36767));
                                int i80 = i15 | 36767;
                                int i81 = ~((i80 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i80 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                int i82 = -(-((-519) * ((i79 & i81) | (i79 ^ i81))));
                                int i83 = (i73 ^ i82) + ((i73 & i82) << 1);
                                int i84 = ((i75 | 81) << 1) - (i75 ^ 81);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i84 % 128;
                                int i85 = i84 % 2;
                                int i86 = i83 + (519 * (i15 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 36767) | (36767 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))));
                                Object[] objArr16 = new Object[1];
                                a(cArr2, i86, objArr16);
                                objArr = new Object[]{(String) objArr16[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cMakeMeasureSpec = (char) (33602 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3085;
                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 27;
                                    byte[] bArr2 = $$a;
                                    short s2 = bArr2[7];
                                    Object[] objArr17 = new Object[1];
                                    c(s2, (byte) (s2 | 52), bArr2[5], objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, tapTimeout, iLastIndexOf2, 1411172903, false, (String) objArr17[0], new Class[]{String.class});
                                }
                                if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr))) {
                                    int i87 = b;
                                    int i88 = (i87 & 87) + (i87 | 87);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i88 % 128;
                                    int i89 = i88 % 2;
                                    int i90 = ((i87 | 21) << 1) - (i87 ^ 21);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i90 % 128;
                                    int i91 = i90 % 2;
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                            }
                            i8 = (i & (-11)) | ((~i) & 10);
                            i9 = (i7 | (-i7)) >> 31;
                            i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i11 = (i10 & 57) + (i10 | 57);
                            b = i11 % 128;
                            if (i11 % 2 == 0) {
                                throw null;
                            }
                            int i92 = (~i9) & i;
                            int i93 = i9 & i8;
                            int i94 = i10 + 49;
                            int i95 = i94 % 128;
                            b = i95;
                            int i96 = i94 % 2;
                            int i97 = i2 & 32;
                            int i98 = i95 + 99;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i98 % 128;
                            int i99 = i98 % 2;
                            int i100 = (i97 | (-i97)) >> 31;
                            int i101 = ((i93 & i92) | (i92 ^ i93)) & (~i100);
                            i12 = (i95 & 81) + (i95 | 81);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                            int i102 = i & i100;
                            i13 = (i101 & i102) | (i101 ^ i102);
                            if (i12 % 2 != 0) {
                                int i103 = 37 / 0;
                            }
                        }
                    }
                    int i104 = (~(i & i6)) & (i | i6);
                    int i105 = -i104;
                    int i106 = ((i104 & i105) | (i104 ^ i105)) >> 31;
                    int i107 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                    int i108 = i107 % 128;
                    b = i108;
                    int i109 = i107 % 2;
                    int i110 = i13 & (~i106);
                    int i111 = i6 & i106;
                    int i112 = (i110 & i111) | (i110 ^ i111);
                    int i113 = i108 + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i113 % 128;
                    int i114 = i113 % 2;
                    int i115 = (~(i & i112)) & (i | i112);
                    int i116 = -i115;
                    int i117 = (((i115 & i116) | (i115 ^ i116)) >> 31) & 16;
                    objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i112}, null};
                    int i118 = (-454980592) + (((-489055489) | i) * (-627)) + (((~(490694484 | i)) | 531004713) * (-627)) + (((~((~i) | (-490694485))) | (~(i | 531004713))) * 627);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i119 = b + 93;
                    int i120 = i119 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i120;
                    int i121 = i119 % 2;
                    int i122 = (i117 * (-375)) + (i118 * (-375));
                    int i123 = ~i117;
                    int i124 = ~i118;
                    int i125 = ~((i124 & i123) | (i123 ^ i124));
                    int i126 = (i125 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ i125);
                    int i127 = ~(i117 | i118);
                    int i128 = ((i126 & i127) | (i126 ^ i127)) * 376;
                    int i129 = (i122 & i128) + (i122 | i128);
                    int i130 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i117);
                    int i131 = ~((i117 & i118) | (i117 ^ i118));
                    int i132 = -(-(((i130 & i131) | (i130 ^ i131)) * (-376)));
                    int i133 = (i129 & i132) + (i132 | i129);
                    int i134 = ((i120 | 117) << 1) - (i120 ^ 117);
                    int i135 = i134 % 128;
                    b = i135;
                    int i136 = i134 % 2;
                    int i137 = -(-(376 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i123) | (i123 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | i118)));
                    int i138 = (i3 - (~(-(-((i133 ^ i137) + ((i137 & i133) << 1)))))) - 1;
                    int i139 = i138 << 13;
                    int i140 = ((~i138) & i139) | ((~i139) & i138);
                    int i141 = i140 >>> 17;
                    int i142 = (i140 | i141) & (~(i140 & i141));
                    int i143 = i142 << 5;
                    ((int[]) objArr2[1])[0] = (i142 | i143) & (~(i142 & i143));
                    i18 = ((i135 | 71) << 1) - (i135 ^ 71);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    if (i18 % 2 == 0) {
                        return objArr2;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                int i144 = 91 / 0;
                if (!zContains) {
                    i5 = b + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char mirror2 = (char) (AndroidCharacter.getMirror('0') + 16901);
                            int doubleTapTimeout2 = 2739 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13;
                            Object[] objArr18 = new Object[1];
                            c((short) 37, (byte) 15, $$a[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror2, doubleTapTimeout2, keyRepeatTimeout2, 631063962, false, (String) objArr18[0], null);
                        }
                        set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null));
                        obj2.hashCode();
                        throw null;
                    }
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 16950);
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 2739;
                        int i410 = 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        i6 = 631063962;
                        Object[] objArr19 = new Object[1];
                        c((short) 37, (byte) 15, $$a[7], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, packedPositionGroup2, i410, 631063962, false, (String) objArr19[0], null);
                    }
                    if (set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null))) {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i411 = b;
                                    i17 = (i411 & 125) + (i411 | 125);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        Object[] objArr110 = new Object[1];
                                        a(new char[]{55386, 45369, 2643, 58221, 31998, 54737, 44781, 14339, 37193, 27179, 50051, 23770, 13810, 36612, 6246, 61814, 19072, 9134, 48354, 5657, 61222, 30793, 53649, 43702, 968, 40282, 30253, 53061}, 29900 << MotionEvent.axisFromString(""), objArr110);
                                        obj = objArr110[0];
                                    } else {
                                        int i412 = -(-MotionEvent.axisFromString(""));
                                        int i510 = (i412 & 26922) + (i412 | 26922);
                                        Object[] objArr111 = new Object[1];
                                        a(new char[]{55386, 45369, 2643, 58221, 31998, 54737, 44781, 14339, 37193, 27179, 50051, 23770, 13810, 36612, 6246, 61814, 19072, 9134, 48354, 5657, 61222, 30793, 53649, 43702, 968, 40282, 30253, 53061}, i510, objArr111);
                                        obj = objArr111[0];
                                    }
                                    try {
                                        Object[] objArr112 = {(String) obj};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int iAlpha2 = Color.alpha(0) + 993;
                                            int iMyPid2 = 8 - (Process.myPid() >> 22);
                                            byte[] bArr3 = $$a;
                                            short s3 = bArr3[7];
                                            Object[] objArr113 = new Object[1];
                                            c(s3, (byte) (s3 | 52), bArr3[5], objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iAlpha2, iMyPid2, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr112)).longValue();
                                        long j10 = 1907719407;
                                        long j11 = -751;
                                        long j12 = -1;
                                        long j13 = j10 ^ j12;
                                        long j14 = jLongValue2 ^ j12;
                                        i6 = i4;
                                        long j15 = i;
                                        long j16 = (j11 * j10) + (j11 * jLongValue2) + (((long) 1504) * (((j13 | j14) ^ j12) | ((j13 | j15) ^ j12)));
                                        long j17 = j13 | jLongValue2;
                                        long j18 = j16 + (((long) (-1504)) * ((j15 | j17) ^ j12)) + (((long) 752) * ((j12 ^ (j14 | j10)) | (j17 ^ j12))) + ((long) (-2108637644));
                                        int i511 = ~((-604053825) | i);
                                        int i512 = 780534154 + ((25199624 | i511) * (-476)) + (i511 * 952);
                                        int i513 = ~i;
                                        int i514 = i512 + ((~((-604053825) | i513)) * 476);
                                        TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i515 = ((int) (j18 >> 32)) & i514;
                                        int i516 = ((int) j18) & ((-1216677445) + ((1602874624 | i) * (-50)) + (((~((-1250536705) | i)) | (~((-4329558) | i513))) * 50) + (((~(i513 | 1602874624)) | (~((-1254866262) | i513)) | 4329557) * 50));
                                        i7 = (i515 & i516) | (i515 ^ i516);
                                        TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    i6 = i4;
                                    char[] cArr3 = {55364};
                                    int trimmedLength2 = TextUtils.getTrimmedLength("");
                                    int i517 = trimmedLength2 * (-520);
                                    int i518 = (i517 & 27332442) + (i517 | 27332442);
                                    int i519 = ~trimmedLength2;
                                    int i610 = (i519 & 52361) | (i519 ^ 52361);
                                    int i611 = -(-((~((i610 & i) | (i610 ^ i))) * 521));
                                    int i612 = ((((i518 | i611) << 1) - (i611 ^ i518)) - (~(-(-((~(((-52362) & trimmedLength2) | ((-52362) ^ trimmedLength2))) * (-1042)))))) - 1;
                                    int i613 = ~((-52362) | trimmedLength2);
                                    int i614 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i615 = ((i614 | 91) << 1) - (i614 ^ 91);
                                    b = i615 % 128;
                                    int i616 = i615 % 2;
                                    int i617 = ~trimmedLength2;
                                    int i618 = ~i;
                                    int i619 = (i617 & i618) | (i617 ^ i618);
                                    Object[] objArr114 = new Object[1];
                                    a(cArr3, i612 + (521 * ((~((i619 & 52361) | (i619 ^ 52361))) | i613)), objArr114);
                                    str = (String) objArr114[0];
                                    char[] cArr4 = {55303, 22405, 51045, 30412, 58988, 5644, 34234, 13643, 42218, 54403, 17441, 62412, 25444};
                                    minVolume = AudioTrack.getMinVolume();
                                    i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                                    b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        i15 = (minVolume > 1.0f ? 1 : (minVolume == 1.0f ? 0 : -1));
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i16 = ((-518) >>> i15) >>> (-1);
                                    } else {
                                        i15 = (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1));
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i710 = i15 * (-518);
                                        i16 = (i710 | (-19045306)) + (i710 & (-19045306));
                                    }
                                    int i711 = ~i15;
                                    int i712 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i711);
                                    int i713 = i16 + (519 * ((i712 & 36767) | (i712 ^ 36767)));
                                    int i714 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                                    int i715 = i714 % 128;
                                    b = i715;
                                    int i716 = i714 % 2;
                                    int i717 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i718 = (i711 & i717) | (i711 ^ i717);
                                    int i719 = ~((i718 & 36767) | (i718 ^ 36767));
                                    int i810 = i15 | 36767;
                                    int i811 = ~((i810 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i810 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i812 = -(-((-519) * ((i719 & i811) | (i719 ^ i811))));
                                    int i813 = (i713 ^ i812) + ((i713 & i812) << 1);
                                    int i814 = ((i715 | 81) << 1) - (i715 ^ 81);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i814 % 128;
                                    int i815 = i814 % 2;
                                    int i816 = i813 + (519 * (i15 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 36767) | (36767 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))));
                                    Object[] objArr115 = new Object[1];
                                    a(cArr4, i816, objArr115);
                                    try {
                                        objArr = new Object[]{(String) objArr115[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char cMakeMeasureSpec2 = (char) (33602 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 3085;
                                            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 27;
                                            byte[] bArr4 = $$a;
                                            short s4 = bArr4[7];
                                            Object[] objArr116 = new Object[1];
                                            c(s4, (byte) (s4 | 52), bArr4[5], objArr116);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec2, tapTimeout2, iLastIndexOf3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr))) {
                                            int i817 = b;
                                            int i818 = (i817 & 87) + (i817 | 87);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i818 % 128;
                                            int i819 = i818 % 2;
                                            int i910 = ((i817 | 21) << 1) - (i817 ^ 21);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i910 % 128;
                                            int i911 = i910 % 2;
                                            i7 = 1;
                                        } else {
                                            i7 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused) {
                                i7 = 0;
                            }
                        } catch (Exception unused2) {
                            i6 = i4;
                        }
                        i8 = (i & (-11)) | ((~i) & 10);
                        i9 = (i7 | (-i7)) >> 31;
                        i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i11 = (i10 & 57) + (i10 | 57);
                        b = i11 % 128;
                        if (i11 % 2 == 0) {
                            throw null;
                        }
                        int i912 = (~i9) & i;
                        int i913 = i9 & i8;
                        int i914 = i10 + 49;
                        int i915 = i914 % 128;
                        b = i915;
                        int i916 = i914 % 2;
                        int i917 = i2 & 32;
                        int i918 = i915 + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i918 % 128;
                        int i919 = i918 % 2;
                        int i1010 = (i917 | (-i917)) >> 31;
                        int i1011 = ((i913 & i912) | (i912 ^ i913)) & (~i1010);
                        i12 = (i915 & 81) + (i915 | 81);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                        int i1012 = i & i1010;
                        i13 = (i1011 & i1012) | (i1011 ^ i1012);
                        if (i12 % 2 != 0) {
                            int i1013 = 37 / 0;
                        }
                    }
                }
                int i1014 = (~(i & i6)) & (i | i6);
                int i1015 = -i1014;
                int i1016 = ((i1014 & i1015) | (i1014 ^ i1015)) >> 31;
                int i1017 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                int i1018 = i1017 % 128;
                b = i1018;
                int i1019 = i1017 % 2;
                int i1110 = i13 & (~i1016);
                int i1111 = i6 & i1016;
                int i1112 = (i1110 & i1111) | (i1110 ^ i1111);
                int i1113 = i1018 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1113 % 128;
                int i1114 = i1113 % 2;
                int i1115 = (~(i & i1112)) & (i | i1112);
                int i1116 = -i1115;
                int i1117 = (((i1115 & i1116) | (i1115 ^ i1116)) >> 31) & 16;
                objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i1112}, null};
                int i1118 = (-454980592) + (((-489055489) | i) * (-627)) + (((~(490694484 | i)) | 531004713) * (-627)) + (((~((~i) | (-490694485))) | (~(i | 531004713))) * 627);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i1119 = b + 93;
                int i1210 = i1119 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1210;
                int i1211 = i1119 % 2;
                int i1212 = (i1117 * (-375)) + (i1118 * (-375));
                int i1213 = ~i1117;
                int i1214 = ~i1118;
                int i1215 = ~((i1214 & i1213) | (i1213 ^ i1214));
                int i1216 = (i1215 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ^ i1215);
                int i1217 = ~(i1117 | i1118);
                int i1218 = ((i1216 & i1217) | (i1216 ^ i1217)) * 376;
                int i1219 = (i1212 & i1218) + (i1212 | i1218);
                int i1310 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i1117);
                int i1311 = ~((i1117 & i1118) | (i1117 ^ i1118));
                int i1312 = -(-(((i1310 & i1311) | (i1310 ^ i1311)) * (-376)));
                int i1313 = (i1219 & i1312) + (i1312 | i1219);
                int i1314 = ((i1210 | 117) << 1) - (i1210 ^ 117);
                int i1315 = i1314 % 128;
                b = i1315;
                int i1316 = i1314 % 2;
                int i1317 = -(-(376 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i1213) | (i1213 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | i1118)));
                int i1318 = (i3 - (~(-(-((i1313 ^ i1317) + ((i1317 & i1313) << 1)))))) - 1;
                int i1319 = i1318 << 13;
                int i145 = ((~i1318) & i1319) | ((~i1319) & i1318);
                int i146 = i145 >>> 17;
                int i147 = (i145 | i146) & (~(i145 & i146));
                int i148 = i147 << 5;
                ((int[]) objArr2[1])[0] = (i147 | i148) & (~(i147 & i148));
                i18 = ((i1315 | 71) << 1) - (i1315 ^ 71);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                if (i18 % 2 == 0) {
                    return objArr2;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
                if (Build.VERSION.SDK_INT == 30) {
                    int i149 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                    b = i149 % 128;
                    int i150 = i149 % 2;
                    i13 = i;
                    i6 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i413 = b;
                        i17 = (i413 & 125) + (i413 | 125);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                        if (i17 % 2 != 0) {
                            Object[] objArr117 = new Object[1];
                            a(new char[]{55386, 45369, 2643, 58221, 31998, 54737, 44781, 14339, 37193, 27179, 50051, 23770, 13810, 36612, 6246, 61814, 19072, 9134, 48354, 5657, 61222, 30793, 53649, 43702, 968, 40282, 30253, 53061}, 29900 << MotionEvent.axisFromString(""), objArr117);
                            obj = objArr117[0];
                        } else {
                            int i414 = -(-MotionEvent.axisFromString(""));
                            int i5110 = (i414 & 26922) + (i414 | 26922);
                            Object[] objArr118 = new Object[1];
                            a(new char[]{55386, 45369, 2643, 58221, 31998, 54737, 44781, 14339, 37193, 27179, 50051, 23770, 13810, 36612, 6246, 61814, 19072, 9134, 48354, 5657, 61222, 30793, 53649, 43702, 968, 40282, 30253, 53061}, i5110, objArr118);
                            obj = objArr118[0];
                        }
                        Object[] objArr119 = {(String) obj};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int iAlpha3 = Color.alpha(0) + 993;
                            int iMyPid3 = 8 - (Process.myPid() >> 22);
                            byte[] bArr5 = $$a;
                            short s5 = bArr5[7];
                            Object[] objArr1110 = new Object[1];
                            c(s5, (byte) (s5 | 52), bArr5[5], objArr1110);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iAlpha3, iMyPid3, 410748506, false, (String) objArr1110[0], new Class[]{String.class});
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr119)).longValue();
                        long j19 = 1907719407;
                        long j110 = -751;
                        long j111 = -1;
                        long j112 = j19 ^ j111;
                        long j113 = jLongValue3 ^ j111;
                        i6 = i4;
                        long j114 = i;
                        long j115 = (j110 * j19) + (j110 * jLongValue3) + (((long) 1504) * (((j112 | j113) ^ j111) | ((j112 | j114) ^ j111)));
                        long j116 = j112 | jLongValue3;
                        long j117 = j115 + (((long) (-1504)) * ((j114 | j116) ^ j111)) + (((long) 752) * ((j111 ^ (j113 | j19)) | (j116 ^ j111))) + ((long) (-2108637644));
                        int i5111 = ~((-604053825) | i);
                        int i5112 = 780534154 + ((25199624 | i5111) * (-476)) + (i5111 * 952);
                        int i5113 = ~i;
                        int i5114 = i5112 + ((~((-604053825) | i5113)) * 476);
                        TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i5115 = ((int) (j117 >> 32)) & i5114;
                        int i5116 = ((int) j117) & ((-1216677445) + ((1602874624 | i) * (-50)) + (((~((-1250536705) | i)) | (~((-4329558) | i5113))) * 50) + (((~(i5113 | 1602874624)) | (~((-1254866262) | i5113)) | 4329557) * 50));
                        i7 = (i5115 & i5116) | (i5115 ^ i5116);
                        TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        i6 = i4;
                        char[] cArr5 = {55364};
                        int trimmedLength3 = TextUtils.getTrimmedLength("");
                        int i5117 = trimmedLength3 * (-520);
                        int i5118 = (i5117 & 27332442) + (i5117 | 27332442);
                        int i5119 = ~trimmedLength3;
                        int i6110 = (i5119 & 52361) | (i5119 ^ 52361);
                        int i6111 = -(-((~((i6110 & i) | (i6110 ^ i))) * 521));
                        int i6112 = ((((i5118 | i6111) << 1) - (i6111 ^ i5118)) - (~(-(-((~(((-52362) & trimmedLength3) | ((-52362) ^ trimmedLength3))) * (-1042)))))) - 1;
                        int i6113 = ~((-52362) | trimmedLength3);
                        int i6114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i6115 = ((i6114 | 91) << 1) - (i6114 ^ 91);
                        b = i6115 % 128;
                        int i6116 = i6115 % 2;
                        int i6117 = ~trimmedLength3;
                        int i6118 = ~i;
                        int i6119 = (i6117 & i6118) | (i6117 ^ i6118);
                        Object[] objArr1111 = new Object[1];
                        a(cArr5, i6112 + (521 * ((~((i6119 & 52361) | (i6119 ^ 52361))) | i6113)), objArr1111);
                        str = (String) objArr1111[0];
                        char[] cArr6 = {55303, 22405, 51045, 30412, 58988, 5644, 34234, 13643, 42218, 54403, 17441, 62412, 25444};
                        minVolume = AudioTrack.getMinVolume();
                        i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                        b = i14 % 128;
                        if (i14 % 2 == 0) {
                            i15 = (minVolume > 1.0f ? 1 : (minVolume == 1.0f ? 0 : -1));
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i16 = ((-518) >>> i15) >>> (-1);
                        } else {
                            i15 = (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1));
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i7110 = i15 * (-518);
                            i16 = (i7110 | (-19045306)) + (i7110 & (-19045306));
                        }
                        int i7111 = ~i15;
                        int i7112 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | i7111);
                        int i7113 = i16 + (519 * ((i7112 & 36767) | (i7112 ^ 36767)));
                        int i7114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                        int i7115 = i7114 % 128;
                        b = i7115;
                        int i7116 = i7114 % 2;
                        int i7117 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i7118 = (i7111 & i7117) | (i7111 ^ i7117);
                        int i7119 = ~((i7118 & 36767) | (i7118 ^ 36767));
                        int i8110 = i15 | 36767;
                        int i8111 = ~((i8110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i8110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i8112 = -(-((-519) * ((i7119 & i8111) | (i7119 ^ i8111))));
                        int i8113 = (i7113 ^ i8112) + ((i7113 & i8112) << 1);
                        int i8114 = ((i7115 | 81) << 1) - (i7115 ^ 81);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8114 % 128;
                        int i8115 = i8114 % 2;
                        int i8116 = i8113 + (519 * (i15 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 36767) | (36767 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))));
                        Object[] objArr1112 = new Object[1];
                        a(cArr6, i8116, objArr1112);
                        objArr = new Object[]{(String) objArr1112[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cMakeMeasureSpec3 = (char) (33602 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 3085;
                            int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0) + 27;
                            byte[] bArr6 = $$a;
                            short s6 = bArr6[7];
                            Object[] objArr1113 = new Object[1];
                            c(s6, (byte) (s6 | 52), bArr6[5], objArr1113);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec3, tapTimeout3, iLastIndexOf4, 1411172903, false, (String) objArr1113[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr))) {
                            int i8117 = b;
                            int i8118 = (i8117 & 87) + (i8117 | 87);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8118 % 128;
                            int i8119 = i8118 % 2;
                            int i9110 = ((i8117 | 21) << 1) - (i8117 ^ 21);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9110 % 128;
                            int i9111 = i9110 % 2;
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                    }
                    i8 = (i & (-11)) | ((~i) & 10);
                    i9 = (i7 | (-i7)) >> 31;
                    i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i11 = (i10 & 57) + (i10 | 57);
                    b = i11 % 128;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    int i9112 = (~i9) & i;
                    int i9113 = i9 & i8;
                    int i9114 = i10 + 49;
                    int i9115 = i9114 % 128;
                    b = i9115;
                    int i9116 = i9114 % 2;
                    int i9117 = i2 & 32;
                    int i9118 = i9115 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9118 % 128;
                    int i9119 = i9118 % 2;
                    int i10110 = (i9117 | (-i9117)) >> 31;
                    int i10111 = ((i9113 & i9112) | (i9112 ^ i9113)) & (~i10110);
                    i12 = (i9115 & 81) + (i9115 | 81);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    int i10112 = i & i10110;
                    i13 = (i10111 & i10112) | (i10111 ^ i10112);
                    if (i12 % 2 != 0) {
                        int i10113 = 37 / 0;
                    }
                }
                int i10114 = (~(i & i6)) & (i | i6);
                int i10115 = -i10114;
                int i10116 = ((i10114 & i10115) | (i10114 ^ i10115)) >> 31;
                int i10117 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                int i10118 = i10117 % 128;
                b = i10118;
                int i10119 = i10117 % 2;
                int i11110 = i13 & (~i10116);
                int i11111 = i6 & i10116;
                int i11112 = (i11110 & i11111) | (i11110 ^ i11111);
                int i11113 = i10118 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11113 % 128;
                int i11114 = i11113 % 2;
                int i11115 = (~(i & i11112)) & (i | i11112);
                int i11116 = -i11115;
                int i11117 = (((i11115 & i11116) | (i11115 ^ i11116)) >> 31) & 16;
                objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i11112}, null};
                int i11118 = (-454980592) + (((-489055489) | i) * (-627)) + (((~(490694484 | i)) | 531004713) * (-627)) + (((~((~i) | (-490694485))) | (~(i | 531004713))) * 627);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i11119 = b + 93;
                int i12110 = i11119 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12110;
                int i12111 = i11119 % 2;
                int i12112 = (i11117 * (-375)) + (i11118 * (-375));
                int i12113 = ~i11117;
                int i12114 = ~i11118;
                int i12115 = ~((i12114 & i12113) | (i12113 ^ i12114));
                int i12116 = (i12115 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ i12115);
                int i12117 = ~(i11117 | i11118);
                int i12118 = ((i12116 & i12117) | (i12116 ^ i12117)) * 376;
                int i12119 = (i12112 & i12118) + (i12112 | i12118);
                int i13110 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i11117);
                int i13111 = ~((i11117 & i11118) | (i11117 ^ i11118));
                int i13112 = -(-(((i13110 & i13111) | (i13110 ^ i13111)) * (-376)));
                int i13113 = (i12119 & i13112) + (i13112 | i12119);
                int i13114 = ((i12110 | 117) << 1) - (i12110 ^ 117);
                int i13115 = i13114 % 128;
                b = i13115;
                int i13116 = i13114 % 2;
                int i13117 = -(-(376 * ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i12113) | (i12113 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | i11118)));
                int i13118 = (i3 - (~(-(-((i13113 ^ i13117) + ((i13117 & i13113) << 1)))))) - 1;
                int i13119 = i13118 << 13;
                int i1410 = ((~i13118) & i13119) | ((~i13119) & i13118);
                int i1411 = i1410 >>> 17;
                int i1412 = (i1410 | i1411) & (~(i1410 & i1411));
                int i1413 = i1412 << 5;
                ((int[]) objArr2[1])[0] = (i1412 | i1413) & (~(i1412 & i1413));
                i18 = ((i13115 | 71) << 1) - (i13115 ^ 71);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                if (i18 % 2 == 0) {
                    return objArr2;
                }
                Object obj6 = null;
                obj6.hashCode();
                throw null;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Snackbar snackbarMake = Snackbar.make(view, str, -1);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "");
        View view2 = snackbarMake.getView();
        Intrinsics.checkNotNullExpressionValue(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 48;
        view2.setLayoutParams(layoutParams2);
        snackbarMake.setTextColor(-1);
        snackbarMake.setBackgroundTint(Color.parseColor("#4dbb6c"));
        View viewFindViewById = view2.findViewById(com.bpjstku.R.id.snackbar_text);
        Intrinsics.checkNotNull(viewFindViewById, "");
        ((TextView) viewFindViewById).setTextAlignment(4);
        snackbarMake.show();
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        Snackbar snackbarMake = Snackbar.make(view, str, -1);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "");
        View view2 = snackbarMake.getView();
        Intrinsics.checkNotNullExpressionValue(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 48;
        view2.setLayoutParams(layoutParams2);
        snackbarMake.setTextColor(-1);
        snackbarMake.setBackgroundTint(Color.parseColor("#cd3a3a"));
        View viewFindViewById = view2.findViewById(com.bpjstku.R.id.snackbar_text);
        Intrinsics.checkNotNull(viewFindViewById, "");
        ((TextView) viewFindViewById).setTextAlignment(4);
        snackbarMake.show();
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseActivity baseActivity, int i, Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        FragmentTransaction fragmentTransactionBeginTransaction = baseActivity.getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (z) {
            fragmentTransactionBeginTransaction.addToBackStack(null);
        }
        fragmentTransactionBeginTransaction.replace(i, fragment);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object TuitionPaymentFragmentbindingInflater1(Context context, String str, Function1<? super File, Unit> function1, Continuation<? super Unit> continuation) {
        CommonUtilsKt$compressImageFile$1 commonUtilsKt$compressImageFile$1;
        if (continuation instanceof CommonUtilsKt$compressImageFile$1) {
            commonUtilsKt$compressImageFile$1 = (CommonUtilsKt$compressImageFile$1) continuation;
            if ((commonUtilsKt$compressImageFile$1.label & Integer.MIN_VALUE) != 0) {
                commonUtilsKt$compressImageFile$1.label -= Integer.MIN_VALUE;
            } else {
                commonUtilsKt$compressImageFile$1 = new CommonUtilsKt$compressImageFile$1(continuation);
            }
        } else {
            commonUtilsKt$compressImageFile$1 = new CommonUtilsKt$compressImageFile$1(continuation);
        }
        CommonUtilsKt$compressImageFile$1 commonUtilsKt$compressImageFile$2 = commonUtilsKt$compressImageFile$1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = commonUtilsKt$compressImageFile$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = commonUtilsKt$compressImageFile$2.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            File file = new File(str);
            getListenerExecutor getlistenerexecutor = getListenerExecutor.INSTANCE;
            commonUtilsKt$compressImageFile$2.L$0 = function1;
            commonUtilsKt$compressImageFile$2.label = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getListenerExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, file, null, null, commonUtilsKt$compressImageFile$2, 12);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) commonUtilsKt$compressImageFile$2.L$0;
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        function1.invoke((File) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, File file, Function1<? super File, Unit> function1, Continuation<? super Unit> continuation) {
        CommonUtilsKt$compressImageNotCrop$1 commonUtilsKt$compressImageNotCrop$1;
        if (continuation instanceof CommonUtilsKt$compressImageNotCrop$1) {
            commonUtilsKt$compressImageNotCrop$1 = (CommonUtilsKt$compressImageNotCrop$1) continuation;
            if ((commonUtilsKt$compressImageNotCrop$1.label & Integer.MIN_VALUE) != 0) {
                commonUtilsKt$compressImageNotCrop$1.label -= Integer.MIN_VALUE;
            } else {
                commonUtilsKt$compressImageNotCrop$1 = new CommonUtilsKt$compressImageNotCrop$1(continuation);
            }
        } else {
            commonUtilsKt$compressImageNotCrop$1 = new CommonUtilsKt$compressImageNotCrop$1(continuation);
        }
        CommonUtilsKt$compressImageNotCrop$1 commonUtilsKt$compressImageNotCrop$2 = commonUtilsKt$compressImageNotCrop$1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = commonUtilsKt$compressImageNotCrop$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = commonUtilsKt$compressImageNotCrop$2.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
            final int width = bitmapDecodeFile.getWidth();
            final int height = bitmapDecodeFile.getHeight();
            getListenerExecutor getlistenerexecutor = getListenerExecutor.INSTANCE;
            Function1 function2 = new Function1() { // from class: Camera2CameraControlExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = width;
                    int i3 = height;
                    getRecorder getrecorder = (getRecorder) obj;
                    Intrinsics.checkNotNullParameter(getrecorder, "");
                    getSortedQualities.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getrecorder, i2, i3, null, 0, 12);
                    return Unit.INSTANCE;
                }
            };
            commonUtilsKt$compressImageNotCrop$2.L$0 = function1;
            commonUtilsKt$compressImageNotCrop$2.label = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getListenerExecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, file, null, function2, commonUtilsKt$compressImageNotCrop$2, 4);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) commonUtilsKt$compressImageNotCrop$2.L$0;
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        function1.invoke((File) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    private static File TuitionPaymentFragmentbindingInflater1(Context context, Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(context, "");
        String path = context.getFilesDir().getPath();
        char c = File.separatorChar;
        Intrinsics.checkNotNull(uri);
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        Intrinsics.checkNotNull(cursorQuery);
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        Intrinsics.checkNotNullExpressionValue(string, "");
        cursorQuery.close();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(c);
        sb.append(string);
        File file = new File(sb.toString());
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                InputStream inputStream = inputStreamOpenInputStream;
                Intrinsics.checkNotNull(inputStream);
                Intrinsics.checkNotNullParameter(inputStream, "");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = fileOutputStream;
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                        fileOutputStream2.flush();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileOutputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return file;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            return file;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.io.FileOutputStream] */
    public static final File TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(".jpg");
        String string = sb.toString();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        if (Build.VERSION.SDK_INT >= 29) {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", string);
            contentValues.put("mime_type", "image/jpg");
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            objectRef.element = uriInsert != null ? contentResolver.openOutputStream(uriInsert) : 0;
            OutputStream outputStream = (OutputStream) objectRef.element;
            if (outputStream != null) {
                OutputStream outputStream2 = outputStream;
                try {
                    bitmap.compress(compressFormat, 100, outputStream2);
                    CloseableKt.closeFinally(outputStream2, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(outputStream2, th);
                        throw th2;
                    }
                }
            }
            return TuitionPaymentFragmentbindingInflater1(context, uriInsert);
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), string);
        objectRef.element = new FileOutputStream(file);
        FileOutputStream fileOutputStream = (FileOutputStream) objectRef.element;
        if (fileOutputStream == null) {
            return file;
        }
        FileOutputStream fileOutputStream2 = fileOutputStream;
        try {
            bitmap.compress(compressFormat, 100, fileOutputStream2);
            CloseableKt.closeFinally(fileOutputStream2, null);
            return file;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(fileOutputStream2, th3);
                throw th4;
            }
        }
    }

    public static final void b(Context context, String str, Uri uri, Fragment fragment, float f, float f2, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        UCrop.of(Uri.fromFile(new File(str)), uri).withAspectRatio(f, f2).start(context, fragment, i);
    }

    public static final List<String> TuitionPaymentFragmentbindingInflater1() {
        ArrayList arrayList = new ArrayList();
        try {
            String appSignature = ApiModuleKt.getAppSignature();
            if (appSignature.length() > 0) {
                arrayList.add(appSignature);
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return arrayList;
        }
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        try {
            List<String> listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            if (listTuitionPaymentFragmentbindingInflater1.isEmpty()) {
                return "";
            }
            return listTuitionPaymentFragmentbindingInflater1.get(0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static final String b(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.digest(bytes);
        return ApiModuleKt.getAppSignature();
    }

    public static final String d(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        if (length >= 0) {
            int i = 0;
            while (true) {
                if (i > 2 && i < sb.length() - 3) {
                    sb.setCharAt(i, '*');
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final String a(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        if (length >= 0) {
            int i = 0;
            while (true) {
                if (i > 2 && i < sb.length() - 9) {
                    sb.setCharAt(i, '*');
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final String asInterface(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        if (length >= 0) {
            int i = 0;
            while (true) {
                if (i > 1 && i < sb.length() - 2) {
                    sb.setCharAt(i, '*');
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String string = StringsKt.trim((CharSequence) str).toString();
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"0620", "062", "620", "+62", "62", "00", "0"})) {
            if (StringsKt.startsWith$default(string, str2, false, 2, (Object) null)) {
                String strSubstring = string.substring(str2.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                string = "0".concat(String.valueOf(strSubstring));
                break;
            }
        }
        return new Regex("[^0-9]").replace(string, "");
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String string = StringsKt.trim((CharSequence) str).toString();
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"0620", "062", "620", "+62", "62", "00", "0"})) {
            if (StringsKt.startsWith$default(string, str2, false, 2, (Object) null)) {
                String strSubstring = string.substring(str2.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return "+62".concat(String.valueOf(strSubstring));
            }
        }
        return string;
    }

    public static final String TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CharSequence charSequenceSubSequence = str.subSequence(3, 5);
        if (Intrinsics.areEqual(charSequenceSubSequence, "01")) {
            return "Januari";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "02")) {
            return "Februari";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "03")) {
            return "Maret";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "04")) {
            return "April";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "05")) {
            return "Mei";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "06")) {
            return "Juni";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "07")) {
            return "Juli";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "08")) {
            return "Agustus";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "09")) {
            return "September";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "10")) {
            return "Oktober";
        }
        if (Intrinsics.areEqual(charSequenceSubSequence, "11")) {
            return "November";
        }
        return Intrinsics.areEqual(charSequenceSubSequence, "12") ? "Desember" : "Unknown";
    }

    public static final boolean b(String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (StringsKt.contains((CharSequence) str, (CharSequence) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        if (Intrinsics.areEqual(strSubstring, "0")) {
            String strSubstring2 = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return "+62".concat(String.valueOf(strSubstring2));
        }
        String strSubstring3 = str.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        return Intrinsics.areEqual(strSubstring3, "62") ? "+".concat(String.valueOf(str)) : str;
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TextInputEditText textInputEditText, final Context context) {
        Intrinsics.checkNotNullParameter(textInputEditText, "");
        Intrinsics.checkNotNullParameter(context, "");
        textInputEditText.setLongClickable(false);
        textInputEditText.setTextIsSelectable(false);
        textInputEditText.setOnLongClickListener(new View.OnLongClickListener() { // from class: Camera2CameraControlExternalSyntheticLambda2
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -92820413;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Intrinsics.checkNotNullParameter(context, "");
                return true;
            }
        });
        textInputEditText.clearComposingText();
        textInputEditText.setOnClickListener(new View.OnClickListener() { // from class: Camera2Interop
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {74, 60, 122, -26, 11, 8, 25, -3, 18, 2, 19, 16, -41, 53, 10, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
            private static final int $$e = 35;
            private static final byte[] $$a = {77, -106, 83, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
            private static final int $$b = 105;
            private static int b = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 8524317604569459155L;

            private static void a(byte b2, byte b3, short s, Object[] objArr) {
                byte[] bArr = $$a;
                int i = s + 4;
                int i2 = 103 - b3;
                int i3 = b2 * 52;
                byte[] bArr2 = new byte[53 - i3];
                int i4 = 52 - i3;
                int i5 = -1;
                if (bArr == null) {
                    i2 = (i4 + i) - 11;
                    i = i;
                    i5 = -1;
                }
                while (true) {
                    int i6 = i5 + 1;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i7 = i + 1;
                    i2 = (i2 + bArr[i7]) - 11;
                    i = i7;
                    i5 = i6;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 16
                    int r7 = 100 - r7
                    int r6 = r6 * 41
                    int r0 = r6 + 12
                    byte[] r1 = defpackage.Camera2Interop.$$d
                    int r8 = r8 * 11
                    int r8 = 15 - r8
                    byte[] r0 = new byte[r0]
                    int r6 = r6 + 11
                    r2 = 0
                    if (r1 != 0) goto L18
                    r3 = r8
                    r4 = r2
                    goto L2f
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    r4 = r1[r8]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L2f:
                    int r8 = r8 + r7
                    int r7 = r3 + 1
                    int r8 = r8 + (-10)
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2Interop.d(byte, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:39:0x0192  */
            /* JADX WARN: Code duplicated, block: B:40:0x0193  */
            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                Object obj;
                Throwable cause;
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                int i3 = $10 + 119;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (true) {
                    obj = null;
                    if (getrealtimecapturelatency.b >= cArr.length) {
                        break;
                    }
                    int i5 = $11 + 37;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 19472), 2623 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myPid() >> 22) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.resolveSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 482, Drawable.resolveOpacity(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i8 = $10 + 107;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39421), (Process.myTid() >> 22) + 481, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        obj.hashCode();
                        throw null;
                    }
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, 37 - Gravity.getAbsoluteGravity(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x01ff  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                b = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cGreen = (char) Color.green(0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                    byte b2 = $$a[5];
                    byte b3 = (byte) (-b2);
                    Object[] objArr2 = new Object[1];
                    a(b3, (byte) (b3 + 4), b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cGreen, maxKeyCode, deadChar, 252381699, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{Typography.copyright, 16693, 33674, 50179, 1771, 18302, 35294, 52195, 3135, 20112, 36696, 53706, 4693, 21708, 38582, 55088, 6549, 23112, 40178, 56654, 8151, 25004}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16786, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{173, 5789, 11483, 16915, 22623, 28592, 34298, 39701, 45413, 51368, 56990, 62671, 2573, 8256, 14259}, 5689 - View.resolveSizeAndState(0, 0, 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                    int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte[] bArr = $$a;
                    Object[] objArr5 = new Object[1];
                    a(bArr[7], bArr[54], bArr[5], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, absoluteGravity, fadingEdgeLength, 2009631821, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 876;
                        int iBlue = Color.blue(0) + 10;
                        byte[] bArr2 = $$a;
                        byte b4 = (byte) (-bArr2[5]);
                        byte b5 = bArr2[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, (byte) (b5 | 51), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, tapTimeout, iBlue, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i4 = (((((~(603945983 | iIdentityHashCode)) | 538206594) * 449) - 1644066864) + (((~((~iIdentityHashCode) | 603945983)) | 538206594) * 449)) - 2133901411;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{Typography.copyright, 53555, 41862, 29701, 18163, 5960, 59858, 48117, 35841, 24197, 12138, 385, 53877, 42042, 30362, 18202, 6638, 59972, 48326, 36542, 24376, 12697, 628, 54478, 42321, 30497}, 53653 - KeyEvent.keyCodeFromString(""), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{171, 62186, 58388, 55231, 51697, 47893, 44726, 41192, 37376, 34231, 30658, 26908, 23743, 20162, 16510, 13240, 9687, 5985}, 62039 - (Process.myTid() >> 22), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                        int i8 = i7 % 128;
                        b = i8;
                        int i9 = i7 % 2;
                        if (applicationContext instanceof ContextWrapper) {
                            int i10 = i8 + 41;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            int i11 = i10 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{Typography.cent, 34148, 2852, 37326, 6098, 40357, 8807, 43069, 11975, 46291, 15001, 49022, 17703, 52181, 20891, 55206}, KeyEvent.keyCodeFromString("") + 34253, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{161, 23879, 47995, 6503, 30480, 54582, 13118, 37340, 61400, 19946, 43925, 2489, 26511, 50248, 8822, 32872}, KeyEvent.normalizeMetaState(0) + 24043, objArr11);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                    b = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -2133901411};
                        byte[] bArr3 = $$d;
                        byte b6 = bArr3[48];
                        byte b7 = (byte) (b6 - 1);
                        Object[] objArr13 = new Object[1];
                        d(b7, b7, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b8 = bArr3[48];
                        byte b9 = b8;
                        Object[] objArr14 = new Object[1];
                        d(b8, b9, (byte) (b9 - 1), objArr14);
                        Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            int i14 = b + 73;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                            int i15 = i14 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                int maximumFlingVelocity = 876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                                byte[] bArr4 = $$a;
                                byte b10 = (byte) (-bArr4[5]);
                                byte b11 = bArr4[7];
                                Object[] objArr16 = new Object[1];
                                a(b10, b11, (byte) (b11 | 51), objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, maximumFlingVelocity, modifierMetaStateMask, 256017550, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                            try {
                                Object[] objArr17 = new Object[1];
                                c(new char[]{Typography.copyright, 16693, 33674, 50179, 1771, 18302, 35294, 52195, 3135, 20112, 36696, 53706, 4693, 21708, 38582, 55088, 6549, 23112, 40178, 56654, 8151, 25004}, 16787 - TextUtils.getCapsMode("", 0, 0), objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                c(new char[]{173, 5789, 11483, 16915, 22623, 28592, 34298, 39701, 45413, 51368, 56990, 62671, 2573, 8256, 14259}, ExpandableListView.getPackedPositionChild(0L) + 5690, objArr18);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                                    int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                                    byte[] bArr5 = $$a;
                                    Object[] objArr19 = new Object[1];
                                    a(bArr5[7], bArr5[54], bArr5[5], objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(longPressTimeout, maximumDrawingCacheSize, iLastIndexOf, 2009631821, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int iRgb = Color.rgb(0, 0, 0) + 16778092;
                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                                    byte b12 = $$a[5];
                                    byte b13 = (byte) (-b12);
                                    Object[] objArr20 = new Object[1];
                                    a(b13, (byte) (b13 + 4), b12, objArr20);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iRgb, iLastIndexOf2, 252381699, false, (String) objArr20[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                                b = i16 % 128;
                                int i17 = i16 % 2;
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        objArr = objArr15;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i18 = ((int[]) objArr[2])[0];
                int i19 = ((int[]) objArr[0])[0];
                if (i19 != i18) {
                    throw new RuntimeException(String.valueOf(i19));
                }
                int i20 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMyTid = Process.myTid();
                int i21 = ~(498023419 | iMyTid);
                int i22 = i20 + 1065598244 + ((397776 | i21) * (-476)) + (i21 * 952) + ((~((~iMyTid) | 498023419)) * 476);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr21[1])[0] = i24 ^ (i24 << 5);
                int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                b = i25 % 128;
                int i26 = i25 % 2;
                Context context2 = context;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    Intrinsics.checkNotNullParameter(context2, "");
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        textInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: extractCameraCharacteristics
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Context context2 = context;
                if (z) {
                    Intrinsics.checkNotNullParameter(context2, "");
                }
            }
        });
        textInputEditText.setOnKeyListener(new View.OnKeyListener() { // from class: Camera2CameraInfo
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                Context context2 = context;
                if (i != 278 && i != 279) {
                    return false;
                }
                Intrinsics.checkNotNullParameter(context2, "");
                return true;
            }
        });
        textInputEditText.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(context));
        textInputEditText.setCustomSelectionActionModeCallback(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements TextWatcher {
        private /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Intrinsics.checkNotNullParameter(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        }
    }

    public static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (Build.VERSION.SDK_INT >= 33) {
            return new String[]{"android.permission.CAMERA"};
        }
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, Uri uri) {
        Uri uri2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String string = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            DocumentFile documentFileFromSingleUri = DocumentFile.fromSingleUri(context, uri);
            if (documentFileFromSingleUri == null || (uri2 = documentFileFromSingleUri.getUri()) == null) {
                return null;
            }
            return uri2.getPath();
        }
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        Integer numValueOf = cursorQuery != null ? Integer.valueOf(cursorQuery.getColumnIndexOrThrow("_data")) : null;
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        if (cursorQuery != null) {
            string = cursorQuery.getString(numValueOf != null ? numValueOf.intValue() : -1);
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    private static String b() {
        String str = new SimpleDateFormat("dd-MM-yyyy", Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        String strB = b();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append(".jpg");
        return new File(externalFilesDir, sb.toString());
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", new Locale("in", "ID")).format(new Date(jCurrentTimeMillis));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, Context context) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(context, "");
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(".jpeg");
        File file = new File(externalFilesDir, sb.toString());
        try {
            FilesKt.writeBytes(file, bArr);
            return file;
        } catch (IOException e2) {
            e2.printStackTrace();
            return file;
        }
    }

    public static final String b(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        try {
            return Base64.encodeToString(FilesKt.readBytes(file), 2);
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
