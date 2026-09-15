package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.error.BadScopeInstanceException;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.error.ScopeNotCreatedException;

/* JADX INFO: loaded from: classes4.dex */
public final class getProviderType<T> extends SurfaceViewStretchedQuirk<T> {
    private final Map<String, T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public getProviderType(ZoomGestureDetectorZoomEventMove<T> zoomGestureDetectorZoomEventMove) {
        super(zoomGestureDetectorZoomEventMove);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ConcurrentHashMap();
    }

    @Override // defpackage.SurfaceViewStretchedQuirk
    public final <T> T b(ScreenFlashUiInfo screenFlashUiInfo) throws BadScopeInstanceException, ScopeNotCreatedException, InstanceCreationException {
        if (screenFlashUiInfo.b == null) {
            throw new IllegalStateException("ScopeDefinitionInstance has no registered Koin instance".toString());
        }
        if (Intrinsics.areEqual(screenFlashUiInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1, screenFlashUiInfo.b.b)) {
            StringBuilder sb = new StringBuilder("No scope instance created to resolve ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            throw new ScopeNotCreatedException(sb.toString());
        }
        FileTransformFactory fileTransformFactory = screenFlashUiInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fileTransformFactory == null) {
            throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
        }
        ZoomGestureDetectorZoomEventMove<T> zoomGestureDetectorZoomEventMoveTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        isUsingRotationDegrees isusingrotationdegrees = fileTransformFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        mapPoint mappoint = zoomGestureDetectorZoomEventMoveTuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder;
        if (!Intrinsics.areEqual(mappoint, (Object) null)) {
            StringBuilder sb2 = new StringBuilder("Can't use definition ");
            sb2.append(zoomGestureDetectorZoomEventMoveTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb2.append(" defined for scope '");
            sb2.append(mappoint);
            sb2.append("', with an open scope instance ");
            sb2.append(fileTransformFactory);
            sb2.append(". Use a scope instance with scope '");
            sb2.append(mappoint);
            sb2.append('\'');
            throw new BadScopeInstanceException(sb2.toString());
        }
        String str = fileTransformFactory.TuitionPaymentFragmentbindingInflater1;
        T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(str);
        if (t != null) {
            return t;
        }
        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(screenFlashUiInfo);
        Map<String, T> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            map.put(str, tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        StringBuilder sb3 = new StringBuilder("Instance creation from ");
        sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        sb3.append(" should not be null");
        throw new IllegalStateException(sb3.toString().toString());
    }
}
