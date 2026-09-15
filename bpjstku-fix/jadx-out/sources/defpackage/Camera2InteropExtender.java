package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LCamera2InteropExtender;", "", "<init>", "()V", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2InteropExtender {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "-----BEGIN PRIVATE KEY-----\n                    MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC8zlWSy1+0SNrz7dmJYB+MMwxq\n                    4vQB9lyDayQa5Jn/3AWok5pt3dP/75kfwNTTXlNUceRmdNfoHwAxFPIa6foLLOsmL1cXSO4x2NN2\n                    Ysw7fyBjadkfGaTHmwQSl8kMbGa5mZXxFs8G1h5NPqNeKFPDhdAA248H+PPzf0slrtuFtqYrsemL\n                    t+5DWEc6HjzAwseOpA0L25z/XtMAqCo3ycYbC4sciGjLlqm5fLTGDTo4ZzyC+U/LBppTnb9e9CuS\n                    5WUvr/4mLzXvbBA8ZwOLnVUZWeBAkgMhvzUwWWm4Y5b/MiTIURNnVxEL5HpMSWWt20jfNcGkBwG2\n                    nlI0JE1sSwkvAgMBAAECggEAKD9p4YWGDMX9GsOovE6n2vik3IIt1t9AIGmuBCeYJoEuGZ4BbQs9\n                    HpFiWHEATWCNrfIraKXewqYdIdlftNoMyeYU6Ipt69JJqImapmFwPPygGGEffjA2vrAuYZJGsuXG\n                    zijN3Ftq3X+2bOv94lwBYyw6x3wGVQI+arlHeSx5slp7/GBSQmlwZA2CX+ZDmGyDBrAlUGIMXE3Z\n                    7gzQQw+CyDDotnO5NbQ581xpidPtZjZ93PIYOJlGzoH/4gGHD7ShlT4OTzXUK6O6DLVb8Tm9DLUM\n                    ObuuM1DEzwQKyId8VhwX+5Z6XGepWhy+A1f5J+nD4ngbuIAp++Dgb2ASPi7DkQKBgQDd0CwKyBHk\n                    ulj37DWFvpRulXssydNAsXQqC6NIzsKVReqIhHQ/UgelXerQqBfmoeEJpI1wdCIfqmniby9Qty4Y\n                    Agip/JNYZteJ3qSisEFwa1nYmaQ4z7k9JS+03SsVgIqGRjmWus3Uly0NEp1PjKSyWQ9KdXtuZJip\n                    AoCEVS/MsQKBgQDZ59X49GDk3koqfhAVtIedjGR50LVYzp9xiXgZILAUbRbOJKoGSMfNIGc01ydb\n                    X42guWzi6LxgynutliDEvI1OVcgHDtypkPl/Ysgl0tEGyEHQwaNnZ+Ap3xPLVG5kF3QUjy9pDP6z\n                    FSTuN8HwLqDKUpXygKZD39+PE75YLiYr3wKBgDI1tDKAlWRUNl1wj7EFse3SUn6R9Qr44FXAKqcJ\n                    foxxtiRO702CEQ8C0muHEVn4nMsk/4tMDolidvN1vZ0kyf9PPozUCrqBFRs1Vckp4rZC5qScKstd\n                    Yg4QQ9tKET2dyj2Y2eJfyMXtrpn987QVHxbsCAUP0O/tP41KbrMF4XsRAoGAM6Y+E4ppRRZjYfsL\n                    ePmXg4J5dl4//dLL/C9nZh1XXyAUXbxXCLJLmZVqoR22WHQnr8cDxi0AKbkU46pIDhnbLIwso2+k\n                    YhTY7pbNdhmoLgFdiEu9nY8DlSkpGfLjT5o3i3/87tuDq5MBc+2HbJTAy/QTUq2nu0LfTJyTa3dU\n                    2OUCgYBUe6ciS24sZXcgyT+9eNhZenOomfWnHumxNvsu6TudHabiaNhCtAXT/wXD6IpS2E8I62v/\n                    Bty+KIeZ1FLKeBkd0sbkfE7cPoK7L0xT6HchgfzxTGhQWYKdhjcmOBCW4lpa9TN6zS/azvGTpla8\n                    ghXHMnmo9P7Gr7vGlZ93EKuUJw==\n                    -----END PRIVATE KEY-----";
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "-----BEGIN PRIVATE KEY-----\n                    MIINwwIBADANBgkqhkiG9w0BAQEFAASCDa0wgg2pAgEAAoIDAQCE0NuyNjE7GkWpEfzzNryZ/ftJ\n                    /OYTF5aMMxL/vCmHmchMOFwjaqhsQs4nPDUeSwNaLlmYMmgtbFIO+jqk53z+3H9WnWaJfWFElh+6\n                    RvmUTZQ+GhRFvzLjeFEE1d2uZUOiW2Fp3z8tN9xk90tzPQEJEOD1TyjdVY6hedWcVlSmosFr2+WX\n                    YEggSvJVKxErlitOQDdmTu0m8JJqGs7Eg4dhyxLes8aSX28JUSB4F7LEraDIlxXNBdH6GXTSYBeu\n                    48ezWwAqDy9B+bLjUruk1aSnC5iwl3CzuWMjZpMZFCOBCBhq6bDe8rppKjHlOAwPvCWNvtNjd7mW\n                    Oxlea1Uv4CqsT5Vm15p4sUtgWRKXcs4RT4ab44iDW8Q8X0aLE/qpXyj+cKADByH9f1rA5yastxDQ\n                    fZQ3nj0Sl3vz7KJsCKM56Wuy7V06SxMoIIlFh9zczBsRyyjptGVaMKfryoKoV+86XdfQ2Us34p83\n                    ltqqcRxYbwEXGqi46AY+4KgD6Ukqk3MjPF0vOiAgG+BAPFdwYy3qg6B68BN9Tt0gtmtPBgZmgYRi\n                    uUcQApQSGiPYugTbq4IbMVQGf+qBssCN5Do/Mf79PXu6sxEnx/Q/hQy5jfpJaKSx08MFZxc0i2wn\n                    Xnnml4XVaP4gb9X5n/JB7HmhyQYW4RTMGVcBchTkHWiZPwuuyI8nPKMn29f1Fp1gTrg72ZH3JiCL\n                    Wo/L6RmBfkWwC8SEQ7+dr+/QmCaNLFbEuPhx2PkCILABe+W8zu9K45Wz9v3kKv9FnYWxG1k5hopR\n                    7embbiUaYK+Vl0I4/2EOprIZ8lIX5SDkqm92B1lS1EgRnTfUhe+uHpVNv7NzLFPt65gfvRwpPM5k\n                    n958NStGK1dya640RLPYlBdTsZx8DWrUf/LtTg3PBJDcMRdbdUq18iFH3bZxlu/1/+TwGNAjODV1\n                    COARXt9Nf7J9gbrhPWP1v02f3owKNXAKOi4xrOvitFJUvf7R5aNXzD/9PlfMdfX9fHaCcZ9yGZfV\n                    A3uGaPTuLh8CAwEAAQKCAwAEwmlFCx0bhZb+docOfiUnDYtuPNJP19YMwx3IrUj9s3ySgqiGmmFb\n                    s88oZ8dthPmjRyrtwcyq6AlOwRfN5f+8MFGd3HkarzQHnauYZMe30UnhKdUVJMNhlGOu3S0a/UT9\n                    sfGdNiNQ7wIGWjhJcmOxm/m7wLDxsYmxbqjBd/SDnix5PYGOOaSMB7OEas0sNy7pGHMDxwtHjHJq\n                    u/gx4Za94eWUtnOEtkfH2TDlLNA6rRAocAWXecBrCnN9wHTIzx/OZRHt7+pdHmITNFlGEGPcmpVH\n                    qr2eqyOK1repu+eDzbL2TdaJPsCAWUM9eBMykybzW+W+WEF9yTNhB06frxRIZXewnkRKU+wkET0R\n                    0UriIuvrdS1kq6quESn5fOdMH31cFNQfF6fXqjMp236uzMac+gsQLSr6GhSWiqHNZkfXIO67lDb1\n                    ilAu7W+N3s8C2IuVySZ3rX++SiUSVYj2GGSZvlgoA0lnQMc82jqOxgvifWPYHJv0OFhU838B2N/G\n                    107JOsBswYjeRcTeAmSAlF5LKJDWF+W8bQfiZQRgYfrtC2mxCArCozpt2ZePTgyuluIllWtLuJo4\n                    qTcuzpbV3uEpjVrtrNwbP7T0m0XwtBXHcH8jV2Ra0vM2Iaf6Cg/RbBdj2NYNIjzxoXQdG2V0qMh1\n                    agjJGG3LO9CNzHqLsrK+p4XGEncskF+Vnd8uRLqsFX5Q+8ZR4/q4BfIo4mHfu+8xDxLnHf7qbrtE\n                    TDxSprOCGR27Ed0bZBW6sgLON4ykXld1IIb6wypnWepSozSOwhSeOt/LV6xQOYedmV2pGWOklPz6\n                    7KKTZ9jnfZ+E5wikUIr3Rrr8WotUw1ylUkw3TBk6gHPqv5OawgLTLGwoNkoxwaESbo+tlc9BEVq8\n                    fCPu7QqvYj4z7ul4syPcZ08K4iVdLvZH3LT60k1yfge0HkyELxcybUgPRin7U+FYjSebF1Ni0D9N\n                    Up13aJ+tPB9Vp+aKaEDAXUmnY6dSKt1O1LRV3Zmw+lpFMQLuQo8FiSeVnC0CggGBALkeZiMW4oMk\n                    4MagMwl3l+fdOYTOrmdhmySqe0APvqJQ8pgxXp2hVRfXFF1jcvEU+KXF4TqIyyl0mrrRqV9lMEIy\n                    KOo1hZSguJWx/QzqM2CLE5H0KaVPrGJWCwrRKvTKiuA7i6k7P3lDsoF4ad7OiDprMuyxuvHDJYRZ\n                    /1SjW34wnlpubcU7a4U8UOIXIvJZBwKQPyjdFgBKRZzPQyQR+m9//jBNR6ngKxWNruVj7qc5BUZB\n                    M5zf3StzVIZeNA/2oF8HPQ39k2SJYTRQi3c2PF0D9u/udvs3r7dItcc7lAh+QGYZH9pQDUmcJh//\n                    8viYCxZ0aowwLzP9VivRKst9E/aIixYhwxRL5Eng5rDJXVTO9f8S1UVTYFSSPq2qKdl0oLGqZ/w2\n                    sMdHeQ1sbOe5dvh5T1Xpz5ABdh4y6iSETid1vQqDWVyEHhqkTD9nWUg0oDDOluBOIwVqj4R7lmbA\n                    DCi5jP0T7ftcJQn84+cIjDP7GmKj/3SkMeDmgfPrj+PFKwKCAYEAt6un2plVuXRyxdTE+HUAZaR+\n                    wwko4RWcTc/KoDpSHoTALd06SmBB93rhmgLo1VMlSTXwkvdmtvnDf7U90POqHLYjOucyEbqyEF+6\n                    YUJvz7WpjzgzDMchc40r8y4bft0wKMRgbbC8qvAynCdCm1Qwxcm9j0Ma0TYSInGsgVoumRnULPoc\n                    a3NxSexqdE6y5w1Hs4259g0iJ4x+q1ePJsjojIh164QeNlhO2nzZzzJbZ3h0xsNlzRIS1prT6pRw\n                    h2OiTl2vAC32fnXFmXSnDeFwfmboUvIDa1q9KxxJ4truU6j8EQA3wcN8WkCvyhGypCVa+wknDSmR\n                    nWrJxiLM9bR+wRXIC82OoRa1Ayg/gAX8gj5kz84QDEAh/8PEuaK0Pzrj322gPrUWPtAortAwdyjj\n                    EPNsFkgmZABBtsIRlL+3SbGCBfzhZB94GaDOWL9n59AP58WMdL64HUXhuwD7eDjtIpxhoZULdNJZ\n                    3bTybjpvVrqw0CtzrKeVA7PA7vZE2ujdAoIBgQCch8/lq9ws+Gn4ik2dm7qfHLkeS4W9dRMyldVR\n                    /f48UiZP+q7+qwTA++UEcqsmn40A36nrTPA9RZPwlIibWXzM/I0MPeWOH7j1G2PWH9MBt5f8unDc\n                    j9o77HW519Ry2TFFGhSmLKsnZs7yG1eqRwl6HFsbOc3R0ClRGKiGcPtUYNgFr4qyU+Q+7RmXk+jA\n                    8/axfDdr3kZUSHlEdx1Wyrzwu1G8lhwa0KqdtwhEf5O1YsnK9icmZ0UlEIhQdieft/MzZ3OA+QJA\n                    6MmA6vqC+yFfpZKQnxuMoTG70YejyAUMiXT64BPHDhmuPJMgS9Sv0CDQA/B0SeogE/9hXaTKHCFd\n                    PWgedr3105ZdwgZPRnXc2IO6A7rCvBWgbWkCf/iTH8Mhd+4lnjksyIrbhusvpeurfyhOhT41jobK\n                    UlMaPaW4SB5pXVeamzy5WmP+2Ozt2VH68zUwxeFnGwvwAnDSwWGGrh9BgDCjcu7+2w/6s4eaDKHq\n                    9rFzd8OVYFRSZMVu27ECggGAWiqVy5XM5K9LDN2IGOTvXfakGEEt5VnDktt4gLJA0CShZ6KcVBjv\n                    KXwUtpPJE7iurEMjqDJ2JUt18wLZpvOHxnKP1wHaraN2eN1V1RtVYqWu6NVREmvLezuJoOc4rk4N\n                    r2XAZPkHle83GTuY0kJBc0e3nFX4G06tFmWxpwrLp3Nrmuzp+MICkqTSGejsoMr/MSFZcnY+FyY8\n                    pQbmCsdEioEPSqBgaJNvmokCMFprTt9ujIkuN78wqlP1xso6d+ysqEYLfE4UHT7Z05zVydWrcRI5\n                    6UZP8WrpRPmtOAX8S+vAWuQ9ewzpxjDNW6jWhwijomt61VZb2uiqx28cKV8DfuyfeVPfOiu4jyU6\n                    DzJhJNtWiEGD1U/CoRnNQMikLgpOBch+i2pA0nNEFZW0xTq4RgEKReIDnsIVgI/DK7/2TeIrj572\n                    Uz2zqvkrc5v7eWzF8iUj78gVAKHmz/QKf5mKqJwWvck6h44geduzy/M551zdIkTCk7btS5T6GRWi\n                    9citAoIBgQCdJ+WbG3kJx6pLGvYcgUbiOvQJhUzRkmpqyQO940zZH+kq4mwQTnXdoxvUVCaCwC58\n                    b4Ibv4DYWC6ykQZK6afUCdoxRux9FPX3f+JPseUCq+mPF8u/DaSPRt70QbwP9galQFXMYadXDAc0\n                    8YymFe65U0OV0I+SmJsepjubMFueaeWW/ET0WJMmLf5NML538rbOsZL26qYHnGmip4TmEoUqxU5B\n                    QYGK2wMotm72fxyRwvogiW96W70lPVDWol+ARg+pkkH7XxMAj1XOXHCtt2OtCG+k6j/SxTWgOA8W\n                    Tl194KyRBoGQVn1cze3SVVl8UNXT2fiwC+wiG0DCXnfo9f7ztGL3HNZbu1nakaKwURexR2wEV+6m\n                    Wi7ghd/w4A5IFzcRIm8Fg1OaybrEQq9ovR1Ndu3x6eQCdXnhEZm467vDbPeRs7Z+G2R36YcIQaLv\n                    KZAuhBeN7m5Qyn0yX6upufEgsnqRaiX/m2USeJ7l9fO/+uEEPnce+sCBfQmvq/quHu8=\n                    -----END PRIVATE KEY-----";
    private static String b = "-----BEGIN PUBLIC KEY-----\n                MIIDIjANBgkqhkiG9w0BAQEFAAOCAw8AMIIDCgKCAwEAwHxS9io7LFDzsFNA4fi72FHvosGVRPe7\n                e6Y7QjqxWXvJGNXyQKRVczaqf5tfqNkS42p4/KTY86lqOG6Sgd+TIII4oBZytILsU1jH79PluGYa\n                EEUF/+aWecEDtY87nQVOLa6ocdDNepQGJ3OO5qyzWZOE0PDKPLAQPh5tUoIAYJ3G9Tsu1mpOnQO9\n                vLcyYsGovmMjNeayuwFeJNEVvTNCAiM4J5Ezyp/Bsfroc/xb2pGk/WOq8yetixoGtVPZnHmMCdYQ\n                rDAsCmTqLwRHsj6cnpSjSzxUnXO4hzKzUGk4xyL8vlR9J7JA/YO7QEx6iXzkP3Wmw9hIpSQneKqU\n                jj3Q3tApQTq19joHTLOP0ta8AmJlET+mHTXBIsebJnH+CFMEQAJvjNFTySbPlBlIBEDpYNbXZRJG\n                3GaT+SaO83yXXiapxxJUgfqhjkOlTrdh9EJRZv/tI20G2usrBABXCnsKO/4EWTaD0IVhdandXVfQ\n                YwqPx0JALWbV84hJydF6Kv44bNL1NCwjMQ02aYaBG8uSx3O/u+ft96wJ2JzgTSqEbUDvNqZoTN0i\n                uRSijp+ma9zOT+83z51OAnbtNirl65qfxjGKKGuUHKH0vL7AtRHYjBVB4mhJJK5YCkw9qNtUeUTD\n                uzG3lmpdeYxd1p8EhQ6zL/XaYDgNm6WPY8Oa564kTNjOqXLx1+BcJQxLClxwcQ/W6DGjByhJ85/P\n                1Kkr5bRMzxEIDlnFwEifW8UuyTn3VB0XVn4TNohBXrAOKIOXJe781gkoOAuODG6enfv77145BFTm\n                w64w7MdqFPaBL0b+JKgAz4wRERYeKlfSiIXpQpsTY4uwVvqDSvWAwF/r99sUFu6ceZBwdnpzI4Kh\n                uWgWIn1Oo30CznziiD8A7d7ARuOyjCJtkaFoQiUEM/8vvK15jf0K0s7BoCLbRZOXhcDW/1g+q4Iu\n                HkyBSbiO89oBHqejzA6EPeAsIrdl7cG7YmrhR6jC/8/sS6xhFFodNyqzjP9lVLCe6Wf2SVJvvm32\n                z4qVAgMBAAE=\n                -----END PUBLIC KEY-----";

    /* JADX INFO: renamed from: Camera2InteropExtender$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0007J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J \u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\n\u0010%\u001a\u00020\u0005*\u00020\u0005J\n\u0010\u0016\u001a\u00020\u0005*\u00020\u0005J\n\u0010\u0019\u001a\u00020\u0005*\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bpjstku/util/utils/EncryptionUtils$Companion;", "", "<init>", "()V", "ALGORITHM_NAME", "", "ALGORITHM_NONCE_SIZE", "", "ALGORITHM_TAG_SIZE", "ALGORITHM_KEY_SIZE", "PBKDF2_NAME", "PBKDF2_SALT_SIZE", "PBKDF2_ITERATIONS", "RSA_SHORT_KEY", "RSA_LONG_KEY", "RSA_PUBLIC_KEY", "encryptString", "plaintext", HintConstants.AUTOFILL_HINT_PASSWORD, "flags", "decryptString", "base64CiphertextAndNonceAndSalt", "encrypt", "", "key", "decrypt", "ciphertextAndNonce", "digest", NotificationCompat.CATEGORY_MESSAGE, "alg", "format", "bytes", "decryptStringRsa", "ciphertext", "isLongType", "", "ecryptStringRsa", "toSha256", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final byte[] $$c = {30, 17, -35, 104};
        private static final int $$f = 243;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {93, -122, -23, -24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 50;
        private static final byte[] $$a = {99, -43, -44, -62, -1, -31, 11, -33, 64, -63, -25, -17, -1, -14, -5, 55, -31, -48, -17, -2, -7, -23, -21, 31, -45, -15, 3, -21, -8, -25, 33, -47, -15, -11, 9, -23, 1, -12};
        private static final int $$b = 148;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int b = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45558, 38241, 63698, 56361, 9154, 1788, 27221, 45494, 38171, 63694, 57334, 9037, 1706, 27164, 45425, 38107, 63528, 57326, 9001, 1645, 28120, 45368, 38043, 64508, 45563, 38245, 63696, 56325, 9091, 1780, 27229, 45502, 38165, 63621, 57334, 9051, 45558, 38241, 63698, 56361, 9154, 1788, 27221, 45494, 38171, 63694, 57334, 9037, 1706, 27164, 45425, 38107, 63528, 57326, 9001, 1639, 28104, 45369, 38034, 64497, 57177, 8914, 45557, 38259, 63722, 56361, 9112, 1785, 27202, 45501, 58033, 50735, 43930, 36688, 28867, 21934, 14603, 58080, 50776, 44030, 36023, 28690, 21987, 21438, 30496, 6805, 15965, 49608, 58535, 34832, 21488, 30556, 6865, 15780, 49439, 58589, 34892, 21281, 30360, 6762};
        private static long TuitionPaymentFragmentbindingInflater1 = -6087238833762626304L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r0 = 19 - r6
                int r7 = r7 * 6
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = 106 - r8
                byte[] r1 = defpackage.Camera2InteropExtender.Companion.$$a
                byte[] r0 = new byte[r0]
                int r6 = 18 - r6
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r6
                r8 = r7
                r4 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-10)
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2InteropExtender.Companion.c(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 84
                int r7 = r7 * 52
                int r0 = 53 - r7
                int r8 = r8 * 52
                int r8 = 55 - r8
                byte[] r1 = defpackage.Camera2InteropExtender.Companion.$$d
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r8 = r8 + 1
                r3 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2e:
                int r6 = r6 + r8
                int r6 = r6 + (-11)
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2InteropExtender.Companion.d(int, int, int, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $11 + 71;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i >>> i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2187;
                            int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39;
                            byte b2 = (byte) ($$f & 14);
                            byte b3 = (byte) (b2 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, keyRepeatTimeout, i6, 841711447, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33017), 3012 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 27, 321985076, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            try {
                                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cMyPid = (char) ((Process.myPid() >> 22) + 36505);
                                    int bitsPerPixel = 3375 - ImageFormat.getBitsPerPixel(0);
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 17;
                                    byte b6 = (byte) ($$f & 5);
                                    byte b7 = (byte) (-b6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyPid, bitsPerPixel, iNormalizeMetaState, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2187;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 40;
                            byte b8 = (byte) ($$f & 14);
                            byte b9 = (byte) (b8 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(edgeSlop, i8, longPressTimeout, 841711447, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = (byte) (b10 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33016 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0) + 3012, View.combineMeasuredStates(0, 0) + 26, 321985076, false, $$g(b10, b11, (byte) (b11 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cGreen = (char) (36505 - Color.green(0));
                                int scrollBarFadeDuration = 3376 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17;
                                byte b12 = (byte) ($$f & 5);
                                byte b13 = (byte) (-b12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cGreen, scrollBarFadeDuration, scrollDefaultDelay, -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i9 = $10 + 121;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cLastIndexOf = (char) (36504 - TextUtils.lastIndexOf("", '0'));
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3376;
                    int scrollBarSize = 17 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b14 = (byte) ($$f & 5);
                    byte b15 = (byte) (-b14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf, packedPositionGroup, scrollBarSize, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
            }
            objArr[0] = new String(cArr);
            int i11 = $10 + 45;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }

        public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Companion companion, String str, String str2) throws Throwable {
            int i = 2 % 2;
            int i2 = b + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, str2, 0);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            return strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, int i) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            char[] charArray = str2.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "");
            PBEKeySpec pBEKeySpec = new PBEKeySpec(charArray, bArr, 32767, 128);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            Intrinsics.checkNotNullExpressionValue(secretKeyFactory, "");
            byte[] encoded = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(bytes, encoded);
            byte[] bArr2 = new byte[bArrTuitionPaymentFragmentbindingInflater1.length + 16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            System.arraycopy(bArrTuitionPaymentFragmentbindingInflater1, 0, bArr2, 16, bArrTuitionPaymentFragmentbindingInflater1.length);
            String strEncodeToString = Base64.encodeToString(bArr2, i);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            int i3 = b + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            return strEncodeToString;
        }

        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                byte[] bArr = new byte[16];
                int length = bArrDecode.length - 16;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArrDecode, 0, bArr, 0, 16);
                System.arraycopy(bArrDecode, 16, bArr2, 0, length);
                char[] charArray = str2.toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "");
                PBEKeySpec pBEKeySpec = new PBEKeySpec(charArray, bArr, 32767, 128);
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
                Intrinsics.checkNotNullExpressionValue(secretKeyFactory, "");
                byte[] encoded = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Intrinsics.checkNotNullExpressionValue(encoded, "");
                String str3 = new String(TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2, encoded), Charsets.UTF_8);
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                b = i2 % 128;
                if (i2 % 2 != 0) {
                    return str3;
                }
                throw null;
            } catch (Exception unused) {
                setCaptureRequestTemplate setcapturerequesttemplate = setCaptureRequestTemplate.INSTANCE;
                setCaptureRequestTemplate.TuitionPaymentFragmentbindingInflater1("decryptString");
                return "";
            }
        }

        private byte[] TuitionPaymentFragmentbindingInflater1(byte[] bArr, byte[] bArr2) throws Throwable {
            int i;
            int i2;
            int i3;
            SecureRandom secureRandom;
            int i4;
            Method method;
            Method method2;
            Constructor constructor;
            int i5 = 2 % 2;
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getLongPressTimeout() >> 16, (KeyEvent.getMaxKeyCode() >> 16) + 24, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            String str = (String) objArr[0];
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            SecureRandom secureRandom2 = new SecureRandom();
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            Constructor[] constructorArr = {Class.forName("javax.crypto.spec.SecretKeySpec").getDeclaredConstructor(byte[].class, String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i6 = 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int defaultSize = 22 - View.getDefaultSize(0, 0);
                byte[] bArr3 = $$d;
                byte b2 = bArr3[7];
                Object[] objArr2 = new Object[1];
                d(b2, b2, (byte) (-bArr3[5]), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i6, defaultSize, 1814927978, false, (String) objArr2[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) != null) {
                i = iIntValue;
                break;
            }
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2823, 21 - ExpandableListView.getPackedPositionChild(0L))).getDeclaredMethods();
            int length = declaredMethods.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i = iIntValue;
                    break;
                }
                Method method3 = declaredMethods[i7];
                try {
                    Class<?> cls = Class.forName(str);
                    Method[] methodArr = declaredMethods;
                    int i8 = length;
                    Object[] objArr3 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr3);
                    Object[] objArr4 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr3[0], null).invoke(method3, null)).intValue())};
                    Object[] objArr5 = new Object[1];
                    a(35 - MotionEvent.axisFromString(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, (char) View.combineMeasuredStates(0, 0), objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    i = iIntValue;
                    Object[] objArr6 = new Object[1];
                    a(Color.argb(0, 0, 0, 0) + 62, View.getDefaultSize(0, 0) + 8, (char) (Process.myTid() >> 22), objArr6);
                    if (((Boolean) cls2.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, objArr4)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Class<?> cls4 = Class.forName(str);
                        Object[] objArr7 = new Object[1];
                        a(Gravity.getAbsoluteGravity(0, 0) + 70, 13 - View.MeasureSpec.getSize(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 21322), objArr7);
                        if (cls3.equals(cls4.getMethod((String) objArr7[0], null).invoke(method3, null))) {
                            Class<?> cls5 = Class.forName(str);
                            Object[] objArr8 = new Object[1];
                            a(TextUtils.getCapsMode("", 0, 0) + 83, 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (57925 - View.combineMeasuredStates(0, 0)), objArr8);
                            Object[] objArr9 = (Object[]) cls5.getMethod((String) objArr8[0], null).invoke(method3, null);
                            if (objArr9.length == 2 && Long.TYPE.equals(objArr9[0]) && Class.forName(str).equals(objArr9[1])) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                    int longPressTimeout = 2823 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                    int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    byte[] bArr4 = $$d;
                                    byte b3 = bArr4[7];
                                    Object[] objArr10 = new Object[1];
                                    d(b3, b3, (byte) (-bArr4[5]), objArr10);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, longPressTimeout, keyRepeatTimeout, 1814927978, false, (String) objArr10[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method3);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                    int mode = 2823 - View.MeasureSpec.getMode(0);
                                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 22;
                                    byte[] bArr5 = $$d;
                                    byte b4 = bArr5[7];
                                    Object[] objArr11 = new Object[1];
                                    d(b4, b4, (byte) (-bArr5[5]), objArr11);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, mode, iIndexOf, 1814927978, false, (String) objArr11[0], null);
                                }
                                try {
                                    Object[] objArr12 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cRed = (char) Color.red(0);
                                        int iAxisFromString = 2822 - MotionEvent.axisFromString("");
                                        int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                                        byte[] bArr6 = $$d;
                                        Object[] objArr13 = new Object[1];
                                        d(bArr6[54], (byte) (-bArr6[5]), bArr6[7], objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iAxisFromString, i9, -2137287382, false, (String) objArr13[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr12)).longValue();
                                    break;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    i7++;
                    declaredMethods = methodArr;
                    length = i8;
                    iIntValue = i;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int mode2 = 2823 - View.MeasureSpec.getMode(0);
                int iMyTid = (Process.myTid() >> 22) + 22;
                byte[] bArr7 = $$d;
                byte b5 = bArr7[7];
                Object[] objArr14 = new Object[1];
                d(b5, b5, (byte) (-bArr7[5]), objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, mode2, iMyTid, 1814927978, false, (String) objArr14[0], null);
            }
            Object[] objArr15 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int offsetBefore = 2823 - TextUtils.getOffsetBefore("", 0);
                int iArgb = Color.argb(0, 0, 0, 0) + 22;
                byte[] bArr8 = $$d;
                Object[] objArr16 = new Object[1];
                d((byte) 14, (byte) (-bArr8[5]), bArr8[7], objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, offsetBefore, iArgb, 1025296417, false, (String) objArr16[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr15);
            Object[] objArr17 = {0, constructorArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-687574488);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37657);
                int keyRepeatDelay = 2720 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19;
                byte[] bArr9 = $$d;
                Object[] objArr18 = new Object[1];
                d(bArr9[33], (byte) (-bArr9[5]), bArr9[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c2, keyRepeatDelay, keyRepeatTimeout2, 865785343, false, (String) objArr18[0], new Class[]{Integer.TYPE, Constructor[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr17)).longValue();
            long j = -677847328;
            long j2 = (((long) 866) * j) + (((long) (-864)) * jLongValue);
            long j3 = -1;
            long j4 = jLongValue ^ j3;
            long jMyTid = Process.myTid();
            long j5 = jMyTid ^ j3;
            long j6 = 865;
            long j7 = j2 + (((long) (-865)) * (j4 | (((j ^ j3) | j5) ^ j3))) + (((jMyTid | j) ^ j3) * j6) + (j6 * (((j4 | j5) ^ j3) | ((j5 | j) ^ j3))) + ((long) (-346208294));
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = (~(1459242084 | iIdentityHashCode)) | (-1476093429);
            int i11 = ~iIdentityHashCode;
            int i12 = ((int) (j7 >> 32)) & (1596812044 + ((i10 | (~((-1381647457) | i11))) * 886) + (((~(i11 | (-1459242085))) | (-1398498801)) * (-1772)) + ((~(i11 | (-1398498801))) * 886));
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i13 = ~iIdentityHashCode2;
            int i14 = (((int) j7) & ((-1622311170) + ((1950725725 | i13) * (-757)) + ((~((-34226593) | iIdentityHashCode2)) * 1514) + (((~(iIdentityHashCode2 | 1984952317)) | (~(i13 | (-907015161))) | 872788568) * 757))) | i12;
            int i15 = i14 >>> 24;
            int i16 = i14 & ViewCompat.MEASURED_SIZE_MASK;
            if (i15 != 0) {
                int i17 = b + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i17 % 128;
                int i18 = i17 % 2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            arrayList.add((i2 == 0 || i16 >= 1 || (constructor = constructorArr[i16]) == null) ? null : constructor.toString());
            if ((i15 + 6) * i2 != 0) {
                throw new RuntimeException(String.valueOf(i));
            }
            ArrayList arrayList2 = new ArrayList();
            byte[] bArr10 = $$a;
            byte b6 = (byte) (bArr10[36] - 1);
            byte b7 = b6;
            Object[] objArr19 = new Object[1];
            c(b6, b7, b7, objArr19);
            Class<?> cls6 = Class.forName((String) objArr19[0]);
            byte b8 = bArr10[26];
            Object[] objArr20 = new Object[1];
            c(b8, b8, (byte) (-bArr10[19]), objArr20);
            Method[] methodArr2 = {cls6.getMethod((String) objArr20[0], byte[].class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int defaultSize2 = 2823 - View.getDefaultSize(0, 0);
                int bitsPerPixel2 = 21 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr11 = $$d;
                byte b9 = bArr11[7];
                Object[] objArr21 = new Object[1];
                d(b9, b9, (byte) (-bArr11[5]), objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf, defaultSize2, bitsPerPixel2, 1814927978, false, (String) objArr21[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                b = i19 % 128;
                int i20 = i19 % 2;
                Method[] declaredMethods2 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), AndroidCharacter.getMirror('0') + 2775, ExpandableListView.getPackedPositionType(0L) + 22)).getDeclaredMethods();
                int length2 = declaredMethods2.length;
                int i21 = 0;
                while (i21 < length2) {
                    Method method4 = declaredMethods2[i21];
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i23 = i22 + 37;
                    b = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = i22 + 27;
                    b = i25 % 128;
                    int i26 = i25 % 2;
                    try {
                        Class<?> cls7 = Class.forName(str);
                        Method[] methodArr3 = declaredMethods2;
                        Object[] objArr22 = new Object[1];
                        a((ViewConfiguration.getPressedStateDuration() >> 16) + 24, View.resolveSizeAndState(0, 0, 0) + 12, (char) View.MeasureSpec.getMode(0), objArr22);
                        Object[] objArr23 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr22[0], null).invoke(method4, null)).intValue())};
                        Object[] objArr24 = new Object[1];
                        a(KeyEvent.getDeadChar(0, 0) + 36, 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) View.getDefaultSize(0, 0), objArr24);
                        Class<?> cls8 = Class.forName((String) objArr24[0]);
                        int i27 = length2;
                        Object[] objArr25 = new Object[1];
                        a(62 - (ViewConfiguration.getScrollBarSize() >> 8), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr25);
                        if (((Boolean) cls8.getMethod((String) objArr25[0], Integer.TYPE).invoke(null, objArr23)).booleanValue()) {
                            Class cls9 = Long.TYPE;
                            Class<?> cls10 = Class.forName(str);
                            Object[] objArr26 = new Object[1];
                            a(70 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.getOffsetBefore("", 0) + 21322), objArr26);
                            if (cls9.equals(cls10.getMethod((String) objArr26[0], null).invoke(method4, null))) {
                                Class<?> cls11 = Class.forName(str);
                                Object[] objArr27 = new Object[1];
                                a(View.MeasureSpec.getMode(0) + 83, MotionEvent.axisFromString("") + 18, (char) (57925 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr27);
                                Object[] objArr28 = (Object[]) cls11.getMethod((String) objArr27[0], null).invoke(method4, null);
                                if (objArr28.length == 2 && Long.TYPE.equals(objArr28[0]) && Class.forName(str).equals(objArr28[1])) {
                                    int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                                    b = i28 % 128;
                                    if (i28 % 2 != 0) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2824;
                                            int i29 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
                                            byte[] bArr12 = $$d;
                                            byte b10 = bArr12[7];
                                            Object[] objArr29 = new Object[1];
                                            d(b10, b10, (byte) (-bArr12[5]), objArr29);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionGroup, packedPositionChild, i29, 1814927978, false, (String) objArr29[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, method4);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2823;
                                            int i30 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                                            byte[] bArr13 = $$d;
                                            byte b11 = bArr13[7];
                                            Object[] objArr30 = new Object[1];
                                            d(b11, b11, (byte) (-bArr13[5]), objArr30);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(edgeSlop, iResolveSizeAndState, i30, 1814927978, false, (String) objArr30[0], null);
                                        }
                                        Object[] objArr31 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                            char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                                            int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int iIndexOf2 = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                            byte[] bArr14 = $$d;
                                            Object[] objArr32 = new Object[1];
                                            d(bArr14[54], (byte) (-bArr14[5]), bArr14[7], objArr32);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, maximumDrawingCacheSize, iIndexOf2, -2137287382, false, (String) objArr32[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr31)).longValue();
                                        break;
                                    }
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                        char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                        int i31 = 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int defaultSize3 = View.getDefaultSize(0, 0) + 22;
                                        byte[] bArr15 = $$d;
                                        byte b12 = bArr15[7];
                                        Object[] objArr33 = new Object[1];
                                        d(b12, b12, (byte) (-bArr15[5]), objArr33);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, i31, defaultSize3, 1814927978, false, (String) objArr33[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, method4);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                                        int i32 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2822;
                                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                                        byte[] bArr16 = $$d;
                                        byte b13 = bArr16[7];
                                        Object[] objArr34 = new Object[1];
                                        d(b13, b13, (byte) (-bArr16[5]), objArr34);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cLastIndexOf2, i32, pressedStateDuration, 1814927978, false, (String) objArr34[0], null);
                                    }
                                    Object[] objArr35 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                        char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                        int scrollBarFadeDuration = 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                        int size = 22 - View.MeasureSpec.getSize(0);
                                        byte[] bArr17 = $$d;
                                        Object[] objArr36 = new Object[1];
                                        d(bArr17[54], (byte) (-bArr17[5]), bArr17[7], objArr36);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(maximumDrawingCacheSize2, scrollBarFadeDuration, size, -2137287382, false, (String) objArr36[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr35)).longValue();
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i21++;
                        declaredMethods2 = methodArr3;
                        length2 = i27;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char defaultSize4 = (char) View.getDefaultSize(0, 0);
                int i33 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2823;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 22;
                byte[] bArr18 = $$d;
                byte b14 = bArr18[7];
                Object[] objArr37 = new Object[1];
                d(b14, b14, (byte) (-bArr18[5]), objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(defaultSize4, i33, iResolveSizeAndState2, 1814927978, false, (String) objArr37[0], null);
            }
            Object[] objArr38 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int offsetBefore2 = 2823 - TextUtils.getOffsetBefore("", 0);
                int iIndexOf3 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr19 = $$d;
                Object[] objArr39 = new Object[1];
                d((byte) 14, (byte) (-bArr19[5]), bArr19[7], objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(packedPositionChild2, offsetBefore2, iIndexOf3, 1025296417, false, (String) objArr39[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr38);
            Object[] objArr40 = {0, methodArr2, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char cCombineMeasuredStates = (char) (37657 - View.combineMeasuredStates(0, 0));
                int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 2720;
                int windowTouchSlop = 19 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr20 = $$d;
                Object[] objArr41 = new Object[1];
                d((byte) 14, (byte) (-bArr20[5]), bArr20[7], objArr41);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cCombineMeasuredStates, iIndexOf4, windowTouchSlop, -1568796068, false, (String) objArr41[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr40)).longValue();
            long j8 = 163002838;
            long j9 = j8 ^ j3;
            SecureRandom secureRandom3 = secureRandom2;
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j10 = startUptimeMillis ^ j3;
            long j11 = (((long) (-563)) * j8) + (((long) 565) * jLongValue2) + (((long) (-564)) * (j9 | (((jLongValue2 ^ j3) | j10) ^ j3) | ((jLongValue2 | startUptimeMillis) ^ j3))) + (((long) 1128) * (((j9 | jLongValue2) | startUptimeMillis) ^ j3)) + (((long) 564) * (((j8 | jLongValue2) ^ j3) | ((j9 | j10) ^ j3))) + ((long) (-1973408683));
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i34 = ~iMaxMemory;
            int i35 = 541979432 + (((~(1149612033 | i34)) | 287311272) * (-1188));
            int i36 = (~(iMaxMemory | (-1149612034))) | 287311272;
            int i37 = ~(287614377 | i34);
            int i38 = ((int) (j11 >> 32)) & (i35 + ((i36 | i37) * 594) + (((~((-1149612034) | i34)) | 1149308928 | i37) * 594));
            int iNextInt = new Random().nextInt();
            int i39 = i38 | (((int) j11) & (1139812033 + (((~((~iNextInt) | 1715725721)) | 278499311) * (-235)) + (((~(1715725721 | iNextInt)) | 278499311) * (-470)) + (((~(iNextInt | 1994125311)) | 99721) * 235)));
            int i40 = i39 >>> 24;
            int i41 = i39 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z = i40 != 0;
            if (z) {
                int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                b = i42 % 128;
                int i43 = i42 % 2;
                i3 = 1;
            } else {
                i3 = 0;
            }
            arrayList2.add((!z || i41 >= 1 || (method2 = methodArr2[i41]) == null) ? null : method2.toString());
            if ((i40 + 6) * i3 != 0) {
                throw null;
            }
            ArrayList arrayList3 = new ArrayList();
            int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            byte[] bArr21 = $$a;
            byte b15 = (byte) (bArr21[36] - 1);
            byte b16 = b15;
            Object[] objArr42 = new Object[1];
            c(b15, b16, b16, objArr42);
            Class<?> cls12 = Class.forName((String) objArr42[0]);
            byte b17 = (byte) (-bArr21[19]);
            Object[] objArr43 = new Object[1];
            c(b17, (byte) (b17 + 2), bArr21[36], objArr43);
            Method[] methodArr4 = {cls12.getMethod((String) objArr43[0], String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int maximumFlingVelocity = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iMyPid = 22 - (Process.myPid() >> 22);
                byte[] bArr22 = $$d;
                byte b18 = bArr22[7];
                Object[] objArr44 = new Object[1];
                d(b18, b18, (byte) (-bArr22[5]), objArr44);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c4, maximumFlingVelocity, iMyPid, 1814927978, false, (String) objArr44[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null) != null) {
                secureRandom = secureRandom3;
                break;
            }
            Method[] declaredMethods3 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 22)).getDeclaredMethods();
            int length3 = declaredMethods3.length;
            int i44 = 0;
            while (true) {
                if (i44 >= length3) {
                    secureRandom = secureRandom3;
                    break;
                }
                Method method5 = declaredMethods3[i44];
                try {
                    Class<?> cls13 = Class.forName(str);
                    Method[] methodArr5 = declaredMethods3;
                    int i45 = length3;
                    Object[] objArr45 = new Object[1];
                    a((KeyEvent.getMaxKeyCode() >> 16) + 24, 12 - View.resolveSize(0, 0), (char) Drawable.resolveOpacity(0, 0), objArr45);
                    Object[] objArr46 = {Integer.valueOf(((Integer) cls13.getMethod((String) objArr45[0], null).invoke(method5, null)).intValue())};
                    Object[] objArr47 = new Object[1];
                    a((ViewConfiguration.getTapTimeout() >> 16) + 36, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, (char) Color.red(0), objArr47);
                    Class<?> cls14 = Class.forName((String) objArr47[0]);
                    secureRandom = secureRandom3;
                    Object[] objArr48 = new Object[1];
                    a((ViewConfiguration.getPressedStateDuration() >> 16) + 62, 8 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.indexOf("", ""), objArr48);
                    if (((Boolean) cls14.getMethod((String) objArr48[0], Integer.TYPE).invoke(null, objArr46)).booleanValue()) {
                        int i46 = b + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i46 % 128;
                        int i47 = i46 % 2;
                        Class cls15 = Long.TYPE;
                        Class<?> cls16 = Class.forName(str);
                        Object[] objArr49 = new Object[1];
                        a(70 - Color.green(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, (char) (21322 - TextUtils.getOffsetBefore("", 0)), objArr49);
                        if (cls15.equals(cls16.getMethod((String) objArr49[0], null).invoke(method5, null))) {
                            Class<?> cls17 = Class.forName(str);
                            Object[] objArr50 = new Object[1];
                            a(View.resolveSizeAndState(0, 0, 0) + 83, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (57926 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr50);
                            Object[] objArr51 = (Object[]) cls17.getMethod((String) objArr50[0], null).invoke(method5, null);
                            if (objArr51.length == 2 && Long.TYPE.equals(objArr51[0]) && Class.forName(str).equals(objArr51[1])) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                                    char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int i48 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2823;
                                    int i49 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                                    byte[] bArr23 = $$d;
                                    byte b19 = bArr23[7];
                                    Object[] objArr52 = new Object[1];
                                    d(b19, b19, (byte) (-bArr23[5]), objArr52);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(scrollBarFadeDuration2, i48, i49, 1814927978, false, (String) objArr52[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, method5);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                                    char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                                    int defaultSize5 = View.getDefaultSize(0, 0) + 2823;
                                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                                    byte[] bArr24 = $$d;
                                    byte b20 = bArr24[7];
                                    Object[] objArr53 = new Object[1];
                                    d(b20, b20, (byte) (-bArr24[5]), objArr53);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cIndexOf3, defaultSize5, offsetAfter, 1814927978, false, (String) objArr53[0], null);
                                }
                                Object[] objArr54 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                                    char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int i50 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2823;
                                    int iIndexOf5 = TextUtils.indexOf("", "", 0) + 22;
                                    byte[] bArr25 = $$d;
                                    Object[] objArr55 = new Object[1];
                                    d(bArr25[54], (byte) (-bArr25[5]), bArr25[7], objArr55);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(maximumFlingVelocity2, i50, iIndexOf5, -2137287382, false, (String) objArr55[0], new Class[]{Long.TYPE, Method.class});
                                }
                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr54)).longValue();
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i44++;
                    declaredMethods3 = methodArr5;
                    length3 = i45;
                    secureRandom3 = secureRandom;
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2823;
                int i51 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr26 = $$d;
                byte b21 = bArr26[7];
                Object[] objArr56 = new Object[1];
                d(b21, b21, (byte) (-bArr26[5]), objArr56);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(scrollBarFadeDuration3, offsetAfter2, i51, 1814927978, false, (String) objArr56[0], null);
            }
            Object[] objArr57 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int i52 = 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int fadingEdgeLength = 22 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr27 = $$d;
                Object[] objArr58 = new Object[1];
                d((byte) 14, (byte) (-bArr27[5]), bArr27[7], objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cMyPid, i52, fadingEdgeLength, 1025296417, false, (String) objArr58[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr57);
            Object[] objArr59 = {0, methodArr4, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char modifierMetaStateMask = (char) (37656 - ((byte) KeyEvent.getModifierMetaStateMask()));
                int iGreen = Color.green(0) + 2720;
                int offsetAfter3 = 19 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr28 = $$d;
                Object[] objArr60 = new Object[1];
                d((byte) 14, (byte) (-bArr28[5]), bArr28[7], objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(modifierMetaStateMask, iGreen, offsetAfter3, -1568796068, false, (String) objArr60[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr59)).longValue();
            long j12 = -1194035799;
            long j13 = 988;
            long j14 = jLongValue3 ^ j3;
            long jIdentityHashCode = System.identityHashCode(this);
            long j15 = jIdentityHashCode ^ j3;
            long j16 = (((long) 989) * j12) + (((long) (-987)) * jLongValue3) + (((((j14 | j15) | j12) ^ j3) | (((j12 | jLongValue3) | jIdentityHashCode) ^ j3)) * j13) + (((long) (-988)) * (j12 | j14)) + (j13 * ((j3 ^ ((j15 | j12) | jLongValue3)) | (((j12 ^ j3) | j14) ^ j3) | ((j14 | jIdentityHashCode) ^ j3))) + ((long) (-616370046));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i53 = ~iFreeMemory;
            int i54 = ((int) (j16 >> 32)) & (1458975222 + (((~((-889184560) | i53)) | (~(889189759 | iFreeMemory))) * (-831)) + ((~((-341147909) | iFreeMemory)) * (-1662)) + (((~(iFreeMemory | 889184559)) | (~(i53 | (-548041852))) | (~(548041851 | iFreeMemory))) * 831));
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i55 = ~((-184560217) | elapsedCpuTime);
            int i56 = ~elapsedCpuTime;
            int i57 = i54 | (((int) j16) & ((-2038855459) + ((i55 | (~(1811675898 | i56))) * 920) + (((~((-189889273) | i56)) | 184560216) * 920) + (((~(elapsedCpuTime | 1811675898)) | (~((-184560217) | i56)) | (~((-5329057) | elapsedCpuTime))) * 920)));
            int i58 = i57 >>> 24;
            int i59 = i57 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z2 = i58 != 0;
            if (z2) {
                i4 = 1;
            } else {
                int i60 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i60 % 128;
                if (i60 % 2 != 0) {
                    int i61 = 5 % 5;
                }
                i4 = 0;
            }
            arrayList3.add((!z2 || i59 >= 1 || (method = methodArr4[i59]) == null) ? null : method.toString());
            if ((i58 + 6) * i4 != 0) {
                int i62 = b + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i62 % 128;
                if (i62 % 2 != 0) {
                    int[] iArr = new int[iIntValue2];
                    iArr[iIntValue2 + 1] = 1;
                    Toast.makeText((Context) null, iArr[((iIntValue2 / iIntValue2) << 4) >> 1], 1).show();
                } else {
                    int[] iArr2 = new int[iIntValue2];
                    int i63 = iIntValue2 - 1;
                    iArr2[i63] = 1;
                    Toast.makeText((Context) null, iArr2[((iIntValue2 * i63) % 2) - 1], 1).show();
                }
                int i64 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i64 % 128;
                int i65 = i64 % 2;
            }
            byte[] bArr29 = new byte[12];
            secureRandom.nextBytes(bArr29);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            Intrinsics.checkNotNullExpressionValue(cipher, "");
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr29));
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
            byte[] bArr30 = new byte[bArrDoFinal.length + 12];
            System.arraycopy(bArr29, 0, bArr30, 0, 12);
            System.arraycopy(bArrDoFinal, 0, bArr30, 12, bArrDoFinal.length);
            return bArr30;
        }

        /* JADX WARN: Code duplicated, block: B:135:0x0ac9  */
        /* JADX WARN: Code duplicated, block: B:146:0x0ae8 A[PHI: r0
  0x0ae8: PHI (r0v32 java.lang.reflect.Method) = (r0v31 java.lang.reflect.Method), (r0v34 java.lang.reflect.Method) binds: [B:145:0x0ae6, B:142:0x0ae1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:147:0x0aef  */
        /* JADX WARN: Code duplicated, block: B:65:0x055d  */
        private byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, byte[] bArr2) throws Throwable {
            int i;
            boolean z;
            int i2;
            String string;
            String str;
            int i3;
            String string2;
            Method method;
            Method[] declaredMethods;
            int length;
            int i4;
            int i5 = 2 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0), Color.green(0) + 24, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            String str2 = (String) objArr[0];
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            byte[] bArr3 = new byte[12];
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            byte[] bArr4 = $$a;
            byte b2 = (byte) (bArr4[36] - 1);
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b4 = bArr4[26];
            Object[] objArr3 = new Object[1];
            c(b4, b4, (byte) (-bArr4[19]), objArr3);
            Method[] methodArr = {cls.getMethod((String) objArr3[0], byte[].class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char gidForName = (char) ((-1) - Process.getGidForName(""));
                int i6 = 2824 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int gidForName2 = Process.getGidForName("") + 23;
                byte[] bArr5 = $$d;
                byte b5 = bArr5[7];
                Object[] objArr4 = new Object[1];
                d(b5, b5, (byte) (-bArr5[5]), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(gidForName, i6, gidForName2, 1814927978, false, (String) objArr4[0], null);
            }
            float f = 0.0f;
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods2 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getSize(0), MotionEvent.axisFromString("") + 2824, (ViewConfiguration.getScrollBarSize() >> 8) + 22)).getDeclaredMethods();
                int length2 = declaredMethods2.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    Method method2 = declaredMethods2[i7];
                    try {
                        Class<?> cls2 = Class.forName(str2);
                        Method[] methodArr2 = declaredMethods2;
                        int i10 = length2;
                        Object[] objArr5 = new Object[1];
                        a((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 24, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, (char) TextUtils.indexOf("", ""), objArr5);
                        Object[] objArr6 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue())};
                        Object[] objArr7 = new Object[1];
                        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, ExpandableListView.getPackedPositionGroup(0L) + 26, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        a(TextUtils.indexOf("", "", 0, 0) + 62, TextUtils.lastIndexOf("", '0') + 9, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                        if (((Boolean) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            Class cls4 = Long.TYPE;
                            Class<?> cls5 = Class.forName(str2);
                            Object[] objArr9 = new Object[1];
                            a(70 - View.MeasureSpec.getMode(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, (char) (21322 - (ViewConfiguration.getJumpTapTimeout() >> 16)), objArr9);
                            if (cls4.equals(cls5.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                                Class<?> cls6 = Class.forName(str2);
                                Object[] objArr10 = new Object[1];
                                a(83 - TextUtils.getOffsetAfter("", 0), 16 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (57925 - TextUtils.getCapsMode("", 0, 0)), objArr10);
                                Object[] objArr11 = (Object[]) cls6.getMethod((String) objArr10[0], null).invoke(method2, null);
                                if (objArr11.length == 2 && Long.TYPE.equals(objArr11[0]) && Class.forName(str2).equals(objArr11[1])) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                                        int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                                        int edgeSlop = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        byte[] bArr6 = $$d;
                                        byte b6 = bArr6[7];
                                        Object[] objArr12 = new Object[1];
                                        d(b6, b6, (byte) (-bArr6[5]), objArr12);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i11, edgeSlop, 1814927978, false, (String) objArr12[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2824;
                                        int i12 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        byte[] bArr7 = $$d;
                                        byte b7 = bArr7[7];
                                        Object[] objArr13 = new Object[1];
                                        d(b7, b7, (byte) (-bArr7[5]), objArr13);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, bitsPerPixel, i12, 1814927978, false, (String) objArr13[0], null);
                                    }
                                    try {
                                        Object[] objArr14 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                            int iIndexOf = TextUtils.indexOf("", "", 0) + 2823;
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
                                            byte[] bArr8 = $$d;
                                            Object[] objArr15 = new Object[1];
                                            d(bArr8[54], (byte) (-bArr8[5]), bArr8[7], objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, iIndexOf, iResolveSizeAndState, -2137287382, false, (String) objArr15[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr14)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i7++;
                        declaredMethods2 = methodArr2;
                        length2 = i10;
                        f = 0.0f;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iNormalizeMetaState = 2823 - KeyEvent.normalizeMetaState(0);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                byte[] bArr9 = $$d;
                byte b8 = bArr9[7];
                Object[] objArr16 = new Object[1];
                d(b8, b8, (byte) (-bArr9[5]), objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, iNormalizeMetaState, absoluteGravity, 1814927978, false, (String) objArr16[0], null);
            }
            Object[] objArr17 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2823;
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 23;
                byte[] bArr10 = $$d;
                Object[] objArr18 = new Object[1];
                d((byte) 14, (byte) (-bArr10[5]), bArr10[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, threadPriority, bitsPerPixel2, 1025296417, false, (String) objArr18[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr17);
            Object[] objArr19 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c = (char) (37657 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2720;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 19;
                byte[] bArr11 = $$d;
                Object[] objArr20 = new Object[1];
                d((byte) 14, (byte) (-bArr11[5]), bArr11[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, maximumFlingVelocity, iResolveSizeAndState2, -1568796068, false, (String) objArr20[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr19)).longValue();
            long j = -670424013;
            long j2 = 399;
            long j3 = (j2 * j) + (j2 * jLongValue);
            long j4 = 398;
            long j5 = -1;
            long j6 = ((j ^ j5) | jLongValue) ^ j5;
            long j7 = jLongValue ^ j5;
            long j8 = (j7 | j) ^ j5;
            long jIdentityHashCode = System.identityHashCode(this);
            String str3 = "";
            long j9 = j3 + ((j6 | j8 | ((j7 | jIdentityHashCode) ^ j5)) * j4) + (((long) (-1194)) * (jLongValue | j)) + (j4 * (((j7 | (jIdentityHashCode ^ j5)) ^ j5) | j6 | j8)) + ((long) (-1139981832));
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = ((int) (j9 >> 32)) & ((-1153123274) + (((~iIdentityHashCode) | 1574432341) * 1444) + (((~(iIdentityHashCode | 2078352168)) | (~((-641125758) | iIdentityHashCode)) | 68602965) * (-1444)) + 1426182516);
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i14 = ~((-823768091) | iIdentityHashCode2);
            int i15 = ~iIdentityHashCode2;
            int i16 = (((int) j9) & (1290576330 + ((i14 | (~((-1207959586) | i15))) * 497) + (((~(iIdentityHashCode2 | (-1207959586))) | (~((-826013211) | i15)) | 2245120) * 497))) | i13;
            int i17 = i16 >>> 24;
            int i18 = i16 & ViewCompat.MEASURED_SIZE_MASK;
            if (i17 != 0) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                b = i19 % 128;
                i = 2;
                int i20 = i19 % 2;
                z = true;
            } else {
                i = 2;
                z = false;
            }
            if (!z) {
                i2 = 0;
            } else {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                b = i21 % 128;
                int i22 = i21 % i;
                i2 = 1;
            }
            if (!z || i18 >= 1) {
                string = null;
            } else {
                int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                b = i23 % 128;
                int i24 = i23 % i;
                Method method3 = methodArr[i18];
                if (method3 != null) {
                    string = method3.toString();
                } else {
                    string = null;
                }
            }
            arrayList.add(string);
            if ((i17 + 6) * i2 != 0) {
                Toast.makeText((Context) null, iIntValue / (((iIntValue - 1) * iIntValue) % 2), 0).show();
            }
            ArrayList arrayList2 = new ArrayList();
            byte[] bArr12 = $$a;
            byte b9 = (byte) (bArr12[36] - 1);
            byte b10 = b9;
            Object[] objArr21 = new Object[1];
            c(b9, b10, b10, objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b11 = (byte) (-bArr12[19]);
            Object[] objArr22 = new Object[1];
            c(b11, (byte) (b11 + 2), bArr12[36], objArr22);
            Method[] methodArr3 = {cls7.getMethod((String) objArr22[0], String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int i25 = 2823 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                byte[] bArr13 = $$d;
                byte b12 = bArr13[7];
                Object[] objArr23 = new Object[1];
                d(b12, b12, (byte) (-bArr13[5]), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cCombineMeasuredStates, i25, packedPositionType, 1814927978, false, (String) objArr23[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) != null) {
                str = str3;
                break;
            }
            int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            b = i26 % 128;
            if (i26 % 2 == 0) {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 2823, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i4 = 1;
            } else {
                declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), Color.alpha(0) + 2823, View.MeasureSpec.getSize(0) + 22)).getDeclaredMethods();
                length = declaredMethods.length;
                i4 = 0;
            }
            while (true) {
                if (i4 >= length) {
                    str = str3;
                    break;
                }
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                b = i27 % 128;
                int i28 = i27 % 2;
                Method method4 = declaredMethods[i4];
                try {
                    Class<?> cls8 = Class.forName(str2);
                    str = str3;
                    Method[] methodArr4 = declaredMethods;
                    Object[] objArr24 = new Object[1];
                    a(23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf(str, str, 0, 0) + 12, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr24);
                    Object[] objArr25 = {Integer.valueOf(((Integer) cls8.getMethod((String) objArr24[0], null).invoke(method4, null)).intValue())};
                    Object[] objArr26 = new Object[1];
                    a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37, TextUtils.indexOf((CharSequence) str, '0', 0) + 27, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr26);
                    Class<?> cls9 = Class.forName((String) objArr26[0]);
                    int i29 = length;
                    Object[] objArr27 = new Object[1];
                    a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61, 8 - KeyEvent.getDeadChar(0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr27);
                    if (!(!((Boolean) cls9.getMethod((String) objArr27[0], Integer.TYPE).invoke(null, objArr25)).booleanValue())) {
                        Class cls10 = Long.TYPE;
                        Class<?> cls11 = Class.forName(str2);
                        Object[] objArr28 = new Object[1];
                        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 70, View.MeasureSpec.getMode(0) + 13, (char) (21322 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr28);
                        if (!cls10.equals(cls11.getMethod((String) objArr28[0], null).invoke(method4, null))) {
                            continue;
                        } else {
                            Class<?> cls12 = Class.forName(str2);
                            Object[] objArr29 = new Object[1];
                            a(TextUtils.indexOf(str, str, 0) + 83, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, (char) (57926 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr29);
                            Object[] objArr30 = (Object[]) cls12.getMethod((String) objArr29[0], null).invoke(method4, null);
                            if (objArr30.length == 2 && Long.TYPE.equals(objArr30[0])) {
                                int i30 = b + 13;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i30 % 128;
                                int i31 = i30 % 2;
                                if (Class.forName(str2).equals(objArr30[1])) {
                                    int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                                    b = i32 % 128;
                                    int i33 = i32 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                        int i34 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2823;
                                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                        byte[] bArr14 = $$d;
                                        byte b13 = bArr14[7];
                                        Object[] objArr31 = new Object[1];
                                        d(b13, b13, (byte) (-bArr14[5]), objArr31);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, i34, keyRepeatDelay, 1814927978, false, (String) objArr31[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, method4);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                        char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                        int defaultSize = 2823 - View.getDefaultSize(0, 0);
                                        int trimmedLength = TextUtils.getTrimmedLength(str) + 22;
                                        byte[] bArr15 = $$d;
                                        byte b14 = bArr15[7];
                                        Object[] objArr32 = new Object[1];
                                        d(b14, b14, (byte) (-bArr15[5]), objArr32);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(touchSlop2, defaultSize, trimmedLength, 1814927978, false, (String) objArr32[0], null);
                                    }
                                    Object[] objArr33 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                        int absoluteGravity2 = 2823 - Gravity.getAbsoluteGravity(0, 0);
                                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22;
                                        byte[] bArr16 = $$d;
                                        Object[] objArr34 = new Object[1];
                                        d(bArr16[54], (byte) (-bArr16[5]), bArr16[7], objArr34);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cResolveSizeAndState, absoluteGravity2, maximumDrawingCacheSize, -2137287382, false, (String) objArr34[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr33)).longValue();
                                    break;
                                }
                            }
                        }
                    }
                    i4++;
                    str3 = str;
                    declaredMethods = methodArr4;
                    length = i29;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2823;
                int mode = 22 - View.MeasureSpec.getMode(0);
                byte[] bArr17 = $$d;
                byte b15 = bArr17[7];
                Object[] objArr35 = new Object[1];
                d(b15, b15, (byte) (-bArr17[5]), objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c2, maximumDrawingCacheSize2, mode, 1814927978, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i35 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                int iIndexOf2 = 22 - TextUtils.indexOf(str, str, 0);
                byte[] bArr18 = $$d;
                Object[] objArr37 = new Object[1];
                d((byte) 14, (byte) (-bArr18[5]), bArr18[7], objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c3, i35, iIndexOf2, 1025296417, false, (String) objArr37[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr36);
            Object[] objArr38 = {0, methodArr3, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 37657);
                int trimmedLength2 = TextUtils.getTrimmedLength(str) + 2720;
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 19;
                byte[] bArr19 = $$d;
                Object[] objArr39 = new Object[1];
                d((byte) 14, (byte) (-bArr19[5]), bArr19[7], objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cResolveSize, trimmedLength2, iResolveOpacity, -1568796068, false, (String) objArr39[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr38)).longValue();
            long j10 = -271196537;
            String str4 = str;
            long j11 = 988;
            long j12 = jLongValue2 ^ j5;
            long jIdentityHashCode2 = System.identityHashCode(this);
            long j13 = jIdentityHashCode2 ^ j5;
            long j14 = (((long) 989) * j10) + (((long) (-987)) * jLongValue2) + (((((j12 | j13) | j10) ^ j5) | (((j10 | jLongValue2) | jIdentityHashCode2) ^ j5)) * j11) + (((long) (-988)) * (j10 | j12)) + (j11 * ((((j10 ^ j5) | j12) ^ j5) | ((j12 | jIdentityHashCode2) ^ j5) | ((jLongValue2 | (j13 | j10)) ^ j5))) + ((long) (-1539209308));
            int i36 = ~((~System.identityHashCode(this)) | (-455595008));
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i37 = (((int) (j14 >> 32)) & (((((-2079849472) | i36) * (-970)) - 950932054) + ((i36 | 1624254464) * 970))) | (((int) j14) & (862324386 + ((~((~iElapsedRealtime) | (-293638437))) * 433) + (((~(864744230 | iElapsedRealtime)) | 572482179) * (-433)) + (((~(iElapsedRealtime | 572482179)) | 571105794) * 433)));
            int i38 = i37 >>> 24;
            int i39 = i37 & ViewCompat.MEASURED_SIZE_MASK;
            boolean z2 = i38 != 0;
            if (z2) {
                int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                b = i40 % 128;
                if (i40 % 2 == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 0;
            }
            if (!z2 || i39 >= 1) {
                string2 = null;
            } else {
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                b = i41 % 128;
                if (i41 % 2 == 0) {
                    method = methodArr3[i39];
                    int i42 = 74 / 0;
                    if (method != null) {
                        string2 = method.toString();
                    } else {
                        string2 = null;
                    }
                } else {
                    method = methodArr3[i39];
                    if (method != null) {
                        string2 = method.toString();
                    } else {
                        string2 = null;
                    }
                }
            }
            arrayList2.add(string2);
            if ((i38 + 6) * i3 != 0) {
                throw null;
            }
            int length3 = bArr.length - 12;
            byte[] bArr20 = new byte[length3];
            System.arraycopy(bArr, 0, bArr3, 0, 12);
            System.arraycopy(bArr, 12, bArr20, 0, length3);
            if (SynchronizedCaptureSessionImplExternalSyntheticLambda0.b(new ArrayList()) != 0) {
                throw null;
            }
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            Intrinsics.checkNotNullExpressionValue(cipher, str4);
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, bArr3));
            byte[] bArrDoFinal = cipher.doFinal(bArr20);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, str4);
            return bArrDoFinal;
        }

        public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws Throwable {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
            b = i2 % 128;
            int i3 = i2 % 2;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, false);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:121:0x0892  */
        /* JADX WARN: Code duplicated, block: B:125:0x08e1 A[Catch: all -> 0x0ad2, TryCatch #0 {all -> 0x0ad2, blocks: (B:41:0x02f2, B:43:0x0307, B:44:0x034e, B:57:0x03c1, B:59:0x03ce, B:60:0x0411, B:62:0x0430, B:63:0x0484, B:106:0x0805, B:108:0x081a, B:109:0x0864, B:123:0x08d4, B:125:0x08e1, B:126:0x0921, B:128:0x0940, B:129:0x0993), top: B:166:0x02f2 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x0940 A[Catch: all -> 0x0ad2, TryCatch #0 {all -> 0x0ad2, blocks: (B:41:0x02f2, B:43:0x0307, B:44:0x034e, B:57:0x03c1, B:59:0x03ce, B:60:0x0411, B:62:0x0430, B:63:0x0484, B:106:0x0805, B:108:0x081a, B:109:0x0864, B:123:0x08d4, B:125:0x08e1, B:126:0x0921, B:128:0x0940, B:129:0x0993), top: B:166:0x02f2 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x0a40  */
        /* JADX WARN: Code duplicated, block: B:134:0x0a43  */
        /* JADX WARN: Code duplicated, block: B:136:0x0a47  */
        /* JADX WARN: Code duplicated, block: B:137:0x0a49  */
        /* JADX WARN: Code duplicated, block: B:147:0x0a67  */
        /* JADX WARN: Code duplicated, block: B:150:0x0a70  */
        /* JADX WARN: Code duplicated, block: B:157:0x0ac6  */
        public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, boolean z) throws Throwable {
            int length;
            int i;
            int i2;
            String str2;
            Cipher cipher;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i3;
            boolean z2;
            int i4;
            String string;
            Method method;
            int i5 = 2 % 2;
            int i6 = 0;
            Object[] objArr = new Object[1];
            a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.blue(0) + 24, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            String str3 = (String) objArr[0];
            Intrinsics.checkNotNullParameter(str, "");
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            String strReplace$default = StringsKt.replace$default(!z ? Camera2InteropExtender.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : Camera2InteropExtender.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "-----BEGIN PRIVATE KEY-----", "", false, 4, (Object) null);
            String strLineSeparator = System.lineSeparator();
            Intrinsics.checkNotNullExpressionValue(strLineSeparator, "");
            String strReplace$default2 = StringsKt.replace$default(strReplace$default, strLineSeparator, "", false, 4, (Object) null);
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                length = str.length();
            } else {
                int i7 = b + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
                length = 0;
            }
            byte[] bArr = $$a;
            byte b2 = (byte) (bArr[36] - 1);
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b4 = (byte) (-bArr[19]);
            Object[] objArr3 = new Object[1];
            c(b4, (byte) (b4 + 2), bArr[36], objArr3);
            Method[] methodArr = {cls.getMethod((String) objArr3[0], String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i9 = 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i10 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr2 = $$d;
                byte b5 = bArr2[7];
                Object[] objArr4 = new Object[1];
                d(b5, b5, (byte) (-bArr2[5]), objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i9, i10, 1814927978, false, (String) objArr4[0], null);
            }
            char c2 = '0';
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) != null) {
                i = length;
                break;
            }
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2824, ExpandableListView.getPackedPositionType(0L) + 22)).getDeclaredMethods();
            int length2 = declaredMethods.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    i = length;
                    break;
                }
                Method method2 = declaredMethods[i11];
                int i12 = b + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = i12 % 2;
                try {
                    Class<?> cls2 = Class.forName(str3);
                    Method[] methodArr2 = declaredMethods;
                    int i14 = length2;
                    Object[] objArr5 = new Object[1];
                    a(TextUtils.indexOf("", c2, i6, i6) + 25, 11 - TextUtils.lastIndexOf("", c2, i6, i6), (char) (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
                    Object[] objArr6 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue())};
                    Object[] objArr7 = new Object[1];
                    a(TextUtils.getOffsetBefore("", 0) + 36, 26 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr7);
                    Class<?> cls3 = Class.forName((String) objArr7[0]);
                    i = length;
                    Object[] objArr8 = new Object[1];
                    a(62 - (ViewConfiguration.getFadingEdgeLength() >> 16), ImageFormat.getBitsPerPixel(0) + 9, (char) TextUtils.getCapsMode("", 0, 0), objArr8);
                    if (!(!((Boolean) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue())) {
                        Class cls4 = Long.TYPE;
                        Class<?> cls5 = Class.forName(str3);
                        Object[] objArr9 = new Object[1];
                        a(69 - ((byte) KeyEvent.getModifierMetaStateMask()), 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21322), objArr9);
                        if (cls4.equals(cls5.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                            b = i15 % 128;
                            int i16 = i15 % 2;
                            Class<?> cls6 = Class.forName(str3);
                            Object[] objArr10 = new Object[1];
                            a(83 - View.MeasureSpec.getMode(0), TextUtils.getOffsetAfter("", 0) + 17, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 57925), objArr10);
                            Object[] objArr11 = (Object[]) cls6.getMethod((String) objArr10[0], null).invoke(method2, null);
                            if (objArr11.length == 2 && Long.TYPE.equals(objArr11[0]) && Class.forName(str3).equals(objArr11[1])) {
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char cIndexOf = (char) TextUtils.indexOf("", "");
                                    int iRed = Color.red(0) + 2823;
                                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                                    byte[] bArr3 = $$d;
                                    byte b6 = bArr3[7];
                                    Object[] objArr12 = new Object[1];
                                    d(b6, b6, (byte) (-bArr3[5]), objArr12);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iRed, minimumFlingVelocity, 1814927978, false, (String) objArr12[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2823;
                                    int i17 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                                    byte[] bArr4 = $$d;
                                    byte b7 = bArr4[7];
                                    Object[] objArr13 = new Object[1];
                                    d(b7, b7, (byte) (-bArr4[5]), objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, iMakeMeasureSpec, i17, 1814927978, false, (String) objArr13[0], null);
                                }
                                try {
                                    Object[] objArr14 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        char cGreen = (char) Color.green(0);
                                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 2823;
                                        int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                                        byte[] bArr5 = $$d;
                                        Object[] objArr15 = new Object[1];
                                        d(bArr5[54], (byte) (-bArr5[5]), bArr5[7], objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cGreen, absoluteGravity, deadChar, -2137287382, false, (String) objArr15[0], new Class[]{Long.TYPE, Method.class});
                                    }
                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr14)).longValue();
                                    break;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    i11++;
                    declaredMethods = methodArr2;
                    length2 = i14;
                    length = i;
                    i6 = 0;
                    c2 = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char c3 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int defaultSize = 2823 - View.getDefaultSize(0, 0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 23;
                byte[] bArr6 = $$d;
                byte b8 = bArr6[7];
                Object[] objArr16 = new Object[1];
                d(b8, b8, (byte) (-bArr6[5]), objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c3, defaultSize, iIndexOf, 1814927978, false, (String) objArr16[0], null);
            }
            Object[] objArr17 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                int modifierMetaStateMask = 2822 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iMyPid = (Process.myPid() >> 22) + 22;
                byte[] bArr7 = $$d;
                Object[] objArr18 = new Object[1];
                d((byte) 14, (byte) (-bArr7[5]), bArr7[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, modifierMetaStateMask, iMyPid, 1025296417, false, (String) objArr18[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr17);
            Object[] objArr19 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37657);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2721;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 19;
                byte[] bArr8 = $$d;
                Object[] objArr20 = new Object[1];
                d((byte) 14, (byte) (-bArr8[5]), bArr8[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(maximumFlingVelocity2, iLastIndexOf, tapTimeout, -1568796068, false, (String) objArr20[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr19)).longValue();
            long j = -305968823;
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j2 = (((long) (-419)) * j) + (((long) 421) * jLongValue);
            long j3 = TypedValues.CycleType.TYPE_EASING;
            long j4 = startUptimeMillis;
            long j5 = -1;
            long j6 = j ^ j5;
            long j7 = j2 + (((jLongValue | j4) ^ j5) * j3) + (((long) (-420)) * (jLongValue | j6)) + (j3 * ((((jLongValue ^ j5) | j6) ^ j5) | (((j4 ^ j5) | jLongValue) ^ j5))) + ((long) (-1504437022));
            int i18 = ~((int) SystemClock.elapsedRealtime());
            int i19 = ((int) (j7 >> 32)) & ((((~(1266719519 | i18)) | (-1607835456)) * (-241)) + 738709760 + (((~(i18 | (-341115937))) | 16814090) * 241));
            int iMyUid = Process.myUid();
            int i20 = ~iMyUid;
            int i21 = i19 | (((int) j7) & ((-408051918) + (((-1461184049) | i20) * (-757)) + ((~((-17137665) | iMyUid)) * 1514) + (((~(iMyUid | (-1444046385))) | (~(i20 | (-23957639))) | 6819974) * 757)));
            int i22 = i21 >>> 24;
            int i23 = i21 & ViewCompat.MEASURED_SIZE_MASK;
            if (i22 != 0) {
                int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                b = i24 % 128;
                int i25 = i24 % 2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            arrayList.add((i2 == 0 || i23 >= 1 || (method = methodArr[i23]) == null) ? null : method.toString());
            if ((i22 + 6) * i2 != 0) {
                throw new RuntimeException(String.valueOf(i));
            }
            PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(StringsKt.replace$default(strReplace$default2, "-----END PRIVATE KEY-----", "", false, 4, (Object) null), 0)));
            Cipher cipher2 = Cipher.getInstance("RSA/ECB/OAEPPadding");
            ArrayList arrayList2 = new ArrayList();
            byte[] bArr9 = $$a;
            byte b9 = (byte) (bArr9[36] - 1);
            byte b10 = b9;
            Object[] objArr21 = new Object[1];
            c(b9, b10, b10, objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            byte b11 = bArr9[26];
            Object[] objArr22 = new Object[1];
            c(b11, b11, (byte) (-bArr9[19]), objArr22);
            Method[] methodArr3 = {cls7.getMethod((String) objArr22[0], byte[].class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c4 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int i26 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2822;
                int i27 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                byte[] bArr10 = $$d;
                byte b12 = bArr10[7];
                Object[] objArr23 = new Object[1];
                d(b12, b12, (byte) (-bArr10[5]), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c4, i26, i27, 1814927978, false, (String) objArr23[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null) == null) {
                int i28 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                b = i28 % 128;
                int i29 = i28 % 2;
                str2 = "";
                Method[] declaredMethods2 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 21 - TextUtils.indexOf((CharSequence) str2, '0'))).getDeclaredMethods();
                int length3 = declaredMethods2.length;
                int i30 = 0;
                while (true) {
                    if (i30 < length3) {
                        Method method3 = declaredMethods2[i30];
                        try {
                            Class<?> cls8 = Class.forName(str3);
                            Method[] methodArr4 = declaredMethods2;
                            int i31 = length3;
                            Object[] objArr24 = new Object[1];
                            a((Process.myTid() >> 22) + 24, 12 - TextUtils.getOffsetBefore(str2, 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr24);
                            Object[] objArr25 = {Integer.valueOf(((Integer) cls8.getMethod((String) objArr24[0], null).invoke(method3, null)).intValue())};
                            Object[] objArr26 = new Object[1];
                            a(37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 26, (char) KeyEvent.normalizeMetaState(0), objArr26);
                            Class<?> cls9 = Class.forName((String) objArr26[0]);
                            cipher = cipher2;
                            Object[] objArr27 = new Object[1];
                            a(TextUtils.lastIndexOf(str2, '0') + 63, 7 - TextUtils.lastIndexOf(str2, '0', 0, 0), (char) View.MeasureSpec.getSize(0), objArr27);
                            if (((Boolean) cls9.getMethod((String) objArr27[0], Integer.TYPE).invoke(null, objArr25)).booleanValue()) {
                                Class cls10 = Long.TYPE;
                                Class<?> cls11 = Class.forName(str3);
                                Object[] objArr28 = new Object[1];
                                a(70 - ExpandableListView.getPackedPositionGroup(0L), MotionEvent.axisFromString(str2) + 14, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 21322), objArr28);
                                if (cls10.equals(cls11.getMethod((String) objArr28[0], null).invoke(method3, null))) {
                                    int i32 = b + 103;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                                    int i33 = i32 % 2;
                                    Class<?> cls12 = Class.forName(str3);
                                    Object[] objArr29 = new Object[1];
                                    a(TextUtils.indexOf((CharSequence) str2, '0', 0, 0) + 84, Drawable.resolveOpacity(0, 0) + 17, (char) (57924 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr29);
                                    Object[] objArr30 = (Object[]) cls12.getMethod((String) objArr29[0], null).invoke(method3, null);
                                    if (objArr30.length == 2 && Long.TYPE.equals(objArr30[0]) && Class.forName(str3).equals(objArr30[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                            int i34 = 2824 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            int i35 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                                            byte[] bArr11 = $$d;
                                            byte b13 = bArr11[7];
                                            Object[] objArr31 = new Object[1];
                                            d(b13, b13, (byte) (-bArr11[5]), objArr31);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType, i34, i35, 1814927978, false, (String) objArr31[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, method3);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                            char cResolveSize = (char) View.resolveSize(0, 0);
                                            int iAxisFromString = MotionEvent.axisFromString(str2) + 2824;
                                            int offsetAfter = TextUtils.getOffsetAfter(str2, 0) + 22;
                                            byte[] bArr12 = $$d;
                                            byte b14 = bArr12[7];
                                            Object[] objArr32 = new Object[1];
                                            d(b14, b14, (byte) (-bArr12[5]), objArr32);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cResolveSize, iAxisFromString, offsetAfter, 1814927978, false, (String) objArr32[0], null);
                                        }
                                        Object[] objArr33 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int maximumFlingVelocity3 = 2823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int iIndexOf2 = TextUtils.indexOf(str2, str2, 0, 0) + 22;
                                            byte[] bArr13 = $$d;
                                            Object[] objArr34 = new Object[1];
                                            d(bArr13[54], (byte) (-bArr13[5]), bArr13[7], objArr34);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(packedPositionGroup, maximumFlingVelocity3, iIndexOf2, -2137287382, false, (String) objArr34[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr33)).longValue();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i30++;
                            declaredMethods2 = methodArr4;
                            length3 = i31;
                            cipher2 = cipher;
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength(str2);
                    int iMyPid2 = (Process.myPid() >> 22) + 2823;
                    int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr14 = $$d;
                    byte b15 = bArr14[7];
                    Object[] objArr35 = new Object[1];
                    d(b15, b15, (byte) (-bArr14[5]), objArr35);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iMyPid2, keyRepeatDelay, 1814927978, false, (String) objArr35[0], null);
                }
                Object[] objArr36 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cGreen2 = (char) Color.green(0);
                    int iAlpha = 2823 - Color.alpha(0);
                    int offsetBefore = 22 - TextUtils.getOffsetBefore(str2, 0);
                    byte[] bArr15 = $$d;
                    Object[] objArr37 = new Object[1];
                    d((byte) 14, (byte) (-bArr15[5]), bArr15[7], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen2, iAlpha, offsetBefore, 1025296417, false, (String) objArr37[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr36);
                Object[] objArr38 = {0, methodArr3, null};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay = (char) (37657 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int defaultSize2 = 2720 - View.getDefaultSize(0, 0);
                    int maximumDrawingCacheSize = 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte[] bArr16 = $$d;
                    Object[] objArr39 = new Object[1];
                    d((byte) 14, (byte) (-bArr16[5]), bArr16[7], objArr39);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, defaultSize2, maximumDrawingCacheSize, -1568796068, false, (String) objArr39[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr38)).longValue();
                long j8 = -466473312;
                long j9 = j8 ^ j5;
                long j10 = 191;
                long jMyUid = Process.myUid();
                long j11 = (((long) (-381)) * j8) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue2) + (((long) (-191)) * j9) + ((j8 | ((jLongValue2 | jMyUid) ^ j5)) * j10) + (j10 * ((j5 ^ (jLongValue2 | (jMyUid ^ j5))) | ((j9 | jLongValue2) ^ j5))) + ((long) (-1343932533));
                int iMyTid = Process.myTid();
                int i36 = ~iMyTid;
                int i37 = ((int) (j11 >> 32)) & ((((((~((-1985473933) | i36)) | (~(548247521 | iMyTid))) | (~(i36 | (-548247522)))) * 959) - 151612299) + (((~(iMyTid | (-548247522))) | (~(i36 | 548247521)) | (~((-1985473933) | iMyTid))) * 959));
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i38 = ~iElapsedRealtime;
                int i39 = i37 | (((int) j11) & (1788176917 + ((1409302848 | i38) * (-192)) + (((~(1420904816 | i38)) | (-1425624442)) * (-384)) + (((~(iElapsedRealtime | (-11601969))) | (~(i38 | (-4719626))) | (~(1425624441 | iElapsedRealtime))) * DerHeader.TAG_CLASS_PRIVATE)));
                i3 = i39 >>> 24;
                int i40 = i39 & ViewCompat.MEASURED_SIZE_MASK;
                if (i3 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                if (z2 || i40 >= 1) {
                    string = null;
                } else {
                    int i41 = b + 97;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i41 % 128;
                    if (i41 % 2 != 0) {
                        Method method4 = methodArr3[i40];
                        throw null;
                    }
                    Method method5 = methodArr3[i40];
                    if (method5 != null) {
                        string = method5.toString();
                    } else {
                        string = null;
                    }
                }
                arrayList2.add(string);
                if ((i3 + 6) * i4 == 0) {
                    throw null;
                }
                Cipher cipher3 = cipher;
                cipher3.init(2, privateKeyGeneratePrivate, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT));
                try {
                    byte[] bArrDoFinal = cipher3.doFinal(Base64.decode(str, 0));
                    Charset charset = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(charset, str2);
                    return new String(bArrDoFinal, charset);
                } catch (Exception e2) {
                    getContentPaddingRight.b bVarB = getContentPaddingRight.b("rsaencryption");
                    Intrinsics.checkExpressionValueIsNotNull(bVarB, str2);
                    bVarB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ExceptionsKt.stackTraceToString(e2), new Object[0]);
                    setCaptureRequestTemplate setcapturerequesttemplate = setCaptureRequestTemplate.INSTANCE;
                    setCaptureRequestTemplate.TuitionPaymentFragmentbindingInflater1("decryptStringRsa");
                    return str2;
                }
            }
            str2 = "";
            cipher = cipher2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength(str2);
                int iMyPid3 = (Process.myPid() >> 22) + 2823;
                int keyRepeatDelay2 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte[] bArr17 = $$d;
                byte b16 = bArr17[7];
                Object[] objArr310 = new Object[1];
                d(b16, b16, (byte) (-bArr17[5]), objArr310);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength2, iMyPid3, keyRepeatDelay2, 1814927978, false, (String) objArr310[0], null);
            }
            Object[] objArr311 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cGreen3 = (char) Color.green(0);
                int iAlpha2 = 2823 - Color.alpha(0);
                int offsetBefore2 = 22 - TextUtils.getOffsetBefore(str2, 0);
                byte[] bArr18 = $$d;
                Object[] objArr312 = new Object[1];
                d((byte) 14, (byte) (-bArr18[5]), bArr18[7], objArr312);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen3, iAlpha2, offsetBefore2, 1025296417, false, (String) objArr312[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr311);
            Object[] objArr313 = {0, methodArr3, null};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollDefaultDelay2 = (char) (37657 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int defaultSize3 = 2720 - View.getDefaultSize(0, 0);
                int maximumDrawingCacheSize2 = 19 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr19 = $$d;
                Object[] objArr314 = new Object[1];
                d((byte) 14, (byte) (-bArr19[5]), bArr19[7], objArr314);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay2, defaultSize3, maximumDrawingCacheSize2, -1568796068, false, (String) objArr314[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr313)).longValue();
            long j12 = -466473312;
            long j13 = j12 ^ j5;
            long j14 = 191;
            long jMyUid2 = Process.myUid();
            long j15 = (((long) (-381)) * j12) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue3) + (((long) (-191)) * j13) + ((j12 | ((jLongValue3 | jMyUid2) ^ j5)) * j14) + (j14 * ((j5 ^ (jLongValue3 | (jMyUid2 ^ j5))) | ((j13 | jLongValue3) ^ j5))) + ((long) (-1343932533));
            int iMyTid2 = Process.myTid();
            int i310 = ~iMyTid2;
            int i311 = ((int) (j15 >> 32)) & ((((((~((-1985473933) | i310)) | (~(548247521 | iMyTid2))) | (~(i310 | (-548247522)))) * 959) - 151612299) + (((~(iMyTid2 | (-548247522))) | (~(i310 | 548247521)) | (~((-1985473933) | iMyTid2))) * 959));
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i312 = ~iElapsedRealtime2;
            int i313 = i311 | (((int) j15) & (1788176917 + ((1409302848 | i312) * (-192)) + (((~(1420904816 | i312)) | (-1425624442)) * (-384)) + (((~(iElapsedRealtime2 | (-11601969))) | (~(i312 | (-4719626))) | (~(1425624441 | iElapsedRealtime2))) * DerHeader.TAG_CLASS_PRIVATE)));
            i3 = i313 >>> 24;
            int i42 = i313 & ViewCompat.MEASURED_SIZE_MASK;
            if (i3 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            if (z2) {
                string = null;
            } else {
                string = null;
            }
            arrayList2.add(string);
            if ((i3 + 6) * i4 == 0) {
                throw null;
            }
            Cipher cipher4 = cipher;
            cipher4.init(2, privateKeyGeneratePrivate, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT));
            byte[] bArrDoFinal2 = cipher4.doFinal(Base64.decode(str, 0));
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset2, str2);
            return new String(bArrDoFinal2, charset2);
        }

        public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws Throwable {
            Method method;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            String str2 = Camera2InteropExtender.b;
            ArrayList arrayList = new ArrayList();
            byte[] bArr = $$a;
            int i2 = 1;
            byte b2 = (byte) (bArr[36] - 1);
            byte b3 = b2;
            Object[] objArr = new Object[1];
            c(b2, b3, b3, objArr);
            int i3 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b4 = (byte) (-bArr[19]);
            Object[] objArr2 = new Object[1];
            c(b4, (byte) (b4 + 2), bArr[36], objArr2);
            Method[] methodArr = {cls.getMethod((String) objArr2[0], String.class)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iAlpha = Color.alpha(0) + 2823;
                int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                byte[] bArr2 = $$d;
                byte b5 = bArr2[7];
                Object[] objArr3 = new Object[1];
                d(b5, b5, (byte) (-bArr2[5]), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAlpha, iResolveSizeAndState, 1814927978, false, (String) objArr3[0], null);
            }
            Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
            char c2 = '0';
            if (obj == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2823 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = b + 19;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                    int i6 = i5 % 2;
                    Method method2 = declaredMethods[i4];
                    try {
                        Object[] objArr4 = new Object[i2];
                        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - TextUtils.lastIndexOf("", c2, i3), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr4);
                        Class<?> cls2 = Class.forName((String) objArr4[i3]);
                        int capsMode = TextUtils.getCapsMode("", i3, i3) + 24;
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12;
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(i3);
                        Object[] objArr5 = new Object[i2];
                        a(capsMode, doubleTapTimeout, cNormalizeMetaState, objArr5);
                        Object[] objArr6 = new Object[i2];
                        objArr6[0] = Integer.valueOf(((Integer) cls2.getMethod((String) objArr5[0], null).invoke(method2, null)).intValue());
                        Object[] objArr7 = new Object[i2];
                        a(Process.getGidForName("") + 37, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr7);
                        Class<?> cls3 = Class.forName((String) objArr7[0]);
                        Method[] methodArr2 = declaredMethods;
                        Object[] objArr8 = new Object[1];
                        a(View.getDefaultSize(0, 0) + 62, 7 - MotionEvent.axisFromString(""), (char) Color.argb(0, 0, 0, 0), objArr8);
                        if (((Boolean) cls3.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            Class cls4 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            a(ViewConfiguration.getMinimumFlingVelocity() >> 16, KeyEvent.keyCodeFromString("") + 24, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr9);
                            Class<?> cls5 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            a(View.getDefaultSize(0, 0) + 70, 13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (21322 - TextUtils.getCapsMode("", 0, 0)), objArr10);
                            if (cls4.equals(cls5.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                Object[] objArr11 = new Object[1];
                                a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, Gravity.getAbsoluteGravity(0, 0) + 24, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr11);
                                Class<?> cls6 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                a((ViewConfiguration.getLongPressTimeout() >> 16) + 83, 17 - KeyEvent.normalizeMetaState(0), (char) (MotionEvent.axisFromString("") + 57926), objArr12);
                                Object[] objArr13 = (Object[]) cls6.getMethod((String) objArr12[0], null).invoke(method2, null);
                                if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0])) {
                                    int i7 = b + 51;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                    int i8 = i7 % 2;
                                    Object[] objArr14 = new Object[1];
                                    a(View.resolveSizeAndState(0, 0, 0), 23 - MotionEvent.axisFromString(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr14);
                                    if (Class.forName((String) objArr14[0]).equals(objArr13[1])) {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                            int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2822;
                                            int i10 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            byte[] bArr3 = $$d;
                                            byte b6 = bArr3[7];
                                            Object[] objArr15 = new Object[1];
                                            d(b6, b6, (byte) (-bArr3[5]), objArr15);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, i9, i10, 1814927978, false, (String) objArr15[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2823;
                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                                            byte[] bArr4 = $$d;
                                            byte b7 = bArr4[7];
                                            Object[] objArr16 = new Object[1];
                                            d(b7, b7, (byte) (-bArr4[5]), objArr16);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatDelay, i11, iLastIndexOf, 1814927978, false, (String) objArr16[0], null);
                                        }
                                        try {
                                            Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                                int i12 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
                                                byte[] bArr5 = $$d;
                                                Object[] objArr18 = new Object[1];
                                                d(bArr5[54], (byte) (-bArr5[5]), bArr5[7], objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAxisFromString, i12, longPressTimeout, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr17)).longValue();
                                            break;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i4++;
                        declaredMethods = methodArr2;
                        c2 = '0';
                        i2 = 1;
                        i3 = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2823;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 22;
                byte[] bArr6 = $$d;
                byte b8 = bArr6[7];
                Object[] objArr19 = new Object[1];
                d(b8, b8, (byte) (-bArr6[5]), objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, maximumFlingVelocity, offsetAfter, 1814927978, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iMyTid = 2823 - (Process.myTid() >> 22);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                byte[] bArr7 = $$d;
                Object[] objArr21 = new Object[1];
                d((byte) 14, (byte) (-bArr7[5]), bArr7[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, iMyTid, scrollBarFadeDuration, 1025296417, false, (String) objArr21[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20);
            Object[] objArr22 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char windowTouchSlop = (char) (37657 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2721;
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 19;
                byte[] bArr8 = $$d;
                Object[] objArr23 = new Object[1];
                d((byte) 14, (byte) (-bArr8[5]), bArr8[7], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, i13, fadingEdgeLength, -1568796068, false, (String) objArr23[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr22)).longValue();
            long j = -1118097033;
            long j2 = (((long) (-244)) * j) + (((long) 246) * jLongValue);
            long j3 = -245;
            long j4 = -1;
            long j5 = jLongValue ^ j4;
            long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
            long j6 = j2 + ((((j5 | (jElapsedRealtime ^ j4)) ^ j4) | ((j5 | j) ^ j4)) * j3);
            long j7 = (jElapsedRealtime | j5) ^ j4;
            long j8 = j6 + (j3 * j7) + (((long) 245) * (j7 | j)) + ((long) (-692308812));
            int iMyUid = Process.myUid();
            int i14 = (~(573336095 | iMyUid)) | 1439864256;
            int i15 = ((int) (j8 >> 32)) & (1537498186 + (i14 * 992) + ((i14 | (~((~iMyUid) | (-2637846)))) * (-496)) + ((iMyUid | 2010562506) * 496));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i16 = ~iFreeMemory;
            int i17 = i15 | (((int) j8) & ((-501357939) + (((~((-83524285) | i16)) | 73018008) * 168) + ((~((-73018009) | iFreeMemory)) * 168) + (((~(iFreeMemory | (-10506277))) | (~(i16 | 1520750694)) | (-1593768703)) * 168)));
            int i18 = i17 >>> 24;
            int i19 = i17 & ViewCompat.MEASURED_SIZE_MASK;
            int i20 = i18 != 0 ? 1 : 0;
            arrayList.add((i20 == 0 || i19 >= 1 || (method = methodArr[i19]) == null) ? null : method.toString());
            if ((i18 + 6) * i20 != 0) {
                throw null;
            }
            String strReplace$default = StringsKt.replace$default(str2, "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null);
            String strLineSeparator = System.lineSeparator();
            Intrinsics.checkNotNullExpressionValue(strLineSeparator, "");
            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(StringsKt.replace$default(StringsKt.replace$default(strReplace$default, strLineSeparator, "", false, 4, (Object) null), "-----END PUBLIC KEY-----", "", false, 4, (Object) null), 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
            MGF1ParameterSpec mGF1ParameterSpec = new MGF1ParameterSpec("SHA-256");
            int length2 = str != null ? str.length() : 0;
            if (setVideoCaptureQualitySelector.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
                int i21 = b + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                int i22 = i21 % 2;
                Toast.makeText((Context) null, length2 / (((length2 - 1) * length2) % 2), 0).show();
                int i23 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                int i24 = i23 % 2;
            }
            cipher.init(1, publicKeyGeneratePublic, new OAEPParameterSpec("SHA-256", "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrEncode = Base64.encode(cipher.doFinal(bytes), 0);
            Intrinsics.checkNotNullExpressionValue(bArrEncode, "");
            String str3 = new String(bArrEncode, Charsets.UTF_8);
            String strLineSeparator2 = System.lineSeparator();
            Intrinsics.checkNotNullExpressionValue(strLineSeparator2, "");
            return StringsKt.replace$default(str3, strLineSeparator2, "", false, 4, (Object) null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, byte r7, byte r8) {
            /*
                int r6 = r6 * 3
                int r6 = 115 - r6
                byte[] r0 = defpackage.Camera2InteropExtender.Companion.$$c
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r7]
            L26:
                int r6 = r6 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2InteropExtender.Companion.$$g(int, byte, byte):java.lang.String");
        }
    }
}
