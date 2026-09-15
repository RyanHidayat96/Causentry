package defpackage;

import com.bpjstku.data.bsu.model.BsuConfig;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.config.model.RegisterParticipantConfig;
import com.bpjstku.data.lib.ErrorResponse;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.midtrans.sdk.analytics.MixpanelEvent;
import com.midtrans.sdk.analytics.MixpanelProperties;
import com.midtrans.sdk.corekit.models.BcaBankTransferRequestModel;
import com.midtrans.sdk.corekit.models.BillingAddress;
import com.midtrans.sdk.corekit.models.CardPaymentDetails;
import com.midtrans.sdk.corekit.models.CardTokenRequest;
import com.midtrans.sdk.corekit.models.CardTransfer;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.DescriptionModel;
import com.midtrans.sdk.corekit.models.ExpiryModel;
import com.midtrans.sdk.corekit.models.FreeText;
import com.midtrans.sdk.corekit.models.FreeTextLanguage;
import com.midtrans.sdk.corekit.models.ItemDetails;
import com.midtrans.sdk.corekit.models.PermataBankTransferRequestModel;
import com.midtrans.sdk.corekit.models.RegisterCardResponse;
import com.midtrans.sdk.corekit.models.ShippingAddress;
import com.midtrans.sdk.corekit.models.SnapTransactionDetails;
import com.midtrans.sdk.corekit.models.TokenRequestModel;
import com.midtrans.sdk.corekit.models.TransactionDetails;
import com.midtrans.sdk.corekit.models.TransactionModel;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.VaNumber;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Gopay;
import com.midtrans.sdk.corekit.models.snap.Installment;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import com.midtrans.sdk.corekit.models.snap.Shopeepay;
import com.midtrans.sdk.corekit.models.snap.SnapPromo;
import com.midtrans.sdk.corekit.models.snap.UobEzpay;

