package defpackage;

import com.dynatrace.android.agent.EventType;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class provideSurface {
    private static final String TuitionPaymentFragmentbindingInflater1;
    private static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        lambdaprovideSurface5.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("Dynatrace");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Object();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicBoolean(false);
    }

    protected static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            getDeferrableSurface.b();
        }
    }

    protected static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            if (getDeferrableSurface.TuitionPaymentFragmentbindingInflater1 != null) {
                getDeferrableSurface.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(), lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 0);
            }
            getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        }
    }

    public static boolean b() {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return getDeferrableSurface.TuitionPaymentFragmentbindingInflater1();
        }
        return false;
    }

    public static String TuitionPaymentFragmentbindingInflater1() {
        return "x-dynatrace";
    }

    public static void TuitionPaymentFragmentbindingInflater1(String str) {
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get() && getDeferrableSurface.TuitionPaymentFragmentbindingInflater1()) {
            mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1 = mergeConfigs.TuitionPaymentFragmentbindingInflater1(false);
            if (mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.IDENTIFY_USER)) {
                if (str == null || str.isEmpty()) {
                    str = null;
                }
                mergeconfigsTuitionPaymentFragmentbindingInflater1.asBinder = str;
            }
            getDeferrableSurface.b(mergeconfigsTuitionPaymentFragmentbindingInflater1);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: onRequestAvailable.2.<init>(onRequestAvailable):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public static void TuitionPaymentFragmentbindingInflater1(android.app.Application r3, defpackage.SurfaceRequestTransformationInfo r4) {
        /*
            if (r3 == 0) goto L61
            if (r4 == 0) goto L61
            boolean r0 = defpackage.ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            if (r0 == 0) goto L14
            boolean r3 = r4.onTransact
            if (r3 == 0) goto L61
            java.lang.String r3 = "Isolated service detected. Monitoring deactivated for this process"
            defpackage.ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r3)
            return
        L14:
            getImageCaptureException r0 = new getImageCaptureException
            r0.<init>()
            java.lang.String r0 = defpackage.getImageCaptureException.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
            if (r0 != 0) goto L20
            goto L28
        L20:
            java.lang.String r1 = ":dynatrace_replay_service"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L61
        L28:
            java.lang.Object r0 = defpackage.provideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = defpackage.provideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L35
            monitor-exit(r0)
            return
        L35:
            onRequestAvailable r1 = new onRequestAvailable     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            java.lang.String r2 = r4.TuitionPaymentFragmentspecialinlinedviewModeldefault3     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            java.lang.String r2 = r4.f230a     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            provideSurface$5 r2 = new provideSurface$5     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            onRequestAvailable$2 r2 = new onRequestAvailable$2     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r1 = 0
            defpackage.getDeferrableSurface.b(r3, r1, r4, r2)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            java.util.concurrent.atomic.AtomicBoolean r3 = defpackage.provideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            r4 = 1
            r3.set(r4)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L5e
            goto L5c
        L53:
            boolean r3 = defpackage.SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L5c
            java.lang.String r3 = "unable to start agent"
            defpackage.ViewPort.TuitionPaymentFragmentbindingInflater1(r3)     // Catch: java.lang.Throwable -> L5e
        L5c:
            monitor-exit(r0)
            return
        L5e:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.provideSurface.TuitionPaymentFragmentbindingInflater1(android.app.Application, SurfaceRequestTransformationInfo):void");
    }
}
