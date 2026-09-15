package defpackage;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes7.dex */
public final class PreviewViewDisplayRotationListener extends isOutputSizeEqual implements createTransformedBitmap {
    private final getRemainingRotationDegrees TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private stopListeningToDisplayChange asBinder;
    private final PreviewStreamStateObserver2 asInterface;
    private final setScreenFlashWindow b;
    private final PreviewViewImplementationOnSurfaceNotInUseListener d;
    private final WriteMode g;

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final Void decodeNull() {
        return null;
    }

    @Override // defpackage.createTransformedBitmap
    public final PreviewStreamStateObserver2 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.asInterface;
    }

    public PreviewViewDisplayRotationListener(PreviewStreamStateObserver2 previewStreamStateObserver2, WriteMode writeMode, stopListeningToDisplayChange stoplisteningtodisplaychange, createImageAnalysis createimageanalysis, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(writeMode, "");
        Intrinsics.checkNotNullParameter(stoplisteningtodisplaychange, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        this.asInterface = previewStreamStateObserver2;
        this.g = writeMode;
        this.asBinder = stoplisteningtodisplaychange;
        this.d = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getRemainingRotationDegrees getremainingrotationdegrees = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1 = getremainingrotationdegrees;
        this.b = getremainingrotationdegrees.a ? null : new setScreenFlashWindow(createimageanalysis);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        }
    }

    @Override // defpackage.setActiveRecording
    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.d;
    }

    @Override // defpackage.createTransformedBitmap
    public final isTransformationInfoReady TuitionPaymentFragmentbindingInflater1() {
        return new PreviewView1ExternalSyntheticLambda2(this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.asBinder).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x015c  */
    /* JADX WARN: Code duplicated, block: B:47:0x015d  */
    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final <T> T decodeSerializableValue(isBitDepthMatched<? extends T> isbitdepthmatched) {
        String message;
        shouldReuseImplementation shouldreuseimplementationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        try {
            if ((isbitdepthmatched instanceof setTargetOutputSize) && !this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface) {
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PreviewView1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((setTargetOutputSize) isbitdepthmatched).getDescriptor(), this.asInterface);
                String strB = this.asBinder.b(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
                if (strB == null) {
                    PreviewViewDisplayRotationListener previewViewDisplayRotationListener = this;
                    if ((isbitdepthmatched instanceof setTargetOutputSize) && !previewViewDisplayRotationListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface) {
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = PreviewView1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(((setTargetOutputSize) isbitdepthmatched).getDescriptor(), previewViewDisplayRotationListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentbindingInflater1 = previewViewDisplayRotationListener.TuitionPaymentFragmentbindingInflater1();
                        String iNotificationSideChannel = ((setTargetOutputSize) isbitdepthmatched).getDescriptor().getINotificationSideChannel();
                        if (istransformationinforeadyTuitionPaymentFragmentbindingInflater1 instanceof getDisplayManager) {
                            getDisplayManager getdisplaymanager = (getDisplayManager) istransformationinforeadyTuitionPaymentFragmentbindingInflater1;
                            isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) getdisplaymanager.get(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                            try {
                                isBitDepthMatched isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = deriveVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3((setTargetOutputSize) isbitdepthmatched, previewViewDisplayRotationListener, (istransformationinfoready == null || (shouldreuseimplementationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(istransformationinfoready)) == null) ? null : getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldreuseimplementationTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                Intrinsics.checkNotNull(isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                                return (T) PreviewViewScaleType.TuitionPaymentFragmentbindingInflater1(previewViewDisplayRotationListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), strTuitionPaymentFragmentspecialinlinedviewModeldefault4, getdisplaymanager, isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            } catch (SerializationException e2) {
                                String message2 = e2.getMessage();
                                Intrinsics.checkNotNull(message2);
                                throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, message2, getdisplaymanager.toString());
                            }
                        }
                        StringBuilder sb = new StringBuilder("Expected ");
                        sb.append(Reflection.getOrCreateKotlinClass(getDisplayManager.class).getSimpleName());
                        sb.append(", but had ");
                        sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentbindingInflater1.getClass()).getSimpleName());
                        sb.append(" as the serialized body of ");
                        sb.append(iNotificationSideChannel);
                        sb.append(" at element: ");
                        sb.append(this.asBinder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentbindingInflater1.toString());
                    }
                    return isbitdepthmatched.deserialize(previewViewDisplayRotationListener);
                }
                try {
                    isBitDepthMatched isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault4 = deriveVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3((setTargetOutputSize) isbitdepthmatched, this, strB);
                    Intrinsics.checkNotNull(isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    return (T) isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault4.deserialize(this);
                } catch (SerializationException e3) {
                    String message3 = e3.getMessage();
                    Intrinsics.checkNotNull(message3);
                    String strRemoveSuffix = StringsKt.removeSuffix(StringsKt.substringBefore$default(message3, '\n', (String) null, 2, (Object) null), (CharSequence) ".");
                    String message4 = e3.getMessage();
                    Intrinsics.checkNotNull(message4);
                    stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(this.asBinder, strRemoveSuffix, 0, StringsKt.substringAfter(message4, '\n', ""), 2);
                    throw new KotlinNothingValueException();
                }
                message = e.getMessage();
                Intrinsics.checkNotNull(message);
                if (StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                    throw e;
                }
                List<String> missingFields = e.getMissingFields();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e.getMessage());
                sb2.append(" at path: ");
                sb2.append(this.asBinder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                throw new MissingFieldException(missingFields, sb2.toString(), e);
            }
            return isbitdepthmatched.deserialize(this);
        } catch (MissingFieldException e4) {
            message = e4.getMessage();
            Intrinsics.checkNotNull(message);
            if (StringsKt.contains$default((CharSequence) message, (CharSequence) "at path", false, 2, (Object) null)) {
                throw e4;
            }
            List<String> missingFields2 = e4.getMissingFields();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e4.getMessage());
            sb3.append(" at path: ");
            sb3.append(this.asBinder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            throw new MissingFieldException(missingFields2, sb3.toString(), e4);
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final setActiveRecording beginStructure(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        WriteMode writeModeTuitionPaymentFragmentbindingInflater1 = getPreview.TuitionPaymentFragmentbindingInflater1(this.asInterface, createimageanalysis);
        lambdaonSurfaceRequested1androidxcameraviewPreviewView1 lambdaonsurfacerequested1androidxcameraviewpreviewview1 = this.asBinder.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i = lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1 + 1;
        lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1 = i;
        if (i == lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length) {
            lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i] = createimageanalysis;
        this.asBinder.TuitionPaymentFragmentbindingInflater1(writeModeTuitionPaymentFragmentbindingInflater1.begin);
        if (this.asBinder.INotificationSideChannel() != 4) {
            int i2 = PreviewViewDisplayRotationListener$b$WhenMappings.$EnumSwitchMapping$0[writeModeTuitionPaymentFragmentbindingInflater1.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return new PreviewViewDisplayRotationListener(this.asInterface, writeModeTuitionPaymentFragmentbindingInflater1, this.asBinder, createimageanalysis, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return (this.g == writeModeTuitionPaymentFragmentbindingInflater1 && this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a) ? this : new PreviewViewDisplayRotationListener(this.asInterface, writeModeTuitionPaymentFragmentbindingInflater1, this.asBinder, createimageanalysis, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(this.asBinder, "Unexpected leading comma", 0, null, 6);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.setActiveRecording
    public final void endStructure(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        if (this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() == 0) {
            while (decodeElementIndex(createimageanalysis) != -1) {
            }
        }
        if (this.asBinder.cancelAll() && !this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify) {
            setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, "");
            throw new KotlinNothingValueException();
        }
        this.asBinder.TuitionPaymentFragmentbindingInflater1(this.g.end);
        lambdaonSurfaceRequested1androidxcameraviewPreviewView1 lambdaonsurfacerequested1androidxcameraviewpreviewview1 = this.asBinder.TuitionPaymentFragmentbindingInflater1;
        int i = lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1;
        int[] iArr = lambdaonsurfacerequested1androidxcameraviewpreviewview1.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
        int i2 = lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1;
        if (i2 != -1) {
            lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1 = i2 - 1;
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final boolean decodeNotNullMark() {
        setScreenFlashWindow setscreenflashwindow = this.b;
        return (setscreenflashwindow == null || !setscreenflashwindow.TuitionPaymentFragmentbindingInflater1) && !this.asBinder.TuitionPaymentFragmentbindingInflater1(true);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.setActiveRecording
    public final <T> T decodeSerializableElement(createImageAnalysis createimageanalysis, int i, isBitDepthMatched<? extends T> isbitdepthmatched, T t) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        boolean z = this.g == WriteMode.MAP && (i & 1) == 0;
        if (z) {
            lambdaonSurfaceRequested1androidxcameraviewPreviewView1 lambdaonsurfacerequested1androidxcameraviewpreviewview1 = this.asBinder.TuitionPaymentFragmentbindingInflater1;
            int[] iArr = lambdaonsurfacerequested1androidxcameraviewpreviewview1.b;
            int i2 = lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1;
            if (iArr[i2] == -2) {
                lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2] = lambdaonSurfaceRequested1androidxcameraviewPreviewView1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
            }
        }
        T t2 = (T) super.decodeSerializableElement(createimageanalysis, i, isbitdepthmatched, t);
        if (z) {
            lambdaonSurfaceRequested1androidxcameraviewPreviewView1 lambdaonsurfacerequested1androidxcameraviewpreviewview2 = this.asBinder.TuitionPaymentFragmentbindingInflater1;
            int[] iArr2 = lambdaonsurfacerequested1androidxcameraviewpreviewview2.b;
            int i3 = lambdaonsurfacerequested1androidxcameraviewpreviewview2.TuitionPaymentFragmentbindingInflater1;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                lambdaonsurfacerequested1androidxcameraviewpreviewview2.TuitionPaymentFragmentbindingInflater1 = i4;
                if (i4 == lambdaonsurfacerequested1androidxcameraviewpreviewview2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length) {
                    lambdaonsurfacerequested1androidxcameraviewpreviewview2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
            Object[] objArr = lambdaonsurfacerequested1androidxcameraviewpreviewview2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i5 = lambdaonsurfacerequested1androidxcameraviewpreviewview2.TuitionPaymentFragmentbindingInflater1;
            objArr[i5] = t2;
            lambdaonsurfacerequested1androidxcameraviewpreviewview2.b[i5] = -2;
        }
        return t2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x020c A[EDGE_INSN: B:104:0x020c->B:138:0x027e BREAK  A[LOOP:1: B:89:0x01a4->B:153:?]] */
    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis createimageanalysis) {
        String strB;
        boolean z;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i = PreviewViewDisplayRotationListener$b$WhenMappings.$EnumSwitchMapping$0[this.g.ordinal()];
        char c = ':';
        boolean zCancelAll = false;
        int i2 = 0;
        zCancelAll = false;
        int i3 = -1;
        boolean z2 = true;
        if (i == 2) {
            int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            boolean z3 = i4 % 2 != 0;
            if (!z3) {
                this.asBinder.TuitionPaymentFragmentbindingInflater1(':');
            } else if (i4 != -1) {
                zCancelAll = this.asBinder.cancelAll();
            }
            if (this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                if (z3) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != -1) {
                        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
                        int i5 = stoplisteningtodisplaychange.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!zCancelAll) {
                            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, "Expected comma after the key-value pair", i5, null, 4);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        stopListeningToDisplayChange stoplisteningtodisplaychange2 = this.asBinder;
                        int i6 = stoplisteningtodisplaychange2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (zCancelAll) {
                            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange2, "Unexpected leading comma", i6, null, 4);
                            throw new KotlinNothingValueException();
                        }
                    }
                }
                i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            } else {
                if (zCancelAll && !this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify) {
                    setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, "object");
                    throw new KotlinNothingValueException();
                }
                i3 = -1;
            }
        } else if (i != 4) {
            boolean zCancelAll2 = this.asBinder.cancelAll();
            if (this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i7 != -1 && !zCancelAll2) {
                    stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(this.asBinder, "Expected end of the array or comma", 0, null, 6);
                    throw new KotlinNothingValueException();
                }
                i3 = i7 + 1;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            } else if (zCancelAll2 && !this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify) {
                setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, "array");
                throw new KotlinNothingValueException();
            }
        } else {
            boolean zCancelAll3 = this.asBinder.cancelAll();
            while (true) {
                if (this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) {
                        strB = this.asBinder.asBinder();
                    } else {
                        strB = this.asBinder.b();
                    }
                    this.asBinder.TuitionPaymentFragmentbindingInflater1(c);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createimageanalysis, this.asInterface, strB);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -3) {
                        if (this.TuitionPaymentFragmentbindingInflater1.d) {
                            PreviewStreamStateObserver2 previewStreamStateObserver2 = this.asInterface;
                            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            createImageAnalysis createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault1 || createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d() || !this.asBinder.TuitionPaymentFragmentbindingInflater1(z2)) {
                                if (Intrinsics.areEqual(createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(), deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE) && ((!createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d() || !this.asBinder.TuitionPaymentFragmentbindingInflater1(false)) && (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1)) != null)) {
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3, previewStreamStateObserver2, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    boolean z4 = !previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.a && createimageanalysisTuitionPaymentFragmentspecialinlinedviewModeldefault3.d();
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == -3 && (zTuitionPaymentFragmentspecialinlinedviewModeldefault1 || z4)) {
                                        stopListeningToDisplayChange stoplisteningtodisplaychange3 = this.asBinder;
                                        if (stoplisteningtodisplaychange3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                            stoplisteningtodisplaychange3.b();
                                        } else {
                                            Intrinsics.checkNotNull(stoplisteningtodisplaychange3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                            stoplisteningtodisplaychange3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                                        }
                                    }
                                }
                            }
                            zCancelAll3 = this.asBinder.cancelAll();
                            z = false;
                        }
                        setScreenFlashWindow setscreenflashwindow = this.b;
                        if (setscreenflashwindow != null) {
                            getPreviewTargetSize getpreviewtargetsize = setscreenflashwindow.b;
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 < 64) {
                                getpreviewtargetsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 |= 1 << iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            } else {
                                int i8 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> 6) - 1;
                                long[] jArr = getpreviewtargetsize.b;
                                jArr[i8] = jArr[i8] | (1 << (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 63));
                            }
                        }
                        i3 = iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (!this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || !Intrinsics.areEqual(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, strB)) {
                                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strB);
                            } else {
                                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                                stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), 1555708622, new Object[]{this.asBinder, Boolean.valueOf(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1)}, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), -1555708619);
                            }
                        } else {
                            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), 1555708622, new Object[]{this.asBinder, Boolean.valueOf(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1)}, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), -1555708619);
                        }
                        zCancelAll3 = this.asBinder.cancelAll();
                    }
                    c = ':';
                    z2 = true;
                } else if (!zCancelAll3 || this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify) {
                    setScreenFlashWindow setscreenflashwindow2 = this.b;
                    if (setscreenflashwindow2 == null) {
                        i3 = -1;
                        break;
                    }
                    getPreviewTargetSize getpreviewtargetsize2 = setscreenflashwindow2.b;
                    int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = getpreviewtargetsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    while (true) {
                        long j = getpreviewtargetsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (j == -1) {
                            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 64) {
                                i3 = -1;
                                break;
                            }
                            int length = getpreviewtargetsize2.b.length;
                            loop2: while (true) {
                                if (i2 >= length) {
                                    i3 = -1;
                                    break;
                                }
                                int i9 = i2 + 1;
                                long j2 = getpreviewtargetsize2.b[i2];
                                while (true) {
                                    if (j2 != -1) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << iNumberOfTrailingZeros;
                                        int i10 = iNumberOfTrailingZeros + (i9 * 64);
                                        if (getpreviewtargetsize2.TuitionPaymentFragmentbindingInflater1.invoke(getpreviewtargetsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Integer.valueOf(i10)).booleanValue()) {
                                            getpreviewtargetsize2.b[i2] = j2;
                                            i3 = i10;
                                            break;
                                        }
                                    } else {
                                        getpreviewtargetsize2.b[i2] = j2;
                                        i2 = i9;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            getpreviewtargetsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 |= 1 << iNumberOfTrailingZeros2;
                            if (getpreviewtargetsize2.TuitionPaymentFragmentbindingInflater1.invoke(getpreviewtargetsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Integer.valueOf(iNumberOfTrailingZeros2)).booleanValue()) {
                                i3 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, "object");
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (this.g != WriteMode.MAP) {
            lambdaonSurfaceRequested1androidxcameraviewPreviewView1 lambdaonsurfacerequested1androidxcameraviewpreviewview1 = this.asBinder.TuitionPaymentFragmentbindingInflater1;
            lambdaonsurfacerequested1androidxcameraviewpreviewview1.b[lambdaonsurfacerequested1androidxcameraviewpreviewview1.TuitionPaymentFragmentbindingInflater1] = i3;
        }
        return i3;
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final boolean decodeBoolean() {
        return this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final byte decodeByte() {
        long jTuitionPaymentFragmentbindingInflater1 = this.asBinder.TuitionPaymentFragmentbindingInflater1();
        byte b = (byte) jTuitionPaymentFragmentbindingInflater1;
        if (jTuitionPaymentFragmentbindingInflater1 == b) {
            return b;
        }
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
        StringBuilder sb = new StringBuilder("Failed to parse byte for input '");
        sb.append(jTuitionPaymentFragmentbindingInflater1);
        sb.append('\'');
        stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final short decodeShort() {
        long jTuitionPaymentFragmentbindingInflater1 = this.asBinder.TuitionPaymentFragmentbindingInflater1();
        short s = (short) jTuitionPaymentFragmentbindingInflater1;
        if (jTuitionPaymentFragmentbindingInflater1 == s) {
            return s;
        }
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
        StringBuilder sb = new StringBuilder("Failed to parse short for input '");
        sb.append(jTuitionPaymentFragmentbindingInflater1);
        sb.append('\'');
        stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final int decodeInt() {
        long jTuitionPaymentFragmentbindingInflater1 = this.asBinder.TuitionPaymentFragmentbindingInflater1();
        int i = (int) jTuitionPaymentFragmentbindingInflater1;
        if (jTuitionPaymentFragmentbindingInflater1 == i) {
            return i;
        }
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
        StringBuilder sb = new StringBuilder("Failed to parse int for input '");
        sb.append(jTuitionPaymentFragmentbindingInflater1);
        sb.append('\'');
        stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final long decodeLong() {
        return this.asBinder.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final float decodeFloat() {
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
        String strA = stoplisteningtodisplaychange.a();
        try {
            float f = Float.parseFloat(strA);
            if (this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel) {
                return f;
            }
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, Float.valueOf(f));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("Failed to parse type 'float' for input '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final double decodeDouble() {
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
        String strA = stoplisteningtodisplaychange.a();
        try {
            double d = Double.parseDouble(strA);
            if (this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel) {
                return d;
            }
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder, Double.valueOf(d));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            StringBuilder sb = new StringBuilder("Failed to parse type 'double' for input '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final char decodeChar() {
        String strA = this.asBinder.a();
        if (strA.length() != 1) {
            stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
            StringBuilder sb = new StringBuilder("Expected single char, but got '");
            sb.append(strA);
            sb.append('\'');
            stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(stoplisteningtodisplaychange, sb.toString(), 0, null, 6);
            throw new KotlinNothingValueException();
        }
        return strA.charAt(0);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final String decodeString() {
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) {
            return this.asBinder.asBinder();
        }
        stopListeningToDisplayChange stoplisteningtodisplaychange = this.asBinder;
        if (stoplisteningtodisplaychange.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return stoplisteningtodisplaychange.b();
        }
        String str = stoplisteningtodisplaychange.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Intrinsics.checkNotNull(str);
        stoplisteningtodisplaychange.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        return str;
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final stopListeningToRotationEvents decodeInline(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return onFrameUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createimageanalysis) ? new PreviewViewExternalSyntheticLambda1(this.asBinder, this.asInterface) : super.decodeInline(createimageanalysis);
    }

    @Override // defpackage.isOutputSizeEqual, defpackage.stopListeningToRotationEvents
    public final int decodeEnum(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        PreviewStreamStateObserver2 previewStreamStateObserver2 = this.asInterface;
        String strDecodeString = decodeString();
        StringBuilder sb = new StringBuilder(" at path ");
        sb.append(this.asBinder.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        return PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, previewStreamStateObserver2, strDecodeString, sb.toString());
    }
}
