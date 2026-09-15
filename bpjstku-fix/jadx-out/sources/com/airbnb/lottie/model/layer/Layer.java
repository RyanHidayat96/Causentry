package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.model.content.Mask;
import defpackage.MediaControllerCompatApi21Callback;
import defpackage.MediaControllerCompatApi21CallbackProxy;
import defpackage.createCallback;
import defpackage.getVolumeControl;
import defpackage.onSkipToNext;
import defpackage.previous;
import defpackage.toLegacyStreamType;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Layer {
    public final String INotificationSideChannel;
    public final MediaControllerCompatApi21CallbackProxy INotificationSideChannelDefault;
    public final float INotificationSideChannelStub;
    public final int INotificationSideChannelStubProxy;
    public final float MediaBrowserCompat;
    public final MediaControllerCompatApi21Callback RemoteActionCompatParcelizer;
    public final long TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final List<onSkipToNext<Float>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final previous TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MatteType f366a;
    public final List<Mask> asBinder;
    public final LayerType asInterface;
    public final boolean b;
    public final List<toLegacyStreamType> cancel;
    public final int cancelAll;
    public final int d;
    public final long g;
    public final getVolumeControl getInterfaceDescriptor;
    public final int notify;
    public final int onTransact;
    public final createCallback read;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public Layer(List<toLegacyStreamType> list, previous previousVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, createCallback createcallback, int i, int i2, int i3, float f, float f2, int i4, int i5, MediaControllerCompatApi21Callback mediaControllerCompatApi21Callback, MediaControllerCompatApi21CallbackProxy mediaControllerCompatApi21CallbackProxy, List<onSkipToNext<Float>> list3, MatteType matteType, getVolumeControl getvolumecontrol, boolean z) {
        this.cancel = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = previousVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.asInterface = layerType;
        this.g = j2;
        this.INotificationSideChannel = str2;
        this.asBinder = list2;
        this.read = createcallback;
        this.INotificationSideChannelStubProxy = i;
        this.cancelAll = i2;
        this.onTransact = i3;
        this.MediaBrowserCompat = f;
        this.INotificationSideChannelStub = f2;
        this.notify = i4;
        this.d = i5;
        this.RemoteActionCompatParcelizer = mediaControllerCompatApi21Callback;
        this.INotificationSideChannelDefault = mediaControllerCompatApi21CallbackProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list3;
        this.f366a = matteType;
        this.getInterfaceDescriptor = getvolumecontrol;
        this.b = z;
    }

    public final String toString() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2("");
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("\n");
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Layer layer = previousVar.asBinder.get(this.g);
        if (layer != null) {
            sb.append("\t\tParents: ");
            sb.append(layer.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            previous previousVar2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Layer layer2 = previousVar2.asBinder.get(layer.g);
            while (layer2 != null) {
                sb.append("->");
                sb.append(layer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                previous previousVar3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                layer2 = previousVar3.asBinder.get(layer2.g);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.asBinder.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.asBinder.size());
            sb.append("\n");
        }
        if (this.INotificationSideChannelStubProxy != 0 && this.cancelAll != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.INotificationSideChannelStubProxy), Integer.valueOf(this.cancelAll), Integer.valueOf(this.onTransact)));
        }
        if (!this.cancel.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (toLegacyStreamType tolegacystreamtype : this.cancel) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(tolegacystreamtype);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
