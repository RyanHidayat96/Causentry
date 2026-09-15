package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.nbs.nucleo.utils.exception.ApiException;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"LresetChildren;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Response;", "p0", "Lcom/nbs/nucleo/utils/exception/ApiException;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lretrofit2/Response;)Lcom/nbs/nucleo/utils/exception/ApiException;", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)Z", "b", "Lcom/google/gson/Gson;", "TuitionPaymentFragmentbindingInflater1", "Lcom/google/gson/Gson;"}, k = 1, mv = {2, 3, 0})
public final class resetChildren {
    public static final resetChildren INSTANCE = new resetChildren();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private static final Gson b = new Gson();

    private resetChildren() {
    }

    private static boolean b(String p0) {
        if (p0 == null) {
            return false;
        }
        try {
            new JSONObject(p0);
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        if (p0 == null) {
            return false;
        }
        try {
            new JSONArray(p0);
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static <T> ApiException TuitionPaymentFragmentspecialinlinedviewModeldefault3(Response<T> p0) throws IOException {
        lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0 = new lambdasubmitStillCaptureRequests0(406, "Invalid Response", "Not Acceptable");
        if (p0.errorBody() != null) {
            ResponseBody responseBodyErrorBody = p0.errorBody();
            String strString = responseBodyErrorBody != null ? responseBodyErrorBody.string() : null;
            if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                getContentPaddingRight.b("ErrorResponse ".concat(String.valueOf(strString)), new Object[0]);
            }
            if (b(strString) || TuitionPaymentFragmentspecialinlinedviewModeldefault1(strString)) {
                try {
                    lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests1 = (lambdasubmitStillCaptureRequests0) b.fromJson(strString, (Class) lambdasubmitStillCaptureRequests0.class);
                    if (lambdasubmitstillcapturerequests1 != null) {
                        return new ApiException(lambdasubmitstillcapturerequests1, p0);
                    }
                    return new ApiException(new lambdasubmitStillCaptureRequests0(0, null, null, 7, null), p0);
                } catch (IOException unused) {
                    return new ApiException(lambdasubmitstillcapturerequests0, p0);
                }
            }
            return new ApiException(lambdasubmitstillcapturerequests0, p0);
        }
        return new ApiException(lambdasubmitstillcapturerequests0, p0);
    }
}
