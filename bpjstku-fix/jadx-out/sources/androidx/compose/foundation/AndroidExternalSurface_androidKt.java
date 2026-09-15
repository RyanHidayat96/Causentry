package androidx.compose.foundation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidExternalSurface_androidKt {
    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidExternalSurfaceState;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x0168  */
    /* JADX WARN: Code duplicated, block: B:116:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:120:0x0180  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01de  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[PHI: r2 r3 r4 r12 r15
  0x00e8: PHI (r2v6 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v8 androidx.compose.ui.Modifier) binds: [B:92:0x0111, B:78:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r3v11 boolean) = (r3v5 boolean), (r3v12 boolean) binds: [B:92:0x0111, B:78:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r4v20 int) = (r4v16 int), (r4v21 int) binds: [B:92:0x0111, B:78:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r12v11 long) = (r12v2 long), (r12v1 long) binds: [B:92:0x0111, B:78:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r15v14 int) = (r15v3 int), (r15v2 int) binds: [B:92:0x0111, B:78:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    /* JADX INFO: renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    public static final void m555AndroidExternalSurface58FFMhA(Modifier modifier, boolean z, long j, int i, boolean z2, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        long jM7111getZeroYbymL2g;
        int i5;
        int iM551getBehindB_4ceCc;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        Modifier.Companion companion;
        boolean z5;
        boolean z6;
        final int i10;
        int i11;
        final long j2;
        final AndroidExternalSurfaceState androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
        boolean z7;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objRememberedValue2;
        final long j3;
        final int i12;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(640888974);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 48) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                jM7111getZeroYbymL2g = j;
                if ((i3 & 4) == 0 || !composerStartRestartGroup.changed(jM7111getZeroYbymL2g)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i4 |= i13;
            } else {
                jM7111getZeroYbymL2g = j;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    iM551getBehindB_4ceCc = i;
                    if (composerStartRestartGroup.changed(iM551getBehindB_4ceCc)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        if (composerStartRestartGroup.changed(z4)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 32) != 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i15 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                            }
                            if (i5 != 0) {
                                iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                            }
                            z5 = z3;
                            if (i7 != 0) {
                                z6 = false;
                            }
                            i10 = iM551getBehindB_4ceCc;
                            i11 = i4;
                            j2 = jM7111getZeroYbymL2g;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                            }
                            androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                            if ((458752 & i11) == 131072) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!(z7 | zChangedInstance) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final SurfaceView invoke(Context context) {
                                        SurfaceView surfaceView = new SurfaceView(context);
                                        Function1<AndroidExternalSurfaceScope, Unit> function2 = function1;
                                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                        function2.invoke(androidExternalSurfaceState);
                                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                        return surfaceView;
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function2 = (Function1) objRememberedValue;
                            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$2 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SurfaceView surfaceView) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }
                            };
                            z8 = (((i11 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(j2)) || (i11 & 384) == 256;
                            if ((i11 & 112) == 32) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if ((i11 & 7168) == 2048) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if ((57344 & i11) == 16384) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!(z8 | z9 | z10 | z11) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                final boolean z13 = z5;
                                final boolean z14 = z6;
                                objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                        invoke2(surfaceView);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SurfaceView surfaceView) {
                                        if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                            surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                        } else {
                                            surfaceView.getHolder().setSizeFromLayout();
                                        }
                                        surfaceView.getHolder().setFormat(z13 ? -1 : -3);
                                        int i16 = i10;
                                        if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                            surfaceView.setZOrderOnTop(false);
                                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                            surfaceView.setZOrderMediaOverlay(true);
                                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                            surfaceView.setZOrderOnTop(true);
                                        }
                                        surfaceView.setSecure(z14);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            AndroidView_androidKt.AndroidView(function2, companion, androidExternalSurface_androidKt$AndroidExternalSurface$2, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z5;
                            j3 = j2;
                            i12 = i10;
                            z12 = z6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            companion = modifier2;
                            z5 = z3;
                        }
                        z6 = z4;
                        i10 = iM551getBehindB_4ceCc;
                        i11 = i4;
                        j2 = jM7111getZeroYbymL2g;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                        }
                        androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                        if ((458752 & i11) == 131072) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z7 | zChangedInstance)) {
                            objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final SurfaceView invoke(Context context) {
                                    SurfaceView surfaceView = new SurfaceView(context);
                                    Function1<AndroidExternalSurfaceScope, Unit> function3 = function1;
                                    AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                    function3.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final SurfaceView invoke(Context context) {
                                    SurfaceView surfaceView = new SurfaceView(context);
                                    Function1<AndroidExternalSurfaceScope, Unit> function3 = function1;
                                    AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                    function3.invoke(androidExternalSurfaceState);
                                    surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                    return surfaceView;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function3 = (Function1) objRememberedValue;
                        AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$3 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }
                        };
                        if (((i11 & 896) ^ 384) <= 256) {
                        }
                        if ((i11 & 112) == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i11 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((57344 & i11) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(z8 | z9 | z10 | z11)) {
                            final boolean z15 = z5;
                            final boolean z16 = z6;
                            objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SurfaceView surfaceView) {
                                    if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                        surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                    } else {
                                        surfaceView.getHolder().setSizeFromLayout();
                                    }
                                    surfaceView.getHolder().setFormat(z15 ? -1 : -3);
                                    int i16 = i10;
                                    if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(false);
                                    } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                        surfaceView.setZOrderMediaOverlay(true);
                                    } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(true);
                                    }
                                    surfaceView.setSecure(z16);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            final boolean z17 = z5;
                            final boolean z18 = z6;
                            objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                    invoke2(surfaceView);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SurfaceView surfaceView) {
                                    if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                        surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                    } else {
                                        surfaceView.getHolder().setSizeFromLayout();
                                    }
                                    surfaceView.getHolder().setFormat(z17 ? -1 : -3);
                                    int i16 = i10;
                                    if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(false);
                                    } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                        surfaceView.setZOrderMediaOverlay(true);
                                    } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                        surfaceView.setZOrderOnTop(true);
                                    }
                                    surfaceView.setSecure(z18);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        AndroidView_androidKt.AndroidView(function3, companion, androidExternalSurface_androidKt$AndroidExternalSurface$3, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z3 = z5;
                        j3 = j2;
                        i12 = i10;
                        z12 = z6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        j3 = jM7111getZeroYbymL2g;
                        z12 = z4;
                        i12 = iM551getBehindB_4ceCc;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier3 = companion;
                        final boolean z19 = z3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i16) {
                                AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier3, z19, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                    }
                }
                i4 |= 24576;
                z4 = z2;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    } else {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    }
                    i10 = iM551getBehindB_4ceCc;
                    i11 = i4;
                    j2 = jM7111getZeroYbymL2g;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                    }
                    androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z7 | zChangedInstance)) {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function4 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function4.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function4 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function4.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function4 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$4 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i11 & 896) ^ 384) <= 256) {
                    }
                    if ((i11 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i11 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((57344 & i11) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z8 | z9 | z10 | z11)) {
                        final boolean z110 = z5;
                        final boolean z111 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z110 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z111);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        final boolean z112 = z5;
                        final boolean z113 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z112 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z113);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function4, companion, androidExternalSurface_androidKt$AndroidExternalSurface$4, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    j3 = j2;
                    i12 = i10;
                    z12 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    } else {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    }
                    i10 = iM551getBehindB_4ceCc;
                    i11 = i4;
                    j2 = jM7111getZeroYbymL2g;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                    }
                    androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z7 | zChangedInstance)) {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function5 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function5.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function5 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function5.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function5 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$5 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i11 & 896) ^ 384) <= 256) {
                    }
                    if ((i11 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i11 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((57344 & i11) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z8 | z9 | z10 | z11)) {
                        final boolean z114 = z5;
                        final boolean z115 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z114 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z115);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        final boolean z116 = z5;
                        final boolean z117 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z116 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z117);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function5, companion, androidExternalSurface_androidKt$AndroidExternalSurface$5, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    j3 = j2;
                    i12 = i10;
                    z12 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = companion;
                    final boolean z118 = z3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier4, z118, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 3072;
            iM551getBehindB_4ceCc = i;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    } else {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    }
                    i10 = iM551getBehindB_4ceCc;
                    i11 = i4;
                    j2 = jM7111getZeroYbymL2g;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                    }
                    androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z7 | zChangedInstance)) {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function6 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function6.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function6 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function6.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function6 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$6 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i11 & 896) ^ 384) <= 256) {
                    }
                    if ((i11 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i11 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((57344 & i11) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z8 | z9 | z10 | z11)) {
                        final boolean z119 = z5;
                        final boolean z1110 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z119 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z1110);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        final boolean z1111 = z5;
                        final boolean z1112 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z1111 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z1112);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function6, companion, androidExternalSurface_androidKt$AndroidExternalSurface$6, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    j3 = j2;
                    i12 = i10;
                    z12 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    } else {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    }
                    i10 = iM551getBehindB_4ceCc;
                    i11 = i4;
                    j2 = jM7111getZeroYbymL2g;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                    }
                    androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z7 | zChangedInstance)) {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function7 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function7.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function7 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function7.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function7 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$7 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i11 & 896) ^ 384) <= 256) {
                    }
                    if ((i11 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i11 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((57344 & i11) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z8 | z9 | z10 | z11)) {
                        final boolean z1113 = z5;
                        final boolean z1114 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z1113 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z1114);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        final boolean z1115 = z5;
                        final boolean z1116 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z1115 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z1116);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function7, companion, androidExternalSurface_androidKt$AndroidExternalSurface$7, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    j3 = j2;
                    i12 = i10;
                    z12 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = companion;
                    final boolean z1117 = z3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier5, z1117, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            z4 = z2;
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                }
                i10 = iM551getBehindB_4ceCc;
                i11 = i4;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                }
                androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z7 | zChangedInstance)) {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function8 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function8.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function8 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function8.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function8 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$8 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                if (((i11 & 896) ^ 384) <= 256) {
                }
                if ((i11 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z8 | z9 | z10 | z11)) {
                    final boolean z1118 = z5;
                    final boolean z1119 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z1118 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z1119);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final boolean z11110 = z5;
                    final boolean z11111 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z11110 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z11111);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function8, companion, androidExternalSurface_androidKt$AndroidExternalSurface$8, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
                j3 = j2;
                i12 = i10;
                z12 = z6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                }
                i10 = iM551getBehindB_4ceCc;
                i11 = i4;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                }
                androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z7 | zChangedInstance)) {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function9 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function9.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function9 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function9.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function9 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$9 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                if (((i11 & 896) ^ 384) <= 256) {
                }
                if ((i11 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z8 | z9 | z10 | z11)) {
                    final boolean z11112 = z5;
                    final boolean z11113 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z11112 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z11113);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final boolean z11114 = z5;
                    final boolean z11115 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z11114 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z11115);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function9, companion, androidExternalSurface_androidKt$AndroidExternalSurface$9, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
                j3 = j2;
                i12 = i10;
                z12 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = companion;
                final boolean z11116 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i16) {
                        AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier6, z11116, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 48;
        z3 = z;
        if ((i2 & 384) == 0) {
            jM7111getZeroYbymL2g = j;
            if ((i3 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i4 |= i13;
        } else {
            jM7111getZeroYbymL2g = j;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                iM551getBehindB_4ceCc = i;
                if (composerStartRestartGroup.changed(iM551getBehindB_4ceCc)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    } else {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    }
                    i10 = iM551getBehindB_4ceCc;
                    i11 = i4;
                    j2 = jM7111getZeroYbymL2g;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                    }
                    androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z7 | zChangedInstance)) {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function10 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function10.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function10 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function10.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function10 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$10 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i11 & 896) ^ 384) <= 256) {
                    }
                    if ((i11 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i11 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((57344 & i11) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z8 | z9 | z10 | z11)) {
                        final boolean z11117 = z5;
                        final boolean z11118 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z11117 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z11118);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        final boolean z11119 = z5;
                        final boolean z111110 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z11119 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z111110);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function10, companion, androidExternalSurface_androidKt$AndroidExternalSurface$10, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    j3 = j2;
                    i12 = i10;
                    z12 = z6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    } else {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i15 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        }
                        if (i5 != 0) {
                            iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                        }
                        z5 = z3;
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                    }
                    i10 = iM551getBehindB_4ceCc;
                    i11 = i4;
                    j2 = jM7111getZeroYbymL2g;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                    }
                    androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                    if ((458752 & i11) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z7 | zChangedInstance)) {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function11 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function11.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final SurfaceView invoke(Context context) {
                                SurfaceView surfaceView = new SurfaceView(context);
                                Function1<AndroidExternalSurfaceScope, Unit> function11 = function1;
                                AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                                function11.invoke(androidExternalSurfaceState);
                                surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                                return surfaceView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function11 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$11 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }
                    };
                    if (((i11 & 896) ^ 384) <= 256) {
                    }
                    if ((i11 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((i11 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((57344 & i11) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z8 | z9 | z10 | z11)) {
                        final boolean z111111 = z5;
                        final boolean z111112 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z111111 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z111112);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        final boolean z111113 = z5;
                        final boolean z111114 = z6;
                        objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                                invoke2(surfaceView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SurfaceView surfaceView) {
                                if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                    surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                                } else {
                                    surfaceView.getHolder().setSizeFromLayout();
                                }
                                surfaceView.getHolder().setFormat(z111113 ? -1 : -3);
                                int i16 = i10;
                                if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(false);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                    surfaceView.setZOrderMediaOverlay(true);
                                } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                    surfaceView.setZOrderOnTop(true);
                                }
                                surfaceView.setSecure(z111114);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function11, companion, androidExternalSurface_androidKt$AndroidExternalSurface$11, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z5;
                    j3 = j2;
                    i12 = i10;
                    z12 = z6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = companion;
                    final boolean z111115 = z3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier7, z111115, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            z4 = z2;
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                }
                i10 = iM551getBehindB_4ceCc;
                i11 = i4;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                }
                androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z7 | zChangedInstance)) {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function12.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function12 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function12.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function12 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$12 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                if (((i11 & 896) ^ 384) <= 256) {
                }
                if ((i11 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z8 | z9 | z10 | z11)) {
                    final boolean z111116 = z5;
                    final boolean z111117 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z111116 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z111117);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final boolean z111118 = z5;
                    final boolean z111119 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z111118 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z111119);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function12, companion, androidExternalSurface_androidKt$AndroidExternalSurface$12, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
                j3 = j2;
                i12 = i10;
                z12 = z6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                }
                i10 = iM551getBehindB_4ceCc;
                i11 = i4;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                }
                androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z7 | zChangedInstance)) {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function13.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function13 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function13.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function13 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$13 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                if (((i11 & 896) ^ 384) <= 256) {
                }
                if ((i11 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z8 | z9 | z10 | z11)) {
                    final boolean z1111110 = z5;
                    final boolean z1111111 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z1111110 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z1111111);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final boolean z1111112 = z5;
                    final boolean z1111113 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z1111112 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z1111113);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function13, companion, androidExternalSurface_androidKt$AndroidExternalSurface$13, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
                j3 = j2;
                i12 = i10;
                z12 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier8 = companion;
                final boolean z1111114 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i16) {
                        AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier8, z1111114, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        iM551getBehindB_4ceCc = i;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                }
                i10 = iM551getBehindB_4ceCc;
                i11 = i4;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                }
                androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z7 | zChangedInstance)) {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function14 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function14.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function14 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function14.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function14 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$14 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                if (((i11 & 896) ^ 384) <= 256) {
                }
                if ((i11 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z8 | z9 | z10 | z11)) {
                    final boolean z1111115 = z5;
                    final boolean z1111116 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z1111115 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z1111116);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final boolean z1111117 = z5;
                    final boolean z1111118 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z1111117 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z1111118);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function14, companion, androidExternalSurface_androidKt$AndroidExternalSurface$14, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
                j3 = j2;
                i12 = i10;
                z12 = z6;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i15 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    }
                    if (i5 != 0) {
                        iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                    }
                    z5 = z3;
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                }
                i10 = iM551getBehindB_4ceCc;
                i11 = i4;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
                }
                androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z7 | zChangedInstance)) {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function15 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function15.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final SurfaceView invoke(Context context) {
                            SurfaceView surfaceView = new SurfaceView(context);
                            Function1<AndroidExternalSurfaceScope, Unit> function15 = function1;
                            AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                            function15.invoke(androidExternalSurfaceState);
                            surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                            return surfaceView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function15 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$15 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }
                };
                if (((i11 & 896) ^ 384) <= 256) {
                }
                if ((i11 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((i11 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((57344 & i11) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z8 | z9 | z10 | z11)) {
                    final boolean z1111119 = z5;
                    final boolean z11111110 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z1111119 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z11111110);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final boolean z11111111 = z5;
                    final boolean z11111112 = z6;
                    objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                            invoke2(surfaceView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SurfaceView surfaceView) {
                            if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                                surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                            } else {
                                surfaceView.getHolder().setSizeFromLayout();
                            }
                            surfaceView.getHolder().setFormat(z11111111 ? -1 : -3);
                            int i16 = i10;
                            if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                                surfaceView.setZOrderOnTop(false);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                                surfaceView.setZOrderMediaOverlay(true);
                            } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                                surfaceView.setZOrderOnTop(true);
                            }
                            surfaceView.setSecure(z11111112);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function15, companion, androidExternalSurface_androidKt$AndroidExternalSurface$15, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
                j3 = j2;
                i12 = i10;
                z12 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier9 = companion;
                final boolean z11111113 = z3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i16) {
                        AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier9, z11111113, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        z4 = z2;
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        if ((i4 & 74899) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i15 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                }
                if (i5 != 0) {
                    iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                }
                z5 = z3;
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
            } else {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i15 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                }
                if (i5 != 0) {
                    iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                }
                z5 = z3;
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
            }
            i10 = iM551getBehindB_4ceCc;
            i11 = i4;
            j2 = jM7111getZeroYbymL2g;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
            }
            androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
            if ((458752 & i11) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z7 | zChangedInstance)) {
                objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function16 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                        function16.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function16 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                        function16.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function16 = (Function1) objRememberedValue;
            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$16 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }
            };
            if (((i11 & 896) ^ 384) <= 256) {
            }
            if ((i11 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i11 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((57344 & i11) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(z8 | z9 | z10 | z11)) {
                final boolean z11111114 = z5;
                final boolean z11111115 = z6;
                objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z11111114 ? -1 : -3);
                        int i16 = i10;
                        if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z11111115);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                final boolean z11111116 = z5;
                final boolean z11111117 = z6;
                objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z11111116 ? -1 : -3);
                        int i16 = i10;
                        if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z11111117);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function16, companion, androidExternalSurface_androidKt$AndroidExternalSurface$16, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z5;
            j3 = j2;
            i12 = i10;
            z12 = z6;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i15 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                }
                if (i5 != 0) {
                    iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                }
                z5 = z3;
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
            } else {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i15 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                }
                if (i5 != 0) {
                    iM551getBehindB_4ceCc = AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc();
                }
                z5 = z3;
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
            }
            i10 = iM551getBehindB_4ceCc;
            i11 = i4;
            j2 = jM7111getZeroYbymL2g;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(640888974, i11, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:287)");
            }
            androidExternalSurfaceStateRememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(composerStartRestartGroup, 0);
            if ((458752 & i11) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(androidExternalSurfaceStateRememberAndroidExternalSurfaceState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z7 | zChangedInstance)) {
                objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function17 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                        function17.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<Context, SurfaceView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final SurfaceView invoke(Context context) {
                        SurfaceView surfaceView = new SurfaceView(context);
                        Function1<AndroidExternalSurfaceScope, Unit> function17 = function1;
                        AndroidExternalSurfaceState androidExternalSurfaceState = androidExternalSurfaceStateRememberAndroidExternalSurfaceState;
                        function17.invoke(androidExternalSurfaceState);
                        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
                        return surfaceView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function17 = (Function1) objRememberedValue;
            AndroidExternalSurface_androidKt$AndroidExternalSurface$2 androidExternalSurface_androidKt$AndroidExternalSurface$17 = new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SurfaceView surfaceView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                    invoke2(surfaceView);
                    return Unit.INSTANCE;
                }
            };
            if (((i11 & 896) ^ 384) <= 256) {
            }
            if ((i11 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i11 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((57344 & i11) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(z8 | z9 | z10 | z11)) {
                final boolean z11111118 = z5;
                final boolean z11111119 = z6;
                objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z11111118 ? -1 : -3);
                        int i16 = i10;
                        if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z11111119);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                final boolean z111111110 = z5;
                final boolean z111111111 = z6;
                objRememberedValue2 = (Function1) new Function1<SurfaceView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SurfaceView surfaceView) {
                        invoke2(surfaceView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SurfaceView surfaceView) {
                        if (!IntSize.m7104equalsimpl0(j2, IntSize.INSTANCE.m7111getZeroYbymL2g())) {
                            surfaceView.getHolder().setFixedSize(IntSize.m7106getWidthimpl(j2), IntSize.m7105getHeightimpl(j2));
                        } else {
                            surfaceView.getHolder().setSizeFromLayout();
                        }
                        surfaceView.getHolder().setFormat(z111111110 ? -1 : -3);
                        int i16 = i10;
                        if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m551getBehindB_4ceCc())) {
                            surfaceView.setZOrderOnTop(false);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m552getMediaOverlayB_4ceCc())) {
                            surfaceView.setZOrderMediaOverlay(true);
                        } else if (AndroidExternalSurfaceZOrder.m547equalsimpl0(i16, AndroidExternalSurfaceZOrder.INSTANCE.m553getOnTopB_4ceCc())) {
                            surfaceView.setZOrderOnTop(true);
                        }
                        surfaceView.setSecure(z111111111);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function17, companion, androidExternalSurface_androidKt$AndroidExternalSurface$17, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i11 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z5;
            j3 = j2;
            i12 = i10;
            z12 = z6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier10 = companion;
            final boolean z111111112 = z3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidExternalSurface$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i16) {
                    AndroidExternalSurface_androidKt.m555AndroidExternalSurface58FFMhA(modifier10, z111111112, j3, i12, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEmbeddedExternalSurfaceState;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0161  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:121:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00ad, please report this as an issue */
    /* JADX INFO: renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    public static final void m554AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, long j, float[] fArr, final Function1<? super AndroidExternalSurfaceScope, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long jM7111getZeroYbymL2g;
        int i4;
        Matrix matrixM4459boximpl;
        int i5;
        int i6;
        Modifier.Companion companion;
        int i7;
        boolean z3;
        final long j2;
        final AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
        boolean zChangedInstance;
        boolean z4;
        boolean z5;
        Object objRememberedValue;
        boolean z6;
        boolean zChangedInstance2;
        boolean z7;
        Matrix matrixM4459boximpl2;
        boolean zChangedInstance3;
        Object objRememberedValue2;
        final long j3;
        final float[] fArr2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(217541314);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                jM7111getZeroYbymL2g = j;
                if ((i2 & 4) == 0 || !composerStartRestartGroup.changed(jM7111getZeroYbymL2g)) {
                    i8 = 128;
                } else {
                    i8 = 256;
                }
                i3 |= i8;
            } else {
                jM7111getZeroYbymL2g = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (fArr != null) {
                    matrixM4459boximpl = Matrix.m4459boximpl(fArr);
                } else {
                    matrixM4459boximpl = null;
                }
                if (composerStartRestartGroup.changedInstance(matrixM4459boximpl)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        i7 = i3;
                        z3 = z2;
                        j2 = jM7111getZeroYbymL2g;
                        fArr = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(217541314, i7, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                    }
                    androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
                    zChangedInstance = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
                    int i11 = (i7 & 896) ^ 384;
                    z4 = (i11 <= 256 && composerStartRestartGroup.changed(j2)) || (i7 & 384) == 256;
                    if ((i7 & 57344) == 16384) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z5 | zChangedInstance | z4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final TextureView invoke(Context context) {
                                TextureView textureView = new TextureView(context);
                                AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                                long j4 = j2;
                                Function1<AndroidExternalSurfaceScope, Unit> function2 = function1;
                                androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j4);
                                function2.invoke(androidEmbeddedExternalSurfaceState);
                                textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                                return textureView;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function2 = (Function1) objRememberedValue;
                    AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextureView textureView) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                            invoke2(textureView);
                            return Unit.INSTANCE;
                        }
                    };
                    z6 = (i11 <= 256 && composerStartRestartGroup.changed(j2)) || (i7 & 384) == 256;
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
                    z7 = (i7 & 112) == 32;
                    if (fArr != null) {
                        matrixM4459boximpl2 = Matrix.m4459boximpl(fArr);
                    } else {
                        matrixM4459boximpl2 = null;
                    }
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(matrixM4459boximpl2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!(z6 | zChangedInstance2 | z7 | zChangedInstance3) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final long j4 = j2;
                        final boolean z8 = z3;
                        final float[] fArr3 = fArr;
                        objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                                invoke2(textureView);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TextureView textureView) {
                                android.graphics.Matrix matrix;
                                SurfaceTexture surfaceTexture;
                                if (!IntSize.m7104equalsimpl0(j4, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                    surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j4), IntSize.m7105getHeightimpl(j4));
                                }
                                androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j4);
                                textureView.setOpaque(z8);
                                float[] fArr4 = fArr3;
                                if (fArr4 != null) {
                                    matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                                    AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr4);
                                } else {
                                    matrix = null;
                                }
                                textureView.setTransform(matrix);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AndroidView_androidKt.AndroidView(function2, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i7 << 3) & 112) | 384, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z2 = z3;
                    j3 = j2;
                    fArr2 = fArr;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                }
                i7 = i3;
                z3 = z2;
                j2 = jM7111getZeroYbymL2g;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(217541314, i7, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
                }
                androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
                zChangedInstance = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
                int i12 = (i7 & 896) ^ 384;
                if (i12 <= 256) {
                }
                if ((i7 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z5 | zChangedInstance | z4)) {
                    objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final TextureView invoke(Context context) {
                            TextureView textureView = new TextureView(context);
                            AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                            long j5 = j2;
                            Function1<AndroidExternalSurfaceScope, Unit> function3 = function1;
                            androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j5);
                            function3.invoke(androidEmbeddedExternalSurfaceState);
                            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                            return textureView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final TextureView invoke(Context context) {
                            TextureView textureView = new TextureView(context);
                            AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                            long j5 = j2;
                            Function1<AndroidExternalSurfaceScope, Unit> function3 = function1;
                            androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j5);
                            function3.invoke(androidEmbeddedExternalSurfaceState);
                            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                            return textureView;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function3 = (Function1) objRememberedValue;
                AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }
                };
                if (i12 <= 256) {
                }
                zChangedInstance2 = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
                if ((i7 & 112) == 32) {
                }
                if (fArr != null) {
                    matrixM4459boximpl2 = Matrix.m4459boximpl(fArr);
                } else {
                    matrixM4459boximpl2 = null;
                }
                zChangedInstance3 = composerStartRestartGroup.changedInstance(matrixM4459boximpl2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(z6 | zChangedInstance2 | z7 | zChangedInstance3)) {
                    final long j5 = j2;
                    final boolean z9 = z3;
                    final float[] fArr4 = fArr;
                    objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                            invoke2(textureView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextureView textureView) {
                            android.graphics.Matrix matrix;
                            SurfaceTexture surfaceTexture;
                            if (!IntSize.m7104equalsimpl0(j5, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j5), IntSize.m7105getHeightimpl(j5));
                            }
                            androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j5);
                            textureView.setOpaque(z9);
                            float[] fArr5 = fArr4;
                            if (fArr5 != null) {
                                matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                                AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr5);
                            } else {
                                matrix = null;
                            }
                            textureView.setTransform(matrix);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    final long j6 = j2;
                    final boolean z10 = z3;
                    final float[] fArr5 = fArr;
                    objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                            invoke2(textureView);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(TextureView textureView) {
                            android.graphics.Matrix matrix;
                            SurfaceTexture surfaceTexture;
                            if (!IntSize.m7104equalsimpl0(j6, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                                surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j6), IntSize.m7105getHeightimpl(j6));
                            }
                            androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j6);
                            textureView.setOpaque(z10);
                            float[] fArr6 = fArr5;
                            if (fArr6 != null) {
                                matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                                AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr6);
                            } else {
                                matrix = null;
                            }
                            textureView.setTransform(matrix);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(function3, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i7 << 3) & 112) | 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
                j3 = j2;
                fArr2 = fArr;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                fArr2 = fArr;
                companion = modifier2;
                j3 = jM7111getZeroYbymL2g;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier3 = companion;
                final boolean z11 = z2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i13) {
                        AndroidExternalSurface_androidKt.m554AndroidEmbeddedExternalSurfacesv6N_fY(modifier3, z11, j3, fArr2, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            jM7111getZeroYbymL2g = j;
            if ((i2 & 4) == 0) {
                i8 = 128;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            jM7111getZeroYbymL2g = j;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (fArr != null) {
                matrixM4459boximpl = Matrix.m4459boximpl(fArr);
            } else {
                matrixM4459boximpl = null;
            }
            if (composerStartRestartGroup.changedInstance(matrixM4459boximpl)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if ((i2 & 4) != 0) {
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                    fArr = null;
                } else {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if ((i2 & 4) != 0) {
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                    fArr = null;
                } else {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217541314, i7, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
            }
            androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
            zChangedInstance = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
            int i13 = (i7 & 896) ^ 384;
            if (i13 <= 256) {
            }
            if ((i7 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z5 | zChangedInstance | z4)) {
                objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final TextureView invoke(Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                        long j7 = j2;
                        Function1<AndroidExternalSurfaceScope, Unit> function4 = function1;
                        androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j7);
                        function4.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final TextureView invoke(Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                        long j7 = j2;
                        Function1<AndroidExternalSurfaceScope, Unit> function4 = function1;
                        androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j7);
                        function4.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function4 = (Function1) objRememberedValue;
            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextureView textureView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                    invoke2(textureView);
                    return Unit.INSTANCE;
                }
            };
            if (i13 <= 256) {
            }
            zChangedInstance2 = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
            if ((i7 & 112) == 32) {
            }
            if (fArr != null) {
                matrixM4459boximpl2 = Matrix.m4459boximpl(fArr);
            } else {
                matrixM4459boximpl2 = null;
            }
            zChangedInstance3 = composerStartRestartGroup.changedInstance(matrixM4459boximpl2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(z6 | zChangedInstance2 | z7 | zChangedInstance3)) {
                final long j7 = j2;
                final boolean z12 = z3;
                final float[] fArr6 = fArr;
                objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        android.graphics.Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m7104equalsimpl0(j7, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j7), IntSize.m7105getHeightimpl(j7));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j7);
                        textureView.setOpaque(z12);
                        float[] fArr7 = fArr6;
                        if (fArr7 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr7);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                final long j8 = j2;
                final boolean z13 = z3;
                final float[] fArr7 = fArr;
                objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        android.graphics.Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m7104equalsimpl0(j8, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j8), IntSize.m7105getHeightimpl(j8));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j8);
                        textureView.setOpaque(z13);
                        float[] fArr8 = fArr7;
                        if (fArr8 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr8);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function4, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i7 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            j3 = j2;
            fArr2 = fArr;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if ((i2 & 4) != 0) {
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                    fArr = null;
                } else {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                if ((i2 & 4) != 0) {
                    jM7111getZeroYbymL2g = IntSize.INSTANCE.m7111getZeroYbymL2g();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                    fArr = null;
                } else {
                    i7 = i3;
                    z3 = z2;
                    j2 = jM7111getZeroYbymL2g;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217541314, i7, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:454)");
            }
            androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(composerStartRestartGroup, 0);
            zChangedInstance = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
            int i14 = (i7 & 896) ^ 384;
            if (i14 <= 256) {
            }
            if ((i7 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z5 | zChangedInstance | z4)) {
                objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final TextureView invoke(Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                        long j9 = j2;
                        Function1<AndroidExternalSurfaceScope, Unit> function5 = function1;
                        androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j9);
                        function5.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<Context, TextureView>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final TextureView invoke(Context context) {
                        TextureView textureView = new TextureView(context);
                        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState;
                        long j9 = j2;
                        Function1<AndroidExternalSurfaceScope, Unit> function5 = function1;
                        androidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j9);
                        function5.invoke(androidEmbeddedExternalSurfaceState);
                        textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
                        return textureView;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function5 = (Function1) objRememberedValue;
            AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2 androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$5 = new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TextureView textureView) {
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                    invoke2(textureView);
                    return Unit.INSTANCE;
                }
            };
            if (i14 <= 256) {
            }
            zChangedInstance2 = composerStartRestartGroup.changedInstance(androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState);
            if ((i7 & 112) == 32) {
            }
            if (fArr != null) {
                matrixM4459boximpl2 = Matrix.m4459boximpl(fArr);
            } else {
                matrixM4459boximpl2 = null;
            }
            zChangedInstance3 = composerStartRestartGroup.changedInstance(matrixM4459boximpl2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(z6 | zChangedInstance2 | z7 | zChangedInstance3)) {
                final long j9 = j2;
                final boolean z14 = z3;
                final float[] fArr8 = fArr;
                objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        android.graphics.Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m7104equalsimpl0(j9, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j9), IntSize.m7105getHeightimpl(j9));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j9);
                        textureView.setOpaque(z14);
                        float[] fArr9 = fArr8;
                        if (fArr9 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr9);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                final long j10 = j2;
                final boolean z15 = z3;
                final float[] fArr9 = fArr;
                objRememberedValue2 = (Function1) new Function1<TextureView, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(TextureView textureView) {
                        invoke2(textureView);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextureView textureView) {
                        android.graphics.Matrix matrix;
                        SurfaceTexture surfaceTexture;
                        if (!IntSize.m7104equalsimpl0(j10, IntSize.INSTANCE.m7111getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
                            surfaceTexture.setDefaultBufferSize(IntSize.m7106getWidthimpl(j10), IntSize.m7105getHeightimpl(j10));
                        }
                        androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.m543setSurfaceSizeozmzZPI(j10);
                        textureView.setOpaque(z15);
                        float[] fArr10 = fArr9;
                        if (fArr10 != null) {
                            matrix = androidEmbeddedExternalSurfaceStateRememberAndroidEmbeddedExternalSurfaceState.getMatrix();
                            AndroidMatrixConversions_androidKt.m4086setFromEL8BTi8(matrix, fArr10);
                        } else {
                            matrix = null;
                        }
                        textureView.setTransform(matrix);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function5, companion, androidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$5, null, (Function1) objRememberedValue2, composerStartRestartGroup, ((i7 << 3) & 112) | 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            j3 = j2;
            fArr2 = fArr;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = companion;
            final boolean z16 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    AndroidExternalSurface_androidKt.m554AndroidEmbeddedExternalSurfacesv6N_fY(modifier4, z16, j3, fArr2, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
