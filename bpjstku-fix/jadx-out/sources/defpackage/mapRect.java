package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class mapRect {
    public final HashSet<ZoomGestureDetectorZoomEventMove<?>> TuitionPaymentFragmentbindingInflater1 = new HashSet<>();
    public final Map<String, ZoomGestureDetectorZoomEventMove<?>> b = new ConcurrentHashMap();
    public final Map<KClass<?>, ZoomGestureDetectorZoomEventMove<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ConcurrentHashMap();
    public final Map<KClass<?>, ArrayList<ZoomGestureDetectorZoomEventMove<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ConcurrentHashMap();
    public final HashSet<ZoomGestureDetectorZoomEventMove<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashSet<>();

    public final void TuitionPaymentFragmentbindingInflater1(ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove) throws DefinitionOverrideException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, zoomGestureDetectorZoomEventMove);
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentbindingInflater1();
        if (zoomGestureDetectorZoomEventMove.asInterface != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(zoomGestureDetectorZoomEventMove);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(zoomGestureDetectorZoomEventMove);
        }
        if (!zoomGestureDetectorZoomEventMove.d.isEmpty()) {
            b(zoomGestureDetectorZoomEventMove);
        }
        if (zoomGestureDetectorZoomEventMove.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(zoomGestureDetectorZoomEventMove);
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(HashSet<ZoomGestureDetectorZoomEventMove<?>> hashSet, ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove) throws DefinitionOverrideException {
        if (!hashSet.add(zoomGestureDetectorZoomEventMove) && !zoomGestureDetectorZoomEventMove.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new DefinitionOverrideException("Already existing definition or try to override an existing one: ".concat(String.valueOf(zoomGestureDetectorZoomEventMove)));
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable<isLenovoTablet> iterable) {
        Iterator<isLenovoTablet> it = iterable.iterator();
        while (it.hasNext()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(it.next());
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove) throws DefinitionOverrideException {
        mapPoint mappoint = zoomGestureDetectorZoomEventMove.asInterface;
        if (mappoint != null) {
            if (this.b.get(mappoint.toString()) != null && !zoomGestureDetectorZoomEventMove.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                StringBuilder sb = new StringBuilder("Already existing definition or try to override an existing one with qualifier '");
                sb.append(mappoint);
                sb.append("' with ");
                sb.append(zoomGestureDetectorZoomEventMove);
                sb.append(" but has already registered ");
                sb.append(this.b.get(mappoint.toString()));
                throw new DefinitionOverrideException(sb.toString());
            }
            this.b.put(mappoint.toString(), zoomGestureDetectorZoomEventMove);
            getFocusX.Companion companion = getFocusX.INSTANCE;
            isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.INFO) <= 0) {
                getFocusX.Companion companion2 = getFocusX.INSTANCE;
                isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                StringBuilder sb2 = new StringBuilder("bind qualifier:'");
                sb2.append(zoomGestureDetectorZoomEventMove.asInterface);
                sb2.append("' ~ ");
                sb2.append(zoomGestureDetectorZoomEventMove);
                issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.INFO, sb2.toString());
            }
        }
    }

    private final void b(ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove) {
        for (KClass<?> kClass : zoomGestureDetectorZoomEventMove.d) {
            ArrayList<ZoomGestureDetectorZoomEventMove<?>> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(kClass);
            if (arrayList == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put(kClass, new ArrayList<>());
                ArrayList<ZoomGestureDetectorZoomEventMove<?>> arrayList2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(kClass);
                if (arrayList2 == null) {
                    Intrinsics.throwNpe();
                }
                arrayList = arrayList2;
            }
            arrayList.add(zoomGestureDetectorZoomEventMove);
            getFocusX.Companion companion = getFocusX.INSTANCE;
            isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.INFO) <= 0) {
                getFocusX.Companion companion2 = getFocusX.INSTANCE;
                isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                StringBuilder sb = new StringBuilder("bind secondary type:'");
                sb.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass));
                sb.append("' ~ ");
                sb.append(zoomGestureDetectorZoomEventMove);
                issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.INFO, sb.toString());
            }
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove) throws DefinitionOverrideException {
        KClass<?> kClass = zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentbindingInflater1;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(kClass) != null && !zoomGestureDetectorZoomEventMove.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            StringBuilder sb = new StringBuilder("Already existing definition or try to override an existing one with type '");
            sb.append(kClass);
            sb.append("' and ");
            sb.append(zoomGestureDetectorZoomEventMove);
            sb.append(" but has already registered ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(kClass));
            throw new DefinitionOverrideException(sb.toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(kClass, zoomGestureDetectorZoomEventMove);
        getFocusX.Companion companion = getFocusX.INSTANCE;
        isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.compareTo(Level.INFO) <= 0) {
            getFocusX.Companion companion2 = getFocusX.INSTANCE;
            isSamsungFold2OrFold3 issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getFocusX.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            StringBuilder sb2 = new StringBuilder("bind type:'");
            sb2.append(setUsingCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClass));
            sb2.append("' ~ ");
            sb2.append(zoomGestureDetectorZoomEventMove);
            issamsungfold2orfold3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Level.INFO, sb2.toString());
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isLenovoTablet islenovotablet) throws DefinitionOverrideException {
        Iterator<T> it = islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (it.hasNext()) {
            TuitionPaymentFragmentbindingInflater1((ZoomGestureDetectorZoomEventMove) it.next());
        }
    }
}
