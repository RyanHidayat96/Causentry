package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class onPlayFromUri implements onPrepareFromUri<MediaControllerCompatApi23> {
    public static final onPlayFromUri b = new onPlayFromUri();
    private static final JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1 = JsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b("c", "v", "i", "o");

    private onPlayFromUri() {
    }

    @Override // defpackage.onPrepareFromUri
    public final /* bridge */ /* synthetic */ MediaControllerCompatApi23 TuitionPaymentFragmentbindingInflater1(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.cancel() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        List<PointF> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        List<PointF> listTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
        List<PointF> listTuitionPaymentFragmentspecialinlinedviewModeldefault5 = null;
        boolean zAsBinder = false;
        while (jsonReader.asInterface()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
                zAsBinder = jsonReader.asBinder();
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, f);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                listTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, f);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
                listTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MediaSessionCompat3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, f);
            } else {
                jsonReader.cancelAll();
                jsonReader.onTransact();
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        if (jsonReader.cancel() == JsonReader.Token.END_ARRAY) {
            jsonReader.b();
        }
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || listTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null || listTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
            return new MediaControllerCompatApi23(new PointF(), false, Collections.emptyList());
        }
        int size = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
        PointF pointF = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
            int i2 = i - 1;
            arrayList.add(new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onSetRepeatMode.b(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2), listTuitionPaymentFragmentspecialinlinedviewModeldefault5.get(i2)), onSetRepeatMode.b(pointF2, listTuitionPaymentFragmentspecialinlinedviewModeldefault4.get(i)), pointF2));
        }
        if (zAsBinder) {
            PointF pointF3 = listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0);
            int i3 = size - 1;
            arrayList.add(new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onSetRepeatMode.b(listTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i3), listTuitionPaymentFragmentspecialinlinedviewModeldefault5.get(i3)), onSetRepeatMode.b(pointF3, listTuitionPaymentFragmentspecialinlinedviewModeldefault4.get(0)), pointF3));
        }
        return new MediaControllerCompatApi23(pointF, zAsBinder, arrayList);
    }
}
