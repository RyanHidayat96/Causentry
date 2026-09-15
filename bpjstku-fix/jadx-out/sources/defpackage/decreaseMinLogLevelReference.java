package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class decreaseMinLogLevelReference implements CameraInfo, CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
    final CameraFilter<?> TuitionPaymentFragmentbindingInflater1;
    volatile CameraInfoImplementationType TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    volatile Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    volatile getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f892a;
    private volatile CameraExecutor1 asBinder;
    final CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;

    public decreaseMinLogLevelReference(CameraFilter<?> cameraFilter, CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.TuitionPaymentFragmentbindingInflater1 = cameraFilter;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.CameraInfo
    public final boolean b() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            Object obj = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            try {
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.asBinder != null && this.asBinder.b()) {
            return true;
        }
        this.asBinder = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        boolean z = false;
        while (!z && this.f892a < this.TuitionPaymentFragmentbindingInflater1.b().size()) {
            List<getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?>> listB = this.TuitionPaymentFragmentbindingInflater1.b();
            int i = this.f892a;
            this.f892a = i + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = listB.get(i);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null && (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1()) || this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()))) {
                final getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1.g, new isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Object>() { // from class: decreaseMinLogLevelReference.5
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj2) {
                        decreaseMinLogLevelReference decreaseminloglevelreference = decreaseMinLogLevelReference.this;
                        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1;
                        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater3 = decreaseminloglevelreference.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (tuitionPaymentFragmentbindingInflater3 == null || tuitionPaymentFragmentbindingInflater3 != tuitionPaymentFragmentbindingInflater2) {
                            return;
                        }
                        decreaseMinLogLevelReference decreaseminloglevelreference2 = decreaseMinLogLevelReference.this;
                        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater4 = tuitionPaymentFragmentbindingInflater1;
                        CameraSelector cameraSelector = decreaseminloglevelreference2.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (obj2 != null && cameraSelector.b(tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1())) {
                            decreaseminloglevelreference2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj2;
                            decreaseminloglevelreference2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        } else {
                            decreaseminloglevelreference2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault2, obj2, tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(), decreaseminloglevelreference2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
                        decreaseMinLogLevelReference decreaseminloglevelreference = decreaseMinLogLevelReference.this;
                        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1;
                        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater3 = decreaseminloglevelreference.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (tuitionPaymentFragmentbindingInflater3 == null || tuitionPaymentFragmentbindingInflater3 != tuitionPaymentFragmentbindingInflater2) {
                            return;
                        }
                        decreaseMinLogLevelReference decreaseminloglevelreference2 = decreaseMinLogLevelReference.this;
                        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater4 = tuitionPaymentFragmentbindingInflater1;
                        decreaseminloglevelreference2.b.TuitionPaymentFragmentbindingInflater1(decreaseminloglevelreference2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, exc, tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
                    }
                });
                z = true;
            }
        }
        return z;
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) throws Throwable {
        long jTuitionPaymentFragmentbindingInflater1 = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
        boolean z = false;
        try {
            getOutputOption getoutputoptionB = this.TuitionPaymentFragmentbindingInflater1.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(obj);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getoutputoptionB.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            getSensorToBufferTransform getsensortobuffertransformTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.b.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass());
            if (getsensortobuffertransformTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                mustPlayShutterSound mustplayshuttersound = new mustPlayShutterSound(getsensortobuffertransformTuitionPaymentFragmentspecialinlinedviewModeldefault2, objTuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1.f110a);
                CameraInfoImplementationType cameraInfoImplementationType = new CameraInfoImplementationType(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1.onTransact);
                traceExecutionState traceexecutionstateTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
                traceexecutionstateTuitionPaymentFragmentbindingInflater1.b(cameraInfoImplementationType, mustplayshuttersound);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    cameraInfoImplementationType.toString();
                    Objects.toString(obj);
                    Objects.toString(getsensortobuffertransformTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
                }
                if (traceexecutionstateTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cameraInfoImplementationType) != null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraInfoImplementationType;
                    this.asBinder = new CameraExecutor1(Collections.singletonList(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2), this.TuitionPaymentFragmentbindingInflater1, this);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                    return true;
                }
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Objects.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    Objects.toString(obj);
                }
                try {
                    this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getoutputoptionB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
                    }
                    throw th;
                }
            }
            throw new Registry.NoSourceEncoderAvailableException(objTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass());
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.CameraInfo
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (tuitionPaymentFragmentbindingInflater1 != null) {
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        throw new UnsupportedOperationException();
    }

    @Override // CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCameraControl getcameracontrol, Object obj, isUseCasesCombinationSupportedByFramework<?> isusecasescombinationsupportedbyframework, DataSource dataSource, getCameraControl getcameracontrol2) {
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcameracontrol, obj, isusecasescombinationsupportedbyframework, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(), getcameracontrol);
    }

    @Override // CameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1
    public final void TuitionPaymentFragmentbindingInflater1(getCameraControl getcameracontrol, Exception exc, isUseCasesCombinationSupportedByFramework<?> isusecasescombinationsupportedbyframework, DataSource dataSource) {
        this.b.TuitionPaymentFragmentbindingInflater1(getcameracontrol, exc, isusecasescombinationsupportedbyframework, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
    }
}
