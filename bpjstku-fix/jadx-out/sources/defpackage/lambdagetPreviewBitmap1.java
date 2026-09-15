package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0013B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"LlambdagetPreviewBitmap1;", "Lkotlin/collections/AbstractList;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "p0", "", "p1", "<init>", "([Lokio/ByteString;[I)V", "b", "[Lokio/ByteString;", "", "getSize", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "[I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class lambdagetPreviewBitmap1 extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final ByteString[] b;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private lambdagetPreviewBitmap1(ByteString[] byteStringArr, int[] iArr) {
        this.b = byteStringArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.b.length;
    }

    /* JADX INFO: renamed from: lambdagetPreviewBitmap1$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0011\u001a\u00020\u00142\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0015"}, d2 = {"LlambdagetPreviewBitmap1$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "LRotationProviderListenerWrapper;", "p1", "", "p2", "", "Lokio/ByteString;", "p3", "p4", "p5", "p6", "", "b", "(JLRotationProviderListenerWrapper;ILjava/util/List;IILjava/util/List;)V", "", "LlambdagetPreviewBitmap1;", "([Lokio/ByteString;)LlambdagetPreviewBitmap1;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        private Companion() {
        }

        @JvmStatic
        public final lambdagetPreviewBitmap1 b(ByteString... p0) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (p0.length == 0) {
                return new lambdagetPreviewBitmap1(new ByteString[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List<? extends ByteString> mutableList = ArraysKt.toMutableList(p0);
            CollectionsKt.sort(mutableList);
            int size = mutableList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(-1);
            }
            ArrayList arrayList2 = arrayList;
            int length = p0.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                arrayList2.set(CollectionsKt.binarySearch$default(mutableList, p0[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (mutableList.get(0).TuitionPaymentFragmentspecialinlinedviewModeldefault3() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                ByteString byteString = mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    ByteString byteString2 = mutableList.get(i6);
                    Intrinsics.checkNotNullParameter(byteString, "");
                    if (!byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, byteString, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
                        break;
                    }
                    if (byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                        throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(byteString2)).toString());
                    }
                    if (arrayList2.get(i6).intValue() > arrayList2.get(i4).intValue()) {
                        mutableList.remove(i6);
                        arrayList2.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            b(0L, rotationProviderListenerWrapper, 0, mutableList, 0, mutableList.size(), arrayList2);
            int i7 = (int) (rotationProviderListenerWrapper.size / 4);
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = rotationProviderListenerWrapper.INotificationSideChannelStubProxy();
            }
            Object[] objArrCopyOf = Arrays.copyOf(p0, p0.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            return new lambdagetPreviewBitmap1((ByteString[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private final void b(long p0, RotationProviderListenerWrapper p1, int p2, List<? extends ByteString> p3, int p4, int p5, List<Integer> p6) throws IOException {
            int i;
            int i2;
            int i3;
            int i4 = p2;
            if (p4 >= p5) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i5 = p4; i5 < p5; i5++) {
                if (p3.get(i5).TuitionPaymentFragmentspecialinlinedviewModeldefault3() < i4) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = p3.get(p4);
            ByteString byteString2 = p3.get(p5 - 1);
            if (i4 == byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                int iIntValue = p6.get(p4).intValue();
                int i6 = p4 + 1;
                ByteString byteString3 = p3.get(i6);
                i = i6;
                i2 = iIntValue;
                byteString = byteString3;
            } else {
                i = p4;
                i2 = -1;
            }
            if (byteString.b(i4) == byteString2.b(i4)) {
                int iMin = Math.min(byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                int i7 = 0;
                for (int i8 = i4; i8 < iMin && byteString.b(i8) == byteString2.b(i8); i8++) {
                    i7++;
                }
                long j = p0 + (p1.size / 4) + 2 + ((long) i7) + 1;
                p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-i7);
                p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
                int i9 = i7 + i4;
                while (i4 < i9) {
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString.b(i4) & UByte.MAX_VALUE);
                    i4++;
                }
                if (i + 1 != p5) {
                    RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((int) ((rotationProviderListenerWrapper.size / 4) + j)) * (-1));
                    b(j, rotationProviderListenerWrapper, i9, p3, i, p5, p6);
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper);
                    return;
                }
                if (i9 != p3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p6.get(i).intValue());
                return;
            }
            int i10 = 1;
            for (int i11 = i + 1; i11 < p5; i11++) {
                if (p3.get(i11 - 1).b(i4) != p3.get(i11).b(i4)) {
                    i10++;
                }
            }
            long j2 = p0 + (p1.size / 4) + 2 + ((long) (i10 * 2));
            p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i10);
            p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
            for (int i12 = i; i12 < p5; i12++) {
                byte b = p3.get(i12).b(i4);
                if (i12 == i || b != p3.get(i12 - 1).b(i4)) {
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(b & UByte.MAX_VALUE);
                }
            }
            RotationProviderListenerWrapper rotationProviderListenerWrapper2 = new RotationProviderListenerWrapper();
            int i13 = i;
            while (i13 < p5) {
                byte b2 = p3.get(i13).b(i4);
                int i14 = i13 + 1;
                int i15 = i14;
                while (true) {
                    if (i15 >= p5) {
                        i3 = p5;
                        break;
                    } else {
                        if (b2 != p3.get(i15).b(i4)) {
                            i3 = i15;
                            break;
                        }
                        i15++;
                    }
                }
                if (i14 == i3 && i4 + 1 == p3.get(i13).TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p6.get(i13).intValue());
                } else {
                    p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(((int) ((rotationProviderListenerWrapper2.size / 4) + j2)) * (-1));
                    b(j2, rotationProviderListenerWrapper2, i4 + 1, p3, i13, i3, p6);
                }
                i13 = i3;
                rotationProviderListenerWrapper2 = rotationProviderListenerWrapper2;
            }
            p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper2);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 8905680;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            return i3;
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return this.b[i];
    }

    public /* synthetic */ lambdagetPreviewBitmap1(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    public static final lambdagetPreviewBitmap1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString... byteStringArr) {
        return INSTANCE.b(byteStringArr);
    }
}
