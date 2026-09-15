package defpackage;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.conf.AgentMode;
import java.net.HttpURLConnection;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class lambdanew3androidxcameracoreSurfaceRequest extends isServiced {
    private static final String INotificationSideChannelStub;
    private static ConcurrentHashMap<Long, Vector<isServiced>> getInterfaceDescriptor;
    private lambdanew3androidxcameracoreSurfaceRequest INotificationSideChannelDefault;
    public int INotificationSideChannelStubProxy;
    private Vector<isServiced> RemoteActionCompatParcelizer;
    protected int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    protected boolean onTransact;

    protected void b(isServiced isserviced) {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("DTXActionImpl");
        INotificationSideChannelStub = sb.toString();
        getInterfaceDescriptor = new ConcurrentHashMap<>();
    }

    public lambdanew3androidxcameracoreSurfaceRequest(String str, EventType eventType, long j, mergeConfigs mergeconfigs, int i, boolean z, lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest) {
        super(str, 5, eventType, j, mergeconfigs, i, z);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        this.RemoteActionCompatParcelizer = new Vector<>();
        this.INotificationSideChannelStubProxy = 0;
        this.INotificationSideChannelDefault = lambdanew3androidxcameracoresurfacerequest;
        this.onTransact = z;
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("New action ".concat(String.valueOf(str)));
        }
        String str2 = this.asBinder;
        if (str2 == null || str2.isEmpty()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("The action name is null or empty hence this action will be deactivated");
            }
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    @Deprecated
    static void TuitionPaymentFragmentbindingInflater1(isServiced isserviced) {
        SurfaceRequestTransformationInfo surfaceRequestTransformationInfo = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (surfaceRequestTransformationInfo == null || surfaceRequestTransformationInfo.getInterfaceDescriptor != AgentMode.SAAS) {
            Vector<isServiced> vector = getInterfaceDescriptor.get(Long.valueOf(Thread.currentThread().getId()));
            if (vector == null) {
                vector = new Vector<>();
                getInterfaceDescriptor.put(Long.valueOf(Thread.currentThread().getId()), vector);
            }
            vector.add(isserviced);
        }
    }

    public void MediaBrowserCompat() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
    }

    public void RemoteActionCompatParcelizer() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        if (cancel()) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Action %s is already closed", this.asBinder));
                return;
            }
            return;
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Action %s closing ... saving=%b", this.asBinder, Boolean.valueOf(z)));
        }
        onInputSurface.TuitionPaymentFragmentbindingInflater1(this);
        boolean zINotificationSideChannelStub = INotificationSideChannelStub();
        if (zINotificationSideChannelStub) {
            this.f1229a = SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1() - this.cancel.g;
            SurfaceRequestTransformationInfo surfaceRequestTransformationInfo = lambdaprovideSurface5.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Vector<isServiced> vectorRemove = (surfaceRequestTransformationInfo == null || surfaceRequestTransformationInfo.getInterfaceDescriptor != AgentMode.SAAS) ? getInterfaceDescriptor.remove(Long.valueOf(Thread.currentThread().getId())) : null;
            if (vectorRemove != null) {
                for (isServiced isserviced : vectorRemove) {
                    if (isserviced.onTransact() > onTransact() && isserviced.onTransact() < TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s adopting %s tagId=%s", this.asBinder, isserviced.asBinder, Long.valueOf(isserviced.asInterface)));
                        }
                        isserviced.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asInterface);
                        if (isserviced != null && isserviced.INotificationSideChannel()) {
                            this.RemoteActionCompatParcelizer.add(isserviced);
                            b(isserviced);
                        }
                    } else if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("%s not adopting %s tagId=%s", this.asBinder, isserviced.asBinder, Long.valueOf(isserviced.asInterface)));
                    }
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(z);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ViewPort.b();
            if (z) {
                getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder, 2, a(), this, this.cancel, this.INotificationSideChannel, new String[0]);
            } else {
                INotificationSideChannelStubProxy();
                getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
            }
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(false);
            INotificationSideChannelStubProxy();
            getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        }
        lambdanew3androidxcameracoreSurfaceRequest lambdanew3androidxcameracoresurfacerequest = this.INotificationSideChannelDefault;
        if (lambdanew3androidxcameracoresurfacerequest != null && (lambdanew3androidxcameracoresurfacerequest instanceof isPrimary)) {
            isPrimary isprimary = (isPrimary) lambdanew3androidxcameracoresurfacerequest;
            if (isprimary.getInterfaceDescriptor().contains(this)) {
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    String str = isPrimary.INotificationSideChannelStub;
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("onUA: child %s of %s done", this.asBinder, isprimary.asBinder));
                }
                isprimary.connect();
                isprimary.getInterfaceDescriptor--;
            }
        }
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.format("Action %s closed: shouldSave=%b rc=%b", this.asBinder, Boolean.valueOf(z), Boolean.valueOf(zINotificationSideChannelStub)));
            if (zINotificationSideChannelStub) {
                return;
            }
            ViewPort.d(String.format("Discard %s tagId=%d capture state=%b", this.asBinder, Long.valueOf(this.asInterface), Boolean.valueOf(zINotificationSideChannelStub)));
        }
    }

    public final void b(String str, String str2) {
        isServiced isservicedTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String[] strArr = {str2};
        if (!INotificationSideChannelStub() || (isservicedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, 8, this.asInterface, null, this.cancel, this.INotificationSideChannel, strArr)) == null || isservicedTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || !isservicedTuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel()) {
            return;
        }
        this.RemoteActionCompatParcelizer.add(isservicedTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        b(isservicedTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final SurfaceRequestExternalSyntheticLambda2 TuitionPaymentFragmentbindingInflater1(HttpURLConnection httpURLConnection) {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2Write;
        if (httpURLConnection == null || (surfaceRequestExternalSyntheticLambda2Write = write()) == null) {
            return null;
        }
        try {
            httpURLConnection.setRequestProperty(provideSurface.TuitionPaymentFragmentbindingInflater1(), surfaceRequestExternalSyntheticLambda2Write.toString());
            return surfaceRequestExternalSyntheticLambda2Write;
        } catch (Exception e2) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.asInterface(e2.toString());
            }
            return surfaceRequestExternalSyntheticLambda2Write;
        }
    }

    public final SurfaceRequestExternalSyntheticLambda2 write() {
        SurfaceRequestExternalSyntheticLambda2 surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault = INotificationSideChannelDefault();
        if (surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault == null) {
            return null;
        }
        isServiced isserviced = new isServiced(surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault.toString(), 110, EventType.PLACEHOLDER, this.asInterface, this.cancel, this.INotificationSideChannel, this.onTransact);
        if (isserviced.INotificationSideChannel()) {
            this.RemoteActionCompatParcelizer.add(isserviced);
            b(isserviced);
        }
        return surfaceRequestExternalSyntheticLambda2INotificationSideChannelDefault;
    }

    protected SurfaceRequestExternalSyntheticLambda2 INotificationSideChannelDefault() {
        if (INotificationSideChannelStub() && this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType.WEB_REQUEST)) {
            return new SurfaceRequestExternalSyntheticLambda2(this.asInterface, this.INotificationSideChannel, this.cancel);
        }
        return null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(isServiced isserviced) {
        if (isserviced == null || !isserviced.INotificationSideChannel()) {
            return;
        }
        this.RemoteActionCompatParcelizer.add(isserviced);
        b(isserviced);
    }

    protected boolean INotificationSideChannelStub() {
        if (cancel()) {
            return false;
        }
        return provideSurface.b();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        Vector<isServiced> vector = this.RemoteActionCompatParcelizer;
        if (vector == null) {
            return;
        }
        synchronized (vector) {
            for (int size = this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                isServiced isserviced = this.RemoteActionCompatParcelizer.get(size);
                if (isserviced.cancelAll() == 5) {
                    ((lambdanew3androidxcameracoreSurfaceRequest) isserviced).TuitionPaymentFragmentspecialinlinedviewModeldefault2(z);
                }
            }
        }
    }

    public final Vector<isServiced> getInterfaceDescriptor() {
        Vector<isServiced> vector;
        synchronized (this.RemoteActionCompatParcelizer) {
            vector = new Vector<>(this.RemoteActionCompatParcelizer);
        }
        return vector;
    }

    public void TuitionPaymentFragmentbindingInflater1(String str) {
        if (str != null) {
            for (isServiced isserviced : getInterfaceDescriptor()) {
                if (isserviced.asBinder.equals(str)) {
                    this.RemoteActionCompatParcelizer.remove(isserviced);
                    getDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(isserviced);
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Removing child: ".concat(String.valueOf(str)));
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.isServiced
    public StringBuilder b() {
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.protocolId);
        sb.append("&na=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&ca=");
        sb.append(this.asInterface);
        sb.append("&pa=");
        sb.append(a());
        sb.append("&s0=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        sb.append("&t0=");
        sb.append(onTransact());
        sb.append("&s1=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("&t1=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3() - onTransact());
        sb.append("&fw=");
        sb.append(this.onTransact ? "1" : "0");
        return sb;
    }
}
