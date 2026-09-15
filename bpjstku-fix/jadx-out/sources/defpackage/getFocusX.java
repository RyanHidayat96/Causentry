package defpackage;

import defpackage.getFocusX;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LgetFocusX;", "", "<init>", "()V", "", "LisLenovoTablet;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/List;)LgetFocusX;", "LZoomGestureDetectorZoomEvent;", "TuitionPaymentFragmentbindingInflater1", "LZoomGestureDetectorZoomEvent;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 3, 0})
public final class getFocusX {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final ZoomGestureDetectorZoomEvent b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static isSamsungFold2OrFold3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new isOppoFoldable();

    private getFocusX() {
        this.b = new ZoomGestureDetectorZoomEvent();
    }

    public /* synthetic */ getFocusX(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final getFocusX TuitionPaymentFragmentspecialinlinedviewModeldefault1(final List<isLenovoTablet> p0) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.INFO) > 0) {
            List<isLenovoTablet> list = p0;
            this.b.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(list);
            return this;
        }
        Function0<Unit> function0 = new Function0<Unit>() { // from class: org.koin.core.KoinApplication$modules$duration$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                getFocusX.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0, p0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
        long jNanoTime = System.nanoTime();
        function0.invoke();
        double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
        int size = this.b.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.size();
        Collection<isUsingRotationDegrees> collectionValues = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.values();
        Intrinsics.checkExpressionValueIsNotNull(collectionValues, "");
        Collection<isUsingRotationDegrees> collection = collectionValues;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((isUsingRotationDegrees) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.size()));
        }
        int iSumOfInt = CollectionsKt.sumOfInt(arrayList);
        isSamsungFold2OrFold3 issamsungfold2orfold3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("total ");
        sb.append(size + iSumOfInt);
        sb.append(" registered definitions");
        issamsungfold2orfold3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.INFO, sb.toString());
        isSamsungFold2OrFold3 issamsungfold2orfold4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb2 = new StringBuilder("load modules in ");
        sb2.append(dNanoTime);
        sb2.append(" ms");
        issamsungfold2orfold4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.INFO, sb2.toString());
        return this;
    }

    /* JADX INFO: renamed from: getFocusX$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u0005\u0010\u000b"}, d2 = {"LgetFocusX$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LgetFocusX;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LgetFocusX;", "LisSamsungFold2OrFold3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LisSamsungFold2OrFold3;", "()LisSamsungFold2OrFold3;", "(LisSamsungFold2OrFold3;)V", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isSamsungFold2OrFold3 issamsungfold2orfold3) {
            getFocusX.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = issamsungfold2orfold3;
        }

        public static isSamsungFold2OrFold3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return getFocusX.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @JvmStatic
        public static getFocusX TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            getFocusX getfocusx = new getFocusX(null);
            mapPoints mappoints = getfocusx.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            FileTransformFactory fileTransformFactory = getfocusx.b.b;
            mappoints.b.put(fileTransformFactory.TuitionPaymentFragmentbindingInflater1, fileTransformFactory);
            return getfocusx;
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFocusX getfocusx, Iterable iterable) {
        getfocusx.b.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Iterable<isLenovoTablet>) iterable);
        getfocusx.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iterable);
    }
}
