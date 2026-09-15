package kotlin.collections.builders;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import defpackage.SessionProcessor;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ)\u0010\u0014\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0017H\u0097\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J)\u0010\u001b\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J)\u0010\u001c\u001a\u00020\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Lkotlin/collections/builders/MapBuilderEntries;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "Lkotlin/collections/builders/MapBuilder;", "p0", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "isEmpty", "()Z", "", "containsEntry", "(Ljava/util/Map$Entry;)Z", "", "clear", "()V", "add", "", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "containsAll", "removeAll", "retainAll", "backing", "Lkotlin/collections/builders/MapBuilder;", "getBacking", "()Lkotlin/collections/builders/MapBuilder;", "", "getSize", "()I", "size"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapBuilderEntries<K, V> extends AbstractMapBuilderEntrySet<Map.Entry<K, V>, K, V> {
    private final MapBuilder<K, V> backing;
    private static final byte[] $$a = {46, 47, -18, 64};
    private static final int $$b = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int d = 1;
    private static char[] b = {47342, 47331, 47348, 47344, 47363, 47373, 47423, 47362, 47368, 47313, 47341, 47372, 47375, 47420, 47370, 47301, 47330, 47388, 47390, 47376, 47299, 47374, 47421, 47417, 47361, 47364, 47329, 47366, 47332, 47367, 47419, 47422, 47416, 47371, 47339, 47385, 47356, 47297, 47352};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719601;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 9165735533383323067L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1236a = -981105359;
    private static char g = 34097;

    private static void e(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 87;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cKeyCodeFromString = (char) (8328 - KeyEvent.keyCodeFromString(""));
                    int i5 = 1236 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i6 = 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b2 = (byte) ($$b & 10);
                    byte b3 = (byte) (b2 - 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cKeyCodeFromString, i5, i6, -653973969, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2764 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, 1504416861, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 43325), 253 - View.resolveSize(0, 0), View.combineMeasuredStates(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 65200);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2892;
                    int gidForName = 16 - Process.getGidForName("");
                    byte b6 = (byte) ($$b & 1);
                    byte b7 = (byte) (-b6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(pressedStateDuration, iIndexOf, gidForName, 2012627446, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) f1236a) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) g) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i7 = $10 + 89;
        $11 = i7 % 128;
        int i8 = i7 % 2;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = b;
        int i4 = -1;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 61;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(0) + 31339), 2994 - KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 18, 1182129903, false, $$c((byte) ($$b & 44), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getSize(0) + 31339), 2994 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 17 - Gravity.getAbsoluteGravity(0, 0), 1182129903, false, $$c((byte) ($$b & 44), b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                i4 = -1;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 43325), Color.rgb(0, 0, 0) + 16777469, View.MeasureSpec.makeMeasureSpec(0, 0) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        int i7 = 33602;
        int i8 = 1687675375;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                try {
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 33602), 3085 - ExpandableListView.getPackedPositionType(0L), Color.blue(0) + 26, -2146875848, false, $$c((byte) ($$b & 45), b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i9 = $11 + 79;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] << iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b5 = (byte) (-1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + i7), 3086 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25, -2146875848, false, $$c((byte) ($$b & 45), b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    byte b6 = (byte) (-1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (33603 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3086 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2146875848, false, $$c((byte) ($$b & 45), b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            int i10 = $10 + 53;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 / 3;
            }
            i7 = 33602;
            i8 = 1687675375;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        d = i2 % 128;
        Map.Entry<K, V> entry = (Map.Entry) obj;
        if (i2 % 2 != 0) {
            return add((Map.Entry) entry);
        }
        add((Map.Entry) entry);
        throw null;
    }

    public final MapBuilder<K, V> getBacking() {
        int i = 2 % 2;
        int i2 = d + 119;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.backing;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MapBuilderEntries(MapBuilder<K, V> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "");
        this.backing = mapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        int i = 2 % 2;
        int i2 = d + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int size = this.backing.size();
        int i4 = d + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = this.backing.isEmpty();
        int i4 = d + 113;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return zIsEmpty;
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public final boolean containsEntry(Map.Entry<? extends K, ? extends V> p0) {
        int i = 2 % 2;
        int i2 = d + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        boolean zContainsEntry$kotlin_stdlib = this.backing.containsEntry$kotlin_stdlib(p0);
        int i4 = asBinder + 23;
        d = i4 % 128;
        int i5 = i4 % 2;
        return zContainsEntry$kotlin_stdlib;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.backing.clear();
        int i4 = asBinder + 117;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public final boolean add(Map.Entry<K, V> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.collections.builders.AbstractMapBuilderEntrySet
    public final boolean remove(Map.Entry<K, V> p0) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.backing.removeEntry$kotlin_stdlib(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.backing.removeEntry$kotlin_stdlib(p0);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        MapBuilder.EntriesItr<K, V> entriesItrEntriesIterator$kotlin_stdlib = this.backing.entriesIterator$kotlin_stdlib();
        int i4 = d + 119;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return entriesItrEntriesIterator$kotlin_stdlib;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> p0) {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.backing.containsAllEntries$kotlin_stdlib(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.backing.containsAllEntries$kotlin_stdlib(p0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> p0) {
        int i = 2 % 2;
        int i2 = asBinder + 3;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.backing.checkIsMutable$kotlin_stdlib();
            return super.removeAll(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.backing.checkIsMutable$kotlin_stdlib();
        super.removeAll(p0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> p0) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.backing.checkIsMutable$kotlin_stdlib();
            return super.retainAll(p0);
        }
        Intrinsics.checkNotNullParameter(p0, "");
        this.backing.checkIsMutable$kotlin_stdlib();
        super.retainAll(p0);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0b92 A[Catch: all -> 0x0bd2, TryCatch #7 {all -> 0x0bd2, blocks: (B:93:0x0b4a, B:95:0x0b5d, B:97:0x0b65, B:98:0x0b66, B:91:0x0b42, B:100:0x0b68, B:102:0x0b70, B:103:0x0b71, B:110:0x0b7b, B:112:0x0b81, B:113:0x0b82, B:119:0x0b8c, B:121:0x0b92, B:122:0x0b93, B:124:0x0b95, B:126:0x0b9c, B:127:0x0b9d, B:130:0x0ba1, B:132:0x0ba8, B:133:0x0ba9, B:135:0x0bab, B:137:0x0bb2, B:138:0x0bb3, B:140:0x0bb5, B:142:0x0bbc, B:143:0x0bbd, B:145:0x0bbf, B:147:0x0bc6, B:148:0x0bc7, B:150:0x0bc9, B:152:0x0bd0, B:153:0x0bd1, B:24:0x0275, B:26:0x02f0, B:25:0x02b1, B:69:0x083d, B:71:0x08ae, B:75:0x0938, B:77:0x0966, B:76:0x093c, B:7:0x0034, B:16:0x01a6, B:18:0x01d1, B:20:0x0242, B:38:0x0505, B:40:0x0589, B:12:0x0139, B:83:0x09ce, B:85:0x0a12, B:10:0x00ee), top: B:168:0x0034, inners: #0, #3, #4, #6, #8, #9, #12, #13 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0b93 A[Catch: all -> 0x0bd2, TryCatch #7 {all -> 0x0bd2, blocks: (B:93:0x0b4a, B:95:0x0b5d, B:97:0x0b65, B:98:0x0b66, B:91:0x0b42, B:100:0x0b68, B:102:0x0b70, B:103:0x0b71, B:110:0x0b7b, B:112:0x0b81, B:113:0x0b82, B:119:0x0b8c, B:121:0x0b92, B:122:0x0b93, B:124:0x0b95, B:126:0x0b9c, B:127:0x0b9d, B:130:0x0ba1, B:132:0x0ba8, B:133:0x0ba9, B:135:0x0bab, B:137:0x0bb2, B:138:0x0bb3, B:140:0x0bb5, B:142:0x0bbc, B:143:0x0bbd, B:145:0x0bbf, B:147:0x0bc6, B:148:0x0bc7, B:150:0x0bc9, B:152:0x0bd0, B:153:0x0bd1, B:24:0x0275, B:26:0x02f0, B:25:0x02b1, B:69:0x083d, B:71:0x08ae, B:75:0x0938, B:77:0x0966, B:76:0x093c, B:7:0x0034, B:16:0x01a6, B:18:0x01d1, B:20:0x0242, B:38:0x0505, B:40:0x0589, B:12:0x0139, B:83:0x09ce, B:85:0x0a12, B:10:0x00ee), top: B:168:0x0034, inners: #0, #3, #4, #6, #8, #9, #12, #13 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v131 */
    /* JADX WARN: Type inference failed for: r5v157, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v175 */
    /* JADX WARN: Type inference failed for: r5v177 */
    /* JADX WARN: Type inference failed for: r5v178 */
    /* JADX WARN: Type inference failed for: r5v179 */
    /* JADX WARN: Type inference failed for: r5v180 */
    /* JADX WARN: Type inference failed for: r5v181 */
    /* JADX WARN: Type inference failed for: r5v182 */
    /* JADX WARN: Type inference failed for: r5v183 */
    /* JADX WARN: Type inference failed for: r5v184 */
    /* JADX WARN: Type inference failed for: r5v185 */
    /* JADX WARN: Type inference failed for: r5v186 */
    /* JADX WARN: Type inference failed for: r5v187 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v41, types: [int] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r6v79, types: [java.lang.reflect.Method] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
        int i3;
        Class<?> cls;
        char[] cArr;
        char[] cArr2;
        int length;
        Object[] objArr;
        int i4;
        int iTuitionPaymentFragmentbindingInflater1;
        int i5;
        int i6;
        int i7;
        Throwable cause;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r5;
        int i13 = i2;
        int i14 = 2 % 2;
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        r6 = 0;
        r6 = 0;
        r6 = 0;
        r6 = 0;
        int i15 = 1;
        if (context != null) {
            try {
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 127;
                byte[] bArr = {-109, -110, -125, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127};
                int i16 = d;
                int i17 = ((i16 | 45) << 1) - (i16 ^ 45);
                asBinder = i17 % 128;
                int i18 = i17 % 2;
                Object[] objArr2 = new Object[1];
                c(null, null, offsetBefore, bArr, objArr2);
                try {
                    try {
                        Object[] objArr3 = {(String) objArr2[0]};
                        Object[] objArr4 = new Object[1];
                        e(new char[]{10212, 'y', 28998, 55686, 15794, 34077, 36210, 63558, 35254, 16612, 14062, 46598, 36385, 47034, 12854, 557, 59971, 30960, 49878, 52508, 21142, 20625, 29708, 25137, 56603, 1911, 6496, 57617, 42543, 65230, 53737, 19993, 55080, 54927, 18838, 11912, 43616, 53096}, new char[]{34954, 2552, 54932, 55373}, (char) (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{57134, 20938, 15172, 45735}, ViewConfiguration.getScrollBarSize() >> 8, objArr4);
                        Object objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                        int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int iTuitionPaymentFragmentbindingInflater2 = zzir.TuitionPaymentFragmentbindingInflater1();
                        int i19 = windowTouchSlop * (-432);
                        int i20 = ((i19 | 22353604) << 1) - (i19 ^ 22353604);
                        int i21 = ~windowTouchSlop;
                        int i22 = ~iTuitionPaymentFragmentbindingInflater2;
                        int i23 = i20 + ((~((i21 ^ i22) | (i22 & i21) | 51506)) * 433);
                        int i24 = ~(((-51507) ^ iTuitionPaymentFragmentbindingInflater2) | ((-51507) & iTuitionPaymentFragmentbindingInflater2));
                        int i25 = -(-(((i21 ^ i24) | (i24 & i21)) * (-433)));
                        int i26 = ~((iTuitionPaymentFragmentbindingInflater2 & i21) | (i21 ^ iTuitionPaymentFragmentbindingInflater2));
                        int i27 = ~((windowTouchSlop & 51506) | (windowTouchSlop ^ 51506));
                        int i28 = i26 ^ i27;
                        Object[] objArr5 = new Object[1];
                        e(new char[]{50077, 9716, 48813, 65415, 36889, 5696, 51467, 23281, 39974, 56989, 8251, 38319, 47428, 24681, 2549, 45732, 4243, 8084, 12092, 49988, 60199, 55635, 8976, 137, 21454, 63866, 16613, 32273, 51876, 45073, 65128}, new char[]{34954, 2552, 54932, 55373}, (char) (((((i23 | i25) << 1) - (i25 ^ i23)) - (~(((i27 & i26) | i28) * 433))) - 1), new char[]{50501, 4189, 12990, 44745}, (-1106223675) - (~(-(-MotionEvent.axisFromString("")))), objArr5);
                        try {
                            Object[] objArr6 = {(String) objArr5[0]};
                            Object[] objArr7 = new Object[1];
                            e(new char[]{10212, 'y', 28998, 55686, 15794, 34077, 36210, 63558, 35254, 16612, 14062, 46598, 36385, 47034, 12854, 557, 59971, 30960, 49878, 52508, 21142, 20625, 29708, 25137, 56603, 1911, 6496, 57617, 42543, 65230, 53737, 19993, 55080, 54927, 18838, 11912, 43616, 53096}, new char[]{34954, 2552, 54932, 55373}, (char) (Process.myTid() >> 22), new char[]{57134, 20938, 15172, 45735}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr7);
                            Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                            int i29 = d;
                            int i30 = (i29 & 123) + (i29 | 123);
                            asBinder = i30 % 128;
                            int i31 = i30 % 2;
                            try {
                                int i32 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                Object[] objArr8 = new Object[1];
                                c(null, null, (i32 ^ 127) + ((i32 & 127) << 1), new byte[]{-105, -104, -116, -105, -123, -120, -127, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr8);
                                Class<?> cls2 = Class.forName((String) objArr8[0]);
                                int i33 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr9 = new Object[1];
                                e(new char[]{41802, 38632, 49736, 61385, 27532, 11106, 10333, 9310, 39704, 54753, 58434, 31920, 57110, 1730, 58944, 48190, 62477}, new char[]{34954, 2552, 54932, 55373}, (char) ((i33 ^ 41316) + ((i33 & 41316) << 1)), new char[]{33796, 45072, 25527, 21153}, View.MeasureSpec.getMode(0) - 1213198204, objArr9);
                                Object objInvoke = cls2.getMethod((String) objArr9[0], null).invoke(context, null);
                                int i34 = asBinder + 63;
                                d = i34 % 128;
                                if (i34 % 2 == 0) {
                                    int i35 = 2 % 3;
                                }
                                try {
                                    Object[] objArr10 = new Object[1];
                                    c(null, null, 126 - (~(-Drawable.resolveOpacity(0, 0))), new byte[]{-105, -104, -116, -105, -123, -120, -127, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr10);
                                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                                    int i36 = asBinder;
                                    int i37 = (i36 ^ 19) + ((i36 & 19) << 1);
                                    d = i37 % 128;
                                    int i38 = i37 % 2;
                                    char[] cArr3 = {61157, 50097, 18703, 7343, 12831, 47704, 30722, 45674, 29751, 49580, 49558, 6912, 64085, 55356};
                                    char[] cArr4 = {34954, 2552, 54932, 55373};
                                    int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                    int iTuitionPaymentFragmentbindingInflater3 = zzir.TuitionPaymentFragmentbindingInflater1();
                                    int i39 = scrollDefaultDelay * 165;
                                    int i40 = (i39 & (-1444017)) + (i39 | (-1444017));
                                    int i41 = ~iTuitionPaymentFragmentbindingInflater3;
                                    int i42 = ~((i41 & 8859) | (i41 ^ 8859));
                                    int i43 = i40 + (((i42 & scrollDefaultDelay) | (scrollDefaultDelay ^ i42)) * (-328));
                                    int i44 = ((scrollDefaultDelay ^ iTuitionPaymentFragmentbindingInflater3) | (scrollDefaultDelay & iTuitionPaymentFragmentbindingInflater3)) * 164;
                                    int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                                    int i46 = ~scrollDefaultDelay;
                                    int i47 = ~((i46 ^ (-8860)) | (i46 & (-8860)));
                                    int i48 = ~(((-8860) ^ iTuitionPaymentFragmentbindingInflater3) | ((-8860) & iTuitionPaymentFragmentbindingInflater3));
                                    int i49 = (i47 ^ i48) | (i47 & i48);
                                    int i50 = (~iTuitionPaymentFragmentbindingInflater3) | scrollDefaultDelay;
                                    int i51 = d;
                                    int i52 = (i51 ^ 59) + ((i51 & 59) << 1);
                                    asBinder = i52 % 128;
                                    int i53 = i52 % 2;
                                    int i54 = ~((i50 & 8859) | (i50 ^ 8859));
                                    int i55 = 164 * ((i49 & i54) | (i49 ^ i54));
                                    Object[] objArr11 = new Object[1];
                                    e(cArr3, cArr4, (char) ((i45 & i55) + (i55 | i45)), new char[]{36999, 40551, 39837, 55586}, View.getDefaultSize(0, 0), objArr11);
                                    r6 = 0;
                                    Object objInvoke2 = cls3.getMethod((String) objArr11[0], null).invoke(context, null);
                                    int i56 = d;
                                    int i57 = ((i56 | 73) << 1) - (i56 ^ 73);
                                    asBinder = i57 % 128;
                                    r6 = i57 % 2;
                                    try {
                                        if (r6 != 0) {
                                            Object[] objArr12 = new Object[3];
                                            objArr12[0] = 64;
                                            objArr12[0] = objInvoke2;
                                            Object[] objArr13 = new Object[1];
                                            c(null, null, 108 / (PointF.length(1.0f, 0.0f) > 0.0f ? 1 : (PointF.length(1.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-121, -116, -113, -108, -123, -108, -99, -116, -113, -108, -100, -106, -108, -101, -107, -102, -103, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr13);
                                            cls = Class.forName((String) objArr13[0]);
                                            cArr = new char[]{1252, 51965, 40349, 4019, 3405, 11177, 64245, 47633, 14967, 47914, 65244, 14574, 7741, 35568};
                                            cArr2 = new char[]{34954, 2552, 54932, 55373};
                                            r6 = objArr12;
                                        } else {
                                            Object[] objArr14 = {objInvoke2, 64};
                                            int i58 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            Object[] objArr15 = new Object[1];
                                            c(null, null, (i58 ^ 127) + ((i58 & 127) << 1), new byte[]{-121, -116, -113, -108, -123, -108, -99, -116, -113, -108, -100, -106, -108, -101, -107, -102, -103, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr15);
                                            cls = Class.forName((String) objArr15[0]);
                                            cArr = new char[]{1252, 51965, 40349, 4019, 3405, 11177, 64245, 47633, 14967, 47914, 65244, 14574, 7741, 35568};
                                            cArr2 = new char[]{34954, 2552, 54932, 55373};
                                            r6 = objArr14;
                                        }
                                        char[] cArr5 = cArr2;
                                        char[] cArr6 = cArr;
                                        int i59 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        int iTuitionPaymentFragmentbindingInflater4 = zzir.TuitionPaymentFragmentbindingInflater1();
                                        int i60 = i59 * (-661);
                                        int i61 = (i60 & (-27513464)) + (i60 | (-27513464));
                                        int i62 = ~iTuitionPaymentFragmentbindingInflater4;
                                        int i63 = ~i59;
                                        int i64 = i61 + (((~((i63 ^ (-41625)) | (i63 & (-41625)))) | i62) * 1324);
                                        int i65 = ~(i59 | iTuitionPaymentFragmentbindingInflater4);
                                        int i66 = ~((iTuitionPaymentFragmentbindingInflater4 ^ 41624) | (iTuitionPaymentFragmentbindingInflater4 & 41624));
                                        int i67 = (i64 - (~(((i65 ^ i66) | (i65 & i66)) * (-1324)))) - 1;
                                        int i68 = ~((i63 ^ 41624) | (i63 & 41624));
                                        int i69 = ~(((-41625) & i59) | ((-41625) ^ i59));
                                        int i70 = i68 ^ i69;
                                        Object[] objArr16 = new Object[1];
                                        e(cArr6, cArr5, (char) (i67 + (((i68 & i69) | i70) * 662)), new char[]{36847, 13977, 39063, 41378}, ExpandableListView.getPackedPositionGroup(0L), objArr16);
                                        Object objInvoke3 = cls.getMethod((String) objArr16[0], String.class, Integer.TYPE).invoke(objInvoke, r6);
                                        int i71 = asBinder + 105;
                                        d = i71 % 128;
                                        int i72 = i71 % 2;
                                        int i73 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                        Object[] objArr17 = new Object[1];
                                        e(new char[]{16383, 7656, 64311, 33542, 7773, 64568, 28711, 40321, 25957, 14549, 11087, 1418, 29132, 55308, 29970, 11749, 10568, 60393, 15510, 45665, 41938, 61445, 56993, 63107, 13173, 57548, 17386, 28130, 5294, 7671}, new char[]{34954, 2552, 54932, 55373}, (char) ((i73 & 27601) + (i73 | 27601)), new char[]{37681, 58711, 53663, 56171}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr17);
                                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                                        char[] cArr7 = {57114, 4588, 61410, 17557, 42256, 13979, 52374, 18329, 40330, 54371};
                                        char[] cArr8 = {34954, 2552, 54932, 55373};
                                        int i74 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentbindingInflater5 = zzir.TuitionPaymentFragmentbindingInflater1();
                                        int i75 = ~i74;
                                        int i76 = (((i74 * 71) - 69) - (~(((~((i75 & 1) | (i75 ^ 1))) | (~((iTuitionPaymentFragmentbindingInflater5 ^ 1) | (iTuitionPaymentFragmentbindingInflater5 & 1)))) * (-140)))) - 1;
                                        int i77 = i74 | 1;
                                        int i78 = i76 + ((~((i77 & iTuitionPaymentFragmentbindingInflater5) | (i77 ^ iTuitionPaymentFragmentbindingInflater5))) * 70);
                                        int i79 = ~i74;
                                        int i80 = ~((i79 & 1) | (i79 ^ 1));
                                        int i81 = ~(((-2) & i74) | ((-2) ^ i74));
                                        int i82 = (i80 & i81) | (i80 ^ i81);
                                        int i83 = asBinder + 53;
                                        d = i83 % 128;
                                        if (i83 % 2 == 0) {
                                            int i84 = ~((i74 & iTuitionPaymentFragmentbindingInflater5) | (i74 ^ iTuitionPaymentFragmentbindingInflater5));
                                            int i85 = -(-((i84 & i82) | (i82 ^ i84)));
                                            Object[] objArr18 = new Object[1];
                                            e(cArr7, cArr8, (char) (i78 / ((i85 & 70) + (i85 | 70))), new char[]{27134, 38409, 36149, 14312}, Process.myPid() / 107, objArr18);
                                            Object[] objArr19 = (Object[]) cls4.getField((String) objArr18[0]).get(objInvoke3);
                                            length = objArr19.length;
                                            objArr = objArr19;
                                        } else {
                                            int i86 = ~((i74 & iTuitionPaymentFragmentbindingInflater5) | (i74 ^ iTuitionPaymentFragmentbindingInflater5));
                                            int i87 = i82 ^ i86;
                                            Object[] objArr20 = new Object[1];
                                            e(cArr7, cArr8, (char) (i78 + (((i86 & i82) | i87) * 70)), new char[]{27134, 38409, 36149, 14312}, Process.myPid() >> 22, objArr20);
                                            Object[] objArr21 = (Object[]) cls4.getField((String) objArr20[0]).get(objInvoke3);
                                            length = objArr21.length;
                                            objArr = objArr21;
                                        }
                                        int i88 = 0;
                                        ?? r0 = objArr;
                                        while (true) {
                                            if (i88 < length) {
                                                int i89 = asBinder;
                                                int i90 = ((i89 | 103) << i15) - (i89 ^ 103);
                                                d = i90 % 128;
                                                int i91 = i90 % 2;
                                                r6 = r0[i88];
                                                int i92 = -View.resolveSizeAndState(0, 0, 0);
                                                int i93 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                int iTuitionPaymentFragmentbindingInflater6 = zzir.TuitionPaymentFragmentbindingInflater1();
                                                int i94 = (i93 * (-344)) - 555308432;
                                                int i95 = ~i93;
                                                ?? r23 = r0;
                                                int i96 = ~(i95 | 722537193);
                                                int i97 = ~((i95 ^ iTuitionPaymentFragmentbindingInflater6) | (i95 & iTuitionPaymentFragmentbindingInflater6));
                                                int i98 = ((i96 ^ i97) | (i96 & i97)) * 345;
                                                int i99 = (i94 ^ i98) + ((i98 & i94) << 1);
                                                int i100 = ~i93;
                                                int i101 = ~iTuitionPaymentFragmentbindingInflater6;
                                                int i102 = ~((i100 ^ i101) | (i101 & i100));
                                                int i103 = ~((722537193 ^ i93) | (722537193 & i93));
                                                int i104 = -(-(((i102 ^ i103) | (i103 & i102)) * 345));
                                                int i105 = (i100 & 722537193) | (i100 ^ 722537193);
                                                int i106 = (((i99 ^ i104) + ((i104 & i99) << 1)) - (~((~((i105 & iTuitionPaymentFragmentbindingInflater6) | (i105 ^ iTuitionPaymentFragmentbindingInflater6))) * 345))) - 1;
                                                Object[] objArr22 = new Object[1];
                                                e(new char[]{49554, 59503, 61118, 50660, 46169}, new char[]{34954, 2552, 54932, 55373}, (char) ((i92 ^ 49640) + ((i92 & 49640) << i15)), new char[]{5956, 61173, 59604, 10945}, i106, objArr22);
                                                try {
                                                    Object[] objArr23 = {(String) objArr22[0]};
                                                    int i107 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    Object[] objArr24 = new Object[1];
                                                    c(null, null, (i107 & 128) + (i107 | 128), new byte[]{-95, -121, -120, -105, -106, -108, -93, -116, -105, -108, -106, -119, -94, -119, -105, -121, -116, -127, -107, -105, -121, -116, -106, -107, -95, -105, -119, -121, -114, -106, -116, -96, -107, -108, -97, -108, -98}, objArr24);
                                                    Class<?> cls5 = Class.forName((String) objArr24[0]);
                                                    char[] cArr9 = {18696, 52287, 23224, 36387, 12945, 12514, 18167, 21469, 25334, 36568, 28705};
                                                    char[] cArr10 = {34954, 2552, 54932, 55373};
                                                    int i108 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                    int iTuitionPaymentFragmentbindingInflater7 = zzir.TuitionPaymentFragmentbindingInflater1();
                                                    int i109 = asBinder + 29;
                                                    d = i109 % 128;
                                                    int i110 = i109 % 2;
                                                    int i111 = ~i108;
                                                    int i112 = ~i111;
                                                    int i113 = length;
                                                    int i114 = ~((~i108) | iTuitionPaymentFragmentbindingInflater7);
                                                    int i115 = (i108 * (-495)) + 495 + (((i112 ^ i114) | (i114 & i112)) * 992);
                                                    int i116 = (~i111) | (~((i111 & iTuitionPaymentFragmentbindingInflater7) | (i111 ^ iTuitionPaymentFragmentbindingInflater7)));
                                                    int i117 = i108 | (~iTuitionPaymentFragmentbindingInflater7);
                                                    int i118 = ~(i117 | (~i117));
                                                    int i119 = ((i116 & i118) | (i116 ^ i118)) * (-496);
                                                    int i120 = ((i115 | i119) << 1) - (i119 ^ i115);
                                                    int i121 = -(-(((iTuitionPaymentFragmentbindingInflater7 ^ (-1)) | iTuitionPaymentFragmentbindingInflater7) * 496));
                                                    char c = (char) ((i120 ^ i121) + ((i121 & i120) << 1));
                                                    int i122 = -Process.getGidForName("");
                                                    int i123 = ((i122 | 2114559591) << 1) - (i122 ^ 2114559591);
                                                    Object[] objArr25 = new Object[1];
                                                    e(cArr9, cArr10, c, new char[]{26743, 2462, 4478, 16855}, i123, objArr25);
                                                    Object objInvoke4 = cls5.getMethod((String) objArr25[0], String.class).invoke(null, objArr23);
                                                    int i124 = asBinder + 59;
                                                    d = i124 % 128;
                                                    if (i124 % 2 == 0) {
                                                        try {
                                                            i4 = -TextUtils.indexOf((CharSequence) "", (char) 26);
                                                            iTuitionPaymentFragmentbindingInflater1 = zzir.TuitionPaymentFragmentbindingInflater1();
                                                            i5 = (-381) >> i4;
                                                            i6 = ~i4;
                                                            i7 = 51;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    } else {
                                                        i4 = -TextUtils.indexOf((CharSequence) "", '0');
                                                        iTuitionPaymentFragmentbindingInflater1 = zzir.TuitionPaymentFragmentbindingInflater1();
                                                        int i125 = i4 * (-381);
                                                        i5 = ((i125 | 24192) << 1) - (i125 ^ 24192);
                                                        i6 = ~i4;
                                                        i7 = 126;
                                                    }
                                                    int i126 = ((i5 - (~(-(-((-191) * i6))))) - 1) + (((~((i7 ^ iTuitionPaymentFragmentbindingInflater1) | (i7 & iTuitionPaymentFragmentbindingInflater1))) | i4) * 191);
                                                    int i127 = ~i4;
                                                    int i128 = ~((i127 & i7) | (i127 ^ i7));
                                                    int i129 = ~iTuitionPaymentFragmentbindingInflater1;
                                                    int i130 = ~((i129 & i7) | (i129 ^ i7));
                                                    int i131 = ((i128 & i130) | (i128 ^ i130)) * 191;
                                                    Object[] objArr26 = new Object[1];
                                                    c(null, null, ((i126 | i131) << 1) - (i131 ^ i126), new byte[]{-116, -121, -114, -105, -108, -123, -113, -119, -109, -107, -102, -103, -107, -105, -123, -116, -105, -123, -120, -106, -107, -122, -119, -120, -121, -122, -123, -108}, objArr26);
                                                    Class<?> cls6 = Class.forName((String) objArr26[0]);
                                                    char[] cArr11 = {19206, 50056, 63440, 2512, 56847, 18038, 9601, 26416, 17730, 8605, 33081};
                                                    char[] cArr12 = {34954, 2552, 54932, 55373};
                                                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                                                    int iTuitionPaymentFragmentbindingInflater8 = zzir.TuitionPaymentFragmentbindingInflater1();
                                                    int i132 = iIndexOf * (-518);
                                                    int i133 = asBinder;
                                                    int i134 = (i133 & 33) + (i133 | 33);
                                                    d = i134 % 128;
                                                    int i135 = i134 % 2;
                                                    int i136 = (i132 ^ (-518)) + ((i132 & (-518)) << 1);
                                                    int i137 = ~iIndexOf;
                                                    int i138 = ~iTuitionPaymentFragmentbindingInflater8;
                                                    int i139 = (i137 ^ i138) | (i137 & i138);
                                                    int i140 = ~i139;
                                                    int i141 = -(-(((1 ^ i140) | (1 & i140)) * 519));
                                                    int i142 = (i136 & i141) + (i136 | i141);
                                                    int i143 = ~((i139 & 1) | (i139 ^ 1));
                                                    int i144 = (iIndexOf ^ 1) | (iIndexOf & 1);
                                                    int i145 = ~((i144 & iTuitionPaymentFragmentbindingInflater8) | (i144 ^ iTuitionPaymentFragmentbindingInflater8));
                                                    int i146 = ((i143 & i145) | (i143 ^ i145)) * (-519);
                                                    int i147 = ((i142 | i146) << 1) - (i142 ^ i146);
                                                    int i148 = ~((iTuitionPaymentFragmentbindingInflater8 & 1) | (iTuitionPaymentFragmentbindingInflater8 ^ 1));
                                                    int i149 = ((iIndexOf & i148) | (iIndexOf ^ i148)) * 519;
                                                    char c2 = (char) ((i147 & i149) + (i149 | i147));
                                                    char[] cArr13 = {6432, 52169, 55675, 26124};
                                                    int iMyTid = Process.myTid() >> 22;
                                                    int i150 = (iMyTid * 253) + 1483062709;
                                                    int i151 = ~iMyTid;
                                                    int i152 = ~((i151 ^ (-2076952858)) | (i151 & (-2076952858)));
                                                    int i153 = i88;
                                                    int i154 = ~i;
                                                    int i155 = ~(((-2076952858) ^ i154) | ((-2076952858) & i154));
                                                    int i156 = (i152 ^ i155) | (i155 & i152);
                                                    int i157 = (iMyTid ^ 2076952857) | (2076952857 & iMyTid);
                                                    Object obj = objNewInstance2;
                                                    int i158 = ~((i157 ^ i) | (i157 & i));
                                                    int i159 = ((i156 ^ i158) | (i156 & i158)) * (-252);
                                                    int i160 = (i150 & i159) + (i159 | i150);
                                                    int i161 = i157 * (-252);
                                                    int i162 = (i160 ^ i161) + ((i160 & i161) << 1);
                                                    int i163 = ((-2076952858) & i154) | ((-2076952858) ^ i154);
                                                    int i164 = ~((iMyTid & i163) | (i163 ^ iMyTid));
                                                    int i165 = ((i164 & i158) | (i164 ^ i158)) * 252;
                                                    int i166 = (i162 & i165) + (i162 | i165);
                                                    try {
                                                        Object[] objArr27 = new Object[1];
                                                        e(cArr11, cArr12, c2, cArr13, i166, objArr27);
                                                        try {
                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr27[0], null).invoke(r6, null));
                                                            int i167 = d;
                                                            int i168 = (i167 & 27) + (i167 | 27);
                                                            asBinder = i168 % 128;
                                                            int i169 = i168 % 2;
                                                            try {
                                                                Object[] objArr28 = {byteArrayInputStream};
                                                                int i170 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                int i171 = i170 * 70;
                                                                int i172 = (i171 ^ (-8568)) + ((i171 & (-8568)) << 1);
                                                                int i173 = d + 99;
                                                                int i174 = i173 % 128;
                                                                asBinder = i174;
                                                                if (i173 % 2 != 0) {
                                                                    try {
                                                                        throw null;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        Throwable cause2 = th.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                int i175 = ~i170;
                                                                int i176 = (i175 & ComposerKt.defaultsKey) | (i175 ^ ComposerKt.defaultsKey);
                                                                int i177 = ~((i176 & i) | (i176 ^ i));
                                                                int i178 = (i174 ^ 51) + ((i174 & 51) << 1);
                                                                int i179 = i178 % 128;
                                                                d = i179;
                                                                if (i178 % 2 == 0) {
                                                                    int i180 = ~((i170 ^ 126) | (i170 & 126) | i);
                                                                    i9 = i172 / (69 - ((i177 & i180) | (i177 ^ i180)));
                                                                    int i181 = ~i170;
                                                                    i10 = ~((i181 & 126) | (i181 ^ 126));
                                                                    i8 = 1;
                                                                } else {
                                                                    int i182 = 69 * (i177 | (~((i170 ^ 126) | (i170 & 126) | i)));
                                                                    i8 = 1;
                                                                    i9 = ((i172 & i182) << 1) + (i172 ^ i182);
                                                                    int i183 = ~i170;
                                                                    i10 = ~((i183 & 126) | (i183 ^ 126));
                                                                }
                                                                int i184 = ((i179 | 121) << i8) - (i179 ^ 121);
                                                                asBinder = i184 % 128;
                                                                int i185 = i184 % 2;
                                                                int i186 = ~i170;
                                                                if (i185 != 0) {
                                                                    int i187 = i10 | (~((i186 & i) | (i186 ^ i)));
                                                                    int i188 = ~((i ^ 126) | (i & 126));
                                                                    i11 = i9 << ((-69) * ((i187 & i188) | (i187 ^ i188)));
                                                                } else {
                                                                    int i189 = i10 | (~((i186 & i) | (i186 ^ i)));
                                                                    int i190 = ~(i | 126);
                                                                    int i191 = (-69) * ((i189 & i190) | (i189 ^ i190));
                                                                    i11 = (i9 & i191) + (i9 | i191);
                                                                }
                                                                int i192 = -(-(69 * (~(i170 | ComposerKt.defaultsKey))));
                                                                Object[] objArr29 = new Object[1];
                                                                c(null, null, (i11 ^ i192) + ((i192 & i11) << 1), new byte[]{-95, -121, -120, -105, -106, -108, -93, -116, -105, -108, -106, -119, -94, -119, -105, -121, -116, -127, -107, -105, -121, -116, -106, -107, -95, -105, -119, -121, -114, -106, -116, -96, -107, -108, -97, -108, -98}, objArr29);
                                                                Class<?> cls7 = Class.forName((String) objArr29[0]);
                                                                int i193 = -Process.getGidForName("");
                                                                Object[] objArr30 = new Object[1];
                                                                c(null, null, ((i193 | 126) << 1) - (i193 ^ 126), new byte[]{-116, -105, -108, -106, -119, -94, -119, -105, -121, -116, -127, -116, -105, -108, -121, -116, -123, -116, -113}, objArr30);
                                                                Object objInvoke5 = cls7.getMethod((String) objArr30[0], InputStream.class).invoke(objInvoke4, objArr28);
                                                                int i194 = d;
                                                                r6 = 1;
                                                                r6 = 1;
                                                                int i195 = (i194 ^ 107) + ((i194 & 107) << 1);
                                                                asBinder = i195 % 128;
                                                                int i196 = i195 % 2;
                                                                try {
                                                                    int i197 = -KeyEvent.getDeadChar(0, 0);
                                                                    int i198 = (i197 * TypedValues.Custom.TYPE_DIMENSION) - 114681;
                                                                    int i199 = ~i197;
                                                                    int i200 = ~((i199 ^ i) | (i199 & i));
                                                                    int i201 = ~((i154 ^ 127) | (i154 & 127));
                                                                    int i202 = (i198 - (~(-(-(((i200 & i201) | (i200 ^ i201)) * (-1808)))))) - 1;
                                                                    int i203 = i199 | WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                                                    int i204 = ~((i203 & i) | (i203 ^ i));
                                                                    int i205 = asBinder + 79;
                                                                    d = i205 % 128;
                                                                    int i206 = i205 % 2;
                                                                    int i207 = ~i;
                                                                    int i208 = (i207 ^ i197) | (i207 & i197);
                                                                    int i209 = ~((i208 & 127) | (i208 ^ 127));
                                                                    int i210 = (i202 - (~(TypedValues.Custom.TYPE_BOOLEAN * ((i204 & i209) | (i204 ^ i209))))) - 1;
                                                                    int i211 = ~i197;
                                                                    int i212 = ~((i211 & 127) | (i211 ^ 127));
                                                                    int i213 = ~(((-128) & i) | ((-128) ^ i));
                                                                    int i214 = (i212 & i213) | (i212 ^ i213);
                                                                    int i215 = ~((i197 & i154) | (i154 ^ i197));
                                                                    int i216 = ((i215 & i214) | (i214 ^ i215)) * TypedValues.Custom.TYPE_BOOLEAN;
                                                                    int i217 = ((i210 | i216) << 1) - (i216 ^ i210);
                                                                    Object[] objArr31 = new Object[1];
                                                                    c(null, null, i217, new byte[]{-116, -105, -108, -106, -119, -94, -119, -105, -121, -116, -127, -89, -90, -91, -92, -107, -105, -121, -116, -106, -107, -95, -105, -119, -121, -114, -106, -116, -96, -107, -108, -97, -108, -98}, objArr31);
                                                                    Class<?> cls8 = Class.forName((String) objArr31[0]);
                                                                    char[] cArr14 = {28593, 37604, 56927, 62814, 9125, 48039, 53165, 33240, 23091, 34021, 22954, 55031, 42468, 24797, 17366, 10789, 13849, 23368, 65218, 65280, 60318, 36122, 13271};
                                                                    char[] cArr15 = {34954, 2552, 54932, 55373};
                                                                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                    char[] cArr16 = {22634, 29737, 26921, 8233};
                                                                    int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                                                                    int iTuitionPaymentFragmentbindingInflater9 = zzir.TuitionPaymentFragmentbindingInflater1();
                                                                    int i218 = tapTimeout * (-589);
                                                                    int i219 = (i218 & (-1288998360)) + (i218 | (-1288998360));
                                                                    int i220 = ~iTuitionPaymentFragmentbindingInflater9;
                                                                    int i221 = ~(((-695478617) ^ i220) | ((-695478617) & i220));
                                                                    int i222 = d;
                                                                    int i223 = (i222 ^ 3) + ((i222 & 3) << 1);
                                                                    asBinder = i223 % 128;
                                                                    if (i223 % 2 != 0) {
                                                                        int i224 = ~(((-695478617) ^ tapTimeout) | ((-695478617) & tapTimeout));
                                                                        int i225 = (i221 ^ i224) | (i224 & i221) | (~((i220 ^ tapTimeout) | (i220 & tapTimeout)));
                                                                        int i226 = ~tapTimeout;
                                                                        int i227 = ~((i226 ^ 695478616) | (i226 & 695478616) | iTuitionPaymentFragmentbindingInflater9);
                                                                        i12 = i219 << (590 % ((i225 ^ i227) | (i225 & i227)));
                                                                    } else {
                                                                        int i228 = ~(((-695478617) ^ tapTimeout) | ((-695478617) & tapTimeout));
                                                                        int i229 = (i221 ^ i228) | (i228 & i221);
                                                                        int i230 = ~iTuitionPaymentFragmentbindingInflater9;
                                                                        int i231 = ~((i230 ^ tapTimeout) | (i230 & tapTimeout));
                                                                        int i232 = (i229 ^ i231) | (i229 & i231);
                                                                        int i233 = ~((~tapTimeout) | 695478616 | iTuitionPaymentFragmentbindingInflater9);
                                                                        i12 = i219 + (((i232 ^ i233) | (i232 & i233)) * 590);
                                                                    }
                                                                    int i234 = ~iTuitionPaymentFragmentbindingInflater9;
                                                                    int i235 = ~(((-695478617) & i234) | ((-695478617) ^ i234));
                                                                    int i236 = ~(((-695478617) & tapTimeout) | ((-695478617) ^ tapTimeout));
                                                                    int i237 = (i235 & i236) | (i235 ^ i236);
                                                                    int i238 = ~((i234 ^ tapTimeout) | (i234 & tapTimeout));
                                                                    int i239 = (i12 - (~(-(-((-1180) * ((i237 & i238) | (i237 ^ i238))))))) - 1;
                                                                    int i240 = ~tapTimeout;
                                                                    int i241 = ((~((i240 & i220) | (i240 ^ i220))) | (~((i234 & 695478616) | (i234 ^ 695478616)))) * 590;
                                                                    int i242 = ((i239 | i241) << 1) - (i241 ^ i239);
                                                                    Object[] objArr32 = new Object[1];
                                                                    e(cArr14, cArr15, jumpTapTimeout, cArr16, i242, objArr32);
                                                                    r6 = 0;
                                                                    if (!objNewInstance.equals(cls8.getMethod((String) objArr32[0], null).invoke(objInvoke5, null))) {
                                                                        int i243 = asBinder + 13;
                                                                        d = i243 % 128;
                                                                        int i244 = i243 % 2;
                                                                        try {
                                                                            int i245 = -(-Color.alpha(0));
                                                                            Object[] objArr33 = new Object[1];
                                                                            c(null, null, (i245 & 127) + (i245 | 127), new byte[]{-116, -105, -108, -106, -119, -94, -119, -105, -121, -116, -127, -89, -90, -91, -92, -107, -105, -121, -116, -106, -107, -95, -105, -119, -121, -114, -106, -116, -96, -107, -108, -97, -108, -98}, objArr33);
                                                                            Class<?> cls9 = Class.forName((String) objArr33[0]);
                                                                            char[] cArr17 = {28593, 37604, 56927, 62814, 9125, 48039, 53165, 33240, 23091, 34021, 22954, 55031, 42468, 24797, 17366, 10789, 13849, 23368, 65218, 65280, 60318, 36122, 13271};
                                                                            char[] cArr18 = {34954, 2552, 54932, 55373};
                                                                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                                            char[] cArr19 = {22634, 29737, 26921, 8233};
                                                                            int i246 = asBinder + 99;
                                                                            d = i246 % 128;
                                                                            int i247 = i246 % 2;
                                                                            Object[] objArr34 = new Object[1];
                                                                            e(cArr17, cArr18, cArgb, cArr19, (ViewConfiguration.getLongPressTimeout() >> 16) + 695478616, objArr34);
                                                                            r6 = (String) objArr34[0];
                                                                            if (!obj.equals(cls9.getMethod(r6, null).invoke(objInvoke5, null))) {
                                                                                i88 = ((i153 & 18) + (i153 | 18)) - 17;
                                                                                r0 = r23;
                                                                                objNewInstance2 = obj;
                                                                                i13 = i2;
                                                                                length = i113;
                                                                                i15 = 1;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            Throwable cause3 = th3.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                    Object[] objArr35 = {new int[]{i}, new int[1], new int[]{(~(i & 1)) & (i | 1)}, null};
                                                                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                                                    int i248 = ~iUptimeMillis;
                                                                    int i249 = 2070192700 + (((~(994101418 | i248)) | (~((-1034411648) | iUptimeMillis))) * (-370)) + (((~(iUptimeMillis | 994101418)) | (~(i248 | (-1034411648))) | 37748864) * (-370)) + 1082177792;
                                                                    int i250 = -(-(i249 * (-500)));
                                                                    int i251 = ((-8000) & i250) + (i250 | (-8000));
                                                                    int i252 = ~i249;
                                                                    int i253 = ~((i252 & 16) | (i252 ^ 16));
                                                                    int i254 = ~(((-17) ^ i249) | ((-17) & i249) | i);
                                                                    int i255 = ((i253 & i254) | (i253 ^ i254)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                                    int i256 = (i251 ^ i255) + ((i255 & i251) << 1);
                                                                    int i257 = ~i249;
                                                                    int i258 = d + 19;
                                                                    int i259 = i258 % 128;
                                                                    asBinder = i259;
                                                                    int i260 = i258 % 2;
                                                                    int i261 = -(-(1002 * (~((i257 & (-17)) | ((-17) ^ i257)))));
                                                                    int i262 = (i256 & i261) + (i261 | i256);
                                                                    int i263 = (~(((-17) ^ i154) | ((-17) & i154) | i249)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                                    int i264 = (i262 & i263) + (i263 | i262);
                                                                    int i265 = (i264 * TypedValues.Custom.TYPE_DIMENSION) + (i2 * (-903));
                                                                    int i266 = ~i264;
                                                                    int i267 = (i265 - (~(((~((i266 ^ i) | (i266 & i))) | (~((i207 ^ i2) | (i207 & i2)))) * (-1808)))) - 1;
                                                                    int i268 = ~i264;
                                                                    int i269 = ~i2;
                                                                    int i270 = (i268 & i269) | (i268 ^ i269);
                                                                    int i271 = ~((i270 & i) | (i270 ^ i));
                                                                    int i272 = ~((i154 ^ i264) | (i154 & i264) | i2);
                                                                    int i273 = (i267 - (~(-(-(((i271 & i272) | (i271 ^ i272)) * TypedValues.Custom.TYPE_BOOLEAN))))) - 1;
                                                                    int i274 = ~(i266 | i2);
                                                                    int i275 = ~((i269 ^ i) | (i269 & i));
                                                                    int i276 = (i259 ^ 79) + ((i259 & 79) << 1);
                                                                    d = i276 % 128;
                                                                    int i277 = i276 % 2;
                                                                    int i278 = -(-(TypedValues.Custom.TYPE_BOOLEAN * ((~(i264 | i154)) | (i274 & i275) | (i274 ^ i275))));
                                                                    int i279 = (i273 & i278) + (i273 | i278);
                                                                    int i280 = (i279 << 13) ^ i279;
                                                                    int i281 = i280 >>> 17;
                                                                    int i282 = ((~i280) & i281) | ((~i281) & i280);
                                                                    int i283 = i282 << 5;
                                                                    ((int[]) objArr35[1])[0] = (i282 | i283) & (~(i282 & i283));
                                                                    return objArr35;
                                                                } catch (Throwable th4) {
                                                                    Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                            }
                                                        } catch (Throwable unused) {
                                                            r6 = i2;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    Throwable cause5 = th7.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th7;
                                                }
                                            } else {
                                                r6 = i13;
                                            }
                                            i3 = 4;
                                            r5 = r6;
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause6 = th8.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause7 = th9.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause8 = th10.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause9 = th11.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th11;
                        }
                    } catch (Throwable th12) {
                        Throwable cause10 = th12.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th12;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
        } else {
            r5 = i13;
            i3 = 4;
        }
        Object[] objArr36 = new Object[i3];
        objArr36[0] = new int[]{i};
        objArr36[1] = new int[1];
        objArr36[2] = new int[]{i};
        objArr36[3] = null;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i284 = (~(496733188 | iMaxMemory)) | 536879577;
        int i285 = ~iMaxMemory;
        int i286 = 217446702 + ((i284 | (~((-496569349) | i285))) * 886) + (((~(i285 | (-496733189))) | 537043417) * (-1772)) + ((~(i285 | 537043417)) * 886);
        int iTuitionPaymentFragmentbindingInflater10 = zzir.TuitionPaymentFragmentbindingInflater1();
        int i287 = i286 * (-375);
        int i288 = (i287 << 1) - i287;
        int i289 = ~i286;
        int i290 = ~(i289 | ((-1) ^ i289));
        int i291 = (i290 & iTuitionPaymentFragmentbindingInflater10) | (iTuitionPaymentFragmentbindingInflater10 ^ i290);
        int i292 = ~i286;
        int i293 = ((i291 & i292) | (i291 ^ i292)) * 376;
        int i294 = (i288 & i293) + (i293 | i288);
        int i295 = ~(~iTuitionPaymentFragmentbindingInflater10);
        int i296 = d;
        int i297 = i296 + 71;
        asBinder = i297 % 128;
        int i298 = i297 % 2;
        int i299 = -(-((-376) * (i295 | (~i286))));
        int i300 = (i294 ^ i299) + ((i299 & i294) << 1);
        int i301 = i286 * 376;
        int i302 = -(-((i300 & i301) + (i300 | i301)));
        int i303 = (r5 & i302) + (i302 | r5);
        int i304 = i303 << 13;
        int i305 = ((i296 | 89) << 1) - (i296 ^ 89);
        asBinder = i305 % 128;
        int i306 = i305 % 2;
        int i307 = (i304 & (~i303)) | ((~i304) & i303);
        int i308 = i307 ^ (i307 >>> 17);
        int i309 = i308 << 5;
        ((int[]) objArr36[1])[0] = (i308 | i309) & (~(i308 & i309));
        return objArr36;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = kotlin.collections.builders.MapBuilderEntries.$$a
            int r7 = r7 + 4
            int r6 = 104 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilderEntries.$$c(byte, byte, byte):java.lang.String");
    }
}
