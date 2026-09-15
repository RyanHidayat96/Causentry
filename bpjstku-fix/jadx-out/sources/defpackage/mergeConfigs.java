package defpackage;

import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.data.SessionState;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class mergeConfigs {
    private static final String cancel;
    private static volatile mergeConfigs notify;
    private Random INotificationSideChannel;
    public volatile long TuitionPaymentFragmentbindingInflater1;
    public bindToCamera TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final UseCase TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public String asBinder;
    public long cancelAll;
    public long d;
    public final long g;
    public int b = 0;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
    public String asInterface = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SessionState f1275a = SessionState.CREATED;
    private volatile int onTransact = 0;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("Session");
        cancel = sb.toString();
        new getSecondarySessionConfig();
        notify = null;
    }

    private mergeConfigs(long j, Random random, bindToCamera bindtocamera, UseCase useCase) {
        this.g = j;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.INotificationSideChannel = random;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bindtocamera;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = useCase;
    }

    public static mergeConfigs TuitionPaymentFragmentbindingInflater1(bindToCamera bindtocamera) {
        if (notify == null) {
            synchronized (mergeConfigs.class) {
                if (notify == null) {
                    return TuitionPaymentFragmentspecialinlinedviewModeldefault2(bindtocamera, SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
                }
            }
        }
        return notify;
    }

    public static mergeConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault1(bindToCamera bindtocamera) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(bindtocamera, SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
    }

    public static mergeConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault2(bindToCamera bindtocamera, long j) {
        mergeConfigs mergeconfigs = new mergeConfigs(j, new Random(System.currentTimeMillis()), bindtocamera, lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact.asInterface);
        notify = mergeconfigs;
        return mergeconfigs;
    }

    public static mergeConfigs TuitionPaymentFragmentbindingInflater1() {
        if (notify != null) {
            return notify;
        }
        return TuitionPaymentFragmentbindingInflater1(bindToCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public static mergeConfigs TuitionPaymentFragmentbindingInflater1(boolean z) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(z, SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public final void TuitionPaymentFragmentbindingInflater1(ServerConfiguration serverConfiguration, lambdaprovideSurface4 lambdaprovidesurface4) {
        SessionState sessionState;
        if (this.f1275a == SessionState.CREATED) {
            int i = serverConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            boolean z = i > 0;
            if (!z && SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Session disabled by overload prevention (mp=0)");
            }
            if (z) {
                boolean z2 = this.INotificationSideChannel.nextInt(100) < serverConfiguration.notify;
                if (z2) {
                    z = z2;
                    if (z) {
                        sessionState = SessionState.ENABLED;
                    }
                } else if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    StringBuilder sb = new StringBuilder("Session disabled by traffic control: tc=");
                    sb.append(serverConfiguration.notify);
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                }
                sessionState = SessionState.DISABLED;
            } else if (z) {
                sessionState = SessionState.ENABLED;
            } else {
                sessionState = SessionState.DISABLED;
            }
            this.f1275a = sessionState;
            if (lambdaprovidesurface4 != null) {
                new setTransformationInfoListener();
            }
        }
    }

    public static mergeConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, long j) {
        mergeConfigs mergeconfigsTuitionPaymentFragmentbindingInflater1;
        if (notify != null) {
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = notify;
        } else {
            mergeconfigsTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(bindToCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (!z) {
            getAppTargetRotation getapptargetrotation = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().onTransact.onTransact;
            if (mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 + (((long) getapptargetrotation.b) * 1000) < j || mergeconfigsTuitionPaymentFragmentbindingInflater1.g + (((long) (getapptargetrotation.TuitionPaymentFragmentbindingInflater1 * 60)) * 1000) < j) {
                getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true, mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, j);
                if (mergeconfigsTuitionPaymentFragmentbindingInflater1.asBinder != null) {
                    notify.asBinder = mergeconfigsTuitionPaymentFragmentbindingInflater1.asBinder;
                    getDeferrableSurface.b(notify);
                }
                mergeconfigsTuitionPaymentFragmentbindingInflater1 = notify;
            }
        }
        mergeconfigsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = j;
        return mergeconfigsTuitionPaymentFragmentbindingInflater1;
    }
}
