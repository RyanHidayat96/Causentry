package defpackage;

import com.sofakingforever.repoverse.IllegalVersionFormatException;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class getEventListener implements hasAudioEnabled {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getEventListener(String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }

    public static final class b implements Callback {
        private /* synthetic */ hasAudioEnabled.b TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public b(hasAudioEnabled.b bVar) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(call, iOException);
            try {
            } finally {
                AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            String str;
            List<String> listEncodedPathSegments;
            Request request;
            AutoValue_Bitmap2JpegBytes_In.b(call, response);
            HttpUrl httpUrlUrl = null;
            if (response != null && response != null) {
                try {
                    Response responseNetworkResponse = response.networkResponse();
                    if (responseNetworkResponse != null && (request = responseNetworkResponse.request()) != null) {
                        httpUrlUrl = request.url();
                    }
                } finally {
                    AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
            try {
                if (httpUrlUrl == null || (listEncodedPathSegments = httpUrlUrl.encodedPathSegments()) == null || (str = (String) CollectionsKt.last((List) listEncodedPathSegments)) == null) {
                    str = "";
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new getRecordingId(str));
            } catch (IllegalVersionFormatException unused) {
            }
        }
    }
}
