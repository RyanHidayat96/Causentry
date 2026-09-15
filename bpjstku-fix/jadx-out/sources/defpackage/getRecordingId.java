package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bpjstku.util.custom.WrapContentLinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sofakingforever.repoverse.IllegalVersionFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes5.dex */
public final class getRecordingId implements Comparable<getRecordingId> {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String b;
    private static final byte[] $$c = {114, -59, 10, 31};
    private static final int $$d = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {39, -79, 42};
    private static final int $$b = 244;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getRecordingId.$$a
            int r7 = r7 + 97
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 + 3
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRecordingId.c(int, int, byte, java.lang.Object[]):void");
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(getRecordingId getrecordingid) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getrecordingid);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return iTuitionPaymentFragmentbindingInflater1;
    }

    public getRecordingId(String str) throws IllegalVersionFormatException {
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
            throw new IllegalVersionFormatException(str);
        }
        this.b = str;
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.b;
        int i4 = i2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int TuitionPaymentFragmentbindingInflater1(getRecordingId getrecordingid) {
        List listEmptyList;
        List listEmptyList2;
        ListIterator<String> listIterator;
        int i = 2 % 2;
        List<String> listSplit = new Regex("\\.").split(this.b, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ListIterator<String> listIterator2 = listSplit.listIterator(listSplit.size());
            while (true) {
                if (listIterator2.hasPrevious()) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
                    TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 95 / 0;
                        if (listIterator2.previous().length() != 0) {
                            listEmptyList = CollectionsKt.take(listSplit, listIterator2.nextIndex() + 1);
                        }
                    } else if (listIterator2.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator2.nextIndex() + 1);
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
        }
        List list = listEmptyList;
        if (list == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] array = list.toArray(new String[list.size()]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        List<String> listSplit2 = new Regex("\\.").split(getrecordingid.b, 0);
        if (listSplit2.isEmpty()) {
            listEmptyList2 = CollectionsKt.emptyList();
            break;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 103;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            listIterator = listSplit2.listIterator(listSplit2.size());
            int i5 = 14 / 0;
        } else {
            listIterator = listSplit2.listIterator(listSplit2.size());
        }
        while (true) {
            if (!listIterator.hasPrevious()) {
                listEmptyList2 = CollectionsKt.emptyList();
                break;
            }
            int i6 = TuitionPaymentFragmentbindingInflater1 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 == 0) {
                listIterator.previous().length();
                throw null;
            }
            if (listIterator.previous().length() != 0) {
                listEmptyList2 = CollectionsKt.take(listSplit2, listIterator.nextIndex() + 1);
                break;
            }
        }
        List list2 = listEmptyList2;
        if (list2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] array2 = list2.toArray(new String[list2.size()]);
        if (array2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        int i7 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        int i8 = i7 % 2;
        String[] strArr2 = (String[]) array2;
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        int iMax = Math.max(strArr3.length, strArr4.length);
        int i9 = 0;
        while (i9 < iMax) {
            int iCompare = Intrinsics.compare(i9 < strArr3.length ? Integer.parseInt(strArr[i9]) : 0, i9 < strArr4.length ? Integer.parseInt(strArr2[i9]) : 0);
            if (iCompare != 0) {
                return iCompare;
            }
            i9++;
        }
        return 0;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 97;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2186 - ExpandableListView.getPackedPositionChild(0L), 40 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 841711447, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16744199) - Color.rgb(0, 0, 0)), 3011 - TextUtils.indexOf("", "", 0, 0), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 321985076, false, $$e(b3, b4, (byte) (b4 - 3)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 3376, ((Process.getThreadPriority(0) + 20) >> 6) + 17, -968507904, false, $$e(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i7 = $11 + 55;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 / 4;
        }
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 36505), 3376 - Color.alpha(0), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -968507904, false, $$e(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:183:0x0d34  */
    /* JADX WARN: Code duplicated, block: B:292:0x12a3  */
    /* JADX WARN: Code duplicated, block: B:295:0x132a  */
    /* JADX WARN: Code duplicated, block: B:298:0x1339 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x137c  */
    /* JADX WARN: Code duplicated, block: B:304:0x141e A[LOOP:4: B:293:0x1327->B:304:0x141e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x143d  */
    /* JADX WARN: Code duplicated, block: B:310:0x14a5  */
    /* JADX WARN: Code duplicated, block: B:313:0x14c0 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x1505  */
    /* JADX WARN: Code duplicated, block: B:319:0x15cf A[LOOP:5: B:309:0x14a3->B:319:0x15cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:324:0x160c A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x16e1 A[Catch: all -> 0x0266, TRY_ENTER, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x16f3 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x17d8  */
    /* JADX WARN: Code duplicated, block: B:336:0x17e9  */
    /* JADX WARN: Code duplicated, block: B:337:0x17ef  */
    /* JADX WARN: Code duplicated, block: B:338:0x17f8  */
    /* JADX WARN: Code duplicated, block: B:342:0x1848 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:345:0x1890 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:347:0x18a8 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x18e6  */
    /* JADX WARN: Code duplicated, block: B:352:0x1961  */
    /* JADX WARN: Code duplicated, block: B:353:0x1968  */
    /* JADX WARN: Code duplicated, block: B:356:0x25a3  */
    /* JADX WARN: Code duplicated, block: B:359:0x25b4 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:360:0x2606  */
    /* JADX WARN: Code duplicated, block: B:376:0x2646  */
    /* JADX WARN: Code duplicated, block: B:381:0x26f2  */
    /* JADX WARN: Code duplicated, block: B:382:0x2707  */
    /* JADX WARN: Code duplicated, block: B:385:0x2743  */
    /* JADX WARN: Code duplicated, block: B:386:0x274a  */
    /* JADX WARN: Code duplicated, block: B:391:0x278d A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:394:0x27d1  */
    /* JADX WARN: Code duplicated, block: B:395:0x27d6 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:397:0x27ee A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:402:0x28ed  */
    /* JADX WARN: Code duplicated, block: B:428:0x2f89  */
    /* JADX WARN: Code duplicated, block: B:432:0x3204  */
    /* JADX WARN: Code duplicated, block: B:434:0x3215  */
    /* JADX WARN: Code duplicated, block: B:435:0x321a  */
    /* JADX WARN: Code duplicated, block: B:438:0x322b  */
    /* JADX WARN: Code duplicated, block: B:447:0x3252  */
    /* JADX WARN: Code duplicated, block: B:449:0x3255 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:452:0x325f  */
    /* JADX WARN: Code duplicated, block: B:453:0x326c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:454:0x326e  */
    /* JADX WARN: Code duplicated, block: B:456:0x3272  */
    /* JADX WARN: Code duplicated, block: B:459:0x3277  */
    /* JADX WARN: Code duplicated, block: B:462:0x3311 A[Catch: all -> 0x339c, IOException -> 0x33b8, TryCatch #0 {IOException -> 0x33b8, blocks: (B:461:0x330c, B:463:0x331d, B:462:0x3311), top: B:589:0x330c }] */
    /* JADX WARN: Code duplicated, block: B:466:0x3326 A[LOOP:12: B:457:0x3273->B:466:0x3326, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:471:0x3348 A[LOOP:11: B:455:0x3270->B:471:0x3348, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:478:0x3389  */
    /* JADX WARN: Code duplicated, block: B:479:0x338b  */
    /* JADX WARN: Code duplicated, block: B:507:0x3459  */
    /* JADX WARN: Code duplicated, block: B:509:0x345c  */
    /* JADX WARN: Code duplicated, block: B:511:0x346d A[Catch: all -> 0x34f0, IOException -> 0x34f4, TRY_ENTER, TRY_LEAVE, TryCatch #41 {IOException -> 0x34f4, all -> 0x34f0, blocks: (B:504:0x344f, B:505:0x3452, B:511:0x346d, B:522:0x3491), top: B:633:0x344f }] */
    /* JADX WARN: Code duplicated, block: B:515:0x3482  */
    /* JADX WARN: Code duplicated, block: B:516:0x3485  */
    /* JADX WARN: Code duplicated, block: B:517:0x3488 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:520:0x348e  */
    /* JADX WARN: Code duplicated, block: B:522:0x3491 A[Catch: all -> 0x34f0, IOException -> 0x34f4, TRY_ENTER, TRY_LEAVE, TryCatch #41 {IOException -> 0x34f4, all -> 0x34f0, blocks: (B:504:0x344f, B:505:0x3452, B:511:0x346d, B:522:0x3491), top: B:633:0x344f }] */
    /* JADX WARN: Code duplicated, block: B:525:0x34a7 A[LOOP:16: B:521:0x348f->B:525:0x34a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:529:0x34bb A[LOOP:15: B:519:0x348c->B:529:0x34bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:534:0x34de  */
    /* JADX WARN: Code duplicated, block: B:535:0x34e0  */
    /* JADX WARN: Code duplicated, block: B:539:0x34ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x0645  */
    /* JADX WARN: Code duplicated, block: B:558:0x3561 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:6:0x0149, B:8:0x0156, B:9:0x0190, B:28:0x03a6, B:30:0x03b3, B:31:0x03f0, B:38:0x04dc, B:40:0x04e9, B:41:0x0525, B:65:0x06fb, B:67:0x0701, B:68:0x0736, B:126:0x0a33, B:128:0x0a40, B:129:0x0a7e, B:136:0x0b9a, B:138:0x0ba7, B:139:0x0be3, B:196:0x0d84, B:198:0x0d91, B:200:0x0dce, B:217:0x0f90, B:219:0x0f9d, B:220:0x0fe0, B:228:0x1062, B:230:0x106f, B:231:0x10af, B:296:0x132c, B:298:0x1339, B:300:0x1380, B:311:0x14b3, B:313:0x14c0, B:315:0x1509, B:322:0x1606, B:324:0x160c, B:325:0x163e, B:328:0x16e1, B:330:0x16f3, B:331:0x172f, B:340:0x183b, B:342:0x1848, B:343:0x1887, B:345:0x1890, B:347:0x18a8, B:349:0x18e8, B:389:0x2780, B:391:0x278d, B:392:0x27c8, B:409:0x2c5d, B:411:0x2c6a, B:412:0x2ca9, B:418:0x2e61, B:420:0x2e6e, B:421:0x2ea2, B:556:0x3554, B:558:0x3561, B:559:0x3597, B:395:0x27d6, B:397:0x27ee, B:398:0x2826, B:357:0x25a7, B:359:0x25b4, B:361:0x260c, B:46:0x05ee, B:48:0x05fb, B:49:0x0634, B:55:0x067d, B:57:0x068a, B:58:0x06c4), top: B:591:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:561:0x3629  */
    /* JADX WARN: Code duplicated, block: B:589:0x330c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x33ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x3238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x3443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x142c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x1413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x15e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x15c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x33d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x3391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x3391 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x33c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x33bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x33bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x3383 A[EDGE_INSN: B:675:0x3383->B:476:0x3383 BREAK  A[LOOP:9: B:629:0x324c->B:475:0x3372], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x3353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x3346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x3322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x333b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x34dc A[EDGE_INSN: B:685:0x34dc->B:533:0x34dc BREAK  A[LOOP:13: B:505:0x3452->B:686:0x3452], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x3452 A[EDGE_INSN: B:688:0x3452->B:686:0x3452 BREAK  A[LOOP:14: B:508:0x345a->B:694:0x345a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x348a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x3473 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x34d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x34d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x34c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x34b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x34a3 A[SYNTHETIC] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        String str;
        int i4;
        int i5;
        int deadChar;
        int size;
        int capsMode;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iLastIndexOf;
        char c;
        int i11;
        int i12;
        int i13;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i14;
        byte[] bArr;
        byte[] bArr2;
        int i15;
        String str2;
        int i16;
        int i17;
        int i18;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i19;
        String str3;
        int i20;
        char c2;
        int i21;
        int i22;
        char c3;
        int iAxisFromString;
        String[] strArr;
        int iResolveSizeAndState;
        int maxKeyCode;
        char c4;
        int i23;
        int i24;
        BufferedInputStream bufferedInputStream5;
        int i25;
        BufferedInputStream bufferedInputStream6;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        String[] strArr2;
        String str4;
        int i32;
        int i33;
        long j;
        int i34;
        int i35;
        int i36;
        int i37;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i38;
        int i39;
        int i40;
        int length;
        int i41;
        String[] strArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        long j2;
        int i42;
        int i43;
        int i44;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objInvoke;
        String str5;
        float f;
        String[][] strArr4;
        StringBuilder sb;
        char c5;
        int i45;
        int i46;
        int i47;
        int i48;
        long j3;
        char c6;
        Object[] objArr;
        int i49;
        int i50;
        int i51;
        int i52;
        Object obj;
        String[] strArr5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        String str6;
        int i53;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objInvoke2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i54;
        int i55;
        String[][] strArr6;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        String str7;
        byte[] bytes;
        BufferedInputStream bufferedInputStream7;
        byte[] bArr3;
        int i62;
        int i63;
        boolean z;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        boolean z2;
        int i70;
        int i71;
        String[] strArr7;
        String str8;
        String[] strArr8;
        int length2;
        int i72;
        byte[] bytes2;
        int length3;
        BufferedInputStream bufferedInputStream8;
        String[][] strArr9;
        String[] strArr10;
        String str9;
        int i73;
        int i74;
        byte[] bArr4;
        int i75;
        int i76;
        int i77;
        boolean z3;
        int i78;
        int i79;
        byte[] bArr5;
        int i80;
        boolean z4;
        boolean z5;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        byte b;
        int i86;
        int i87;
        int i88;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        long j4;
        int i89;
        int i90;
        int i91;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        long j5;
        int i92;
        int iMyUid;
        int i93;
        int i94;
        String[] strArr11;
        int i95;
        int i96;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        long j6;
        int i97;
        int startUptimeMillis;
        int i98 = i;
        int i99 = 2 % 2;
        int i100 = 0;
        int threadPriority = Process.getThreadPriority(0);
        int i101 = 1;
        int i102 = -(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6);
        int i103 = (i102 ^ 908) + ((i102 & 908) << 1);
        int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
        int i104 = ((keyRepeatTimeout | 8) << 1) - (keyRepeatTimeout ^ 8);
        int threadPriority2 = Process.getThreadPriority(0);
        Object[] objArr2 = new Object[1];
        a(i103, i104, (char) ((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6), objArr2);
        String str10 = (String) objArr2[0];
        new ArrayList();
        String str11 = "";
        int i105 = -(-TextUtils.indexOf((CharSequence) "", '0'));
        int i106 = ((i105 | 1) << 1) - (i105 ^ 1);
        int mode = 27 - View.MeasureSpec.getMode(0);
        int i107 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i108 = i107 * (-1529);
        int i109 = (i108 ^ (-9540832)) + ((i108 & (-9540832)) << 1);
        int i110 = ~i107;
        int i111 = (i110 & (-12489)) | (i110 ^ (-12489));
        int i112 = ~i98;
        int i113 = ~((i111 ^ i112) | (i111 & i112));
        int i114 = (i110 ^ 12488) | (i110 & 12488);
        int i115 = ~((i114 & i98) | (i114 ^ i98));
        int i116 = (i115 & i113) | (i113 ^ i115);
        int i117 = ~((-12489) | i107 | i98);
        int i118 = i109 + (((i116 & i117) | (i116 ^ i117)) * 765);
        int i119 = ~i111;
        int i120 = ~i98;
        int i121 = ~((i110 ^ i120) | (i110 & i120));
        int i122 = ((i119 & i121) | (i119 ^ i121)) * 1530;
        int i123 = ((i118 | i122) << 1) - (i122 ^ i118);
        int i124 = ~((i110 ^ i98) | (i110 & i98));
        int i125 = ((-12489) & i112) | ((-12489) ^ i112);
        int i126 = ~((i107 & i125) | (i125 ^ i107));
        char c7 = (char) (i123 + (((i124 & i126) | (i124 ^ i126)) * 765));
        Object[] objArr3 = new Object[1];
        a(i106, mode, c7, objArr3);
        String str12 = (String) objArr3[0];
        int i127 = -View.MeasureSpec.makeMeasureSpec(0, 0);
        int i128 = ((i127 | 27) << 1) - (i127 ^ 27);
        int i129 = -Color.green(0);
        Object[] objArr4 = new Object[1];
        a(i128, ((i129 | 25) << 1) - (i129 ^ 25), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        String str13 = (String) objArr4[0];
        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 53;
        int threadPriority3 = Process.getThreadPriority(0);
        Object[] objArr5 = new Object[1];
        a(iIndexOf, (((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6) + 18, (char) (12298 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr5);
        String str14 = (String) objArr5[0];
        int iResolveOpacity = Drawable.resolveOpacity(0, 0);
        int i130 = (iResolveOpacity ^ 70) + ((iResolveOpacity & 70) << 1);
        int i131 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
        int i132 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
        Object[] objArr6 = new Object[1];
        a(i130, i131, (char) (((i132 | 9463) << 1) - (i132 ^ 9463)), objArr6);
        String[] strArr12 = {str12, str13, str14, (String) objArr6[0]};
        int i133 = 0;
        while (true) {
            if (i133 >= 4) {
                str = str10;
                i4 = i98;
                break;
            }
            try {
                Object[] objArr7 = {strArr12[i133]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int mode2 = 993 - View.MeasureSpec.getMode(i100);
                    int iMyTid = 8 - (Process.myTid() >> 22);
                    byte b2 = (byte) (-1);
                    Object[] objArr8 = new Object[i101];
                    c(b2, (byte) (b2 & 6), (byte) i100, objArr8);
                    String str15 = (String) objArr8[i100];
                    Class[] clsArr = new Class[i101];
                    clsArr[i100] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(keyRepeatTimeout2, mode2, iMyTid, -545305915, false, str15, clsArr);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr7)).longValue();
                long j7 = 51654299;
                int i134 = i133;
                long j8 = (((long) (-589)) * j7) + (((long) 591) * jLongValue);
                long j9 = 590;
                String[] strArr13 = strArr12;
                long j10 = -1;
                long j11 = jLongValue ^ j10;
                str = str10;
                long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                long j12 = startElapsedRealtime ^ j10;
                long j13 = ((j11 | j12) ^ j10) | ((j11 | j7) ^ j10) | ((j12 | j7) ^ j10);
                long j14 = j7 ^ j10;
                long j15 = j8 + ((j13 | (((j14 | jLongValue) | startElapsedRealtime) ^ j10)) * j9) + (((long) (-1180)) * j13) + (j9 * ((j10 ^ (j12 | jLongValue)) | ((j14 | j12) ^ j10))) + ((long) 568804985);
                i98 = i;
                int i135 = ((int) (j15 >> 32)) & ((-852575102) + (((~((-1238567566) | i112)) | (-1619173320)) * (-328)) + (((-1619173320) | i98) * 164) + (((~(1238567565 | i98)) | (-1775476688) | (~((-1082264198) | i112))) * 164));
                int i136 = ((int) j15) & ((-2012677626) + (((~(i112 | (-1540062494))) | 1506433036 | (~((-69206627) | i98))) * 717) + (((~((-1540062494) | i98)) | (~((-69206627) | i112)) | 1506433036) * 717));
                if (((i135 & i136) | (i135 ^ i136)) != 0) {
                    int i137 = ((i134 | 190) << 1) - (i134 ^ 190);
                    i4 = (i137 | i98) & (~(i98 & i137));
                    break;
                }
                i133 = ((i134 | 1) << 1) - (i134 ^ 1);
                strArr12 = strArr13;
                str10 = str;
                i100 = 0;
                i101 = 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i138 = 3;
        String[] strArr14 = new String[3];
        int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
        Object[] objArr9 = new Object[1];
        a((pressedStateDuration & 98) + (pressedStateDuration | 98), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr9);
        String str16 = (String) objArr9[0];
        int i139 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i139 % 128;
        if (i139 % 2 == 0) {
            strArr14[0] = str16;
            i5 = 1;
            deadChar = 119 << KeyEvent.getDeadChar(1, 1);
            size = 24 % View.MeasureSpec.getSize(0);
            capsMode = TextUtils.getCapsMode("", 0, 1);
            i6 = 24283;
        } else {
            i5 = 1;
            strArr14[0] = str16;
            int i140 = -KeyEvent.getDeadChar(0, 0);
            deadChar = ((i140 & 110) << 1) + (i140 ^ 110);
            size = View.MeasureSpec.getSize(0) + 13;
            capsMode = TextUtils.getCapsMode("", 0, 0);
            i6 = 15565;
        }
        int i141 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i142 = ((i141 | 95) << i5) - (i141 ^ 95);
        TuitionPaymentFragmentbindingInflater1 = i142 % 128;
        if (i142 % 2 != 0) {
            int i143 = -capsMode;
            i8 = 1;
            Object[] objArr10 = new Object[1];
            a(deadChar, size, (char) ((i6 ^ i143) + ((i143 & i6) << 1)), objArr10);
            i7 = 0;
            strArr14[1] = (String) objArr10[0];
            i9 = 122 >>> (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            iLastIndexOf = TextUtils.lastIndexOf("", 'E', 1, 0);
            c = 5;
            i10 = 117;
        } else {
            i7 = 0;
            i8 = 1;
            char c8 = (char) (((i6 | capsMode) << 1) - (capsMode ^ i6));
            Object[] objArr11 = new Object[1];
            a(deadChar, size, c8, objArr11);
            strArr14[1] = (String) objArr11[0];
            i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 122;
            i10 = 19;
            iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
            c = 2;
        }
        int i144 = (i10 - (~iLastIndexOf)) - i8;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i7);
        int iTuitionPaymentFragmentbindingInflater1 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
        int i145 = absoluteGravity * 659;
        int i146 = (i145 ^ (-14041404)) + ((i145 & (-14041404)) << i8);
        int i147 = ~absoluteGravity;
        int i148 = ~((i147 & 21372) | (i147 ^ 21372));
        int i149 = ~(((-21373) & absoluteGravity) | ((-21373) ^ absoluteGravity));
        int i150 = (i148 & i149) | (i148 ^ i149);
        int i151 = ~((iTuitionPaymentFragmentbindingInflater1 & absoluteGravity) | (absoluteGravity ^ iTuitionPaymentFragmentbindingInflater1));
        int i152 = ((i150 & i151) | (i150 ^ i151)) * (-658);
        int i153 = ((i146 | i152) << 1) - (i146 ^ i152);
        int i154 = -(-((~(((-21373) & absoluteGravity) | ((-21373) ^ absoluteGravity))) * 658));
        int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
        int i156 = ~((absoluteGravity & (-21373)) | ((-21373) ^ absoluteGravity));
        int i157 = ((i151 & i156) | (i156 ^ i151)) * 658;
        Object[] objArr12 = new Object[1];
        a(i9, i144, (char) ((i155 & i157) + (i157 | i155)), objArr12);
        strArr14[c] = (String) objArr12[0];
        int i158 = 0;
        while (true) {
            if (i158 >= i138) {
                i11 = i120;
                i12 = i98;
                break;
            }
            Object[] objArr13 = {strArr14[i158]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 993;
                int iArgb = 8 - Color.argb(0, 0, 0, 0);
                byte b3 = (byte) (-1);
                Object[] objArr14 = new Object[1];
                c(b3, (byte) (b3 & 6), (byte) 0, objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(doubleTapTimeout, scrollBarSize, iArgb, -545305915, false, (String) objArr14[0], new Class[]{String.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr13)).longValue();
            long j16 = -1205670576;
            long j17 = (((long) (-464)) * j16) + (((long) (-929)) * jLongValue2);
            String[] strArr15 = strArr14;
            int i159 = i158;
            long j18 = -1;
            long j19 = j16 ^ j18;
            i11 = i120;
            long j20 = i98;
            long j21 = jLongValue2 | j20;
            long j22 = j17 + (((long) (-465)) * (j19 | (j21 ^ j18))) + (((long) 930) * (((j20 | j19) ^ j18) | jLongValue2)) + (((long) 465) * (j21 | j19)) + ((long) 1826129860);
            int i160 = ~((-131745104) | i98);
            int i161 = ((int) (j22 >> 32)) & ((-958007842) + (((-1568971515) | i160) * (-220)) + ((i160 | 39470341) * 220) + 725344204);
            int i162 = ((int) j22) & ((-1687905466) + (((~((-1506771441) | i112)) | 1350969445) * (-90)) + (((~((-1506771441) | i98)) | (-1506781686)) * (-45)) + (((-1506771441) | (~((-1350969446) | i98)) | (~(i112 | 1350969445))) * 45));
            if (((i161 & i162) | (i161 ^ i162)) != 0) {
                int i163 = i159 + 270;
                i12 = (~(i98 & i163)) & (i98 | i163);
                break;
            }
            i158 = i159 + 1;
            strArr14 = strArr15;
            i120 = i11;
            i138 = 3;
        }
        int i164 = ((~i4) & i98) | (i4 & i112);
        int i165 = -i164;
        int i166 = ((i164 & i165) | (i164 ^ i165)) >> 31;
        int i167 = (i4 & i166) | (i12 & (~i166));
        int i168 = -(-(ViewConfiguration.getTouchSlop() >> 8));
        int i169 = -(-View.resolveSizeAndState(0, 0, 0));
        Object[] objArr15 = new Object[1];
        a((i168 & 141) + (i168 | 141), (i169 ^ 14) + ((i169 & 14) << 1), (char) (0 - (~TextUtils.indexOf((CharSequence) "", '0', 0, 0))), objArr15);
        Object[] objArr16 = {(String) objArr15[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int scrollBarSize2 = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
            int iIndexOf2 = 7 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte b4 = (byte) (-1);
            Object[] objArr17 = new Object[1];
            c(b4, (byte) (b4 & 6), (byte) 0, objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(offsetAfter, scrollBarSize2, iIndexOf2, -545305915, false, (String) objArr17[0], new Class[]{String.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr16)).longValue();
        long j23 = 213489193;
        long j24 = 983;
        long j25 = -1;
        long j26 = jLongValue3 ^ j25;
        long j27 = (((long) (-1965)) * j23) + (((long) 984) * jLongValue3) + ((j23 | j26) * j24);
        long j28 = j23 ^ j25;
        long startUptimeMillis2 = ((long) ((int) Process.getStartUptimeMillis())) ^ j25;
        long j29 = j27 + (((long) (-983)) * (j28 | ((j26 | startUptimeMillis2) ^ j25))) + (j24 * (((j28 | startUptimeMillis2) ^ j25) | ((jLongValue3 | j28) ^ j25))) + ((long) 406970091);
        int i170 = i;
        int i171 = ((int) (j29 >> 32)) & ((-2072279902) + ((~(i112 | (-1251478150))) * (-116)) + (((-1603836550) | i170) * 116) + (((~(1253904335 | i170)) | (-1606262736)) * 116));
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i172 = ~iElapsedRealtime;
        int i173 = ((int) j29) & (((((~(383200502 | i172)) | (~((-1054025908) | iElapsedRealtime))) * 959) - 513694447) + (((~(iElapsedRealtime | 383200502)) | (~(i172 | (-1054025908)))) * 959));
        if (((i171 & i173) | (i171 ^ i173)) != 0) {
            i13 = i170 ^ 266;
        } else {
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + ModuleDescriptor.MODULE_VERSION;
            int iResolveSize = View.resolveSize(0, 0);
            Object[] objArr18 = new Object[1];
            a(minimumFlingVelocity, ((iResolveSize | 24) << 1) - (iResolveSize ^ 24), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1136), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char trimmedLength = (char) (33602 - TextUtils.getTrimmedLength(""));
                int iMyTid2 = (Process.myTid() >> 22) + 3085;
                int iAxisFromString2 = 25 - MotionEvent.axisFromString("");
                byte b5 = (byte) (-1);
                byte b6 = (byte) (-b5);
                Object[] objArr20 = new Object[1];
                c(b5, b6, (byte) (b6 - 1), objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength, iMyTid2, iAxisFromString2, 1411172903, false, (String) objArr20[0], new Class[]{String.class});
            }
            String str17 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr19);
            if (str17 == null || str17.isEmpty()) {
                int i174 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i175 = (i174 & 180) + (i174 | 180);
                int i176 = -(-(Process.myPid() >> 22));
                int i177 = ((i176 | 24) << 1) - (i176 ^ 24);
                int i178 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr21 = new Object[1];
                a(i175, i177, (char) ((i178 ^ 30266) + ((i178 & 30266) << 1)), objArr21);
                Object[] objArr22 = {(String) objArr21[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                    int iIndexOf3 = 3085 - TextUtils.indexOf("", "", 0, 0);
                    int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (-b7);
                    Object[] objArr23 = new Object[1];
                    c(b7, b8, (byte) (b8 - 1), objArr23);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(tapTimeout, iIndexOf3, iMakeMeasureSpec, 1411172903, false, (String) objArr23[0], new Class[]{String.class});
                }
                String str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr22);
                if (str18 != null) {
                    int i179 = TuitionPaymentFragmentbindingInflater1 + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i179 % 128;
                    int i180 = i179 % 2;
                    if (!str18.isEmpty()) {
                        i13 = i170 ^ 267;
                    }
                }
                i13 = i170;
            } else {
                i13 = i170 ^ 267;
            }
        }
        int i181 = (~(i170 & i167)) & (i170 | i167);
        int i182 = -i181;
        int i183 = ((i181 & i182) | (i181 ^ i182)) >> 31;
        int i184 = i13 & (~i183);
        int i185 = i167 & i183;
        int i186 = (i184 & i185) | (i184 ^ i185);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char cAlpha = (char) (56827 - Color.alpha(0));
            int iBlue = 2814 - Color.blue(0);
            int i187 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8;
            byte b9 = (byte) (-1);
            byte b10 = (byte) (-b9);
            Object[] objArr24 = new Object[1];
            c(b9, b10, (byte) (b10 - 1), objArr24);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cAlpha, iBlue, i187, -1639816125, false, (String) objArr24[0], new Class[0]);
        }
        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, null)).longValue();
        long j30 = 359788343;
        long j31 = (((long) (-589)) * j30) + (((long) 591) * jLongValue4);
        long j32 = 590;
        long j33 = jLongValue4 ^ j25;
        long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
        long j34 = startUptimeMillis3 ^ j25;
        long j35 = ((j33 | j34) ^ j25) | ((j33 | j30) ^ j25) | ((j34 | j30) ^ j25);
        long j36 = j30 ^ j25;
        long j37 = j31 + (((((j36 | jLongValue4) | startUptimeMillis3) ^ j25) | j35) * j32) + (((long) (-1180)) * j35) + (j32 * (((j34 | jLongValue4) ^ j25) | ((j36 | j34) ^ j25))) + ((long) 1753568163);
        int iMyPid = Process.myPid();
        int i188 = ((int) (j37 >> 32)) & (1408982147 + (((~((-585691640) | iMyPid)) | 2022918050) * 191) + (((~((~iMyPid) | (-585691640))) | 545276322) * 191));
        int iMyUid2 = Process.myUid();
        int i189 = ~((-21233666) | iMyUid2);
        int i190 = ((int) j37) & ((-809561255) + ((672211208 | i189) * (-476)) + (i189 * 952) + ((~((~iMyUid2) | (-21233666))) * 476));
        int i191 = (i188 & i190) | (i188 ^ i190);
        int i192 = -(-(i191 * (-753)));
        int i193 = (((-755) | i192) << 1) - (i192 ^ (-755));
        int i194 = ~i191;
        int i195 = ~i170;
        int i196 = (i194 & i195) | (i194 ^ i195);
        int i197 = ~((i191 ^ i170) | (i191 & i170));
        int i198 = ((i196 & i197) | (i196 ^ i197)) * (-754);
        int i199 = (i193 ^ i198) + ((i198 & i193) << 1);
        int i200 = ~(i191 | i170);
        int i201 = ~(((-1) ^ i191) | i191);
        int i202 = -(-(((i200 & i201) | (i200 ^ i201)) * (-754)));
        int i203 = (i199 ^ i202) + ((i202 & i199) << 1);
        int i204 = i11;
        int i205 = -(-(i204 * 754));
        int i206 = (i203 ^ i205) + ((i203 & i205) << 1) + 200;
        int i207 = (~(i170 & i206)) & (i170 | i206);
        int i208 = -i191;
        int i209 = ((i191 & i208) | (i191 ^ i208)) >> 31;
        int i210 = (~i209) & i170;
        int i211 = i209 & i207;
        int i212 = (i211 & i210) | (i210 ^ i211);
        int i213 = (~(i170 & i186)) & (i170 | i186);
        int i214 = -i213;
        int i215 = ((i213 & i214) | (i213 ^ i214)) >> 31;
        int i216 = i212 & (~i215);
        int i217 = i186 & i215;
        int i218 = (i217 & i216) | (i216 ^ i217);
        int maxKeyCode2 = KeyEvent.getMaxKeyCode();
        int i219 = TuitionPaymentFragmentbindingInflater1;
        int i220 = (i219 ^ 49) + ((i219 & 49) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i220 % 128;
        int i221 = i220 % 2;
        int i222 = -(-(maxKeyCode2 >> 16));
        int i223 = (203 ^ i222) + ((i222 & 203) << 1);
        int i224 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20;
        int i225 = -(ViewConfiguration.getPressedStateDuration() >> 16);
        Object[] objArr25 = new Object[1];
        a(i223, i224, (char) ((i225 & 64204) + (i225 | 64204)), objArr25);
        String str19 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        a(222 - Process.getGidForName(""), 5 - TextUtils.lastIndexOf("", '0', 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr26);
        byte[] bytes3 = ((String) objArr26[0]).getBytes();
        int length4 = bytes3.length;
        if (length4 == 0) {
            i14 = 1;
        } else {
            try {
                bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str19));
                int i226 = 4096;
                try {
                    byte[] bArr6 = new byte[4096];
                    int i227 = 0;
                    while (true) {
                        int i228 = bufferedInputStream2.read(bArr6, 0, i226);
                        if (i228 <= 0) {
                            i14 = i227 == length4 ? 1 : 0;
                            try {
                                bufferedInputStream2.close();
                                break;
                            } catch (IOException unused) {
                                break;
                            }
                        }
                        int i229 = 0;
                        while (i227 < length4) {
                            int i230 = TuitionPaymentFragmentbindingInflater1;
                            int i231 = i230 + 85;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i231 % 128;
                            if (i231 % 2 == 0) {
                                throw null;
                            }
                            if (i229 >= i228) {
                                break;
                            }
                            if (bArr6[i229] == bytes3[i227]) {
                                int i232 = i227 + 37;
                                i227 = ((i232 & (-36)) << 1) + (i232 ^ (-36));
                            } else {
                                if (i227 != 0) {
                                    int i233 = (i230 ^ 113) + ((i230 & 113) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i233 % 128;
                                    int i234 = i233 % 2 == 0 ? i227 : (i227 ^ (-1)) + (i227 << 1);
                                    while (true) {
                                        if (i234 <= 0) {
                                            bArr = bArr6;
                                            i227 = 0;
                                            break;
                                        }
                                        int i235 = 0;
                                        while (true) {
                                            if (i235 >= i234) {
                                                bArr = bArr6;
                                                i227 = i234;
                                                break;
                                            }
                                            bArr2 = bArr6;
                                            if (bytes3[i235] != bytes3[(i227 - i234) + i235]) {
                                                break;
                                            }
                                            i235++;
                                            bArr6 = bArr2;
                                        }
                                        i234 = (((i234 | (-34)) << 1) - (i234 ^ (-34))) + 33;
                                        bArr6 = bArr2;
                                    }
                                }
                                bArr6 = bArr;
                            }
                            bArr = bArr6;
                            i229++;
                            bArr6 = bArr;
                        }
                        bArr6 = bArr6;
                        i226 = 4096;
                    }
                } catch (IOException unused2) {
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    i14 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                bufferedInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        }
        int i236 = (~(i170 & 262)) & (i170 | 262);
        int i237 = -i14;
        int i238 = ((i14 & i237) | (i14 ^ i237)) >> 31;
        int i239 = (~i238) & i170;
        int i240 = i238 & i236;
        int i241 = (i240 & i239) | (i239 ^ i240);
        int i242 = ((~i218) & i170) | (i218 & i112);
        int i243 = -i242;
        int i244 = ((i242 & i243) | (i242 ^ i243)) >> 31;
        int i245 = (i218 & i244) | (i241 & (~i244));
        int i246 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
        int i247 = (i246 & 229) + (i246 | 229);
        int i248 = 29 - (~(-TextUtils.indexOf((CharSequence) "", '0')));
        int i249 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        Object[] objArr27 = new Object[1];
        a(i247, i248, (char) (((i249 | 1) << 1) - (i249 ^ 1)), objArr27);
        String str20 = (String) objArr27[0];
        int i250 = -AndroidCharacter.getMirror('0');
        int i251 = ((i250 | 308) << 1) - (i250 ^ 308);
        int i252 = 22 - (~KeyEvent.getDeadChar(0, 0));
        int i253 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
        Object[] objArr28 = new Object[1];
        a(i251, i252, (char) (((i253 | 1) << 1) - (i253 ^ 1)), objArr28);
        String str21 = (String) objArr28[0];
        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0);
        Object[] objArr29 = new Object[1];
        a((iIndexOf4 ^ 284) + ((iIndexOf4 & 284) << 1), ExpandableListView.getPackedPositionChild(0L) + 29, (char) View.combineMeasuredStates(0, 0), objArr29);
        String str22 = (String) objArr29[0];
        int i254 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i255 = (i254 ^ 311) + ((i254 & 311) << 1);
        int i256 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
        int i257 = (i256 ^ 14) + ((i256 & 14) << 1);
        int i258 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
        Object[] objArr30 = new Object[1];
        a(i255, i257, (char) (((i258 | 19578) << 1) - (i258 ^ 19578)), objArr30);
        String[] strArr16 = {str20, str21, str22, (String) objArr30[0]};
        int i259 = 0;
        while (true) {
            if (i259 >= 4) {
                i15 = i204;
                str2 = str11;
                i16 = i170;
                break;
            }
            Object[] objArr31 = {strArr16[i259]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 994;
                int i260 = 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b11 = (byte) (-1);
                Object[] objArr32 = new Object[1];
                c(b11, (byte) (b11 & 6), (byte) 0, objArr32);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(fadingEdgeLength, packedPositionChild, i260, -545305915, false, (String) objArr32[0], new Class[]{String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr31)).longValue();
            long j38 = -398736439;
            String[] strArr17 = strArr16;
            i15 = i204;
            long j39 = j38 ^ j25;
            str2 = str11;
            long startUptimeMillis4 = (int) Process.getStartUptimeMillis();
            long j40 = startUptimeMillis4 ^ j25;
            long j41 = (((long) TypedValues.Custom.TYPE_DIMENSION) * j38) + (((long) (-903)) * jLongValue5) + (((long) (-1808)) * (((j39 | startUptimeMillis4) ^ j25) | ((j40 | jLongValue5) ^ j25)));
            long j42 = TypedValues.Custom.TYPE_BOOLEAN;
            long j43 = jLongValue5 ^ j25;
            long j44 = j40 | j38;
            long j45 = j41 + (((((j39 | j43) | startUptimeMillis4) ^ j25) | ((j44 | jLongValue5) ^ j25)) * j42) + (j42 * (((j39 | jLongValue5) ^ j25) | ((j43 | startUptimeMillis4) ^ j25) | (j44 ^ j25))) + ((long) 1019195723);
            int i261 = ((int) (j45 >> 32)) & ((-2001114758) + (((~(660857038 | i170)) | (~(i112 | (-39960711)))) * (-406)) + ((~(i112 | 2138044159)) * (-406)) + (((~((-2098083450) | i170)) | (~(i112 | (-660857039)))) * 406));
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i262 = ((int) j45) & (((1320243365 + (((~(1664031329 | startElapsedRealtime2)) | 209765526) * 1504)) + ((~(startElapsedRealtime2 | 1873796855)) * (-1504))) - 417240976);
            if (((i261 & i262) | (i261 ^ i262)) != 0) {
                int i263 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i264 = ((i263 | 55) << 1) - (i263 ^ 55);
                TuitionPaymentFragmentbindingInflater1 = i264 % 128;
                int i265 = i264 % 2;
                int i266 = ((i259 | 252) << 1) - (i259 ^ 252);
                i16 = (i266 & i112) | ((~i266) & i170);
                break;
            }
            i259 = (i259 & 1) + (i259 | 1);
            strArr16 = strArr17;
            str11 = str2;
            i204 = i15;
        }
        int i267 = (~(i170 & i245)) & (i170 | i245);
        int i268 = -i267;
        int i269 = ((i267 & i268) | (i267 ^ i268)) >> 31;
        int i270 = i16 & (~i269);
        int i271 = i245 & i269;
        int i272 = (i271 & i270) | (i270 ^ i271);
        Object[] objArr33 = new Object[1];
        a(325 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) View.MeasureSpec.getSize(0), objArr33);
        Object[] objArr34 = {(String) objArr33[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char scrollBarSize3 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33602);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3085;
            int i273 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26;
            byte b12 = (byte) (-1);
            byte b13 = (byte) (-b12);
            Object[] objArr35 = new Object[1];
            c(b12, b13, (byte) (b13 - 1), objArr35);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(scrollBarSize3, maximumFlingVelocity, i273, 1411172903, false, (String) objArr35[0], new Class[]{String.class});
        }
        String str23 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr34);
        if (str23 != null) {
            int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
            int i274 = (edgeSlop & 338) + (edgeSlop | 338);
            int i275 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            Object[] objArr36 = new Object[1];
            a(i274, ((i275 | 8) << 1) - (i275 ^ 8), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr36);
            if (str23.contains((String) objArr36[0])) {
                i17 = i112;
                i18 = (i170 & (-251)) | (i17 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            } else {
                i17 = i112;
                i18 = i170;
            }
        } else {
            i17 = i112;
            i18 = i170;
        }
        int i276 = i170 ^ i272;
        int i277 = -i276;
        int i278 = ((i276 & i277) | (i276 ^ i277)) >> 31;
        int i279 = i18 & (~i278);
        int i280 = i272 & i278;
        int i281 = (i280 & i279) | (i279 ^ i280);
        Object[] objArr37 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 347, 17 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.green(0), objArr37);
        String str24 = (String) objArr37[0];
        int deadChar2 = KeyEvent.getDeadChar(0, 0) + 364;
        int i282 = 6 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
        int i283 = -MotionEvent.axisFromString(str2);
        Object[] objArr38 = new Object[1];
        a(deadChar2, i282, (char) ((i283 & 37033) + (i283 | 37033)), objArr38);
        byte[] bytes4 = ((String) objArr38[0]).getBytes();
        int length5 = bytes4.length;
        if (length5 == 0) {
            i19 = i170 ^ 251;
        } else {
            try {
                bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str24));
                int i284 = 4096;
                try {
                    byte[] bArr7 = new byte[4096];
                    int i285 = 0;
                    while (true) {
                        int i286 = bufferedInputStream4.read(bArr7, 0, i284);
                        if (i286 > 0) {
                            int i287 = 0;
                            while (i285 < length5 && i287 < i286) {
                                int i288 = TuitionPaymentFragmentbindingInflater1;
                                int i289 = (i288 & 53) + (i288 | 53);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i289 % 128;
                                if (i289 % 2 == 0) {
                                    byte b14 = bArr7[i287];
                                    byte b15 = bytes4[i285];
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                if (bArr7[i287] != bytes4[i285]) {
                                    if (i285 != 0) {
                                        int i290 = (-2) - (i285 ^ (-1));
                                        while (true) {
                                            if (i290 <= 0) {
                                                i285 = 0;
                                                break;
                                            }
                                            int i291 = 0;
                                            while (true) {
                                                if (i291 >= i290) {
                                                    i285 = i290;
                                                    break;
                                                }
                                                int i292 = -i290;
                                                int i293 = (i285 ^ i292) + ((i292 & i285) << 1);
                                                int i294 = -(-i291);
                                                if (bytes4[i291] != bytes4[(i293 ^ i294) + ((i293 & i294) << 1)]) {
                                                    break;
                                                }
                                                i291 = ((i291 | 1) << 1) - (i291 ^ 1);
                                            }
                                            i290 = (i290 & (-17)) + (i290 | (-17)) + 16;
                                        }
                                    }
                                } else {
                                    int i295 = (i285 ^ (-2)) + ((i285 & (-2)) << 1);
                                    i285 = (i295 & 3) + (i295 | 3);
                                }
                                int i296 = (i287 ^ (-57)) + ((i287 & (-57)) << 1);
                                i287 = ((i296 | 58) << 1) - (i296 ^ 58);
                            }
                            i284 = 4096;
                        } else {
                            boolean z6 = i285 == length5;
                            try {
                                bufferedInputStream4.close();
                            } catch (IOException unused6) {
                            }
                            if (z6) {
                                i19 = i170 ^ 251;
                            }
                        }
                        i19 = i170;
                    }
                } catch (IOException unused7) {
                    if (bufferedInputStream4 != null) {
                        try {
                            bufferedInputStream4.close();
                        } catch (IOException unused8) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream3 = bufferedInputStream4;
                    if (bufferedInputStream3 != null) {
                        try {
                            bufferedInputStream3.close();
                        } catch (IOException unused9) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused10) {
                bufferedInputStream4 = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream3 = null;
            }
        }
        int i297 = ((~i281) & i170) | (i281 & i17);
        int i298 = (i297 | (-i297)) >> 31;
        int i299 = (i281 & i298) | (i19 & (~i298));
        int i300 = 368 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))));
        int i301 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22;
        int i302 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
        Object[] objArr39 = new Object[1];
        a(i300, i301, (char) (((i302 | 63257) << 1) - (i302 ^ 63257)), objArr39);
        Object[] objArr40 = {(String) objArr39[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cGreen = (char) (Color.green(0) + 33602);
            str3 = str2;
            int capsMode2 = 3085 - TextUtils.getCapsMode(str3, 0, 0);
            int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
            byte b16 = (byte) (-1);
            byte b17 = (byte) (-b16);
            Object[] objArr41 = new Object[1];
            c(b16, b17, (byte) (b17 - 1), objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cGreen, capsMode2, bitsPerPixel, 1411172903, false, (String) objArr41[0], new Class[]{String.class});
        } else {
            str3 = str2;
        }
        String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr40)).toLowerCase();
        int iRgb = Color.rgb(0, 0, 0);
        int i303 = (iRgb ^ 16777609) + ((iRgb & 16777609) << 1);
        int iBlue2 = Color.blue(0);
        int i304 = (iBlue2 ^ 4) + ((iBlue2 & 4) << 1);
        int i305 = -(-TextUtils.indexOf(str3, str3, 0, 0));
        Object[] objArr42 = new Object[1];
        a(i303, i304, (char) ((i305 & 60102) + (i305 | 60102)), objArr42);
        int i306 = lowerCase.contains((String) objArr42[0]) ? (i170 & (-265)) | (i17 & 264) : i170;
        int i307 = ((~i299) & i170) | (i299 & i17);
        int i308 = -i307;
        int i309 = ((i307 & i308) | (i307 ^ i308)) >> 31;
        int i310 = i306 & (~i309);
        int i311 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i312 = (i311 & 111) + (i311 | 111);
        TuitionPaymentFragmentbindingInflater1 = i312 % 128;
        int i313 = (i299 & i309) | i310;
        if (i312 % 2 != 0) {
            strArr = new String[123];
            iAxisFromString = MotionEvent.axisFromString(str3) * 27416;
            i20 = 22;
            c2 = 27;
            i21 = 1;
            i22 = 0;
            c3 = 1;
        } else {
            i20 = 43;
            c2 = '0';
            i21 = 0;
            i22 = 0;
            c3 = 0;
            iAxisFromString = 395 - (~(-MotionEvent.axisFromString(str3)));
            strArr = new String[6];
        }
        int iIndexOf5 = i20 + TextUtils.indexOf(str3, c2, i21, i22);
        int i314 = -(-TextUtils.lastIndexOf(str3, '0', i22, i22));
        Object[] objArr43 = new Object[1];
        a(iAxisFromString, iIndexOf5, (char) (((i314 | 1) << 1) - (i314 ^ 1)), objArr43);
        strArr[c3] = (String) objArr43[i22];
        int i315 = -(-View.MeasureSpec.makeMeasureSpec(i22, i22));
        int i316 = (i315 & 439) + (i315 | 439);
        int i317 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        Object[] objArr44 = new Object[1];
        a(i316, (i317 ^ 41) + ((i317 & 41) << 1), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr44);
        strArr[1] = (String) objArr44[0];
        int i318 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr45 = new Object[1];
        a((i318 ^ 479) + ((i318 & 479) << 1), 27 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))), (char) KeyEvent.normalizeMetaState(0), objArr45);
        strArr[2] = (String) objArr45[0];
        Object[] objArr46 = new Object[1];
        a(505 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))), 27 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.MeasureSpec.getSize(0), objArr46);
        strArr[3] = (String) objArr46[0];
        int i319 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 532;
        int i320 = TuitionPaymentFragmentbindingInflater1;
        int i321 = (i320 ^ 31) + ((i320 & 31) << 1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i321 % 128;
        if (i321 % 2 == 0) {
            Object[] objArr47 = new Object[1];
            a(i319, 27 >> Color.red(1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 9), objArr47);
            strArr[4] = (String) objArr47[0];
            iResolveSizeAndState = 3748 >> View.resolveSizeAndState(1, 1, 1);
            maxKeyCode = KeyEvent.getMaxKeyCode();
            i23 = 71;
            c4 = 2;
        } else {
            Object[] objArr48 = new Object[1];
            a(i319, 26 - (~(-Color.red(0))), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr48);
            strArr[4] = (String) objArr48[0];
            int i322 = -View.resolveSizeAndState(0, 0, 0);
            iResolveSizeAndState = ((i322 & 560) << 1) + (i322 ^ 560);
            maxKeyCode = KeyEvent.getMaxKeyCode();
            c4 = 5;
            i23 = 27;
        }
        Object[] objArr49 = new Object[1];
        a(iResolveSizeAndState, i23 + (maxKeyCode >> 16), (char) (793 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr49);
        strArr[c4] = (String) objArr49[0];
        int i323 = 0;
        while (true) {
            if (i323 >= strArr.length) {
                i24 = i170;
                break;
            }
            Object[] objArr50 = {strArr[i323]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char threadPriority4 = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 33602);
                int bitsPerPixel2 = 3084 - ImageFormat.getBitsPerPixel(0);
                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 26;
                byte b18 = (byte) (-1);
                byte b19 = (byte) (-b18);
                Object[] objArr51 = new Object[1];
                c(b18, b19, (byte) (b19 - 1), objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(threadPriority4, bitsPerPixel2, absoluteGravity2, 1411172903, false, (String) objArr51[0], new Class[]{String.class});
            }
            String str25 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr50);
            if (str25 != null && !str25.isEmpty()) {
                i24 = (~(i170 & 265)) & (i170 | 265);
                break;
            }
            int i324 = i323 - 86;
            i323 = (i324 | 87) + (i324 & 87);
        }
        int i325 = i170 ^ i313;
        int i326 = -i325;
        int i327 = ((i325 & i326) | (i325 ^ i326)) >> 31;
        int i328 = i24 & (~i327);
        int i329 = i313 & i327;
        int i330 = (i329 & i328) | (i328 ^ i329);
        Object[] objArr52 = new Object[1];
        a(346 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, (char) ((-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))) - 1), objArr52);
        String str26 = (String) objArr52[0];
        int i331 = 586 - (~TextUtils.indexOf(str3, str3, 0, 0));
        int i332 = -(-MotionEvent.axisFromString(str3));
        Object[] objArr53 = new Object[1];
        a(i331, (i332 ^ 7) + ((i332 & 7) << 1), (char) (20074 - (~(-(-View.resolveSizeAndState(0, 0, 0))))), objArr53);
        Object[] objArr54 = {str26, (String) objArr53[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char maxKeyCode3 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int iIndexOf6 = 2385 - TextUtils.indexOf(str3, str3, 0, 0);
            int i333 = 33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            byte b20 = (byte) (-1);
            byte b21 = (byte) (-b20);
            Object[] objArr55 = new Object[1];
            c(b20, b21, (byte) (b21 - 1), objArr55);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(maxKeyCode3, iIndexOf6, i333, -1207062455, false, (String) objArr55[0], new Class[]{String.class, String.class});
        }
        long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr54)).longValue();
        long j46 = 1113252437;
        long j47 = -712;
        long j48 = jLongValue6 ^ j25;
        int i334 = i330;
        long j49 = i170;
        long j50 = j49 ^ j25;
        long j51 = (j50 | j46) ^ j25;
        long j52 = (((long) (-711)) * j46) + (((long) 713) * jLongValue6) + ((((j48 | j46) ^ j25) | j51) * j47) + (j47 * ((((j48 | j50) | j46) ^ j25) | (((jLongValue6 | j46) | j49) ^ j25))) + (((long) 712) * (j48 | j51)) + ((long) 863790891);
        int i335 = (int) (j52 >> 32);
        int i336 = ~((~((int) Process.getStartElapsedRealtime())) | (-795634955));
        if (((i335 & (((1350635584 | i336) * (-970)) + 412001880 + ((i336 | (-2146270539)) * 970))) | (((int) j52) & (1031205596 + ((1090309837 | i170) * (-859)) + (((~(1090309837 | i17)) | (~((-1079560841) | i170))) * 859) + (((~((-1767431049) | i17)) | 687870208) * 859)))) != 0) {
            i26 = (i170 & (-261)) | (i17 & 260);
            i30 = i334;
        } else {
            int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
            Object[] objArr56 = new Object[1];
            a((fadingEdgeLength2 & 593) + (fadingEdgeLength2 | 593), 12 - (~(-Color.green(0))), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr56);
            String str27 = (String) objArr56[0];
            int iIndexOf7 = TextUtils.indexOf((CharSequence) str3, '0', 0);
            int i337 = ((iIndexOf7 | TypedValues.MotionType.TYPE_PATHMOTION_ARC) << 1) - (iIndexOf7 ^ TypedValues.MotionType.TYPE_PATHMOTION_ARC);
            int iRed = 9 - Color.red(0);
            int i338 = -KeyEvent.getDeadChar(0, 0);
            Object[] objArr57 = new Object[1];
            a(i337, iRed, (char) ((i338 & 37918) + (i338 | 37918)), objArr57);
            byte[] bytes5 = ((String) objArr57[0]).getBytes();
            int length6 = bytes5.length;
            if (length6 == 0) {
                i25 = i334;
            } else {
                try {
                    bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str27));
                    int i339 = TuitionPaymentFragmentbindingInflater1;
                    int i340 = ((i339 | 57) << 1) - (i339 ^ 57);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i340 % 128;
                    try {
                        try {
                            byte[] bArr8 = i340 % 2 == 0 ? new byte[24827] : new byte[4096];
                            int i341 = 0;
                            while (true) {
                                int i342 = bufferedInputStream6.read(bArr8, 0, bArr8.length);
                                if (i342 <= 0) {
                                    break;
                                }
                                int i343 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i344 = (i343 & 25) + (i343 | 25);
                                TuitionPaymentFragmentbindingInflater1 = i344 % 128;
                                int i345 = i344 % 2;
                                int i346 = 0;
                                while (i341 < length6 && i346 < i342) {
                                    byte[] bArr9 = bArr8;
                                    if (bArr8[i346] == bytes5[i341]) {
                                        i341++;
                                    } else {
                                        if (i341 != 0) {
                                            int i347 = (i341 ^ (-1)) + (i341 << 1);
                                            while (true) {
                                                if (i347 <= 0) {
                                                    i27 = i342;
                                                    i28 = i334;
                                                    i341 = 0;
                                                    break;
                                                }
                                                int i348 = 0;
                                                while (true) {
                                                    if (i348 >= i347) {
                                                        i27 = i342;
                                                        i28 = i334;
                                                        i341 = i347;
                                                        break;
                                                    }
                                                    i29 = i342;
                                                    byte b22 = bytes5[i348];
                                                    i25 = i334;
                                                    int i349 = (i341 - (~(-i347))) - 1;
                                                    try {
                                                        if (b22 != bytes5[((i349 | i348) << 1) - (i349 ^ i348)]) {
                                                            break;
                                                        }
                                                        int i350 = (i348 & (-52)) + (i348 | (-52));
                                                        i348 = (i350 & 53) + (i350 | 53);
                                                        i342 = i29;
                                                        i334 = i25;
                                                    } catch (IOException unused11) {
                                                        if (bufferedInputStream6 != null) {
                                                            try {
                                                                bufferedInputStream6.close();
                                                            } catch (IOException unused12) {
                                                            }
                                                        }
                                                        i26 = i170;
                                                        i30 = i25;
                                                        int i351 = ((~i30) & i170) | (i30 & i17);
                                                        int i352 = -i351;
                                                        int i353 = ((i351 & i352) | (i351 ^ i352)) >> 31;
                                                        int i354 = i26 & (~i353);
                                                        int i355 = i30 & i353;
                                                        i31 = (i354 & i355) | (i354 ^ i355);
                                                        if ((i2 & 8) == 0) {
                                                            int i356 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i357 = ((i356 | 615) << 1) - (i356 ^ 615);
                                                            int i358 = -(-TextUtils.indexOf((CharSequence) str3, '0', 0, 0));
                                                            Object[] objArr58 = new Object[1];
                                                            a(i357, ((i358 | 44) << 1) - (i358 ^ 44), (char) Color.alpha(0), objArr58);
                                                            String str28 = (String) objArr58[0];
                                                            int i359 = 657 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                            int iRgb2 = Color.rgb(0, 0, 0);
                                                            Object[] objArr59 = new Object[1];
                                                            a(i359, ((iRgb2 | 16777257) << 1) - (iRgb2 ^ 16777257), (char) (28207 - View.resolveSize(0, 0)), objArr59);
                                                            String str29 = (String) objArr59[0];
                                                            int i360 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                                            int i361 = ((i360 | 699) << 1) - (i360 ^ 699);
                                                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 38;
                                                            int i362 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            Object[] objArr60 = new Object[1];
                                                            a(i361, scrollDefaultDelay, (char) ((i362 ^ 11099) + ((i362 & 11099) << 1)), objArr60);
                                                            strArr11 = new String[]{str28, str29, (String) objArr60[0]};
                                                            i95 = 0;
                                                            while (true) {
                                                                if (i95 < 3) {
                                                                    str3 = str3;
                                                                    i96 = i170;
                                                                    break;
                                                                }
                                                                Object[] objArr61 = {strArr11[i95]};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                    char cAlpha2 = (char) Color.alpha(0);
                                                                    int trimmedLength2 = TextUtils.getTrimmedLength(str3) + 993;
                                                                    int i363 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7;
                                                                    byte b23 = (byte) (-1);
                                                                    byte b24 = (byte) (b23 + 1);
                                                                    Object[] objArr62 = new Object[1];
                                                                    c(b23, b24, b24, objArr62);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cAlpha2, trimmedLength2, i363, 349342683, false, (String) objArr62[0], new Class[]{String.class});
                                                                }
                                                                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr61)).longValue();
                                                                long j53 = -200528826;
                                                                long j54 = -575;
                                                                long j55 = (j54 * j53) + (j54 * jLongValue7);
                                                                long j56 = 576;
                                                                long j57 = j53 ^ j25;
                                                                long j58 = jLongValue7 ^ j25;
                                                                long j59 = (j57 | j58) ^ j25;
                                                                j6 = j55 + ((j59 | ((j58 | j49) ^ j25)) * j56) + ((((j57 | jLongValue7) ^ j25) | (((j58 | j50) | j53) ^ j25)) * j56) + (j56 * j59) + ((long) (-646549779));
                                                                i97 = (int) (j6 >> 32);
                                                                startUptimeMillis = (int) Process.getStartUptimeMillis();
                                                                if (((i97 & (2066522594 + ((~(2147397375 | startUptimeMillis)) * 623) + (((~startUptimeMillis) | 135529544) * (-623)) + (((~(startUptimeMillis | 1860076665)) | (~(422850254 | startUptimeMillis)) | (-2147397376)) * 623))) | (((int) j6) & ((-1754753727) + (((~(2111045619 | i17)) | 746695266) * (-828)) + ((2111045619 | i17) * (-828)) + 105916112))) != 0) {
                                                                    int i364 = (i95 & 280) + (i95 | 280);
                                                                    i96 = (i364 | i170) & (~(i170 & i364));
                                                                    break;
                                                                }
                                                                i95 = ((i95 | 1) << 1) - (i95 ^ 1);
                                                                strArr11 = strArr11;
                                                                str3 = str3;
                                                            }
                                                            int i365 = i170 ^ i31;
                                                            int i366 = -i365;
                                                            int i367 = ((i365 & i366) | (i365 ^ i366)) >> 31;
                                                            i31 = (i31 & i367) | (i96 & (~i367));
                                                        } else {
                                                            str3 = str3;
                                                        }
                                                        int i368 = 737 - (~MotionEvent.axisFromString(str3));
                                                        str4 = str3;
                                                        int iLastIndexOf2 = 40 - TextUtils.lastIndexOf(str4, '0');
                                                        int i369 = -TextUtils.lastIndexOf(str4, '0');
                                                        Object[] objArr63 = new Object[1];
                                                        a(i368, iLastIndexOf2, (char) ((i369 ^ 53257) + ((i369 & 53257) << 1)), objArr63);
                                                        int i370 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int i371 = (i370 ^ 778) + ((i370 & 778) << 1);
                                                        int i372 = 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                        int scrollBarSize4 = ViewConfiguration.getScrollBarSize() >> 8;
                                                        int i373 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                                                        TuitionPaymentFragmentbindingInflater1 = i373 % 128;
                                                        i32 = 2;
                                                        int i374 = i373 % 2;
                                                        Object[] objArr64 = new Object[1];
                                                        a(i371, i372, (char) scrollBarSize4, objArr64);
                                                        strArr2 = new String[]{(String) objArr63[0], (String) objArr64[0]};
                                                        i33 = 0;
                                                        while (true) {
                                                            if (i33 < i32) {
                                                                j = j49;
                                                                i34 = i170;
                                                                str4 = str4;
                                                                i35 = i17;
                                                                i36 = i34;
                                                                break;
                                                            }
                                                            int i375 = TuitionPaymentFragmentbindingInflater1;
                                                            int i376 = (i375 & 113) + (i375 | 113);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i376 % 128;
                                                            int i377 = i376 % i32;
                                                            Object[] objArr65 = {strArr2[i33]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                                char c9 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 994;
                                                                int maximumFlingVelocity2 = 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                byte b25 = (byte) (-1);
                                                                Object[] objArr66 = new Object[1];
                                                                c(b25, (byte) (b25 & 6), (byte) 0, objArr66);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c9, modifierMetaStateMask, maximumFlingVelocity2, -545305915, false, (String) objArr66[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr65)).longValue();
                                                            long j60 = -829279064;
                                                            long j61 = -375;
                                                            long j62 = (j61 * j60) + (j61 * jLongValue8);
                                                            long j63 = 376;
                                                            j = j49;
                                                            long jMyPid = Process.myPid();
                                                            long j64 = j60 ^ j25;
                                                            long j65 = (j60 | jLongValue8) ^ j25;
                                                            i35 = i17;
                                                            j5 = j62 + ((jMyPid | ((j64 | (jLongValue8 ^ j25)) ^ j25) | j65) * j63) + (((long) (-376)) * ((((jMyPid ^ j25) | j60) ^ j25) | j65)) + (j63 * (((j64 | jMyPid) ^ j25) | jLongValue8)) + ((long) 1449738348);
                                                            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                                            int i378 = 1088329766 + (((~(1497456723 | iElapsedRealtime2)) | 1313280 | (~((-1360284162) | iElapsedRealtime2))) * (-754));
                                                            int i379 = ~((-1313281) | iElapsedRealtime2);
                                                            int i380 = ~iElapsedRealtime2;
                                                            i92 = ((int) (j5 >> 32)) & (i378 + ((i379 | (~((-1358970882) | i380))) * (-754)) + ((i380 | 1497456723) * 754));
                                                            iMyUid = Process.myUid();
                                                            i93 = ~(1432767913 | iMyUid);
                                                            i94 = ~iMyUid;
                                                            if (((((int) j5) & ((-2038855459) + ((i93 | (~((-18875809) | i94))) * 920) + (((~(23334304 | i94)) | (-1432767914)) * 920) + (((~(iMyUid | (-18875809))) | (~(1432767913 | i94)) | (~((-1409433610) | iMyUid))) * 920))) | i92) != 0) {
                                                                i34 = i;
                                                                i36 = i34 ^ (i33 + 288);
                                                                break;
                                                            }
                                                            int i381 = (i33 & (-97)) + (i33 | (-97));
                                                            i33 = ((i381 | 98) << 1) - (i381 ^ 98);
                                                            i170 = i;
                                                            i17 = i35;
                                                            strArr2 = strArr2;
                                                            str4 = str4;
                                                            j49 = j;
                                                            i32 = 2;
                                                        }
                                                        int i382 = ((~i31) & i34) | (i31 & i35);
                                                        int i383 = -i382;
                                                        int i384 = ((i382 & i383) | (i382 ^ i383)) >> 31;
                                                        int i385 = i36 & (~i384);
                                                        int i386 = i384 & i31;
                                                        i37 = (i385 & i386) | (i385 ^ i386);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                            int mode3 = 3526 - View.MeasureSpec.getMode(0);
                                                            int scrollBarSize5 = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
                                                            byte b26 = (byte) (-1);
                                                            byte b27 = (byte) (-b26);
                                                            Object[] objArr67 = new Object[1];
                                                            c(b26, b27, (byte) (b27 - 1), objArr67);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, mode3, scrollBarSize5, 980946500, false, (String) objArr67[0], new Class[0]);
                                                        }
                                                        long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                                                        long j66 = 532495721;
                                                        long j67 = 130;
                                                        long j68 = jLongValue9 ^ j25;
                                                        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                                        long j69 = (((long) (-129)) * j66) + (((long) 131) * jLongValue9) + ((((j68 | (jFreeMemory ^ j25)) | j66) ^ j25) * j67);
                                                        long j70 = j68 | j66;
                                                        long j71 = j69 + (((long) (-260)) * (j70 ^ j25)) + (j67 * (((jFreeMemory | j70) ^ j25) | ((jLongValue9 | (j66 ^ j25)) ^ j25))) + ((long) (-712818359));
                                                        i38 = ((int) (j71 >> 32)) & ((-45731278) + (((-1491033412) | i) * 140) + (((~((-1491033412) | i35)) | 143200322) * (-280)) + (((~((-1366707474) | i35)) | 18874384 | (~((-143200323) | i))) * 140));
                                                        int i387 = ~((-1581167278) | i35);
                                                        i39 = ((int) j71) & (((((i387 | 17664) | (~(1581167277 | i))) * (-338)) - 1431255979) + ((i387 | (~(1581184941 | i))) * 338));
                                                        if (((i38 & i39) | (i38 ^ i39)) != 1) {
                                                            Object[] objArr68 = {1};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                char c10 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                                int keyRepeatTimeout3 = 2673 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 16;
                                                                byte b28 = (byte) (-1);
                                                                byte b29 = (byte) (-b28);
                                                                Object[] objArr69 = new Object[1];
                                                                c(b28, b29, (byte) (b29 - 1), objArr69);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c10, keyRepeatTimeout3, longPressTimeout, -1409439630, false, (String) objArr69[0], new Class[]{Integer.TYPE});
                                                            }
                                                            long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr68)).longValue();
                                                            long j72 = -9017826;
                                                            long j73 = 69;
                                                            long j74 = j72 ^ j25;
                                                            long j75 = jLongValue10 ^ j25;
                                                            j2 = (((long) 70) * j72) + (((long) (-68)) * jLongValue10) + (((((j74 | j75) | j) ^ j25) | (((j72 | jLongValue10) | j) ^ j25)) * j73) + (((long) (-69)) * (((jLongValue10 | j) ^ j25) | ((j74 | jLongValue10) ^ j25) | ((j74 | j) ^ j25))) + (j73 * ((j75 | j72) ^ j25)) + ((long) 1876716506);
                                                            i40 = i;
                                                            if (((((int) (j2 >> 32)) & ((-848177884) + ((~((-151000329) | i35)) * 433) + (((~(161865565 | i40)) | (-1599091977)) * (-433)) + (((~((-1599091977) | i40)) | 10865237) * 433))) | (((int) j2) & ((-1990993339) + (((~((-713077795) | i35)) | (~(2144663091 | i40))) * (-272)) + (((~((-780449331) | i40)) | 67371536) * (-272)) + (((~(780449330 | i40)) | 2077291555) * 272)))) != 0) {
                                                                int i388 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                i91 = ((i388 | 19) << 1) - (i388 ^ 19);
                                                                TuitionPaymentFragmentbindingInflater1 = i91 % 128;
                                                                if (i91 % 2 != 0) {
                                                                    i43 = i40 ^ 31631;
                                                                    i42 = i35;
                                                                } else {
                                                                    i42 = i35;
                                                                    i43 = (i40 & (-221)) | (i42 & 220);
                                                                }
                                                            } else {
                                                                i42 = i35;
                                                                i43 = i40;
                                                            }
                                                            int i389 = ((~r66) & i40) | (r66 & i42);
                                                            int i390 = -i389;
                                                            int i391 = ((i389 & i390) | (i389 ^ i390)) >> 31;
                                                            i44 = (i43 & (~i391)) | (i37 & i391);
                                                            int i392 = -(Process.myTid() >> 22);
                                                            int i393 = (i392 ^ 370) + ((i392 & 370) << 1);
                                                            int i394 = -AndroidCharacter.getMirror('0');
                                                            Object[] objArr70 = new Object[1];
                                                            a(i393, (i394 & 71) + (i394 | 71), (char) (63256 - (~KeyEvent.keyCodeFromString(str4))), objArr70);
                                                            Object[] objArr71 = {(String) objArr70[0]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                char windowTouchSlop = (char) (33602 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                int i395 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                                                                byte b30 = (byte) (-1);
                                                                byte b31 = (byte) (-b30);
                                                                Object[] objArr72 = new Object[1];
                                                                c(b30, b31, (byte) (b31 - 1), objArr72);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i395, maximumDrawingCacheSize, 1411172903, false, (String) objArr72[0], new Class[]{String.class});
                                                            }
                                                            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr71);
                                                            try {
                                                                try {
                                                                    if (objInvoke != null) {
                                                                        Object[] objArr73 = {objInvoke, 42};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                            char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                                                                            int i396 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3393;
                                                                            str5 = str4;
                                                                            int offsetBefore = 9 - TextUtils.getOffsetBefore(str5, 0);
                                                                            byte b32 = (byte) (-1);
                                                                            byte b33 = (byte) (-b32);
                                                                            Object[] objArr74 = new Object[1];
                                                                            c(b32, b33, (byte) (b33 - 1), objArr74);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar3, i396, offsetBefore, 1203525406, false, (String) objArr74[0], new Class[]{String.class, Integer.TYPE});
                                                                        } else {
                                                                            str5 = str4;
                                                                        }
                                                                        long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr73)).longValue();
                                                                        long j76 = 1238256276;
                                                                        long j77 = j76 ^ j25;
                                                                        long j78 = 191;
                                                                        j4 = (((long) (-381)) * j76) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue11) + (((long) (-191)) * j77) + ((j76 | ((jLongValue11 | j) ^ j25)) * j78) + (j78 * (((j50 | jLongValue11) ^ j25) | ((j77 | jLongValue11) ^ j25))) + ((long) (-1240326153));
                                                                        i89 = ((int) (j4 >> 32)) & (((~(2103811232 | i40)) * TypedValues.CycleType.TYPE_EASING) + 1070984654 + (((~(2103811232 | i42)) | 1480890368) * TypedValues.CycleType.TYPE_EASING));
                                                                        i90 = ~((~Process.myPid()) | 419958830);
                                                                        if ((i89 | (((int) j4) & (((134217736 | i90) * (-374)) + 2022579841 + ((i90 | 285741094) * 374)))) == 1986687685) {
                                                                            length = i42;
                                                                            strArr5 = null;
                                                                            j3 = j25;
                                                                        }
                                                                        int i397 = 888 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                                                                        int i398 = -View.getDefaultSize(0, 0);
                                                                        Object[] objArr75 = new Object[1];
                                                                        a(i397, ((i398 | 16) << 1) - (i398 ^ 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr75);
                                                                        Object[] objArr76 = {(String) objArr75[0]};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                            char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33602);
                                                                            int modifierMetaStateMask2 = 3084 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                                            int iLastIndexOf3 = 25 - TextUtils.lastIndexOf(str5, '0', 0, 0);
                                                                            byte b34 = (byte) (-1);
                                                                            byte b35 = (byte) (-b34);
                                                                            Object[] objArr77 = new Object[1];
                                                                            c(b34, b35, (byte) (b35 - 1), objArr77);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop2, modifierMetaStateMask2, iLastIndexOf3, 1411172903, false, (String) objArr77[0], new Class[]{String.class});
                                                                        }
                                                                        objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr76);
                                                                        if (objInvoke2 == null) {
                                                                            i54 = 0;
                                                                        } else {
                                                                            Object[] objArr78 = {objInvoke2, 42};
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                                                int iArgb2 = 3393 - Color.argb(0, 0, 0, 0);
                                                                                int mode4 = 9 - View.MeasureSpec.getMode(0);
                                                                                byte b36 = (byte) (-1);
                                                                                byte b37 = (byte) (-b36);
                                                                                Object[] objArr79 = new Object[1];
                                                                                c(b36, b37, (byte) (b37 - 1), objArr79);
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, iArgb2, mode4, 1203525406, false, (String) objArr79[0], new Class[]{String.class, Integer.TYPE});
                                                                            }
                                                                            long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr78)).longValue();
                                                                            long j79 = 1417205932;
                                                                            long j80 = 988;
                                                                            long j81 = jLongValue12 ^ j3;
                                                                            long jUptimeMillis = (int) SystemClock.uptimeMillis();
                                                                            long j82 = jUptimeMillis ^ j3;
                                                                            long j83 = (((long) 989) * j79) + (((long) (-987)) * jLongValue12) + (((((j81 | j82) | j79) ^ j3) | (((j79 | jLongValue12) | jUptimeMillis) ^ j3)) * j80) + (((long) (-988)) * (j79 | j81)) + (j80 * (((jLongValue12 | (j82 | j79)) ^ j3) | (((j79 ^ j3) | j81) ^ j3) | ((jUptimeMillis | j81) ^ j3))) + ((long) (-1419275809));
                                                                            int i399 = TuitionPaymentFragmentbindingInflater1;
                                                                            int i400 = (i399 ^ 13) + ((i399 & 13) << 1);
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i400 % 128;
                                                                            int i401 = i400 % 2;
                                                                            int iMyUid3 = Process.myUid();
                                                                            int i402 = (~(414862745 | iMyUid3)) | 1715774020;
                                                                            int i403 = ~iMyUid3;
                                                                            int i404 = ((int) (j83 >> 32)) & (185402198 + ((i402 | (~((-278547610) | i403))) * 886) + (((~(i403 | (-414862746))) | 1852089156) * (-1772)) + ((~(i403 | 1852089156)) * 886));
                                                                            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                                            int i405 = ((int) j83) & (((((~((-2016316297) | iElapsedRealtime3)) | 1242142021) * 398) - 1721423783) + (((~((~iElapsedRealtime3) | (-2016316297))) | 1242142021) * 398));
                                                                            i54 = (i404 & i405) | (i404 ^ i405);
                                                                        }
                                                                        if (i54 != 1986687685) {
                                                                            i55 = i44;
                                                                        } else {
                                                                            i55 = i44;
                                                                        }
                                                                        Object[] objArr80 = new Object[1];
                                                                        a(TextUtils.getTrimmedLength(str5) + 1950, 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), (char) (25114 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr80);
                                                                        String str30 = (String) objArr80[0];
                                                                        int i406 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1962;
                                                                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                                                        int i407 = ~iResolveOpacity2;
                                                                        int i408 = ~(((-6) & i40) | ((-6) ^ i40));
                                                                        int i409 = (((iResolveOpacity2 * (-947)) + 4745) - (~(-(-(((i408 & i407) | (i407 ^ i408)) * (-948)))))) - 1;
                                                                        int i410 = (i407 & (-6)) | (i407 ^ (-6));
                                                                        int i411 = (~((i410 & i15) | (i410 ^ i15))) * (-948);
                                                                        Object[] objArr81 = new Object[1];
                                                                        a(i406, (i409 & i411) + (i409 | i411) + ((iResolveOpacity2 | (-6)) * 948), (char) TextUtils.getTrimmedLength(str5), objArr81);
                                                                        int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1968;
                                                                        int i412 = -View.resolveSizeAndState(0, 0, 0);
                                                                        int iTuitionPaymentFragmentbindingInflater2 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                                        int i413 = i412 * (-947);
                                                                        int i414 = ((i413 | 14235) << 1) - (i413 ^ 14235);
                                                                        int i415 = ~i412;
                                                                        int i416 = (i414 - (~(-(-(((~((-16) | iTuitionPaymentFragmentbindingInflater2)) | i415) * (-948)))))) - 1;
                                                                        int i417 = (~((~iTuitionPaymentFragmentbindingInflater2) | (i415 & (-16)) | (i415 ^ (-16)))) * (-948);
                                                                        Object[] objArr82 = new Object[1];
                                                                        a(windowTouchSlop2, (((i416 ^ i417) + ((i417 & i416) << 1)) - (~(((i412 & (-16)) | (i412 ^ (-16))) * 948))) - 1, (char) View.combineMeasuredStates(0, 0), objArr82);
                                                                        String str31 = (String) objArr82[0];
                                                                        int size2 = 1983 - View.MeasureSpec.getSize(0);
                                                                        int threadPriority5 = Process.getThreadPriority(0);
                                                                        int i418 = (((threadPriority5 | 20) << 1) - (threadPriority5 ^ 20)) >> 6;
                                                                        int i419 = (i418 * 714) - 13528;
                                                                        int i420 = ~i418;
                                                                        int i421 = ~((i420 & i15) | (i420 ^ i15));
                                                                        int i422 = ~i418;
                                                                        int i423 = ~((i422 & 19) | (i422 ^ 19));
                                                                        int i424 = (i421 & i423) | (i421 ^ i423);
                                                                        int i425 = (i418 & (-20)) | ((-20) ^ i418);
                                                                        int i426 = (i425 & i40) | (i425 ^ i40);
                                                                        int i427 = ~i426;
                                                                        int i428 = ((i424 & i427) | (i424 ^ i427)) * (-713);
                                                                        int i429 = ((i419 | i428) << 1) - (i419 ^ i428);
                                                                        int i430 = -(-((~i426) * 1426));
                                                                        Object[] objArr83 = new Object[1];
                                                                        a(size2, (((i429 ^ i430) + ((i430 & i429) << 1)) - (~((~(((-20) ^ length) | ((-20) & length))) * 713))) - 1, (char) (27852 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr83);
                                                                        String str32 = (String) objArr83[0];
                                                                        int i431 = 2001 - (~Color.alpha(0));
                                                                        int i432 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                                                                        int i433 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                        Object[] objArr84 = new Object[1];
                                                                        a(i431, i432, (char) ((i433 ^ 1) + ((i433 & 1) << 1)), objArr84);
                                                                        int i434 = 2015 - (~TextUtils.indexOf(str5, str5, 0));
                                                                        int i435 = -(-Process.getGidForName(str5));
                                                                        Object[] objArr85 = new Object[1];
                                                                        a(i434, (i435 & 22) + (i435 | 22), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr85);
                                                                        String str33 = (String) objArr85[0];
                                                                        int i436 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                                                        Object[] objArr86 = new Object[1];
                                                                        a((i436 ^ 2037) + ((i436 & 2037) << 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr86);
                                                                        Object[] objArr87 = new Object[1];
                                                                        a(2046 - (~(-(-Color.blue(0)))), ExpandableListView.getPackedPositionGroup(0L) + 11, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr87);
                                                                        String str34 = (String) objArr87[0];
                                                                        int longPressTimeout2 = 587 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                        int i437 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                                        int i438 = -TextUtils.getOffsetBefore(str5, 0);
                                                                        Object[] objArr88 = new Object[1];
                                                                        a(longPressTimeout2, (i437 & 6) + (i437 | 6), (char) (((i438 | 20075) << 1) - (i438 ^ 20075)), objArr88);
                                                                        int i439 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                        int i440 = ((i439 | 9) << 1) - (i439 ^ 9);
                                                                        TuitionPaymentFragmentbindingInflater1 = i440 % 128;
                                                                        int i441 = i440 % 2;
                                                                        int i442 = -Color.alpha(0);
                                                                        int i443 = (i442 ^ 2058) + ((i442 & 2058) << 1);
                                                                        int i444 = -TextUtils.getTrimmedLength(str5);
                                                                        Object[] objArr89 = new Object[1];
                                                                        a(i443, ((i444 | 28) << 1) - (i444 ^ 28), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr89);
                                                                        String str35 = (String) objArr89[0];
                                                                        int i445 = -View.resolveSize(0, 0);
                                                                        Object[] objArr90 = new Object[1];
                                                                        a(((i445 | 2037) << 1) - (i445 ^ 2037), 9 - (~(Process.myPid() >> 22)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr90);
                                                                        strArr6 = new String[][]{new String[]{str30, (String) objArr81[0]}, new String[]{str31, str32, (String) objArr84[0]}, new String[]{str33, (String) objArr86[0]}, new String[]{str34, (String) objArr88[0]}, new String[]{str35, (String) objArr90[0]}};
                                                                        i56 = 0;
                                                                        i57 = -1;
                                                                        loop7: while (true) {
                                                                            if (i56 < 5) {
                                                                                i58 = i40;
                                                                                break;
                                                                            }
                                                                            int i446 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                            i71 = (i446 ^ 115) + ((i446 & 115) << 1);
                                                                            TuitionPaymentFragmentbindingInflater1 = i71 % 128;
                                                                            if (i71 % 2 != 0) {
                                                                                strArr7 = strArr6[i56];
                                                                                str8 = strArr7[1];
                                                                            } else {
                                                                                strArr7 = strArr6[i56];
                                                                                str8 = strArr7[0];
                                                                            }
                                                                            strArr8 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                                                                            length2 = strArr8.length;
                                                                            i72 = 0;
                                                                            while (true) {
                                                                                if (i72 < length2) {
                                                                                    i57++;
                                                                                    bytes2 = strArr8[i72].getBytes();
                                                                                    length3 = bytes2.length;
                                                                                    if (length3 == 0) {
                                                                                        try {
                                                                                            bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str8));
                                                                                            i74 = 4096;
                                                                                            try {
                                                                                                try {
                                                                                                    bArr4 = new byte[4096];
                                                                                                    strArr9 = strArr6;
                                                                                                    strArr10 = strArr8;
                                                                                                    i75 = 0;
                                                                                                    i76 = 0;
                                                                                                    while (true) {
                                                                                                        try {
                                                                                                            i77 = bufferedInputStream8.read(bArr4, i75, i74);
                                                                                                            if (i77 > 0) {
                                                                                                                break;
                                                                                                            }
                                                                                                            i78 = 0;
                                                                                                            while (i76 < length3) {
                                                                                                                int i447 = i77;
                                                                                                                if (bArr4[i78] == bytes2[i76]) {
                                                                                                                    int i448 = (i76 & (-84)) + (i76 | (-84));
                                                                                                                    i76 = (i448 & 85) + (i448 | 85);
                                                                                                                } else {
                                                                                                                    if (i76 != 0) {
                                                                                                                        i79 = i76 - 1;
                                                                                                                        while (true) {
                                                                                                                            if (i79 > 0) {
                                                                                                                                str9 = str8;
                                                                                                                                i73 = length2;
                                                                                                                                bArr5 = bArr4;
                                                                                                                                i76 = 0;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i80 = 0;
                                                                                                                            while (true) {
                                                                                                                                str9 = str8;
                                                                                                                                if (i80 < i79) {
                                                                                                                                    i73 = length2;
                                                                                                                                    bArr5 = bArr4;
                                                                                                                                    z4 = true;
                                                                                                                                    z5 = true;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                int iTuitionPaymentFragmentbindingInflater3 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                                                                                                i73 = length2;
                                                                                                                                int i449 = 489030064 + ((68747265 | (~((1617212370 ^ iTuitionPaymentFragmentbindingInflater3) | (1617212370 & iTuitionPaymentFragmentbindingInflater3)))) * 576);
                                                                                                                                int i450 = (~iTuitionPaymentFragmentbindingInflater3) | 1617212370;
                                                                                                                                int i451 = ((~((i450 ^ 1683587459) | (i450 & 1683587459))) | 1614840194) * 576;
                                                                                                                                int i452 = (i449 ^ i451) + ((i449 & i451) << 1);
                                                                                                                                i81 = ((i452 | 943718976) << 1) - (943718976 ^ i452);
                                                                                                                                int i453 = -(-(((-9217025) | i15) * (-369)));
                                                                                                                                i82 = ((-130864018) & i453) + ((-130864018) | i453) + ((2121472894 | (~(1854842126 | length))) * (-369));
                                                                                                                                i83 = ~(((-1854842127) ^ i40) | ((-1854842127) & i40));
                                                                                                                                int i454 = (1854842126 ^ i15) | (1854842126 & i15);
                                                                                                                                i84 = i454 ^ 2121472894;
                                                                                                                                i85 = i454 & 2121472894;
                                                                                                                                bArr5 = bArr4;
                                                                                                                                if (i81 > (i82 - (~(-(-((((1845625102 ^ i83) | (1845625102 & i83)) | (~(i84 | i85))) * 369))))) - 1) {
                                                                                                                                    try {
                                                                                                                                        b = bytes2[i80];
                                                                                                                                        i86 = i76 % i79;
                                                                                                                                    } catch (IOException unused13) {
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    b = bytes2[i80];
                                                                                                                                    int i455 = -i79;
                                                                                                                                    i86 = ((i76 | i455) << 1) - (i455 ^ i76);
                                                                                                                                }
                                                                                                                                if (b != bytes2[i86 + i80]) {
                                                                                                                                    z4 = true;
                                                                                                                                    z5 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                int i456 = (i80 ^ (-64)) + ((i80 & (-64)) << 1);
                                                                                                                                i80 = (i456 & 65) + (i456 | 65);
                                                                                                                                str8 = str9;
                                                                                                                                length2 = i73;
                                                                                                                                bArr4 = bArr5;
                                                                                                                            }
                                                                                                                            if ((!z5) != z4) {
                                                                                                                                i76 = i79;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i79 = (-2) - (~i79);
                                                                                                                            str8 = str9;
                                                                                                                            length2 = i73;
                                                                                                                            bArr4 = bArr5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i77 = i447;
                                                                                                                    str8 = str9;
                                                                                                                    length2 = i73;
                                                                                                                    bArr4 = bArr5;
                                                                                                                }
                                                                                                                str9 = str8;
                                                                                                                i73 = length2;
                                                                                                                bArr5 = bArr4;
                                                                                                                i78 = (i78 | 1) + (i78 & 1);
                                                                                                                i77 = i447;
                                                                                                                str8 = str9;
                                                                                                                length2 = i73;
                                                                                                                bArr4 = bArr5;
                                                                                                            }
                                                                                                            str8 = str8;
                                                                                                            length2 = length2;
                                                                                                            bArr4 = bArr4;
                                                                                                            i75 = 0;
                                                                                                            i74 = 4096;
                                                                                                        } catch (IOException unused14) {
                                                                                                            str9 = str8;
                                                                                                            i73 = length2;
                                                                                                        }
                                                                                                    }
                                                                                                    str9 = str8;
                                                                                                    i73 = length2;
                                                                                                    if (i76 == length3) {
                                                                                                        z3 = true;
                                                                                                    } else {
                                                                                                        z3 = false;
                                                                                                    }
                                                                                                    try {
                                                                                                        bufferedInputStream8.close();
                                                                                                    } catch (IOException unused15) {
                                                                                                    }
                                                                                                    if (z3) {
                                                                                                        i72++;
                                                                                                        strArr6 = strArr9;
                                                                                                        strArr8 = strArr10;
                                                                                                        str8 = str9;
                                                                                                        length2 = i73;
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    if (bufferedInputStream8 != null) {
                                                                                                        try {
                                                                                                            bufferedInputStream8.close();
                                                                                                        } catch (IOException unused16) {
                                                                                                        }
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (IOException unused17) {
                                                                                                strArr9 = strArr6;
                                                                                                strArr10 = strArr8;
                                                                                            }
                                                                                        } catch (IOException unused18) {
                                                                                            strArr9 = strArr6;
                                                                                            strArr10 = strArr8;
                                                                                            str9 = str8;
                                                                                            i73 = length2;
                                                                                            bufferedInputStream8 = null;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            bufferedInputStream8 = null;
                                                                                        }
                                                                                    }
                                                                                    int i457 = (i57 & 170) + (i57 | 170);
                                                                                    i58 = (i457 & length) | ((~i457) & i40);
                                                                                    break loop7;
                                                                                }
                                                                                i56 = (i56 & (-103)) + (i56 | (-103)) + 104;
                                                                                strArr6 = strArr6;
                                                                            }
                                                                        }
                                                                        int i458 = (~(i40 & i55)) & (i40 | i55);
                                                                        int i459 = -i458;
                                                                        int i460 = ((i458 & i459) | (i458 ^ i459)) >> 31;
                                                                        int i461 = (i58 & (~i460)) | (i55 & i460);
                                                                        int i462 = -TextUtils.indexOf(str5, str5, 0);
                                                                        int i463 = (i462 & 2086) + (i462 | 2086);
                                                                        int i464 = -TextUtils.indexOf(str5, str5);
                                                                        int i465 = (i464 ^ 13) + ((i464 & 13) << 1);
                                                                        int i466 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                        Object[] objArr91 = new Object[1];
                                                                        a(i463, i465, (char) ((i466 & 11706) + (i466 | 11706)), objArr91);
                                                                        str7 = (String) objArr91[0];
                                                                        Object[] objArr92 = new Object[1];
                                                                        a(2098 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), 7 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (char) View.resolveSize(0, 0), objArr92);
                                                                        bytes = ((String) objArr92[0]).getBytes();
                                                                        length = bytes.length;
                                                                        if (length != 0) {
                                                                            try {
                                                                                bufferedInputStream7 = new BufferedInputStream(new FileInputStream(str7));
                                                                                try {
                                                                                    bArr3 = new byte[4096];
                                                                                    i62 = 0;
                                                                                    while (true) {
                                                                                        i63 = bufferedInputStream7.read(bArr3, 0, 4096);
                                                                                        if (i63 > 0) {
                                                                                            break;
                                                                                        }
                                                                                        i64 = 0;
                                                                                        while (i62 < length) {
                                                                                            i65 = TuitionPaymentFragmentbindingInflater1;
                                                                                            int i467 = (i65 ^ 87) + ((i65 & 87) << 1);
                                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i467 % 128;
                                                                                            int i468 = i467 % 2;
                                                                                            if (i64 < i63) {
                                                                                                break;
                                                                                            }
                                                                                            if (bArr3[i64] == bytes[i62]) {
                                                                                                i66 = (i65 ^ 89) + ((i65 & 89) << 1);
                                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                                                                                                if (i66 % 2 == 0) {
                                                                                                    i62 += 90;
                                                                                                } else {
                                                                                                    i62++;
                                                                                                }
                                                                                            } else if (i62 != 0) {
                                                                                                i67 = i62 - 1;
                                                                                                while (true) {
                                                                                                    if (i67 > 0) {
                                                                                                        i62 = 0;
                                                                                                        break;
                                                                                                    }
                                                                                                    i68 = 0;
                                                                                                    while (true) {
                                                                                                        if (i68 < i67) {
                                                                                                            i69 = 1;
                                                                                                            z2 = true;
                                                                                                            break;
                                                                                                        }
                                                                                                        int i469 = -i67;
                                                                                                        i70 = (i62 ^ i469) + ((i469 & i62) << 1);
                                                                                                        if (bytes[i68] != bytes[((i70 | i68) << 1) - (i70 ^ i68)]) {
                                                                                                            i69 = 1;
                                                                                                            z2 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        int i470 = (i68 ^ (-107)) + ((i68 & (-107)) << 1);
                                                                                                        i68 = ((i470 | 108) << 1) - (i470 ^ 108);
                                                                                                    }
                                                                                                    if (!z2) {
                                                                                                        int i471 = TuitionPaymentFragmentbindingInflater1 + 99;
                                                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i471 % 128;
                                                                                                        int i472 = i471 % 2;
                                                                                                        i62 = i67;
                                                                                                        break;
                                                                                                    }
                                                                                                    int i473 = ((i67 | 3) << i69) - (i67 ^ 3);
                                                                                                    i67 = (i473 & (-4)) + (i473 | (-4));
                                                                                                }
                                                                                            }
                                                                                            i64 = (i64 | 1) + (i64 & 1);
                                                                                        }
                                                                                    }
                                                                                    if (i62 == length) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    try {
                                                                                        bufferedInputStream7.close();
                                                                                    } catch (IOException unused19) {
                                                                                    }
                                                                                    if (!z) {
                                                                                        length = length;
                                                                                        i61 = i40;
                                                                                        int i474 = ((~i461) & i40) | (i461 & length);
                                                                                        int i475 = -i474;
                                                                                        int i476 = ((i474 & i475) | (i474 ^ i475)) >> 31;
                                                                                        int i477 = i61 & (~i476);
                                                                                        int i478 = i461 & i476;
                                                                                        int i479 = (i477 & i478) | (i477 ^ i478);
                                                                                        int i480 = 2106 - (~(-(-Color.red(0))));
                                                                                        int i481 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                                        int i482 = -Color.green(0);
                                                                                        Object[] objArr93 = new Object[1];
                                                                                        a(i480, ((i481 | 47) << 1) - (i481 ^ 47), (char) (((i482 | 30402) << 1) - (i482 ^ 30402)), objArr93);
                                                                                        Object[] objArr94 = {(String) objArr93[0]};
                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                                            char c11 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                            int iArgb3 = Color.argb(0, 0, 0, 0) + 993;
                                                                                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                                                                                            byte b38 = (byte) (-1);
                                                                                            Object[] objArr95 = new Object[1];
                                                                                            c(b38, (byte) (b38 & 6), (byte) 0, objArr95);
                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c11, iArgb3, doubleTapTimeout2, -545305915, false, (String) objArr95[0], new Class[]{String.class});
                                                                                        }
                                                                                        long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr94)).longValue();
                                                                                        long j84 = -275856909;
                                                                                        long j85 = jLongValue13 ^ j3;
                                                                                        long j86 = 933;
                                                                                        long j87 = (((long) 934) * j84) + (((long) (-932)) * jLongValue13) + (((long) (-933)) * ((((j84 ^ j3) | j50) ^ j3) | j85)) + ((((j85 | j84) ^ j3) | ((j85 | j50) ^ j3)) * j86) + (j86 * ((jLongValue13 | j84) ^ j3)) + ((long) 896316193);
                                                                                        int i483 = ((int) (j87 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                                                                                        int i484 = ((int) j87) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                                                                                        int i485 = ((i483 & i484) | (i483 ^ i484)) * 263;
                                                                                        int i486 = i40 ^ i479;
                                                                                        int i487 = -i486;
                                                                                        int i488 = ((i486 & i487) | (i486 ^ i487)) >> 31;
                                                                                        i41 = (i479 & i488) | (((i485 & length) | ((~i485) & i40)) & (~i488));
                                                                                        strArr3 = strArr5;
                                                                                    }
                                                                                } catch (IOException unused20) {
                                                                                    if (bufferedInputStream7 != null) {
                                                                                        try {
                                                                                            bufferedInputStream7.close();
                                                                                        } catch (IOException unused21) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    if (bufferedInputStream7 != null) {
                                                                                        try {
                                                                                            bufferedInputStream7.close();
                                                                                        } catch (IOException unused22) {
                                                                                        }
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } catch (IOException unused23) {
                                                                                bufferedInputStream7 = null;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                bufferedInputStream7 = null;
                                                                            }
                                                                        }
                                                                        i59 = i40 & (-151);
                                                                        length = length;
                                                                        i60 = length & 150;
                                                                        i61 = i59 | i60;
                                                                        int i4710 = ((~i461) & i40) | (i461 & length);
                                                                        int i4711 = -i4710;
                                                                        int i4712 = ((i4710 & i4711) | (i4710 ^ i4711)) >> 31;
                                                                        int i4713 = i61 & (~i4712);
                                                                        int i4714 = i461 & i4712;
                                                                        int i4715 = (i4713 & i4714) | (i4713 ^ i4714);
                                                                        int i489 = 2106 - (~(-(-Color.red(0))));
                                                                        int i4810 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                        int i4811 = -Color.green(0);
                                                                        Object[] objArr96 = new Object[1];
                                                                        a(i489, ((i4810 | 47) << 1) - (i4810 ^ 47), (char) (((i4811 | 30402) << 1) - (i4811 ^ 30402)), objArr96);
                                                                        Object[] objArr97 = {(String) objArr96[0]};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                            char c12 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                            int iArgb4 = Color.argb(0, 0, 0, 0) + 993;
                                                                            int doubleTapTimeout3 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                                                                            byte b39 = (byte) (-1);
                                                                            Object[] objArr98 = new Object[1];
                                                                            c(b39, (byte) (b39 & 6), (byte) 0, objArr98);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c12, iArgb4, doubleTapTimeout3, -545305915, false, (String) objArr98[0], new Class[]{String.class});
                                                                        }
                                                                        long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr97)).longValue();
                                                                        long j88 = -275856909;
                                                                        long j89 = jLongValue14 ^ j3;
                                                                        long j810 = 933;
                                                                        long j811 = (((long) 934) * j88) + (((long) (-932)) * jLongValue14) + (((long) (-933)) * ((((j88 ^ j3) | j50) ^ j3) | j89)) + ((((j89 | j88) ^ j3) | ((j89 | j50) ^ j3)) * j810) + (j810 * ((jLongValue14 | j88) ^ j3)) + ((long) 896316193);
                                                                        int i4812 = ((int) (j811 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                                                                        int i4813 = ((int) j811) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                                                                        int i4814 = ((i4812 & i4813) | (i4812 ^ i4813)) * 263;
                                                                        int i4815 = i40 ^ i4715;
                                                                        int i4816 = -i4815;
                                                                        int i4817 = ((i4815 & i4816) | (i4815 ^ i4816)) >> 31;
                                                                        i41 = (i4715 & i4817) | (((i4814 & length) | ((~i4814) & i40)) & (~i4817));
                                                                        strArr3 = strArr5;
                                                                    } else {
                                                                        str5 = str4;
                                                                    }
                                                                    if (length != 0) {
                                                                        bufferedInputStream7 = new BufferedInputStream(new FileInputStream(str7));
                                                                        bArr3 = new byte[4096];
                                                                        i62 = 0;
                                                                        while (true) {
                                                                            i63 = bufferedInputStream7.read(bArr3, 0, 4096);
                                                                            if (i63 > 0) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            i64 = 0;
                                                                            while (i62 < length) {
                                                                                i65 = TuitionPaymentFragmentbindingInflater1;
                                                                                int i4610 = (i65 ^ 87) + ((i65 & 87) << 1);
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4610 % 128;
                                                                                int i4611 = i4610 % 2;
                                                                                if (i64 < i63) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                if (bArr3[i64] == bytes[i62]) {
                                                                                    i66 = (i65 ^ 89) + ((i65 & 89) << 1);
                                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                                                                                    if (i66 % 2 == 0) {
                                                                                        i62 += 90;
                                                                                    } else {
                                                                                        i62++;
                                                                                    }
                                                                                } else if (i62 != 0) {
                                                                                    i67 = i62 - 1;
                                                                                    while (true) {
                                                                                        if (i67 > 0) {
                                                                                            i62 = 0;
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        i68 = 0;
                                                                                        while (true) {
                                                                                            if (i68 < i67) {
                                                                                                i69 = 1;
                                                                                                z2 = true;
                                                                                                break;
                                                                                            }
                                                                                            int i4612 = -i67;
                                                                                            i70 = (i62 ^ i4612) + ((i4612 & i62) << 1);
                                                                                            if (bytes[i68] != bytes[((i70 | i68) << 1) - (i70 ^ i68)]) {
                                                                                                i69 = 1;
                                                                                                z2 = false;
                                                                                                break;
                                                                                            }
                                                                                            int i4716 = (i68 ^ (-107)) + ((i68 & (-107)) << 1);
                                                                                            i68 = ((i4716 | 108) << 1) - (i4716 ^ 108);
                                                                                        }
                                                                                        if (!z2) {
                                                                                            int i4717 = TuitionPaymentFragmentbindingInflater1 + 99;
                                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4717 % 128;
                                                                                            int i4718 = i4717 % 2;
                                                                                            i62 = i67;
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        int i4719 = ((i67 | 3) << i69) - (i67 ^ 3);
                                                                                        i67 = (i4719 & (-4)) + (i4719 | (-4));
                                                                                    }
                                                                                }
                                                                                i64 = (i64 | 1) + (i64 & 1);
                                                                            }
                                                                            i59 = i40 & (-152);
                                                                            i60 = length & 151;
                                                                            i61 = i59 | i60;
                                                                            int i47110 = ((~i461) & i40) | (i461 & length);
                                                                            int i47111 = -i47110;
                                                                            int i47112 = ((i47110 & i47111) | (i47110 ^ i47111)) >> 31;
                                                                            int i47113 = i61 & (~i47112);
                                                                            int i47114 = i461 & i47112;
                                                                            int i47115 = (i47113 & i47114) | (i47113 ^ i47114);
                                                                            int i4818 = 2106 - (~(-(-Color.red(0))));
                                                                            int i4819 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                            int i48110 = -Color.green(0);
                                                                            Object[] objArr99 = new Object[1];
                                                                            a(i4818, ((i4819 | 47) << 1) - (i4819 ^ 47), (char) (((i48110 | 30402) << 1) - (i48110 ^ 30402)), objArr99);
                                                                            Object[] objArr910 = {(String) objArr99[0]};
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                                char c13 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                int iArgb5 = Color.argb(0, 0, 0, 0) + 993;
                                                                                int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                                                                                byte b310 = (byte) (-1);
                                                                                Object[] objArr911 = new Object[1];
                                                                                c(b310, (byte) (b310 & 6), (byte) 0, objArr911);
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c13, iArgb5, doubleTapTimeout4, -545305915, false, (String) objArr911[0], new Class[]{String.class});
                                                                            }
                                                                            long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr910)).longValue();
                                                                            long j812 = -275856909;
                                                                            long j813 = jLongValue15 ^ j3;
                                                                            long j814 = 933;
                                                                            long j815 = (((long) 934) * j812) + (((long) (-932)) * jLongValue15) + (((long) (-933)) * ((((j812 ^ j3) | j50) ^ j3) | j813)) + ((((j813 | j812) ^ j3) | ((j813 | j50) ^ j3)) * j814) + (j814 * ((jLongValue15 | j812) ^ j3)) + ((long) 896316193);
                                                                            int i48111 = ((int) (j815 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                                                                            int i48112 = ((int) j815) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                                                                            int i48113 = ((i48111 & i48112) | (i48111 ^ i48112)) * 263;
                                                                            int i48114 = i40 ^ i47115;
                                                                            int i48115 = -i48114;
                                                                            int i48116 = ((i48114 & i48115) | (i48114 ^ i48115)) >> 31;
                                                                            i41 = (i47115 & i48116) | (((i48113 & length) | ((~i48113) & i40)) & (~i48116));
                                                                            strArr3 = strArr5;
                                                                        }
                                                                        if (i62 == length) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        bufferedInputStream7.close();
                                                                        if (!z) {
                                                                            length = length;
                                                                            i61 = i40;
                                                                            int i47116 = ((~i461) & i40) | (i461 & length);
                                                                            int i47117 = -i47116;
                                                                            int i47118 = ((i47116 & i47117) | (i47116 ^ i47117)) >> 31;
                                                                            int i47119 = i61 & (~i47118);
                                                                            int i471110 = i461 & i47118;
                                                                            int i471111 = (i47119 & i471110) | (i47119 ^ i471110);
                                                                            int i48117 = 2106 - (~(-(-Color.red(0))));
                                                                            int i48118 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                            int i48119 = -Color.green(0);
                                                                            Object[] objArr912 = new Object[1];
                                                                            a(i48117, ((i48118 | 47) << 1) - (i48118 ^ 47), (char) (((i48119 | 30402) << 1) - (i48119 ^ 30402)), objArr912);
                                                                            Object[] objArr913 = {(String) objArr912[0]};
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                                char c14 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                                int iArgb6 = Color.argb(0, 0, 0, 0) + 993;
                                                                                int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                                                                                byte b311 = (byte) (-1);
                                                                                Object[] objArr914 = new Object[1];
                                                                                c(b311, (byte) (b311 & 6), (byte) 0, objArr914);
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c14, iArgb6, doubleTapTimeout5, -545305915, false, (String) objArr914[0], new Class[]{String.class});
                                                                            }
                                                                            long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr913)).longValue();
                                                                            long j816 = -275856909;
                                                                            long j817 = jLongValue16 ^ j3;
                                                                            long j818 = 933;
                                                                            long j819 = (((long) 934) * j816) + (((long) (-932)) * jLongValue16) + (((long) (-933)) * ((((j816 ^ j3) | j50) ^ j3) | j817)) + ((((j817 | j816) ^ j3) | ((j817 | j50) ^ j3)) * j818) + (j818 * ((jLongValue16 | j816) ^ j3)) + ((long) 896316193);
                                                                            int i481110 = ((int) (j819 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                                                                            int i481111 = ((int) j819) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                                                                            int i481112 = ((i481110 & i481111) | (i481110 ^ i481111)) * 263;
                                                                            int i481113 = i40 ^ i471111;
                                                                            int i481114 = -i481113;
                                                                            int i481115 = ((i481113 & i481114) | (i481113 ^ i481114)) >> 31;
                                                                            i41 = (i471111 & i481115) | (((i481112 & length) | ((~i481112) & i40)) & (~i481115));
                                                                            strArr3 = strArr5;
                                                                        }
                                                                    }
                                                                    i59 = i40 & (-151);
                                                                    length = length;
                                                                    i60 = length & 150;
                                                                } catch (Exception unused24) {
                                                                    i59 = i40 & (-152);
                                                                    i60 = length & 151;
                                                                }
                                                                int i4613 = -TextUtils.indexOf(str5, str5, 0);
                                                                int i4614 = (i4613 & 2086) + (i4613 | 2086);
                                                                int i4615 = -TextUtils.indexOf(str5, str5);
                                                                int i4616 = (i4615 ^ 13) + ((i4615 & 13) << 1);
                                                                int i4617 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                Object[] objArr915 = new Object[1];
                                                                a(i4614, i4616, (char) ((i4617 & 11706) + (i4617 | 11706)), objArr915);
                                                                str7 = (String) objArr915[0];
                                                                Object[] objArr916 = new Object[1];
                                                                a(2098 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), 7 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (char) View.resolveSize(0, 0), objArr916);
                                                                bytes = ((String) objArr916[0]).getBytes();
                                                                length = bytes.length;
                                                            } catch (Exception unused25) {
                                                                length = length;
                                                            }
                                                            int doubleTapTimeout6 = 370 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int i490 = -View.resolveSize(0, 0);
                                                            Object[] objArr100 = new Object[1];
                                                            a(doubleTapTimeout6, (i490 ^ 23) + ((i490 & 23) << 1), (char) (TextUtils.getTrimmedLength(str5) + 63257), objArr100);
                                                            String str36 = (String) objArr100[0];
                                                            int i491 = 807 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                            int iLastIndexOf4 = TextUtils.lastIndexOf(str5, '0');
                                                            Object[] objArr101 = new Object[1];
                                                            a(i491, (iLastIndexOf4 ^ 11) + ((iLastIndexOf4 & 11) << 1), (char) (19077 - (ViewConfiguration.getTouchSlop() >> 8)), objArr101);
                                                            String str37 = (String) objArr101[0];
                                                            Object[] objArr102 = new Object[1];
                                                            a(ExpandableListView.getPackedPositionGroup(0L) + 818, 6 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16)), (char) ((-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))) - 1), objArr102);
                                                            String str38 = (String) objArr102[0];
                                                            int i492 = 826 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int i493 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                            Object[] objArr103 = new Object[1];
                                                            a(i492, (i493 ^ 7) + ((i493 & 7) << 1), (char) (View.MeasureSpec.getSize(0) + 12484), objArr103);
                                                            String[] strArr18 = {str36, str37, str38, (String) objArr103[0]};
                                                            int i494 = 831 - (~(-TextUtils.lastIndexOf(str5, '0')));
                                                            int i495 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int i496 = ((i495 | 17) << 1) - (i495 ^ 17);
                                                            int i497 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                            Object[] objArr104 = new Object[1];
                                                            a(i494, i496, (char) ((i497 ^ 2368) + ((i497 & 2368) << 1)), objArr104);
                                                            String str39 = (String) objArr104[0];
                                                            int i498 = -(-(Process.myTid() >> 22));
                                                            int i499 = (i498 ^ 850) + ((i498 & 850) << 1);
                                                            int i500 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                            Object[] objArr105 = new Object[1];
                                                            a(i499, ((i500 | 6) << 1) - (i500 ^ 6), (char) (15386 - (~(-(-TextUtils.getTrimmedLength(str5))))), objArr105);
                                                            String str40 = (String) objArr105[0];
                                                            int i501 = -View.MeasureSpec.getSize(0);
                                                            int i502 = ((i501 | 857) << 1) - (i501 ^ 857);
                                                            int i503 = -AndroidCharacter.getMirror('0');
                                                            Object[] objArr106 = new Object[1];
                                                            a(i502, (i503 & 55) + (i503 | 55), (char) (50895 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr106);
                                                            String str41 = (String) objArr106[0];
                                                            int i504 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                            int i505 = ((i504 | 865) << 1) - (i504 ^ 865);
                                                            int i506 = -View.combineMeasuredStates(0, 0);
                                                            Object[] objArr107 = new Object[1];
                                                            a(i505, (i506 ^ 11) + ((i506 & 11) << 1), (char) (4319 - (~(-ImageFormat.getBitsPerPixel(0)))), objArr107);
                                                            String str42 = (String) objArr107[0];
                                                            int iIndexOf8 = TextUtils.indexOf((CharSequence) str5, '0', 0) + 876;
                                                            int i507 = 14 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                            int iIndexOf9 = TextUtils.indexOf(str5, str5);
                                                            Object[] objArr108 = new Object[1];
                                                            a(iIndexOf8, i507, (char) (((iIndexOf9 | 23401) << 1) - (iIndexOf9 ^ 23401)), objArr108);
                                                            String[] strArr19 = {str39, str40, str41, str42, (String) objArr108[0]};
                                                            int i508 = -TextUtils.lastIndexOf(str5, '0');
                                                            int i509 = -TextUtils.lastIndexOf(str5, '0');
                                                            Object[] objArr109 = new Object[1];
                                                            a((i508 ^ 888) + ((i508 & 888) << 1), (i509 ^ 15) + ((i509 & 15) << 1), (char) View.getDefaultSize(0, 0), objArr109);
                                                            String str43 = (String) objArr109[0];
                                                            int i510 = -TextUtils.indexOf(str5, str5);
                                                            int i511 = ((i510 | TypedValues.Custom.TYPE_DIMENSION) << 1) - (i510 ^ TypedValues.Custom.TYPE_DIMENSION);
                                                            int i512 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i513 = ~i512;
                                                            int i514 = (i513 & (-4)) | (i513 ^ (-4));
                                                            int i515 = ~((i514 & i40) | (i514 ^ i40));
                                                            int i516 = (i15 ^ i512) | (i15 & i512);
                                                            int i517 = ~((i516 & 3) | (i516 ^ 3));
                                                            int i518 = (((i512 * (-317)) + 957) - (~(-(-(((i515 & i517) | (i515 ^ i517)) * (-318)))))) - 1;
                                                            int i519 = ~(((-4) ^ i512) | ((-4) & i512));
                                                            int i520 = ~((i512 ^ i40) | (i512 & i40));
                                                            int i521 = ((i519 & i520) | (i519 ^ i520)) * (-318);
                                                            int i522 = (i518 ^ i521) + ((i518 & i521) << 1);
                                                            int i523 = ~i512;
                                                            int i524 = ~((i523 & i40) | (i523 ^ i40));
                                                            Object[] objArr110 = new Object[1];
                                                            a(i511, (i522 - (~(-(-(((i524 & (-4)) | ((-4) ^ i524)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr110);
                                                            String str44 = (String) objArr110[0];
                                                            int i525 = -KeyEvent.normalizeMetaState(0);
                                                            Object[] objArr111 = new Object[1];
                                                            a((i525 ^ 916) + ((i525 & 916) << 1), 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (57166 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr111);
                                                            String str45 = (String) objArr111[0];
                                                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                                            Object[] objArr112 = new Object[1];
                                                            a(((packedPositionChild2 | 939) << 1) - (packedPositionChild2 ^ 939), 24 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr112);
                                                            String str46 = (String) objArr112[0];
                                                            int i526 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                            int i527 = (i526 ^ 963) + ((i526 & 963) << 1);
                                                            int i528 = 27 - (~(-Drawable.resolveOpacity(0, 0)));
                                                            int i529 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            Object[] objArr113 = new Object[1];
                                                            a(i527, i528, (char) ((i529 ^ 1373) + ((i529 & 1373) << 1)), objArr113);
                                                            String[] strArr20 = {str43, str44, str, str45, str46, (String) objArr113[0]};
                                                            int i530 = -(-Drawable.resolveOpacity(0, 0));
                                                            int i531 = (i530 & 991) + (i530 | 991);
                                                            int i532 = -View.getDefaultSize(0, 0);
                                                            int i533 = (i532 * 477) - 5225;
                                                            int i534 = ~((~i532) | 11);
                                                            int i535 = ((-12) & i532) | ((-12) ^ i532);
                                                            int i536 = ~((i535 & i40) | (i535 ^ i40));
                                                            int i537 = -(-(((i534 & i536) | (i534 ^ i536)) * (-476)));
                                                            int i538 = (i533 & i537) + (i533 | i537);
                                                            int i539 = ((-12) & i532) | ((-12) ^ i532);
                                                            int i540 = i538 + ((~((i539 & i40) | (i539 ^ i40))) * 952);
                                                            int i541 = ((-12) ^ i42) | ((-12) & i42);
                                                            int i542 = -(-((~((i532 & i541) | (i541 ^ i532))) * 476));
                                                            Object[] objArr114 = new Object[1];
                                                            a(i531, (i540 & i542) + (i542 | i540), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr114);
                                                            String str47 = (String) objArr114[0];
                                                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int iTuitionPaymentFragmentbindingInflater4 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i543 = (iMakeMeasureSpec2 * 714) - 713424;
                                                            int i544 = ~iMakeMeasureSpec2;
                                                            int i545 = ~iTuitionPaymentFragmentbindingInflater4;
                                                            int i546 = ~((i544 & i545) | (i544 ^ i545));
                                                            int i547 = ~iMakeMeasureSpec2;
                                                            int i548 = ~((i547 & 1002) | (i547 ^ 1002));
                                                            int i549 = (i546 & i548) | (i546 ^ i548);
                                                            int i550 = ((-1003) & iMakeMeasureSpec2) | ((-1003) ^ iMakeMeasureSpec2);
                                                            int i551 = ~((i550 & iTuitionPaymentFragmentbindingInflater4) | (i550 ^ iTuitionPaymentFragmentbindingInflater4));
                                                            int i552 = -(-(((i549 & i551) | (i549 ^ i551)) * (-713)));
                                                            int i553 = iMakeMeasureSpec2 | (-1003);
                                                            Object[] objArr115 = new Object[1];
                                                            a(((((i543 ^ i552) + ((i543 & i552) << 1)) - (~((~((i553 & iTuitionPaymentFragmentbindingInflater4) | (i553 ^ iTuitionPaymentFragmentbindingInflater4))) * 1426))) - 1) + ((~((~iTuitionPaymentFragmentbindingInflater4) | (-1003))) * 713), 8 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), (char) View.MeasureSpec.getSize(0), objArr115);
                                                            String str48 = (String) objArr115[0];
                                                            int i554 = -KeyEvent.getDeadChar(0, 0);
                                                            int i555 = ((i554 | PointerIconCompat.TYPE_ALIAS) << 1) - (i554 ^ PointerIconCompat.TYPE_ALIAS);
                                                            int i556 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
                                                            Object[] objArr116 = new Object[1];
                                                            a(i555, (i556 ^ 5) + ((i556 & 5) << 1), (char) (38254 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr116);
                                                            String str49 = (String) objArr116[0];
                                                            int i557 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            Object[] objArr117 = new Object[1];
                                                            a((i557 ^ PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) + ((i557 & PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) << 1), 4 - (~(-MotionEvent.axisFromString(str5))), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45138), objArr117);
                                                            String[] strArr21 = {str47, str48, str49, (String) objArr117[0]};
                                                            int i558 = 1022 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                            int size3 = View.MeasureSpec.getSize(0) + 16;
                                                            int offsetAfter2 = TextUtils.getOffsetAfter(str5, 0);
                                                            Object[] objArr118 = new Object[1];
                                                            a(i558, size3, (char) (((offsetAfter2 | 55868) << 1) - (offsetAfter2 ^ 55868)), objArr118);
                                                            String str50 = (String) objArr118[0];
                                                            int i559 = 857 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                            int i560 = -(Process.myTid() >> 22);
                                                            int i561 = (i560 & 7) + (i560 | 7);
                                                            int threadPriority6 = Process.getThreadPriority(0);
                                                            int i562 = ((threadPriority6 ^ 20) + ((threadPriority6 & 20) << 1)) >> 6;
                                                            Object[] objArr119 = new Object[1];
                                                            a(i559, i561, (char) (((i562 | 50897) << 1) - (i562 ^ 50897)), objArr119);
                                                            String str51 = (String) objArr119[0];
                                                            int i563 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            int i564 = ((i563 | 825) << 1) - (i563 ^ 825);
                                                            int scrollBarSize6 = (ViewConfiguration.getScrollBarSize() >> 8) + 8;
                                                            int i565 = -TextUtils.getOffsetAfter(str5, 0);
                                                            Object[] objArr120 = new Object[1];
                                                            a(i564, scrollBarSize6, (char) ((i565 ^ 12484) + ((i565 & 12484) << 1)), objArr120);
                                                            String[] strArr22 = {str50, str51, (String) objArr120[0]};
                                                            int i566 = -TextUtils.indexOf(str5, str5, 0);
                                                            int i567 = (i566 ^ 1038) + ((i566 & 1038) << 1);
                                                            int i568 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            Object[] objArr121 = new Object[1];
                                                            a(i567, (i568 ^ 14) + ((i568 & 14) << 1), (char) (21690 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr121);
                                                            String str52 = (String) objArr121[0];
                                                            int gidForName = Process.getGidForName(str5);
                                                            int i569 = (gidForName * (-183)) + 194805;
                                                            int i570 = ~gidForName;
                                                            int i571 = ~((i570 ^ 1053) | (i570 & 1053));
                                                            int i572 = ~((i42 ^ 1053) | (i42 & 1053));
                                                            int i573 = ((i571 & i572) | (i571 ^ i572)) * 184;
                                                            int i574 = ~((gidForName & (-1054)) | ((-1054) ^ gidForName));
                                                            int i575 = ((((i569 | i573) << 1) - (i569 ^ i573)) - (~(((i574 & i40) | (i40 ^ i574)) * (-184)))) - 1;
                                                            int i576 = -(-((~((i570 ^ i42) | (i570 & i42))) * 184));
                                                            int defaultSize = View.getDefaultSize(0, 0);
                                                            Object[] objArr122 = new Object[1];
                                                            a(((i575 | i576) << 1) - (i576 ^ i575), ((defaultSize | 1) << 1) - (defaultSize ^ 1), (char) TextUtils.indexOf(str5, str5, 0), objArr122);
                                                            String[] strArr23 = {str52, (String) objArr122[0]};
                                                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1053;
                                                            int i577 = 9 - (~(-(-TextUtils.indexOf((CharSequence) str5, '0', 0))));
                                                            int i578 = -KeyEvent.normalizeMetaState(0);
                                                            Object[] objArr123 = new Object[1];
                                                            a(minimumFlingVelocity2, i577, (char) ((i578 & 19551) + (i578 | 19551)), objArr123);
                                                            String str53 = (String) objArr123[0];
                                                            Object[] objArr124 = new Object[1];
                                                            a(1061 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0)))), 0 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) View.MeasureSpec.getMode(0), objArr124);
                                                            String[] strArr24 = {str53, (String) objArr124[0]};
                                                            int i579 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i580 = ((i579 | 1063) << 1) - (i579 ^ 1063);
                                                            int i581 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            Object[] objArr125 = new Object[1];
                                                            a(i580, (i581 ^ 15) + ((i581 & 15) << 1), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr125);
                                                            String str54 = (String) objArr125[0];
                                                            int i582 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                            int i583 = (i582 & TypedValues.Custom.TYPE_DIMENSION) + (i582 | TypedValues.Custom.TYPE_DIMENSION);
                                                            int i584 = -View.getDefaultSize(0, 0);
                                                            Object[] objArr126 = new Object[1];
                                                            a(i583, ((i584 | 3) << 1) - (i584 ^ 3), (char) (Process.myPid() >> 22), objArr126);
                                                            String str55 = (String) objArr126[0];
                                                            int longPressTimeout3 = 850 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            int trimmedLength3 = TextUtils.getTrimmedLength(str5) + 7;
                                                            int i585 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            Object[] objArr127 = new Object[1];
                                                            a(longPressTimeout3, trimmedLength3, (char) ((i585 & 15387) + (i585 | 15387)), objArr127);
                                                            String str56 = (String) objArr127[0];
                                                            int offsetAfter3 = TextUtils.getOffsetAfter(str5, 0);
                                                            int i586 = (offsetAfter3 & 1079) + (offsetAfter3 | 1079);
                                                            int i587 = -(-Color.alpha(0));
                                                            int i588 = -(-TextUtils.lastIndexOf(str5, '0', 0));
                                                            Object[] objArr128 = new Object[1];
                                                            a(i586, ((i587 | 8) << 1) - (i587 ^ 8), (char) (((i588 | 2449) << 1) - (i588 ^ 2449)), objArr128);
                                                            String str57 = (String) objArr128[0];
                                                            int i589 = 864 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask()))));
                                                            int iIndexOf10 = TextUtils.indexOf(str5, str5, 0);
                                                            Object[] objArr129 = new Object[1];
                                                            a(i589, (iIndexOf10 & 11) + (iIndexOf10 | 11), (char) (4320 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0)), objArr129);
                                                            String str58 = (String) objArr129[0];
                                                            int i590 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
                                                            int i591 = ((i590 | 876) << 1) - (i590 ^ 876);
                                                            int i592 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                            Object[] objArr130 = new Object[1];
                                                            a(i591, ((i592 | 14) << 1) - (i592 ^ 14), (char) (TextUtils.getTrimmedLength(str5) + 23401), objArr130);
                                                            String[] strArr25 = {str54, str55, str56, str57, str58, (String) objArr130[0]};
                                                            int i593 = 1087 - (~(-(-Process.getGidForName(str5))));
                                                            int i594 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            int i595 = (i594 ^ 20) + ((i594 & 20) << 1);
                                                            int keyRepeatTimeout4 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                            Object[] objArr131 = new Object[1];
                                                            a(i593, i595, (char) ((keyRepeatTimeout4 ^ 65417) + ((keyRepeatTimeout4 & 65417) << 1)), objArr131);
                                                            String str59 = (String) objArr131[0];
                                                            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0);
                                                            int iTuitionPaymentFragmentbindingInflater5 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i596 = iResolveOpacity3 * 51;
                                                            int i597 = (i596 ^ (-54243)) + ((i596 & (-54243)) << 1);
                                                            int i598 = -(-(((iResolveOpacity3 ^ iTuitionPaymentFragmentbindingInflater5) | (iResolveOpacity3 & iTuitionPaymentFragmentbindingInflater5)) * (-50)));
                                                            int i599 = (i597 ^ i598) + ((i598 & i597) << 1);
                                                            int i600 = (~iResolveOpacity3) | (-1108);
                                                            int i601 = ~((i600 & iTuitionPaymentFragmentbindingInflater5) | (i600 ^ iTuitionPaymentFragmentbindingInflater5));
                                                            int i602 = (-1108) | (~iTuitionPaymentFragmentbindingInflater5);
                                                            int i603 = ~((i602 & iResolveOpacity3) | (i602 ^ iResolveOpacity3));
                                                            int i604 = ((i601 & i603) | (i601 ^ i603)) * 50;
                                                            int i605 = (i599 & i604) + (i604 | i599);
                                                            int i606 = ~iTuitionPaymentFragmentbindingInflater5;
                                                            int i607 = ~(((-1108) ^ i606) | ((-1108) & i606));
                                                            int i608 = ~(((-1108) & iResolveOpacity3) | ((-1108) ^ iResolveOpacity3));
                                                            int i609 = -(-(((~((i606 & iResolveOpacity3) | (i606 ^ iResolveOpacity3))) | (i607 & i608) | (i607 ^ i608)) * 50));
                                                            int i610 = ((i605 | i609) << 1) - (i609 ^ i605);
                                                            int i611 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                                            int i612 = (i611 & 20) + (i611 | 20);
                                                            int i613 = -ExpandableListView.getPackedPositionGroup(0L);
                                                            Object[] objArr132 = new Object[1];
                                                            a(i610, i612, (char) (((i613 | 61872) << 1) - (i613 ^ 61872)), objArr132);
                                                            String str60 = (String) objArr132[0];
                                                            int tapTimeout2 = ViewConfiguration.getTapTimeout() >> 16;
                                                            int i614 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            Object[] objArr133 = new Object[1];
                                                            a(((tapTimeout2 | 1126) << 1) - (tapTimeout2 ^ 1126), (i614 & 31) + (i614 | 31), (char) TextUtils.getTrimmedLength(str5), objArr133);
                                                            String str61 = (String) objArr133[0];
                                                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                            int i615 = (iNormalizeMetaState * 829) + 959153;
                                                            int i616 = ~iNormalizeMetaState;
                                                            int i617 = ~((i616 & (-1158)) | (i616 ^ (-1158)));
                                                            int i618 = ~(i42 | iNormalizeMetaState | 1157);
                                                            int i619 = ((i617 & i618) | (i617 ^ i618)) * (-828);
                                                            int i620 = ((i615 | i619) << 1) - (i615 ^ i619);
                                                            int i621 = (iNormalizeMetaState ^ 1157) | (iNormalizeMetaState & 1157);
                                                            int i622 = (i620 - (~(-(-(((i621 ^ i15) | (i621 & i15)) * (-828)))))) - 1;
                                                            int i623 = (~i621) * 828;
                                                            int i624 = (i622 ^ i623) + ((i623 & i622) << 1);
                                                            int i625 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                            Object[] objArr134 = new Object[1];
                                                            a(i624, ((i625 | 26) << 1) - (i625 ^ 26), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr134);
                                                            String str62 = (String) objArr134[0];
                                                            int i626 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                                                            int i627 = ((i626 | 1183) << 1) - (i626 ^ 1183);
                                                            int i628 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                            Object[] objArr135 = new Object[1];
                                                            a(i627, (i628 ^ 24) + ((i628 & 24) << 1), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr135);
                                                            String str63 = (String) objArr135[0];
                                                            int i629 = 1207 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            int i630 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
                                                            int i631 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            Object[] objArr136 = new Object[1];
                                                            a(i629, i630, (char) (((i631 | 1) << 1) - (i631 ^ 1)), objArr136);
                                                            f = 0.0f;
                                                            String[] strArr26 = {str59, str60, str61, str62, str63, (String) objArr136[0], str};
                                                            int i632 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int i633 = ((i632 | 1239) << 1) - (i632 ^ 1239);
                                                            int i634 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            Object[] objArr137 = new Object[1];
                                                            a(i633, (i634 & 13) + (i634 | 13), (char) Color.green(0), objArr137);
                                                            String str64 = (String) objArr137[0];
                                                            Object[] objArr138 = new Object[1];
                                                            a(TextUtils.indexOf((CharSequence) str5, '0') + 819, 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr138);
                                                            String[] strArr27 = {str64, (String) objArr138[0]};
                                                            int touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                            int i635 = (touchSlop & 1252) + (touchSlop | 1252);
                                                            int i636 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                            Object[] objArr139 = new Object[1];
                                                            a(i635, ((i636 | 30) << 1) - (i636 ^ 30), (char) (3389 - (~(-(-TextUtils.getOffsetAfter(str5, 0))))), objArr139);
                                                            String str65 = (String) objArr139[0];
                                                            int i637 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                                            int i638 = (i637 & 1282) + (i637 | 1282);
                                                            int defaultSize2 = View.getDefaultSize(0, 0);
                                                            int iTuitionPaymentFragmentbindingInflater6 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i639 = defaultSize2 * (-405);
                                                            int i640 = ((i639 | 4477) << 1) - (i639 ^ 4477);
                                                            int i641 = ~((-12) | iTuitionPaymentFragmentbindingInflater6);
                                                            int i642 = ~iTuitionPaymentFragmentbindingInflater6;
                                                            int i643 = (i642 ^ defaultSize2) | (i642 & defaultSize2);
                                                            int i644 = ~((i643 ^ 11) | (i643 & 11));
                                                            int i645 = i640 + (((i641 ^ i644) | (i641 & i644)) * (-406));
                                                            int i646 = ~iTuitionPaymentFragmentbindingInflater6;
                                                            int i647 = (~(((-12) ^ i646) | (i646 & (-12)) | defaultSize2)) * (-406);
                                                            int i648 = (i645 ^ i647) + ((i647 & i645) << 1);
                                                            int i649 = ~defaultSize2;
                                                            int i650 = ~((iTuitionPaymentFragmentbindingInflater6 & i649) | (i649 ^ iTuitionPaymentFragmentbindingInflater6));
                                                            int i651 = ~((i642 ^ 11) | (i642 & 11));
                                                            int i652 = ((i650 & i651) | (i650 ^ i651)) * 406;
                                                            Object[] objArr140 = new Object[1];
                                                            a(i638, ((i648 | i652) << 1) - (i652 ^ i648), (char) TextUtils.getOffsetAfter(str5, 0), objArr140);
                                                            String[] strArr28 = {str65, (String) objArr140[0]};
                                                            int iGreen = Color.green(0) + 1293;
                                                            int i653 = -Process.getGidForName(str5);
                                                            int i654 = ((i653 | 18) << 1) - (i653 ^ 18);
                                                            int i655 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            Object[] objArr141 = new Object[1];
                                                            a(iGreen, i654, (char) ((i655 & 64336) + (i655 | 64336)), objArr141);
                                                            String str66 = (String) objArr141[0];
                                                            int i656 = -View.resolveSizeAndState(0, 0, 0);
                                                            Object[] objArr142 = new Object[1];
                                                            a(((i656 | 1312) << 1) - (i656 ^ 1312), 5 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.combineMeasuredStates(0, 0) + 58138), objArr142);
                                                            String[] strArr29 = {str66, (String) objArr142[0]};
                                                            int i657 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int i658 = (i657 & 1318) + (i657 | 1318);
                                                            int iResolveSize2 = View.resolveSize(0, 0) + 19;
                                                            int edgeSlop3 = ViewConfiguration.getEdgeSlop() >> 16;
                                                            int i659 = edgeSlop3 * (-375);
                                                            int i660 = ((i659 | (-5639250)) << 1) - (i659 ^ (-5639250));
                                                            int i661 = ~((~edgeSlop3) | (-15039));
                                                            int i662 = ~((edgeSlop3 ^ 15038) | (edgeSlop3 & 15038));
                                                            int i663 = i660 + (((i661 & i40) | (i40 ^ i661) | i662) * 376);
                                                            int i664 = ~((i15 ^ edgeSlop3) | (i15 & edgeSlop3));
                                                            int i665 = ~edgeSlop3;
                                                            Object[] objArr143 = new Object[1];
                                                            a(i658, iResolveSize2, (char) (i663 + (((i664 & i662) | (i664 ^ i662)) * (-376)) + (((~((i665 & i40) | (i665 ^ i40))) | 15038) * 376)), objArr143);
                                                            String[] strArr30 = {(String) objArr143[0]};
                                                            int i666 = 1335 - (~TextUtils.indexOf(str5, str5, 0));
                                                            int i667 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                            int i668 = ((i667 | 15) << 1) - (i667 ^ 15);
                                                            int i669 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                            Object[] objArr144 = new Object[1];
                                                            a(i666, i668, (char) ((i669 ^ 7169) + ((i669 & 7169) << 1)), objArr144);
                                                            String[] strArr31 = {(String) objArr144[0]};
                                                            int i670 = 1352 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                            int i671 = -View.resolveSize(0, 0);
                                                            Object[] objArr145 = new Object[1];
                                                            a(i670, ((i671 | 19) << 1) - (i671 ^ 19), (char) (34869 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr145);
                                                            String[] strArr32 = {(String) objArr145[0]};
                                                            int i672 = 1370 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
                                                            int i673 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            Object[] objArr146 = new Object[1];
                                                            a(i672, (i673 ^ 19) + ((i673 & 19) << 1), (char) Color.alpha(0), objArr146);
                                                            String[] strArr33 = {(String) objArr146[0]};
                                                            int i674 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            Object[] objArr147 = new Object[1];
                                                            a((i674 & 1391) + (i674 | 1391), 22 - (~(-(-TextUtils.getTrimmedLength(str5)))), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr147);
                                                            String[] strArr34 = {(String) objArr147[0]};
                                                            int trimmedLength4 = TextUtils.getTrimmedLength(str5) + 1413;
                                                            int i675 = 20 - (~(-View.MeasureSpec.getMode(0)));
                                                            int i676 = -View.MeasureSpec.getMode(0);
                                                            int iTuitionPaymentFragmentbindingInflater7 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i677 = i676 * 450;
                                                            int i678 = (i677 ^ (-17364928)) + ((i677 & (-17364928)) << 1);
                                                            int i679 = ~i676;
                                                            int i680 = ~((i679 & 38761) | (i679 ^ 38761));
                                                            int i681 = (-38762) | i676;
                                                            int i682 = ~((i681 ^ iTuitionPaymentFragmentbindingInflater7) | (i681 & iTuitionPaymentFragmentbindingInflater7));
                                                            int i683 = -(-(((i680 ^ i682) | (i680 & i682)) * 449));
                                                            int i684 = (i678 ^ i683) + ((i683 & i678) << 1);
                                                            int i685 = ~i676;
                                                            int i686 = i684 + ((~((i685 ^ 38761) | (i685 & 38761))) * (-1347));
                                                            int i687 = ~((i685 & 38761) | (i685 ^ 38761));
                                                            int i688 = (~iTuitionPaymentFragmentbindingInflater7) | (-38762);
                                                            char c15 = (char) (i686 + (((~((i676 & i688) | (i688 ^ i676))) | i687) * 449));
                                                            Object[] objArr148 = new Object[1];
                                                            a(trimmedLength4, i675, c15, objArr148);
                                                            String[] strArr35 = {(String) objArr148[0]};
                                                            int i689 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            Object[] objArr149 = new Object[1];
                                                            a(((i689 | 1435) << 1) - (i689 ^ 1435), TextUtils.indexOf(str5, str5) + 24, (char) View.resolveSizeAndState(0, 0, 0), objArr149);
                                                            String str67 = str;
                                                            String[] strArr36 = {(String) objArr149[0], str67};
                                                            int i690 = 1457 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
                                                            int i691 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int iTuitionPaymentFragmentbindingInflater8 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i692 = (i691 * 495) - 14297;
                                                            int i693 = (i691 | (-30)) * (-988);
                                                            int i694 = (i692 & i693) + (i692 | i693);
                                                            int i695 = (~i691) | 29;
                                                            int i696 = ~iTuitionPaymentFragmentbindingInflater8;
                                                            int i697 = ((i695 & i696) | (i695 ^ i696)) * 494;
                                                            int i698 = ((i694 | i697) << 1) - (i697 ^ i694);
                                                            int i699 = ~i691;
                                                            int i700 = ~((i699 & (-30)) | (i699 ^ (-30)));
                                                            int i701 = ~(i696 | 29);
                                                            Object[] objArr150 = new Object[1];
                                                            a(i690, i698 + (((~((i691 & 29) | (i691 ^ 29))) | (i701 & i700) | (i700 ^ i701)) * 494), (char) (KeyEvent.keyCodeFromString(str5) + 9712), objArr150);
                                                            String[] strArr37 = {(String) objArr150[0], str67};
                                                            int i702 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                                                            Object[] objArr151 = new Object[1];
                                                            a((i702 & 1486) + (i702 | 1486), (iResolveSizeAndState2 & 27) + (iResolveSizeAndState2 | 27), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr151);
                                                            String[] strArr38 = {(String) objArr151[0], str67};
                                                            int i703 = 1511 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
                                                            int i704 = -ImageFormat.getBitsPerPixel(0);
                                                            Object[] objArr152 = new Object[1];
                                                            a(i703, ((i704 | 30) << 1) - (i704 ^ 30), (char) (0 - (~(-(-ExpandableListView.getPackedPositionChild(0L))))), objArr152);
                                                            String[] strArr39 = {(String) objArr152[0], str67};
                                                            int iResolveSize3 = View.resolveSize(0, 0) + 1544;
                                                            int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                            int i705 = (scrollDefaultDelay2 ^ 27) + ((scrollDefaultDelay2 & 27) << 1);
                                                            int i706 = -(Process.myPid() >> 22);
                                                            Object[] objArr153 = new Object[1];
                                                            a(iResolveSize3, i705, (char) (((i706 | 30438) << 1) - (i706 ^ 30438)), objArr153);
                                                            String[] strArr40 = {(String) objArr153[0], str67};
                                                            int i707 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
                                                            Object[] objArr154 = new Object[1];
                                                            a((i707 & 1572) + (i707 | 1572), 30 - (~(-ExpandableListView.getPackedPositionChild(0L))), (char) (0 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr154);
                                                            strArr4 = new String[][]{strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new String[]{(String) objArr154[0], str67}};
                                                            int i708 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            Object[] objArr155 = new Object[1];
                                                            a((i708 ^ 1604) + ((i708 & 1604) << 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, (char) (40169 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr155);
                                                            c5 = 0;
                                                            sb = new StringBuilder((String) objArr155[0]);
                                                            i45 = i40;
                                                            i46 = 0;
                                                            i47 = 0;
                                                            i48 = 24;
                                                            while (i46 < i48) {
                                                                String[] strArr41 = strArr4[i46];
                                                                Object[] objArr156 = {strArr41[c5]};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                    char c16 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                                    int i709 = 3086 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                                                                    int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
                                                                    byte b40 = (byte) (-1);
                                                                    byte b41 = (byte) (-b40);
                                                                    Object[] objArr157 = new Object[1];
                                                                    c(b40, b41, (byte) (b41 - 1), objArr157);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c16, i709, threadPriority7, 1411172903, false, (String) objArr157[0], new Class[]{String.class});
                                                                }
                                                                str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr156);
                                                                String[] strArr42 = (String[]) Arrays.copyOfRange(strArr41, 1, strArr41.length);
                                                                if (str6 == null) {
                                                                }
                                                                int i710 = ((i46 | 52) << 1) - (i46 ^ 52);
                                                                i46 = (i710 & (-51)) + (i710 | (-51));
                                                                strArr4 = strArr4;
                                                                i42 = i42;
                                                                j25 = j25;
                                                                f = 0.0f;
                                                                i48 = 24;
                                                                c5 = 0;
                                                            }
                                                            length = i42;
                                                            j3 = j25;
                                                            int i711 = -ExpandableListView.getPackedPositionType(0L);
                                                            int i712 = ((i711 | 1607) << 1) - (i711 ^ 1607);
                                                            int i713 = -ImageFormat.getBitsPerPixel(0);
                                                            int i714 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                            Object[] objArr158 = new Object[1];
                                                            a(i712, i713, (char) ((i714 ^ (-1)) + (i714 << 1)), objArr158);
                                                            c6 = 0;
                                                            sb.append((String) objArr158[0]);
                                                            objArr = new Object[2];
                                                            if (i47 > 2) {
                                                                objArr[0] = new int[1];
                                                                String[] strArr43 = {sb.toString()};
                                                                ((int[]) objArr[0])[0] = i45;
                                                                objArr[1] = strArr43;
                                                            } else {
                                                                objArr[0] = new int[]{i40};
                                                                int i715 = TuitionPaymentFragmentbindingInflater1;
                                                                int i716 = (i715 ^ 93) + ((i715 & 93) << 1);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i716 % 128;
                                                                int i717 = i716 % 2;
                                                                c6 = 0;
                                                                objArr[1] = new String[0];
                                                            }
                                                            i49 = ((int[]) objArr[c6])[c6];
                                                            int i718 = (~(i40 & i44)) & (i40 | i44);
                                                            int i719 = -i718;
                                                            i50 = ((i718 & i719) | (i718 ^ i719)) >> 31;
                                                            i51 = ~i50;
                                                            i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                                                            TuitionPaymentFragmentbindingInflater1 = i52 % 128;
                                                            if (i52 % 2 != 0) {
                                                                i44 = (i44 & i50) | (i49 & i51);
                                                                obj = objArr[1];
                                                            } else {
                                                                int i720 = i49 & i51;
                                                                int i721 = i44 & i50;
                                                                i44 = (i721 & i720) | (i720 ^ i721);
                                                                obj = objArr[1];
                                                            }
                                                            strArr5 = (String[]) obj;
                                                            int i3910 = 888 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                                                            int i3911 = -View.getDefaultSize(0, 0);
                                                            Object[] objArr710 = new Object[1];
                                                            a(i3910, ((i3911 | 16) << 1) - (i3911 ^ 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr710);
                                                            Object[] objArr711 = {(String) objArr710[0]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                char edgeSlop4 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33602);
                                                                int modifierMetaStateMask3 = 3084 - ((byte) KeyEvent.getModifierMetaStateMask());
                                                                int iLastIndexOf5 = 25 - TextUtils.lastIndexOf(str5, '0', 0, 0);
                                                                byte b312 = (byte) (-1);
                                                                byte b313 = (byte) (-b312);
                                                                Object[] objArr712 = new Object[1];
                                                                c(b312, b313, (byte) (b313 - 1), objArr712);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop4, modifierMetaStateMask3, iLastIndexOf5, 1411172903, false, (String) objArr712[0], new Class[]{String.class});
                                                            }
                                                            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr711);
                                                            if (objInvoke2 == null) {
                                                                i54 = 0;
                                                            } else {
                                                                Object[] objArr713 = {objInvoke2, 42};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                                                    int iArgb7 = 3393 - Color.argb(0, 0, 0, 0);
                                                                    int mode5 = 9 - View.MeasureSpec.getMode(0);
                                                                    byte b314 = (byte) (-1);
                                                                    byte b315 = (byte) (-b314);
                                                                    Object[] objArr714 = new Object[1];
                                                                    c(b314, b315, (byte) (b315 - 1), objArr714);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity2, iArgb7, mode5, 1203525406, false, (String) objArr714[0], new Class[]{String.class, Integer.TYPE});
                                                                }
                                                                long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr713)).longValue();
                                                                long j710 = 1417205932;
                                                                long j820 = 988;
                                                                long j821 = jLongValue17 ^ j3;
                                                                long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                                long j822 = jUptimeMillis2 ^ j3;
                                                                long j823 = (((long) 989) * j710) + (((long) (-987)) * jLongValue17) + (((((j821 | j822) | j710) ^ j3) | (((j710 | jLongValue17) | jUptimeMillis2) ^ j3)) * j820) + (((long) (-988)) * (j710 | j821)) + (j820 * (((jLongValue17 | (j822 | j710)) ^ j3) | (((j710 ^ j3) | j821) ^ j3) | ((jUptimeMillis2 | j821) ^ j3))) + ((long) (-1419275809));
                                                                int i3912 = TuitionPaymentFragmentbindingInflater1;
                                                                int i4010 = (i3912 ^ 13) + ((i3912 & 13) << 1);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4010 % 128;
                                                                int i4011 = i4010 % 2;
                                                                int iMyUid4 = Process.myUid();
                                                                int i4012 = (~(414862745 | iMyUid4)) | 1715774020;
                                                                int i4013 = ~iMyUid4;
                                                                int i4014 = ((int) (j823 >> 32)) & (185402198 + ((i4012 | (~((-278547610) | i4013))) * 886) + (((~(i4013 | (-414862746))) | 1852089156) * (-1772)) + ((~(i4013 | 1852089156)) * 886));
                                                                int iElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                                                                int i4015 = ((int) j823) & (((((~((-2016316297) | iElapsedRealtime4)) | 1242142021) * 398) - 1721423783) + (((~((~iElapsedRealtime4) | (-2016316297))) | 1242142021) * 398));
                                                                i54 = (i4014 & i4015) | (i4014 ^ i4015);
                                                            }
                                                            if (i54 != 1986687685) {
                                                                i55 = i44;
                                                            } else {
                                                                i55 = i44;
                                                            }
                                                            Object[] objArr810 = new Object[1];
                                                            a(TextUtils.getTrimmedLength(str5) + 1950, 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), (char) (25114 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr810);
                                                            String str310 = (String) objArr810[0];
                                                            int i4016 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1962;
                                                            int iResolveOpacity4 = Drawable.resolveOpacity(0, 0);
                                                            int i4017 = ~iResolveOpacity4;
                                                            int i4018 = ~(((-6) & i40) | ((-6) ^ i40));
                                                            int i4019 = (((iResolveOpacity4 * (-947)) + 4745) - (~(-(-(((i4018 & i4017) | (i4017 ^ i4018)) * (-948)))))) - 1;
                                                            int i4110 = (i4017 & (-6)) | (i4017 ^ (-6));
                                                            int i4111 = (~((i4110 & i15) | (i4110 ^ i15))) * (-948);
                                                            Object[] objArr811 = new Object[1];
                                                            a(i4016, (i4019 & i4111) + (i4019 | i4111) + ((iResolveOpacity4 | (-6)) * 948), (char) TextUtils.getTrimmedLength(str5), objArr811);
                                                            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1968;
                                                            int i4112 = -View.resolveSizeAndState(0, 0, 0);
                                                            int iTuitionPaymentFragmentbindingInflater9 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                            int i4113 = i4112 * (-947);
                                                            int i4114 = ((i4113 | 14235) << 1) - (i4113 ^ 14235);
                                                            int i4115 = ~i4112;
                                                            int i4116 = (i4114 - (~(-(-(((~((-16) | iTuitionPaymentFragmentbindingInflater9)) | i4115) * (-948)))))) - 1;
                                                            int i4117 = (~((~iTuitionPaymentFragmentbindingInflater9) | (i4115 & (-16)) | (i4115 ^ (-16)))) * (-948);
                                                            Object[] objArr812 = new Object[1];
                                                            a(windowTouchSlop3, (((i4116 ^ i4117) + ((i4117 & i4116) << 1)) - (~(((i4112 & (-16)) | (i4112 ^ (-16))) * 948))) - 1, (char) View.combineMeasuredStates(0, 0), objArr812);
                                                            String str311 = (String) objArr812[0];
                                                            int size4 = 1983 - View.MeasureSpec.getSize(0);
                                                            int threadPriority8 = Process.getThreadPriority(0);
                                                            int i4118 = (((threadPriority8 | 20) << 1) - (threadPriority8 ^ 20)) >> 6;
                                                            int i4119 = (i4118 * 714) - 13528;
                                                            int i4210 = ~i4118;
                                                            int i4211 = ~((i4210 & i15) | (i4210 ^ i15));
                                                            int i4212 = ~i4118;
                                                            int i4213 = ~((i4212 & 19) | (i4212 ^ 19));
                                                            int i4214 = (i4211 & i4213) | (i4211 ^ i4213);
                                                            int i4215 = (i4118 & (-20)) | ((-20) ^ i4118);
                                                            int i4216 = (i4215 & i40) | (i4215 ^ i40);
                                                            int i4217 = ~i4216;
                                                            int i4218 = ((i4214 & i4217) | (i4214 ^ i4217)) * (-713);
                                                            int i4219 = ((i4119 | i4218) << 1) - (i4119 ^ i4218);
                                                            int i4310 = -(-((~i4216) * 1426));
                                                            Object[] objArr813 = new Object[1];
                                                            a(size4, (((i4219 ^ i4310) + ((i4310 & i4219) << 1)) - (~((~(((-20) ^ length) | ((-20) & length))) * 713))) - 1, (char) (27852 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr813);
                                                            String str312 = (String) objArr813[0];
                                                            int i4311 = 2001 - (~Color.alpha(0));
                                                            int i4312 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                                                            int i4313 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            Object[] objArr814 = new Object[1];
                                                            a(i4311, i4312, (char) ((i4313 ^ 1) + ((i4313 & 1) << 1)), objArr814);
                                                            int i4314 = 2015 - (~TextUtils.indexOf(str5, str5, 0));
                                                            int i4315 = -(-Process.getGidForName(str5));
                                                            Object[] objArr815 = new Object[1];
                                                            a(i4314, (i4315 & 22) + (i4315 | 22), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr815);
                                                            String str313 = (String) objArr815[0];
                                                            int i4316 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                                                            Object[] objArr816 = new Object[1];
                                                            a((i4316 ^ 2037) + ((i4316 & 2037) << 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr816);
                                                            Object[] objArr817 = new Object[1];
                                                            a(2046 - (~(-(-Color.blue(0)))), ExpandableListView.getPackedPositionGroup(0L) + 11, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr817);
                                                            String str314 = (String) objArr817[0];
                                                            int longPressTimeout4 = 587 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            int i4317 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            int i4318 = -TextUtils.getOffsetBefore(str5, 0);
                                                            Object[] objArr818 = new Object[1];
                                                            a(longPressTimeout4, (i4317 & 6) + (i4317 | 6), (char) (((i4318 | 20075) << 1) - (i4318 ^ 20075)), objArr818);
                                                            int i4319 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                            int i4410 = ((i4319 | 9) << 1) - (i4319 ^ 9);
                                                            TuitionPaymentFragmentbindingInflater1 = i4410 % 128;
                                                            int i4411 = i4410 % 2;
                                                            int i4412 = -Color.alpha(0);
                                                            int i4413 = (i4412 ^ 2058) + ((i4412 & 2058) << 1);
                                                            int i4414 = -TextUtils.getTrimmedLength(str5);
                                                            Object[] objArr819 = new Object[1];
                                                            a(i4413, ((i4414 | 28) << 1) - (i4414 ^ 28), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr819);
                                                            String str315 = (String) objArr819[0];
                                                            int i4415 = -View.resolveSize(0, 0);
                                                            Object[] objArr917 = new Object[1];
                                                            a(((i4415 | 2037) << 1) - (i4415 ^ 2037), 9 - (~(Process.myPid() >> 22)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr917);
                                                            strArr6 = new String[][]{new String[]{str310, (String) objArr811[0]}, new String[]{str311, str312, (String) objArr814[0]}, new String[]{str313, (String) objArr816[0]}, new String[]{str314, (String) objArr818[0]}, new String[]{str315, (String) objArr917[0]}};
                                                            i56 = 0;
                                                            i57 = -1;
                                                            loop7: while (true) {
                                                                if (i56 < 5) {
                                                                    i58 = i40;
                                                                    break;
                                                                }
                                                                int i4416 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                                i71 = (i4416 ^ 115) + ((i4416 & 115) << 1);
                                                                TuitionPaymentFragmentbindingInflater1 = i71 % 128;
                                                                if (i71 % 2 != 0) {
                                                                    strArr7 = strArr6[i56];
                                                                    str8 = strArr7[1];
                                                                } else {
                                                                    strArr7 = strArr6[i56];
                                                                    str8 = strArr7[0];
                                                                }
                                                                strArr8 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                                                                length2 = strArr8.length;
                                                                i72 = 0;
                                                                while (true) {
                                                                    if (i72 < length2) {
                                                                        i57++;
                                                                        bytes2 = strArr8[i72].getBytes();
                                                                        length3 = bytes2.length;
                                                                        if (length3 == 0) {
                                                                            bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str8));
                                                                            i74 = 4096;
                                                                            bArr4 = new byte[4096];
                                                                            strArr9 = strArr6;
                                                                            strArr10 = strArr8;
                                                                            i75 = 0;
                                                                            i76 = 0;
                                                                            while (true) {
                                                                                i77 = bufferedInputStream8.read(bArr4, i75, i74);
                                                                                if (i77 > 0) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i78 = 0;
                                                                                while (i76 < length3) {
                                                                                    int i4417 = i77;
                                                                                    if (bArr4[i78] == bytes2[i76]) {
                                                                                        int i4418 = (i76 & (-84)) + (i76 | (-84));
                                                                                        i76 = (i4418 & 85) + (i4418 | 85);
                                                                                    } else {
                                                                                        if (i76 != 0) {
                                                                                            i79 = i76 - 1;
                                                                                            while (true) {
                                                                                                if (i79 > 0) {
                                                                                                    str9 = str8;
                                                                                                    i73 = length2;
                                                                                                    bArr5 = bArr4;
                                                                                                    i76 = 0;
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i80 = 0;
                                                                                                while (true) {
                                                                                                    str9 = str8;
                                                                                                    if (i80 < i79) {
                                                                                                        i73 = length2;
                                                                                                        bArr5 = bArr4;
                                                                                                        z4 = true;
                                                                                                        z5 = true;
                                                                                                        break;
                                                                                                    }
                                                                                                    int iTuitionPaymentFragmentbindingInflater10 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                                                                    i73 = length2;
                                                                                                    int i4419 = 489030064 + ((68747265 | (~((1617212370 ^ iTuitionPaymentFragmentbindingInflater10) | (1617212370 & iTuitionPaymentFragmentbindingInflater10)))) * 576);
                                                                                                    int i4510 = (~iTuitionPaymentFragmentbindingInflater10) | 1617212370;
                                                                                                    int i4511 = ((~((i4510 ^ 1683587459) | (i4510 & 1683587459))) | 1614840194) * 576;
                                                                                                    int i4512 = (i4419 ^ i4511) + ((i4419 & i4511) << 1);
                                                                                                    i81 = ((i4512 | 943718976) << 1) - (943718976 ^ i4512);
                                                                                                    int i4513 = -(-(((-9217025) | i15) * (-369)));
                                                                                                    i82 = ((-130864018) & i4513) + ((-130864018) | i4513) + ((2121472894 | (~(1854842126 | length))) * (-369));
                                                                                                    i83 = ~(((-1854842127) ^ i40) | ((-1854842127) & i40));
                                                                                                    int i4514 = (1854842126 ^ i15) | (1854842126 & i15);
                                                                                                    i84 = i4514 ^ 2121472894;
                                                                                                    i85 = i4514 & 2121472894;
                                                                                                    bArr5 = bArr4;
                                                                                                    if (i81 > (i82 - (~(-(-((((1845625102 ^ i83) | (1845625102 & i83)) | (~(i84 | i85))) * 369))))) - 1) {
                                                                                                        b = bytes2[i80];
                                                                                                        i86 = i76 % i79;
                                                                                                    } else {
                                                                                                        b = bytes2[i80];
                                                                                                        int i4515 = -i79;
                                                                                                        i86 = ((i76 | i4515) << 1) - (i4515 ^ i76);
                                                                                                    }
                                                                                                    if (b != bytes2[i86 + i80]) {
                                                                                                        z4 = true;
                                                                                                        z5 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    int i4516 = (i80 ^ (-64)) + ((i80 & (-64)) << 1);
                                                                                                    i80 = (i4516 & 65) + (i4516 | 65);
                                                                                                    str8 = str9;
                                                                                                    length2 = i73;
                                                                                                    bArr4 = bArr5;
                                                                                                }
                                                                                                if ((!z5) != z4) {
                                                                                                    i76 = i79;
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i79 = (-2) - (~i79);
                                                                                                str8 = str9;
                                                                                                length2 = i73;
                                                                                                bArr4 = bArr5;
                                                                                            }
                                                                                        }
                                                                                        i77 = i4417;
                                                                                        str8 = str9;
                                                                                        length2 = i73;
                                                                                        bArr4 = bArr5;
                                                                                    }
                                                                                    str9 = str8;
                                                                                    i73 = length2;
                                                                                    bArr5 = bArr4;
                                                                                    i78 = (i78 | 1) + (i78 & 1);
                                                                                    i77 = i4417;
                                                                                    str8 = str9;
                                                                                    length2 = i73;
                                                                                    bArr4 = bArr5;
                                                                                }
                                                                                str8 = str8;
                                                                                length2 = length2;
                                                                                bArr4 = bArr4;
                                                                                i75 = 0;
                                                                                i74 = 4096;
                                                                                if (bufferedInputStream8 != null) {
                                                                                    try {
                                                                                        bufferedInputStream8.close();
                                                                                    } catch (IOException unused26) {
                                                                                    }
                                                                                }
                                                                                i72++;
                                                                                strArr6 = strArr9;
                                                                                strArr8 = strArr10;
                                                                                str8 = str9;
                                                                                length2 = i73;
                                                                            }
                                                                            str9 = str8;
                                                                            i73 = length2;
                                                                            if (i76 == length3) {
                                                                                z3 = true;
                                                                            } else {
                                                                                z3 = false;
                                                                            }
                                                                            bufferedInputStream8.close();
                                                                            if (z3) {
                                                                                i72++;
                                                                                strArr6 = strArr9;
                                                                                strArr8 = strArr10;
                                                                                str8 = str9;
                                                                                length2 = i73;
                                                                            }
                                                                        }
                                                                        int i4517 = (i57 & 170) + (i57 | 170);
                                                                        i58 = (i4517 & length) | ((~i4517) & i40);
                                                                        break loop7;
                                                                    }
                                                                    i56 = (i56 & (-103)) + (i56 | (-103)) + 104;
                                                                    strArr6 = strArr6;
                                                                }
                                                            }
                                                            int i4518 = (~(i40 & i55)) & (i40 | i55);
                                                            int i4519 = -i4518;
                                                            int i4618 = ((i4518 & i4519) | (i4518 ^ i4519)) >> 31;
                                                            int i4619 = (i58 & (~i4618)) | (i55 & i4618);
                                                            i61 = i59 | i60;
                                                            int i471112 = ((~i4619) & i40) | (i4619 & length);
                                                            int i471113 = -i471112;
                                                            int i471114 = ((i471112 & i471113) | (i471112 ^ i471113)) >> 31;
                                                            int i471115 = i61 & (~i471114);
                                                            int i471116 = i4619 & i471114;
                                                            int i471117 = (i471115 & i471116) | (i471115 ^ i471116);
                                                            int i481116 = 2106 - (~(-(-Color.red(0))));
                                                            int i481117 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                            int i481118 = -Color.green(0);
                                                            Object[] objArr918 = new Object[1];
                                                            a(i481116, ((i481117 | 47) << 1) - (i481117 ^ 47), (char) (((i481118 | 30402) << 1) - (i481118 ^ 30402)), objArr918);
                                                            Object[] objArr919 = {(String) objArr918[0]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                char c17 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int iArgb8 = Color.argb(0, 0, 0, 0) + 993;
                                                                int doubleTapTimeout7 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                                                                byte b316 = (byte) (-1);
                                                                Object[] objArr9110 = new Object[1];
                                                                c(b316, (byte) (b316 & 6), (byte) 0, objArr9110);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c17, iArgb8, doubleTapTimeout7, -545305915, false, (String) objArr9110[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr919)).longValue();
                                                            long j8110 = -275856909;
                                                            long j8111 = jLongValue18 ^ j3;
                                                            long j8112 = 933;
                                                            long j8113 = (((long) 934) * j8110) + (((long) (-932)) * jLongValue18) + (((long) (-933)) * ((((j8110 ^ j3) | j50) ^ j3) | j8111)) + ((((j8111 | j8110) ^ j3) | ((j8111 | j50) ^ j3)) * j8112) + (j8112 * ((jLongValue18 | j8110) ^ j3)) + ((long) 896316193);
                                                            int i481119 = ((int) (j8113 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                                                            int i4811110 = ((int) j8113) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                                                            int i4811111 = ((i481119 & i4811110) | (i481119 ^ i4811110)) * 263;
                                                            int i4811112 = i40 ^ i471117;
                                                            int i4811113 = -i4811112;
                                                            int i4811114 = ((i4811112 & i4811113) | (i4811112 ^ i4811113)) >> 31;
                                                            i41 = (i471117 & i4811114) | (((i4811111 & length) | ((~i4811111) & i40)) & (~i4811114));
                                                            strArr3 = strArr5;
                                                        } else {
                                                            i40 = i;
                                                            length = i35;
                                                            i41 = i37;
                                                            strArr3 = null;
                                                        }
                                                        int i722 = ((~i41) & i40) | (i41 & length);
                                                        int i723 = -i722;
                                                        Object[] objArr159 = {new int[]{i ^ (i << 5)}, new int[]{i41}, null, new int[]{i40}, strArr3};
                                                        int i724 = -(-(1086412321 + (((-2689044) | length) * 494) + (((~(1557460356 | length)) | (-1346219156)) * 494) + ((((i722 & i723) | (i722 ^ i723)) >> 31) & 16)));
                                                        int i725 = ((i3 | i724) << 1) - (i3 ^ i724);
                                                        int i726 = i725 << 13;
                                                        int i727 = (i726 | i725) & (~(i725 & i726));
                                                        int i728 = i727 >>> 17;
                                                        int i729 = ((~i727) & i728) | ((~i728) & i727);
                                                        return objArr159;
                                                    }
                                                }
                                                i347 = (i347 ^ (-70)) + ((i347 & (-70)) << 1) + 69;
                                                i342 = i29;
                                                i334 = i25;
                                            }
                                        }
                                        bArr8 = bArr9;
                                        i342 = i27;
                                        i334 = i28;
                                    }
                                    i27 = i342;
                                    i28 = i334;
                                    int i730 = ((i346 | (-57)) << 1) - (i346 ^ (-57));
                                    i346 = ((i730 | 58) << 1) - (i730 ^ 58);
                                    bArr8 = bArr9;
                                    i342 = i27;
                                    i334 = i28;
                                }
                                bArr8 = bArr8;
                                i334 = i334;
                            }
                            i25 = i334;
                            boolean z7 = i341 == length6;
                            try {
                                bufferedInputStream6.close();
                            } catch (IOException unused27) {
                            }
                            if (!z7) {
                                i26 = i170;
                            }
                        } catch (IOException unused28) {
                            i25 = i334;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        bufferedInputStream5 = bufferedInputStream6;
                        if (bufferedInputStream5 != null) {
                            try {
                                bufferedInputStream5.close();
                            } catch (IOException unused29) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused30) {
                    i25 = i334;
                    bufferedInputStream6 = null;
                } catch (Throwable th11) {
                    th = th11;
                    bufferedInputStream5 = null;
                }
                i30 = i25;
            }
            i26 = (~(i170 & 261)) & (i170 | 261);
            i30 = i25;
        }
        int i3510 = ((~i30) & i170) | (i30 & i17);
        int i3511 = -i3510;
        int i3512 = ((i3510 & i3511) | (i3510 ^ i3511)) >> 31;
        int i3513 = i26 & (~i3512);
        int i3514 = i30 & i3512;
        i31 = (i3513 & i3514) | (i3513 ^ i3514);
        if ((i2 & 8) == 0) {
            int i3515 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i3516 = ((i3515 | 615) << 1) - (i3515 ^ 615);
            int i3517 = -(-TextUtils.indexOf((CharSequence) str3, '0', 0, 0));
            Object[] objArr510 = new Object[1];
            a(i3516, ((i3517 | 44) << 1) - (i3517 ^ 44), (char) Color.alpha(0), objArr510);
            String str210 = (String) objArr510[0];
            int i3518 = 657 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int iRgb3 = Color.rgb(0, 0, 0);
            Object[] objArr511 = new Object[1];
            a(i3518, ((iRgb3 | 16777257) << 1) - (iRgb3 ^ 16777257), (char) (28207 - View.resolveSize(0, 0)), objArr511);
            String str211 = (String) objArr511[0];
            int i3610 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
            int i3611 = ((i3610 | 699) << 1) - (i3610 ^ 699);
            int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 38;
            int i3612 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            Object[] objArr610 = new Object[1];
            a(i3611, scrollDefaultDelay3, (char) ((i3612 ^ 11099) + ((i3612 & 11099) << 1)), objArr610);
            strArr11 = new String[]{str210, str211, (String) objArr610[0]};
            i95 = 0;
            while (true) {
                if (i95 < 3) {
                    str3 = str3;
                    i96 = i170;
                    break;
                }
                Object[] objArr611 = {strArr11[i95]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cAlpha3 = (char) Color.alpha(0);
                    int trimmedLength5 = TextUtils.getTrimmedLength(str3) + 993;
                    int i3613 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7;
                    byte b210 = (byte) (-1);
                    byte b211 = (byte) (b210 + 1);
                    Object[] objArr612 = new Object[1];
                    c(b210, b211, b211, objArr612);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cAlpha3, trimmedLength5, i3613, 349342683, false, (String) objArr612[0], new Class[]{String.class});
                }
                long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr611)).longValue();
                long j510 = -200528826;
                long j511 = -575;
                long j512 = (j511 * j510) + (j511 * jLongValue19);
                long j513 = 576;
                long j514 = j510 ^ j25;
                long j515 = jLongValue19 ^ j25;
                long j516 = (j514 | j515) ^ j25;
                j6 = j512 + ((j516 | ((j515 | j49) ^ j25)) * j513) + ((((j514 | jLongValue19) ^ j25) | (((j515 | j50) | j510) ^ j25)) * j513) + (j513 * j516) + ((long) (-646549779));
                i97 = (int) (j6 >> 32);
                startUptimeMillis = (int) Process.getStartUptimeMillis();
                if (((i97 & (2066522594 + ((~(2147397375 | startUptimeMillis)) * 623) + (((~startUptimeMillis) | 135529544) * (-623)) + (((~(startUptimeMillis | 1860076665)) | (~(422850254 | startUptimeMillis)) | (-2147397376)) * 623))) | (((int) j6) & ((-1754753727) + (((~(2111045619 | i17)) | 746695266) * (-828)) + ((2111045619 | i17) * (-828)) + 105916112))) != 0) {
                    int i3614 = (i95 & 280) + (i95 | 280);
                    i96 = (i3614 | i170) & (~(i170 & i3614));
                    break;
                }
                i95 = ((i95 | 1) << 1) - (i95 ^ 1);
                strArr11 = strArr11;
                str3 = str3;
            }
            int i3615 = i170 ^ i31;
            int i3616 = -i3615;
            int i3617 = ((i3615 & i3616) | (i3615 ^ i3616)) >> 31;
            i31 = (i31 & i3617) | (i96 & (~i3617));
        } else {
            str3 = str3;
        }
        int i3618 = 737 - (~MotionEvent.axisFromString(str3));
        str4 = str3;
        int iLastIndexOf6 = 40 - TextUtils.lastIndexOf(str4, '0');
        int i3619 = -TextUtils.lastIndexOf(str4, '0');
        Object[] objArr613 = new Object[1];
        a(i3618, iLastIndexOf6, (char) ((i3619 ^ 53257) + ((i3619 & 53257) << 1)), objArr613);
        int i3710 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
        int i3711 = (i3710 ^ 778) + ((i3710 & 778) << 1);
        int i3712 = 31 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        int scrollBarSize7 = ViewConfiguration.getScrollBarSize() >> 8;
        int i3713 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentbindingInflater1 = i3713 % 128;
        i32 = 2;
        int i3714 = i3713 % 2;
        Object[] objArr614 = new Object[1];
        a(i3711, i3712, (char) scrollBarSize7, objArr614);
        strArr2 = new String[]{(String) objArr613[0], (String) objArr614[0]};
        i33 = 0;
        while (true) {
            if (i33 < i32) {
                j = j49;
                i34 = i170;
                str4 = str4;
                i35 = i17;
                i36 = i34;
                break;
            }
            int i3715 = TuitionPaymentFragmentbindingInflater1;
            int i3716 = (i3715 & 113) + (i3715 | 113);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3716 % 128;
            int i3717 = i3716 % i32;
            Object[] objArr615 = {strArr2[i33]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c18 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 994;
                int maximumFlingVelocity3 = 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b212 = (byte) (-1);
                Object[] objArr616 = new Object[1];
                c(b212, (byte) (b212 & 6), (byte) 0, objArr616);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c18, modifierMetaStateMask4, maximumFlingVelocity3, -545305915, false, (String) objArr616[0], new Class[]{String.class});
            }
            long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr615)).longValue();
            long j610 = -829279064;
            long j611 = -375;
            long j612 = (j611 * j610) + (j611 * jLongValue20);
            long j613 = 376;
            j = j49;
            long jMyPid2 = Process.myPid();
            long j614 = j610 ^ j25;
            long j615 = (j610 | jLongValue20) ^ j25;
            i35 = i17;
            j5 = j612 + ((jMyPid2 | ((j614 | (jLongValue20 ^ j25)) ^ j25) | j615) * j613) + (((long) (-376)) * ((((jMyPid2 ^ j25) | j610) ^ j25) | j615)) + (j613 * (((j614 | jMyPid2) ^ j25) | jLongValue20)) + ((long) 1449738348);
            int iElapsedRealtime5 = (int) SystemClock.elapsedRealtime();
            int i3718 = 1088329766 + (((~(1497456723 | iElapsedRealtime5)) | 1313280 | (~((-1360284162) | iElapsedRealtime5))) * (-754));
            int i3719 = ~((-1313281) | iElapsedRealtime5);
            int i3810 = ~iElapsedRealtime5;
            i92 = ((int) (j5 >> 32)) & (i3718 + ((i3719 | (~((-1358970882) | i3810))) * (-754)) + ((i3810 | 1497456723) * 754));
            iMyUid = Process.myUid();
            i93 = ~(1432767913 | iMyUid);
            i94 = ~iMyUid;
            if (((((int) j5) & ((-2038855459) + ((i93 | (~((-18875809) | i94))) * 920) + (((~(23334304 | i94)) | (-1432767914)) * 920) + (((~(iMyUid | (-18875809))) | (~(1432767913 | i94)) | (~((-1409433610) | iMyUid))) * 920))) | i92) != 0) {
                i34 = i;
                i36 = i34 ^ (i33 + 288);
                break;
            }
            int i3811 = (i33 & (-97)) + (i33 | (-97));
            i33 = ((i3811 | 98) << 1) - (i3811 ^ 98);
            i170 = i;
            i17 = i35;
            strArr2 = strArr2;
            str4 = str4;
            j49 = j;
            i32 = 2;
        }
        int i3812 = ((~i31) & i34) | (i31 & i35);
        int i3813 = -i3812;
        int i3814 = ((i3812 & i3813) | (i3812 ^ i3813)) >> 31;
        int i3815 = i36 & (~i3814);
        int i3816 = i3814 & i31;
        i37 = (i3815 & i3816) | (i3815 ^ i3816);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int mode6 = 3526 - View.MeasureSpec.getMode(0);
            int scrollBarSize8 = (ViewConfiguration.getScrollBarSize() >> 8) + 23;
            byte b213 = (byte) (-1);
            byte b214 = (byte) (-b213);
            Object[] objArr617 = new Object[1];
            c(b213, b214, (byte) (b214 - 1), objArr617);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration2, mode6, scrollBarSize8, 980946500, false, (String) objArr617[0], new Class[0]);
        }
        long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
        long j616 = 532495721;
        long j617 = 130;
        long j618 = jLongValue21 ^ j25;
        long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        long j619 = (((long) (-129)) * j616) + (((long) 131) * jLongValue21) + ((((j618 | (jFreeMemory2 ^ j25)) | j616) ^ j25) * j617);
        long j711 = j618 | j616;
        long j712 = j619 + (((long) (-260)) * (j711 ^ j25)) + (j617 * (((jFreeMemory2 | j711) ^ j25) | ((jLongValue21 | (j616 ^ j25)) ^ j25))) + ((long) (-712818359));
        i38 = ((int) (j712 >> 32)) & ((-45731278) + (((-1491033412) | i) * 140) + (((~((-1491033412) | i35)) | 143200322) * (-280)) + (((~((-1366707474) | i35)) | 18874384 | (~((-143200323) | i))) * 140));
        int i3817 = ~((-1581167278) | i35);
        i39 = ((int) j712) & (((((i3817 | 17664) | (~(1581167277 | i))) * (-338)) - 1431255979) + ((i3817 | (~(1581184941 | i))) * 338));
        if (((i38 & i39) | (i38 ^ i39)) != 1) {
            Object[] objArr618 = {1};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c19 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int keyRepeatTimeout5 = 2673 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int longPressTimeout5 = (ViewConfiguration.getLongPressTimeout() >> 16) + 16;
                byte b215 = (byte) (-1);
                byte b216 = (byte) (-b215);
                Object[] objArr619 = new Object[1];
                c(b215, b216, (byte) (b216 - 1), objArr619);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c19, keyRepeatTimeout5, longPressTimeout5, -1409439630, false, (String) objArr619[0], new Class[]{Integer.TYPE});
            }
            long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr618)).longValue();
            long j713 = -9017826;
            long j714 = 69;
            long j715 = j713 ^ j25;
            long j716 = jLongValue110 ^ j25;
            j2 = (((long) 70) * j713) + (((long) (-68)) * jLongValue110) + (((((j715 | j716) | j) ^ j25) | (((j713 | jLongValue110) | j) ^ j25)) * j714) + (((long) (-69)) * (((jLongValue110 | j) ^ j25) | ((j715 | jLongValue110) ^ j25) | ((j715 | j) ^ j25))) + (j714 * ((j716 | j713) ^ j25)) + ((long) 1876716506);
            i40 = i;
            if (((((int) (j2 >> 32)) & ((-848177884) + ((~((-151000329) | i35)) * 433) + (((~(161865565 | i40)) | (-1599091977)) * (-433)) + (((~((-1599091977) | i40)) | 10865237) * 433))) | (((int) j2) & ((-1990993339) + (((~((-713077795) | i35)) | (~(2144663091 | i40))) * (-272)) + (((~((-780449331) | i40)) | 67371536) * (-272)) + (((~(780449330 | i40)) | 2077291555) * 272)))) != 0) {
                int i3818 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i91 = ((i3818 | 19) << 1) - (i3818 ^ 19);
                TuitionPaymentFragmentbindingInflater1 = i91 % 128;
                if (i91 % 2 != 0) {
                    i43 = i40 ^ 31631;
                    i42 = i35;
                } else {
                    i42 = i35;
                    i43 = (i40 & (-221)) | (i42 & 220);
                }
            } else {
                i42 = i35;
                i43 = i40;
            }
            int i3819 = ((~r66) & i40) | (r66 & i42);
            int i3913 = -i3819;
            int i3914 = ((i3819 & i3913) | (i3819 ^ i3913)) >> 31;
            i44 = (i43 & (~i3914)) | (i37 & i3914);
            int i3915 = -(Process.myTid() >> 22);
            int i3916 = (i3915 ^ 370) + ((i3915 & 370) << 1);
            int i3917 = -AndroidCharacter.getMirror('0');
            Object[] objArr715 = new Object[1];
            a(i3916, (i3917 & 71) + (i3917 | 71), (char) (63256 - (~KeyEvent.keyCodeFromString(str4))), objArr715);
            Object[] objArr716 = {(String) objArr715[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop4 = (char) (33602 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int i3918 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                byte b317 = (byte) (-1);
                byte b318 = (byte) (-b317);
                Object[] objArr717 = new Object[1];
                c(b317, b318, (byte) (b318 - 1), objArr717);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop4, i3918, maximumDrawingCacheSize2, 1411172903, false, (String) objArr717[0], new Class[]{String.class});
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr716);
            if (objInvoke != null) {
                Object[] objArr718 = {objInvoke, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char deadChar4 = (char) KeyEvent.getDeadChar(0, 0);
                    int i3919 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3393;
                    str5 = str4;
                    int offsetBefore2 = 9 - TextUtils.getOffsetBefore(str5, 0);
                    byte b319 = (byte) (-1);
                    byte b320 = (byte) (-b319);
                    Object[] objArr719 = new Object[1];
                    c(b319, b320, (byte) (b320 - 1), objArr719);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(deadChar4, i3919, offsetBefore2, 1203525406, false, (String) objArr719[0], new Class[]{String.class, Integer.TYPE});
                } else {
                    str5 = str4;
                }
                long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr718)).longValue();
                long j717 = 1238256276;
                long j718 = j717 ^ j25;
                long j719 = 191;
                j4 = (((long) (-381)) * j717) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue111) + (((long) (-191)) * j718) + ((j717 | ((jLongValue111 | j) ^ j25)) * j719) + (j719 * (((j50 | jLongValue111) ^ j25) | ((j718 | jLongValue111) ^ j25))) + ((long) (-1240326153));
                i89 = ((int) (j4 >> 32)) & (((~(2103811232 | i40)) * TypedValues.CycleType.TYPE_EASING) + 1070984654 + (((~(2103811232 | i42)) | 1480890368) * TypedValues.CycleType.TYPE_EASING));
                i90 = ~((~Process.myPid()) | 419958830);
                if ((i89 | (((int) j4) & (((134217736 | i90) * (-374)) + 2022579841 + ((i90 | 285741094) * 374)))) == 1986687685) {
                    length = i42;
                    strArr5 = null;
                    j3 = j25;
                }
                int i39110 = 888 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                int i39111 = -View.getDefaultSize(0, 0);
                Object[] objArr7110 = new Object[1];
                a(i39110, ((i39111 | 16) << 1) - (i39111 ^ 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr7110);
                Object[] objArr7111 = {(String) objArr7110[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char edgeSlop5 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33602);
                    int modifierMetaStateMask5 = 3084 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iLastIndexOf7 = 25 - TextUtils.lastIndexOf(str5, '0', 0, 0);
                    byte b3110 = (byte) (-1);
                    byte b3111 = (byte) (-b3110);
                    Object[] objArr7112 = new Object[1];
                    c(b3110, b3111, (byte) (b3111 - 1), objArr7112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop5, modifierMetaStateMask5, iLastIndexOf7, 1411172903, false, (String) objArr7112[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7111);
                if (objInvoke2 == null) {
                    i54 = 0;
                } else {
                    Object[] objArr7113 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                        int iArgb9 = 3393 - Color.argb(0, 0, 0, 0);
                        int mode7 = 9 - View.MeasureSpec.getMode(0);
                        byte b3112 = (byte) (-1);
                        byte b3113 = (byte) (-b3112);
                        Object[] objArr7114 = new Object[1];
                        c(b3112, b3113, (byte) (b3113 - 1), objArr7114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity3, iArgb9, mode7, 1203525406, false, (String) objArr7114[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7113)).longValue();
                    long j7110 = 1417205932;
                    long j824 = 988;
                    long j825 = jLongValue112 ^ j3;
                    long jUptimeMillis3 = (int) SystemClock.uptimeMillis();
                    long j826 = jUptimeMillis3 ^ j3;
                    long j827 = (((long) 989) * j7110) + (((long) (-987)) * jLongValue112) + (((((j825 | j826) | j7110) ^ j3) | (((j7110 | jLongValue112) | jUptimeMillis3) ^ j3)) * j824) + (((long) (-988)) * (j7110 | j825)) + (j824 * (((jLongValue112 | (j826 | j7110)) ^ j3) | (((j7110 ^ j3) | j825) ^ j3) | ((jUptimeMillis3 | j825) ^ j3))) + ((long) (-1419275809));
                    int i39112 = TuitionPaymentFragmentbindingInflater1;
                    int i40110 = (i39112 ^ 13) + ((i39112 & 13) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i40110 % 128;
                    int i40111 = i40110 % 2;
                    int iMyUid5 = Process.myUid();
                    int i40112 = (~(414862745 | iMyUid5)) | 1715774020;
                    int i40113 = ~iMyUid5;
                    int i40114 = ((int) (j827 >> 32)) & (185402198 + ((i40112 | (~((-278547610) | i40113))) * 886) + (((~(i40113 | (-414862746))) | 1852089156) * (-1772)) + ((~(i40113 | 1852089156)) * 886));
                    int iElapsedRealtime6 = (int) SystemClock.elapsedRealtime();
                    int i40115 = ((int) j827) & (((((~((-2016316297) | iElapsedRealtime6)) | 1242142021) * 398) - 1721423783) + (((~((~iElapsedRealtime6) | (-2016316297))) | 1242142021) * 398));
                    i54 = (i40114 & i40115) | (i40114 ^ i40115);
                }
                if (i54 != 1986687685 || i54 == -1514516938) {
                    i55 = i44;
                } else {
                    int i731 = 1607 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))));
                    int i732 = -(Process.myPid() >> 22);
                    Object[] objArr160 = new Object[1];
                    a(i731, (i732 & 14) + (i732 | 14), (char) (0 - (~MotionEvent.axisFromString(str5))), objArr160);
                    String str68 = (String) objArr160[0];
                    int i733 = -TextUtils.getOffsetAfter(str5, 0);
                    int i734 = (i733 ^ 1622) + ((i733 & 1622) << 1);
                    int i735 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i736 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr161 = new Object[1];
                    a(i734, i735, (char) ((i736 & 1) + (i736 | 1)), objArr161);
                    String str69 = (String) objArr161[0];
                    int i737 = -View.getDefaultSize(0, 0);
                    int i738 = ((i737 | 1648) << 1) - (i737 ^ 1648);
                    int i739 = -ExpandableListView.getPackedPositionChild(0L);
                    Object[] objArr162 = new Object[1];
                    a(i738, ((i739 | 16) << 1) - (i739 ^ 16), (char) Gravity.getAbsoluteGravity(0, 0), objArr162);
                    String str70 = (String) objArr162[0];
                    Object[] objArr163 = new Object[1];
                    a(1664 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, (char) (23838 - (~(-Color.alpha(0)))), objArr163);
                    String str71 = (String) objArr163[0];
                    int i740 = 1681 - (~(-ExpandableListView.getPackedPositionType(0L)));
                    int iRgb4 = Color.rgb(0, 0, 0) + 16777231;
                    int i741 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr164 = new Object[1];
                    a(i740, iRgb4, (char) ((i741 ^ 1) + ((i741 & 1) << 1)), objArr164);
                    String str72 = (String) objArr164[0];
                    int i742 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iTuitionPaymentFragmentbindingInflater11 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                    int i743 = i742 * (-391);
                    int i744 = ~((-1698) | i742);
                    int i745 = ~(iTuitionPaymentFragmentbindingInflater11 | 1697);
                    int i746 = (i743 ^ (-330915)) + ((i743 & (-330915)) << 1) + (((i744 & i745) | (i744 ^ i745)) * (-196));
                    int i747 = -(-(((i742 ^ 1697) | (i742 & 1697)) * 392));
                    int i748 = (i746 ^ i747) + ((i747 & i746) << 1);
                    int i749 = ~i742;
                    int i750 = ~((i749 & (-1698)) | (i749 ^ (-1698)));
                    int i751 = ~((iTuitionPaymentFragmentbindingInflater11 & 1697) | (iTuitionPaymentFragmentbindingInflater11 ^ 1697));
                    int i752 = ((i750 & i751) | (i750 ^ i751)) * 196;
                    int i753 = (i748 ^ i752) + ((i752 & i748) << 1);
                    int i754 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                    Object[] objArr165 = new Object[1];
                    a(i753, ((i754 | 37) << 1) - (i754 ^ 37), (char) (49933 - TextUtils.getOffsetBefore(str5, 0)), objArr165);
                    String str73 = (String) objArr165[0];
                    int offsetAfter4 = TextUtils.getOffsetAfter(str5, 0) + 1734;
                    int i755 = -Process.getGidForName(str5);
                    Object[] objArr166 = new Object[1];
                    a(offsetAfter4, ((i755 | 11) << 1) - (i755 ^ 11), (char) (4705 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr166);
                    String str74 = (String) objArr166[0];
                    int iBlue3 = Color.blue(0);
                    int i756 = (iBlue3 & 1746) + (iBlue3 | 1746);
                    int i757 = -(-KeyEvent.normalizeMetaState(0));
                    Object[] objArr167 = new Object[1];
                    a(i756, ((i757 | 13) << 1) - (i757 ^ 13), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr167);
                    String str75 = (String) objArr167[0];
                    int i758 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    Object[] objArr168 = new Object[1];
                    a((i758 & 1760) + (i758 | 1760), (ViewConfiguration.getScrollBarSize() >> 8) + 22, (char) (TextUtils.getOffsetAfter(str5, 0) + 56756), objArr168);
                    String str76 = (String) objArr168[0];
                    int i759 = 1779 - (~(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int iArgb10 = 31 - Color.argb(0, 0, 0, 0);
                    int i760 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    Object[] objArr169 = new Object[1];
                    a(i759, iArgb10, (char) ((i760 ^ 31050) + ((i760 & 31050) << 1)), objArr169);
                    String str77 = (String) objArr169[0];
                    Object[] objArr170 = new Object[1];
                    a(TextUtils.getOffsetAfter(str5, 0) + 1812, TextUtils.indexOf(str5, str5, 0) + 12, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr170);
                    String str78 = (String) objArr170[0];
                    int scrollBarSize9 = 1824 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i761 = -(-ExpandableListView.getPackedPositionChild(0L));
                    Object[] objArr171 = new Object[1];
                    a(scrollBarSize9, (i761 ^ 13) + ((i761 & 13) << 1), (char) (Process.myTid() >> 22), objArr171);
                    String str79 = (String) objArr171[0];
                    int iRgb5 = Color.rgb(0, 0, 0);
                    int i762 = -Process.getGidForName(str5);
                    Object[] objArr172 = new Object[1];
                    a(((iRgb5 | 16779052) << 1) - (16779052 ^ iRgb5), (i762 ^ 11) + ((i762 & 11) << 1), (char) Color.red(0), objArr172);
                    String str80 = (String) objArr172[0];
                    int scrollBarSize10 = ViewConfiguration.getScrollBarSize() >> 8;
                    int i763 = (scrollBarSize10 ^ 1848) + ((scrollBarSize10 & 1848) << 1);
                    int i764 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    Object[] objArr173 = new Object[1];
                    a(i763, (i764 & 11) + (i764 | 11), (char) (8507 - TextUtils.getOffsetBefore(str5, 0)), objArr173);
                    String str81 = (String) objArr173[0];
                    int i765 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i766 = ((i765 | 1861) << 1) - (i765 ^ 1861);
                    int i767 = -(-Color.rgb(0, 0, 0));
                    int i768 = (i767 & 16777228) + (i767 | 16777228);
                    int i769 = -(-ExpandableListView.getPackedPositionType(0L));
                    Object[] objArr174 = new Object[1];
                    a(i766, i768, (char) ((i769 & 49195) + (i769 | 49195)), objArr174);
                    String str82 = (String) objArr174[0];
                    int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0);
                    Object[] objArr175 = new Object[1];
                    a((bitsPerPixel3 ^ 1873) + ((bitsPerPixel3 & 1873) << 1), TextUtils.lastIndexOf(str5, '0') + 15, (char) (50038 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr175);
                    String str83 = (String) objArr175[0];
                    int i770 = 1885 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    int windowTouchSlop5 = ViewConfiguration.getWindowTouchSlop() >> 8;
                    Object[] objArr176 = new Object[1];
                    a(i770, (windowTouchSlop5 ^ 12) + ((windowTouchSlop5 & 12) << 1), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr176);
                    String str84 = (String) objArr176[0];
                    int i771 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1898;
                    int i772 = -Process.getGidForName(str5);
                    Object[] objArr177 = new Object[1];
                    a(i771, (i772 & 23) + (i772 | 23), (char) (43677 - TextUtils.getCapsMode(str5, 0, 0)), objArr177);
                    String str85 = (String) objArr177[0];
                    int iIndexOf11 = TextUtils.indexOf(str5, str5, 0, 0);
                    int i773 = (iIndexOf11 & 1922) + (iIndexOf11 | 1922);
                    int capsMode3 = TextUtils.getCapsMode(str5, 0, 0);
                    Object[] objArr178 = new Object[1];
                    a(i773, ((capsMode3 | 28) << 1) - (capsMode3 ^ 28), (char) ((-2) - (~(-ImageFormat.getBitsPerPixel(0)))), objArr178);
                    String[] strArr44 = {str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, (String) objArr178[0]};
                    int i774 = 0;
                    while (true) {
                        if (i774 >= 19) {
                            i87 = i44;
                            i88 = -1;
                            break;
                        }
                        String str86 = strArr44[i774];
                        Object[] objArr179 = {str86};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iResolveOpacity5 = 993 - Drawable.resolveOpacity(0, 0);
                            int i775 = 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b42 = (byte) (-1);
                            byte b43 = (byte) (b42 + 1);
                            Object[] objArr180 = new Object[1];
                            c(b42, b43, b43, objArr180);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(scrollDefaultDelay4, iResolveOpacity5, i775, 349342683, false, (String) objArr180[0], new Class[]{String.class});
                        }
                        long jLongValue22 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr179)).longValue();
                        long j90 = -383359115;
                        long j91 = (((long) 465) * j90) + (((long) (-463)) * jLongValue22);
                        long j92 = 464;
                        long j93 = jLongValue22 ^ j3;
                        int i776 = i44;
                        String[] strArr45 = strArr44;
                        long jNextInt = new Random().nextInt();
                        long j94 = jNextInt ^ j3;
                        long j95 = (j93 | j90) ^ j3;
                        long j96 = j91 + ((((j93 | j94) ^ j3) | j95 | ((j94 | j90) ^ j3)) * j92);
                        int i777 = i774;
                        i87 = i776;
                        long j97 = j96 + (((long) (-464)) * (jNextInt | (j90 ^ j3) | j93)) + (j92 * (j95 | ((jNextInt | j90) ^ j3))) + ((long) (-463719490));
                        int i778 = ~((int) Process.getStartElapsedRealtime());
                        int i779 = ((int) (j97 >> 32)) & (1754752898 + (((~((-308300890) | i778)) | 1745527300) * (-828)) + ((i778 | (-308300890)) * (-828)) + 1870065628);
                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                        int i780 = ~((-356209676) | iUptimeMillis);
                        int i781 = ~iUptimeMillis;
                        int i782 = ((int) j97) & (517323741 + ((i780 | (~((-1793436086) | i781))) * (-1808)) + (((~((-354046987) | iUptimeMillis)) | (~(i781 | (-1791273397)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iUptimeMillis | 1793436085)) | 2162689 | (~(356209675 | i781))) * TypedValues.Custom.TYPE_BOOLEAN));
                        if (((i779 & i782) | (i779 ^ i782)) == 0) {
                            int iResolveOpacity6 = Drawable.resolveOpacity(0, 0);
                            int iTuitionPaymentFragmentbindingInflater12 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i783 = iResolveOpacity6 * (-183);
                            int i784 = ((i783 | (-342576)) << 1) - (i783 ^ (-342576));
                            int i785 = TuitionPaymentFragmentbindingInflater1;
                            int i786 = ((i785 | 103) << 1) - (i785 ^ 103);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i786 % 128;
                            int i787 = i786 % 2;
                            int i788 = ~iResolveOpacity6;
                            int i789 = ~iTuitionPaymentFragmentbindingInflater12;
                            int i790 = (i788 ^ i789) | (i788 & i789);
                            int i791 = ~((i790 & 1872) | (i790 ^ 1872));
                            int i792 = (i789 & (-1873)) | ((-1873) ^ i789);
                            int i793 = ~((i792 & iResolveOpacity6) | (i792 ^ iResolveOpacity6));
                            int i794 = (i784 - (~(((i793 & i791) | (i791 ^ i793)) * (-184)))) - 1;
                            int i795 = ~iResolveOpacity6;
                            int i796 = ~((i795 & (-1873)) | (i795 ^ (-1873)));
                            int i797 = ~iTuitionPaymentFragmentbindingInflater12;
                            int i798 = ~((i788 & i797) | (i788 ^ i797));
                            int i799 = (i798 & i796) | (i796 ^ i798);
                            int i800 = ~(i797 | (-1873));
                            int i801 = -(-(((i800 & i799) | (i799 ^ i800)) * 184));
                            int i802 = (i794 ^ i801) + ((i801 & i794) << 1);
                            int i803 = -(-(((iResolveOpacity6 & 1872) | (iResolveOpacity6 ^ 1872)) * 184));
                            int i804 = (i802 ^ i803) + ((i803 & i802) << 1);
                            int i805 = -(ViewConfiguration.getTapTimeout() >> 16);
                            int iTuitionPaymentFragmentbindingInflater13 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                            int i806 = i805 * (-515);
                            int i807 = ((i806 | 7238) << 1) - (i806 ^ 7238);
                            int i808 = ~((-15) | iTuitionPaymentFragmentbindingInflater13);
                            int i809 = ~iTuitionPaymentFragmentbindingInflater13;
                            int i810 = ~(i809 | i805);
                            int i811 = (i807 - (~(-(-((((i808 & i810) | (i808 ^ i810)) | (~((i809 ^ 14) | (i809 & 14)))) * (-516)))))) - 1;
                            int i812 = ~i805;
                            int i813 = ~(((-15) & i812) | (i812 ^ (-15)) | iTuitionPaymentFragmentbindingInflater13);
                            int i814 = ~i805;
                            int i815 = (i814 ^ i809) | (i809 & i814);
                            int i816 = ~((i815 & 14) | (i815 ^ 14));
                            int i817 = (i811 - (~(-(-(((i813 & i816) | (i813 ^ i816)) * 516))))) - 1;
                            int i818 = ~(i814 | 14);
                            int i819 = ~iTuitionPaymentFragmentbindingInflater13;
                            int i820 = ~((i819 & 14) | (i819 ^ 14));
                            int i821 = ((i818 & i820) | (i818 ^ i820)) * 516;
                            Object[] objArr181 = new Object[1];
                            a(i804, ((i817 | i821) << 1) - (i821 ^ i817), (char) (50037 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr181);
                            if (str86.equals((String) objArr181[0])) {
                                Object[] objArr182 = {str86};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                                    char cGreen2 = (char) Color.green(0);
                                    int iKeyCodeFromString = 993 - KeyEvent.keyCodeFromString(str5);
                                    int i822 = 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    byte b44 = (byte) (-1);
                                    byte b45 = (byte) (b44 + 1);
                                    Object[] objArr183 = new Object[1];
                                    c(b44, b45, b45, objArr183);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cGreen2, iKeyCodeFromString, i822, 349342683, false, (String) objArr183[0], new Class[]{String.class});
                                }
                                long jLongValue23 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr182)).longValue();
                                long j98 = 997791263;
                                long j99 = -496;
                                long j100 = (j99 * j98) + (j99 * jLongValue23);
                                long j101 = 497;
                                long j102 = j98 ^ j3;
                                long j103 = jLongValue23 ^ j3;
                                long j104 = j102 | j103;
                                long j105 = j100 + ((j104 ^ j3) * j101) + ((((j104 | j) ^ j3) | (((j103 | j50) | j98) ^ j3)) * j101) + (j101 * (((j102 | j50) ^ j3) | ((jLongValue23 | j102) ^ j3) | (((j98 | j103) | j) ^ j3))) + ((long) (-1844869868));
                                int iMyTid3 = Process.myTid();
                                int i823 = ((int) (j105 >> 32)) & ((-2005432166) + (((~((-1772307911) | iMyTid3)) | 1745028548) * 104) + ((~((~iMyTid3) | (-307802138))) * (-104)) + ((iMyTid3 | (-335081500)) * 104));
                                int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                int i824 = ((int) j105) & (((1153123995 + (((~startElapsedRealtime3) | (-1235223974)) * 1444)) + (((~(startElapsedRealtime3 | 836424537)) | ((~(2021316348 | startElapsedRealtime3)) | (-2046482430))) * (-1444))) - 1521489062);
                                if (((i823 & i824) | (i823 ^ i824)) != 0) {
                                }
                            }
                            i774 = (i777 & 1) + (i777 | 1);
                            strArr44 = strArr45;
                            i44 = i87;
                        }
                        i88 = i777;
                        break;
                    }
                    int i825 = ((i88 | 130) << 1) - (i88 ^ 130);
                    int i826 = (i825 & length) | ((~i825) & i40);
                    int i827 = ~i88;
                    int i828 = -i827;
                    int i829 = ((i827 & i828) | (i827 ^ i828)) >> 31;
                    int i830 = (~i829) & i40;
                    int i831 = i826 & i829;
                    int i832 = (i831 & i830) | (i830 ^ i831);
                    int i833 = i87;
                    int i834 = ((~i833) & i40) | (i833 & length);
                    int i835 = -i834;
                    int i836 = ((i834 & i835) | (i834 ^ i835)) >> 31;
                    int i837 = i832 & (~i836);
                    int i838 = i833 & i836;
                    i55 = (i837 & i838) | (i837 ^ i838);
                }
                Object[] objArr8110 = new Object[1];
                a(TextUtils.getTrimmedLength(str5) + 1950, 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), (char) (25114 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr8110);
                String str316 = (String) objArr8110[0];
                int i40116 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1962;
                int iResolveOpacity7 = Drawable.resolveOpacity(0, 0);
                int i40117 = ~iResolveOpacity7;
                int i40118 = ~(((-6) & i40) | ((-6) ^ i40));
                int i40119 = (((iResolveOpacity7 * (-947)) + 4745) - (~(-(-(((i40118 & i40117) | (i40117 ^ i40118)) * (-948)))))) - 1;
                int i41110 = (i40117 & (-6)) | (i40117 ^ (-6));
                int i41111 = (~((i41110 & i15) | (i41110 ^ i15))) * (-948);
                Object[] objArr8111 = new Object[1];
                a(i40116, (i40119 & i41111) + (i40119 | i41111) + ((iResolveOpacity7 | (-6)) * 948), (char) TextUtils.getTrimmedLength(str5), objArr8111);
                int windowTouchSlop6 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1968;
                int i41112 = -View.resolveSizeAndState(0, 0, 0);
                int iTuitionPaymentFragmentbindingInflater14 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                int i41113 = i41112 * (-947);
                int i41114 = ((i41113 | 14235) << 1) - (i41113 ^ 14235);
                int i41115 = ~i41112;
                int i41116 = (i41114 - (~(-(-(((~((-16) | iTuitionPaymentFragmentbindingInflater14)) | i41115) * (-948)))))) - 1;
                int i41117 = (~((~iTuitionPaymentFragmentbindingInflater14) | (i41115 & (-16)) | (i41115 ^ (-16)))) * (-948);
                Object[] objArr8112 = new Object[1];
                a(windowTouchSlop6, (((i41116 ^ i41117) + ((i41117 & i41116) << 1)) - (~(((i41112 & (-16)) | (i41112 ^ (-16))) * 948))) - 1, (char) View.combineMeasuredStates(0, 0), objArr8112);
                String str317 = (String) objArr8112[0];
                int size5 = 1983 - View.MeasureSpec.getSize(0);
                int threadPriority9 = Process.getThreadPriority(0);
                int i41118 = (((threadPriority9 | 20) << 1) - (threadPriority9 ^ 20)) >> 6;
                int i41119 = (i41118 * 714) - 13528;
                int i42110 = ~i41118;
                int i42111 = ~((i42110 & i15) | (i42110 ^ i15));
                int i42112 = ~i41118;
                int i42113 = ~((i42112 & 19) | (i42112 ^ 19));
                int i42114 = (i42111 & i42113) | (i42111 ^ i42113);
                int i42115 = (i41118 & (-20)) | ((-20) ^ i41118);
                int i42116 = (i42115 & i40) | (i42115 ^ i40);
                int i42117 = ~i42116;
                int i42118 = ((i42114 & i42117) | (i42114 ^ i42117)) * (-713);
                int i42119 = ((i41119 | i42118) << 1) - (i41119 ^ i42118);
                int i43110 = -(-((~i42116) * 1426));
                Object[] objArr8113 = new Object[1];
                a(size5, (((i42119 ^ i43110) + ((i43110 & i42119) << 1)) - (~((~(((-20) ^ length) | ((-20) & length))) * 713))) - 1, (char) (27852 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr8113);
                String str318 = (String) objArr8113[0];
                int i43111 = 2001 - (~Color.alpha(0));
                int i43112 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                int i43113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr8114 = new Object[1];
                a(i43111, i43112, (char) ((i43113 ^ 1) + ((i43113 & 1) << 1)), objArr8114);
                int i43114 = 2015 - (~TextUtils.indexOf(str5, str5, 0));
                int i43115 = -(-Process.getGidForName(str5));
                Object[] objArr8115 = new Object[1];
                a(i43114, (i43115 & 22) + (i43115 | 22), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr8115);
                String str319 = (String) objArr8115[0];
                int i43116 = -(-(ViewConfiguration.getTapTimeout() >> 16));
                Object[] objArr8116 = new Object[1];
                a((i43116 ^ 2037) + ((i43116 & 2037) << 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr8116);
                Object[] objArr8117 = new Object[1];
                a(2046 - (~(-(-Color.blue(0)))), ExpandableListView.getPackedPositionGroup(0L) + 11, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr8117);
                String str3110 = (String) objArr8117[0];
                int longPressTimeout6 = 587 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int i43117 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i43118 = -TextUtils.getOffsetBefore(str5, 0);
                Object[] objArr8118 = new Object[1];
                a(longPressTimeout6, (i43117 & 6) + (i43117 | 6), (char) (((i43118 | 20075) << 1) - (i43118 ^ 20075)), objArr8118);
                int i43119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i44110 = ((i43119 | 9) << 1) - (i43119 ^ 9);
                TuitionPaymentFragmentbindingInflater1 = i44110 % 128;
                int i44111 = i44110 % 2;
                int i44112 = -Color.alpha(0);
                int i44113 = (i44112 ^ 2058) + ((i44112 & 2058) << 1);
                int i44114 = -TextUtils.getTrimmedLength(str5);
                Object[] objArr8119 = new Object[1];
                a(i44113, ((i44114 | 28) << 1) - (i44114 ^ 28), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8119);
                String str3111 = (String) objArr8119[0];
                int i44115 = -View.resolveSize(0, 0);
                Object[] objArr9111 = new Object[1];
                a(((i44115 | 2037) << 1) - (i44115 ^ 2037), 9 - (~(Process.myPid() >> 22)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr9111);
                strArr6 = new String[][]{new String[]{str316, (String) objArr8111[0]}, new String[]{str317, str318, (String) objArr8114[0]}, new String[]{str319, (String) objArr8116[0]}, new String[]{str3110, (String) objArr8118[0]}, new String[]{str3111, (String) objArr9111[0]}};
                i56 = 0;
                i57 = -1;
                loop7: while (true) {
                    if (i56 < 5) {
                        i58 = i40;
                        break;
                    }
                    int i44116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i71 = (i44116 ^ 115) + ((i44116 & 115) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i71 % 128;
                    if (i71 % 2 != 0) {
                        strArr7 = strArr6[i56];
                        str8 = strArr7[1];
                    } else {
                        strArr7 = strArr6[i56];
                        str8 = strArr7[0];
                    }
                    strArr8 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                    length2 = strArr8.length;
                    i72 = 0;
                    while (true) {
                        if (i72 < length2) {
                            i57++;
                            bytes2 = strArr8[i72].getBytes();
                            length3 = bytes2.length;
                            if (length3 == 0) {
                                bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str8));
                                i74 = 4096;
                                bArr4 = new byte[4096];
                                strArr9 = strArr6;
                                strArr10 = strArr8;
                                i75 = 0;
                                i76 = 0;
                                while (true) {
                                    i77 = bufferedInputStream8.read(bArr4, i75, i74);
                                    if (i77 > 0) {
                                        break;
                                        break;
                                    }
                                    i78 = 0;
                                    while (i76 < length3 && i78 < i77) {
                                        int i44117 = i77;
                                        if (bArr4[i78] == bytes2[i76]) {
                                            int i44118 = (i76 & (-84)) + (i76 | (-84));
                                            i76 = (i44118 & 85) + (i44118 | 85);
                                        } else {
                                            if (i76 != 0) {
                                                i79 = i76 - 1;
                                                while (true) {
                                                    if (i79 > 0) {
                                                        str9 = str8;
                                                        i73 = length2;
                                                        bArr5 = bArr4;
                                                        i76 = 0;
                                                        break;
                                                        break;
                                                    }
                                                    i80 = 0;
                                                    while (true) {
                                                        str9 = str8;
                                                        if (i80 < i79) {
                                                            i73 = length2;
                                                            bArr5 = bArr4;
                                                            z4 = true;
                                                            z5 = true;
                                                            break;
                                                        }
                                                        int iTuitionPaymentFragmentbindingInflater15 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                        i73 = length2;
                                                        int i44119 = 489030064 + ((68747265 | (~((1617212370 ^ iTuitionPaymentFragmentbindingInflater15) | (1617212370 & iTuitionPaymentFragmentbindingInflater15)))) * 576);
                                                        int i45110 = (~iTuitionPaymentFragmentbindingInflater15) | 1617212370;
                                                        int i45111 = ((~((i45110 ^ 1683587459) | (i45110 & 1683587459))) | 1614840194) * 576;
                                                        int i45112 = (i44119 ^ i45111) + ((i44119 & i45111) << 1);
                                                        i81 = ((i45112 | 943718976) << 1) - (943718976 ^ i45112);
                                                        int i45113 = -(-(((-9217025) | i15) * (-369)));
                                                        i82 = ((-130864018) & i45113) + ((-130864018) | i45113) + ((2121472894 | (~(1854842126 | length))) * (-369));
                                                        i83 = ~(((-1854842127) ^ i40) | ((-1854842127) & i40));
                                                        int i45114 = (1854842126 ^ i15) | (1854842126 & i15);
                                                        i84 = i45114 ^ 2121472894;
                                                        i85 = i45114 & 2121472894;
                                                        bArr5 = bArr4;
                                                        if (i81 > (i82 - (~(-(-((((1845625102 ^ i83) | (1845625102 & i83)) | (~(i84 | i85))) * 369))))) - 1) {
                                                            b = bytes2[i80];
                                                            i86 = i76 % i79;
                                                        } else {
                                                            b = bytes2[i80];
                                                            int i45115 = -i79;
                                                            i86 = ((i76 | i45115) << 1) - (i45115 ^ i76);
                                                        }
                                                        if (b != bytes2[i86 + i80]) {
                                                            z4 = true;
                                                            z5 = false;
                                                            break;
                                                        }
                                                        int i45116 = (i80 ^ (-64)) + ((i80 & (-64)) << 1);
                                                        i80 = (i45116 & 65) + (i45116 | 65);
                                                        str8 = str9;
                                                        length2 = i73;
                                                        bArr4 = bArr5;
                                                    }
                                                    if ((!z5) != z4) {
                                                        i76 = i79;
                                                        break;
                                                        break;
                                                    }
                                                    i79 = (-2) - (~i79);
                                                    str8 = str9;
                                                    length2 = i73;
                                                    bArr4 = bArr5;
                                                }
                                            }
                                            i77 = i44117;
                                            str8 = str9;
                                            length2 = i73;
                                            bArr4 = bArr5;
                                        }
                                        str9 = str8;
                                        i73 = length2;
                                        bArr5 = bArr4;
                                        i78 = (i78 | 1) + (i78 & 1);
                                        i77 = i44117;
                                        str8 = str9;
                                        length2 = i73;
                                        bArr4 = bArr5;
                                    }
                                    str8 = str8;
                                    length2 = length2;
                                    bArr4 = bArr4;
                                    i75 = 0;
                                    i74 = 4096;
                                }
                                str9 = str8;
                                i73 = length2;
                                if (i76 == length3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                bufferedInputStream8.close();
                                if (z3) {
                                    i72++;
                                    strArr6 = strArr9;
                                    strArr8 = strArr10;
                                    str8 = str9;
                                    length2 = i73;
                                }
                            }
                            int i45117 = (i57 & 170) + (i57 | 170);
                            i58 = (i45117 & length) | ((~i45117) & i40);
                            break loop7;
                        }
                        i56 = (i56 & (-103)) + (i56 | (-103)) + 104;
                        strArr6 = strArr6;
                    }
                }
                int i45118 = (~(i40 & i55)) & (i40 | i55);
                int i45119 = -i45118;
                int i46110 = ((i45118 & i45119) | (i45118 ^ i45119)) >> 31;
                int i46111 = (i58 & (~i46110)) | (i55 & i46110);
                int i46112 = -TextUtils.indexOf(str5, str5, 0);
                int i46113 = (i46112 & 2086) + (i46112 | 2086);
                int i46114 = -TextUtils.indexOf(str5, str5);
                int i46115 = (i46114 ^ 13) + ((i46114 & 13) << 1);
                int i46116 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr9112 = new Object[1];
                a(i46113, i46115, (char) ((i46116 & 11706) + (i46116 | 11706)), objArr9112);
                str7 = (String) objArr9112[0];
                Object[] objArr9113 = new Object[1];
                a(2098 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), 7 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (char) View.resolveSize(0, 0), objArr9113);
                bytes = ((String) objArr9113[0]).getBytes();
                length = bytes.length;
                if (length != 0) {
                    bufferedInputStream7 = new BufferedInputStream(new FileInputStream(str7));
                    bArr3 = new byte[4096];
                    i62 = 0;
                    while (true) {
                        i63 = bufferedInputStream7.read(bArr3, 0, 4096);
                        if (i63 > 0) {
                            break;
                            break;
                        }
                        i64 = 0;
                        while (i62 < length) {
                            i65 = TuitionPaymentFragmentbindingInflater1;
                            int i46117 = (i65 ^ 87) + ((i65 & 87) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i46117 % 128;
                            int i46118 = i46117 % 2;
                            if (i64 < i63) {
                                break;
                                break;
                            }
                            if (bArr3[i64] == bytes[i62]) {
                                i66 = (i65 ^ 89) + ((i65 & 89) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                                if (i66 % 2 == 0) {
                                    i62 += 90;
                                } else {
                                    i62++;
                                }
                            } else if (i62 != 0) {
                                i67 = i62 - 1;
                                while (true) {
                                    if (i67 > 0) {
                                        i62 = 0;
                                        break;
                                        break;
                                    }
                                    i68 = 0;
                                    while (true) {
                                        if (i68 < i67) {
                                            i69 = 1;
                                            z2 = true;
                                            break;
                                        }
                                        int i46119 = -i67;
                                        i70 = (i62 ^ i46119) + ((i46119 & i62) << 1);
                                        if (bytes[i68] != bytes[((i70 | i68) << 1) - (i70 ^ i68)]) {
                                            i69 = 1;
                                            z2 = false;
                                            break;
                                        }
                                        int i47120 = (i68 ^ (-107)) + ((i68 & (-107)) << 1);
                                        i68 = ((i47120 | 108) << 1) - (i47120 ^ 108);
                                    }
                                    if (!z2) {
                                        int i47121 = TuitionPaymentFragmentbindingInflater1 + 99;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i47121 % 128;
                                        int i47122 = i47121 % 2;
                                        i62 = i67;
                                        break;
                                        break;
                                    }
                                    int i47123 = ((i67 | 3) << i69) - (i67 ^ 3);
                                    i67 = (i47123 & (-4)) + (i47123 | (-4));
                                }
                            }
                            i64 = (i64 | 1) + (i64 & 1);
                        }
                    }
                    if (i62 == length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bufferedInputStream7.close();
                    if (!z) {
                        length = length;
                        i61 = i40;
                        int i471118 = ((~i46111) & i40) | (i46111 & length);
                        int i471119 = -i471118;
                        int i4711110 = ((i471118 & i471119) | (i471118 ^ i471119)) >> 31;
                        int i4711111 = i61 & (~i4711110);
                        int i4711112 = i46111 & i4711110;
                        int i4711113 = (i4711111 & i4711112) | (i4711111 ^ i4711112);
                        int i4811115 = 2106 - (~(-(-Color.red(0))));
                        int i4811116 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i4811117 = -Color.green(0);
                        Object[] objArr9114 = new Object[1];
                        a(i4811115, ((i4811116 | 47) << 1) - (i4811116 ^ 47), (char) (((i4811117 | 30402) << 1) - (i4811117 ^ 30402)), objArr9114);
                        Object[] objArr9115 = {(String) objArr9114[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c110 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iArgb11 = Color.argb(0, 0, 0, 0) + 993;
                            int doubleTapTimeout8 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                            byte b3114 = (byte) (-1);
                            Object[] objArr9116 = new Object[1];
                            c(b3114, (byte) (b3114 & 6), (byte) 0, objArr9116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c110, iArgb11, doubleTapTimeout8, -545305915, false, (String) objArr9116[0], new Class[]{String.class});
                        }
                        long jLongValue113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr9115)).longValue();
                        long j8114 = -275856909;
                        long j8115 = jLongValue113 ^ j3;
                        long j8116 = 933;
                        long j8117 = (((long) 934) * j8114) + (((long) (-932)) * jLongValue113) + (((long) (-933)) * ((((j8114 ^ j3) | j50) ^ j3) | j8115)) + ((((j8115 | j8114) ^ j3) | ((j8115 | j50) ^ j3)) * j8116) + (j8116 * ((jLongValue113 | j8114) ^ j3)) + ((long) 896316193);
                        int i4811118 = ((int) (j8117 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                        int i4811119 = ((int) j8117) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                        int i48111110 = ((i4811118 & i4811119) | (i4811118 ^ i4811119)) * 263;
                        int i48111111 = i40 ^ i4711113;
                        int i48111112 = -i48111111;
                        int i48111113 = ((i48111111 & i48111112) | (i48111111 ^ i48111112)) >> 31;
                        i41 = (i4711113 & i48111113) | (((i48111110 & length) | ((~i48111110) & i40)) & (~i48111113));
                        strArr3 = strArr5;
                    }
                }
                i59 = i40 & (-151);
                length = length;
                i60 = length & 150;
                i61 = i59 | i60;
                int i4711114 = ((~i46111) & i40) | (i46111 & length);
                int i4711115 = -i4711114;
                int i4711116 = ((i4711114 & i4711115) | (i4711114 ^ i4711115)) >> 31;
                int i4711117 = i61 & (~i4711116);
                int i4711118 = i46111 & i4711116;
                int i4711119 = (i4711117 & i4711118) | (i4711117 ^ i4711118);
                int i48111114 = 2106 - (~(-(-Color.red(0))));
                int i48111115 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i48111116 = -Color.green(0);
                Object[] objArr9117 = new Object[1];
                a(i48111114, ((i48111115 | 47) << 1) - (i48111115 ^ 47), (char) (((i48111116 | 30402) << 1) - (i48111116 ^ 30402)), objArr9117);
                Object[] objArr9118 = {(String) objArr9117[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char c111 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iArgb12 = Color.argb(0, 0, 0, 0) + 993;
                    int doubleTapTimeout9 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                    byte b3115 = (byte) (-1);
                    Object[] objArr9119 = new Object[1];
                    c(b3115, (byte) (b3115 & 6), (byte) 0, objArr9119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c111, iArgb12, doubleTapTimeout9, -545305915, false, (String) objArr9119[0], new Class[]{String.class});
                }
                long jLongValue114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr9118)).longValue();
                long j8118 = -275856909;
                long j8119 = jLongValue114 ^ j3;
                long j81110 = 933;
                long j81111 = (((long) 934) * j8118) + (((long) (-932)) * jLongValue114) + (((long) (-933)) * ((((j8118 ^ j3) | j50) ^ j3) | j8119)) + ((((j8119 | j8118) ^ j3) | ((j8119 | j50) ^ j3)) * j81110) + (j81110 * ((jLongValue114 | j8118) ^ j3)) + ((long) 896316193);
                int i48111117 = ((int) (j81111 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                int i48111118 = ((int) j81111) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                int i48111119 = ((i48111117 & i48111118) | (i48111117 ^ i48111118)) * 263;
                int i481111110 = i40 ^ i4711119;
                int i481111111 = -i481111110;
                int i481111112 = ((i481111110 & i481111111) | (i481111110 ^ i481111111)) >> 31;
                i41 = (i4711119 & i481111112) | (((i48111119 & length) | ((~i48111119) & i40)) & (~i481111112));
                strArr3 = strArr5;
            } else {
                str5 = str4;
            }
            int doubleTapTimeout10 = 370 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i4910 = -View.resolveSize(0, 0);
            Object[] objArr1010 = new Object[1];
            a(doubleTapTimeout10, (i4910 ^ 23) + ((i4910 & 23) << 1), (char) (TextUtils.getTrimmedLength(str5) + 63257), objArr1010);
            String str320 = (String) objArr1010[0];
            int i4911 = 807 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int iLastIndexOf8 = TextUtils.lastIndexOf(str5, '0');
            Object[] objArr1011 = new Object[1];
            a(i4911, (iLastIndexOf8 ^ 11) + ((iLastIndexOf8 & 11) << 1), (char) (19077 - (ViewConfiguration.getTouchSlop() >> 8)), objArr1011);
            String str321 = (String) objArr1011[0];
            Object[] objArr1012 = new Object[1];
            a(ExpandableListView.getPackedPositionGroup(0L) + 818, 6 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16)), (char) ((-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))) - 1), objArr1012);
            String str322 = (String) objArr1012[0];
            int i4912 = 826 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i4913 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            Object[] objArr1013 = new Object[1];
            a(i4912, (i4913 ^ 7) + ((i4913 & 7) << 1), (char) (View.MeasureSpec.getSize(0) + 12484), objArr1013);
            String[] strArr110 = {str320, str321, str322, (String) objArr1013[0]};
            int i4914 = 831 - (~(-TextUtils.lastIndexOf(str5, '0')));
            int i4915 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            int i4916 = ((i4915 | 17) << 1) - (i4915 ^ 17);
            int i4917 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr1014 = new Object[1];
            a(i4914, i4916, (char) ((i4917 ^ 2368) + ((i4917 & 2368) << 1)), objArr1014);
            String str323 = (String) objArr1014[0];
            int i4918 = -(-(Process.myTid() >> 22));
            int i4919 = (i4918 ^ 850) + ((i4918 & 850) << 1);
            int i5010 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            Object[] objArr1015 = new Object[1];
            a(i4919, ((i5010 | 6) << 1) - (i5010 ^ 6), (char) (15386 - (~(-(-TextUtils.getTrimmedLength(str5))))), objArr1015);
            String str410 = (String) objArr1015[0];
            int i5011 = -View.MeasureSpec.getSize(0);
            int i5012 = ((i5011 | 857) << 1) - (i5011 ^ 857);
            int i5013 = -AndroidCharacter.getMirror('0');
            Object[] objArr1016 = new Object[1];
            a(i5012, (i5013 & 55) + (i5013 | 55), (char) (50895 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr1016);
            String str411 = (String) objArr1016[0];
            int i5014 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i5015 = ((i5014 | 865) << 1) - (i5014 ^ 865);
            int i5016 = -View.combineMeasuredStates(0, 0);
            Object[] objArr1017 = new Object[1];
            a(i5015, (i5016 ^ 11) + ((i5016 & 11) << 1), (char) (4319 - (~(-ImageFormat.getBitsPerPixel(0)))), objArr1017);
            String str412 = (String) objArr1017[0];
            int iIndexOf12 = TextUtils.indexOf((CharSequence) str5, '0', 0) + 876;
            int i5017 = 14 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
            int iIndexOf13 = TextUtils.indexOf(str5, str5);
            Object[] objArr1018 = new Object[1];
            a(iIndexOf12, i5017, (char) (((iIndexOf13 | 23401) << 1) - (iIndexOf13 ^ 23401)), objArr1018);
            String[] strArr111 = {str323, str410, str411, str412, (String) objArr1018[0]};
            int i5018 = -TextUtils.lastIndexOf(str5, '0');
            int i5019 = -TextUtils.lastIndexOf(str5, '0');
            Object[] objArr1019 = new Object[1];
            a((i5018 ^ 888) + ((i5018 & 888) << 1), (i5019 ^ 15) + ((i5019 & 15) << 1), (char) View.getDefaultSize(0, 0), objArr1019);
            String str413 = (String) objArr1019[0];
            int i5110 = -TextUtils.indexOf(str5, str5);
            int i5111 = ((i5110 | TypedValues.Custom.TYPE_DIMENSION) << 1) - (i5110 ^ TypedValues.Custom.TYPE_DIMENSION);
            int i5112 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i5113 = ~i5112;
            int i5114 = (i5113 & (-4)) | (i5113 ^ (-4));
            int i5115 = ~((i5114 & i40) | (i5114 ^ i40));
            int i5116 = (i15 ^ i5112) | (i15 & i5112);
            int i5117 = ~((i5116 & 3) | (i5116 ^ 3));
            int i5118 = (((i5112 * (-317)) + 957) - (~(-(-(((i5115 & i5117) | (i5115 ^ i5117)) * (-318)))))) - 1;
            int i5119 = ~(((-4) ^ i5112) | ((-4) & i5112));
            int i5210 = ~((i5112 ^ i40) | (i5112 & i40));
            int i5211 = ((i5119 & i5210) | (i5119 ^ i5210)) * (-318);
            int i5212 = (i5118 ^ i5211) + ((i5118 & i5211) << 1);
            int i5213 = ~i5112;
            int i5214 = ~((i5213 & i40) | (i5213 ^ i40));
            Object[] objArr1110 = new Object[1];
            a(i5111, (i5212 - (~(-(-(((i5214 & (-4)) | ((-4) ^ i5214)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1110);
            String str414 = (String) objArr1110[0];
            int i5215 = -KeyEvent.normalizeMetaState(0);
            Object[] objArr1111 = new Object[1];
            a((i5215 ^ 916) + ((i5215 & 916) << 1), 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (57166 - (~(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), objArr1111);
            String str415 = (String) objArr1111[0];
            int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr1112 = new Object[1];
            a(((packedPositionChild3 | 939) << 1) - (packedPositionChild3 ^ 939), 24 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1112);
            String str416 = (String) objArr1112[0];
            int i5216 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i5217 = (i5216 ^ 963) + ((i5216 & 963) << 1);
            int i5218 = 27 - (~(-Drawable.resolveOpacity(0, 0)));
            int i5219 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            Object[] objArr1113 = new Object[1];
            a(i5217, i5218, (char) ((i5219 ^ 1373) + ((i5219 & 1373) << 1)), objArr1113);
            String[] strArr210 = {str413, str414, str, str415, str416, (String) objArr1113[0]};
            int i5310 = -(-Drawable.resolveOpacity(0, 0));
            int i5311 = (i5310 & 991) + (i5310 | 991);
            int i5312 = -View.getDefaultSize(0, 0);
            int i5313 = (i5312 * 477) - 5225;
            int i5314 = ~((~i5312) | 11);
            int i5315 = ((-12) & i5312) | ((-12) ^ i5312);
            int i5316 = ~((i5315 & i40) | (i5315 ^ i40));
            int i5317 = -(-(((i5314 & i5316) | (i5314 ^ i5316)) * (-476)));
            int i5318 = (i5313 & i5317) + (i5313 | i5317);
            int i5319 = ((-12) & i5312) | ((-12) ^ i5312);
            int i5410 = i5318 + ((~((i5319 & i40) | (i5319 ^ i40))) * 952);
            int i5411 = ((-12) ^ i42) | ((-12) & i42);
            int i5412 = -(-((~((i5312 & i5411) | (i5411 ^ i5312))) * 476));
            Object[] objArr1114 = new Object[1];
            a(i5311, (i5410 & i5412) + (i5412 | i5410), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr1114);
            String str417 = (String) objArr1114[0];
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iTuitionPaymentFragmentbindingInflater16 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i5413 = (iMakeMeasureSpec3 * 714) - 713424;
            int i5414 = ~iMakeMeasureSpec3;
            int i5415 = ~iTuitionPaymentFragmentbindingInflater16;
            int i5416 = ~((i5414 & i5415) | (i5414 ^ i5415));
            int i5417 = ~iMakeMeasureSpec3;
            int i5418 = ~((i5417 & 1002) | (i5417 ^ 1002));
            int i5419 = (i5416 & i5418) | (i5416 ^ i5418);
            int i5510 = ((-1003) & iMakeMeasureSpec3) | ((-1003) ^ iMakeMeasureSpec3);
            int i5511 = ~((i5510 & iTuitionPaymentFragmentbindingInflater16) | (i5510 ^ iTuitionPaymentFragmentbindingInflater16));
            int i5512 = -(-(((i5419 & i5511) | (i5419 ^ i5511)) * (-713)));
            int i5513 = iMakeMeasureSpec3 | (-1003);
            Object[] objArr1115 = new Object[1];
            a(((((i5413 ^ i5512) + ((i5413 & i5512) << 1)) - (~((~((i5513 & iTuitionPaymentFragmentbindingInflater16) | (i5513 ^ iTuitionPaymentFragmentbindingInflater16))) * 1426))) - 1) + ((~((~iTuitionPaymentFragmentbindingInflater16) | (-1003))) * 713), 8 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), (char) View.MeasureSpec.getSize(0), objArr1115);
            String str418 = (String) objArr1115[0];
            int i5514 = -KeyEvent.getDeadChar(0, 0);
            int i5515 = ((i5514 | PointerIconCompat.TYPE_ALIAS) << 1) - (i5514 ^ PointerIconCompat.TYPE_ALIAS);
            int i5516 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
            Object[] objArr1116 = new Object[1];
            a(i5515, (i5516 ^ 5) + ((i5516 & 5) << 1), (char) (38254 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr1116);
            String str419 = (String) objArr1116[0];
            int i5517 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr1117 = new Object[1];
            a((i5517 ^ PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) + ((i5517 & PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) << 1), 4 - (~(-MotionEvent.axisFromString(str5))), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 45138), objArr1117);
            String[] strArr211 = {str417, str418, str419, (String) objArr1117[0]};
            int i5518 = 1022 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
            int size6 = View.MeasureSpec.getSize(0) + 16;
            int offsetAfter5 = TextUtils.getOffsetAfter(str5, 0);
            Object[] objArr1118 = new Object[1];
            a(i5518, size6, (char) (((offsetAfter5 | 55868) << 1) - (offsetAfter5 ^ 55868)), objArr1118);
            String str510 = (String) objArr1118[0];
            int i5519 = 857 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
            int i5610 = -(Process.myTid() >> 22);
            int i5611 = (i5610 & 7) + (i5610 | 7);
            int threadPriority10 = Process.getThreadPriority(0);
            int i5612 = ((threadPriority10 ^ 20) + ((threadPriority10 & 20) << 1)) >> 6;
            Object[] objArr1119 = new Object[1];
            a(i5519, i5611, (char) (((i5612 | 50897) << 1) - (i5612 ^ 50897)), objArr1119);
            String str511 = (String) objArr1119[0];
            int i5613 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i5614 = ((i5613 | 825) << 1) - (i5613 ^ 825);
            int scrollBarSize11 = (ViewConfiguration.getScrollBarSize() >> 8) + 8;
            int i5615 = -TextUtils.getOffsetAfter(str5, 0);
            Object[] objArr1210 = new Object[1];
            a(i5614, scrollBarSize11, (char) ((i5615 ^ 12484) + ((i5615 & 12484) << 1)), objArr1210);
            String[] strArr212 = {str510, str511, (String) objArr1210[0]};
            int i5616 = -TextUtils.indexOf(str5, str5, 0);
            int i5617 = (i5616 ^ 1038) + ((i5616 & 1038) << 1);
            int i5618 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            Object[] objArr1211 = new Object[1];
            a(i5617, (i5618 ^ 14) + ((i5618 & 14) << 1), (char) (21690 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)))), objArr1211);
            String str512 = (String) objArr1211[0];
            int gidForName2 = Process.getGidForName(str5);
            int i5619 = (gidForName2 * (-183)) + 194805;
            int i5710 = ~gidForName2;
            int i5711 = ~((i5710 ^ 1053) | (i5710 & 1053));
            int i5712 = ~((i42 ^ 1053) | (i42 & 1053));
            int i5713 = ((i5711 & i5712) | (i5711 ^ i5712)) * 184;
            int i5714 = ~((gidForName2 & (-1054)) | ((-1054) ^ gidForName2));
            int i5715 = ((((i5619 | i5713) << 1) - (i5619 ^ i5713)) - (~(((i5714 & i40) | (i40 ^ i5714)) * (-184)))) - 1;
            int i5716 = -(-((~((i5710 ^ i42) | (i5710 & i42))) * 184));
            int defaultSize3 = View.getDefaultSize(0, 0);
            Object[] objArr1212 = new Object[1];
            a(((i5715 | i5716) << 1) - (i5716 ^ i5715), ((defaultSize3 | 1) << 1) - (defaultSize3 ^ 1), (char) TextUtils.indexOf(str5, str5, 0), objArr1212);
            String[] strArr213 = {str512, (String) objArr1212[0]};
            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1053;
            int i5717 = 9 - (~(-(-TextUtils.indexOf((CharSequence) str5, '0', 0))));
            int i5718 = -KeyEvent.normalizeMetaState(0);
            Object[] objArr1213 = new Object[1];
            a(minimumFlingVelocity3, i5717, (char) ((i5718 & 19551) + (i5718 | 19551)), objArr1213);
            String str513 = (String) objArr1213[0];
            Object[] objArr1214 = new Object[1];
            a(1061 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0)))), 0 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) View.MeasureSpec.getMode(0), objArr1214);
            String[] strArr214 = {str513, (String) objArr1214[0]};
            int i5719 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i5810 = ((i5719 | 1063) << 1) - (i5719 ^ 1063);
            int i5811 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr1215 = new Object[1];
            a(i5810, (i5811 ^ 15) + ((i5811 & 15) << 1), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr1215);
            String str514 = (String) objArr1215[0];
            int i5812 = -(KeyEvent.getMaxKeyCode() >> 16);
            int i5813 = (i5812 & TypedValues.Custom.TYPE_DIMENSION) + (i5812 | TypedValues.Custom.TYPE_DIMENSION);
            int i5814 = -View.getDefaultSize(0, 0);
            Object[] objArr1216 = new Object[1];
            a(i5813, ((i5814 | 3) << 1) - (i5814 ^ 3), (char) (Process.myPid() >> 22), objArr1216);
            String str515 = (String) objArr1216[0];
            int longPressTimeout7 = 850 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int trimmedLength6 = TextUtils.getTrimmedLength(str5) + 7;
            int i5815 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
            Object[] objArr1217 = new Object[1];
            a(longPressTimeout7, trimmedLength6, (char) ((i5815 & 15387) + (i5815 | 15387)), objArr1217);
            String str516 = (String) objArr1217[0];
            int offsetAfter6 = TextUtils.getOffsetAfter(str5, 0);
            int i5816 = (offsetAfter6 & 1079) + (offsetAfter6 | 1079);
            int i5817 = -(-Color.alpha(0));
            int i5818 = -(-TextUtils.lastIndexOf(str5, '0', 0));
            Object[] objArr1218 = new Object[1];
            a(i5816, ((i5817 | 8) << 1) - (i5817 ^ 8), (char) (((i5818 | 2449) << 1) - (i5818 ^ 2449)), objArr1218);
            String str517 = (String) objArr1218[0];
            int i5819 = 864 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask()))));
            int iIndexOf14 = TextUtils.indexOf(str5, str5, 0);
            Object[] objArr1219 = new Object[1];
            a(i5819, (iIndexOf14 & 11) + (iIndexOf14 | 11), (char) (4320 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0)), objArr1219);
            String str518 = (String) objArr1219[0];
            int i5910 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
            int i5911 = ((i5910 | 876) << 1) - (i5910 ^ 876);
            int i5912 = -(ViewConfiguration.getEdgeSlop() >> 16);
            Object[] objArr1310 = new Object[1];
            a(i5911, ((i5912 | 14) << 1) - (i5912 ^ 14), (char) (TextUtils.getTrimmedLength(str5) + 23401), objArr1310);
            String[] strArr215 = {str514, str515, str516, str517, str518, (String) objArr1310[0]};
            int i5913 = 1087 - (~(-(-Process.getGidForName(str5))));
            int i5914 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i5915 = (i5914 ^ 20) + ((i5914 & 20) << 1);
            int keyRepeatTimeout6 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            Object[] objArr1311 = new Object[1];
            a(i5913, i5915, (char) ((keyRepeatTimeout6 ^ 65417) + ((keyRepeatTimeout6 & 65417) << 1)), objArr1311);
            String str519 = (String) objArr1311[0];
            int iResolveOpacity8 = Drawable.resolveOpacity(0, 0);
            int iTuitionPaymentFragmentbindingInflater17 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i5916 = iResolveOpacity8 * 51;
            int i5917 = (i5916 ^ (-54243)) + ((i5916 & (-54243)) << 1);
            int i5918 = -(-(((iResolveOpacity8 ^ iTuitionPaymentFragmentbindingInflater17) | (iResolveOpacity8 & iTuitionPaymentFragmentbindingInflater17)) * (-50)));
            int i5919 = (i5917 ^ i5918) + ((i5918 & i5917) << 1);
            int i6010 = (~iResolveOpacity8) | (-1108);
            int i6011 = ~((i6010 & iTuitionPaymentFragmentbindingInflater17) | (i6010 ^ iTuitionPaymentFragmentbindingInflater17));
            int i6012 = (-1108) | (~iTuitionPaymentFragmentbindingInflater17);
            int i6013 = ~((i6012 & iResolveOpacity8) | (i6012 ^ iResolveOpacity8));
            int i6014 = ((i6011 & i6013) | (i6011 ^ i6013)) * 50;
            int i6015 = (i5919 & i6014) + (i6014 | i5919);
            int i6016 = ~iTuitionPaymentFragmentbindingInflater17;
            int i6017 = ~(((-1108) ^ i6016) | ((-1108) & i6016));
            int i6018 = ~(((-1108) & iResolveOpacity8) | ((-1108) ^ iResolveOpacity8));
            int i6019 = -(-(((~((i6016 & iResolveOpacity8) | (i6016 ^ iResolveOpacity8))) | (i6017 & i6018) | (i6017 ^ i6018)) * 50));
            int i6110 = ((i6015 | i6019) << 1) - (i6019 ^ i6015);
            int i6111 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
            int i6112 = (i6111 & 20) + (i6111 | 20);
            int i6113 = -ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr1312 = new Object[1];
            a(i6110, i6112, (char) (((i6113 | 61872) << 1) - (i6113 ^ 61872)), objArr1312);
            String str610 = (String) objArr1312[0];
            int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
            int i6114 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            Object[] objArr1313 = new Object[1];
            a(((tapTimeout3 | 1126) << 1) - (tapTimeout3 ^ 1126), (i6114 & 31) + (i6114 | 31), (char) TextUtils.getTrimmedLength(str5), objArr1313);
            String str611 = (String) objArr1313[0];
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
            int i6115 = (iNormalizeMetaState2 * 829) + 959153;
            int i6116 = ~iNormalizeMetaState2;
            int i6117 = ~((i6116 & (-1158)) | (i6116 ^ (-1158)));
            int i6118 = ~(i42 | iNormalizeMetaState2 | 1157);
            int i6119 = ((i6117 & i6118) | (i6117 ^ i6118)) * (-828);
            int i6210 = ((i6115 | i6119) << 1) - (i6115 ^ i6119);
            int i6211 = (iNormalizeMetaState2 ^ 1157) | (iNormalizeMetaState2 & 1157);
            int i6212 = (i6210 - (~(-(-(((i6211 ^ i15) | (i6211 & i15)) * (-828)))))) - 1;
            int i6213 = (~i6211) * 828;
            int i6214 = (i6212 ^ i6213) + ((i6213 & i6212) << 1);
            int i6215 = -(-ExpandableListView.getPackedPositionGroup(0L));
            Object[] objArr1314 = new Object[1];
            a(i6214, ((i6215 | 26) << 1) - (i6215 ^ 26), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr1314);
            String str612 = (String) objArr1314[0];
            int i6216 = -(-((Process.getThreadPriority(0) + 20) >> 6));
            int i6217 = ((i6216 | 1183) << 1) - (i6216 ^ 1183);
            int i6218 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr1315 = new Object[1];
            a(i6217, (i6218 ^ 24) + ((i6218 & 24) << 1), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr1315);
            String str613 = (String) objArr1315[0];
            int i6219 = 1207 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i6310 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32;
            int i6311 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr1316 = new Object[1];
            a(i6219, i6310, (char) (((i6311 | 1) << 1) - (i6311 ^ 1)), objArr1316);
            f = 0.0f;
            String[] strArr216 = {str519, str610, str611, str612, str613, (String) objArr1316[0], str};
            int i6312 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i6313 = ((i6312 | 1239) << 1) - (i6312 ^ 1239);
            int i6314 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr1317 = new Object[1];
            a(i6313, (i6314 & 13) + (i6314 | 13), (char) Color.green(0), objArr1317);
            String str614 = (String) objArr1317[0];
            Object[] objArr1318 = new Object[1];
            a(TextUtils.indexOf((CharSequence) str5, '0') + 819, 7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1318);
            String[] strArr217 = {str614, (String) objArr1318[0]};
            int touchSlop2 = ViewConfiguration.getTouchSlop() >> 8;
            int i6315 = (touchSlop2 & 1252) + (touchSlop2 | 1252);
            int i6316 = -(ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr1319 = new Object[1];
            a(i6315, ((i6316 | 30) << 1) - (i6316 ^ 30), (char) (3389 - (~(-(-TextUtils.getOffsetAfter(str5, 0))))), objArr1319);
            String str615 = (String) objArr1319[0];
            int i6317 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
            int i6318 = (i6317 & 1282) + (i6317 | 1282);
            int defaultSize4 = View.getDefaultSize(0, 0);
            int iTuitionPaymentFragmentbindingInflater18 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i6319 = defaultSize4 * (-405);
            int i6410 = ((i6319 | 4477) << 1) - (i6319 ^ 4477);
            int i6411 = ~((-12) | iTuitionPaymentFragmentbindingInflater18);
            int i6412 = ~iTuitionPaymentFragmentbindingInflater18;
            int i6413 = (i6412 ^ defaultSize4) | (i6412 & defaultSize4);
            int i6414 = ~((i6413 ^ 11) | (i6413 & 11));
            int i6415 = i6410 + (((i6411 ^ i6414) | (i6411 & i6414)) * (-406));
            int i6416 = ~iTuitionPaymentFragmentbindingInflater18;
            int i6417 = (~(((-12) ^ i6416) | (i6416 & (-12)) | defaultSize4)) * (-406);
            int i6418 = (i6415 ^ i6417) + ((i6417 & i6415) << 1);
            int i6419 = ~defaultSize4;
            int i6510 = ~((iTuitionPaymentFragmentbindingInflater18 & i6419) | (i6419 ^ iTuitionPaymentFragmentbindingInflater18));
            int i6511 = ~((i6412 ^ 11) | (i6412 & 11));
            int i6512 = ((i6510 & i6511) | (i6510 ^ i6511)) * 406;
            Object[] objArr1410 = new Object[1];
            a(i6318, ((i6418 | i6512) << 1) - (i6512 ^ i6418), (char) TextUtils.getOffsetAfter(str5, 0), objArr1410);
            String[] strArr218 = {str615, (String) objArr1410[0]};
            int iGreen2 = Color.green(0) + 1293;
            int i6513 = -Process.getGidForName(str5);
            int i6514 = ((i6513 | 18) << 1) - (i6513 ^ 18);
            int i6515 = -(ViewConfiguration.getTouchSlop() >> 8);
            Object[] objArr1411 = new Object[1];
            a(iGreen2, i6514, (char) ((i6515 & 64336) + (i6515 | 64336)), objArr1411);
            String str616 = (String) objArr1411[0];
            int i6516 = -View.resolveSizeAndState(0, 0, 0);
            Object[] objArr1412 = new Object[1];
            a(((i6516 | 1312) << 1) - (i6516 ^ 1312), 5 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.combineMeasuredStates(0, 0) + 58138), objArr1412);
            String[] strArr219 = {str616, (String) objArr1412[0]};
            int i6517 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i6518 = (i6517 & 1318) + (i6517 | 1318);
            int iResolveSize4 = View.resolveSize(0, 0) + 19;
            int edgeSlop6 = ViewConfiguration.getEdgeSlop() >> 16;
            int i6519 = edgeSlop6 * (-375);
            int i6610 = ((i6519 | (-5639250)) << 1) - (i6519 ^ (-5639250));
            int i6611 = ~((~edgeSlop6) | (-15039));
            int i6612 = ~((edgeSlop6 ^ 15038) | (edgeSlop6 & 15038));
            int i6613 = i6610 + (((i6611 & i40) | (i40 ^ i6611) | i6612) * 376);
            int i6614 = ~((i15 ^ edgeSlop6) | (i15 & edgeSlop6));
            int i6615 = ~edgeSlop6;
            Object[] objArr1413 = new Object[1];
            a(i6518, iResolveSize4, (char) (i6613 + (((i6614 & i6612) | (i6614 ^ i6612)) * (-376)) + (((~((i6615 & i40) | (i6615 ^ i40))) | 15038) * 376)), objArr1413);
            String[] strArr310 = {(String) objArr1413[0]};
            int i6616 = 1335 - (~TextUtils.indexOf(str5, str5, 0));
            int i6617 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int i6618 = ((i6617 | 15) << 1) - (i6617 ^ 15);
            int i6619 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            Object[] objArr1414 = new Object[1];
            a(i6616, i6618, (char) ((i6619 ^ 7169) + ((i6619 & 7169) << 1)), objArr1414);
            String[] strArr311 = {(String) objArr1414[0]};
            int i6710 = 1352 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
            int i6711 = -View.resolveSize(0, 0);
            Object[] objArr1415 = new Object[1];
            a(i6710, ((i6711 | 19) << 1) - (i6711 ^ 19), (char) (34869 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr1415);
            String[] strArr312 = {(String) objArr1415[0]};
            int i6712 = 1370 - (~(-(ViewConfiguration.getPressedStateDuration() >> 16)));
            int i6713 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr1416 = new Object[1];
            a(i6712, (i6713 ^ 19) + ((i6713 & 19) << 1), (char) Color.alpha(0), objArr1416);
            String[] strArr313 = {(String) objArr1416[0]};
            int i6714 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr1417 = new Object[1];
            a((i6714 & 1391) + (i6714 | 1391), 22 - (~(-(-TextUtils.getTrimmedLength(str5)))), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr1417);
            String[] strArr314 = {(String) objArr1417[0]};
            int trimmedLength7 = TextUtils.getTrimmedLength(str5) + 1413;
            int i6715 = 20 - (~(-View.MeasureSpec.getMode(0)));
            int i6716 = -View.MeasureSpec.getMode(0);
            int iTuitionPaymentFragmentbindingInflater19 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i6717 = i6716 * 450;
            int i6718 = (i6717 ^ (-17364928)) + ((i6717 & (-17364928)) << 1);
            int i6719 = ~i6716;
            int i6810 = ~((i6719 & 38761) | (i6719 ^ 38761));
            int i6811 = (-38762) | i6716;
            int i6812 = ~((i6811 ^ iTuitionPaymentFragmentbindingInflater19) | (i6811 & iTuitionPaymentFragmentbindingInflater19));
            int i6813 = -(-(((i6810 ^ i6812) | (i6810 & i6812)) * 449));
            int i6814 = (i6718 ^ i6813) + ((i6813 & i6718) << 1);
            int i6815 = ~i6716;
            int i6816 = i6814 + ((~((i6815 ^ 38761) | (i6815 & 38761))) * (-1347));
            int i6817 = ~((i6815 & 38761) | (i6815 ^ 38761));
            int i6818 = (~iTuitionPaymentFragmentbindingInflater19) | (-38762);
            char c112 = (char) (i6816 + (((~((i6716 & i6818) | (i6818 ^ i6716))) | i6817) * 449));
            Object[] objArr1418 = new Object[1];
            a(trimmedLength7, i6715, c112, objArr1418);
            String[] strArr315 = {(String) objArr1418[0]};
            int i6819 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr1419 = new Object[1];
            a(((i6819 | 1435) << 1) - (i6819 ^ 1435), TextUtils.indexOf(str5, str5) + 24, (char) View.resolveSizeAndState(0, 0, 0), objArr1419);
            String str617 = str;
            String[] strArr316 = {(String) objArr1419[0], str617};
            int i6910 = 1457 - (~(-(-(ViewConfiguration.getFadingEdgeLength() >> 16))));
            int i6911 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iTuitionPaymentFragmentbindingInflater20 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i6912 = (i6911 * 495) - 14297;
            int i6913 = (i6911 | (-30)) * (-988);
            int i6914 = (i6912 & i6913) + (i6912 | i6913);
            int i6915 = (~i6911) | 29;
            int i6916 = ~iTuitionPaymentFragmentbindingInflater20;
            int i6917 = ((i6915 & i6916) | (i6915 ^ i6916)) * 494;
            int i6918 = ((i6914 | i6917) << 1) - (i6917 ^ i6914);
            int i6919 = ~i6911;
            int i7010 = ~((i6919 & (-30)) | (i6919 ^ (-30)));
            int i7011 = ~(i6916 | 29);
            Object[] objArr1510 = new Object[1];
            a(i6910, i6918 + (((~((i6911 & 29) | (i6911 ^ 29))) | (i7011 & i7010) | (i7010 ^ i7011)) * 494), (char) (KeyEvent.keyCodeFromString(str5) + 9712), objArr1510);
            String[] strArr317 = {(String) objArr1510[0], str617};
            int i7012 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0);
            Object[] objArr1511 = new Object[1];
            a((i7012 & 1486) + (i7012 | 1486), (iResolveSizeAndState3 & 27) + (iResolveSizeAndState3 | 27), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr1511);
            String[] strArr318 = {(String) objArr1511[0], str617};
            int i7013 = 1511 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
            int i7014 = -ImageFormat.getBitsPerPixel(0);
            Object[] objArr1512 = new Object[1];
            a(i7013, ((i7014 | 30) << 1) - (i7014 ^ 30), (char) (0 - (~(-(-ExpandableListView.getPackedPositionChild(0L))))), objArr1512);
            String[] strArr319 = {(String) objArr1512[0], str617};
            int iResolveSize5 = View.resolveSize(0, 0) + 1544;
            int scrollDefaultDelay5 = ViewConfiguration.getScrollDefaultDelay() >> 16;
            int i7015 = (scrollDefaultDelay5 ^ 27) + ((scrollDefaultDelay5 & 27) << 1);
            int i7016 = -(Process.myPid() >> 22);
            Object[] objArr1513 = new Object[1];
            a(iResolveSize5, i7015, (char) (((i7016 | 30438) << 1) - (i7016 ^ 30438)), objArr1513);
            String[] strArr46 = {(String) objArr1513[0], str617};
            int i7017 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0));
            Object[] objArr1514 = new Object[1];
            a((i7017 & 1572) + (i7017 | 1572), 30 - (~(-ExpandableListView.getPackedPositionChild(0L))), (char) (0 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), objArr1514);
            strArr4 = new String[][]{strArr110, strArr111, strArr210, strArr211, strArr212, strArr213, strArr214, strArr215, strArr216, strArr217, strArr218, strArr219, strArr310, strArr311, strArr312, strArr313, strArr314, strArr315, strArr316, strArr317, strArr318, strArr319, strArr46, new String[]{(String) objArr1514[0], str617}};
            int i7018 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr1515 = new Object[1];
            a((i7018 ^ 1604) + ((i7018 & 1604) << 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, (char) (40169 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr1515);
            c5 = 0;
            sb = new StringBuilder((String) objArr1515[0]);
            i45 = i40;
            i46 = 0;
            i47 = 0;
            i48 = 24;
            while (i46 < i48) {
                String[] strArr47 = strArr4[i46];
                Object[] objArr1516 = {strArr47[c5]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c113 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i7019 = 3086 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                    int threadPriority11 = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
                    byte b46 = (byte) (-1);
                    byte b47 = (byte) (-b46);
                    Object[] objArr1517 = new Object[1];
                    c(b46, b47, (byte) (b47 - 1), objArr1517);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c113, i7019, threadPriority11, 1411172903, false, (String) objArr1517[0], new Class[]{String.class});
                }
                str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1516);
                String[] strArr48 = (String[]) Arrays.copyOfRange(strArr47, 1, strArr47.length);
                if (str6 == null && !str6.isEmpty()) {
                    if (strArr47.length != 1) {
                        int length7 = strArr48.length;
                        int i839 = 0;
                        while (true) {
                            if (i839 < length7) {
                                if (str6.contains(strArr48[i839])) {
                                    i45 = i40 ^ (i46 + 10);
                                    i53 = ((i47 | 1) << 1) - (i47 ^ 1);
                                    if (i53 > 1) {
                                        int i840 = -(-Color.red(0));
                                        Object[] objArr184 = new Object[1];
                                        a((i840 ^ 1604) + ((i840 & 1604) << 1), 1 - (~(-(-View.MeasureSpec.getMode(0)))), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr184);
                                        sb.append((String) objArr184[0]);
                                    }
                                    sb.append(strArr47[0]);
                                    int i841 = 1604 - (~(-TextUtils.lastIndexOf(str5, '0')));
                                    int i842 = -Gravity.getAbsoluteGravity(0, 0);
                                    Object[] objArr185 = new Object[1];
                                    a(i841, ((i842 | 1) << 1) - (i842 ^ 1), (char) Gravity.getAbsoluteGravity(0, 0), objArr185);
                                    sb.append((String) objArr185[0]);
                                    sb.append(str6);
                                    i47 = i53;
                                } else {
                                    i839++;
                                }
                            }
                        }
                    } else {
                        i45 = i40 ^ (i46 + 10);
                        i53 = ((i47 | 1) << 1) - (i47 ^ 1);
                        if (i53 > 1) {
                            int i843 = -(-Color.red(0));
                            Object[] objArr186 = new Object[1];
                            a((i843 ^ 1604) + ((i843 & 1604) << 1), 1 - (~(-(-View.MeasureSpec.getMode(0)))), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr186);
                            sb.append((String) objArr186[0]);
                        }
                        sb.append(strArr47[0]);
                        int i844 = 1604 - (~(-TextUtils.lastIndexOf(str5, '0')));
                        int i845 = -Gravity.getAbsoluteGravity(0, 0);
                        Object[] objArr187 = new Object[1];
                        a(i844, ((i845 | 1) << 1) - (i845 ^ 1), (char) Gravity.getAbsoluteGravity(0, 0), objArr187);
                        sb.append((String) objArr187[0]);
                        sb.append(str6);
                        i47 = i53;
                    }
                }
                int i7110 = ((i46 | 52) << 1) - (i46 ^ 52);
                i46 = (i7110 & (-51)) + (i7110 | (-51));
                strArr4 = strArr4;
                i42 = i42;
                j25 = j25;
                f = 0.0f;
                i48 = 24;
                c5 = 0;
            }
            length = i42;
            j3 = j25;
            int i7111 = -ExpandableListView.getPackedPositionType(0L);
            int i7112 = ((i7111 | 1607) << 1) - (i7111 ^ 1607);
            int i7113 = -ImageFormat.getBitsPerPixel(0);
            int i7114 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            Object[] objArr1518 = new Object[1];
            a(i7112, i7113, (char) ((i7114 ^ (-1)) + (i7114 << 1)), objArr1518);
            c6 = 0;
            sb.append((String) objArr1518[0]);
            objArr = new Object[2];
            if (i47 > 2) {
                objArr[0] = new int[1];
                String[] strArr49 = {sb.toString()};
                ((int[]) objArr[0])[0] = i45;
                objArr[1] = strArr49;
            } else {
                objArr[0] = new int[]{i40};
                int i7115 = TuitionPaymentFragmentbindingInflater1;
                int i7116 = (i7115 ^ 93) + ((i7115 & 93) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7116 % 128;
                int i7117 = i7116 % 2;
                c6 = 0;
                objArr[1] = new String[0];
            }
            i49 = ((int[]) objArr[c6])[c6];
            int i7118 = (~(i40 & i44)) & (i40 | i44);
            int i7119 = -i7118;
            i50 = ((i7118 & i7119) | (i7118 ^ i7119)) >> 31;
            i51 = ~i50;
            i52 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
            TuitionPaymentFragmentbindingInflater1 = i52 % 128;
            if (i52 % 2 != 0) {
                i44 = (i44 & i50) | (i49 & i51);
                obj = objArr[1];
            } else {
                int i7210 = i49 & i51;
                int i7211 = i44 & i50;
                i44 = (i7211 & i7210) | (i7210 ^ i7211);
                obj = objArr[1];
            }
            strArr5 = (String[]) obj;
            int i39113 = 888 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
            int i39114 = -View.getDefaultSize(0, 0);
            Object[] objArr7115 = new Object[1];
            a(i39113, ((i39114 | 16) << 1) - (i39114 ^ 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr7115);
            Object[] objArr7116 = {(String) objArr7115[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char edgeSlop7 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 33602);
                int modifierMetaStateMask6 = 3084 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iLastIndexOf9 = 25 - TextUtils.lastIndexOf(str5, '0', 0, 0);
                byte b3116 = (byte) (-1);
                byte b3117 = (byte) (-b3116);
                Object[] objArr7117 = new Object[1];
                c(b3116, b3117, (byte) (b3117 - 1), objArr7117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop7, modifierMetaStateMask6, iLastIndexOf9, 1411172903, false, (String) objArr7117[0], new Class[]{String.class});
            }
            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7116);
            if (objInvoke2 == null) {
                i54 = 0;
            } else {
                Object[] objArr7118 = {objInvoke2, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cResolveOpacity4 = (char) Drawable.resolveOpacity(0, 0);
                    int iArgb13 = 3393 - Color.argb(0, 0, 0, 0);
                    int mode8 = 9 - View.MeasureSpec.getMode(0);
                    byte b3118 = (byte) (-1);
                    byte b3119 = (byte) (-b3118);
                    Object[] objArr7119 = new Object[1];
                    c(b3118, b3119, (byte) (b3119 - 1), objArr7119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity4, iArgb13, mode8, 1203525406, false, (String) objArr7119[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7118)).longValue();
                long j7111 = 1417205932;
                long j828 = 988;
                long j829 = jLongValue115 ^ j3;
                long jUptimeMillis4 = (int) SystemClock.uptimeMillis();
                long j8210 = jUptimeMillis4 ^ j3;
                long j8211 = (((long) 989) * j7111) + (((long) (-987)) * jLongValue115) + (((((j829 | j8210) | j7111) ^ j3) | (((j7111 | jLongValue115) | jUptimeMillis4) ^ j3)) * j828) + (((long) (-988)) * (j7111 | j829)) + (j828 * (((jLongValue115 | (j8210 | j7111)) ^ j3) | (((j7111 ^ j3) | j829) ^ j3) | ((jUptimeMillis4 | j829) ^ j3))) + ((long) (-1419275809));
                int i39115 = TuitionPaymentFragmentbindingInflater1;
                int i401110 = (i39115 ^ 13) + ((i39115 & 13) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i401110 % 128;
                int i401111 = i401110 % 2;
                int iMyUid6 = Process.myUid();
                int i401112 = (~(414862745 | iMyUid6)) | 1715774020;
                int i401113 = ~iMyUid6;
                int i401114 = ((int) (j8211 >> 32)) & (185402198 + ((i401112 | (~((-278547610) | i401113))) * 886) + (((~(i401113 | (-414862746))) | 1852089156) * (-1772)) + ((~(i401113 | 1852089156)) * 886));
                int iElapsedRealtime7 = (int) SystemClock.elapsedRealtime();
                int i401115 = ((int) j8211) & (((((~((-2016316297) | iElapsedRealtime7)) | 1242142021) * 398) - 1721423783) + (((~((~iElapsedRealtime7) | (-2016316297))) | 1242142021) * 398));
                i54 = (i401114 & i401115) | (i401114 ^ i401115);
            }
            if (i54 != 1986687685) {
                i55 = i44;
            } else {
                i55 = i44;
            }
            Object[] objArr81110 = new Object[1];
            a(TextUtils.getTrimmedLength(str5) + 1950, 13 - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))), (char) (25114 - (~(ViewConfiguration.getScrollBarFadeDuration() >> 16))), objArr81110);
            String str3112 = (String) objArr81110[0];
            int i401116 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1962;
            int iResolveOpacity9 = Drawable.resolveOpacity(0, 0);
            int i401117 = ~iResolveOpacity9;
            int i401118 = ~(((-6) & i40) | ((-6) ^ i40));
            int i401119 = (((iResolveOpacity9 * (-947)) + 4745) - (~(-(-(((i401118 & i401117) | (i401117 ^ i401118)) * (-948)))))) - 1;
            int i411110 = (i401117 & (-6)) | (i401117 ^ (-6));
            int i411111 = (~((i411110 & i15) | (i411110 ^ i15))) * (-948);
            Object[] objArr81111 = new Object[1];
            a(i401116, (i401119 & i411111) + (i401119 | i411111) + ((iResolveOpacity9 | (-6)) * 948), (char) TextUtils.getTrimmedLength(str5), objArr81111);
            int windowTouchSlop7 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1968;
            int i411112 = -View.resolveSizeAndState(0, 0, 0);
            int iTuitionPaymentFragmentbindingInflater110 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
            int i411113 = i411112 * (-947);
            int i411114 = ((i411113 | 14235) << 1) - (i411113 ^ 14235);
            int i411115 = ~i411112;
            int i411116 = (i411114 - (~(-(-(((~((-16) | iTuitionPaymentFragmentbindingInflater110)) | i411115) * (-948)))))) - 1;
            int i411117 = (~((~iTuitionPaymentFragmentbindingInflater110) | (i411115 & (-16)) | (i411115 ^ (-16)))) * (-948);
            Object[] objArr81112 = new Object[1];
            a(windowTouchSlop7, (((i411116 ^ i411117) + ((i411117 & i411116) << 1)) - (~(((i411112 & (-16)) | (i411112 ^ (-16))) * 948))) - 1, (char) View.combineMeasuredStates(0, 0), objArr81112);
            String str3113 = (String) objArr81112[0];
            int size7 = 1983 - View.MeasureSpec.getSize(0);
            int threadPriority12 = Process.getThreadPriority(0);
            int i411118 = (((threadPriority12 | 20) << 1) - (threadPriority12 ^ 20)) >> 6;
            int i411119 = (i411118 * 714) - 13528;
            int i421110 = ~i411118;
            int i421111 = ~((i421110 & i15) | (i421110 ^ i15));
            int i421112 = ~i411118;
            int i421113 = ~((i421112 & 19) | (i421112 ^ 19));
            int i421114 = (i421111 & i421113) | (i421111 ^ i421113);
            int i421115 = (i411118 & (-20)) | ((-20) ^ i411118);
            int i421116 = (i421115 & i40) | (i421115 ^ i40);
            int i421117 = ~i421116;
            int i421118 = ((i421114 & i421117) | (i421114 ^ i421117)) * (-713);
            int i421119 = ((i411119 | i421118) << 1) - (i411119 ^ i421118);
            int i431110 = -(-((~i421116) * 1426));
            Object[] objArr81113 = new Object[1];
            a(size7, (((i421119 ^ i431110) + ((i431110 & i421119) << 1)) - (~((~(((-20) ^ length) | ((-20) & length))) * 713))) - 1, (char) (27852 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr81113);
            String str3114 = (String) objArr81113[0];
            int i431111 = 2001 - (~Color.alpha(0));
            int i431112 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
            int i431113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr81114 = new Object[1];
            a(i431111, i431112, (char) ((i431113 ^ 1) + ((i431113 & 1) << 1)), objArr81114);
            int i431114 = 2015 - (~TextUtils.indexOf(str5, str5, 0));
            int i431115 = -(-Process.getGidForName(str5));
            Object[] objArr81115 = new Object[1];
            a(i431114, (i431115 & 22) + (i431115 | 22), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr81115);
            String str3115 = (String) objArr81115[0];
            int i431116 = -(-(ViewConfiguration.getTapTimeout() >> 16));
            Object[] objArr81116 = new Object[1];
            a((i431116 ^ 2037) + ((i431116 & 2037) << 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr81116);
            Object[] objArr81117 = new Object[1];
            a(2046 - (~(-(-Color.blue(0)))), ExpandableListView.getPackedPositionGroup(0L) + 11, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr81117);
            String str3116 = (String) objArr81117[0];
            int longPressTimeout8 = 587 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i431117 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i431118 = -TextUtils.getOffsetBefore(str5, 0);
            Object[] objArr81118 = new Object[1];
            a(longPressTimeout8, (i431117 & 6) + (i431117 | 6), (char) (((i431118 | 20075) << 1) - (i431118 ^ 20075)), objArr81118);
            int i431119 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i441110 = ((i431119 | 9) << 1) - (i431119 ^ 9);
            TuitionPaymentFragmentbindingInflater1 = i441110 % 128;
            int i441111 = i441110 % 2;
            int i441112 = -Color.alpha(0);
            int i441113 = (i441112 ^ 2058) + ((i441112 & 2058) << 1);
            int i441114 = -TextUtils.getTrimmedLength(str5);
            Object[] objArr81119 = new Object[1];
            a(i441113, ((i441114 | 28) << 1) - (i441114 ^ 28), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr81119);
            String str3117 = (String) objArr81119[0];
            int i441115 = -View.resolveSize(0, 0);
            Object[] objArr91110 = new Object[1];
            a(((i441115 | 2037) << 1) - (i441115 ^ 2037), 9 - (~(Process.myPid() >> 22)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr91110);
            strArr6 = new String[][]{new String[]{str3112, (String) objArr81111[0]}, new String[]{str3113, str3114, (String) objArr81114[0]}, new String[]{str3115, (String) objArr81116[0]}, new String[]{str3116, (String) objArr81118[0]}, new String[]{str3117, (String) objArr91110[0]}};
            i56 = 0;
            i57 = -1;
            loop7: while (true) {
                if (i56 < 5) {
                    i58 = i40;
                    break;
                }
                int i441116 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i71 = (i441116 ^ 115) + ((i441116 & 115) << 1);
                TuitionPaymentFragmentbindingInflater1 = i71 % 128;
                if (i71 % 2 != 0) {
                    strArr7 = strArr6[i56];
                    str8 = strArr7[1];
                } else {
                    strArr7 = strArr6[i56];
                    str8 = strArr7[0];
                }
                strArr8 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                length2 = strArr8.length;
                i72 = 0;
                while (true) {
                    if (i72 < length2) {
                        i57++;
                        bytes2 = strArr8[i72].getBytes();
                        length3 = bytes2.length;
                        if (length3 == 0) {
                            bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str8));
                            i74 = 4096;
                            bArr4 = new byte[4096];
                            strArr9 = strArr6;
                            strArr10 = strArr8;
                            i75 = 0;
                            i76 = 0;
                            while (true) {
                                i77 = bufferedInputStream8.read(bArr4, i75, i74);
                                if (i77 > 0) {
                                    break;
                                    break;
                                }
                                i78 = 0;
                                while (i76 < length3) {
                                    int i441117 = i77;
                                    if (bArr4[i78] == bytes2[i76]) {
                                        int i441118 = (i76 & (-84)) + (i76 | (-84));
                                        i76 = (i441118 & 85) + (i441118 | 85);
                                    } else {
                                        if (i76 != 0) {
                                            i79 = i76 - 1;
                                            while (true) {
                                                if (i79 > 0) {
                                                    str9 = str8;
                                                    i73 = length2;
                                                    bArr5 = bArr4;
                                                    i76 = 0;
                                                    break;
                                                    break;
                                                }
                                                i80 = 0;
                                                while (true) {
                                                    str9 = str8;
                                                    if (i80 < i79) {
                                                        i73 = length2;
                                                        bArr5 = bArr4;
                                                        z4 = true;
                                                        z5 = true;
                                                        break;
                                                    }
                                                    int iTuitionPaymentFragmentbindingInflater111 = WrapContentLinearLayoutManager.TuitionPaymentFragmentbindingInflater1();
                                                    i73 = length2;
                                                    int i441119 = 489030064 + ((68747265 | (~((1617212370 ^ iTuitionPaymentFragmentbindingInflater111) | (1617212370 & iTuitionPaymentFragmentbindingInflater111)))) * 576);
                                                    int i451110 = (~iTuitionPaymentFragmentbindingInflater111) | 1617212370;
                                                    int i451111 = ((~((i451110 ^ 1683587459) | (i451110 & 1683587459))) | 1614840194) * 576;
                                                    int i451112 = (i441119 ^ i451111) + ((i441119 & i451111) << 1);
                                                    i81 = ((i451112 | 943718976) << 1) - (943718976 ^ i451112);
                                                    int i451113 = -(-(((-9217025) | i15) * (-369)));
                                                    i82 = ((-130864018) & i451113) + ((-130864018) | i451113) + ((2121472894 | (~(1854842126 | length))) * (-369));
                                                    i83 = ~(((-1854842127) ^ i40) | ((-1854842127) & i40));
                                                    int i451114 = (1854842126 ^ i15) | (1854842126 & i15);
                                                    i84 = i451114 ^ 2121472894;
                                                    i85 = i451114 & 2121472894;
                                                    bArr5 = bArr4;
                                                    if (i81 > (i82 - (~(-(-((((1845625102 ^ i83) | (1845625102 & i83)) | (~(i84 | i85))) * 369))))) - 1) {
                                                        b = bytes2[i80];
                                                        i86 = i76 % i79;
                                                    } else {
                                                        b = bytes2[i80];
                                                        int i451115 = -i79;
                                                        i86 = ((i76 | i451115) << 1) - (i451115 ^ i76);
                                                    }
                                                    if (b != bytes2[i86 + i80]) {
                                                        z4 = true;
                                                        z5 = false;
                                                        break;
                                                    }
                                                    int i451116 = (i80 ^ (-64)) + ((i80 & (-64)) << 1);
                                                    i80 = (i451116 & 65) + (i451116 | 65);
                                                    str8 = str9;
                                                    length2 = i73;
                                                    bArr4 = bArr5;
                                                }
                                                if ((!z5) != z4) {
                                                    i76 = i79;
                                                    break;
                                                    break;
                                                }
                                                i79 = (-2) - (~i79);
                                                str8 = str9;
                                                length2 = i73;
                                                bArr4 = bArr5;
                                            }
                                        }
                                        i77 = i441117;
                                        str8 = str9;
                                        length2 = i73;
                                        bArr4 = bArr5;
                                    }
                                    str9 = str8;
                                    i73 = length2;
                                    bArr5 = bArr4;
                                    i78 = (i78 | 1) + (i78 & 1);
                                    i77 = i441117;
                                    str8 = str9;
                                    length2 = i73;
                                    bArr4 = bArr5;
                                }
                                str8 = str8;
                                length2 = length2;
                                bArr4 = bArr4;
                                i75 = 0;
                                i74 = 4096;
                                if (bufferedInputStream8 != null) {
                                    bufferedInputStream8.close();
                                }
                                i72++;
                                strArr6 = strArr9;
                                strArr8 = strArr10;
                                str8 = str9;
                                length2 = i73;
                            }
                            str9 = str8;
                            i73 = length2;
                            if (i76 == length3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bufferedInputStream8.close();
                            if (z3) {
                                i72++;
                                strArr6 = strArr9;
                                strArr8 = strArr10;
                                str8 = str9;
                                length2 = i73;
                            }
                        }
                        int i451117 = (i57 & 170) + (i57 | 170);
                        i58 = (i451117 & length) | ((~i451117) & i40);
                        break loop7;
                    }
                    i56 = (i56 & (-103)) + (i56 | (-103)) + 104;
                    strArr6 = strArr6;
                }
            }
            int i451118 = (~(i40 & i55)) & (i40 | i55);
            int i451119 = -i451118;
            int i461110 = ((i451118 & i451119) | (i451118 ^ i451119)) >> 31;
            int i461111 = (i58 & (~i461110)) | (i55 & i461110);
            int i461112 = -TextUtils.indexOf(str5, str5, 0);
            int i461113 = (i461112 & 2086) + (i461112 | 2086);
            int i461114 = -TextUtils.indexOf(str5, str5);
            int i461115 = (i461114 ^ 13) + ((i461114 & 13) << 1);
            int i461116 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr91111 = new Object[1];
            a(i461113, i461115, (char) ((i461116 & 11706) + (i461116 | 11706)), objArr91111);
            str7 = (String) objArr91111[0];
            Object[] objArr91112 = new Object[1];
            a(2098 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0))), 7 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (char) View.resolveSize(0, 0), objArr91112);
            bytes = ((String) objArr91112[0]).getBytes();
            length = bytes.length;
            if (length != 0) {
                bufferedInputStream7 = new BufferedInputStream(new FileInputStream(str7));
                bArr3 = new byte[4096];
                i62 = 0;
                while (true) {
                    i63 = bufferedInputStream7.read(bArr3, 0, 4096);
                    if (i63 > 0) {
                        break;
                        break;
                    }
                    i64 = 0;
                    while (i62 < length) {
                        i65 = TuitionPaymentFragmentbindingInflater1;
                        int i461117 = (i65 ^ 87) + ((i65 & 87) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i461117 % 128;
                        int i461118 = i461117 % 2;
                        if (i64 < i63) {
                            break;
                            break;
                        }
                        if (bArr3[i64] == bytes[i62]) {
                            i66 = (i65 ^ 89) + ((i65 & 89) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i66 % 128;
                            if (i66 % 2 == 0) {
                                i62 += 90;
                            } else {
                                i62++;
                            }
                        } else if (i62 != 0) {
                            i67 = i62 - 1;
                            while (true) {
                                if (i67 > 0) {
                                    i62 = 0;
                                    break;
                                    break;
                                }
                                i68 = 0;
                                while (true) {
                                    if (i68 < i67) {
                                        i69 = 1;
                                        z2 = true;
                                        break;
                                    }
                                    int i461119 = -i67;
                                    i70 = (i62 ^ i461119) + ((i461119 & i62) << 1);
                                    if (bytes[i68] != bytes[((i70 | i68) << 1) - (i70 ^ i68)]) {
                                        i69 = 1;
                                        z2 = false;
                                        break;
                                    }
                                    int i47124 = (i68 ^ (-107)) + ((i68 & (-107)) << 1);
                                    i68 = ((i47124 | 108) << 1) - (i47124 ^ 108);
                                }
                                if (!z2) {
                                    int i47125 = TuitionPaymentFragmentbindingInflater1 + 99;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i47125 % 128;
                                    int i47126 = i47125 % 2;
                                    i62 = i67;
                                    break;
                                    break;
                                }
                                int i47127 = ((i67 | 3) << i69) - (i67 ^ 3);
                                i67 = (i47127 & (-4)) + (i47127 | (-4));
                            }
                        }
                        i64 = (i64 | 1) + (i64 & 1);
                    }
                    i59 = i40 & (-152);
                    i60 = length & 151;
                    i61 = i59 | i60;
                    int i47111110 = ((~i461111) & i40) | (i461111 & length);
                    int i47111111 = -i47111110;
                    int i47111112 = ((i47111110 & i47111111) | (i47111110 ^ i47111111)) >> 31;
                    int i47111113 = i61 & (~i47111112);
                    int i47111114 = i461111 & i47111112;
                    int i47111115 = (i47111113 & i47111114) | (i47111113 ^ i47111114);
                    int i481111113 = 2106 - (~(-(-Color.red(0))));
                    int i481111114 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i481111115 = -Color.green(0);
                    Object[] objArr91113 = new Object[1];
                    a(i481111113, ((i481111114 | 47) << 1) - (i481111114 ^ 47), (char) (((i481111115 | 30402) << 1) - (i481111115 ^ 30402)), objArr91113);
                    Object[] objArr91114 = {(String) objArr91113[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c114 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iArgb14 = Color.argb(0, 0, 0, 0) + 993;
                        int doubleTapTimeout11 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                        byte b31110 = (byte) (-1);
                        Object[] objArr91115 = new Object[1];
                        c(b31110, (byte) (b31110 & 6), (byte) 0, objArr91115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c114, iArgb14, doubleTapTimeout11, -545305915, false, (String) objArr91115[0], new Class[]{String.class});
                    }
                    long jLongValue116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr91114)).longValue();
                    long j81112 = -275856909;
                    long j81113 = jLongValue116 ^ j3;
                    long j81114 = 933;
                    long j81115 = (((long) 934) * j81112) + (((long) (-932)) * jLongValue116) + (((long) (-933)) * ((((j81112 ^ j3) | j50) ^ j3) | j81113)) + ((((j81113 | j81112) ^ j3) | ((j81113 | j50) ^ j3)) * j81114) + (j81114 * ((jLongValue116 | j81112) ^ j3)) + ((long) 896316193);
                    int i481111116 = ((int) (j81115 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                    int i481111117 = ((int) j81115) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                    int i481111118 = ((i481111116 & i481111117) | (i481111116 ^ i481111117)) * 263;
                    int i481111119 = i40 ^ i47111115;
                    int i4811111110 = -i481111119;
                    int i4811111111 = ((i481111119 & i4811111110) | (i481111119 ^ i4811111110)) >> 31;
                    i41 = (i47111115 & i4811111111) | (((i481111118 & length) | ((~i481111118) & i40)) & (~i4811111111));
                    strArr3 = strArr5;
                }
                if (i62 == length) {
                    z = true;
                } else {
                    z = false;
                }
                bufferedInputStream7.close();
                if (!z) {
                    length = length;
                    i61 = i40;
                    int i47111116 = ((~i461111) & i40) | (i461111 & length);
                    int i47111117 = -i47111116;
                    int i47111118 = ((i47111116 & i47111117) | (i47111116 ^ i47111117)) >> 31;
                    int i47111119 = i61 & (~i47111118);
                    int i471111110 = i461111 & i47111118;
                    int i471111111 = (i47111119 & i471111110) | (i47111119 ^ i471111110);
                    int i4811111112 = 2106 - (~(-(-Color.red(0))));
                    int i4811111113 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i4811111114 = -Color.green(0);
                    Object[] objArr91116 = new Object[1];
                    a(i4811111112, ((i4811111113 | 47) << 1) - (i4811111113 ^ 47), (char) (((i4811111114 | 30402) << 1) - (i4811111114 ^ 30402)), objArr91116);
                    Object[] objArr91117 = {(String) objArr91116[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c115 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iArgb15 = Color.argb(0, 0, 0, 0) + 993;
                        int doubleTapTimeout12 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                        byte b31111 = (byte) (-1);
                        Object[] objArr91118 = new Object[1];
                        c(b31111, (byte) (b31111 & 6), (byte) 0, objArr91118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c115, iArgb15, doubleTapTimeout12, -545305915, false, (String) objArr91118[0], new Class[]{String.class});
                    }
                    long jLongValue117 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr91117)).longValue();
                    long j81116 = -275856909;
                    long j81117 = jLongValue117 ^ j3;
                    long j81118 = 933;
                    long j81119 = (((long) 934) * j81116) + (((long) (-932)) * jLongValue117) + (((long) (-933)) * ((((j81116 ^ j3) | j50) ^ j3) | j81117)) + ((((j81117 | j81116) ^ j3) | ((j81117 | j50) ^ j3)) * j81118) + (j81118 * ((jLongValue117 | j81116) ^ j3)) + ((long) 896316193);
                    int i4811111115 = ((int) (j81119 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
                    int i4811111116 = ((int) j81119) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
                    int i4811111117 = ((i4811111115 & i4811111116) | (i4811111115 ^ i4811111116)) * 263;
                    int i4811111118 = i40 ^ i471111111;
                    int i4811111119 = -i4811111118;
                    int i48111111110 = ((i4811111118 & i4811111119) | (i4811111118 ^ i4811111119)) >> 31;
                    i41 = (i471111111 & i48111111110) | (((i4811111117 & length) | ((~i4811111117) & i40)) & (~i48111111110));
                    strArr3 = strArr5;
                }
            }
            i59 = i40 & (-151);
            length = length;
            i60 = length & 150;
            i61 = i59 | i60;
            int i471111112 = ((~i461111) & i40) | (i461111 & length);
            int i471111113 = -i471111112;
            int i471111114 = ((i471111112 & i471111113) | (i471111112 ^ i471111113)) >> 31;
            int i471111115 = i61 & (~i471111114);
            int i471111116 = i461111 & i471111114;
            int i471111117 = (i471111115 & i471111116) | (i471111115 ^ i471111116);
            int i48111111111 = 2106 - (~(-(-Color.red(0))));
            int i48111111112 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            int i48111111113 = -Color.green(0);
            Object[] objArr91119 = new Object[1];
            a(i48111111111, ((i48111111112 | 47) << 1) - (i48111111112 ^ 47), (char) (((i48111111113 | 30402) << 1) - (i48111111113 ^ 30402)), objArr91119);
            Object[] objArr911110 = {(String) objArr91119[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c116 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iArgb16 = Color.argb(0, 0, 0, 0) + 993;
                int doubleTapTimeout13 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8;
                byte b31112 = (byte) (-1);
                Object[] objArr911111 = new Object[1];
                c(b31112, (byte) (b31112 & 6), (byte) 0, objArr911111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c116, iArgb16, doubleTapTimeout13, -545305915, false, (String) objArr911111[0], new Class[]{String.class});
            }
            long jLongValue118 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr911110)).longValue();
            long j811110 = -275856909;
            long j811111 = jLongValue118 ^ j3;
            long j811112 = 933;
            long j811113 = (((long) 934) * j811110) + (((long) (-932)) * jLongValue118) + (((long) (-933)) * ((((j811110 ^ j3) | j50) ^ j3) | j811111)) + ((((j811111 | j811110) ^ j3) | ((j811111 | j50) ^ j3)) * j811112) + (j811112 * ((jLongValue118 | j811110) ^ j3)) + ((long) 896316193);
            int i48111111114 = ((int) (j811113 >> 32)) & ((-580421150) + (((~((-996682471) | i40)) | 440543940) * (-366)) + (((~((-556269603) | i40)) | 131072) * 366));
            int i48111111115 = ((int) j811113) & ((-139306050) + ((~((-33660929) | length)) * (-783)) + (((~(1479280207 | length)) | (-1378460679)) * 783));
            int i48111111116 = ((i48111111114 & i48111111115) | (i48111111114 ^ i48111111115)) * 263;
            int i48111111117 = i40 ^ i471111117;
            int i48111111118 = -i48111111117;
            int i48111111119 = ((i48111111117 & i48111111118) | (i48111111117 ^ i48111111118)) >> 31;
            i41 = (i471111117 & i48111111119) | (((i48111111116 & length) | ((~i48111111116) & i40)) & (~i48111111119));
            strArr3 = strArr5;
        } else {
            i40 = i;
            length = i35;
            i41 = i37;
            strArr3 = null;
        }
        int i7212 = ((~i41) & i40) | (i41 & length);
        int i7213 = -i7212;
        Object[] objArr1519 = {new int[]{i729 ^ (i729 << 5)}, new int[]{i41}, null, new int[]{i40}, strArr3};
        int i7214 = -(-(1086412321 + (((-2689044) | length) * 494) + (((~(1557460356 | length)) | (-1346219156)) * 494) + ((((i7212 & i7213) | (i7212 ^ i7213)) >> 31) & 16)));
        int i7215 = ((i3 | i7214) << 1) - (i3 ^ i7214);
        int i7216 = i7215 << 13;
        int i7217 = (i7216 | i7215) & (~(i7215 & i7216));
        int i7218 = i7217 >>> 17;
        int i7219 = ((~i7217) & i7218) | ((~i7218) & i7217);
        return objArr1519;
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("\u0081{yÀpÑkòb»]\u0083T\u009bO¨F°AB8]3w*|%;\u001c\u0015\u0017 \u000e0\u0006Ö\u0001Ñø÷óçê»å\u0087Ü´×µÎGÉQ±³I\b@\u0019[:RsmKdS\u007f`vxq\u008a\b\u0095\u0003¿\u001a´\u0015ó,Ì'å>ì6\t1#È(Ã,Ú^Õ_ìxçx\u0081¹y\u0002p\u0013k0by]ATYOjFrA\u00808\u009f3µ*¾%ù\u001cÅ\u0017ÿ\u000eø\u0006\u0005\u0095Dmèdò\u007fÈv\u0084I¶@¤[\u009fR\u009eUw,n'\u0014>L14\b'\u0003\u001f\u001a\r\u0012ò\u0015øìÓçôþ¹ñªÈ\u008fÃ\u009fÚ~ÝyÔB±³I\t@\b[/RsmHd[\u007f\"vlq\u009e\b\u0093\u0003¼\u008d~uÄ|Ågân¾Q\u0092X\u0098C¬JÿMQ4C?n&aâÏ\u001ac\u0013d\bS\u0001A>\"7$,_%2\"Ö[ÍPßIÖFµ\u007f\u0084t\u0091m\u0094eq±³I\b@\u001d[8R=m\u0003d\u0012\u007fovlq\u0099\b\u0095\u0003¢\u001aº\u0015Ãµ\u009eMsD\"_^VCi3`8{Rr\u001euù\fè\u0007Î\u001eÃ\u0011µ(¨#£:\u00822y5xÌcÇHÞ2Ñ?èMÇÔ?96h-\u0014$\t\u001by\u0012r\t\u0018\u0000T\u0007³~¢u\u0084l\u0089cÿZâQéHÈ@3G2¾)µ\u0002¬x£u\u009a\u0004K\u007f³ÓºÉ¡ó¨ä\u0097\u0085\u009e\u009d\u0085ï\u008c¼\u008bIòRù/à|ï\tÖ\u0012Ý.Ä2Ì\u008eËÃ2ï±þI\u0005@\u001b[\"R3mT±³I\u001f@\u0005[?R(mIdQ\u007f#v~q\u0085\b\u0092\u0003ã\u001a²\u0015É,Ñ'ù>Ê6!1QÈ\"Ã9ÚAÕIì!ç\u007fþ\u0083ù\u0092ð¸\u008b®\u0082Ã\u009dÐ±³I\u001f@\u0005[?R(mIdQ\u007f#v~q\u0085\b\u0092\u0003ã\u001a²\u0015É,Ñ'ù>Ê6!1QÈ<Ã.ÚCÕL±³I\u001f@\u0005[?R(mIdQ\u007f#vpq\u0085\b\u009e\u0003ã\u001a°\u0015Å,Þ'â>ù6\u00011\tÈ\u001aÃ\u0011Ú\\ÕNìcçlþÂù\u008fð£ýÊ\u0005q\f`\u0017C\u001e\n!;( 3\u0018:\u0010=òDðOÐVÖY¡±îI\u0003@R[.R)mEdP\u007fhv2q\u0084\b\u0093\u0003¿\u001a¨±òI\t@\u001d[?R9m\u0002dR\u007fivh±³I\u001c@\u000e[#R?m\u0003dZ\u007fevpq\u0089\b\u008f\u0003µ\u001a¯\u0015Ø,Ù'á>ï!XÙ£Ð»Ë\u0093Â\u0085ýàF÷¾\u001a·K¬%¥7\u009aZ\u0093A\u0088`\u0081f\u0086\u0081ÿËô¸í¤âÛÛÐÐóÉäÁ\u0016Æ\u0011? 47-P\"W[=£ÏªÔ±ó±ìI\t@\u000e[?R5m_dH\u007f\"voq\u0095\b\u008f\u0003â\u001a¾\u0015È,\u0092'è>ù6\u000e1\tÈ+ÃrÚKÕLìyç2þ\u008aù\u009dð§\u008b¹\u0082ó\u009dÛ\u0094ü¯é§3¾\u000e¹)°2KHBY]~Tyo\u009e±ìI\t@\u000e[?R5m_dH\u007f\"voq\u0095\b\u008f\u0003â\u001a¾\u0015È,\u0092'è>ù6\u000e1\tÈ+ÃrÚKÕLìyç2þ\u008aù\u009dð§\u008b¹\u0082ó\u009dÛ\u0094ü¯é§3¾\n¹)°2KHBS]~±ìI\t@\u000e[?R5m_dH\u007f\"voq\u0095\b\u008f\u0003â\u001a¾\u0015È,\u0092'è>ù6\u000e1\tÈ+ÃrÚ^ÕSì\"ç\u007fþ\u009dù\u0095±ìI\t@\u000e[?R5m_dH\u007f\"voq\u0095\b\u008f\u0003â\u001a¾\u0015È,\u0092'è>ù6\u000e1\tÈ+ÃrÚ^ÕSì\"çpþ\u008dù\u009f±ìI\t@\u000e[?R5m_dH\u007f\"voq\u0095\b\u008f\u0003â\u001a¾\u0015È,\u0092'è>ù6\u000e1\tÈ+ÃrÚ^ÕSì\"çqþ\u008fù\u009f²ôJ\u0011C\u0016X'Q-nGgP|:uwr\u008d\u000b\u0097\u0000ú\u0019¦\u0016Ð/\u008a$ð=á5\u00162\u0011Ë3ÀjÙFÖKï:äiý\u009aú\u0087ÿ\u0081\u0007e\u000ex\u0015_\u001cD#!±³I\u001c@\u000e[#R?m\u0003dQ\u007fcvxq\u0099\b\u0090\u0003©\u001a¯%ôÝ\u0010Ô\rÏ*Æ%ùGðGëaâv±³I\u001f@\u0005[?R(mIdQ\u007f#vzq\u009e\b\u009d\u0003¡\u001a¹\u0015Û,Ó'þ>÷6C1\u000bÈ%Ã2ÚHÕSì{çoþÁù\u008fðµ\u008b¯\u0082Ø\u009dÙ\u0094á¯Ã§\u001f¾\u0019¹>°*KIBN]\"Tvo\u008df\u008eß\u009c'5.65\r<\u0017\u0003l\na\u0011\f\u0018_\u001fªf±mÕtÇ{¬BûIÔP\u009cX\"_&¦\u0007\u00ad\u001a´l»=\u0082S\u0089A\u0090ª\u0097¾\u009e\u0082å\u0081ìúó½úÔÁÚÉ-Ð7×\fÞ\u0004%p,=3P:\\\u009aèbAkBpyycF\u0018O\u0015Tx]+ZÞ#Å(¡1³>Ø\u0007\u008f\f \u0015è\u001d_\u001aPãtèhñ\u001aþ\u0017Ç8Ì4ÕÒÒÕÛ¹ ð©\u009e¶\u0089¿³\u0084¨\u008c@\u0095T\u00929\u009bt`\u0018a¹\u0099\u0015\u0090\u000f\u008b5\u0082\"½C´[¯)¦z¡\u008fØ\u0094ÓðÊâÅ\u0089üÕ÷êîùæ\u0013á\u0012\u0018\u0019\u00137\nO\u0005R<j7I.\u008f)\u0098 ²[³RÔMÐDç\u007fõw\u0003n[i%`&\u009bV\u0092\u0018\u008du\u0084y±³I\t@\b[/RsmEdR\u007fevhqÃ\b\u0095\u0003¢\u001aµ\u0015Ø,\u0092'ï>ð6\u00031\tÈ(Ã/ÚIÕNìzçuþ\u008fù\u0099ðâ\u008b®\u0082Ïû^\u0003\u008c\n\u0097\u0011°\u0018´'Æ.Í5à<ö;\u0007±éI\u0002@\u0017[\"R3m[dR\u0081;yÀpÊkçbõ]\u0081T\u008dO¥¸¯@BI\u0013R}[od\u0002m\u0019v8\u007f>xÙ\u0001\u0093\né\u0013ø\u001c\u009b%\u0094.®7¸\u008dñu\u0015|\bg/n\u007fQ\u0001XWw*\u008fØ\u0086Ã\u009dø\u0094ÿ«\u0094¢\u008e¡\u001aYèPóKÈBÏ}¤t¾o²f\u0085a5\u0018+ê\u0092\u0012`\u001b{\u0000@\tG6,?6$:-\r*½S£XúA\u0083Nñ±îI\u0003@R[<R.mCdX\u007fyv\u007fq\u0098\bÒ\u0003¡\u001a³\u0015È,Ù'à±ïI\b@\u0017±ùI\u0001@\t[ R=mXdS\u007f~n\u0092\u0096S\u009fC\u0084#\u008dA²\u0016»\u001d 7©:®Î×ÖÜ£ÅõÊ\u008có\u0081øãá\u0090éKîA\u0017l\u001c~\u0005\u0006±ÝI\u0002@\u0018[>R3mEdX\u007f,vOq¨\b·\u0003ì\u001a¾\u0015Ù,Õ'à>è6L1\u001aÈ#Ã.Ú\fÕDì4ç*´\u0080L_EE^cWnh\u0018a\u0005zqs\u0012tõ\rê\u0006±\u001fã\u0010\u0084)\u0088\"½;µ3\u00114GÍ~ÆsßQÐ\u0019éiâwûîü\u0097õ¥±îI\u0003@R[$R=m^dX\u007f{v}q\u009e\b\u0099±ûI\u0003@\u0010[(R:mEdO\u007fd$\u0085ÜaÕ|Î[Ç\u000bøu\u0001½ù^ðAë|âgÝ\nkÒ\u0093?\u009an\u0081\u0000\u0088\u0012·\u007f¾d¥E¬C«¤ÒîÙ\u0092À\u0092ÏñöîýÔåU\u001d¸\u0014é\u000f\u009c\u0006\u00829å0é+Ò\"Ë%y\\6W\u0012N\nAb±\u00adý±\u0005\\\f\r\u0017`\u001ef!\u0010(\u00163!:&±¬±îI\u0003@R[.R)mEdP\u007fhv2q\u009c\b\u008e\u0003£\u001a¸\u0015Ù,ß'ø¸j@\u0089I\u0080R°[\u0093dÄm\u0094vªNg¶\u008a¿Û¤§\u00ad \u0092Ì\u009bÙ\u0080á\u0089»\u008e\u0003÷\u001cü+å2ê@ÓGØuÁgÉ\u008cÎ\u009b7±@K¸¹±¢ª\u0099£\u009e\u009cõ\u0095ï\u008e\u0093\u0087ß\u00808ù'òSë\u000bäyÝbÖYÏ^ÇµÀ¯±ûI\t@\u0012[)R.mEd_\u007fSvdqÔ\bÊ\u0003ã\u001a¯\u0015È,×'Ó>ä6T1JÈcÃ;ÚIÕRìiçnþ\u0085ù\u009fð\u0093\u008b¤\u0082\u0094\u009d\u008a±ûI\t@\u0012[)R.mEd_\u007f#v{q\u0083\b\u0093\u0003«\u001a°\u0015É,ã'ÿ>ø6\u00071SÈ+Ã9ÚBÕYì~çuþ\u008f±ûI\t@\u0012[)R.mEd_\u007f#vjq\u008e\b\u0093\u0003´\u001aä\u0015\u009a,Ì'£>ê6\u000e1\u0013È4ÃdÚ\u001aÕL±ûI\u0003@\u0013[+R0mId\u0013\u007f\u007fvxq\u0087\b£\u0003«\u001a¬\u0015Ä,Ó'â>ù631\u0004ÈtÃjÚ\u0003Õ[ìiçrþ\u0089ù\u008eð¥\u008b¿\u0082ó\u009dÄ\u0094´¯ª±îI\u0003@R[.R3mCdH\u007f`vsq\u008d\b\u0098\u0003©\u001a®¼ÐD=MlV\u0010_\r`}ivr[{O|³\u0005¥\u000e\u0097\u0017Ì\u0018ð!÷*Û3Î;6<lÅ\u0014Î\u000b×|ØeáWêPó¢ô°ý\u009b\u0086\u008c\u008fæ±ÝI\u0002@\u0018[>R3mEdX\u007f!vdqÔ\bÊJ¾²S»\u0002 ~©y\u0096\u0015\u009f\u0000\u00848\u008db\u008aØóÅøïáüî\u0090×\u008dÜ¥ÅâÍUÊHRòª\u0013£\u0015¸\"±k\u008bKs¼z«a\u0086hÌWá^ôEÑL\u008cK#2'9\u001f \u0017/?\u0016r\u001d@\u0004M\f¢\u000b±\u00adìU\b\\\u0010G8NsqExJc#jpm\u008c\u0014\u0094\u001f£\u0006¶\tÈ0Ä;þ9ÛÁ?È'Ó\u000fÚDåiìl÷\u0014þLù»\u0080¡\u008b\u009f\u0092µ\u009dù¤ë¯×¶Ï¾(¹+±íI\t@\u0011[9Rrm_dZ\u007f\"vpq\u008f\b\u0098\u0003\u0093\u001a¸\u0015É,Ò'ÿ>õ6\u00181\u0005±îI\u0003@R['R9m^dR\u007fivpqÂ\b\u009d\u0003¢\u001a¸\u0015Þ,Ó'å>ø6B1\rÈ)Ã1ÚYÕX&\u0087Þj×;ÌGÅZú*ó!èKá\u0004æà\u009fø\u0094Ð\u008d\u009b\u0082¤»£°\u0081©ª¡k¦t_HTP±îI\u0003@R[#R8mAd\u0012\u007fnviq\u0085\b\u0090\u0003¨\u001aò\u0015Ê,Õ'â>û6\t1\u000eÈ<Ã.ÚEÕRìx\u0094\u001elóe¢~ÌwÞH³A¨Z\u0089S\u008fTh-\"&^?Y05\t \u0002\u0018\u001bB\u0013ú\u0014åíÒæËÿ¹ð¾É\u008cÂ\u009eÛuÜbÕH±îI\u0003@R[?R%m_dH\u007fivqqÂ\b\u009e\u0003¹\u001aµ\u0015À,Ø'¢>ú6\u00051\u0012È+Ã9Ú^ÕLì~çuþ\u0082ù\u0088±îI\u0003@R[?R%m_dH\u007fivqq³\b\u0099\u0003´\u001a¨\u0015\u0082,Þ'ù>õ6\u00001\u0018ÈbÃ:ÚEÕRìkçyþ\u009eù\u008cð¾\u008bµ\u0082Â\u009dÈÇ\b?å6´-Ü$ß\u001b¤\u0012¾\t\u0085\u0000\u0088\u0007$~xu_lSc&Z>QDH\u001c@ãGô¾Íµß¬¸£ª\u009a\u0098\u0091\u0093\u0088d\u008fn±îI\u0003@R[:R9mBdX\u007fcvnq³\b\u0098\u0003 \u001a·\u0015Á,\u0092'î>é6\u00051\u0010È(ÃrÚJÕUìbç{þ\u0089ù\u008eð¼\u008b®\u0082Å\u009dÒ\u0094ø-_±°IL±¦±µ±³I\b@\u0019[:Rsm]dY\u007faviq³\b\u008c\u0003¥\u001a¬\u0015É±³I\b@\u0019[:Rsm_dS\u007fovwq\u0089\b\u0088\u0003ã\u001a¾\u0015Í,Ï'é>þ6\r1\u0012È(Ã\u0003ÚKÕYìbçeþ\u0088±³I\b@\u0019[:Rsm_dS\u007fovwq\u0089\b\u0088\u0003ã\u001a»\u0015É,Ò'õ>øì¬\u0014\u0017\u001d\u0006\u0006%\u000fl0@9L\"p+h,\u0096U\u0097^üG²HÖqÎzæcç±³I\u001f@\u0005[?Rsm]dY\u007faviq³\b\u0088\u0003¾\u001a½\u0015Ï,Ùr¾\u008a\u0012\u0083\b\u00982\u0091%®D§\\¼.µ}²\u0088Ë\u0093ÀîÙ½ÖÈïÓäâýÎõ\fò\u0010\u000b-\u0000=\u0019N\u0016R/^$u=\u0084:\u00933´H¶Aþ^ÀWälüd\u0014}_z2s>£Ò[iRxI[@\u0012\u007f/v.m\u0019d\"cê\u001aí\u0011Þ±³I\b@\u0019[:RsmNdO\u007fxvCq\u0098\b\u0095\u0003¡\u001a¹l\u0007\u0094¼\u009d\u00ad\u0086\u008e\u008fÇ°ë¹ç¢Û«Ã¬=Õ<ÞWÇ\nÈkñ|ú^ãGë´ì¬\u0015\u009d\u001e\u009a\u0007üÈù0U9O\"u+b\u0014\u0003\u001d\u001b\u0006i\u000f:\bÏqÔz©cúl\u008fU\u0094^¤G¥ORHP±iºz£\u0002¬\u0013\u00954\u009e\t\u0087Ì\u0080Ø\u0089ïò¸û\u0095ä\u0099±³I\b@\u0019[:RsmNdO\u007fxv}q\u008f\b\u009f\u0003©±³I\b@\u0019[:RsmNdO\u007fxv{q\u0095\b\u008e\u0003£±³I\b@\u0019[:RsmNdO\u007fxvqq\u0089\b\u009b\u0003¢\u0090\u0088h3a\"z\u0001sHLuEt^CWHP¥)®\"\u0092q\u0098\u0089#\u00802\u009b\u0011\u0092X\u00ade¤d¿S¶A±ªÈ¤Ã\u0080rÆ\u008a}\u0083l\u0098O\u0091\u0006®;§:¼\rµ\u0019²þËèÀÐÙÙÖº±³I\b@\u0019[:RsmNdO\u007fxvCq\u0085\b\u0091\u0003©\u001b.ã\u0095ê\u0080ñ¥ø Ç\u009eÎÅÕþÜöÛ\u001f¢\r©>° ¿U\u0086R\u008d>\u0094/\u009c\u0089\u009b\u0083bþi£pÂ\u007fÕFú±³I\u0001@\u0012[8Rsm[dU\u007fbvxq\u0083\b\u008b\u0003¿\u001aó\u0015î,Ï'ø>Ï6\u00041\u001dÈ>Ã9ÚHÕzìcçpþ\u0088ù\u0099ð¾Ó¨+\u0007\"\u0015980$\u000f\u0018\u0006N\u001dx\u0014w\u0013\u0098j\u0095a£x´±¬I\n@\u001a[lRf±³I\u001c@\u000e[#R?m\u0003dO\u007fivpq\u008a\bÓ\u0003¡\u001a½\u0015Ü,ÏÝ5%Ð,Ó7î>þ\u0001\u008d\b\u0091\u0013ì\u001aµ\u001dMd^ofvty\u000b@\u0001K*R|ZÑ]Ý±ðI\u0005@\u001e[\u000bR\u0010mido\u007fSv~q\u009f\b\u0088\u0003â\u001a¯\u0015Ã±³I\t@\b[/RsmAdY\u007fhvuq\u008d\b£\u0003¯\u001a³\u0015È,Ù'ï>ï6B1\u0004È!Ã0±þI\u0000@\t[)R/mXd]\u007fovwq\u009f±³I\t@\b[/RsmAdS\u007fyvrq\u0098\b\u008f±³I\b@\u001d[8R=m\u0003dX\u007fcvkq\u0082\b\u0090\u0003£\u001a½\u0015È,Ï'£>²6\b1\fÈcÃ=Ú\\ÕLì\u007fç2þ\u0094ù\u0091ð \u009c\td¦m´v\u0099\u007f\u0085@¹IåRÆ[Ó\\?%(.\u00107\t±ÛI\u0003@\u0010[(R:mEdO\u007fdÇq?Ê6ß-ú$ÿ\u001bÁ\u0012\u0093\t§\u0000\u00ad\u0007M~\u0011u~llc\u0001Z\u0018Q'H2@ËGÍ¾¡µý¬\u009b£\u008c\u009aá\u0091î\u0088\u0001\u008f]\u0086aýsô@ë\u0013â'Ù=ÑÜÈÑÏøÆ÷=\u009c4\u008a+à\"³\u0019K\u0010S\u0017{\u000ew\u0005\u0003|\u001b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2764110787672295788L;
    }

    private static String $$e(short s, byte b, byte b2) {
        int i = (b * 3) + 109;
        byte[] bArr = $$c;
        int i2 = s * 4;
        int i3 = b2 + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = (-i) + i4;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3 + 1;
            i = (-bArr[i7]) + i;
            i3 = i7;
            i5 = i6;
        }
    }
}
