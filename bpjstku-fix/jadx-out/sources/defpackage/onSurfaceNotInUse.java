package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0013\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"LonSurfaceNotInUse;", "LgetOutputTransform;", "LPreviewStreamStateObserver2;", "p0", "LgetDisplayManager;", "p1", "", "p2", "LcreateImageAnalysis;", "p3", "<init>", "(LPreviewStreamStateObserver2;LgetDisplayManager;Ljava/lang/String;LcreateImageAnalysis;)V", "", "decodeElementIndex", "(LcreateImageAnalysis;)I", "", "decodeNotNullMark", "()Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(LcreateImageAnalysis;I)Ljava/lang/String;", "LisTransformationInfoReady;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)LisTransformationInfoReady;", "LsetActiveRecording;", "beginStructure", "(LcreateImageAnalysis;)LsetActiveRecording;", "", "endStructure", "(LcreateImageAnalysis;)V", "asInterface", "LgetDisplayManager;", "()LgetDisplayManager;", "LcreateImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "b", "TuitionPaymentFragmentbindingInflater1", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
class onSurfaceNotInUse extends getOutputTransform {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final getDisplayManager TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ onSurfaceNotInUse(PreviewStreamStateObserver2 previewStreamStateObserver2, getDisplayManager getdisplaymanager, String str, createImageAnalysis createimageanalysis, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(previewStreamStateObserver2, getdisplaymanager, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : createimageanalysis);
    }

    @Override // defpackage.getOutputTransform
    /* JADX INFO: renamed from: asInterface, reason: from getter and merged with bridge method [inline-methods] */
    public getDisplayManager g() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onSurfaceNotInUse(PreviewStreamStateObserver2 previewStreamStateObserver2, getDisplayManager getdisplaymanager, String str, createImageAnalysis createimageanalysis) {
        super(previewStreamStateObserver2, getdisplaymanager, str, null);
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(getdisplaymanager, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getdisplaymanager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis;
    }

    public int decodeElementIndex(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        while (this.b < p0.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            int i = this.b;
            this.b = i + 1;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, i);
            int i2 = this.b - 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            if (!g().containsKey(strTuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                boolean z = (TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.a || p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2) || !p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2).d()) ? false : true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
                if (!z) {
                    continue;
                }
            }
            if (((getOutputTransform) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.d) {
                PreviewStreamStateObserver2 previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2);
                createImageAnalysis createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2);
                if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault1 || createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d() || !(TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentspecialinlinedviewModeldefault1) instanceof PreviewView)) {
                    if (Intrinsics.areEqual(createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE) && (!createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d() || !(TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentspecialinlinedviewModeldefault1) instanceof PreviewView))) {
                        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        shouldReuseImplementation shouldreuseimplementation = istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation ? (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = shouldreuseimplementation != null ? getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldreuseimplementation) : null;
                        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3, previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            boolean z2 = !previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a && createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d();
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -3 || (!zTuitionPaymentFragmentspecialinlinedviewModeldefault1 && !z2)) {
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // defpackage.getOutputTransform, defpackage.ForwardingLiveData, defpackage.stopListeningToRotationEvents
    public boolean decodeNotNullMark() {
        return !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && super.decodeNotNullMark();
    }

    @Override // defpackage.setImageCaptureTargetSize
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2(createImageAnalysis p0, int p1) {
        Object next;
        Intrinsics.checkNotNullParameter(p0, "");
        attachToControllerIfReady attachtocontrollerifreadyB = PreviewViewExternalSyntheticLambda0.b(p0, TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        String strTuitionPaymentFragmentbindingInflater1 = p0.TuitionPaymentFragmentbindingInflater1(p1);
        if (attachtocontrollerifreadyB != null || (((getOutputTransform) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll && !g().keySet().contains(strTuitionPaymentFragmentbindingInflater1))) {
            Map<String, Integer> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0);
            Iterator<T> it = g().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.get((String) next);
                if (num != null && num.intValue() == p1) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = attachtocontrollerifreadyB != null ? attachtocontrollerifreadyB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, strTuitionPaymentFragmentbindingInflater1) : null;
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        }
        return strTuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.getOutputTransform
    protected isTransformationInfoReady TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (isTransformationInfoReady) MapsKt.getValue(g(), p0);
    }

    @Override // defpackage.getOutputTransform, defpackage.ForwardingLiveData, defpackage.stopListeningToRotationEvents
    public setActiveRecording beginStructure(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            PreviewStreamStateObserver2 previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            onSurfaceNotInUse onsurfacenotinuse = this;
            isTransformationInfoReady istransformationinforeadyB = b();
            String iNotificationSideChannel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getINotificationSideChannel();
            if (istransformationinforeadyB instanceof getDisplayManager) {
                return new onSurfaceNotInUse(previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1, (getDisplayManager) istransformationinforeadyB, asBinder(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(getDisplayManager.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyB.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(iNotificationSideChannel);
            sb.append(" at element: ");
            sb.append(onsurfacenotinuse.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyB.toString());
        }
        return super.beginStructure(p0);
    }

    @Override // defpackage.getOutputTransform, defpackage.ForwardingLiveData, defpackage.setActiveRecording
    public void endStructure(createImageAnalysis p0) {
        Set<String> setPlus;
        Intrinsics.checkNotNullParameter(p0, "");
        if (((getOutputTransform) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || (p0.TuitionPaymentFragmentbindingInflater1() instanceof resolveInputTimebase)) {
            return;
        }
        attachToControllerIfReady attachtocontrollerifreadyB = PreviewViewExternalSyntheticLambda0.b(p0, TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        if (attachtocontrollerifreadyB == null && !((getOutputTransform) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.cancelAll) {
            Intrinsics.checkNotNullParameter(p0, "");
            setPlus = updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(p0);
        } else if (attachtocontrollerifreadyB != null) {
            setPlus = PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault1(), p0).keySet();
        } else {
            Intrinsics.checkNotNullParameter(p0, "");
            Set<String> setTuitionPaymentFragmentbindingInflater1 = updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(p0);
            PreviewStreamStateObserver2 previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            Map map = (Map) previewStreamStateObserver2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = SetsKt.emptySet();
            }
            setPlus = SetsKt.plus((Set) setTuitionPaymentFragmentbindingInflater1, (Iterable) setKeySet);
        }
        for (String str : g().keySet()) {
            if (!setPlus.contains(str) && !Intrinsics.areEqual(str, asBinder())) {
                String string = g().toString();
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(string, "");
                StringBuilder sb = new StringBuilder("Encountered an unknown key '");
                sb.append(str);
                sb.append("'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sb.append((Object) setScreenFlashOverlayColor.TuitionPaymentFragmentbindingInflater1(string, -1));
                throw setScreenFlashOverlayColor.b(-1, sb.toString());
            }
        }
    }
}