/* JADX INFO: loaded from: classes4.dex */
public final class removeObserverLocked implements TypeAdapterFactory {
    private static final SingleImageProxyBundle TuitionPaymentFragmentbindingInflater1 = new SingleImageProxyBundle();
    private static final StateObservableObserverWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new StateObservableObserverWrapper();

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (gson.fieldNamingStrategy != FieldNamingPolicy.IDENTITY) {
            return null;
        }
        try {
            if (typeToken.getRawType() == createPBufferSurface.class) {
                return new getEglSurface(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused) {
        }
        try {
            if (typeToken.getRawType() == TokenRequestModel.class) {
                return new OutConfig(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused2) {
        }
        try {
            if (typeToken.getRawType() == TransactionModel.class) {
                return new GraphicDeviceInfoBuilder(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused3) {
        }
        try {
            if (typeToken.getRawType() == DescriptionModel.class) {
                return new GLUtils3(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused4) {
        }
        try {
            if (typeToken.getRawType() == TransactionResponse.class) {
                return new ResolutionSelector(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused5) {
        }
        try {
            if (typeToken.getRawType() == Shopeepay.class) {
                return new ResolutionStrategyResolutionFallbackRule(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused6) {
        }
        try {
            if (typeToken.getRawType() == ItemDetails.class) {
                return new updateAlpha(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused7) {
        }
        try {
            if (typeToken.getRawType() == SnapPromo.class) {
                return new setResolutionStrategy(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused8) {
        }
        try {
            if (typeToken.getRawType() == ErrorResponse.class) {
                return new sendSessionDestroyed(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused9) {
        }
        try {
            if (typeToken.getRawType() == CardTokenRequest.class) {
                return new GLUtilsProgram2D(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused10) {
        }
        try {
            if (typeToken.getRawType() == BsuConfig.class) {
                return new sendRepeatMode(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused11) {
        }
        try {
            if (typeToken.getRawType() == SnapTransactionDetails.class) {
                return new updateTextureMatrix(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused12) {
        }
        try {
            if (typeToken.getRawType() == MixpanelProperties.class) {
                return new generateTexture(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused13) {
        }
        try {
            if (typeToken.getRawType() == GLUtils.class) {
                return new DualSurfaceProcessorNodeIn(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused14) {
        }
        try {
            if (typeToken.getRawType() == createPrograms.class) {
                return new setGlVersion(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused15) {
        }
        try {
            if (typeToken.getRawType() == lambdasubmitStillCaptureRequests0.class) {
                return new VirtualCameraCaptureResult(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused16) {
        }
        try {
            if (typeToken.getRawType() == createTexture.class) {
                return new setGlExtensions(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused17) {
        }
        try {
            if (typeToken.getRawType() == FreeText.class) {
                return new GLUtilsSamplerShaderProgram(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused18) {
        }
        try {
            if (typeToken.getRawType() == CardPaymentDetails.class) {
                return new loadShader(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused19) {
        }
        try {
            if (typeToken.getRawType() == VaNumber.class) {
                return new ResolutionFilter(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused20) {
        }
        try {
            if (typeToken.getRawType() == CardTransfer.class) {
                return new GLUtilsInputFormat(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused21) {
        }
        try {
            if (typeToken.getRawType() == BcaBankTransferRequestModel.class) {
                return new GLUtils1(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused22) {
        }
        try {
            if (typeToken.getRawType() == FreeTextLanguage.class) {
                return new resolveDefaultShaderProvider(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused23) {
        }
        try {
            if (typeToken.getRawType() == PermataBankTransferRequestModel.class) {
                return new loadLocations(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused24) {
        }
        try {
            if (typeToken.getRawType() == BillingAddress.class) {
                return new querySurface(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused25) {
        }
        try {
            if (typeToken.getRawType() == checkInitializedOrThrow.class) {
                return new AutoValue_GraphicDeviceInfoBuilder(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused26) {
        }
        try {
            if (typeToken.getRawType() == shouldRespectInputCropRect.class) {
                return new getEglVersion(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused27) {
        }
        try {
            if (typeToken.getRawType() == checkEglErrorOrThrow.class) {
                return new setEglExtensions(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused28) {
        }
        try {
            if (typeToken.getRawType() == RegisterCardResponse.class) {
                return new use(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused29) {
        }
        try {
            if (typeToken.getRawType() == MixpanelEvent.class) {
                return new createFloatBuffer(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused30) {
        }
        try {
            if (typeToken.getRawType() == AutoValue_GraphicDeviceInfo.class) {
                return new DualSurfaceProcessorNodeOut(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused31) {
        }
        try {
            if (typeToken.getRawType() == checkEglErrorOrLog.class) {
                return new getGlExtensions(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused32) {
        }
        try {
            if (typeToken.getRawType() == ExpiryModel.class) {
                return new GLUtils2(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused33) {
        }
        try {
            if (typeToken.getRawType() == AntreanMenuConfig.class) {
                return new sendMetadata(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused34) {
        }
        try {
            if (typeToken.getRawType() == checkLocationOrThrow.class) {
                return new setEglVersion(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused35) {
        }
        try {
            if (typeToken.getRawType() == TransactionDetails.class) {
                return new GraphicDeviceInfo(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused36) {
        }
        try {
            if (typeToken.getRawType() == checkGlThreadOrThrow.class) {
                return new AutoValue_OutConfig(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused37) {
        }
        try {
            if (typeToken.getRawType() == Installment.class) {
                return new DynamicRangeUtils(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused38) {
        }
        try {
            if (typeToken.getRawType() == chooseSurfaceAttrib.class) {
                return new getGlVersion(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused39) {
        }
        try {
            if (typeToken.getRawType() == ShippingAddress.class) {
                return new AspectRatioStrategy(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused40) {
        }
        try {
            if (typeToken.getRawType() == UobEzpay.class) {
                return new ResolutionsMerger(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused41) {
        }
        try {
            if (typeToken.getRawType() == RegisterParticipantConfig.class) {
                return new sendShuffleMode(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused42) {
        }
        try {
            if (typeToken.getRawType() == Gopay.class) {
                return new ResolutionStrategy(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused43) {
        }
        try {
            if (typeToken.getRawType() == CustomerDetails.class) {
                return new GLUtilsBlankShaderProgram(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused44) {
        }
        try {
            if (typeToken.getRawType() == CreditCard.class) {
                return new setResolutionFilter(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused45) {
        }
        try {
            if (typeToken.getRawType() == checkGlErrorOrThrow.class) {
                return new AutoValue_GraphicDeviceInfo1(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused46) {
        }
        try {
            if (typeToken.getRawType() == BankTransferRequestModel.class) {
                return new fromResolutionSelector(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } catch (NoClassDefFoundError unused47) {
        }
        try {
            if (typeToken.getRawType() == SavedToken.class) {
                return new getBoundSize(gson, TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return null;
        } catch (NoClassDefFoundError unused48) {
            return null;
        }
    }
}
