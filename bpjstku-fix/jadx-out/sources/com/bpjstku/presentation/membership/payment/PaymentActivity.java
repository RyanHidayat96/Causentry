package com.bpjstku.presentation.membership.payment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.request.CheckOneTimePaymentStatusRequest;
import com.bpjstku.data.payment.model.request.CheckRecurringStatusRequest;
import com.bpjstku.data.payment.model.request.CreateCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetCustomerObjectRequest;
import com.bpjstku.data.payment.model.request.GetListPaymentMethodRequest;
import com.bpjstku.data.payment.model.response.ActionLinkingStatus;
import com.bpjstku.data.payment.model.response.CheckOneTimePaymentResponse;
import com.bpjstku.data.payment.model.response.CreateOneTimePaymentResponse;
import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.PaymentMethodItem;
import com.bpjstku.data.payment.model.response.PaymentMethodResult;
import com.bpjstku.data.payment.model.response.RecurringProfile;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.databinding.ActivityPaymentBinding;
import com.bpjstku.di.ApiModuleKt;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.tuition.model.BpuTuitionOneMonth;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.payment.model.CategoryPayment;
import com.bpjstku.presentation.membership.payment.model.ItemCategoryPayment;
import com.bpjstku.presentation.tuition.model.CustomerObject;
import com.bpjstku.presentation.tuition.model.LinkedAccountDirectDebit;
import com.bpjstku.presentation.tuition.model.LinkedAccountEwallet;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.enums.AppsFlyerEventEnum;
import com.bpjstku.util.managers.AppsFlyerManager;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState;
import com.google.gson.internal.bind.TypeAdapters;
import com.midtrans.sdk.corekit.callback.TransactionFinishedCallback;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentMethod;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.core.TransactionRequest;
import com.midtrans.sdk.corekit.core.themes.CustomColorTheme;
import com.midtrans.sdk.corekit.models.BillingAddress;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.ItemDetails;
import com.midtrans.sdk.corekit.models.ShippingAddress;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2InteropExtender;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.InputConfigurationCompat;
import defpackage.ListPopupWindow2;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getCameraOperatingMode;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getShowDividers;
import defpackage.initSession;
import defpackage.intersectDynamicRangeEncoding;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setDisabled;
import defpackage.setQuickZoomEnabled;
import defpackage.setSessionStateCallback;
import defpackage.setSessionType;
import defpackage.share;
import defpackage.updateCloseButton;
import defpackage.updateSubmitArea;
import defpackage.updateVoiceButton;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.koin.core.error.ScopeAlreadyCreatedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0005J\u001b\u0010\r\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\r\u0010\u0012J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\u0013J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0005J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\r\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010!\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010\u0007\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010\f\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u00108\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00100R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u00100R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010\u0014\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u00109\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010+R\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010B\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010,\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010>\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u0010@\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0018\u0010;\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010JR\u0016\u0010S\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010+R\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010ER\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010ER\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010ER\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010ER\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010ER\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020 0\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010ER\u0016\u0010N\u001a\u00020Z8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b3\u0010[R\u0016\u0010T\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b8\u0010+R\u0018\u0010W\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\r\u0010]R\u0018\u0010Y\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b?\u0010+R\u0016\u0010V\u001a\u00020\b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bA\u00100R\u0016\u0010U\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b:\u0010+R\u0016\u0010G\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b=\u0010+R\u0016\u0010'\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0015\u0010`\u001a\u00020^8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bF\u0010_R\u0017\u0010-\u001a\u0004\u0018\u00010a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bb\u0010_R\u0016\u0010.\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u0010e\u001a\u00020c8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b5\u0010dR\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b)\u0010ER\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010ER\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020f0\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020f0\u000f8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b!\u0010ER\u0015\u00104\u001a\u00020h8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bi\u0010_R\u0015\u0010k\u001a\u00020j8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\be\u0010_R\u0014\u0010*\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010+R\u0016\u00101\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010+R\u0015\u00106\u001a\u00020l8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bk\u0010_R \u00102\u001a\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u00020m8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010oR\u001a\u0010q\u001a\u00020c8\u0015X\u0095D¢\u0006\f\n\u0004\bS\u0010d\u001a\u0004\b)\u0010p"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPaymentBinding;", "Lcom/midtrans/sdk/corekit/callback/TransactionFinishedCallback;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "RemoteActionCompatParcelizer", "()Z", "onBackPressed", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "", "Lcom/bpjstku/presentation/membership/payment/model/CategoryPayment;", "p0", "(Ljava/util/List;)V", "(Z)V", "INotificationSideChannelStubProxy", "", "", "p1", "p2", "(Ljava/lang/String;Z)V", "asBinder", "a", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "Lcom/bpjstku/data/payment/model/response/PaymentMethodItem;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lcom/midtrans/sdk/corekit/models/snap/TransactionResult;", "onTransactionFinished", "(Lcom/midtrans/sdk/corekit/models/snap/TransactionResult;)V", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "onConnectionFailed", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "onResult", "Ljava/lang/String;", "IconCompatParcelizer", "onConnected", "MediaBrowserCompatConnectionCallback", "MediaBrowserCompatConnectionCallbackConnectionCallbackInternal", "Z", "MediaBrowserCompatCustomActionResultReceiver", "onReceiveResult", "d", "onProgressUpdate", "g", "MediaBrowserCompatItemCallback", "onError", "cancel", "getInterfaceDescriptor", "notify", "connect", "D", "INotificationSideChannel", "write", "cancelAll", "read", "onTransact", "MediaBrowserCompat", "INotificationSideChannelDefault", "sendCustomAction", "Ljava/util/List;", "INotificationSideChannelStub", "subscribe", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;", "getNotifyChildrenChangedOptions", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountDirectDebit;", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;", "getSessionToken", "Lcom/bpjstku/presentation/tuition/model/LinkedAccountEwallet;", "isConnected", "disconnect", "getItem", "getRoot", "MediaBrowserCompatConnectionCallbackStubApi21", "getExtras", FirebaseAnalytics.Event.SEARCH, "handleMessage", "unsubscribe", "setCallbacksMessenger", "getServiceComponent", "MediaBrowserCompatCallbackHandler", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "Lcom/bpjstku/presentation/tuition/model/CustomerObject;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lkotlin/Lazy;", "onConnectionSuspended", "Lcom/bpjstku/domain/user/model/User;", "MediaBrowserCompatMediaBrowserImplApi21", "", "I", "setInternalConnectionCallback", "Lcom/bpjstku/presentation/membership/payment/model/ItemCategoryPayment;", "MediaBrowserCompatCustomActionCallback", "LInputConfigurationCompat;", "MediaBrowserCompatItemReceiver", "LListPopupWindow2;", "onItemLoaded", "Lcom/bpjstku/domain/registration/general/model/Registration;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "MediaBrowserCompatItemCallbackStubApi23"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentActivity extends BindingBaseActivity<ActivityPaymentBinding> implements TransactionFinishedCallback {
    private static char[] MediaBrowserCompatItemCallbackStubApi23;
    private static char MediaBrowserCompatMediaBrowserImpl;
    private static int MediaBrowserCompatMediaBrowserImplApi211;
    private static int MediaBrowserCompatMediaBrowserImplApi212;
    private static int MediaBrowserCompatMediaBrowserImplApi213;
    private static int MediaBrowserCompatMediaBrowserImplApi214;
    private static short[] MediaBrowserCompatMediaBrowserImplApi23;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long onLoadChildren;
    private static byte[] onServiceConnected;
    private static int[] run;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy onConnectionSuspended;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private double INotificationSideChannelDefault;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, reason: from kotlin metadata */
    private boolean a;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean asInterface;

    /* JADX INFO: renamed from: MediaBrowserCompatItemCallback, reason: from kotlin metadata */
    private boolean asBinder;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Lazy onProgressUpdate;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private double INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public CustomerObject setCallbacksMessenger;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private double INotificationSideChannel;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private LinkedAccountEwallet read;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int setInternalConnectionCallback;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private boolean notify;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    private LinkedAccountEwallet connect;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    private LinkedAccountDirectDebit MediaBrowserCompat;
    private LinkedAccountDirectDebit getRoot;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    private LinkedAccountEwallet IconCompatParcelizer;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    private LinkedAccountEwallet write;

    /* JADX INFO: renamed from: onConnectionFailed, reason: from kotlin metadata */
    private RecurringProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: onError, reason: from kotlin metadata */
    private boolean cancel;

    /* JADX INFO: renamed from: onProgressUpdate, reason: from kotlin metadata */
    private boolean g;

    /* JADX INFO: renamed from: onReceiveResult, reason: from kotlin metadata */
    private boolean d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public boolean unsubscribe;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private double onTransact;

    /* JADX INFO: renamed from: setInternalConnectionCallback, reason: from kotlin metadata */
    private final Lazy onItemLoaded;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private double cancelAll;
    private static final byte[] $$c = {119, -102, -34, -3};
    private static final int $$f = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {41, 2, 45, -60, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 130;
    private static final byte[] MediaBrowserCompatMediaBrowserImplBase = {97, 58, 103, -72, -14, -13, -13, -11, 41, -15, -17, -2, 12, -41, -5, -28, 5, -29, -19};
    private static final int getStateLabel = 225;
    private static int MediaBrowserCompatMediaBrowserImplApi216 = 1;
    private static int MediaBrowserCompatMediaBrowserImplApi217 = 0;
    private static int MediaBrowserCompatMediaBrowserImplApi215 = 1;

    /* JADX INFO: renamed from: onResult, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";

    /* JADX INFO: renamed from: onConnected, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
    private String b = "";

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String getInterfaceDescriptor = "";

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    private List<PaymentMethodItem> INotificationSideChannelStub = new ArrayList();

    /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
    private List<PaymentMethodItem> RemoteActionCompatParcelizer = new ArrayList();

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackStubApi21, reason: from kotlin metadata */
    private String getExtras = "";

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    private List<PaymentMethodItem> getItem = new ArrayList();

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    private List<PaymentMethodItem> disconnect = new ArrayList();

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    private List<PaymentMethodItem> getNotifyChildrenChangedOptions = new ArrayList();

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    private List<PaymentMethodItem> getSessionToken = new ArrayList();
    private List<PaymentMethodItem> getServiceComponent = new ArrayList();

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    private List<PaymentMethodItem> sendCustomAction = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LinearLayoutManager isConnected = new LinearLayoutManager(this);

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public String search = "";

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public String MediaBrowserCompatCallbackHandler = "";

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public String handleMessage = "";

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public String subscribe = "";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public String onConnectionFailed = "";

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi21, reason: from kotlin metadata */
    private final Lazy onConnected = LazyKt.lazy(new Function0() { // from class: setMeasureWithLargestChildEnabled
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public String MediaBrowserCompatConnectionCallback = "";

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public List<CategoryPayment> MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public List<ItemCategoryPayment> MediaBrowserCompatCustomActionCallback = new ArrayList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public List<ItemCategoryPayment> MediaBrowserCompatConnectionCallbackStubApi21 = new ArrayList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public List<ItemCategoryPayment> onError = new ArrayList();

    /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
    private final String onResult = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionCallback, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver = "";

    /* JADX INFO: renamed from: onItemLoaded, reason: from kotlin metadata */
    private final Lazy MediaBrowserCompatItemCallback = LazyKt.lazy(new Function0() { // from class: setVerticalGravity
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return (Registration) PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this.b}, 445543140, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -445543135, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    });

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemCallbackStubApi23 = R.layout.activity_payment;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i2)) | i3;
        int i9 = i2 | i3 | i7;
        int i10 = i3 + i + i4 + (1159740906 * i6) + ((-617157175) * i5);
        int i11 = i10 * i10;
        int i12 = ((i3 * 934236018) - 2089811968) + (934236018 * i) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i4) + (1488977920 * i6) + (2111832064 * i5) + (2070937600 * i11);
        int i13 = (i3 * (-824977050)) + 1921657099 + (i * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i4 * (-824977973)) + (i6 * (-135083378)) + (i5 * 1125239651) + (i11 * 298844160);
        switch (i12 + (i13 * i13 * 2098200576)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 4:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return a(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return g(objArr);
            case 9:
                return d(objArr);
            case 10:
                return cancel(objArr);
            default:
                return b(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 98
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplBase
            int r7 = r7 * 5
            int r1 = 11 - r7
            int r8 = r8 * 5
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = 10 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + (-12)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = 196 - r6
            int r0 = 53 - r5
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r1 = com.bpjstku.presentation.membership.payment.PaymentActivity.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.e(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r1
  0x0039: PHI (r1v10 int[]) = (r1v7 int[]), (r1v11 int[]) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v8 int[]) = (r1v7 int[]), (r1v11 int[]) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    private static InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream, int i, int i2, int i3, byte[] bArr) throws IOException {
        int[] iArr;
        int i4 = 2 % 2;
        int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 67;
        int i6 = i5 % 128;
        MediaBrowserCompatMediaBrowserImplApi215 = i6;
        boolean z = false;
        if (i5 % 2 == 0) {
            long j = onLoadChildren;
            iArr = new int[]{((int) (j >> 14)) ^ i, 0};
            iArr[0] = i ^ ((int) j);
            if (i2 <= 38) {
                z = true;
            } else {
                int i7 = i6 + 87;
                MediaBrowserCompatMediaBrowserImplApi217 = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            long j2 = onLoadChildren;
            iArr = new int[]{((int) (j2 >>> 32)) ^ i, i ^ ((int) j2)};
            if (i2 <= 6) {
                z = true;
            } else {
                int i9 = i6 + 87;
                MediaBrowserCompatMediaBrowserImplApi217 = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return new setSessionType(inputStream, iArr, bArr, i2, z, i3);
    }

    public PaymentActivity() {
        final PaymentActivity paymentActivity = this;
        this.onConnectionSuspended = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.payment.PaymentActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = paymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.onProgressUpdate = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: com.bpjstku.presentation.membership.payment.PaymentActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = paymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.onItemLoaded = LazyKt.lazy(new Function0<ListPopupWindow2>() { // from class: com.bpjstku.presentation.membership.payment.PaymentActivity$special$$inlined$viewModel$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ListPopupWindow2, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ListPopupWindow2 invoke() {
                LifecycleOwner lifecycleOwner = paymentActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListPopupWindow2.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.payment.PaymentActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/bpjstku/presentation/membership/payment/PaymentActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/domain/registration/general/model/Registration;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lcom/bpjstku/domain/registration/general/model/Registration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, Registration p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = new Intent(p0, (Class<?>) PaymentActivity.class);
            intent.putExtra("successful_unregistered_registration_data", p1);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        MediaBrowserCompatMediaBrowserImplApi214 = 0;
        INotificationSideChannelDefault();
        getInterfaceDescriptor();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[0], 198775629, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -198775625, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        INSTANCE = new Companion(null);
        byte b = (byte) 0;
        byte b2 = (byte) (b + 1);
        Object[] objArr = new Object[1];
        c(b, b2, (byte) (b2 - 1), objArr);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((String) objArr[0]);
        int i = MediaBrowserCompatMediaBrowserImplApi216 + 47;
        MediaBrowserCompatMediaBrowserImplApi214 = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    private static void h(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = run;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 25;
            MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = MediaBrowserCompatMediaBrowserImplApi217 + 5;
                MediaBrowserCompatMediaBrowserImplApi215 = i6 % 128;
                int i7 = i6 % 2;
                iArr3[i5] = (int) (((long) iArr2[i5]) ^ (-5478555601014950779L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = run;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i8 = 0; i8 < length3; i8++) {
                iArr6[i8] = (int) (((long) iArr5[i8]) ^ (-5478555601014950779L));
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = 2;
        int i9 = MediaBrowserCompatMediaBrowserImplApi217 + 111;
        MediaBrowserCompatMediaBrowserImplApi215 = i9 % 128;
        int i10 = i9 % 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            for (int i11 = 17; i11 > 1; i11--) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i11];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1) ^ sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i12 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12;
            }
            int i13 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr[sessionConfigValidatingBuilder.b - 1];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPaymentBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 21;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        PaymentActivity$bindingInflater$1 paymentActivity$bindingInflater$1 = PaymentActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 37;
        MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
        int i5 = i4 % 2;
        return paymentActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215;
        int i3 = i2 + 107;
        MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.MediaBrowserCompatItemCallbackStubApi23;
        int i6 = i2 + 21;
        MediaBrowserCompatMediaBrowserImplApi217 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityPaymentBinding activityPaymentBinding = (ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityPaymentBinding.cvInstruction.setOnClickListener(new View.OnClickListener() { // from class: getAnchorView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        activityPaymentBinding.btnInfoPaymentBankingMitra.setOnClickListener(new View.OnClickListener() { // from class: createDropDownListView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        activityPaymentBinding.tvCopyPaymentCode.setOnClickListener(new View.OnClickListener() { // from class: getPromptPosition
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentActivity.TuitionPaymentFragmentbindingInflater1(this.b, activityPaymentBinding, view);
            }
        });
        activityPaymentBinding.btnPayment.setOnClickListener(new View.OnClickListener() { // from class: getInputMethodMode
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view}, -363961242, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 363961244, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 113;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void f(int i, int i2, short s, int i3, byte b, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatMediaBrowserImplApi211)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            char c = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                int iResolveSizeAndState = 33 - View.resolveSizeAndState(0, 0, 0);
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i5, iResolveSizeAndState, 1387473586, false, $$i((byte) 0, length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if ((i6 ^ 1) == 1) {
                j = 3046761265686732006L;
            } else {
                byte[] bArr = onServiceConnected;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = $11 + 39;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                int minimumFlingVelocity = 3358 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int iLastIndexOf = 17 - TextUtils.lastIndexOf("", c, 0, 0);
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel, minimumFlingVelocity, iLastIndexOf, -1054011043, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3358, 17 - MotionEvent.axisFromString(""), -1054011043, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i7++;
                        }
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 119;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = onServiceConnected;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatMediaBrowserImplApi212)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int bitsPerPixel2 = 2266 - ImageFormat.getBitsPerPixel(0);
                        int absoluteGravity = 33 - Gravity.getAbsoluteGravity(0, 0);
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, bitsPerPixel2, absoluteGravity, 1387473586, false, $$i((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) MediaBrowserCompatMediaBrowserImplApi211) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatMediaBrowserImplApi23[i + ((int) (((long) MediaBrowserCompatMediaBrowserImplApi212) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) MediaBrowserCompatMediaBrowserImplApi211) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - 2) + ((int) (((long) MediaBrowserCompatMediaBrowserImplApi212) ^ j)) + i6;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatMediaBrowserImplApi213), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maximumFlingVelocity = (char) (55904 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int i11 = 2856 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int maximumFlingVelocity2 = 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b6 = (byte) (-$$c[3]);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, i11, maximumFlingVelocity2, -1529949196, false, $$i((byte) 0, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = onServiceConnected;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    int i12 = 0;
                    while (i12 < length4) {
                        int i13 = $11 + 63;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) | 3046761265686732006L);
                            i12 >>>= 1;
                        } else {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                            i12++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i14 = $11;
                    int i15 = i14 + 119;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    if (!z) {
                        short[] sArr = MediaBrowserCompatMediaBrowserImplApi23;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        int i18 = i14 + 15;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        byte[] bArr6 = onServiceConnected;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i20]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void i(byte b, int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = MediaBrowserCompatItemCallbackStubApi23;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr3[i4] = (char) (((long) cArr2[i4]) ^ (-5756406921576980639L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-5756406921576980639L) ^ ((long) MediaBrowserCompatMediaBrowserImpl));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 45;
            MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
            int i6 = i5 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i7 = MediaBrowserCompatMediaBrowserImplApi217 + 99;
                    MediaBrowserCompatMediaBrowserImplApi215 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                } else {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deinitsession.b / c;
                    deinitsession.g = deinitsession.b % c;
                    deinitsession.TuitionPaymentFragmentbindingInflater1 = deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / c;
                    deinitsession.asBinder = deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % c;
                    if (deinitsession.g == deinitsession.asBinder) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + c) - 1) % c;
                        deinitsession.TuitionPaymentFragmentbindingInflater1 = ((deinitsession.TuitionPaymentFragmentbindingInflater1 + c) - 1) % c;
                        int i9 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * c) + deinitsession.g;
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * c) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i9];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                        int i11 = MediaBrowserCompatMediaBrowserImplApi215 + 73;
                        MediaBrowserCompatMediaBrowserImplApi217 = i11 % 128;
                        int i12 = i11 % 2;
                        deinitsession.g = ((deinitsession.g + c) - 1) % c;
                        deinitsession.asBinder = ((deinitsession.asBinder + c) - 1) % c;
                        int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * c) + deinitsession.g;
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * c) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * c) + deinitsession.asBinder;
                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * c) + deinitsession.g;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i17 = MediaBrowserCompatMediaBrowserImplApi217 + 31;
                MediaBrowserCompatMediaBrowserImplApi215 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private boolean RemoteActionCompatParcelizer() {
        double d;
        double dDoubleValue;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 83;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        String str = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str);
        Double doubleOrNull = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue2 = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        String str2 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str2);
        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str2, new String[]{"#"}, false, 0, 6, (Object) null).get(1));
        double dDoubleValue3 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        String str3 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str3);
        Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str3, new String[]{"#"}, false, 0, 6, (Object) null).get(2));
        double dDoubleValue4 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        String str4 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str4);
        Double doubleOrNull4 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str4, new String[]{"#"}, false, 0, 6, (Object) null).get(3));
        double dDoubleValue5 = doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d;
        String str5 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str5);
        Double doubleOrNull5 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str5, new String[]{"#"}, false, 0, 6, (Object) null).get(5));
        if (doubleOrNull5 != null) {
            dDoubleValue = doubleOrNull5.doubleValue();
            d = dDoubleValue3;
        } else {
            int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 101;
            MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
            int i5 = i4 % 2;
            d = dDoubleValue3;
            dDoubleValue = 0.0d;
        }
        String str6 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str6);
        String string = ((String) StringsKt.split$default((CharSequence) str6, new String[]{"#"}, false, 0, 6, (Object) null).get(7)).toString();
        String str7 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).MediaBrowserCompat;
        Intrinsics.checkNotNull(str7);
        Double doubleOrNull6 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) str7, new String[]{"#"}, false, 0, 6, (Object) null).get(4));
        double dDoubleValue6 = doubleOrNull6 != null ? doubleOrNull6.doubleValue() : 0.0d;
        if (!Intrinsics.areEqual(dDoubleValue, ((Registration) this.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub)) {
            return false;
        }
        int i6 = MediaBrowserCompatMediaBrowserImplApi217 + 3;
        MediaBrowserCompatMediaBrowserImplApi215 = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            Intrinsics.areEqual(dDoubleValue6, ((Registration) this.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy);
            throw null;
        }
        if (!Intrinsics.areEqual(dDoubleValue6, ((Registration) this.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy) || (!Intrinsics.areEqual(dDoubleValue5, StringsKt.toDoubleOrNull(((Registration) this.MediaBrowserCompatItemCallback.getValue()).a))) || !Intrinsics.areEqual(dDoubleValue2, StringsKt.toDoubleOrNull(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            return false;
        }
        if (!Intrinsics.areEqual(d, StringsKt.toDoubleOrNull(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1)) || !Intrinsics.areEqual(dDoubleValue4, StringsKt.toDoubleOrNull(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            return false;
        }
        int i7 = MediaBrowserCompatMediaBrowserImplApi215 + 103;
        MediaBrowserCompatMediaBrowserImplApi217 = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.areEqual(string, ((Registration) this.MediaBrowserCompatItemCallback.getValue()).cancel);
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(string, ((Registration) this.MediaBrowserCompatItemCallback.getValue()).cancel)) {
            return false;
        }
        int i8 = MediaBrowserCompatMediaBrowserImplApi217 + 11;
        MediaBrowserCompatMediaBrowserImplApi215 = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r0 = com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.INSTANCE;
        com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r5, (com.bpjstku.domain.registration.general.model.Registration) r5.MediaBrowserCompatItemCallback.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.domain.registration.general.model.Registration) r5.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor, "unregistered_member") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.bpjstku.domain.registration.general.model.Registration) r5.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor, "unregistered_member") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r0 = com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.INSTANCE;
        com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.Companion.b(r5);
        r5 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215 + 113;
        com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object asInterface(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            com.bpjstku.presentation.membership.payment.PaymentActivity r5 = (com.bpjstku.presentation.membership.payment.PaymentActivity) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215
            int r2 = r2 + 105
            int r3 = r2 % 128
            com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r3
            int r2 = r2 % r1
            java.lang.String r3 = "unregistered_member"
            r4 = 0
            if (r2 == 0) goto L2a
            kotlin.Lazy r2 = r5.MediaBrowserCompatItemCallback
            java.lang.Object r2 = r2.getValue()
            com.bpjstku.domain.registration.general.model.Registration r2 = (com.bpjstku.domain.registration.general.model.Registration) r2
            java.lang.String r2 = r2.getInterfaceDescriptor
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 49
            int r3 = r3 / r0
            if (r2 == 0) goto L51
            goto L3a
        L2a:
            kotlin.Lazy r0 = r5.MediaBrowserCompatItemCallback
            java.lang.Object r0 = r0.getValue()
            com.bpjstku.domain.registration.general.model.Registration r0 = (com.bpjstku.domain.registration.general.model.Registration) r0
            java.lang.String r0 = r0.getInterfaceDescriptor
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L51
        L3a:
            com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1 r0 = com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.INSTANCE
            android.content.Context r5 = (android.content.Context) r5
            com.bpjstku.presentation.membership.payment.SuccessRegistrationNonSalariedWorkerActivity.Companion.b(r5)
            int r5 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215
            int r5 = r5 + 113
            int r0 = r5 % 128
            com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r0
            int r5 = r5 % r1
            if (r5 != 0) goto L4d
            return r4
        L4d:
            r4.hashCode()
            throw r4
        L51:
            com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity$b r0 = com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.INSTANCE
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            kotlin.Lazy r5 = r5.MediaBrowserCompatItemCallback
            java.lang.Object r5 = r5.getValue()
            com.bpjstku.domain.registration.general.model.Registration r5 = (com.bpjstku.domain.registration.general.model.Registration) r5
            com.bpjstku.presentation.membership.payment.PaymentNonInstantDetailActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.asInterface(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object cancel(Object[] objArr) throws Throwable {
        String str;
        final PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        int i = 2 % 2;
        ActivityPaymentBinding activityPaymentBinding = (ActivityPaymentBinding) ((ViewBinding) paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) paymentActivity.onConnectionSuspended.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        if (userAsBinder != null) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 25;
            MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
            int i3 = i2 % 2;
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        String str2 = str;
        if ((str2 == null || str2.length() == 0) && Intrinsics.areEqual(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor, "cross_selling")) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Login session habis", 0).show();
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, null, false, 6);
            paymentActivity.d_();
        }
        paymentActivity.notify = false;
        Registration registration = (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue();
        String strSubstring = StringsKt.substring(registration.d, new IntRange(0, 3));
        String strSubstring2 = StringsKt.substring(registration.d, new IntRange(4, 7));
        String strSubstring3 = StringsKt.substring(registration.d, new IntRange(8, 11));
        String strSubstring4 = StringsKt.substring(registration.d, new IntRange(12, 15));
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append("-");
        sb.append(strSubstring2);
        sb.append("-");
        sb.append(strSubstring3);
        sb.append("-");
        sb.append(strSubstring4);
        String string = sb.toString();
        activityPaymentBinding.tvValueJHTTuituion.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        activityPaymentBinding.tvValueJKKTuituion.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(registration.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        activityPaymentBinding.tvValueJKMTuituion.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(registration.TuitionPaymentFragmentbindingInflater1));
        activityPaymentBinding.tvValueTotalTuition.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(registration.a));
        activityPaymentBinding.tvPaymentCode.setText(string);
        if (Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2) == 0.0d) {
            paymentActivity.MediaBrowserCompatConnectionCallback = ExifInterface.GPS_DIRECTION_TRUE;
            paymentActivity.setInternalConnectionCallback = 2;
        } else {
            paymentActivity.MediaBrowserCompatConnectionCallback = "L";
            paymentActivity.setInternalConnectionCallback = 3;
        }
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        InputConfigurationCompat inputConfigurationCompat = (InputConfigurationCompat) paymentActivity.onProgressUpdate.getValue();
        String str3 = paymentActivity.MediaBrowserCompatConnectionCallback;
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String str4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).connect;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append("#");
        sb2.append(string2);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion2, sb2.toString(), paymentActivity.onResult);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        String str5 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).connect;
        String str6 = paymentActivity.MediaBrowserCompatConnectionCallback;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str5);
        sb3.append("#");
        sb3.append(str6);
        sb3.append("#");
        sb3.append(string2);
        inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BpuOneMonthTuitionRequest("JMO", "1", str3, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion3, sb3.toString(), paymentActivity.onResult)));
        String releaseBaseUrl = ApiModuleKt.getReleaseBaseUrl();
        String midtransClientKey = ApiModuleKt.getMidtransClientKey();
        intersectDynamicRangeEncoding intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = intersectDynamicRangeEncoding.TuitionPaymentFragmentbindingInflater1();
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.context = paymentActivity;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(releaseBaseUrl);
        sb4.append("payment/transactions/");
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.merchantServerUrl = sb4.toString();
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.clientKey = midtransClientKey;
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.transactionFinishedCallback = paymentActivity;
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.enableLog = true;
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.colorTheme = new CustomColorTheme("#777777", "#f77474", "#3f0d0d");
        intersectdynamicrangeencodingTuitionPaymentFragmentbindingInflater1.buildSDK();
        paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal.add(0, new CategoryPayment("01", "Perbankan & Mitra", false));
        paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal.add(1, new CategoryPayment("02", "Auto Debit", false));
        paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal.add(2, new CategoryPayment("03", "Pembayaran Instan", true));
        CollectionsKt.removeAll((List) paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, new Function1() { // from class: getSelectedItemPosition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CategoryPayment) obj));
            }
        });
        paymentActivity.MediaBrowserCompatConnectionCallbackStubApi21.add(0, new ItemCategoryPayment("autodebit05", "BRI Direct Debit", 2131230997, false));
        paymentActivity.MediaBrowserCompatConnectionCallbackStubApi21.add(1, new ItemCategoryPayment("autodebit02", "Mandiri Direct Debit", 2131231594, false));
        paymentActivity.MediaBrowserCompatConnectionCallbackStubApi21.add(2, new ItemCategoryPayment("autodebit03", "Ovo", R.drawable.bg_logo_ovo, false));
        paymentActivity.MediaBrowserCompatConnectionCallbackStubApi21.add(3, new ItemCategoryPayment("autodebit04", "ShopeePay", 2131231515, false));
        paymentActivity.MediaBrowserCompatConnectionCallbackStubApi21.add(4, new ItemCategoryPayment("autodebit06", "Dana", 2131231295, false));
        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
        if (((int) Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1)) < 10000) {
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(0, new ItemCategoryPayment("instant04", "BRI Direct Debit", 2131230997, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(1, new ItemCategoryPayment("instant03", "Ovo", R.drawable.bg_logo_ovo, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(2, new ItemCategoryPayment("instant05", "Dana", 2131231295, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(3, new ItemCategoryPayment("instant06", "Linkaja", R.drawable.ic_linkaja, false));
            List<ItemCategoryPayment> list = paymentActivity.MediaBrowserCompatCustomActionCallback;
        } else {
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(0, new ItemCategoryPayment("instant04", "BRI Direct Debit", 2131230997, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(1, new ItemCategoryPayment("instant01", "Gopay", 2131231514, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(2, new ItemCategoryPayment("instant02", "ShopeePay", R.drawable.uikit_ic_shopeepay, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(3, new ItemCategoryPayment("instant03", "Ovo", R.drawable.bg_logo_ovo, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(4, new ItemCategoryPayment("instant05", "Dana", 2131231295, false));
            paymentActivity.MediaBrowserCompatCustomActionCallback.add(5, new ItemCategoryPayment("instant06", "Linkaja", R.drawable.ic_linkaja, false));
            List<ItemCategoryPayment> list2 = paymentActivity.MediaBrowserCompatCustomActionCallback;
        }
        final ActivityPaymentBinding activityPaymentBinding2 = (ActivityPaymentBinding) ((ViewBinding) paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        RecyclerView recyclerView = activityPaymentBinding2.rvListItemInstantPayment;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.setAdapter(new updateSubmitArea(context, paymentActivity.MediaBrowserCompatCustomActionCallback, new Function1() { // from class: LinearLayoutCompatOrientationMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, activityPaymentBinding2, (ItemCategoryPayment) obj);
            }
        }));
        RecyclerView recyclerView2 = activityPaymentBinding2.rvListItemAutoDebit;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        Context context2 = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        recyclerView2.setAdapter(new updateCloseButton(context2, paymentActivity.MediaBrowserCompatConnectionCallbackStubApi21, new Function1() { // from class: getMaxAvailableHeight
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ItemCategoryPayment) obj);
            }
        }));
        ((ListPopupWindow2) paymentActivity.onItemLoaded.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CheckRecurringStatusRequest("JMO", "BPJSTK-PTI12345", String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer)));
        activityPaymentBinding.rvListItemInstantPayment.setVisibility(8);
        activityPaymentBinding.llItemCategoryPayment.setVisibility(8);
        activityPaymentBinding.footer.setVisibility(8);
        if (!(!Intrinsics.areEqual(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor, "unregistered_member")) || Intrinsics.areEqual(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor, "cross_selling")) {
            activityPaymentBinding.rvListItemAutoDebit.setVisibility(8);
            paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal.remove(1);
            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentActivity.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
            return null;
        }
        int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 49;
        MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<CategoryPayment> p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        final ActivityPaymentBinding activityPaymentBinding = (ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        RecyclerView recyclerView = activityPaymentBinding.rvListCategoryPayment;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(new updateVoiceButton(this, p0, new Function1() { // from class: getSelectedItemId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(activityPaymentBinding, (CategoryPayment) obj);
            }
        }));
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 61;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean p0) {
        double dCeil;
        String strValueOf;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 21;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        if (i2 % 2 != 0) {
            String str = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).cancel;
            throw null;
        }
        String str2 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).cancel;
        if (str2 == null || Integer.parseInt(str2) != 1) {
            double d = this.INotificationSideChannelStubProxy + ((double) (this.setInternalConnectionCallback * 200));
            dCeil = Math.ceil(d / 0.9834d) - d;
        } else {
            int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 65;
            MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
            int i4 = i3 % 2;
            Double d2 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).write;
            Intrinsics.checkNotNull(d2);
            dCeil = d2.doubleValue();
            int i5 = MediaBrowserCompatMediaBrowserImplApi215 + 15;
            MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
            int i6 = i5 % 2;
        }
        if (this.disconnect.size() > 0) {
            int i7 = MediaBrowserCompatMediaBrowserImplApi215 + 81;
            MediaBrowserCompatMediaBrowserImplApi217 = i7 % 128;
            int i8 = i7 % 2;
            strValueOf = String.valueOf(this.disconnect.get(0).getPaymentMethodId());
        } else {
            strValueOf = "";
        }
        String str3 = strValueOf;
        String strValueOf2 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
        String strValueOf3 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).asBinder);
        String strValueOf4 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).asInterface);
        String strValueOf5 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
        String strValueOf6 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).onTransact);
        String strValueOf7 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).g);
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.MediaBrowserCompatConnectionCallback;
        String strValueOf8 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions);
        double d3 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        double d4 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1);
        double d5 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i9 = (int) this.INotificationSideChannelStubProxy;
        String strValueOf9 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor);
        String strValueOf10 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).connect);
        LinkedAccountDirectDebit linkedAccountDirectDebit = this.MediaBrowserCompat;
        LinkedAccountEwallet linkedAccountEwallet = this.IconCompatParcelizer;
        LinkedAccountEwallet linkedAccountEwallet2 = this.write;
        LinkedAccountEwallet linkedAccountEwallet3 = this.read;
        boolean z = this.g;
        boolean z2 = this.d;
        boolean z3 = this.asInterface;
        boolean z4 = this.a;
        String str7 = this.getInterfaceDescriptor;
        boolean z5 = this.asBinder;
        CustomerObject customerObject = new CustomerObject(strValueOf2, strValueOf3, strValueOf4, "", strValueOf5, "", strValueOf6, strValueOf7, str3, "", str4, str5, "", "", str7, "", "", str6, strValueOf8, Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(dCeil), i9, strValueOf9, "", "", "", strValueOf10, Boolean.valueOf(z4), linkedAccountDirectDebit, Boolean.valueOf(z5), this.getRoot, Boolean.valueOf(z3), linkedAccountEwallet, Boolean.valueOf(z2), linkedAccountEwallet2, Boolean.valueOf(z), linkedAccountEwallet3, Boolean.valueOf(this.cancel), this.connect, Boolean.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getExtras), Boolean.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String));
        if (!p0) {
            TermsConditionRecurringActivity.Companion companion = TermsConditionRecurringActivity.INSTANCE;
            TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject);
            return;
        }
        int i10 = MediaBrowserCompatMediaBrowserImplApi217 + 9;
        MediaBrowserCompatMediaBrowserImplApi215 = i10 % 128;
        int i11 = i10 % 2;
        LinkingAccountPaymentActivity.Companion companion2 = LinkingAccountPaymentActivity.INSTANCE;
        LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject);
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        double dCeil;
        int i;
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        String str = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancel;
        if (str == null || Integer.parseInt(str) != 1) {
            double d = paymentActivity.INotificationSideChannelStubProxy + ((double) (paymentActivity.setInternalConnectionCallback * 200));
            dCeil = Math.ceil(d / 0.9834d) - d;
            i = MediaBrowserCompatMediaBrowserImplApi217 + 39;
            MediaBrowserCompatMediaBrowserImplApi215 = i % 128;
        } else {
            Double d2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).write;
            Intrinsics.checkNotNull(d2);
            dCeil = d2.doubleValue();
            i = MediaBrowserCompatMediaBrowserImplApi215 + 97;
            MediaBrowserCompatMediaBrowserImplApi217 = i % 128;
        }
        int i3 = i % 2;
        String strValueOf = paymentActivity.getItem.size() > 0 ? String.valueOf(paymentActivity.getItem.get(0).getPaymentMethodId()) : "";
        int i4 = (int) paymentActivity.INotificationSideChannelStubProxy;
        String strValueOf2 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor);
        String strValueOf3 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).connect);
        LinkedAccountDirectDebit linkedAccountDirectDebit = paymentActivity.MediaBrowserCompat;
        LinkedAccountEwallet linkedAccountEwallet = paymentActivity.IconCompatParcelizer;
        LinkedAccountEwallet linkedAccountEwallet2 = paymentActivity.write;
        LinkedAccountEwallet linkedAccountEwallet3 = paymentActivity.read;
        LinkedAccountEwallet linkedAccountEwallet4 = paymentActivity.connect;
        boolean z = paymentActivity.g;
        boolean z2 = paymentActivity.d;
        boolean z3 = paymentActivity.asInterface;
        CustomerObject customerObject = new CustomerObject(String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer), String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder), String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asInterface), "", String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer), "", String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).onTransact), String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g), strValueOf, "", paymentActivity.TuitionPaymentFragmentbindingInflater1, paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1, "", "", paymentActivity.getInterfaceDescriptor, "", "", paymentActivity.MediaBrowserCompatConnectionCallback, String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions), Double.valueOf(Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1)), Double.valueOf(Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1)), Double.valueOf(Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2)), Double.valueOf(dCeil), i4, strValueOf2, "", "", "", strValueOf3, Boolean.valueOf(paymentActivity.a), linkedAccountDirectDebit, null, paymentActivity.getRoot, Boolean.valueOf(z3), linkedAccountEwallet, Boolean.valueOf(z2), linkedAccountEwallet2, Boolean.valueOf(z), linkedAccountEwallet3, Boolean.valueOf(paymentActivity.cancel), linkedAccountEwallet4, Boolean.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getExtras), Boolean.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String), Integer.MIN_VALUE, 0, null);
        if (!zBooleanValue) {
            TermsConditionRecurringActivity.Companion companion = TermsConditionRecurringActivity.INSTANCE;
            TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(paymentActivity, customerObject);
            return null;
        }
        int i5 = MediaBrowserCompatMediaBrowserImplApi215 + 61;
        MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
        if (i5 % 2 == 0) {
            LinkingAccountPaymentActivity.Companion companion2 = LinkingAccountPaymentActivity.INSTANCE;
            LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(paymentActivity, customerObject);
            return null;
        }
        LinkingAccountPaymentActivity.Companion companion3 = LinkingAccountPaymentActivity.INSTANCE;
        LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(paymentActivity, customerObject);
        throw null;
    }

    private void INotificationSideChannelStubProxy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 87;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        setDisabled.Companion companion = setDisabled.INSTANCE;
        RecurringProfile recurringProfile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(recurringProfile);
        setDisabled setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setDisabled.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recurringProfile);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 7;
            MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
            int i5 = i4 % 2;
            setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(supportFragmentManager, setdisabledTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, boolean z) {
        double dCeil;
        int i = 2 % 2;
        String strValueOf = "";
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).cancel;
        if (str2 != null) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 29;
            MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
            if (i2 % 2 == 0 ? Integer.parseInt(str2) != 1 : Integer.parseInt(str2) != 1) {
                double d = this.INotificationSideChannelStubProxy + ((double) (this.setInternalConnectionCallback * 200));
                dCeil = Math.ceil(d / 0.9834d) - d;
            } else {
                Double d2 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).write;
                Intrinsics.checkNotNull(d2);
                dCeil = d2.doubleValue();
            }
        } else {
            double d3 = this.INotificationSideChannelStubProxy + ((double) (this.setInternalConnectionCallback * 200));
            dCeil = Math.ceil(d3 / 0.9834d) - d3;
        }
        double d4 = dCeil;
        if (Intrinsics.areEqual(str, "OVO") && this.getNotifyChildrenChangedOptions.size() > 0) {
            strValueOf = String.valueOf(this.getNotifyChildrenChangedOptions.get(0).getPaymentMethodId());
        }
        if (Intrinsics.areEqual(str, "DANA") && this.getServiceComponent.size() > 0) {
            int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 51;
            MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
            int i4 = i3 % 2;
            strValueOf = String.valueOf(this.getServiceComponent.get(0).getPaymentMethodId());
        }
        if (Intrinsics.areEqual(str, "SHOPEEPAY") && this.getSessionToken.size() > 0) {
            strValueOf = String.valueOf(this.getSessionToken.get(0).getPaymentMethodId());
        }
        String str3 = strValueOf;
        if (this.TuitionPaymentFragmentbindingInflater1.length() == 0) {
            String strValueOf2 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
            String strValueOf3 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).asBinder);
            String strValueOf4 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).asInterface);
            String strValueOf5 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
            String strValueOf6 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).onTransact);
            String strValueOf7 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).g);
            String str4 = this.TuitionPaymentFragmentbindingInflater1;
            String str5 = this.MediaBrowserCompatConnectionCallback;
            String strValueOf8 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions);
            double d5 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            double d6 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1);
            double d7 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i5 = (int) this.INotificationSideChannelDefault;
            String strValueOf9 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor);
            String strValueOf10 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).connect);
            LinkedAccountDirectDebit linkedAccountDirectDebit = this.MediaBrowserCompat;
            LinkedAccountEwallet linkedAccountEwallet = this.IconCompatParcelizer;
            LinkedAccountEwallet linkedAccountEwallet2 = this.write;
            LinkedAccountEwallet linkedAccountEwallet3 = this.read;
            boolean z2 = this.g;
            boolean z3 = this.d;
            boolean z4 = this.asInterface;
            boolean z5 = this.a;
            String str6 = this.getInterfaceDescriptor;
            boolean z6 = this.cancel;
            CustomerObject customerObject = new CustomerObject(strValueOf2, strValueOf3, strValueOf4, "", strValueOf5, "", strValueOf6, strValueOf7, str3, "", str4, str, "", "", str6, "", "", str5, strValueOf8, Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d4), i5, strValueOf9, "", "", "", strValueOf10, Boolean.valueOf(z5), linkedAccountDirectDebit, Boolean.valueOf(this.asBinder), this.getRoot, Boolean.valueOf(z4), linkedAccountEwallet, Boolean.valueOf(z3), linkedAccountEwallet2, Boolean.valueOf(z2), linkedAccountEwallet3, Boolean.valueOf(z6), this.connect, Boolean.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getExtras), Boolean.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String));
            if (!z) {
                TermsConditionRecurringActivity.Companion companion = TermsConditionRecurringActivity.INSTANCE;
                TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject);
                return;
            }
            LinkingAccountPaymentActivity.Companion companion2 = LinkingAccountPaymentActivity.INSTANCE;
            LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject);
            int i6 = MediaBrowserCompatMediaBrowserImplApi215 + 55;
            MediaBrowserCompatMediaBrowserImplApi217 = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        String strValueOf11 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
        String strValueOf12 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).asBinder);
        String strValueOf13 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).asInterface);
        String str7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String strValueOf14 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).onTransact);
        String strValueOf15 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).g);
        String str8 = this.TuitionPaymentFragmentbindingInflater1;
        String str9 = this.MediaBrowserCompatConnectionCallback;
        String strValueOf16 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions);
        double d8 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        double d9 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1);
        double d10 = Double.parseDouble(((Registration) this.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i8 = (int) this.INotificationSideChannelDefault;
        String strValueOf17 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor);
        String strValueOf18 = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).connect);
        LinkedAccountDirectDebit linkedAccountDirectDebit2 = this.MediaBrowserCompat;
        LinkedAccountEwallet linkedAccountEwallet4 = this.IconCompatParcelizer;
        LinkedAccountEwallet linkedAccountEwallet5 = this.write;
        LinkedAccountEwallet linkedAccountEwallet6 = this.read;
        LinkedAccountEwallet linkedAccountEwallet7 = this.connect;
        boolean z7 = this.g;
        boolean z8 = this.d;
        boolean z9 = this.asInterface;
        CustomerObject customerObject2 = new CustomerObject(strValueOf11, strValueOf12, strValueOf13, "", str7, "", strValueOf14, strValueOf15, str3, "", str8, str, "", "", this.getInterfaceDescriptor, "", "", str9, strValueOf16, Double.valueOf(d8), Double.valueOf(d9), Double.valueOf(d10), Double.valueOf(d4), i8, strValueOf17, "", "", "", strValueOf18, Boolean.valueOf(this.a), linkedAccountDirectDebit2, null, this.getRoot, Boolean.valueOf(z9), linkedAccountEwallet4, Boolean.valueOf(z8), linkedAccountEwallet5, Boolean.valueOf(z7), linkedAccountEwallet6, Boolean.valueOf(this.cancel), linkedAccountEwallet7, Boolean.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).getExtras), Boolean.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String), Integer.MIN_VALUE, 0, null);
        if (!z) {
            TermsConditionRecurringActivity.Companion companion3 = TermsConditionRecurringActivity.INSTANCE;
            TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject2);
            return;
        }
        int i9 = MediaBrowserCompatMediaBrowserImplApi217 + 25;
        MediaBrowserCompatMediaBrowserImplApi215 = i9 % 128;
        Object obj = null;
        if (i9 % 2 == 0) {
            LinkingAccountPaymentActivity.Companion companion4 = LinkingAccountPaymentActivity.INSTANCE;
            LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject2);
            obj.hashCode();
            throw null;
        }
        LinkingAccountPaymentActivity.Companion companion5 = LinkingAccountPaymentActivity.INSTANCE;
        LinkingAccountPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, customerObject2);
        int i10 = MediaBrowserCompatMediaBrowserImplApi215 + 77;
        MediaBrowserCompatMediaBrowserImplApi217 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        PaymentActivity paymentActivity = this;
        Intrinsics.checkNotNullParameter(paymentActivity, "");
        paymentActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar, true);
        ((ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.action_payment_action));
        Registration registration = (Registration) this.MediaBrowserCompatItemCallback.getValue();
        if (registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals("0")) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 79;
            MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
            int i3 = i2 % 2;
            ActivityPaymentBinding activityPaymentBinding = (ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            AppCompatTextView appCompatTextView = activityPaymentBinding.tvJHTTuition;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            AppCompatTextView appCompatTextView2 = activityPaymentBinding.tvValueJHTTuituion;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
            View view = activityPaymentBinding.viewLineJHT;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
        }
        if (Double.parseDouble(registration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) > 10000.0d) {
            int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 117;
            MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
            if (i4 % 2 != 0) {
                Double.parseDouble(registration.TuitionPaymentFragmentbindingInflater1);
                throw null;
            }
            Double.parseDouble(registration.TuitionPaymentFragmentbindingInflater1);
        }
        ((ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).footer.setVisibility(8);
        ActivityPaymentBinding activityPaymentBinding2 = (ActivityPaymentBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityPaymentBinding2.cvInstruction.setVisibility(8);
        activityPaymentBinding2.btnInfoPaymentBankingMitra.setVisibility(8);
        activityPaymentBinding2.footer.setVisibility(0);
        activityPaymentBinding2.llItemCategoryPayment.setVisibility(0);
        activityPaymentBinding2.rvListItemInstantPayment.setVisibility(0);
        activityPaymentBinding2.rvListItemAutoDebit.setVisibility(8);
        String strValueOf = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).g);
        if (((Registration) this.MediaBrowserCompatItemCallback.getValue()).getExtras) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("user_id", strValueOf));
            Intrinsics.checkNotNullParameter("payment_detail_sertakan_deeplink", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("payment_detail_sertakan_deeplink", mapMutableMapOf);
        }
        if (((Registration) this.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String) {
            AppsFlyerManager.INSTANCE.b().TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, AppsFlyerEventEnum.PAYMENT_DETAIL_BPU.getType(), new LinkedHashMap());
            int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 113;
            MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        PaymentActivity paymentActivity = this;
        ((InputConfigurationCompat) this.onProgressUpdate.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(paymentActivity, new Observer() { // from class: setDividerDrawable
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.d(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).INotificationSideChannel.observe(paymentActivity, new Observer() { // from class: setOrientation
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this.b, (VirtualCameraAdapter1) obj}, -1093846398, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1093846406, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).cancelAll.observe(paymentActivity, new Observer() { // from class: buildDropDown
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj}, 1618312756, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1618312756, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).f164a.observe(paymentActivity, new Observer() { // from class: LinearLayoutCompatLayoutParams
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.g(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).b.observe(paymentActivity, new Observer() { // from class: ListPopupWindow
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).notify.observe(paymentActivity, new Observer() { // from class: clearListSelection
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).asInterface.observe(paymentActivity, new Observer() { // from class: removePromptView
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).TuitionPaymentFragmentbindingInflater1.observe(paymentActivity, new Observer() { // from class: isConfirmKey
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).d.observe(paymentActivity, new Observer() { // from class: createDragToOpenListener
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((ListPopupWindow2) this.onItemLoaded.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(paymentActivity, new Observer() { // from class: getAnimationStyle
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PaymentActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 101;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 35;
                MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
                int i3 = i2 % 2;
                onBackPressed();
                int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 21;
                MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
                int i5 = i4 % 2;
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 0;
        List list = (List) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (i < size) {
            if (Intrinsics.areEqual(((PaymentMethodItem) list.get(i)).getChannelCode(), str)) {
                int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 115;
                MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
                if (i3 % 2 != 0) {
                    arrayList.add(list.get(i));
                    throw null;
                }
                arrayList.add(list.get(i));
            }
            i++;
            int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 99;
            MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
            int i5 = i4 % 2;
        }
        return arrayList;
    }

    @Override // com.midtrans.sdk.corekit.callback.TransactionFinishedCallback
    public final void onTransactionFinished(TransactionResult p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 123;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).getExtras;
        boolean z2 = ((Registration) this.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String;
        String strValueOf = String.valueOf(((Registration) this.MediaBrowserCompatItemCallback.getValue()).g);
        Intrinsics.checkNotNull(p0);
        if (p0.getResponse() == null) {
            if (p0.isTransactionCanceled()) {
                Toast.makeText(this, "Transaksi dibatalkan", 1).show();
                return;
            } else {
                PaymentFailedActivity.Companion companion = PaymentFailedActivity.INSTANCE;
                PaymentFailedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, "", z, z2, strValueOf);
                return;
            }
        }
        String status = p0.getStatus();
        if (status != null) {
            int iHashCode = status.hashCode();
            if (iHashCode != -1867169789) {
                int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 75;
                MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (iHashCode != -1281977283) {
                    if (iHashCode == -682587753 && status.equals(TransactionResult.STATUS_PENDING)) {
                        PaymentFailedActivity.Companion companion2 = PaymentFailedActivity.INSTANCE;
                        PaymentFailedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, "PENDING", z, z2, strValueOf);
                    }
                } else if (status.equals(TransactionResult.STATUS_FAILED)) {
                    PaymentFailedActivity.Companion companion3 = PaymentFailedActivity.INSTANCE;
                    PaymentFailedActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, "", z, z2, strValueOf);
                    int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 29;
                    MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else if (status.equals("success")) {
                Registration registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Registration) this.MediaBrowserCompatItemCallback.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.getInterfaceDescriptor, null, setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), "yyyy-MM-dd HH:mm:ss"), null, false, false, 1979711487);
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Proses pembayaran berhasil", 0).show();
                PaymentOneTimeSuccessActivity.Companion companion4 = PaymentOneTimeSuccessActivity.INSTANCE;
                PaymentOneTimeSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(this, registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        p0.getResponse().getValidationMessages();
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrB$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 29944);
            int offsetBefore = 1755 - TextUtils.getOffsetBefore("", 0);
            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            e((byte) (bArr[27] - 1), (short) 193, bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, offsetBefore, iIndexOf, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) == -1) {
            Object[] objArr3 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1062120297, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_shopeepay_deeplink).substring(1, 3).length() - 1551204307, (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.processing_payment).substring(6, 7).length() - 52, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 98), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_indomaret).substring(0, 9).length() - 1062120254, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step5).substring(1, 7).codePointAt(3) - 1551204411, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_payment).substring(1, 7).codePointAt(2) - 153, (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
            int iIntValue = ((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr5 = {678979420};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (42049 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1727, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = ScopeAlreadyCreatedException.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), 1099544170, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char packedPositionChild = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
                    int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1755;
                    int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr2 = $$a;
                    byte b = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    e(b, (short) (b | 156), bArr2[28], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionChild, i2, iMakeMeasureSpec, 1599039318, false, (String) objArr6[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArrB$7879113);
                try {
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 1062120335, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1551204350, (short) View.MeasureSpec.getSize(0), (-51) - KeyEvent.keyCodeFromString(""), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    f((-1062120207) - Color.red(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 1551204421, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_payment_paid).substring(0, 6).codePointAt(1) - 114), (KeyEvent.getMaxKeyCode() >> 16) - 51, (byte) (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr8[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                        int minimumFlingVelocity = 1755 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iMyPid = (Process.myPid() >> 22) + 23;
                        byte[] bArr3 = $$a;
                        byte b2 = bArr3[7];
                        Object[] objArr9 = new Object[1];
                        e(b2, (short) (b2 | 104), bArr3[28], objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, minimumFlingVelocity, iMyPid, 1596667560, false, (String) objArr9[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                        int i3 = 1755 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr10 = new Object[1];
                        e((byte) (bArr4[27] - 1), (short) 193, bArr4[28], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, i3, i4, 986134021, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    int i5 = MediaBrowserCompatMediaBrowserImplApi215 + 95;
                    MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else {
            int i7 = MediaBrowserCompatMediaBrowserImplApi215 + 111;
            MediaBrowserCompatMediaBrowserImplApi217 = i7 % 128;
            int i8 = i7 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cKeyCodeFromString2 = (char) (KeyEvent.keyCodeFromString("") + 29944);
                int i9 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                byte[] bArr5 = $$a;
                byte b3 = bArr5[7];
                Object[] objArr11 = new Object[1];
                e(b3, (short) (b3 | 156), bArr5[28], objArr11);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString2, i9, iResolveOpacity, 1599039318, false, (String) objArr11[0], null);
            }
            Object[] objArr12 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
            objArrB$7879113 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[]{((int[]) objArr12[1])[0]}, (Object[]) objArr12[2], new int[1], (String[]) objArr12[4]};
            int iMyUid = Process.myUid();
            int i10 = ~iMyUid;
            int i11 = 1541093546 + (((~((-973144569) | i10)) | (-760542143)) * 519) + (((~(i10 | (-671089081))) | (~((-89453063) | iMyUid))) * (-519)) + (((~(iMyUid | (-760542143))) | 973144568) * 519) + 1099544170;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i13 ^ (i13 << 5);
        }
        int i14 = ((int[]) objArrB$7879113[1])[0];
        int i15 = ((int[]) objArrB$7879113[0])[0];
        if (i15 == i14) {
            int i16 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i17 = ~startUptimeMillis;
            int i18 = ~((-664345211) | i17);
            int i19 = ~(451742784 | startUptimeMillis);
            int i20 = i16 + (-1774707662) + ((i18 | i19) * 1150) + (((~((-451742785) | i17)) | i19) * (-575)) + (((~(startUptimeMillis | (-664345211))) | (~(i17 | 664345210))) * 575);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr13[3])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i23 = i15 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArrB$7879113[3])[0];
            Object[] objArr14 = {new int[]{((int[]) objArrB$7879113[0])[0]}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode;
            int i26 = i24 + (-763108122) + (((~(i25 | (-222510374))) | 435112799) * (-1042)) + (((-222510374) | iIdentityHashCode) * 521) + (((~(iIdentityHashCode | (-435112800))) | 279724634 | (~(i25 | (-67122209)))) * 521);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr14[3])[0] = i28 ^ (i28 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iMyPid2 = (Process.myPid() >> 22) + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 16;
            byte[] bArr6 = $$a;
            byte b4 = bArr6[7];
            Object[] objArr15 = new Object[1];
            e(b4, (short) (b4 | 52), bArr6[28], objArr15);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(tapTimeout, iMyPid2, iLastIndexOf, 1357589585, false, (String) objArr15[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr16 = new Object[1];
        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_liveliness_invalid_progress_configuration).substring(0, 134).codePointAt(61) - 1062120261, (-1551204314) - (Process.myPid() >> 22), (short) (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 160, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr16);
        Class<?> cls3 = Class.forName((String) objArr16[0]);
        Object[] objArr17 = new Object[1];
        f((-1062120208) - ((byte) KeyEvent.getModifierMetaStateMask()), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1551204346, (short) Gravity.getAbsoluteGravity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step7).substring(15, 16).codePointAt(0) - 152, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1032;
            int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte[] bArr7 = $$a;
            byte b5 = bArr7[7];
            Object[] objArr18 = new Object[1];
            e(b5, (short) (b5 | 156), bArr7[28], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, iLastIndexOf2, longPressTimeout, 1344079056, false, (String) objArr18[0], null);
        }
        if (j != ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr19 = new Object[1];
            f(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1062120260, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indomaret).substring(1, 3).length() - 1551204307, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), (-51) - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr19);
            Class<?> cls4 = Class.forName((String) objArr19[0]);
            Object[] objArr20 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_consent_screen_cta_text_continue_next_step).substring(2, 3).length() - 1062120246, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_5).substring(16, 17).codePointAt(0) - 1551204422, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_danamon_online).substring(1, 3).codePointAt(1) - 172, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_1).substring(1, 3).length() - 2), objArr20);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr20[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr21 = {678979420};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b((char) (46037 - ((byte) KeyEvent.getModifierMetaStateMask())), MotionEvent.axisFromString("") + 1135, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr22 = {Integer.valueOf(iIntValue2), 0, 286196679, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).newInstance(objArr21), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int iResolveSize = View.resolveSize(0, 0) + 1031;
                int iIndexOf2 = 15 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr8 = $$a;
                byte b6 = bArr8[7];
                Object[] objArr23 = new Object[1];
                e(b6, (short) (b6 | 52), bArr8[28], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(touchSlop, iResolveSize, iIndexOf2, 1298546779, false, (String) objArr23[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.argb(0, 0, 0, 0)), 1118 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 17 - Drawable.resolveOpacity(0, 0)), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr22);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cGreen = (char) Color.green(0);
                int iAxisFromString = 1030 - MotionEvent.axisFromString("");
                int maximumDrawingCacheSize = 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                short s = $$a[7];
                Object[] objArr24 = new Object[1];
                e((byte) 52, s, (byte) s, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cGreen, iAxisFromString, maximumDrawingCacheSize, 632103528, false, (String) objArr24[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr);
            try {
                Object[] objArr25 = new Object[1];
                f((-1062120229) - TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_blink_smile_and_your_eyes).substring(0, 25).length() - 1551204339, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.message_save_card).substring(0, 1).codePointAt(0) - 83), (-51) - Gravity.getAbsoluteGravity(0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr25);
                Class<?> cls5 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                f((-1062120207) - Color.red(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_permission_screen_description_text).substring(0, 43).length() - 1551204353, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_frame_your_face_out_of_box).substring(15, 16).codePointAt(0) - 32), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.details_message_invalid).substring(0, 6).codePointAt(1) - 165, (byte) View.combineMeasuredStates(0, 0), objArr26);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr26[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int packedPositionType2 = 1031 - ExpandableListView.getPackedPositionType(0L);
                    int i29 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr9 = $$a;
                    byte b7 = bArr9[7];
                    Object[] objArr27 = new Object[1];
                    e(b7, (short) (b7 | 156), bArr9[28], objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel, packedPositionType2, i29, 1344079056, false, (String) objArr27[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                    byte[] bArr10 = $$a;
                    byte b8 = bArr10[7];
                    Object[] objArr28 = new Object[1];
                    e(b8, (short) (b8 | 52), bArr10[28], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(trimmedLength, iRgb, pressedStateDuration, 1357589585, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iMyPid3 = 1031 - (Process.myPid() >> 22);
                int packedPositionType3 = 15 - ExpandableListView.getPackedPositionType(0L);
                short s2 = $$a[7];
                Object[] objArr29 = new Object[1];
                e((byte) 52, s2, (byte) s2, objArr29);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c, iMyPid3, packedPositionType3, 632103528, false, (String) objArr29[0], null);
            }
            Object[] objArr30 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i30 = ((int[]) objArr30[3])[0];
            int i31 = ((int[]) objArr30[1])[0];
            String[] strArr2 = (String[]) objArr30[0];
            int iMyPid4 = Process.myPid();
            int i32 = ~iMyPid4;
            int i33 = (-459355019) + (((~((-10486667) | i32)) | (~((-206528530) | iMyPid4)) | (~((-16778309) | iMyPid4))) * 765) + (((~((-217015196) | i32)) | 10486666) * 1530) + (((~(iMyPid4 | (-217015196))) | (~(i32 | (-16778309)))) * 765) + 286196679;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr[2])[0] = i35 ^ (i35 << 5);
        }
        int i36 = ((int[]) objArr[1])[0];
        int i37 = ((int[]) objArr[3])[0];
        if (i37 == i36) {
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[3])[0];
            int i40 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 908020240;
            int i41 = i38 + 1581215123 + (((-247491461) | (~length)) * (-490)) + (((~(length | 540999707)) | (-788491168)) * 490) + 1759916420;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr31[2])[0] = i43 ^ (i43 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            for (String str2 : strArr4) {
                arrayList2.add(str2);
            }
        }
        Toast.makeText((Context) null, i37 / (((i37 - 1) * i37) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i44 = ((int[]) objArr[2])[0];
        int i45 = ((int[]) objArr[3])[0];
        int i46 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i47 = ~iIdentityHashCode2;
        int i48 = i44 + (((~(i47 | (-410456688))) | (~((-654736858) | i47)) | 397385) * (-397)) + 2061560681 + ((iIdentityHashCode2 | (-1064398775)) * 397);
        int i49 = i48 ^ (i48 << 13);
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr32[2])[0] = i50 ^ (i50 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 17;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            if (i3 != ((1420565080 + (((~elapsedCpuTime) | 1387838463) * 1444)) + (((~(elapsedCpuTime | (-1712909164))) | ((~(882921620 | elapsedCpuTime)) | 1108913003)) * (-1444))) - 1291991040) {
                throw null;
            }
        } else {
            int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 686635349;
            if (i4 != 1716513020 + (((~(i5 | (-1216752828))) | (-386765285)) * (-465)) + (((-1216752828) | (~((-386765285) | i5))) * 930) + ((i5 | (-262305)) * 465)) {
                throw null;
            }
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i6 != 1892553020 + (((~(2092068358 | iIdentityHashCode)) | 17076560) * (-140)) + ((~(2109144918 | iIdentityHashCode)) * 70) + (((~(iIdentityHashCode | 486987606)) | 1639233872) * 70)) {
            int i7 = 740976316 % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i8 = MediaBrowserCompatMediaBrowserImplApi217 + 37;
        MediaBrowserCompatMediaBrowserImplApi215 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f9, code lost:
    
        if (r1 != (((-1289324141) + (((~((-966442470) | r3)) | (~(r2 | 1612613495))) * 333)) + (((~(r2 | (-966442470))) | (~(r3 | 1612613495))) * 333))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fb, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 + 97;
        com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0108, code lost:
    
        r1 = (-989028116) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0111, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0119, code lost:
    
        throw new java.lang.RuntimeException("-55597802");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0069, code lost:
    
        if (r1 == ((((-328519600) + ((r9 | r10) * 1150)) + (((~((-1649585947) | r7)) | r10) * (-575))) + (((~(r6 | (-819598404))) | (~(r7 | 819598403))) * 575))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a2, code lost:
    
        if (r1 == (((2080862000 + ((((~(1592767718 | r7)) | (-762780176)) | (~((-1592767719) | r6))) * (-564))) + ((~(r6 | (-208080903))) * 1128)) + (((~((-762780176) | r7)) | 1384686816) * 564))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a4, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.bpjstku.R.string.gopay_instruction_tablet_step2).substring(0, 5).length() + 214158395;
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 63;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.timeout_message).substring(3, 4).codePointAt(0) + 1311537214;
            if (i3 != (-1806733070) + (((~((~iCodePointAt) | 536526160)) | 1073823783) * 529) + (((~(iCodePointAt | 536526160)) | 1366513703) * 529)) {
                throw null;
            }
        } else {
            int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            if (i4 != 761043664 + (((~(i5 | 364675154)) | 1194662697) * (-668)) + ((364675154 | (~(1194662697 | i5))) * 1336) + ((i5 | 1472043899) * 668)) {
                throw null;
            }
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i8 = ~i7;
        if (i6 != (-1402013827) + (((~((-942558236) | i8)) | (~((-1636497730) | i7))) * 217) + (((~(i7 | (-942558236))) | 537544705) * 217) + (((~((-1636497730) | i8)) | 942558235) * 217)) {
            throw null;
        }
        super.onCreate(bundle);
        int i9 = MediaBrowserCompatMediaBrowserImplApi217 + 125;
        MediaBrowserCompatMediaBrowserImplApi215 = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        final PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) objArr[1]);
        try {
            User user = (User) paymentActivity.onConnected.getValue();
            String str = user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            if ((str == null || str.length() == 0) && Intrinsics.areEqual(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor, "cross_selling")) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Session berakhir..silakan login kembali", 0).show();
            } else if (Intrinsics.areEqual(paymentActivity.search, "GOPAY")) {
                getShowDividers.Companion companion = getShowDividers.INSTANCE;
                double d = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
                Intrinsics.checkNotNull(d2);
                double dDoubleValue = d2.doubleValue();
                double d3 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
                Intrinsics.checkNotNull(d4);
                getShowDividers getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getShowDividers.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new EwalletDetailPayment(d, dDoubleValue, d3 + d4.doubleValue(), "GOPAY"), new Function1() { // from class: measureVertical
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (String) obj);
                    }
                });
                FragmentManager supportFragmentManager = paymentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager, "");
                if (supportFragmentManager.findFragmentByTag(getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 115;
                    MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
                    int i3 = i2 % 2;
                    getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else if (Intrinsics.areEqual(paymentActivity.search, "SHOPEEPAY")) {
                getShowDividers.Companion companion2 = getShowDividers.INSTANCE;
                double d5 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d6 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                Intrinsics.checkNotNull(d6);
                double dDoubleValue2 = d6.doubleValue();
                double d7 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d8 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                Intrinsics.checkNotNull(d8);
                getShowDividers getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getShowDividers.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new EwalletDetailPayment(d5, dDoubleValue2, d7 + d8.doubleValue(), "SHOPEEPAY"), new Function1() { // from class: setShowDividers
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (String) obj);
                    }
                });
                FragmentManager supportFragmentManager2 = paymentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
                if (supportFragmentManager2.findFragmentByTag(getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 83;
                    MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
                    int i5 = i4 % 2;
                    getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault4.show(supportFragmentManager2, getshowdividersTuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                final ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) paymentActivity.onItemLoaded.getValue();
                CheckOneTimePaymentStatusRequest checkOneTimePaymentStatusRequest = new CheckOneTimePaymentStatusRequest(String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions));
                Intrinsics.checkNotNullParameter(checkOneTimePaymentStatusRequest, "");
                MutableLiveData<VirtualCameraAdapter1<CheckOneTimePaymentResponse>> mutableLiveData = listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(listPopupWindow2.write.TuitionPaymentFragmentbindingInflater1(checkOneTimePaymentStatusRequest)));
                final Function1 function1 = new Function1() { // from class: setEnterTransition
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ListPopupWindow2.TuitionPaymentFragmentbindingInflater1(listPopupWindow2, (CheckOneTimePaymentResponse) obj);
                    }
                };
                logToString logtostring = new logToString() { // from class: MenuPopupWindow
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function1.invoke(obj);
                    }
                };
                final Function1 function2 = new Function1() { // from class: MenuItemHoverListener
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ListPopupWindow2.g(listPopupWindow2, (Throwable) obj);
                    }
                };
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setExitTransition
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                listPopupWindow2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            ViewPortBuilder.b();
            int i6 = MediaBrowserCompatMediaBrowserImplApi217 + 69;
            MediaBrowserCompatMediaBrowserImplApi215 = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(PaymentActivity paymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        char c;
        String str;
        int i = 2 % 2;
        boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Boolean bool = Boolean.FALSE;
        String str2 = "";
        if (!z) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                paymentActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: setPopupClipToScreenEnabled
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentActivity.d();
                    }
                });
                int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 55;
                MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
                int i3 = i2 % 2;
                str = "failure_create_mandiri_dd";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                paymentActivity.IconCompatParcelizer();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                if (Intrinsics.areEqual(((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus(), "REQUIRES_ACTION")) {
                    String strValueOf = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
                    String strValueOf2 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                    String strValueOf3 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asInterface);
                    String strValueOf4 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer);
                    String referenceId = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getReferenceId();
                    String strValueOf5 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).onTransact);
                    String strValueOf6 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g);
                    String pmId = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getPmId();
                    String str3 = paymentActivity.TuitionPaymentFragmentbindingInflater1;
                    String str4 = paymentActivity.MediaBrowserCompatConnectionCallback;
                    String strValueOf7 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions);
                    double d = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    double d2 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1);
                    double d3 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i4 = (int) paymentActivity.INotificationSideChannelStubProxy;
                    String strValueOf8 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor);
                    List<ActionLinkingStatus> actionsPmLinking = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getActionsPmLinking();
                    Intrinsics.checkNotNull(actionsPmLinking);
                    String string = actionsPmLinking.get(0).getUrl().toString();
                    String failureReturnUrl = ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getFailureReturnUrl();
                    c = 0;
                    CustomerObject customerObject = new CustomerObject(strValueOf, strValueOf2, strValueOf3, "", strValueOf4, referenceId, strValueOf5, strValueOf6, pmId, "", str3, "MANDIRI", "", "", paymentActivity.getInterfaceDescriptor, "", "", str4, strValueOf7, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(0.0d), i4, strValueOf8, string, ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getDirectDebitInfo().getDirectDebitChannelProperties().getSuccessReturnUrl(), failureReturnUrl, String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).connect), bool, null, bool, null, bool, null, bool, null, bool, null, bool, null, Boolean.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getExtras), Boolean.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String));
                    TermsConditionRecurringActivity.Companion companion = TermsConditionRecurringActivity.INSTANCE;
                    TermsConditionRecurringActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(paymentActivity, customerObject);
                } else {
                    c = 0;
                    ((PaymentMethodResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatus();
                }
                str2 = "success_create_mandiri_dd";
            } else {
                str2 = "";
                c = 0;
            }
            Pair[] pairArr = new Pair[1];
            pairArr[c] = new Pair("params_tuition_payment", str2);
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(pairArr);
            Intrinsics.checkNotNullParameter(paymentActivity, str2);
            Intrinsics.checkNotNullParameter(str2, str2);
            Intrinsics.checkNotNullParameter(mapMutableMapOf, str2);
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter(str2, str2);
            Intrinsics.checkNotNullParameter(mapMutableMapOf, str2);
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, mapMutableMapOf);
            int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 1;
            MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
            int i6 = i5 % 2;
        }
        paymentActivity.MediaBrowserCompat();
        str = "loading_create_mandiri_dd";
        str2 = "";
        c = 0;
        str2 = str;
        Pair[] pairArr2 = new Pair[1];
        pairArr2[c] = new Pair("params_tuition_payment", str2);
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(pairArr2);
        Intrinsics.checkNotNullParameter(paymentActivity, str2);
        Intrinsics.checkNotNullParameter(str2, str2);
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, str2);
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str2, str2);
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, str2);
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, mapMutableMapOf2);
        int i7 = MediaBrowserCompatMediaBrowserImplApi217 + 1;
        MediaBrowserCompatMediaBrowserImplApi215 = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ void b(PaymentActivity paymentActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 83;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            PaymentNonInstantDetailActivity.Companion companion = PaymentNonInstantDetailActivity.INSTANCE;
            PaymentNonInstantDetailActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
            ViewPortBuilder.b();
            int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 59;
            MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PaymentActivity paymentActivity, ItemCategoryPayment itemCategoryPayment) throws NoSuchMethodException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(itemCategoryPayment, "");
        String str = itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Object obj = null;
        switch (str.hashCode()) {
            case -1514389665:
                if (str.equals("autodebit02")) {
                    if (paymentActivity.unsubscribe) {
                        paymentActivity.INotificationSideChannelStubProxy();
                    } else if (paymentActivity.notify) {
                        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "MANDIRI";
                        if (!paymentActivity.asBinder) {
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                        } else {
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                        }
                    }
                }
                break;
            case -1514389664:
                if (str.equals("autodebit03")) {
                    int i2 = MediaBrowserCompatMediaBrowserImplApi217;
                    int i3 = i2 + 39;
                    int i4 = i3 % 128;
                    MediaBrowserCompatMediaBrowserImplApi215 = i4;
                    int i5 = i3 % 2;
                    if (paymentActivity.unsubscribe) {
                        int i6 = i2 + 61;
                        MediaBrowserCompatMediaBrowserImplApi215 = i6 % 128;
                        if (i6 % 2 == 0) {
                            paymentActivity.INotificationSideChannelStubProxy();
                            int i7 = 40 / 0;
                        } else {
                            paymentActivity.INotificationSideChannelStubProxy();
                        }
                        int i8 = MediaBrowserCompatMediaBrowserImplApi215 + 49;
                        MediaBrowserCompatMediaBrowserImplApi217 = i8 % 128;
                        int i9 = i8 % 2;
                    } else if (paymentActivity.notify) {
                        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "OVO";
                        if (!paymentActivity.asInterface) {
                            double d = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("OVO", false);
                        } else {
                            int i10 = i4 + 7;
                            MediaBrowserCompatMediaBrowserImplApi217 = i10 % 128;
                            int i11 = i10 % 2;
                            double d2 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("OVO", true);
                        }
                    }
                }
                break;
            case -1514389663:
                if (str.equals("autodebit04")) {
                    if (paymentActivity.unsubscribe) {
                        int i12 = MediaBrowserCompatMediaBrowserImplApi217 + 45;
                        MediaBrowserCompatMediaBrowserImplApi215 = i12 % 128;
                        if (i12 % 2 == 0) {
                            paymentActivity.INotificationSideChannelStubProxy();
                            obj.hashCode();
                            throw null;
                        }
                        paymentActivity.INotificationSideChannelStubProxy();
                    } else if (paymentActivity.notify) {
                        int i13 = MediaBrowserCompatMediaBrowserImplApi217 + 105;
                        MediaBrowserCompatMediaBrowserImplApi215 = i13 % 128;
                        int i14 = i13 % 2;
                        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "SHOPEEPAY";
                        if (!paymentActivity.d) {
                            double d3 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("SHOPEEPAY", false);
                        } else {
                            double d4 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("SHOPEEPAY", true);
                        }
                    }
                }
                break;
            case -1514389662:
                if (str.equals("autodebit05")) {
                    if (paymentActivity.unsubscribe) {
                        int i15 = MediaBrowserCompatMediaBrowserImplApi215 + 117;
                        MediaBrowserCompatMediaBrowserImplApi217 = i15 % 128;
                        int i16 = i15 % 2;
                        paymentActivity.INotificationSideChannelStubProxy();
                    } else if (paymentActivity.notify) {
                        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "BRI";
                        if (!paymentActivity.a) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity, false}, -1560422959, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1560422965, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bca_klikpay).substring(0, 11).codePointAt(9) - 2144083281, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        } else {
                            int i17 = MediaBrowserCompatMediaBrowserImplApi215 + 33;
                            MediaBrowserCompatMediaBrowserImplApi217 = i17 % 128;
                            int i18 = i17 % 2;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity, true}, -1560422959, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1560422965, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bca_klikpay).substring(0, 11).codePointAt(9) - 2144083281, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        }
                    }
                }
                break;
            case -1514389661:
                if (str.equals("autodebit06")) {
                    if (paymentActivity.unsubscribe) {
                        paymentActivity.INotificationSideChannelStubProxy();
                    } else if (paymentActivity.notify) {
                        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "DANA";
                        if (!paymentActivity.g) {
                            double d5 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("DANA", false);
                        } else {
                            double d6 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("DANA", true);
                        }
                    }
                }
                break;
            case -1514389660:
                if (str.equals("autodebit07")) {
                    if (paymentActivity.unsubscribe) {
                        int i19 = MediaBrowserCompatMediaBrowserImplApi217 + 33;
                        MediaBrowserCompatMediaBrowserImplApi215 = i19 % 128;
                        if (i19 % 2 == 0) {
                            paymentActivity.INotificationSideChannelStubProxy();
                            obj.hashCode();
                            throw null;
                        }
                        paymentActivity.INotificationSideChannelStubProxy();
                    } else if (!(!paymentActivity.notify)) {
                        paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "LINKAJA";
                        if (!paymentActivity.g) {
                            double d7 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("LINKAJA", false);
                        } else {
                            double d8 = paymentActivity.INotificationSideChannelDefault;
                            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2("LINKAJA", true);
                        }
                    }
                }
                break;
        }
        Unit unit = Unit.INSTANCE;
        int i20 = MediaBrowserCompatMediaBrowserImplApi217 + 115;
        MediaBrowserCompatMediaBrowserImplApi215 = i20 % 128;
        if (i20 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentActivity paymentActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 97;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                PaymentActivity paymentActivity2 = paymentActivity;
                Intrinsics.checkNotNullParameter(paymentActivity2, "");
                Intrinsics.checkNotNullParameter("https://www.bpjsketenagakerjaan.go.id/jmo/informasi-pembayaran.html", "");
                WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
                WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentActivity2, "https://www.bpjsketenagakerjaan.go.id/jmo/informasi-pembayaran.html", "");
                ViewPortBuilder.b();
                int i4 = 14 / 0;
            } else {
                PaymentActivity paymentActivity3 = paymentActivity;
                Intrinsics.checkNotNullParameter(paymentActivity3, "");
                Intrinsics.checkNotNullParameter("https://www.bpjsketenagakerjaan.go.id/jmo/informasi-pembayaran.html", "");
                WebviewFaqCustomActivity.Companion companion2 = WebviewFaqCustomActivity.INSTANCE;
                WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(paymentActivity3, "https://www.bpjsketenagakerjaan.go.id/jmo/informasi-pembayaran.html", "");
                ViewPortBuilder.b();
            }
            int i5 = MediaBrowserCompatMediaBrowserImplApi215 + 117;
            MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ActivityPaymentBinding activityPaymentBinding, CategoryPayment categoryPayment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categoryPayment, "");
        String str = categoryPayment.b;
        if (!(!Intrinsics.areEqual(str, "Pembayaran Instan"))) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 27;
            MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
            int i3 = i2 % 2;
            activityPaymentBinding.cvInstruction.setVisibility(8);
            activityPaymentBinding.btnInfoPaymentBankingMitra.setVisibility(8);
            activityPaymentBinding.footer.setVisibility(0);
            activityPaymentBinding.llItemCategoryPayment.setVisibility(0);
            activityPaymentBinding.rvListItemInstantPayment.setVisibility(0);
            activityPaymentBinding.rvListItemAutoDebit.setVisibility(8);
        } else if (Intrinsics.areEqual(str, "Perbankan & Mitra")) {
            activityPaymentBinding.llItemCategoryPayment.setVisibility(8);
            activityPaymentBinding.footer.setVisibility(8);
            activityPaymentBinding.cvInstruction.setVisibility(0);
            activityPaymentBinding.btnInfoPaymentBankingMitra.setVisibility(0);
            int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 121;
            MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            activityPaymentBinding.btnInfoPaymentBankingMitra.setVisibility(8);
            activityPaymentBinding.footer.setVisibility(0);
            activityPaymentBinding.footer.setVisibility(8);
            activityPaymentBinding.llItemCategoryPayment.setVisibility(0);
            activityPaymentBinding.rvListItemInstantPayment.setVisibility(8);
            activityPaymentBinding.rvListItemAutoDebit.setVisibility(0);
            activityPaymentBinding.cvInstruction.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentActivity paymentActivity, ActivityPaymentBinding activityPaymentBinding, ItemCategoryPayment itemCategoryPayment) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaBrowserImplApi217 + 63;
        MediaBrowserCompatMediaBrowserImplApi215 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(itemCategoryPayment, "");
        if (i4 == 0) {
            int i5 = 74 / 0;
            if (Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant01")) {
                paymentActivity.search = "GOPAY";
                TextView textView = activityPaymentBinding.tvPaymentAmount;
                double d = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
                Intrinsics.checkNotNull(d2);
                textView.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(d + d2.doubleValue())));
                activityPaymentBinding.btnPayment.setEnabled(true);
                i = MediaBrowserCompatMediaBrowserImplApi217 + 67;
                MediaBrowserCompatMediaBrowserImplApi215 = i % 128;
                if (i % 2 == 0) {
                    int i6 = 4 / 5;
                }
            }
        } else if (Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant01")) {
            paymentActivity.search = "GOPAY";
            TextView textView2 = activityPaymentBinding.tvPaymentAmount;
            double d3 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
            Double d4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
            Intrinsics.checkNotNull(d4);
            textView2.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(d3 + d4.doubleValue())));
            activityPaymentBinding.btnPayment.setEnabled(true);
            i = MediaBrowserCompatMediaBrowserImplApi217 + 67;
            MediaBrowserCompatMediaBrowserImplApi215 = i % 128;
            if (i % 2 == 0) {
                int i7 = 4 / 5;
            }
        }
        if (Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant02")) {
            paymentActivity.search = "SHOPEEPAY";
            TextView textView3 = activityPaymentBinding.tvPaymentAmount;
            double d5 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
            Double d6 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
            Intrinsics.checkNotNull(d6);
            textView3.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(d5 + d6.doubleValue())));
            activityPaymentBinding.btnPayment.setEnabled(true);
        }
        if (Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant03")) {
            paymentActivity.search = "OVO";
            TextView textView4 = activityPaymentBinding.tvPaymentAmount;
            Double d7 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).write;
            Intrinsics.checkNotNull(d7);
            textView4.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(MathKt.roundToInt(d7.doubleValue() + Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a) + ((double) (paymentActivity.setInternalConnectionCallback * 200))))));
            activityPaymentBinding.btnPayment.setEnabled(true);
        }
        if (Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant04")) {
            int i8 = MediaBrowserCompatMediaBrowserImplApi215 + 23;
            MediaBrowserCompatMediaBrowserImplApi217 = i8 % 128;
            int i9 = i8 % 2;
            paymentActivity.search = "DD_BRI";
            TextView textView5 = activityPaymentBinding.tvPaymentAmount;
            Double d8 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).write;
            Intrinsics.checkNotNull(d8);
            textView5.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(MathKt.roundToInt(d8.doubleValue() + Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a) + ((double) (paymentActivity.setInternalConnectionCallback * 200))))));
            activityPaymentBinding.btnPayment.setEnabled(true);
            int i10 = MediaBrowserCompatMediaBrowserImplApi217 + 91;
            MediaBrowserCompatMediaBrowserImplApi215 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (!(!Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant05"))) {
            paymentActivity.search = "DANA";
            TextView textView6 = activityPaymentBinding.tvPaymentAmount;
            Double d9 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).write;
            Intrinsics.checkNotNull(d9);
            textView6.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(MathKt.roundToInt(d9.doubleValue() + Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a) + ((double) (paymentActivity.setInternalConnectionCallback * 200))))));
            activityPaymentBinding.btnPayment.setEnabled(true);
        }
        if (Intrinsics.areEqual(itemCategoryPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "instant06")) {
            paymentActivity.search = "LINKAJA";
            TextView textView7 = activityPaymentBinding.tvPaymentAmount;
            Double d10 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).write;
            Intrinsics.checkNotNull(d10);
            textView7.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(MathKt.roundToInt(d10.doubleValue() + Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a) + ((double) (paymentActivity.setInternalConnectionCallback * 200))))));
            activityPaymentBinding.btnPayment.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PaymentActivity paymentActivity, ActivityPaymentBinding activityPaymentBinding, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 105;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String str = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).d;
            Object systemService = paymentActivity.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", str));
            RelativeLayout relativeLayout = activityPaymentBinding.constraintLayoutPaymentActivity;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            RelativeLayout relativeLayout2 = relativeLayout;
            Intrinsics.checkNotNullParameter(relativeLayout2, "");
            Intrinsics.checkNotNullParameter("Kode Pembayaran/ID-Billing disimpan pada Clipboard", "");
            Snackbar.make(relativeLayout2, "Kode Pembayaran/ID-Billing disimpan pada Clipboard", 0).setTextColor(-1).setBackgroundTint(Color.parseColor("#32a106")).show();
            ViewPortBuilder.b();
            int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 31;
            MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(CategoryPayment categoryPayment) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 103;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(categoryPayment, "");
        boolean zAreEqual = Intrinsics.areEqual(categoryPayment.TuitionPaymentFragmentbindingInflater1, "03");
        int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 97;
        MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return zAreEqual;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 9;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelableExtra = paymentActivity.getIntent().getParcelableExtra("successful_unregistered_registration_data");
        Intrinsics.checkNotNull(parcelableExtra);
        Registration registration = (Registration) parcelableExtra;
        int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 85;
        MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
        int i5 = i4 % 2;
        return registration;
    }

    public static /* synthetic */ User TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 35;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) paymentActivity.onConnectionSuspended.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 65;
        MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0218  */
    /* JADX WARN: Code duplicated, block: B:14:0x022d  */
    /* JADX WARN: Code duplicated, block: B:16:0x028a  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final PaymentActivity paymentActivity, String str) throws Throwable {
        User user;
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(str, "PAY")) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 31;
            MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
                if (paymentActivity.RemoteActionCompatParcelizer()) {
                    paymentActivity.subscribe = PaymentType.SHOPEEPAY;
                    paymentActivity.handleMessage = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), "yyyy-MM-dd HH:mm:ss");
                    MidtransSDK midtransSDK = MidtransSDK.getInstance();
                    String str3 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(jCurrentTimeMillis);
                    String string = sb.toString();
                    double d = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                    Double d2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(d2);
                    TransactionRequest transactionRequest = new TransactionRequest(string, d + d2.doubleValue());
                    CustomerDetails customerDetails = new CustomerDetails();
                    String string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    customerDetails.setCustomerIdentifier(string2);
                    customerDetails.setPhone(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).onTransact);
                    customerDetails.setFirstName(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                    customerDetails.setLastName(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                    customerDetails.setEmail(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g);
                    ShippingAddress shippingAddress = new ShippingAddress();
                    shippingAddress.setAddress("Indonesia");
                    shippingAddress.setCity("Indonesia");
                    shippingAddress.setPostalCode(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancelAll);
                    customerDetails.setShippingAddress(shippingAddress);
                    BillingAddress billingAddress = new BillingAddress();
                    billingAddress.setAddress("Indonesia");
                    billingAddress.setCity("Indonesia");
                    billingAddress.setPostalCode("Indonesia");
                    customerDetails.setBillingAddress(billingAddress);
                    transactionRequest.setCustomerDetails(customerDetails);
                    ItemDetails itemDetails = new ItemDetails("Item-1", Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a), 1, "Nominal Iuran");
                    Double d3 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(d3);
                    ItemDetails itemDetails2 = new ItemDetails("Item-2", d3.doubleValue(), 1, "Biaya Layanan Mitra");
                    ArrayList<ItemDetails> arrayList = new ArrayList<>();
                    arrayList.add(itemDetails);
                    arrayList.add(itemDetails2);
                    transactionRequest.setItemDetails(arrayList);
                    String str4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer;
                    String str5 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1;
                    String str6 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    String str7 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String str8 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a;
                    Double d4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                    Intrinsics.checkNotNull(d4);
                    String str9 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancel;
                    Intrinsics.checkNotNull(str9);
                    int i4 = Integer.parseInt(str9);
                    String str10 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder;
                    StringBuilder sb2 = new StringBuilder("ANDROID#");
                    sb2.append(str4);
                    sb2.append("#");
                    sb2.append(str5);
                    sb2.append("#");
                    sb2.append(str6);
                    sb2.append("#");
                    sb2.append(str7);
                    sb2.append("#");
                    sb2.append(str8);
                    sb2.append("#");
                    sb2.append(d4);
                    sb2.append("#");
                    sb2.append(i4);
                    sb2.append("#");
                    sb2.append(str10);
                    String string3 = sb2.toString();
                    String str11 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g;
                    String str12 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).IconCompatParcelizer;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str11);
                    sb3.append("#ANDROID#");
                    sb3.append(str12);
                    String string4 = sb3.toString();
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    String str13 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor;
                    user = (User) paymentActivity.onConnected.getValue();
                    if (user != null) {
                        int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 119;
                        MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
                        int i6 = i5 % 2;
                        str2 = user.b;
                        int i7 = MediaBrowserCompatMediaBrowserImplApi215 + 63;
                        MediaBrowserCompatMediaBrowserImplApi217 = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        str2 = null;
                    }
                    String str14 = paymentActivity.MediaBrowserCompatConnectionCallback;
                    String str15 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    sb4.append("#");
                    sb4.append(str13);
                    sb4.append("#SHOPEEPAY#");
                    sb4.append(str2);
                    sb4.append("#");
                    sb4.append(str14);
                    sb4.append("#");
                    sb4.append(str15);
                    String string5 = sb4.toString();
                    paymentActivity.onConnectionFailed = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string3, paymentActivity.onResult);
                    transactionRequest.setCustomField1(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string3, paymentActivity.onResult));
                    transactionRequest.setCustomField2(string4);
                    transactionRequest.setCustomField3(string5);
                    midtransSDK.setTransactionRequest(transactionRequest);
                    MidtransSDK.getInstance().startPaymentUiFlow(paymentActivity, PaymentMethod.SHOPEEPAY);
                } else {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(paymentActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: LinearLayoutCompatInspectionCompanion
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
                        }
                    });
                }
            } else if (paymentActivity.RemoteActionCompatParcelizer()) {
                paymentActivity.subscribe = PaymentType.SHOPEEPAY;
                paymentActivity.handleMessage = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), "yyyy-MM-dd HH:mm:ss");
                MidtransSDK midtransSDK2 = MidtransSDK.getInstance();
                String str16 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).d;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str16);
                sb5.append(jCurrentTimeMillis2);
                String string6 = sb5.toString();
                double d5 = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d6 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                Intrinsics.checkNotNull(d6);
                TransactionRequest transactionRequest2 = new TransactionRequest(string6, d5 + d6.doubleValue());
                CustomerDetails customerDetails2 = new CustomerDetails();
                String string7 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string7, "");
                customerDetails2.setCustomerIdentifier(string7);
                customerDetails2.setPhone(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).onTransact);
                customerDetails2.setFirstName(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                customerDetails2.setLastName(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                customerDetails2.setEmail(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g);
                ShippingAddress shippingAddress2 = new ShippingAddress();
                shippingAddress2.setAddress("Indonesia");
                shippingAddress2.setCity("Indonesia");
                shippingAddress2.setPostalCode(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancelAll);
                customerDetails2.setShippingAddress(shippingAddress2);
                BillingAddress billingAddress2 = new BillingAddress();
                billingAddress2.setAddress("Indonesia");
                billingAddress2.setCity("Indonesia");
                billingAddress2.setPostalCode("Indonesia");
                customerDetails2.setBillingAddress(billingAddress2);
                transactionRequest2.setCustomerDetails(customerDetails2);
                ItemDetails itemDetails3 = new ItemDetails("Item-1", Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a), 1, "Nominal Iuran");
                Double d7 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                Intrinsics.checkNotNull(d7);
                ItemDetails itemDetails4 = new ItemDetails("Item-2", d7.doubleValue(), 1, "Biaya Layanan Mitra");
                ArrayList<ItemDetails> arrayList2 = new ArrayList<>();
                arrayList2.add(itemDetails3);
                arrayList2.add(itemDetails4);
                transactionRequest2.setItemDetails(arrayList2);
                String str17 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer;
                String str18 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1;
                String str19 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String str20 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str21 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a;
                Double d8 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStubProxy;
                Intrinsics.checkNotNull(d8);
                String str22 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancel;
                Intrinsics.checkNotNull(str22);
                int i9 = Integer.parseInt(str22);
                String str110 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder;
                StringBuilder sb6 = new StringBuilder("ANDROID#");
                sb6.append(str17);
                sb6.append("#");
                sb6.append(str18);
                sb6.append("#");
                sb6.append(str19);
                sb6.append("#");
                sb6.append(str20);
                sb6.append("#");
                sb6.append(str21);
                sb6.append("#");
                sb6.append(d8);
                sb6.append("#");
                sb6.append(i9);
                sb6.append("#");
                sb6.append(str110);
                String string8 = sb6.toString();
                String str111 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g;
                String str112 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).IconCompatParcelizer;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str111);
                sb7.append("#ANDROID#");
                sb7.append(str112);
                String string9 = sb7.toString();
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                String str113 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor;
                user = (User) paymentActivity.onConnected.getValue();
                if (user != null) {
                    int i10 = MediaBrowserCompatMediaBrowserImplApi217 + 119;
                    MediaBrowserCompatMediaBrowserImplApi215 = i10 % 128;
                    int i11 = i10 % 2;
                    str2 = user.b;
                    int i12 = MediaBrowserCompatMediaBrowserImplApi215 + 63;
                    MediaBrowserCompatMediaBrowserImplApi217 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    str2 = null;
                }
                String str114 = paymentActivity.MediaBrowserCompatConnectionCallback;
                String str115 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb8.append("#");
                sb8.append(str113);
                sb8.append("#SHOPEEPAY#");
                sb8.append(str2);
                sb8.append("#");
                sb8.append(str114);
                sb8.append("#");
                sb8.append(str115);
                String string10 = sb8.toString();
                paymentActivity.onConnectionFailed = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string8, paymentActivity.onResult);
                transactionRequest2.setCustomField1(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string8, paymentActivity.onResult));
                transactionRequest2.setCustomField2(string9);
                transactionRequest2.setCustomField3(string10);
                midtransSDK2.setTransactionRequest(transactionRequest2);
                MidtransSDK.getInstance().startPaymentUiFlow(paymentActivity, PaymentMethod.SHOPEEPAY);
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(paymentActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: LinearLayoutCompatInspectionCompanion
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 99;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaBrowserImplApi217 + 5;
        MediaBrowserCompatMediaBrowserImplApi215 = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final PaymentActivity paymentActivity, String str) throws Throwable {
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!Intrinsics.areEqual(str, "PAY"))) {
            if (paymentActivity.RemoteActionCompatParcelizer()) {
                paymentActivity.subscribe = PaymentType.GOPAY;
                paymentActivity.handleMessage = setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), "yyyy-MM-dd HH:mm:ss");
                MidtransSDK midtransSDK = MidtransSDK.getInstance();
                String str3 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(jCurrentTimeMillis);
                String string = sb.toString();
                double d = Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a);
                Double d2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
                Intrinsics.checkNotNull(d2);
                TransactionRequest transactionRequest = new TransactionRequest(string, d + d2.doubleValue());
                CustomerDetails customerDetails = new CustomerDetails();
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                customerDetails.setCustomerIdentifier(string2);
                customerDetails.setPhone(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).onTransact);
                customerDetails.setFirstName(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                customerDetails.setLastName(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder);
                customerDetails.setEmail(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g);
                ShippingAddress shippingAddress = new ShippingAddress();
                shippingAddress.setAddress("Indonesia");
                shippingAddress.setCity("Indonesia");
                shippingAddress.setPostalCode(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancelAll);
                customerDetails.setShippingAddress(shippingAddress);
                BillingAddress billingAddress = new BillingAddress();
                billingAddress.setAddress("Indonesia");
                billingAddress.setCity("Indonesia");
                billingAddress.setPostalCode("Indonesia");
                customerDetails.setBillingAddress(billingAddress);
                transactionRequest.setCustomerDetails(customerDetails);
                ItemDetails itemDetails = new ItemDetails("Item-1", Double.parseDouble(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a), 1, "Nominal Iuran");
                Double d3 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
                Intrinsics.checkNotNull(d3);
                ItemDetails itemDetails2 = new ItemDetails("Item-2", d3.doubleValue(), 1, "Biaya Layanan Mitra");
                ArrayList<ItemDetails> arrayList = new ArrayList<>();
                arrayList.add(itemDetails);
                arrayList.add(itemDetails2);
                transactionRequest.setItemDetails(arrayList);
                String str4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).RemoteActionCompatParcelizer;
                String str5 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentbindingInflater1;
                String str6 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                String str7 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str8 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).a;
                Double d4 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).INotificationSideChannelStub;
                Intrinsics.checkNotNull(d4);
                String str9 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).cancel;
                Intrinsics.checkNotNull(str9);
                int i2 = Integer.parseInt(str9);
                String str10 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).asBinder;
                StringBuilder sb2 = new StringBuilder("ANDROID#");
                sb2.append(str4);
                sb2.append("#");
                sb2.append(str5);
                sb2.append("#");
                sb2.append(str6);
                sb2.append("#");
                sb2.append(str7);
                sb2.append("#");
                sb2.append(str8);
                sb2.append("#");
                sb2.append(d4);
                sb2.append("#");
                sb2.append(i2);
                sb2.append("#");
                sb2.append(str10);
                String string3 = sb2.toString();
                String str11 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g;
                String str12 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).IconCompatParcelizer;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str11);
                sb3.append("#ANDROID#");
                sb3.append(str12);
                String string4 = sb3.toString();
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                String str13 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getInterfaceDescriptor;
                User user = (User) paymentActivity.onConnected.getValue();
                if (user != null) {
                    int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 87;
                    MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
                    int i4 = i3 % 2;
                    str2 = user.b;
                } else {
                    int i5 = MediaBrowserCompatMediaBrowserImplApi217 + 85;
                    MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
                    int i6 = i5 % 2;
                    str2 = null;
                }
                String str14 = paymentActivity.MediaBrowserCompatConnectionCallback;
                String str15 = ((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).getNotifyChildrenChangedOptions;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                sb4.append("#");
                sb4.append(str13);
                sb4.append("#GOPAY#");
                sb4.append(str2);
                sb4.append("#");
                sb4.append(str14);
                sb4.append("#");
                sb4.append(str15);
                String string5 = sb4.toString();
                paymentActivity.onConnectionFailed = Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string3, paymentActivity.onResult);
                transactionRequest.setCustomField1(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, string3, paymentActivity.onResult));
                transactionRequest.setCustomField2(string4);
                transactionRequest.setCustomField3(string5);
                midtransSDK.setTransactionRequest(transactionRequest);
                MidtransSDK.getInstance().startPaymentUiFlow(paymentActivity, PaymentMethod.GO_PAY);
            } else {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(paymentActivity, "Oops Terjadi Kesalahan", "Coba Lagi", new Function0() { // from class: LinearLayoutCompatInspectionCompanion2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 57;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        if (i2 % 2 == 0) {
            Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 121;
        MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PaymentActivity paymentActivity) {
        Unit unit;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 97;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        if (i2 % 2 != 0) {
            Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
            unit = Unit.INSTANCE;
            int i3 = 96 / 0;
        } else {
            Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue());
            unit = Unit.INSTANCE;
        }
        int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 123;
        MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0b6a A[Catch: all -> 0x0b7c, DONT_GENERATE, TRY_ENTER, TryCatch #17 {, blocks: (B:171:0x0b6a, B:173:0x0b6c, B:174:0x0b71, B:176:0x0b73, B:178:0x0b7a, B:179:0x0b7b, B:169:0x0b33), top: B:214:0x0b33, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0b6c A[Catch: all -> 0x0b7c, TryCatch #17 {, blocks: (B:171:0x0b6a, B:173:0x0b6c, B:174:0x0b71, B:176:0x0b73, B:178:0x0b7a, B:179:0x0b7b, B:169:0x0b33), top: B:214:0x0b33, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0b33 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0735 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x076c A[Catch: all -> 0x077e, DONT_GENERATE, TRY_ENTER, TryCatch #20 {, blocks: (B:86:0x076c, B:88:0x076e, B:89:0x0773, B:91:0x0775, B:93:0x077c, B:94:0x077d, B:84:0x0735), top: B:218:0x0735, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x076e A[Catch: all -> 0x077e, TryCatch #20 {, blocks: (B:86:0x076c, B:88:0x076e, B:89:0x0773, B:91:0x0775, B:93:0x077c, B:94:0x077d, B:84:0x0735), top: B:218:0x0735, inners: #11 }] */
    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) throws Throwable {
        Object objNewInstance;
        Object objInvoke;
        Object objInvoke2;
        ClassLoader classLoader;
        String str2;
        Object objInvoke3;
        ClassLoader classLoader2;
        String str3;
        Object[] objArr = new Object[1];
        h(new int[]{-62768265, -998521032, -490852945, -231673047, 1519789301, -905886977, 1152900849, -1116497205}, 10 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        String str4 = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        i((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 89), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{18, '\f', '#', 7, 30, '\r', 7, 30, 7, '#', 15, 30, 5, 25, 28, 31, 23, 16, 23, '\b', Typography.quote, 5}, objArr2);
        try {
            Object objNewInstance2 = File.class.getDeclaredConstructor(String.class).newInstance((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            i((byte) (98 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf("", "", 0) + 8, new char[]{Typography.quote, ' ', 17, 19, '\f', 27, '\t', 29}, objArr3);
            if (!((Boolean) File.class.getMethod((String) objArr3[0], null).invoke(objNewInstance2, null)).booleanValue()) {
                Object[] objArr4 = new Object[1];
                i((byte) (KeyEvent.normalizeMetaState(0) + 89), 14 - (Process.myTid() >> 22), new char[]{'\r', '#', 31, ' ', 26, 25, 7, 31, 17, '#', 18, '\n', 27, '\f'}, objArr4);
                String str5 = (String) objArr4[0];
                objNewInstance2 = File.class.getDeclaredConstructor(String.class).newInstance(System.getProperty(str5, str5));
                Object[] objArr5 = new Object[1];
                i((byte) (TextUtils.indexOf("", "", 0) + 98), Color.rgb(0, 0, 0) + 16777224, new char[]{Typography.quote, ' ', 17, 19, '\f', 27, '\t', 29}, objArr5);
                if (!((Boolean) File.class.getMethod((String) objArr5[0], null).invoke(objNewInstance2, null)).booleanValue()) {
                    objNewInstance2 = Environment.getExternalStorageDirectory();
                }
            }
            ClassLoader classLoader3 = PaymentActivity.class.getClassLoader();
            byte b = (byte) 0;
            byte b2 = (byte) (b + 1);
            Object[] objArr6 = new Object[1];
            c(b, b2, (byte) (b2 - 1), objArr6);
            try {
                Object[] objArr7 = {(String) objArr6[0]};
                byte b3 = (byte) (getStateLabel & 7);
                byte b4 = (byte) (b3 - 1);
                Object[] objArr8 = new Object[1];
                c(b3, b4, (byte) (b4 + 1), objArr8);
                Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr8[0], String.class);
                declaredMethod.setAccessible(true);
                String str6 = (String) declaredMethod.invoke(classLoader3, objArr7);
                if (str6 == null) {
                    Object[] objArr9 = new Object[1];
                    h(new int[]{-1594836337, 1902719937, 142473951, -1658771854, 375981631, -1706601186, -1877991096, -1456052783}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr9);
                    Runtime.class.getMethod((String) objArr9[0], String.class).invoke(Runtime.class.getMethod(str4, null).invoke(null, null), str);
                    return;
                }
                Object[] objArr10 = new Object[1];
                h(new int[]{-1849146046, 1425748613, -966025607, 1676384019, -1333171811, 1172295215, 77996261, 1601087188}, 11 - ((Process.getThreadPriority(0) + 20) >> 6), objArr10);
                Object[] objArr11 = {Integer.valueOf(((Integer) String.class.getMethod((String) objArr10[0], Integer.TYPE).invoke(str6, 47)).intValue() + 1)};
                Object[] objArr12 = new Object[1];
                i((byte) (51 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, new char[]{22, 2, ' ', 22, '\t', 17, 25, '\f', 13872}, objArr12);
                File file = (File) File.class.getDeclaredConstructor(File.class, String.class).newInstance(objNewInstance2, String.class.getMethod((String) objArr12[0], Integer.TYPE).invoke(str6, objArr11));
                Object[] objArr13 = new Object[1];
                h(new int[]{689008274, 264867569, -903953586, -1933580489, -989003246, 740097092}, (ViewConfiguration.getEdgeSlop() >> 16) + 8, objArr13);
                if (((Boolean) String.class.getMethod((String) objArr13[0], CharSequence.class).invoke(str6, "!")).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr14 = new Object[1];
                    h(new int[]{1734304679, 1216517183, -1284397929, -1133791833, -300601125, 526474888, 1757757084, 1668067104}, TextUtils.getTrimmedLength("") + 9, objArr14);
                    sb.append((String) objArr14[0]);
                    sb.append(str6);
                    Object objNewInstance3 = URL.class.getDeclaredConstructor(String.class).newInstance(sb.toString());
                    Object[] objArr15 = new Object[1];
                    h(new int[]{-2062165802, 1155613436, -440171720, 1302322899, -1899050906, -1136475063}, 7 - Drawable.resolveOpacity(0, 0), objArr15);
                    Object objInvoke4 = URL.class.getMethod((String) objArr15[0], null).invoke(objNewInstance3, null);
                    Object[] objArr16 = new Object[1];
                    h(new int[]{-1849146046, 1425748613, -966025607, 1676384019, -1333171811, 1172295215, 77996261, 1601087188}, 11 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr16);
                    Object[] objArr17 = {5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr16[0], String.class).invoke(objInvoke4, "!/")).intValue())};
                    Object[] objArr18 = new Object[1];
                    i((byte) (51 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "", 0) + 9, new char[]{22, 2, ' ', 22, '\t', 17, 25, '\f', 13872}, objArr18);
                    Object objNewInstance4 = ZipFile.class.getDeclaredConstructor(String.class).newInstance(String.class.getMethod((String) objArr18[0], Integer.TYPE, Integer.TYPE).invoke(objInvoke4, objArr17));
                    Object[] objArr19 = new Object[1];
                    h(new int[]{-1849146046, 1425748613, -966025607, 1676384019, -1333171811, 1172295215, 77996261, 1601087188}, View.resolveSizeAndState(0, 0, 0) + 11, objArr19);
                    Object[] objArr20 = {Integer.valueOf(((Integer) String.class.getMethod((String) objArr19[0], String.class).invoke(str6, "!/")).intValue())};
                    Object[] objArr21 = new Object[1];
                    i((byte) (51 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 9, new char[]{22, 2, ' ', 22, '\t', 17, 25, '\f', 13872}, objArr21);
                    Object[] objArr22 = new Object[1];
                    i((byte) (51 - KeyEvent.keyCodeFromString("")), TextUtils.getTrimmedLength("") + 9, new char[]{22, 2, ' ', 22, '\t', 17, 25, '\f', 13872}, objArr22);
                    Object[] objArr23 = {String.class.getMethod((String) objArr22[0], Integer.TYPE).invoke(String.class.getMethod((String) objArr21[0], Integer.TYPE).invoke(str6, objArr20), 2)};
                    Object[] objArr24 = new Object[1];
                    h(new int[]{-226936233, 352752534, 1566590703, 90954180, -1452517468, 1450360406}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, objArr24);
                    Object[] objArr25 = {ZipFile.class.getMethod((String) objArr24[0], String.class).invoke(objNewInstance4, objArr23)};
                    Object[] objArr26 = new Object[1];
                    i((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 76), TextUtils.getOffsetBefore("", 0) + 14, new char[]{27, '!', '\n', 29, 16, 19, 5, '\n', 17, '\b', 21, '!', '#', 25}, objArr26);
                    objNewInstance = ZipFile.class.getMethod((String) objArr26[0], ZipEntry.class).invoke(objNewInstance4, objArr25);
                } else {
                    objNewInstance = FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str6);
                }
                InputStream inputStream = (InputStream) BufferedInputStream.class.getDeclaredConstructor(InputStream.class).newInstance(objNewInstance);
                inputStream.skip(264L);
                inputStream.skip(5L);
                InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStream, (-1185392521) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 8 - Color.argb(0, 0, 0, 0), 2 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new byte[]{23, -4, -15, 27, -100, 56, 37, 89});
                try {
                    if (inputStream == inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
                        try {
                            try {
                                Object objInvoke5 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                ClassLoader classLoader4 = PaymentActivity.class.getClassLoader();
                                Object[] objArr27 = {1257092341};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.alpha(0) + 3414), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1559, 24 - (ViewConfiguration.getLongPressTimeout() >> 16), -86093833, false, null, new Class[]{Integer.TYPE});
                                }
                                Object[] objArr28 = {str6, classLoader4, true, -1761593024, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr27), -1761593024};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cArgb = (char) (43042 - Color.argb(0, 0, 0, 0));
                                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3111;
                                    int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                                    byte[] bArr = $$a;
                                    byte b5 = bArr[7];
                                    Object[] objArr29 = new Object[1];
                                    e(b5, (short) (b5 | 156), bArr[28], objArr29);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, offsetAfter, modifierMetaStateMask, -675216362, false, (String) objArr29[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getSize(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 518, 76 - (KeyEvent.getMaxKeyCode() >> 16)), Integer.TYPE});
                                }
                                Object[] objArr30 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr28);
                                int i = ((int[]) objArr30[1])[0];
                                int i2 = ((int[]) objArr30[2])[0];
                                if (i2 == i) {
                                    int i3 = ((int[]) objArr30[0])[0];
                                    int i4 = ((int[]) objArr30[2])[0];
                                    int i5 = ((int[]) objArr30[1])[0];
                                    String[] strArr = (String[]) objArr30[3];
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i6 = ~elapsedCpuTime;
                                    int i7 = i3 + 461227378 + (((~(elapsedCpuTime | 1331170051)) | (~((-1331170052) | i6)) | (-373861408)) * (-564)) + ((~((-268477469) | elapsedCpuTime)) * 1128) + (((~((-373861408) | i6)) | (-1599647520)) * 564);
                                    int i8 = (i7 << 13) ^ i7;
                                    int i9 = i8 ^ (i8 >>> 17);
                                    ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                                    Object[] objArr31 = {new int[1], new int[]{i5}, new int[]{i4}, strArr};
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr2 = (String[]) objArr30[3];
                                    if (strArr2 != null) {
                                        for (String str7 : strArr2) {
                                            arrayList.add(str7);
                                        }
                                    }
                                    Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
                                    int i10 = ((int[]) objArr30[0])[0];
                                    int i11 = ((int[]) objArr30[2])[0];
                                    int i12 = ((int[]) objArr30[1])[0];
                                    String[] strArr3 = (String[]) objArr30[3];
                                    int[] iArr = {i12};
                                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                    int i13 = i10 + (((~((-1208091291) | iElapsedRealtime)) | 287065152) * 449) + 351452808 + (((~((~iElapsedRealtime) | (-1208091291))) | 287065152) * 449);
                                    int i14 = (i13 << 13) ^ i13;
                                    int i15 = i14 ^ (i14 >>> 17);
                                    ((int[]) objArr[0])[0] = i15 ^ (i15 << 5);
                                    Object[] objArr32 = {new int[1], iArr, new int[]{i11}, strArr3};
                                }
                                try {
                                    try {
                                        Object[] objArr33 = new Object[1];
                                        h(new int[]{1051498449, 537904695, -2070211020, 1993025885}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr33);
                                        Method declaredMethod2 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                        declaredMethod2.setAccessible(true);
                                        declaredMethod2.invoke(objInvoke5, str6, classLoader4);
                                        return;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (NoSuchMethodException unused) {
                                    objInvoke3 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                    classLoader2 = PaymentActivity.class.getClassLoader();
                                    synchronized (objInvoke3) {
                                        try {
                                            Object[] objArr34 = {str6, classLoader2};
                                            Object[] objArr35 = new Object[1];
                                            h(new int[]{1701522742, 587888421, 74178065, 133728910, -336597429, -395293945, -288419621, 597018344}, Drawable.resolveOpacity(0, 0) + 10, objArr35);
                                            Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr35[0], String.class, ClassLoader.class);
                                            declaredMethod3.setAccessible(true);
                                            str3 = (String) declaredMethod3.invoke(objInvoke3, objArr34);
                                            if (str3 == null) {
                                                throw new UnsatisfiedLinkError(str3);
                                            }
                                        } catch (Throwable th2) {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    }
                                    return;
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } catch (Exception unused2) {
                            if (Build.VERSION.SDK_INT <= 27) {
                                try {
                                    Object objInvoke6 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                    try {
                                        Object[] objArr36 = {str6, PaymentActivity.class.getClassLoader()};
                                        Object[] objArr37 = new Object[1];
                                        h(new int[]{1559900463, 1294945061, -1746580036, 101854919, 924147447, 995642376}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, objArr37);
                                        Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr37[0], String.class, ClassLoader.class);
                                        declaredMethod4.setAccessible(true);
                                        declaredMethod4.invoke(objInvoke6, objArr36);
                                        return;
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
                            objInvoke3 = Runtime.class.getMethod(str4, null).invoke(null, null);
                            classLoader2 = PaymentActivity.class.getClassLoader();
                            synchronized (objInvoke3) {
                                Object[] objArr38 = {str6, classLoader2};
                                Object[] objArr39 = new Object[1];
                                h(new int[]{1701522742, 587888421, 74178065, 133728910, -336597429, -395293945, -288419621, 597018344}, Drawable.resolveOpacity(0, 0) + 10, objArr39);
                                Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr39[0], String.class, ClassLoader.class);
                                declaredMethod5.setAccessible(true);
                                str3 = (String) declaredMethod5.invoke(objInvoke3, objArr38);
                                if (str3 == null) {
                                    throw new UnsatisfiedLinkError(str3);
                                }
                                return;
                            }
                        }
                    }
                    Object[] objArr40 = {inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2, file};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(531194526);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41226), TextUtils.lastIndexOf("", '0', 0, 0) + 1, 28 - (ViewConfiguration.getEdgeSlop() >> 16), -80231095, false, "b", new Class[]{InputStream.class, File.class});
                    }
                    Object objInvoke7 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr40);
                    try {
                        try {
                            Object objInvoke8 = Runtime.class.getMethod(str4, null).invoke(null, null);
                            try {
                                try {
                                    Object[] objArr41 = new Object[1];
                                    i((byte) (Gravity.getAbsoluteGravity(0, 0) + 32), (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, new char[]{27, '!', '\n', 17, ' ', 22, 2, 25, 5, '\n', 29, 3, '#', 7, 13842}, objArr41);
                                    String str8 = (String) File.class.getMethod((String) objArr41[0], null).invoke(objInvoke7, null);
                                    ClassLoader classLoader5 = PaymentActivity.class.getClassLoader();
                                    Object[] objArr42 = {1257092341};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 3414), 1559 - ExpandableListView.getPackedPositionGroup(0L), 24 - View.resolveSizeAndState(0, 0, 0), -86093833, false, null, new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr43 = {str8, classLoader5, true, 79468211, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr42), 79468211};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
                                        int defaultSize = 3111 - View.getDefaultSize(0, 0);
                                        int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                                        byte[] bArr2 = $$a;
                                        byte b6 = bArr2[7];
                                        Object[] objArr44 = new Object[1];
                                        e(b6, (short) (b6 | 156), bArr2[28], objArr44);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, defaultSize, iCombineMeasuredStates, -675216362, false, (String) objArr44[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 518, 76 - TextUtils.indexOf("", "", 0)), Integer.TYPE});
                                    }
                                    Object[] objArr45 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr43);
                                    int i16 = ((int[]) objArr45[1])[0];
                                    int i17 = ((int[]) objArr45[2])[0];
                                    if (i17 == i16) {
                                        int i18 = ((int[]) objArr45[0])[0];
                                        int i19 = ((int[]) objArr45[2])[0];
                                        int i20 = ((int[]) objArr45[1])[0];
                                        String[] strArr4 = (String[]) objArr45[3];
                                        int[] iArr2 = {i20};
                                        int iMyTid = Process.myTid();
                                        int i21 = i18 + (((~((-929190372) | iMyTid)) | 289411264) * (-283)) + 2004040546 + ((~(iMyTid | (-639779108))) * 283);
                                        int i22 = (i21 << 13) ^ i21;
                                        int i23 = i22 ^ (i22 >>> 17);
                                        ((int[]) objArr[0])[0] = i23 ^ (i23 << 5);
                                        Object[] objArr46 = {new int[1], iArr2, new int[]{i19}, strArr4};
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        String[] strArr5 = (String[]) objArr45[3];
                                        if (strArr5 != null) {
                                            for (String str9 : strArr5) {
                                                arrayList2.add(str9);
                                            }
                                        }
                                        Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                                        int i24 = ((int[]) objArr45[0])[0];
                                        int i25 = ((int[]) objArr45[2])[0];
                                        int i26 = ((int[]) objArr45[1])[0];
                                        String[] strArr6 = (String[]) objArr45[3];
                                        int[] iArr3 = {i26};
                                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                        int i27 = i24 + 86770924 + (((~((-1480422736) | iMaxMemory)) | 224608723) * (-366)) + (((~(iMaxMemory | (-1344025613))) | 88211600) * 366);
                                        int i28 = (i27 << 13) ^ i27;
                                        int i29 = i28 ^ (i28 >>> 17);
                                        ((int[]) objArr[0])[0] = i29 ^ (i29 << 5);
                                        Object[] objArr47 = {new int[1], iArr3, new int[]{i25}, strArr6};
                                    }
                                    try {
                                        Object[] objArr48 = {str8, classLoader5};
                                        Object[] objArr49 = new Object[1];
                                        h(new int[]{1051498449, 537904695, -2070211020, 1993025885}, 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr49);
                                        Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr49[0], String.class, ClassLoader.class);
                                        declaredMethod6.setAccessible(true);
                                        declaredMethod6.invoke(objInvoke8, objArr48);
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 == null) {
                                            throw th6;
                                        }
                                        throw cause6;
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 == null) {
                                        throw th7;
                                    }
                                    throw cause7;
                                }
                            } catch (NoSuchMethodException unused3) {
                                objInvoke = Runtime.class.getMethod(str4, null).invoke(null, null);
                                Object[] objArr50 = new Object[1];
                                i((byte) (32 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Process.getGidForName("") + 16, new char[]{27, '!', '\n', 17, ' ', 22, 2, 25, 5, '\n', 29, 3, '#', 7, 13842}, objArr50);
                                objInvoke2 = File.class.getMethod((String) objArr50[0], null).invoke(objInvoke7, null);
                                classLoader = PaymentActivity.class.getClassLoader();
                                synchronized (objInvoke) {
                                    try {
                                        Object[] objArr51 = new Object[1];
                                        h(new int[]{1701522742, 587888421, 74178065, 133728910, -336597429, -395293945, -288419621, 597018344}, 10 - Color.argb(0, 0, 0, 0), objArr51);
                                        Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr51[0], String.class, ClassLoader.class);
                                        declaredMethod7.setAccessible(true);
                                        str2 = (String) declaredMethod7.invoke(objInvoke, objInvoke2, classLoader);
                                        if (str2 == null) {
                                            throw new UnsatisfiedLinkError(str2);
                                        }
                                    } catch (Throwable th8) {
                                        Throwable cause8 = th8.getCause();
                                        if (cause8 == null) {
                                            throw th8;
                                        }
                                        throw cause8;
                                    }
                                }
                            }
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 == null) {
                                throw th9;
                            }
                            throw cause9;
                        }
                    } catch (Exception unused4) {
                        if (Build.VERSION.SDK_INT <= 27) {
                            try {
                                Object objInvoke9 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                try {
                                    Object[] objArr52 = new Object[1];
                                    i((byte) (TextUtils.getOffsetAfter("", 0) + 32), (Process.myPid() >> 22) + 15, new char[]{27, '!', '\n', 17, ' ', 22, 2, 25, 5, '\n', 29, 3, '#', 7, 13842}, objArr52);
                                    try {
                                        Object[] objArr53 = {File.class.getMethod((String) objArr52[0], null).invoke(objInvoke7, null), PaymentActivity.class.getClassLoader()};
                                        Object[] objArr54 = new Object[1];
                                        h(new int[]{1559900463, 1294945061, -1746580036, 101854919, 924147447, 995642376}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, objArr54);
                                        Method declaredMethod8 = Runtime.class.getDeclaredMethod((String) objArr54[0], String.class, ClassLoader.class);
                                        declaredMethod8.setAccessible(true);
                                        declaredMethod8.invoke(objInvoke9, objArr53);
                                        return;
                                    } catch (Throwable th10) {
                                        Throwable cause10 = th10.getCause();
                                        if (cause10 == null) {
                                            throw th10;
                                        }
                                        throw cause10;
                                    }
                                } catch (Throwable th11) {
                                    Throwable cause11 = th11.getCause();
                                    if (cause11 == null) {
                                        throw th11;
                                    }
                                    throw cause11;
                                }
                            } catch (Throwable th12) {
                                Throwable cause12 = th12.getCause();
                                if (cause12 == null) {
                                    throw th12;
                                }
                                throw cause12;
                            }
                        }
                        objInvoke = Runtime.class.getMethod(str4, null).invoke(null, null);
                        Object[] objArr55 = new Object[1];
                        i((byte) (32 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Process.getGidForName("") + 16, new char[]{27, '!', '\n', 17, ' ', 22, 2, 25, 5, '\n', 29, 3, '#', 7, 13842}, objArr55);
                        objInvoke2 = File.class.getMethod((String) objArr55[0], null).invoke(objInvoke7, null);
                        classLoader = PaymentActivity.class.getClassLoader();
                        synchronized (objInvoke) {
                            Object[] objArr56 = new Object[1];
                            h(new int[]{1701522742, 587888421, 74178065, 133728910, -336597429, -395293945, -288419621, 597018344}, 10 - Color.argb(0, 0, 0, 0), objArr56);
                            Method declaredMethod9 = Runtime.class.getDeclaredMethod((String) objArr56[0], String.class, ClassLoader.class);
                            declaredMethod9.setAccessible(true);
                            str2 = (String) declaredMethod9.invoke(objInvoke, objInvoke2, classLoader);
                            if (str2 == null) {
                                throw new UnsatisfiedLinkError(str2);
                            }
                        }
                    }
                } catch (Throwable th13) {
                    Throwable cause13 = th13.getCause();
                    if (cause13 == null) {
                        throw th13;
                    }
                    throw cause13;
                }
            } catch (Throwable th14) {
                Throwable cause14 = th14.getCause();
                if (cause14 == null) {
                    throw th14;
                }
                throw cause14;
            }
        } catch (Throwable th15) {
            Throwable cause15 = th15.getCause();
            if (cause15 == null) {
                throw th15;
            }
            throw cause15;
        }
    }

    public static /* synthetic */ void d(PaymentActivity paymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 73;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaBrowserImplApi215 = i3;
        int i4 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i5 = i3 + 51;
            MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
            if (i5 % 2 == 0) {
                paymentActivity.MediaBrowserCompat();
                return;
            } else {
                paymentActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i6 = i3 + 7;
            MediaBrowserCompatMediaBrowserImplApi217 = i6 % 128;
            int i7 = i6 % 2;
            paymentActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            paymentActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            paymentActivity.getInterfaceDescriptor = String.valueOf(((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            paymentActivity.INotificationSideChannelStubProxy = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            paymentActivity.INotificationSideChannel = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
            paymentActivity.cancelAll = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b;
            paymentActivity.onTransact = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            paymentActivity.INotificationSideChannelDefault = ((BpuTuitionOneMonth) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 83;
            MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
            if (i2 % 2 == 0) {
                paymentActivity.MediaBrowserCompat();
                return null;
            }
            paymentActivity.MediaBrowserCompat();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentActivity.IconCompatParcelizer();
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            paymentActivity.IconCompatParcelizer();
            int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 49;
            MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = MediaBrowserCompatMediaBrowserImplApi215 + 117;
        MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentActivity paymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String tipeRekening;
        String namaLengkap;
        String recurringAktif;
        String nik;
        String nominal;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217;
        int i3 = i2 + 105;
        MediaBrowserCompatMediaBrowserImplApi215 = i3 % 128;
        int i4 = i3 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            paymentActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: setBaselineAlignedChildIndex
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentActivity.onTransact();
                }
            });
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i5 = i2 + 117;
            MediaBrowserCompatMediaBrowserImplApi215 = i5 % 128;
            int i6 = i5 % 2;
            paymentActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            Integer statusCode = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode();
            String str = null;
            if (statusCode != null && statusCode.intValue() == 100) {
                ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) paymentActivity.onItemLoaded.getValue();
                User user = (User) paymentActivity.onConnected.getValue();
                if (user != null) {
                    int i7 = MediaBrowserCompatMediaBrowserImplApi215 + 17;
                    MediaBrowserCompatMediaBrowserImplApi217 = i7 % 128;
                    int i8 = i7 % 2;
                    str = user.b;
                }
                listPopupWindow2.b(new GetCustomerObjectRequest(String.valueOf(str)));
                return;
            }
            paymentActivity.unsubscribe = true;
            RecurringProfile recurringProfile = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            String strValueOf = String.valueOf(recurringProfile != null ? recurringProfile.getTglLahir() : null);
            RecurringProfile recurringProfile2 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            if (recurringProfile2 != null) {
                int i9 = MediaBrowserCompatMediaBrowserImplApi217 + 25;
                MediaBrowserCompatMediaBrowserImplApi215 = i9 % 128;
                int i10 = i9 % 2;
                tipeRekening = recurringProfile2.getTipeRekening();
            } else {
                tipeRekening = null;
            }
            String strValueOf2 = String.valueOf(tipeRekening);
            RecurringProfile recurringProfile3 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            if (recurringProfile3 != null) {
                int i11 = MediaBrowserCompatMediaBrowserImplApi215 + 59;
                MediaBrowserCompatMediaBrowserImplApi217 = i11 % 128;
                if (i11 % 2 != 0) {
                    recurringProfile3.getNamaLengkap();
                    str.hashCode();
                    throw null;
                }
                namaLengkap = recurringProfile3.getNamaLengkap();
            } else {
                namaLengkap = null;
            }
            String strValueOf3 = String.valueOf(namaLengkap);
            RecurringProfile recurringProfile4 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            if (recurringProfile4 != null) {
                int i12 = MediaBrowserCompatMediaBrowserImplApi215 + 47;
                MediaBrowserCompatMediaBrowserImplApi217 = i12 % 128;
                int i13 = i12 % 2;
                recurringAktif = recurringProfile4.getRecurringAktif();
            } else {
                recurringAktif = null;
            }
            String strValueOf4 = String.valueOf(recurringAktif);
            RecurringProfile recurringProfile5 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            String strValueOf5 = String.valueOf(recurringProfile5 != null ? recurringProfile5.getPetugasRekam() : null);
            RecurringProfile recurringProfile6 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            String strValueOf6 = String.valueOf(recurringProfile6 != null ? recurringProfile6.getTglAktifRecurring() : null);
            RecurringProfile recurringProfile7 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            if (recurringProfile7 != null) {
                int i14 = MediaBrowserCompatMediaBrowserImplApi217 + 99;
                MediaBrowserCompatMediaBrowserImplApi215 = i14 % 128;
                int i15 = i14 % 2;
                nik = recurringProfile7.getNik();
            } else {
                int i16 = MediaBrowserCompatMediaBrowserImplApi215 + 111;
                MediaBrowserCompatMediaBrowserImplApi217 = i16 % 128;
                int i17 = i16 % 2;
                nik = null;
            }
            String strValueOf7 = String.valueOf(nik);
            RecurringProfile recurringProfile8 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            String strValueOf8 = String.valueOf(recurringProfile8 != null ? recurringProfile8.getKodePaket() : null);
            RecurringProfile recurringProfile9 = ((GetStatusRecurringPlanResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getRecurringProfile();
            if (recurringProfile9 != null) {
                int i18 = MediaBrowserCompatMediaBrowserImplApi217 + 31;
                MediaBrowserCompatMediaBrowserImplApi215 = i18 % 128;
                if (i18 % 2 == 0) {
                    nominal = recurringProfile9.getNominal();
                    int i19 = 40 / 0;
                } else {
                    nominal = recurringProfile9.getNominal();
                }
                str = nominal;
            }
            paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RecurringProfile(strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, String.valueOf(str));
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PaymentActivity paymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            paymentActivity.MediaBrowserCompat();
            str = "loading_get_list_payment_method_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: setHorizontalGravity
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (Unit) PaymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[0], 320586792, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -320586783, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            });
            int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 57;
            MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
            int i3 = i2 % 2;
            str = "failure_get_list_payment_method_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 7;
            MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
            int i5 = i4 % 2;
            paymentActivity.IconCompatParcelizer();
            List<PaymentMethodItem> list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            paymentActivity.INotificationSideChannelStub = list;
            paymentActivity.getItem = (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{list, "BRI"}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            paymentActivity.disconnect = (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity.INotificationSideChannelStub, "MANDIRI"}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            paymentActivity.getNotifyChildrenChangedOptions = (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity.INotificationSideChannelStub, "OVO"}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            paymentActivity.getServiceComponent = (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity.INotificationSideChannelStub, "DANA"}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            paymentActivity.getSessionToken = (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity.INotificationSideChannelStub, "SHOPEEPAY"}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            paymentActivity.sendCustomAction = (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity.INotificationSideChannelStub, "LINKAJA"}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            if (paymentActivity.getItem.size() > 0) {
                paymentActivity.a = true;
                paymentActivity.MediaBrowserCompat = new LinkedAccountDirectDebit(paymentActivity.getItem.get(0).getDirectDebit().getDirectDebitInfo().getCardExpiry(), paymentActivity.getItem.get(0).getDirectDebit().getDirectDebitInfo().getCardLastFour(), paymentActivity.getItem.get(0).getDirectDebit().getDirectDebitInfo().getEmail(), paymentActivity.getItem.get(0).getDirectDebit().getDirectDebitInfo().getMobileNumber());
            } else {
                paymentActivity.a = false;
            }
            if (paymentActivity.disconnect.size() > 0) {
                paymentActivity.asBinder = true;
                paymentActivity.getRoot = new LinkedAccountDirectDebit(paymentActivity.disconnect.get(0).getDirectDebit().getDirectDebitInfo().getCardExpiry(), paymentActivity.disconnect.get(0).getDirectDebit().getDirectDebitInfo().getCardLastFour(), paymentActivity.disconnect.get(0).getDirectDebit().getDirectDebitInfo().getEmail(), paymentActivity.disconnect.get(0).getDirectDebit().getDirectDebitInfo().getMobileNumber());
            } else {
                paymentActivity.asBinder = false;
            }
            if (paymentActivity.getServiceComponent.size() > 0) {
                paymentActivity.g = true;
                paymentActivity.read = new LinkedAccountEwallet(paymentActivity.getServiceComponent.get(0).getEwallet().getEwalletAccount().getName(), paymentActivity.getServiceComponent.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(paymentActivity.getServiceComponent.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(paymentActivity.getServiceComponent.get(0).getEwallet().getEwalletAccount().getPointBalance()));
            } else {
                paymentActivity.g = false;
                int i6 = MediaBrowserCompatMediaBrowserImplApi217 + 69;
                MediaBrowserCompatMediaBrowserImplApi215 = i6 % 128;
                int i7 = i6 % 2;
            }
            if (paymentActivity.sendCustomAction.size() > 0) {
                paymentActivity.cancel = true;
                paymentActivity.connect = new LinkedAccountEwallet(paymentActivity.sendCustomAction.get(0).getEwallet().getEwalletAccount().getName(), paymentActivity.sendCustomAction.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(paymentActivity.sendCustomAction.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(paymentActivity.sendCustomAction.get(0).getEwallet().getEwalletAccount().getPointBalance()));
            } else {
                paymentActivity.cancel = false;
            }
            if (paymentActivity.getSessionToken.size() > 0) {
                paymentActivity.d = true;
                paymentActivity.write = new LinkedAccountEwallet(paymentActivity.getSessionToken.get(0).getEwallet().getEwalletAccount().getName(), paymentActivity.getSessionToken.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(paymentActivity.getSessionToken.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(paymentActivity.getSessionToken.get(0).getEwallet().getEwalletAccount().getPointBalance()));
            } else {
                paymentActivity.d = false;
            }
            if (paymentActivity.getNotifyChildrenChangedOptions.size() > 0) {
                paymentActivity.asInterface = true;
                paymentActivity.IconCompatParcelizer = new LinkedAccountEwallet(paymentActivity.getNotifyChildrenChangedOptions.get(0).getEwallet().getEwalletAccount().getName(), paymentActivity.getNotifyChildrenChangedOptions.get(0).getEwallet().getEwalletAccount().getAccountDetails(), Integer.valueOf(paymentActivity.getNotifyChildrenChangedOptions.get(0).getEwallet().getEwalletAccount().getBalance()), Integer.valueOf(paymentActivity.getNotifyChildrenChangedOptions.get(0).getEwallet().getEwalletAccount().getPointBalance()));
            } else {
                paymentActivity.asInterface = false;
                int i8 = MediaBrowserCompatMediaBrowserImplApi217 + 35;
                MediaBrowserCompatMediaBrowserImplApi215 = i8 % 128;
                int i9 = i8 % 2;
            }
            paymentActivity.notify = true;
            str = "success_get_list_payment_method_result";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_get_list_payment_method", str));
        Intrinsics.checkNotNullParameter(paymentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 43;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 55;
        MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    public static /* synthetic */ Unit onTransact() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 97;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 51;
        MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentActivity paymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217;
        int i3 = i2 + 11;
        MediaBrowserCompatMediaBrowserImplApi215 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i4 = i2 + 17;
            MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
            int i5 = i4 % 2;
            paymentActivity.MediaBrowserCompat();
            int i6 = MediaBrowserCompatMediaBrowserImplApi215 + 63;
            MediaBrowserCompatMediaBrowserImplApi217 = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                paymentActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                return;
            }
            return;
        }
        int i7 = i2 + 51;
        MediaBrowserCompatMediaBrowserImplApi215 = i7 % 128;
        int i8 = i7 % 2;
        paymentActivity.IconCompatParcelizer();
        Registration registration = (Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue();
        String str = paymentActivity.MediaBrowserCompatCallbackHandler;
        String str2 = paymentActivity.search;
        Registration registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registration, false, null, null, null, null, null, null, null, null, String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g), null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, paymentActivity.getInterfaceDescriptor, null, null, str2, false, false, 1843396095);
        OneTimePaymentActivity.Companion companion = OneTimePaymentActivity.INSTANCE;
        OneTimePaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, ((CreateOneTimePaymentResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData(), registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        String str;
        String str2;
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            paymentActivity.MediaBrowserCompat();
            return null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 81;
            MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
            if (i2 % 2 == 0) {
                paymentActivity.IconCompatParcelizer();
                return null;
            }
            paymentActivity.IconCompatParcelizer();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            paymentActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).size() > 0) {
                paymentActivity.TuitionPaymentFragmentbindingInflater1 = String.valueOf(((CustomerObjectItem) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getCustomerId());
                paymentActivity.b = String.valueOf(((CustomerObjectItem) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getMobileNumber());
                paymentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = String.valueOf(((CustomerObjectItem) ((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).get(0)).getReferenceId());
                String str3 = paymentActivity.TuitionPaymentFragmentbindingInflater1;
                Intrinsics.checkNotNullParameter(str3, "");
                ((ListPopupWindow2) paymentActivity.onItemLoaded.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(str3));
                int i3 = MediaBrowserCompatMediaBrowserImplApi217 + 31;
                MediaBrowserCompatMediaBrowserImplApi215 = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            ListPopupWindow2 listPopupWindow2 = (ListPopupWindow2) paymentActivity.onItemLoaded.getValue();
            User user = (User) paymentActivity.onConnected.getValue();
            if (user != null) {
                int i4 = MediaBrowserCompatMediaBrowserImplApi217 + 55;
                MediaBrowserCompatMediaBrowserImplApi215 = i4 % 128;
                if (i4 % 2 == 0) {
                    String str4 = user.b;
                    throw null;
                }
                str = user.b;
            } else {
                str = null;
            }
            String strValueOf = String.valueOf(str);
            String strValueOf2 = String.valueOf(((Registration) paymentActivity.MediaBrowserCompatItemCallback.getValue()).g);
            User user2 = (User) paymentActivity.onConnected.getValue();
            if (user2 != null) {
                int i5 = MediaBrowserCompatMediaBrowserImplApi215 + 59;
                MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
                int i6 = i5 % 2;
                str2 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str2 = null;
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(str2));
            User user3 = (User) paymentActivity.onConnected.getValue();
            listPopupWindow2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CreateCustomerObjectRequest(strValueOf, strValueOf2, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, String.valueOf(user3 != null ? user3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null), " "));
        }
        return null;
    }

    public static /* synthetic */ Unit g() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 47;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = MediaBrowserCompatMediaBrowserImplApi215 + 105;
        MediaBrowserCompatMediaBrowserImplApi217 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r5.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new defpackage.setWeightSum());
        r5 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215 + 109;
        com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if ((r5 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.asBinder) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        r2 = r2 + 107;
        com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r2 % 128;
        r2 = r2 % 2;
        r5.IconCompatParcelizer();
        r6 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.INSTANCE;
        com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, r5.setCallbacksMessenger);
        android.widget.Toast.makeText(defpackage.ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Proses pendaftaran autodebit berhasil", 0).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r5.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void g(com.bpjstku.presentation.membership.payment.PaymentActivity r5, defpackage.VirtualCameraAdapter1 r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L17
            boolean r1 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r4 = 46
            int r4 = r4 / r3
            if (r1 == 0) goto L1f
            goto L1b
        L17:
            boolean r1 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r1 == 0) goto L1f
        L1b:
            r5.MediaBrowserCompat()
            return
        L1f:
            boolean r1 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r1 == 0) goto L49
            r5.IconCompatParcelizer()
            com.nbs.nucleosnucleo.presentation.BaseActivity r5 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r5
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r6 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6
            java.lang.String r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r6 = java.lang.String.valueOf(r6)
            setWeightSum r1 = new setWeightSum
            r1.<init>()
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, r6, r1)
            int r5 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215
            int r5 = r5 + 109
            int r6 = r5 % 128
            com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L44
            return
        L44:
            r5 = 0
            r5.hashCode()
            throw r5
        L49:
            boolean r6 = r6 instanceof VirtualCameraAdapter1.asBinder
            if (r6 == 0) goto L70
            int r2 = r2 + 107
            int r6 = r2 % 128
            com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r6
            int r2 = r2 % r0
            r5.IconCompatParcelizer()
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r6 = com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.INSTANCE
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            com.bpjstku.presentation.tuition.model.CustomerObject r5 = r5.setCallbacksMessenger
            com.bpjstku.presentation.membership.payment.RegisterRecurringSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6, r5)
            android.content.Context r5 = defpackage.ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2()
            java.lang.String r6 = "Proses pendaftaran autodebit berhasil"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r3)
            r5.show()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.g(com.bpjstku.presentation.membership.payment.PaymentActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Unit d() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 67;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 115;
        MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 27;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 89;
        MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void asInterface(PaymentActivity paymentActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 101;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            paymentActivity.MediaBrowserCompat();
            int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 71;
            MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
            int i5 = i4 % 2;
            str = "loading_create_customer_object";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            paymentActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(paymentActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: LinearLayoutCompatDividerMode
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentActivity.g();
                }
            });
            str = "failure_create_customer_object";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            paymentActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            paymentActivity.TuitionPaymentFragmentbindingInflater1 = String.valueOf(((CustomerObjectItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId());
            String strValueOf = String.valueOf(((CustomerObjectItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCustomerId());
            Intrinsics.checkNotNullParameter(strValueOf, "");
            ((ListPopupWindow2) paymentActivity.onItemLoaded.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetListPaymentMethodRequest(strValueOf));
            str = "success_create_customer_object";
        } else {
            str = "";
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_tuition_payment", str));
        Intrinsics.checkNotNullParameter(paymentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r4.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r4.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r2 = com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.INSTANCE;
        r1 = ((com.bpjstku.data.payment.model.response.CheckOneTimePaymentResponse) r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        com.bpjstku.presentation.membership.payment.OneTimePaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r18, r1.get(0), (com.bpjstku.domain.registration.general.model.Registration) r18.MediaBrowserCompatItemCallback.getValue());
        r0 = com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi215 + 13;
        com.bpjstku.presentation.membership.payment.PaymentActivity.MediaBrowserCompatMediaBrowserImplApi217 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void asBinder(final com.bpjstku.presentation.membership.payment.PaymentActivity r18, defpackage.VirtualCameraAdapter1 r19) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.asBinder(com.bpjstku.presentation.membership.payment.PaymentActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ Registration TuitionPaymentFragmentspecialinlinedviewModeldefault3(PaymentActivity paymentActivity) {
        return (Registration) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{paymentActivity}, 445543140, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -445543135, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ Unit INotificationSideChannel() {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[0], -1732197674, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1732197677, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static /* synthetic */ Unit cancelAll() {
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[0], 320586792, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -320586783, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi215 + 63;
        MediaBrowserCompatMediaBrowserImplApi217 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 13;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, 149308560, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -149308550, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    private static List<PaymentMethodItem> TuitionPaymentFragmentbindingInflater1(List<PaymentMethodItem> p0, String p1) {
        return (List) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{p0, p1}, -575786417, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 575786418, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this}, 1708905308, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_frame_your_face_out_of_box).substring(15, 16).length() - 1787504808, -1708905301, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1955145612, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    private void b(boolean p0) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, Boolean.valueOf(p0)}, -1560422959, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1560422965, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bca_klikpay).substring(0, 11).codePointAt(9) - 2144083281, AutoValue_CrashlyticsReport_Session_Event_RolloutsState.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 77;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatMediaBrowserImplApi215 + 61;
        MediaBrowserCompatMediaBrowserImplApi217 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void INotificationSideChannelStub() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[0], 198775629, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -198775625, TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    static void getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 121;
        MediaBrowserCompatMediaBrowserImplApi215 = i2 % 128;
        if (i2 % 2 != 0) {
            MediaBrowserCompatItemCallbackStubApi23 = new char[]{57190, 60052, 57189, 57184, 60046, 60075, 60063, 57188, 57187, 57193, 57191, 60047, 60116, 60053, 60072, 60041, 60090, 60049, 60051, 57192, 60040, 60060, 60043, 60076, 60050, 60117, 60055, 60062, 60082, 60054, 60045, 60058, 57186, 60056, 60057, 60048};
            MediaBrowserCompatMediaBrowserImpl = (char) 57191;
            run = new int[]{365912538, 1846255048, 1549942511, 1036660807, 42276307, 2111039284, -554265172, 2122810233, 810724680, 1060044403, -513378557, 2060989365, -1052204627, 830703449, 1778078516, -1756147258, 1085891337, 1602103775};
        } else {
            MediaBrowserCompatItemCallbackStubApi23 = new char[]{57190, 60052, 57189, 57184, 60046, 60075, 60063, 57188, 57187, 57193, 57191, 60047, 60116, 60053, 60072, 60041, 60090, 60049, 60051, 57192, 60040, 60060, 60043, 60076, 60050, 60117, 60055, 60062, 60082, 60054, 60045, 60058, 57186, 60056, 60057, 60048};
            MediaBrowserCompatMediaBrowserImpl = (char) 57191;
            run = new int[]{365912538, 1846255048, 1549942511, 1036660807, 42276307, 2111039284, -554265172, 2122810233, 810724680, 1060044403, -513378557, 2060989365, -1052204627, 830703449, 1778078516, -1756147258, 1085891337, 1602103775};
            int i3 = 18 / 0;
        }
    }

    static void INotificationSideChannelDefault() {
        MediaBrowserCompatMediaBrowserImplApi212 = -1276905565;
        MediaBrowserCompatMediaBrowserImplApi211 = -1934795564;
        MediaBrowserCompatMediaBrowserImplApi213 = -791094051;
        onServiceConnected = new byte[]{56, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 56, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, 2, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 59, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31};
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi217 + 117;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaBrowserImplApi215 = i3;
        int i4 = i2 % 2;
        onLoadChildren = 2618911636820900470L;
        int i5 = i3 + 81;
        MediaBrowserCompatMediaBrowserImplApi217 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.membership.payment.PaymentActivity.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r7 = 121 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L29:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.payment.PaymentActivity.$$i(byte, short, byte):java.lang.String");
    }
}
