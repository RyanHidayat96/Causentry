package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.viewpager.widget.ViewPager;
import com.asksira.loopingviewpager.LoopingViewPager;
import com.bpjstku.R;
import com.bpjstku.data.banner.model.request.BannerRequest;
import com.bpjstku.data.bsu.model.BsuConfig;
import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.menu.model.response.AvailabilityMenuItem;
import com.bpjstku.data.multibiller.model.request.MultiBillerTransactionRequest;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionItem;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionResponse;
import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.data.setting.model.request.ChangeDataFirstVerificationRequest;
import com.bpjstku.data.user.model.response.FiturList;
import com.bpjstku.databinding.FragmentHomeBinding;
import com.bpjstku.domain.banner.model.Banner;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.domain.mlt.model.MltItem;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.scholarship.model.ScholarInsertResult;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.account.setting.addkpj.AddKpjActivity;
import com.bpjstku.presentation.account.verify.AccountVerificationActivity;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantSubmissionCheckActivity;
import com.bpjstku.presentation.branchoffice.BranchOfficeActivity;
import com.bpjstku.presentation.complaint.ChooseComplaintActivity;
import com.bpjstku.presentation.compose.feature.scholarship.ui.ScholarshipGranteeActivity;
import com.bpjstku.presentation.danasiaga.DanaSiagaActivity;
import com.bpjstku.presentation.digitalcard.DigitalCardActivity;
import com.bpjstku.presentation.investation.InvestmentListActivity;
import com.bpjstku.presentation.main.home.HomeFragment$bindingInflater$1;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity;
import com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity;
import com.bpjstku.presentation.multibiller.TermsAndAgreementBillerActivity;
import com.bpjstku.presentation.openbanking.ListBankActivity;
import com.bpjstku.presentation.partner.PartnerActivity;
import com.bpjstku.presentation.podcast.VideoListActivity;
import com.bpjstku.presentation.program.ProgramActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.balancecheck.OldDaySecurityBalanceCheckActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimChooseMembershipActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityTermsConditionActivity;
import com.bpjstku.presentation.program.jkk.JkkServiceActivity;
import com.bpjstku.presentation.program.jkm.JkmServiceActivity;
import com.bpjstku.presentation.program.jkp.JkpMainActivity;
import com.bpjstku.presentation.program.jpn.JpnMainActivity;
import com.bpjstku.presentation.program.jpn.jpnPeriodic.JpnPeriodicCheckEligibleActivity;
import com.bpjstku.presentation.program.model.ProgramInfo;
import com.bpjstku.presentation.promo.CoMarketingActivity;
import com.bpjstku.presentation.promo.PromoActivity;
import com.bpjstku.presentation.report.ChooseReportingActivity;
import com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity;
import com.bpjstku.presentation.streaming.ListStreamingActivity;
import com.bpjstku.presentation.support.SupportActivity;
import com.bpjstku.presentation.syariah.SyariahChooseCardMembershipActivity;
import com.bpjstku.presentation.tuition.TuitionActivity;
import com.bpjstku.presentation.util.SertakanWebviewActivity;
import com.bpjstku.presentation.util.WebviewCustomActivity;
import com.bpjstku.presentation.util.WebviewFaqCustomActivity;
import com.bpjstku.util.constant.AsikPointer;
import com.bpjstku.util.constant.JhtEligibilityStatus;
import com.bpjstku.util.enums.BpjsServiceEnum;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.kennyc.view.MultiStateView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.CustomTabsSession1ExternalSyntheticLambda1;
import defpackage.IntegerRes;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.access000;
import defpackage.flushLollipops;
import defpackage.getEventTime;
import defpackage.getHeaderTitle;
import defpackage.getRatioByPercentage;
import defpackage.getStreamUseCaseSupportedCombinationList;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdaonVerticalScrollEvent0;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ¹\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004¹\u0001º\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J^\u0010g\u001a\u00020h2\b\b\u0002\u0010i\u001a\u00020a2\b\b\u0002\u0010j\u001a\u00020k2\b\b\u0002\u0010l\u001a\u00020k2\b\b\u0002\u0010m\u001a\u00020k2\b\b\u0002\u0010n\u001a\u00020k2\u0010\b\u0002\u0010o\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010p2\u0010\b\u0002\u0010q\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010pH\u0002J\u0010\u0010r\u001a\u00020h2\u0006\u0010s\u001a\u00020tH\u0016J\b\u0010u\u001a\u00020hH\u0014J\b\u0010v\u001a\u00020hH\u0014J\b\u0010w\u001a\u00020hH\u0014J\b\u0010x\u001a\u00020hH\u0014J\b\u0010y\u001a\u00020hH\u0002J\b\u0010z\u001a\u00020hH\u0014J\b\u0010{\u001a\u00020hH\u0002J\b\u0010|\u001a\u00020hH\u0002J\b\u0010}\u001a\u00020hH\u0002J\b\u0010~\u001a\u00020hH\u0002J\u001b\u0010\u007f\u001a\u00020h2\u0011\u0010\u0080\u0001\u001a\f\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0081\u0001H\u0002J\u0013\u0010\u0083\u0001\u001a\u00020h2\b\u0010\u0084\u0001\u001a\u00030\u0082\u0001H\u0002J\u001c\u0010\u0085\u0001\u001a\u00020h2\u0011\u0010\u0080\u0001\u001a\f\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0081\u0001H\u0002J\u0013\u0010\u0087\u0001\u001a\u00020h2\b\u0010\u0084\u0001\u001a\u00030\u0086\u0001H\u0002J!\u0010\u0088\u0001\u001a\u00020h2\u0016\u0010\u0080\u0001\u001a\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070>\u0018\u00010\u0081\u0001H\u0002J\u001c\u0010\u0089\u0001\u001a\u00020h2\u0011\u0010\u0080\u0001\u001a\f\u0012\u0005\u0012\u00030\u008a\u0001\u0018\u00010\u0081\u0001H\u0002J\u001c\u0010\u008b\u0001\u001a\u00020h2\u0011\u0010\u0080\u0001\u001a\f\u0012\u0005\u0012\u00030\u008c\u0001\u0018\u00010\u0081\u0001H\u0002J\t\u0010\u008d\u0001\u001a\u00020hH\u0002J\u0010\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010>H\u0002J\u001a\u0010\u0090\u0001\u001a\u00020]2\b\u0010G\u001a\u0004\u0018\u00010H2\u0007\u0010\u0091\u0001\u001a\u00020kJ\u0010\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010>H\u0002J\u0013\u0010\u0094\u0001\u001a\u00020h2\b\u0010\u0084\u0001\u001a\u00030\u0093\u0001H\u0002J\u0012\u0010\u0095\u0001\u001a\u00020h2\u0007\u0010\u0096\u0001\u001a\u00020kH\u0002J\t\u0010\u0097\u0001\u001a\u00020hH\u0002J\t\u0010\u0098\u0001\u001a\u00020hH\u0002J\u0015\u0010\u0099\u0001\u001a\u00020h2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0002J\t\u0010\u009c\u0001\u001a\u00020hH\u0002J\t\u0010\u009d\u0001\u001a\u00020hH\u0002J\t\u0010\u009e\u0001\u001a\u00020hH\u0002J\t\u0010\u009f\u0001\u001a\u00020hH\u0002J\t\u0010 \u0001\u001a\u00020hH\u0002J!\u0010¡\u0001\u001a\u00020h2\u0007\u0010¢\u0001\u001a\u00020a2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070>H\u0002J\t\u0010¤\u0001\u001a\u00020hH\u0002J\u0012\u0010¥\u0001\u001a\u00020k2\u0007\u0010\u0096\u0001\u001a\u00020kH\u0002J\u0012\u0010¦\u0001\u001a\u00020h2\u0007\u0010§\u0001\u001a\u00020kH\u0002J\u0011\u0010¨\u0001\u001a\u00020h2\u0006\u0010l\u001a\u00020kH\u0002J\t\u0010©\u0001\u001a\u00020hH\u0002J\u0018\u0010ª\u0001\u001a\u00020h2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070>H\u0002J\u0012\u0010«\u0001\u001a\u00020h2\u0007\u0010¬\u0001\u001a\u00020kH\u0002J\t\u0010\u00ad\u0001\u001a\u00020hH\u0002J$\u0010®\u0001\u001a\u00020h2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010¯\u0001\u001a\u0005\u0018\u00010°\u0001H\u0002J\t\u0010±\u0001\u001a\u00020hH\u0016J\t\u0010²\u0001\u001a\u00020hH\u0016J!\u0010³\u0001\u001a\u00020h2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020?0>2\u0007\u0010´\u0001\u001a\u00020kH\u0002J\t\u0010µ\u0001\u001a\u00020hH\u0002J\u0013\u0010¶\u0001\u001a\u00020h2\b\u0010·\u0001\u001a\u00030¸\u0001H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000f\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000f\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u000f\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u000f\u001a\u0004\bD\u0010ER\u001d\u0010G\u001a\u0004\u0018\u00010H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u000f\u001a\u0004\bI\u0010JR\u001b\u0010L\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\u000f\u001a\u0004\bN\u0010OR\u001d\u0010Q\u001a\u0004\u0018\u00010R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u000f\u001a\u0004\bS\u0010TR\u0016\u0010V\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010Y\u001a\u001c\u0012\u0004\u0012\u00020[\u0012\u0006\u0012\u0004\u0018\u00010\\\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00020Z8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020aX\u0094D¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020]X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006»\u0001"}, d2 = {"Lcom/bpjstku/presentation/main/home/HomeFragment;", "Lcom/bpjstku/util/viewbinding/BindingBaseFragment;", "Lcom/bpjstku/databinding/FragmentHomeBinding;", "<init>", "()V", "sampleBanner", "", "Lcom/bpjstku/domain/banner/model/Banner;", "antreanConfig", "Lcom/bpjstku/data/config/model/AntreanMenuConfig;", "accountViewModel", "Lcom/bpjstku/presentation/account/AccountViewModel;", "getAccountViewModel", "()Lcom/bpjstku/presentation/account/AccountViewModel;", "accountViewModel$delegate", "Lkotlin/Lazy;", "bannerViewModel", "Lcom/bpjstku/presentation/banner/BannerViewModel;", "getBannerViewModel", "()Lcom/bpjstku/presentation/banner/BannerViewModel;", "bannerViewModel$delegate", "menuViewModel", "Lcom/bpjstku/presentation/main/MenuViewModel;", "getMenuViewModel", "()Lcom/bpjstku/presentation/main/MenuViewModel;", "menuViewModel$delegate", "mltViewModel", "Lcom/bpjstku/presentation/mlt/MltViewModel;", "getMltViewModel", "()Lcom/bpjstku/presentation/mlt/MltViewModel;", "mltViewModel$delegate", "multiBillerViewModel", "Lcom/bpjstku/presentation/multibiller/MultiBillerViewModel;", "getMultiBillerViewModel", "()Lcom/bpjstku/presentation/multibiller/MultiBillerViewModel;", "multiBillerViewModel$delegate", "motionViewModel", "Lcom/bpjstku/presentation/ewallet/MotionViewModel;", "getMotionViewModel", "()Lcom/bpjstku/presentation/ewallet/MotionViewModel;", "motionViewModel$delegate", "settingViewModel", "Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "getSettingViewModel", "()Lcom/bpjstku/presentation/account/setting/SettingViewModel;", "settingViewModel$delegate", "scholarSelectViewModel", "Lcom/bpjstku/presentation/scholarship/select/ScholarSelectViewModel;", "getScholarSelectViewModel", "()Lcom/bpjstku/presentation/scholarship/select/ScholarSelectViewModel;", "scholarSelectViewModel$delegate", "jhtClaimViewModel", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/JhtClaimViewModel;", "getJhtClaimViewModel", "()Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/JhtClaimViewModel;", "jhtClaimViewModel$delegate", "queueingViewModel", "Lcom/bpjstku/presentation/queueing/QueueingViewModel;", "getQueueingViewModel", "()Lcom/bpjstku/presentation/queueing/QueueingViewModel;", "queueingViewModel$delegate", "claimSegmenData", "", "Lcom/bpjstku/domain/jht/model/ClaimSegmenItem;", "notifikasi", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/SimpleDialogFragment;", "programAdapter", "Lcom/bpjstku/presentation/program/adapter/ProgramAdapter;", "getProgramAdapter", "()Lcom/bpjstku/presentation/program/adapter/ProgramAdapter;", "programAdapter$delegate", "user", "Lcom/bpjstku/domain/user/model/User;", "getUser", "()Lcom/bpjstku/domain/user/model/User;", "user$delegate", "bpjsServiceAdapter", "Lcom/bpjstku/presentation/main/home/adapter/BpjsServiceAdapter;", "getBpjsServiceAdapter", "()Lcom/bpjstku/presentation/main/home/adapter/BpjsServiceAdapter;", "bpjsServiceAdapter$delegate", "menuAvailability", "Lcom/bpjstku/domain/menu/model/MenuAvailability;", "getMenuAvailability", "()Lcom/bpjstku/domain/menu/model/MenuAvailability;", "menuAvailability$delegate", "startForResultMbWebview", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getBindingInflater", "()Lkotlin/jvm/functions/Function3;", "layoutResource", "", "getLayoutResource", "()I", "resultPopup", "Lcom/bpjstku/presentation/membership/registration/ProcessResultDialogFragment;", "statusAntrian", "showDialogPopup", "", "image", "title", "", "message", "buttonText", "secondaryButtonText", "buttonClickedListener", "Lkotlin/Function0;", "secondaryButtonClickedListener", "onAttach", "context", "Landroid/content/Context;", "initAction", "initIntent", "initObservers", "initProcess", "fetchAntrianOnlineUrl", "initUI", "setupQueueingFeatureVisibility", "setupProgramServiceGrid", "setupTreatmentNotificationBanner", "setupWindowInsetsForAndroid35", "handleConnectResult", "it", "Lcom/nbs/nucleo/data/Result;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "handleSuccessConnect", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleTransactionResult", "Lcom/bpjstku/data/multibiller/model/response/MultiBillerTransactionResponse;", "handleSuccessTransaction", "handleBannerResult", "handleMltResult", "Lcom/bpjstku/domain/mlt/model/MltItem;", "handleChangeVerificationResult", "Lcom/bpjstku/domain/registration/general/model/Verification;", "getBanner", "getPrograms", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "isKodeFiturExist", "kodeFitur", "getBpjsServices", "Lcom/bpjstku/domain/service/BpjsService;", "handleBpjsServiceClickAction", "handleServiceAction", "id", "checkWebStatusAndProceed", "handleTuitionMenu", "handleMenuInactive", "menu", "Lcom/bpjstku/data/menu/model/response/AvailabilityMenuItem;", "handleBranchOfficeMenu", "handleHeregistrationMenu", "showQueueingBottomSheet", "handleJhtClaimMenu", "handleOthersMenu", "dotSelected", "position", "banners", "submitHandphoneVerificationEmail", "getEventName", "trackEvent", NotificationCompat.CATEGORY_EVENT, "showDialogError", "showVerificationDialog", "showBanners", "showBannerCloseJhtService", "imageUrl", "showBannerInfo", "showBannersDummy", "configObject", "Lcom/bpjstku/data/bsu/model/BsuConfig;", "onPause", "onResume", "getSegmenResult", "codePengajuan", "eligibilityClaim", "showEligibilityClaim", "requestItem", "Lcom/bpjstku/domain/jht/model/JhtClaimEligibility;", "Companion", "BpjsServiceItemDecoration", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class refreshVisibility extends AutoValue_CameraState_StateError<FragmentHomeBinding> {
    public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
    private final Lazy INotificationSideChannel;
    private getStringOrNull INotificationSideChannelStubProxy;
    private boolean MediaBrowserCompat;
    private final Lazy RemoteActionCompatParcelizer;
    private AntreanMenuConfig TuitionPaymentFragmentbindingInflater1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy asInterface;
    private final Lazy cancel;
    private final Lazy cancelAll;
    private final Lazy getInterfaceDescriptor;
    private lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl notify;
    private final Lazy onTransact;
    private ActivityResultLauncher<Intent> read;
    private final Lazy write;
    private List<Banner> INotificationSideChannelDefault = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ClaimSegmenItem> f1338a = CollectionsKt.emptyList();
    private final Lazy INotificationSideChannelStub = LazyKt.lazy(new Function0() { // from class: hideOverflowMenu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });
    private final Lazy connect = LazyKt.lazy(new Function0() { // from class: positionChild
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: postShowOverflowMenu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return refreshVisibility.INotificationSideChannel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: onHoverEvent
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((access000) this.TuitionPaymentFragmentbindingInflater1.cancelAll.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    });
    private final int asBinder = R.layout.fragment_home;

    static final /* synthetic */ class asInterface implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        asInterface(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LrefreshVisibility$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public refreshVisibility() {
        final refreshVisibility refreshvisibility = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new HomeFragment$special$$inlined$inject$default$1(refreshvisibility));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<flushLollipops>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [flushLollipops, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final flushLollipops invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(flushLollipops.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.cancelAll = LazyKt.lazy(new Function0<access000>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$3
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [access000, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final access000 invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(access000.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.INotificationSideChannel = LazyKt.lazy(new Function0<lambdaonVerticalScrollEvent0>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$4
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lambdaonVerticalScrollEvent0] */
            @Override // kotlin.jvm.functions.Function0
            public final lambdaonVerticalScrollEvent0 invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(lambdaonVerticalScrollEvent0.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.onTransact = LazyKt.lazy(new Function0<CustomTabsSession1ExternalSyntheticLambda1>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$5
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [CustomTabsSession1ExternalSyntheticLambda1, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final CustomTabsSession1ExternalSyntheticLambda1 invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(CustomTabsSession1ExternalSyntheticLambda1.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final refreshVisibility refreshvisibility2 = this;
        this.cancel = LazyKt.lazy(new Function0<getHeaderTitle>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getHeaderTitle] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getHeaderTitle invoke() {
                LifecycleOwner lifecycleOwner = refreshvisibility2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getHeaderTitle.class);
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
        this.write = LazyKt.lazy(new Function0<IntegerRes>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$6
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [IntegerRes, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final IntegerRes invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(IntegerRes.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.getInterfaceDescriptor = LazyKt.lazy(new Function0<getRatioByPercentage>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$7
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getRatioByPercentage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getRatioByPercentage invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getRatioByPercentage.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.asInterface = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = refreshvisibility2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
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
        this.RemoteActionCompatParcelizer = LazyKt.lazy(new Function0<getStreamUseCaseSupportedCombinationList>() { // from class: com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$8
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getStreamUseCaseSupportedCombinationList, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getStreamUseCaseSupportedCombinationList invoke() {
                ComponentCallbacks componentCallbacks = refreshvisibility;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getStreamUseCaseSupportedCombinationList.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ FragmentHomeBinding INotificationSideChannelStub(refreshVisibility refreshvisibility) {
        return refreshvisibility.asInterface();
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentHomeBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return HomeFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.asBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final refreshVisibility refreshvisibility, int i, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, int i2) {
        refreshvisibility.TuitionPaymentFragmentbindingInflater1((i2 & 1) != 0 ? R.drawable.ic_info_blue : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "", (i2 & 32) != 0 ? new Function0() { // from class: access101
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return refreshVisibility.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        } : function0, (i2 & 64) != 0 ? new Function0() { // from class: isOverflowReserved
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return refreshVisibility.onTransact(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        } : function1);
    }

    private final void TuitionPaymentFragmentbindingInflater1(int i, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function1) {
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        getStringOrNull getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getStringOrNull.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, str, str2, str3, function0, str4, function1);
        this.INotificationSideChannelStubProxy = getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, getstringornullTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // defpackage.LifecycleCameraRepository, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.read = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: setContentHeight
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ActivityResult) obj);
            }
        });
        super.onAttach(context);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        CardView root = asInterface().layoutQueueingFeature.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getEpicenterBounds
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
        MaterialButton materialButton = asInterface().btnOtherProgram;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: StandardMenuPopup1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        asInterface().btnSeeAllPromo.setOnClickListener(new View.OnClickListener() { // from class: dismissPopupMenus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                refreshVisibility.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
    }

    public static final class b implements lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b {
        b() {
        }

        @Override // lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            BaseActivity baseActivity = refreshVisibility.this.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
        }
    }

    public static final class d implements getStringOrNull.b {
        d() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            BaseActivity baseActivity = refreshVisibility.this.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(VirtualCameraAdapter1<AntrianOnlineUrlResponse> virtualCameraAdapter1) {
            VirtualCameraAdapter1<AntrianOnlineUrlResponse> virtualCameraAdapter2 = virtualCameraAdapter1;
            Intrinsics.checkNotNullParameter(virtualCameraAdapter2, "");
            if (virtualCameraAdapter2 instanceof VirtualCameraAdapter1.asBinder) {
                ((AntrianOnlineUrlResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter2).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getUrlAntrianOnline();
                refreshVisibility.INotificationSideChannelDefault(refreshVisibility.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeObserver(this);
            } else if (virtualCameraAdapter2 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                refreshVisibility.INotificationSideChannelDefault(refreshVisibility.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeObserver(this);
            }
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Observer<VirtualCameraAdapter1<AntrianOnlineUrlResponse>> {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(VirtualCameraAdapter1<AntrianOnlineUrlResponse> virtualCameraAdapter1) {
            VirtualCameraAdapter1<AntrianOnlineUrlResponse> virtualCameraAdapter2 = virtualCameraAdapter1;
            Intrinsics.checkNotNullParameter(virtualCameraAdapter2, "");
            if (virtualCameraAdapter2 instanceof VirtualCameraAdapter1.asBinder) {
                ((AntrianOnlineUrlResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter2).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getUrlAntrianOnline();
                refreshVisibility.INotificationSideChannelDefault(refreshVisibility.this).b.removeObserver(this);
            } else if (virtualCameraAdapter2 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                refreshVisibility.INotificationSideChannelDefault(refreshVisibility.this).b.removeObserver(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        if (Intrinsics.areEqual(str, BpjsServiceEnum.REGISTRATION.getType())) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            if (getMaxImages.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal()) {
                SertakanWebviewActivity.Companion companion = SertakanWebviewActivity.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                SertakanWebviewActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext, "", "");
                return;
            }
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion companion2 = TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.INSTANCE;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            TermsAndConditionRegistrationNonSalariedWorkerParticipantActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext2, false, false, 6);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.ECARD.getType())) {
            DigitalCardActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = DigitalCardActivity.INSTANCE;
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            DigitalCardActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext3);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PROMO.getType())) {
            CoMarketingActivity.Companion companion3 = CoMarketingActivity.INSTANCE;
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            CoMarketingActivity.Companion.b(contextRequireContext4, false, "");
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.TUITION.getType())) {
            INotificationSideChannelDefault();
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.ADDITIONAL_SERVICES.getType())) {
            ((lambdaonVerticalScrollEvent0) this.INotificationSideChannel.getValue()).b();
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PARTNER.getType())) {
            PartnerActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = PartnerActivity.INSTANCE;
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            PartnerActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext5, "DKI Jakarta", "Jakarta Barat");
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PROGRAM_INFO.getType())) {
            ProgramActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = ProgramActivity.INSTANCE;
            Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
            List<ProgramInfo> listD = d();
            Intrinsics.checkNotNull(listD, "");
            ProgramActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext6, (ArrayList) listD, ProgramActivity.ProgramDetailType.OPEN_PROGRAM_INFO);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.REPORTING.getType())) {
            ChooseReportingActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = ChooseReportingActivity.INSTANCE;
            Context contextRequireContext7 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "");
            ChooseReportingActivity.Companion.b(contextRequireContext7);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.BRANCH_OFFICE.getType())) {
            a();
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.COMPLAINT.getType())) {
            ChooseComplaintActivity.Companion bVar = ChooseComplaintActivity.INSTANCE;
            Context contextRequireContext8 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "");
            ChooseComplaintActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext8);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.HEREGISTRATION.getType())) {
            getInterfaceDescriptor();
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.SYARIAH.getType())) {
            SyariahChooseCardMembershipActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault5 = SyariahChooseCardMembershipActivity.INSTANCE;
            Context contextRequireContext9 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "");
            SyariahChooseCardMembershipActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext9);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.SUPPORT.getType())) {
            SupportActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault6 = SupportActivity.INSTANCE;
            Context contextRequireContext10 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "");
            SupportActivity.Companion.b(contextRequireContext10);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.DANASIAGA.getType())) {
            DanaSiagaActivity.Companion tuitionPaymentFragmentbindingInflater1 = DanaSiagaActivity.INSTANCE;
            Context contextRequireContext11 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "");
            DanaSiagaActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext11);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.INVESTASI.getType())) {
            InvestmentListActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault7 = InvestmentListActivity.INSTANCE;
            Context contextRequireContext12 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext12, "");
            InvestmentListActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext12);
            return;
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.STREAMING.getType())) {
            ListStreamingActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault8 = ListStreamingActivity.INSTANCE;
            Context contextRequireContext13 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext13, "");
            ListStreamingActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext13);
            return;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!Intrinsics.areEqual(str, BpjsServiceEnum.TOPUP.getType())) {
            if (Intrinsics.areEqual(str, BpjsServiceEnum.JP_PERIODICALLY.getType())) {
                JpnPeriodicCheckEligibleActivity.Companion bVar2 = JpnPeriodicCheckEligibleActivity.INSTANCE;
                Context contextRequireContext14 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext14, "");
                JpnPeriodicCheckEligibleActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext14);
                return;
            }
            if (Intrinsics.areEqual(str, BpjsServiceEnum.OPEN_BANKING.getType())) {
                ListBankActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault9 = ListBankActivity.INSTANCE;
                Context contextRequireContext15 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext15, "");
                ListBankActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext15);
                return;
            }
            if (Intrinsics.areEqual(str, BpjsServiceEnum.OTHER.getType())) {
                INotificationSideChannelStub();
                return;
            }
            if (Intrinsics.areEqual(str, BpjsServiceEnum.PODCAST.getType())) {
                startActivity(new Intent(requireContext(), (Class<?>) VideoListActivity.class));
                return;
            }
            if (!Intrinsics.areEqual(str, BpjsServiceEnum.SCHOLARSHIP.getType())) {
                if (Intrinsics.areEqual(str, BpjsServiceEnum.IJC.getType())) {
                    getMaxImages getmaximages2 = getMaxImages.INSTANCE;
                    String strOnLoadChildren = getMaxImages.onLoadChildren();
                    WebviewCustomActivity.Companion companion4 = WebviewCustomActivity.INSTANCE;
                    Context contextRequireContext16 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext16, "");
                    String string = getString(R.string.menu_ijc);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext16, strOnLoadChildren, string, 0, null, false, 56);
                    return;
                }
                if (Intrinsics.areEqual(str, BpjsServiceEnum.BALANCE_CHECK.getType())) {
                    OldDaySecurityBalanceCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault10 = OldDaySecurityBalanceCheckActivity.INSTANCE;
                    Context contextRequireContext17 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext17, "");
                    OldDaySecurityBalanceCheckActivity.Companion.b(contextRequireContext17);
                    return;
                }
                if (Intrinsics.areEqual(str, BpjsServiceEnum.CLAIM_OLD_DAY_SECURITY.getType())) {
                    this.MediaBrowserCompat = false;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                } else {
                    if (Intrinsics.areEqual(str, BpjsServiceEnum.QUEUEING.getType())) {
                        INotificationSideChannelStubProxy();
                        return;
                    }
                    return;
                }
            }
            getRatioByPercentage getratiobypercentage = (getRatioByPercentage) this.getInterfaceDescriptor.getValue();
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipEligibleRequest(str2 != null ? str2 : "", objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
            return;
        }
        getHeaderTitle getheadertitle = (getHeaderTitle) this.cancel.getValue();
        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str3 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        getheadertitle.b(new MotionCheckConnectRequest(str3 != null ? str3 : ""));
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AvailabilityMenuItem availabilityMenuItem) {
        String imageUrl = availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null;
        if (imageUrl != null && imageUrl.length() != 0) {
            b(String.valueOf(availabilityMenuItem != null ? availabilityMenuItem.getImageUrl() : null));
            return;
        }
        refreshVisibility refreshvisibility = this;
        String strValueOf = String.valueOf(availabilityMenuItem != null ? availabilityMenuItem.getInformationMessage() : null);
        Intrinsics.checkNotNullParameter(refreshvisibility, "");
        Intrinsics.checkNotNullParameter(strValueOf, "");
        BaseActivity baseActivity = (BaseActivity) refreshvisibility.getContext();
        if (baseActivity != null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
        }
    }

    private final void a() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Intrinsics.checkNotNullParameter(contextRequireContext, "");
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        if (ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            BranchOfficeActivity.Companion companion = BranchOfficeActivity.INSTANCE;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            BranchOfficeActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, null);
            return;
        }
        refreshVisibility refreshvisibility = this;
        String string = getString(R.string.error_message_location_gps_disabled);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Intrinsics.checkNotNullParameter(refreshvisibility, "");
        Intrinsics.checkNotNullParameter(string, "");
        BaseActivity baseActivity = (BaseActivity) refreshvisibility.getContext();
        if (baseActivity != null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    private final void INotificationSideChannelStubProxy() {
        final String string;
        AntreanMenuConfig antreanMenuConfig;
        AntreanMenuConfig antreanMenuConfig2;
        AntreanMenuConfig antreanMenuConfig3;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String strB = getMaxImages.b();
        if (strB.length() > 0) {
            try {
                AntreanMenuConfig antreanMenuConfig4 = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                this.TuitionPaymentFragmentbindingInflater1 = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                String string2 = ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL", "");
                string = ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "");
                if (antreanMenuConfig4.getStatus()) {
                    antreanMenuConfig4.getLinkAntreanKlaim();
                }
                if (string2.length() <= 0 && (((antreanMenuConfig2 = this.TuitionPaymentFragmentbindingInflater1) == null || antreanMenuConfig2.getLinkAntreanKlaim() == null) && (antreanMenuConfig3 = this.TuitionPaymentFragmentbindingInflater1) != null)) {
                    antreanMenuConfig3.getLink();
                }
                if (string.length() <= 0 && ((antreanMenuConfig = this.TuitionPaymentFragmentbindingInflater1) == null || (string = antreanMenuConfig.getLinkAntreanInformasi()) == null)) {
                    AntreanMenuConfig antreanMenuConfig5 = this.TuitionPaymentFragmentbindingInflater1;
                    string = antreanMenuConfig5 != null ? antreanMenuConfig5.getLink() : null;
                    if (string == null) {
                        string = "";
                    }
                }
            } catch (Exception unused) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal memuat konfigurasi antrean", 0).show();
                return;
            }
        } else {
            string = "";
        }
        getActionBarHideOffset.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = getActionBarHideOffset.INSTANCE;
        getActionBarHideOffset getactionbarhideoffsetTuitionPaymentFragmentbindingInflater1 = getActionBarHideOffset.Companion.TuitionPaymentFragmentbindingInflater1((Function0<Unit>) new Function0() { // from class: MenuView
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return refreshVisibility.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }, (Function0<Unit>) new Function0() { // from class: getParentMenu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, string);
            }
        });
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        getactionbarhideoffsetTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, "QueueingBottomSheetFragment");
    }

    private final void INotificationSideChannelStub() {
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String strMediaBrowserCompatCustomActionCallback = getMaxImages.MediaBrowserCompatCustomActionCallback();
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        String strMediaBrowserCompatCustomActionResultReceiver = getMaxImages.MediaBrowserCompatCustomActionResultReceiver();
        ActionBarContainer.Companion tuitionPaymentFragmentbindingInflater1 = ActionBarContainer.INSTANCE;
        ActionBarContainer actionBarContainerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ActionBarContainer.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: animateToVisibility
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        }, strMediaBrowserCompatCustomActionCallback, strMediaBrowserCompatCustomActionResultReceiver);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(actionBarContainerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            actionBarContainerTuitionPaymentFragmentspecialinlinedviewModeldefault3.show(supportFragmentManager, actionBarContainerTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        if (Intrinsics.areEqual(str, BpjsServiceEnum.REGISTRATION.getType())) {
            return "registration_non_salaried_worker";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.ECARD.getType())) {
            return "view_menu_digital_card";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PROMO.getType())) {
            return "view_menu_promo";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.TUITION.getType())) {
            return "view_menu_tuition";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.ADDITIONAL_SERVICES.getType())) {
            return "view_menu_additional_services";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PARTNER.getType())) {
            return "view_menu_partner";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PROGRAM_INFO.getType())) {
            return "view_menu_info_program";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.REPORTING.getType())) {
            return "view_menu_reporting";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.BRANCH_OFFICE.getType())) {
            return "view_menu_branch_office";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.COMPLAINT.getType())) {
            return "view_menu_complaint";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.HEREGISTRATION.getType())) {
            return "view_menu_heregistration_pengkinian";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.SYARIAH.getType())) {
            return "view_menu_syariah";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.SUPPORT.getType())) {
            return "view_menu_support";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.DANASIAGA.getType())) {
            return "view_menu_danasiaga";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.INVESTASI.getType())) {
            return "view_menu_investasi";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.STREAMING.getType())) {
            return "view_menu_streaming";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.TOPUP.getType())) {
            return "view_menu_topup";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.JP_PERIODICALLY.getType())) {
            return "view_menu_jp_periodically";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.OPEN_BANKING.getType())) {
            return "view_menu_open_banking";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.OTHER.getType())) {
            return "view_menu_other";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.PODCAST.getType())) {
            return "view_menu_podcast";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.SCHOLARSHIP.getType())) {
            return "view_menu_scholarship";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.BALANCE_CHECK.getType())) {
            return "view_menu_balance_check";
        }
        if (Intrinsics.areEqual(str, BpjsServiceEnum.CLAIM_OLD_DAY_SECURITY.getType())) {
            return "view_menu_claim_old_day_security";
        }
        return Intrinsics.areEqual(str, BpjsServiceEnum.QUEUEING.getType()) ? "view_menu_queueing" : "";
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_name", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    private final void TuitionPaymentFragmentbindingInflater1(String str) {
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_error_process, "", str, string, null, 112);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static final class a implements getStringOrNull.b {
        a() {
        }

        @Override // getStringOrNull.b
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            refreshVisibility.getInterfaceDescriptor(refreshVisibility.this);
        }
    }

    public static final class g implements ViewPager.OnPageChangeListener {
        private /* synthetic */ List<Banner> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ refreshVisibility TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
        }

        g(List<Banner> list, refreshVisibility refreshvisibility) {
            this.TuitionPaymentFragmentbindingInflater1 = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = refreshvisibility;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            ViewPortBuilder.asInterface();
            try {
                if (i >= this.TuitionPaymentFragmentbindingInflater1.size() + 1) {
                    refreshVisibility.INotificationSideChannelStub(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).dotsIndicatorBanner.setSelection(0);
                } else {
                    refreshVisibility.INotificationSideChannelStub(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1).dotsIndicatorBanner.setSelection(i - 1);
                }
            } finally {
                ViewPortBuilder.d();
            }
        }
    }

    private final void b(String str) {
        onNestedPreScroll.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = onNestedPreScroll.INSTANCE;
        onNestedPreScroll onnestedprescrollTuitionPaymentFragmentbindingInflater1 = onNestedPreScroll.Companion.TuitionPaymentFragmentbindingInflater1(str, new Function0() { // from class: isOverflowMenuShowing
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function0() { // from class: isOverflowMenuShowPending
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            onnestedprescrollTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, onnestedprescrollTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static final class asBinder implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
        }

        asBinder() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            ViewPortBuilder.asInterface();
            try {
                refreshVisibility.RemoteActionCompatParcelizer(refreshVisibility.this).TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(Integer.valueOf(i));
            } finally {
                ViewPortBuilder.d();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LoopingViewPager loopingViewPager = asInterface().vpPromoBanner;
        loopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        loopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault3.removeCallbacks(loopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LoopingViewPager loopingViewPager = asInterface().vpPromoBanner;
        loopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        loopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault3.postDelayed(loopingViewPager.TuitionPaymentFragmentspecialinlinedviewModeldefault2, loopingViewPager.TuitionPaymentFragmentbindingInflater1);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ItemDecoration {
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 13;
        private final int b = 4;

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view) + 1;
            rect.bottom = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * Resources.getSystem().getDisplayMetrics().density);
            int i = childAdapterPosition % this.b;
            if (i == 0) {
                rect.right = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * Resources.getSystem().getDisplayMetrics().density);
                rect.left = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2) * Resources.getSystem().getDisplayMetrics().density);
            } else if (i == 1) {
                rect.left = (int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * Resources.getSystem().getDisplayMetrics().density);
                rect.right = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2) * Resources.getSystem().getDisplayMetrics().density);
            } else {
                rect.left = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2) * Resources.getSystem().getDisplayMetrics().density);
                rect.right = (int) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2) * Resources.getSystem().getDisplayMetrics().density);
            }
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVisibility refreshvisibility, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        FragmentActivity activity = refreshvisibility.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_other_program", "view_other_program"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("view_other_program", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_other_program", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_other_program", mapMutableMapOf);
        new ArrayList().addAll(refreshvisibility.d());
        ProgramActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ProgramActivity.INSTANCE;
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        List<ProgramInfo> listD = refreshvisibility.d();
        Intrinsics.checkNotNull(listD, "");
        ProgramActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (ArrayList) listD, ProgramActivity.ProgramDetailType.OPEN_PROGRAM_MENU);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(refreshVisibility refreshvisibility, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            OldDaySecurityActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = OldDaySecurityActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            OldDaySecurityActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(refreshVisibility refreshvisibility) {
        AsikActiveParticipantSubmissionCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, AsikPointer.KLAIM.getType());
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVisibility refreshvisibility, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        FragmentActivity activity = refreshvisibility.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_queueing_service", "view_queueing_service"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("view_queueing_service", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_queueing_service", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_queueing_service", mapMutableMapOf);
        refreshvisibility.INotificationSideChannelStubProxy();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final refreshVisibility refreshvisibility, String str) {
        FragmentActivity activity = refreshvisibility.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_queueing_type", "informasi_pengaduan"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("view_queueing_informasi_pengaduan", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_queueing_informasi_pengaduan", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_queueing_informasi_pengaduan", mapMutableMapOf);
        if (str.length() > 0) {
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = refreshvisibility.getString(R.string.label_queueing_informasi);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, string, 0, null, false, 56);
        } else {
            refreshvisibility.IconCompatParcelizer();
            User user = (User) refreshvisibility.connect.getValue();
            if (user == null) {
                refreshvisibility.write();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Data user tidak ditemukan", 0).show();
            } else {
                String str2 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str2 == null) {
                    str2 = "";
                }
                AntrianOnlineUrlRequest antrianOnlineUrlRequest = new AntrianOnlineUrlRequest(str2, "", "INFOPENGADUAN", "");
                ((getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(refreshvisibility.getViewLifecycleOwner(), new asInterface(new Function1() { // from class: MenuViewItemView
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return refreshVisibility.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
                    }
                }));
                ((getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(antrianOnlineUrlRequest);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVisibility refreshvisibility, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity fragmentActivityRequireActivity = refreshvisibility.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        FragmentActivity fragmentActivity = fragmentActivityRequireActivity;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        WebviewFaqCustomActivity.Companion companion = WebviewFaqCustomActivity.INSTANCE;
        WebviewFaqCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragmentActivity, str, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(refreshVisibility refreshvisibility, List list, Integer num) {
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        if (iIntValue >= list.size() + 1) {
            refreshvisibility.asInterface().dotsIndicatorBanner.setSelection(0);
        } else {
            refreshvisibility.asInterface().dotsIndicatorBanner.setSelection(iIntValue - 1);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVisibility refreshvisibility) {
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.JP_PERIODICALLY.getType());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(refreshVisibility refreshvisibility) {
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVisibility refreshvisibility) {
        ((flushLollipops) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BannerRequest());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(refreshVisibility refreshvisibility, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            FragmentActivity activity = refreshvisibility.getActivity();
            Intrinsics.checkNotNull(activity, "");
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_all_promo", "view_all_promo"));
            Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
            Intrinsics.checkNotNullParameter("view_all_promo", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("view_all_promo", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_all_promo", mapMutableMapOf);
            PromoActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = PromoActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            PromoActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVisibility refreshvisibility, ActivityResult activityResult) {
        User userAsBinder;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == 501) {
            ((CustomTabsSession1ExternalSyntheticLambda1) refreshvisibility.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(Boolean.TRUE);
            getHeaderTitle getheadertitle = (getHeaderTitle) refreshvisibility.cancel.getValue();
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            getheadertitle.b(new MotionCheckConnectRequest(str != null ? str : ""));
            return;
        }
        if (activityResult.getResultCode() != 502 || (userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder()) == null) {
            return;
        }
        CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1 = (CustomTabsSession1ExternalSyntheticLambda1) refreshvisibility.onTransact.getValue();
        String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = str2 == null ? "" : str2;
        String str4 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str5 = str4 == null ? "" : str4;
        String str6 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str7 = str6 == null ? "" : str6;
        String str8 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str9 = str8 == null ? "" : str8;
        String str10 = userAsBinder.b;
        customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new MultiBillerTransactionRequest(str3, str5, str7, str9, str10 == null ? "" : str10));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(refreshVisibility refreshvisibility, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            JkpMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = JkpMainActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            JkpMainActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void a(refreshVisibility refreshvisibility, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            JkmServiceActivity.Companion tuitionPaymentFragmentbindingInflater1 = JkmServiceActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            JkmServiceActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void asInterface(refreshVisibility refreshvisibility, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            JkkServiceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = JkkServiceActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            JkkServiceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.SCHOLARSHIP.getType());
    }

    public static /* synthetic */ void g(refreshVisibility refreshvisibility, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = JpnMainActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext);
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit asInterface(refreshVisibility refreshvisibility) {
        BaseActivity baseActivity = refreshvisibility.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean b(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.JP_PERIODICALLY.getType());
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        return Intrinsics.areEqual(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3, BpjsServiceEnum.SCHOLARSHIP.getType());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVisibility refreshvisibility, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(refreshVisibility refreshvisibility) {
        BaseActivity baseActivity = refreshvisibility.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(refreshVisibility refreshvisibility, ProgramInfo programInfo) {
        Intrinsics.checkNotNullParameter(programInfo, "");
        String str = programInfo.b;
        int iHashCode = str.hashCode();
        if (iHashCode != 73430) {
            if (iHashCode != 73514) {
                if (iHashCode == 73516 && str.equals("JKM")) {
                    JkmServiceActivity.Companion tuitionPaymentFragmentbindingInflater1 = JkmServiceActivity.INSTANCE;
                    Context contextRequireContext = refreshvisibility.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    JkmServiceActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext);
                } else {
                    JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = JpnMainActivity.INSTANCE;
                    Context contextRequireContext2 = refreshvisibility.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext2);
                }
            } else if (str.equals("JKK")) {
                JkkServiceActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = JkkServiceActivity.INSTANCE;
                Context contextRequireContext3 = refreshvisibility.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                JkkServiceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext3);
            } else {
                JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = JpnMainActivity.INSTANCE;
                Context contextRequireContext4 = refreshvisibility.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext4);
            }
        } else if (str.equals("JHT")) {
            OldDaySecurityActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault4 = OldDaySecurityActivity.INSTANCE;
            Context contextRequireContext5 = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            OldDaySecurityActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext5);
        } else {
            JpnMainActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault5 = JpnMainActivity.INSTANCE;
            Context contextRequireContext6 = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
            JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext6);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getCaptureResult TuitionPaymentFragmentspecialinlinedviewModeldefault3(final refreshVisibility refreshvisibility) {
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new getCaptureResult(contextRequireContext, CollectionsKt.take(refreshvisibility.d(), 2), new Function1() { // from class: measureChildView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ProgramInfo) obj);
            }
        });
    }

    private static boolean TuitionPaymentFragmentbindingInflater1(User user, String str) {
        List<FiturList> list;
        Intrinsics.checkNotNullParameter(str, "");
        if (user != null && (list = user.getInterfaceDescriptor) != null) {
            List<FiturList> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((FiturList) it.next()).getKodeFitur(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ setActionBarHideOffset INotificationSideChannel(final refreshVisibility refreshvisibility) {
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        boolean zOnConnectionFailed = getMaxImages.onConnectionFailed();
        User user = (User) refreshvisibility.connect.getValue();
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(user != null ? user.RemoteActionCompatParcelizer : null), "Y");
        User user2 = (User) refreshvisibility.connect.getValue();
        boolean zAreEqual2 = Intrinsics.areEqual(String.valueOf(user2 != null ? user2.INotificationSideChannelStubProxy : null), "Y");
        boolean zTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1((User) refreshvisibility.connect.getValue(), "F001");
        boolean zTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1((User) refreshvisibility.connect.getValue(), "F002");
        String type = BpjsServiceEnum.PROGRAM_INFO.getType();
        String string = refreshvisibility.getString(R.string.label_program_info);
        Intrinsics.checkNotNullExpressionValue(string, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type, string, R.drawable.ic_program_info);
        String type2 = BpjsServiceEnum.TUITION.getType();
        String string2 = refreshvisibility.getString(R.string.label_payment_autodebit);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs5 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type2, string2, R.drawable.ic_tuition);
        String type3 = BpjsServiceEnum.REGISTRATION.getType();
        String string3 = refreshvisibility.getString(R.string.label_registration_nonsalaried_worker_dashboard_menu);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs6 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type3, string3, R.drawable.ic_informal_participant);
        String type4 = BpjsServiceEnum.HEREGISTRATION.getType();
        String string4 = refreshvisibility.getString(R.string.label_asik_program);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs7 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type4, string4, R.drawable.ic_pengkinian);
        String type5 = BpjsServiceEnum.BALANCE_CHECK.getType();
        String string5 = refreshvisibility.getString(R.string.label_please_check_your_balance_menu);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs8 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type5, string5, R.drawable.ic_cek_saldo);
        String type6 = BpjsServiceEnum.JP_PERIODICALLY.getType();
        String string6 = refreshvisibility.getString(R.string.label_jp_periodically);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs9 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type6, string6, R.drawable.ic_vocation);
        String type7 = BpjsServiceEnum.SCHOLARSHIP.getType();
        String string7 = refreshvisibility.getString(R.string.label_scholarship);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs10 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type7, string7, R.drawable.ic_scholarship);
        String type8 = BpjsServiceEnum.CLAIM_OLD_DAY_SECURITY.getType();
        String string8 = refreshvisibility.getString(R.string.label_jht_claim_request);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs11 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type8, string8, R.drawable.ic_klaim_jht);
        String type9 = BpjsServiceEnum.PODCAST.getType();
        String string9 = refreshvisibility.getString(R.string.label_edu_video);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs12 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type9, string9, R.drawable.ic_video_edu);
        String type10 = BpjsServiceEnum.ADDITIONAL_SERVICES.getType();
        String string10 = refreshvisibility.getString(R.string.label_additional_services);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs13 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type10, string10, R.drawable.ic_mlt_jmo);
        String type11 = BpjsServiceEnum.SUPPORT.getType();
        String string11 = refreshvisibility.getString(R.string.menu_help);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs14 = new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type11, string11, R.drawable.ic_support);
        String type12 = BpjsServiceEnum.OTHER.getType();
        String string12 = refreshvisibility.getString(R.string.menu_other);
        Intrinsics.checkNotNullExpressionValue(string12, "");
        List listMutableListOf = CollectionsKt.mutableListOf(r8lambdai2xi7mochmmaz9qzzewheaxs4, r8lambdai2xi7mochmmaz9qzzewheaxs5, r8lambdai2xi7mochmmaz9qzzewheaxs6, r8lambdai2xi7mochmmaz9qzzewheaxs7, r8lambdai2xi7mochmmaz9qzzewheaxs8, r8lambdai2xi7mochmmaz9qzzewheaxs9, r8lambdai2xi7mochmmaz9qzzewheaxs10, r8lambdai2xi7mochmmaz9qzzewheaxs11, r8lambdai2xi7mochmmaz9qzzewheaxs12, r8lambdai2xi7mochmmaz9qzzewheaxs13, r8lambdai2xi7mochmmaz9qzzewheaxs14, new r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(type12, string12, R.drawable.ic_other));
        if (!zAreEqual || !zAreEqual2 || !zOnConnectionFailed || !zTuitionPaymentFragmentbindingInflater1 || !zTuitionPaymentFragmentbindingInflater2) {
            if (zAreEqual && zAreEqual2 && zOnConnectionFailed && !zTuitionPaymentFragmentbindingInflater1 && zTuitionPaymentFragmentbindingInflater2) {
                final Function1 function1 = new Function1() { // from class: AbsActionBarViewVisibilityAnimListener
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(refreshVisibility.b((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: setupAnimatorToVisibility
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function1.invoke(obj)).booleanValue();
                    }
                });
            } else if (zAreEqual && zAreEqual2 && zOnConnectionFailed && zTuitionPaymentFragmentbindingInflater1 && !zTuitionPaymentFragmentbindingInflater2) {
                final Function1 function2 = new Function1() { // from class: MenuItemWrapperICSOnActionExpandListenerWrapper
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: MenuPopupHelper
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function2.invoke(obj)).booleanValue();
                    }
                });
            } else {
                final Function1 function3 = new Function1() { // from class: StandardMenuPopup
                    public static int TuitionPaymentFragmentbindingInflater1 = 797375568;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                };
                listMutableListOf.removeIf(new Predicate() { // from class: setHeaderTitle
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) function3.invoke(obj)).booleanValue();
                    }
                });
                listMutableListOf.removeIf(new setVisibility(new Function1() { // from class: getContentHeight
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1((r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj));
                    }
                }));
            }
        }
        return new setActionBarHideOffset(contextRequireContext, listMutableListOf, new Function1() { // from class: getAnimatedVisibility
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Type inference failed for: r2v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v35, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.String] */
    public static /* synthetic */ Unit b(final refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        boolean z;
        final String str2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
            str = "loading_check_eligibility_claim_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            JhtClaimEligibility jhtClaimEligibility = (JhtClaimEligibility) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            getMaxImages.run();
            getMaxImages getmaximages2 = getMaxImages.INSTANCE;
            String strB = getMaxImages.b();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            if (strB.length() > 0) {
                try {
                    AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) new Gson().fromJson(strB, AntreanMenuConfig.class);
                    if (antreanMenuConfig.getStatus()) {
                        try {
                            objectRef.element = antreanMenuConfig.getLinkAntreanKlaim();
                        } catch (Exception unused) {
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Exception unused2) {
                }
            } else {
                z = false;
            }
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = ((getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL", "");
            if (((CharSequence) objectRef2.element).length() == 0) {
                User user = (User) refreshvisibility.connect.getValue();
                if (user != null) {
                    String str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (str3 == null) {
                        str3 = "";
                    }
                    ((getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(new AntrianOnlineUrlRequest(str3, "", "KLAIM", ""));
                }
                getMaxImages getmaximages3 = getMaxImages.INSTANCE;
                objectRef2.element = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -644713709, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 644713713);
            }
            String str4 = jhtClaimEligibility.TuitionPaymentFragmentbindingInflater1;
            if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_100.getValue())) {
                if (z && ((CharSequence) objectRef.element).length() > 0) {
                    str2 = (String) objectRef.element;
                } else {
                    str2 = (String) objectRef2.element;
                }
                String string = refreshvisibility.getString(R.string.action_booking_antrean_online);
                Intrinsics.checkNotNullExpressionValue(string, "");
                refreshvisibility.TuitionPaymentFragmentbindingInflater1(R.drawable.img_digital_claim, "Klaim JHT dapat Dilakukan Secara Digital", "Anda dapat mengajukan klaim JHT langsung melalui JMO tanpa datang ke kantor cabang. Prosesnya lebih cepat dengan cukup mengunggah dokumen melalui aplikasi.", "Klaim Sekarang", string, new Function0() { // from class: SubMenuBuilder
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return refreshVisibility.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }, new Function0() { // from class: setHeaderIcon
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return refreshVisibility.b(this.TuitionPaymentFragmentbindingInflater1, str2);
                    }
                });
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_109.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_110.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_111.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_112.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_114.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_115.getValue())) {
                String string2 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String str5 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb = new StringBuilder("Pengajuan klaim JHT Anda tidak dapat dilanjutkan pada aplikasi JMO karena kartu Anda dalam proses ");
                sb.append(str5);
                sb.append(". Untuk informasi lebih lanjut silakan menghubungi perusahaan Anda atau Kantor Cabang terdekat di kota Anda.");
                String string3 = sb.toString();
                String string4 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string2, string3, string4, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_104.getValue())) {
                String string5 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                String str6 = jhtClaimEligibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb2 = new StringBuilder("Pengajuan klaim JHT Anda tidak dapat dilanjutkan pada aplikasi JMO karena masih dalam proses klaim JHT di ");
                sb2.append(str6);
                sb2.append(". Untuk informasi lebih lanjut silakan menghubungi Kantor Cabang terdekat di kota Anda.");
                String string6 = sb2.toString();
                String string7 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string5, string6, string7, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_102.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_105.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_107.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_108.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_125.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_126.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_130.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_132.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_133.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_140.getValue())) {
                if (z && ((CharSequence) objectRef.element).length() > 0) {
                    String string8 = refreshvisibility.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string8, "");
                    String str7 = jhtClaimEligibility.b;
                    String string9 = refreshvisibility.getString(R.string.action_booking_antrean_online);
                    Intrinsics.checkNotNullExpressionValue(string9, "");
                    String string10 = refreshvisibility.getString(R.string.action_return);
                    Intrinsics.checkNotNullExpressionValue(string10, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string8, str7, string9, string10, new Function0() { // from class: StandardMenuPopup2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, objectRef);
                        }
                    }, new Function0() { // from class: AbsActionBarView
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return refreshVisibility.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    }, 1);
                } else {
                    String string11 = refreshvisibility.getString(R.string.action_information);
                    Intrinsics.checkNotNullExpressionValue(string11, "");
                    String str8 = jhtClaimEligibility.b;
                    String string12 = refreshvisibility.getString(R.string.action_booking_antrean_online);
                    Intrinsics.checkNotNullExpressionValue(string12, "");
                    String string13 = refreshvisibility.getString(R.string.action_return);
                    Intrinsics.checkNotNullExpressionValue(string13, "");
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string11, str8, string12, string13, new Function0() { // from class: setHeaderView
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return refreshVisibility.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, objectRef2);
                        }
                    }, new Function0() { // from class: access001
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return refreshVisibility.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        }
                    }, 1);
                }
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_106.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_137.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_138.getValue())) {
                String string14 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string14, "");
                String str9 = jhtClaimEligibility.b;
                String string15 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string15, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string14, str9, string15, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_113.getValue())) {
                String string16 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string16, "");
                String string17 = refreshvisibility.getString(R.string.message_already_posting);
                Intrinsics.checkNotNullExpressionValue(string17, "");
                String string18 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string18, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string16, string17, string18, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_103.getValue())) {
                String string19 = refreshvisibility.getString(R.string.label_ineligible_for_old_day_security);
                Intrinsics.checkNotNullExpressionValue(string19, "");
                String string20 = refreshvisibility.getString(R.string.message_still_active_memberships);
                Intrinsics.checkNotNullExpressionValue(string20, "");
                String string21 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string21, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string19, string20, string21, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_101.getValue())) {
                String string22 = refreshvisibility.getString(R.string.label_ineligible_for_old_day_security);
                Intrinsics.checkNotNullExpressionValue(string22, "");
                String str10 = jhtClaimEligibility.b;
                String string23 = refreshvisibility.getString(R.string.action_asik_program);
                Intrinsics.checkNotNullExpressionValue(string23, "");
                String string24 = refreshvisibility.getString(R.string.action_return);
                Intrinsics.checkNotNullExpressionValue(string24, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string22, str10, string23, string24, new Function0() { // from class: SubMenuWrapperICS
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return refreshVisibility.b(this.b);
                    }
                }, new Function0() { // from class: canShowOverflowMenu
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return refreshVisibility.notify(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    }
                }, 1);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_117.getValue()) || Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_118.getValue())) {
                String string25 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string25, "");
                String string26 = refreshvisibility.getString(R.string.message_full_claim);
                Intrinsics.checkNotNullExpressionValue(string26, "");
                String string27 = refreshvisibility.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string27, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string25, string26, string27, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_119.getValue())) {
                String string28 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string28, "");
                String string29 = refreshvisibility.getString(R.string.message_one_month_notice);
                Intrinsics.checkNotNullExpressionValue(string29, "");
                String string30 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string30, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string28, string29, string30, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_121.getValue())) {
                String string31 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string31, "");
                String string32 = refreshvisibility.getString(R.string.message_claim_kla1);
                Intrinsics.checkNotNullExpressionValue(string32, "");
                String string33 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string33, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string31, string32, string33, null, null, null, 113);
            } else if (Intrinsics.areEqual(str4, JhtEligibilityStatus.STATUS_CODE_130.getValue())) {
                String string34 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string34, "");
                String str11 = jhtClaimEligibility.b;
                String string35 = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string35, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string34, str11, string35, null, null, null, 113);
            } else {
                String string36 = refreshvisibility.getString(R.string.label_ineligible_for_old_day_security);
                Intrinsics.checkNotNullExpressionValue(string36, "");
                String str12 = jhtClaimEligibility.b;
                String string37 = refreshvisibility.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string37, "");
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshvisibility, 0, string36, str12, string37, null, null, null, 113);
            }
            str = "success_check_eligibility_claim_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "layanan ini tersedia pada pukul", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "fitur ini sedang dalam peningkatan kapasitas. Silakan mengajukan Klaim JHT melalui", false, 2, (Object) null)) {
                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.INSTANCE;
                String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string38 = refreshvisibility.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string38, "");
                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1 = lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl.Companion.TuitionPaymentFragmentbindingInflater1(strValueOf, string38);
                refreshvisibility.notify = lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1;
                FragmentManager childFragmentManager = refreshvisibility.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimplTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                lambdaconfigAndCloseIfNeeded0androidxcameracamera2internalCamera2CameraImpl lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl = refreshvisibility.notify;
                if (lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl != null) {
                    lambdaconfigandcloseifneeded0androidxcameracamera2internalcamera2cameraimpl.a = refreshvisibility.new b();
                }
            } else {
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String string39 = refreshvisibility.getString(R.string.action_information);
                Intrinsics.checkNotNullExpressionValue(string39, "");
                String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string40 = refreshvisibility.getString(R.string.action_back);
                Intrinsics.checkNotNullExpressionValue(string40, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string39, strValueOf2, string40, null, 112);
                refreshvisibility.INotificationSideChannelStubProxy = getstringornullB;
                if (getstringornullB != null) {
                    FragmentManager childFragmentManager2 = refreshvisibility.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager2, "");
                    if (childFragmentManager2.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager2, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }
                getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
                if (getstringornull != null) {
                    getstringornull.INotificationSideChannel = refreshvisibility.new d();
                }
            }
            str = "failure_check_eligibility_claim_result";
        } else {
            refreshvisibility.write();
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_eligibility_claim_result", str));
        Intrinsics.checkNotNullParameter("check_eligibility_claim_result", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("check_eligibility_claim_result", mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ access000 RemoteActionCompatParcelizer(refreshVisibility refreshvisibility) {
        return (access000) refreshvisibility.cancelAll.getValue();
    }

    public static final /* synthetic */ void getInterfaceDescriptor(refreshVisibility refreshvisibility) {
        IntegerRes integerRes = (IntegerRes) refreshvisibility.write.getValue();
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String strValueOf = String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        integerRes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ChangeDataFirstVerificationRequest(strValueOf, String.valueOf(userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null)));
    }

    private final List<ProgramInfo> d() {
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        List<ProgramInfo> listEmptyList = userAsBinder != null ? userAsBinder.INotificationSideChannelStub : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return Camera2CameraControlExternalSyntheticLambda6.TuitionPaymentFragmentbindingInflater1(listEmptyList);
    }

    public static final /* synthetic */ getStreamUseCaseSupportedCombinationList INotificationSideChannelDefault(refreshVisibility refreshvisibility) {
        return (getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        String string = ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).asBinder.getString("STATUS_ANTRIAN_ONLINE_URL", "");
        String string2 = ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_MESSAGE", "");
        if (Intrinsics.areEqual(string, "0")) {
            ((Camera2CameraControlImplExternalSyntheticLambda4) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return;
        }
        if (Intrinsics.areEqual(string, "-2")) {
            String string3 = getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = getString(R.string.label_add_kpj_simple);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String string5 = getString(R.string.action_return);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, 0, string3, string2, string4, string5, new Function0() { // from class: onPrepareSubMenu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return refreshVisibility.d(this.b);
                }
            }, new Function0() { // from class: onMenuItemActionCollapse
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }, 1);
            return;
        }
        refreshVisibility refreshvisibility = this;
        Intrinsics.checkNotNullParameter(refreshvisibility, "");
        Intrinsics.checkNotNullParameter(string2, "");
        BaseActivity baseActivity = (BaseActivity) refreshvisibility.getContext();
        if (baseActivity != null) {
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                refreshvisibility.write();
                ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (scholarPersonDetail != null) {
                    ((getRatioByPercentage) refreshvisibility.getInterfaceDescriptor.getValue()).TuitionPaymentFragmentbindingInflater1.setValue(scholarPersonDetail);
                    getRatioByPercentage getratiobypercentage = (getRatioByPercentage) refreshvisibility.getInterfaceDescriptor.getValue();
                    User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str = null;
                    Object[] objArr = 0;
                    String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipEligibleRequest(str2 != null ? str2 : "", str, 2, objArr == true ? 1 : 0));
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                refreshvisibility.write();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager childFragmentManager = refreshvisibility.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        refreshVisibility refreshvisibility = this;
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.asInterface.getValue()).TuitionPaymentFragmentbindingInflater1.observe(refreshvisibility, new asInterface(new Function1() { // from class: toMenuAdapter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getHeaderTitle) this.cancel.getValue()).b.observe(refreshvisibility, new asInterface(new Function1() { // from class: MenuPopup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.a(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((CustomTabsSession1ExternalSyntheticLambda1) this.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: setEpicenterBounds
            private static final byte[] $$c = {42, -104, -68, 105};
            private static final int $$d = 44;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {90, 46, 113, 8};
            private static final int $$b = 156;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59862, 59399, 59892, 59402, 59402, 59396, 59895, 59892, 59861, 59398, 59400, 59893, 59892, 59397, 59894, 59892, 59395, 59395, 59394, 59758, 59855, 59828, 59851, 59852, 59855, 59831, 59814, 59839, 59842, 59832, 59812, 59848, 59855, 59852, 59852, 59829, 59854, 59801, 59424, 59430, 59428, 59455, 59451, 59425, 59398, 59417, 59454, 59423, 59894, 59411, 59436, 59428, 59449, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59746, 59746, 59768, 59746, 59753, 59759, 59744, 59739, 59738, 59773, 59773, 59738, 59718, 59747, 59744, 59771, 59746, 59747, 59718, 59714, 59759, 59752, 59744, 59749, 59712, 59738, 59768, 59746, 59753, 59757, 59744, 59745, 59712, 59699, 59748, 59749, 59676, 59714, 59759, 59747, 59756, 59754, 59756, 59746, 59753, 59753, 59759, 59753, 59746, 59768, 59750, 59713, 59718, 59747, 59746, 59771, 59744, 59747, 59718, 59738, 59773, 59773, 59738, 59714, 59746, 59771, 59770, 59708, 59698, 59773, 59773, 59738, 59718, 59747, 59744, 59771, 59746, 59747, 59718, 59714, 59759, 59752, 59744, 59749, 59712, 59738, 59768, 59746, 59753, 59757, 59744, 59745, 59712, 59738, 59768, 59746, 59753, 59757, 59744, 59745, 59752, 59756, 59749, 59717};

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 4
                    int r7 = 3 - r7
                    int r8 = r8 * 4
                    int r0 = 1 - r8
                    int r6 = r6 * 3
                    int r6 = r6 + 98
                    byte[] r1 = defpackage.setEpicenterBounds.$$a
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r1 != 0) goto L19
                    r3 = r7
                    r7 = r8
                    r4 = r2
                    goto L31
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r6
                    int r7 = r7 + 1
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r8) goto L2b
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L2b:
                    r3 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r3
                    r3 = r5
                L31:
                    int r6 = -r6
                    int r6 = r6 + r7
                    r7 = r3
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setEpicenterBounds.c(byte, int, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    refreshVisibility.onTransact(this.b, (VirtualCameraAdapter1) obj);
                    throw null;
                }
                Unit unitOnTransact = refreshVisibility.onTransact(this.b, (VirtualCameraAdapter1) obj);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 25 / 0;
                }
                return unitOnTransact;
            }

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i = 2;
                int i2 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i3 = 0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 83;
                        $10 = i9 % 128;
                        if (i9 % i != 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i3] = Integer.valueOf(cArr[i8]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) i3;
                                    byte b3 = (byte) (b2 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) - 1), 1270 - KeyEvent.keyCodeFromString(""), Gravity.getAbsoluteGravity(i3, i3) + 18, 407021364, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                                }
                                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = (byte) (b4 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 1271, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 18, 407021364, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                                }
                                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i8++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i = 2;
                        i3 = 0;
                        j = 0;
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr != null) {
                    char[] cArr4 = new char[i5];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i5) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i10 = $11 + 105;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            int i12 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3224, ImageFormat.getBitsPerPixel(0) + 14, 2133916302, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        } else {
                            int i13 = setvideostabilizationmode.b;
                            Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944), 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22 - ExpandableListView.getPackedPositionChild(0L), 387247676, false, $$e(b8, b9, (byte) (b9 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[setvideostabilizationmode.b];
                        Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (41241 - (ViewConfiguration.getEdgeSlop() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1705, 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1434471773, false, $$e(b10, (byte) (b10 | 6), b10), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    char[] cArr5 = new char[i5];
                    System.arraycopy(cArr3, 0, cArr5, 0, i5);
                    int i14 = i5 - i7;
                    System.arraycopy(cArr5, 0, cArr3, i14, i7);
                    System.arraycopy(cArr5, i7, cArr3, 0, i14);
                }
                if (z) {
                    int i15 = $11 + 59;
                    $10 = i15 % 128;
                    int i16 = 2;
                    int i17 = i15 % 2;
                    char[] cArr6 = new char[i5];
                    setvideostabilizationmode.b = 0;
                    int i18 = $11 + 21;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = 5 % 2;
                    }
                    while (setvideostabilizationmode.b < i5) {
                        int i20 = $10 + 101;
                        $11 = i20 % 128;
                        int i21 = i20 % i16;
                        cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b++;
                        i16 = 2;
                    }
                    cArr3 = cArr6;
                }
                if (i6 > 0) {
                    int i22 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i22;
                        if (setvideostabilizationmode.b >= i5) {
                            break;
                        }
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                        i22 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Code duplicated, block: B:109:0x049b  */
            /* JADX WARN: Code duplicated, block: B:110:0x04a9  */
            /* JADX WARN: Code duplicated, block: B:113:0x04e6  */
            /* JADX WARN: Code duplicated, block: B:114:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:117:0x0563  */
            /* JADX WARN: Code duplicated, block: B:119:0x0594  */
            /* JADX WARN: Code duplicated, block: B:50:0x02ad  */
            /* JADX WARN: Code duplicated, block: B:51:0x02bc A[Catch: Exception -> 0x0443, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0443, blocks: (B:47:0x028b, B:51:0x02bc, B:58:0x031b, B:61:0x032c, B:67:0x0365, B:79:0x03be, B:95:0x0427, B:97:0x042e, B:98:0x0431, B:101:0x0434, B:102:0x043a, B:104:0x043c, B:105:0x0442, B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399, B:54:0x02da, B:57:0x0317, B:55:0x02f2), top: B:138:0x028b, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:54:0x02da A[Catch: all -> 0x043b, TRY_ENTER, TryCatch #5 {all -> 0x043b, blocks: (B:54:0x02da, B:57:0x0317, B:55:0x02f2), top: B:136:0x02d8, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:55:0x02f2 A[Catch: all -> 0x043b, TRY_LEAVE, TryCatch #5 {all -> 0x043b, blocks: (B:54:0x02da, B:57:0x0317, B:55:0x02f2), top: B:136:0x02d8, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x032c A[Catch: Exception -> 0x0443, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0443, blocks: (B:47:0x028b, B:51:0x02bc, B:58:0x031b, B:61:0x032c, B:67:0x0365, B:79:0x03be, B:95:0x0427, B:97:0x042e, B:98:0x0431, B:101:0x0434, B:102:0x043a, B:104:0x043c, B:105:0x0442, B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399, B:54:0x02da, B:57:0x0317, B:55:0x02f2), top: B:138:0x028b, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:63:0x0351  */
            /* JADX WARN: Code duplicated, block: B:65:0x0361  */
            /* JADX WARN: Code duplicated, block: B:66:0x0363  */
            /* JADX WARN: Code duplicated, block: B:67:0x0365 A[Catch: Exception -> 0x0443, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0443, blocks: (B:47:0x028b, B:51:0x02bc, B:58:0x031b, B:61:0x032c, B:67:0x0365, B:79:0x03be, B:95:0x0427, B:97:0x042e, B:98:0x0431, B:101:0x0434, B:102:0x043a, B:104:0x043c, B:105:0x0442, B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399, B:54:0x02da, B:57:0x0317, B:55:0x02f2), top: B:138:0x028b, inners: #2, #5 }] */
            /* JADX WARN: Code duplicated, block: B:70:0x037f A[Catch: all -> 0x0396, TRY_ENTER, TryCatch #2 {all -> 0x0396, blocks: (B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399), top: B:132:0x037d, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:74:0x0399 A[Catch: all -> 0x0396, TRY_LEAVE, TryCatch #2 {all -> 0x0396, blocks: (B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399), top: B:132:0x037d, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:78:0x03ba A[Catch: all -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0396, blocks: (B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399), top: B:132:0x037d, outer: #6 }] */
            /* JADX WARN: Code duplicated, block: B:82:0x03d5  */
            /* JADX WARN: Code duplicated, block: B:84:0x03e0  */
            /* JADX WARN: Code duplicated, block: B:87:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:89:0x03ea A[PHI: r8
  0x03ea: PHI (r8v57 char) = (r8v56 char), (r8v67 char) binds: [B:88:0x03e8, B:85:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:91:0x03fd  */
            /* JADX WARN: Code duplicated, block: B:92:0x0408  */
            /* JADX WARN: Code duplicated, block: B:94:0x0424 A[Catch: all -> 0x0396, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0396, blocks: (B:70:0x037f, B:71:0x0393, B:78:0x03ba, B:94:0x0424, B:74:0x0399), top: B:132:0x037d, outer: #6 }] */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
                int i3;
                int i4;
                int i5;
                String line;
                Object[] objArr;
                String[] strArr;
                Object[] objArr2;
                int i6;
                int i7;
                int i8;
                char c;
                String[] strArr2;
                int i9;
                Object[] objArr3;
                int[] iArr;
                int[] iArr2;
                int[] iArr3;
                int i10;
                int i11;
                int i12;
                char c2;
                int[] iArr4;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                File file;
                FileReader fileReader;
                BufferedReader bufferedReader;
                int i19;
                String line2;
                int i20;
                String str;
                boolean zEquals;
                File file2;
                FileReader fileReader2;
                BufferedReader bufferedReader2;
                int i21;
                String line3;
                Object obj;
                String str2;
                int i22;
                boolean z;
                int i23;
                int i24;
                char c3;
                int i25;
                char c4;
                int i26;
                String[] strArr3;
                char c5;
                int i27;
                Object obj2;
                int i28 = 2 % 2;
                try {
                    Object[] objArr4 = new Object[1];
                    a(new int[]{0, 19, 154, 11}, true, null, objArr4);
                    Object[] objArr5 = new Object[1];
                    a(new int[]{19, 18, 89, 0}, true, new byte[]{1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0}, objArr5);
                    String[] strArr4 = {(String) objArr4[0], (String) objArr5[0]};
                    int i29 = 0;
                    while (true) {
                        if (i29 >= 2) {
                            i5 = i;
                            break;
                        }
                        String str3 = strArr4[i29];
                        Object[] objArr6 = new Object[1];
                        a(new int[]{37, 16, 196, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0}, objArr6);
                        String str4 = (String) objArr6[0];
                        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i30 % 128;
                        int i31 = i30 % 2;
                        Class<?> cls = Class.forName(str4);
                        if (((Boolean) cls.getMethod(str3, new Class[0]).invoke(cls, null)).booleanValue()) {
                            int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i33 = (i32 ^ 49) + ((i32 & 49) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i33 % 128;
                            if (i33 % 2 == 0) {
                                i5 = i ^ 1;
                                break;
                            }
                            i3 = i & (-2);
                            i4 = (~i) & 1;
                            i5 = i3 | i4;
                            break;
                        }
                        i29 = ((i29 | 1) << 1) - (i29 ^ 1);
                    }
                } catch (Exception unused) {
                    i3 = i & (-3);
                    i4 = (~i) & 2;
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char windowTouchSlop = (char) (2419 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iRgb = (-16774371) - Color.rgb(0, 0, 0);
                        int iArgb = 5 - Color.argb(0, 0, 0, 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        c(b2, b3, b3, objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, iRgb, iArgb, -501222268, false, (String) objArr7[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = 554009848;
                    long j2 = -1;
                    long j3 = j ^ j2;
                    long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    long j4 = jElapsedRealtime ^ j2;
                    long j5 = (((long) TypedValues.Custom.TYPE_DIMENSION) * j) + (((long) (-903)) * jLongValue) + (((long) (-1808)) * (((j3 | jElapsedRealtime) ^ j2) | ((j4 | jLongValue) ^ j2)));
                    long j6 = TypedValues.Custom.TYPE_BOOLEAN;
                    long j7 = jLongValue ^ j2;
                    long j8 = j4 | j;
                    long j9 = j5 + (((((j3 | j7) | jElapsedRealtime) ^ j2) | ((j8 | jLongValue) ^ j2)) * j6) + (j6 * (((j7 | jElapsedRealtime) ^ j2) | ((j3 | jLongValue) ^ j2) | (j2 ^ j8))) + ((long) (-1713196534));
                    int i34 = ~i;
                    int i35 = ((int) (j9 >> 32)) & ((-802173004) + ((798900182 | i34) * (-369)) + (((~((-782122967) | i34)) | 655103444) * (-369)) + (((~(782122966 | i)) | 16777216 | (~((-143796739) | i34))) * 369));
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i36 = ~elapsedCpuTime;
                    int i37 = ((int) j9) & ((-1738041619) + (((~(1011680013 | i36)) | (-1029526430) | (~(425546396 | i36))) * (-1136)) + (((~(1011680013 | elapsedCpuTime)) | (~(425546396 | elapsedCpuTime)) | (~((-407699981) | i36))) * (-568)) + (((~(elapsedCpuTime | 1029526429)) | (~(i36 | (-425546397))) | (~((-1011680014) | i36))) * 568));
                    int i38 = (i35 & i37) | (i35 ^ i37);
                    int i39 = (i38 | 1) & (~(i38 & 1));
                    int i40 = (i39 | (-i39)) >> 31;
                    int i41 = (i ^ 10) & (~i40);
                    int i42 = i40 & i;
                    int i43 = (i42 & i41) | (i41 ^ i42);
                    int i44 = ((~i5) & i) | (i5 & i34);
                    int i45 = -i44;
                    int i46 = ((i44 & i45) | (i44 ^ i45)) >> 31;
                    int i47 = (i43 & (~i46)) | (i5 & i46);
                    try {
                        Object[] objArr8 = new Object[1];
                        a(new int[]{53, 40, 0, 14}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0}, objArr8);
                        File file3 = new File((String) objArr8[0]);
                        try {
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                int i48 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i49 = (i48 & 45) + (i48 | 45);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i49 % 128;
                                try {
                                    if (i49 % 2 != 0) {
                                        line = bufferedReader3.readLine();
                                        Object[] objArr9 = new Object[1];
                                        a(new int[]{93, 3, 0, 1}, true, new byte[]{0, 0, 1}, objArr9);
                                        obj2 = objArr9[0];
                                    } else {
                                        line = bufferedReader3.readLine();
                                        Object[] objArr10 = new Object[1];
                                        a(new int[]{93, 3, 0, 1}, false, new byte[]{0, 0, 1}, objArr10);
                                        obj2 = objArr10[0];
                                    }
                                    if (line.equals((String) obj2)) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i51 = ((i50 | 111) << 1) - (i50 ^ 111);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i51 % 128;
                                        if (i51 % 2 != 0) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            int i52 = 47 / 0;
                                        } else {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                        }
                                        int i53 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53 % 128;
                                        int i54 = i53 % 2;
                                    }
                                    Object[] objArr11 = new Object[1];
                                    a(new int[]{96, 31, 0, 1}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, objArr11);
                                    file = new File((String) objArr11[0]);
                                    if (!file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i19 = (i55 ^ 55) + ((i55 & 55) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                                        try {
                                            if (i19 % 2 == 0) {
                                                line2 = bufferedReader.readLine();
                                                Object[] objArr12 = new Object[1];
                                                a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr12);
                                                str = (String) objArr12[0];
                                                i20 = 1;
                                            } else {
                                                line2 = bufferedReader.readLine();
                                                i20 = 1;
                                                Object[] objArr13 = new Object[1];
                                                a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr13);
                                                str = (String) objArr13[0];
                                            }
                                            int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i57 = (i56 ^ 71) + ((i56 & 71) << i20);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i57 % 128;
                                            int i58 = i57 % 2;
                                            zEquals = line2.equals(str);
                                            fileReader.close();
                                            bufferedReader.close();
                                            int i59 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i59 % 128;
                                            int i60 = i59 % 2;
                                            if (zEquals) {
                                                Object[] objArr14 = new Object[1];
                                                a(new int[]{128, 36, 0, 35}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr14);
                                                file2 = new File((String) objArr14[0]);
                                                if (file2.canRead()) {
                                                    fileReader2 = new FileReader(file2);
                                                    bufferedReader2 = new BufferedReader(fileReader2);
                                                    int i61 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    i21 = (i61 ^ 81) + ((i61 & 81) << 1);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                                    try {
                                                        if (i21 % 2 == 0) {
                                                            line3 = bufferedReader2.readLine();
                                                            Object[] objArr15 = new Object[1];
                                                            a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr15);
                                                            obj = objArr15[0];
                                                        } else {
                                                            line3 = bufferedReader2.readLine();
                                                            Object[] objArr16 = new Object[1];
                                                            a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr16);
                                                            obj = objArr16[0];
                                                        }
                                                        str2 = (String) obj;
                                                        i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                                                        if (i22 % 2 != 0) {
                                                            line3.equals(str2);
                                                            fileReader2.close();
                                                            bufferedReader2.close();
                                                            Object obj3 = null;
                                                            obj3.hashCode();
                                                            throw null;
                                                        }
                                                        boolean zEquals2 = line3.equals(str2);
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i63 = (i62 ^ 67) + ((i62 & 67) << 1);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i63 % 128;
                                                        int i64 = i63 % 2;
                                                        z = zEquals2;
                                                    } catch (Throwable th) {
                                                        fileReader2.close();
                                                        bufferedReader2.close();
                                                        throw th;
                                                    }
                                                } else {
                                                    int i65 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    i27 = ((i65 | 71) << 1) - (i65 ^ 71);
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                                                    if (i27 % 2 != 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                }
                                                if (z) {
                                                    i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                                                    i24 = i23 % 128;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24;
                                                    if (i23 % 2 == 0) {
                                                        c3 = 0;
                                                        int i66 = 90 / 0;
                                                        if (line != null) {
                                                            objArr = new Object[2];
                                                            objArr[c3] = new int[1];
                                                            i25 = (i24 & 109) + (i24 | 109);
                                                            int i67 = i25 % 128;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i67;
                                                            if (i25 % 2 != 0) {
                                                                i26 = (~(i & 80)) & (i | 80);
                                                                c4 = 1;
                                                                strArr3 = new String[1];
                                                                c5 = 1;
                                                            } else {
                                                                c4 = 1;
                                                                i26 = (i & (-21)) | (i34 & 20);
                                                                strArr3 = new String[1];
                                                                c5 = 0;
                                                            }
                                                            strArr3[c5] = line;
                                                            ((int[]) objArr[0])[0] = i26;
                                                            objArr[c4] = strArr3;
                                                            int i68 = i67 + 21;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i68 % 128;
                                                            int i69 = i68 % 2;
                                                        }
                                                    } else {
                                                        c3 = 0;
                                                        if (line != null) {
                                                            objArr = new Object[2];
                                                            objArr[c3] = new int[1];
                                                            i25 = (i24 & 109) + (i24 | 109);
                                                            int i610 = i25 % 128;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i610;
                                                            if (i25 % 2 != 0) {
                                                                i26 = (~(i & 80)) & (i | 80);
                                                                c4 = 1;
                                                                strArr3 = new String[1];
                                                                c5 = 1;
                                                            } else {
                                                                c4 = 1;
                                                                i26 = (i & (-21)) | (i34 & 20);
                                                                strArr3 = new String[1];
                                                                c5 = 0;
                                                            }
                                                            strArr3[c5] = line;
                                                            ((int[]) objArr[0])[0] = i26;
                                                            objArr[c4] = strArr3;
                                                            int i611 = i610 + 21;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i611 % 128;
                                                            int i612 = i611 % 2;
                                                        }
                                                    }
                                                }
                                            }
                                            int i70 = ((int[]) objArr[0])[0];
                                            int i71 = (~(i & i47)) & (i | i47);
                                            int i72 = (i71 | (-i71)) >> 31;
                                            int i73 = (~i72) & i70;
                                            int i74 = i47 & i72;
                                            int i75 = (i74 & i73) | (i73 ^ i74);
                                            strArr = (String[]) objArr[1];
                                            objArr2 = new Object[2];
                                            int i76 = (i70 | i) & (~(i & i70));
                                            int i77 = -i76;
                                            i6 = ((i76 & i77) | (i76 ^ i77)) >> 31;
                                            int i78 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            i7 = (i78 & 83) + (i78 | 83);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                            if (i7 % 2 == 0) {
                                                i8 = 1;
                                                objArr2[i6 & 1] = null;
                                                objArr2[0] = strArr;
                                                strArr2 = strArr;
                                                c = 0;
                                                i9 = 5;
                                            } else {
                                                i8 = 1;
                                                int i79 = i6 & 1;
                                                int i80 = -i79;
                                                int i81 = (~(((i80 & i79) | (i79 ^ i80)) >> 31)) & 1;
                                                objArr2[i79] = null;
                                                objArr2[i81] = strArr;
                                                c = 0;
                                                strArr2 = (String[]) objArr2[0];
                                                i9 = 4;
                                            }
                                            objArr3 = new Object[i9];
                                            iArr = new int[i8];
                                            objArr3[c] = iArr;
                                            iArr2 = new int[i8];
                                            objArr3[i8] = iArr2;
                                            iArr3 = new int[i8];
                                            objArr3[2] = iArr3;
                                            int i82 = ((~i75) & i) | (i75 & i34);
                                            i10 = (i82 | (-i82)) >> 31;
                                            i11 = ((i78 | 13) << 1) - (i78 ^ 13);
                                            int i83 = i11 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i83;
                                            if (i11 % 2 == 0) {
                                                i12 = i10 & 16;
                                                iArr2[1] = i;
                                                iArr4 = (int[]) objArr3[5];
                                                c2 = 0;
                                            } else {
                                                i12 = i10 & 16;
                                                c2 = 0;
                                                iArr[0] = i;
                                                iArr4 = iArr3;
                                            }
                                            iArr4[c2] = i75;
                                            objArr3[3] = strArr2;
                                            int i84 = (-549971510) + (((~(i | 562948286)) | 505549377) * 305) + (((~(562948286 | i34)) | 522638057) * 305);
                                            int i85 = -(-i12);
                                            i13 = (i84 & i85) + (i85 | i84);
                                            int i86 = i13 * 165;
                                            int i87 = -(-(i2 * (-163)));
                                            int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                                            i14 = ~i;
                                            int i89 = -(-(((~((i14 ^ i2) | (i14 & i2))) | i13) * (-328)));
                                            int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                                            int i91 = -(-(((i13 ^ i) | (i13 & i)) * 164));
                                            i15 = (i90 & i91) + (i91 | i90);
                                            int i92 = ~i13;
                                            i16 = ~i2;
                                            i17 = ~((i92 & i16) | (i92 ^ i16));
                                            i18 = (i83 & 25) + (i83 | 25);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                            if (i18 % 2 != 0) {
                                                int i93 = ~((i16 ^ i) | (i & i16));
                                                int i94 = (i93 & i17) | (i17 ^ i93);
                                                int i95 = (i34 ^ i13) | (i34 & i13);
                                                int i96 = ~((i95 & i2) | (i95 ^ i2));
                                                int i97 = i15 / (164 << ((i94 & i96) | (i94 ^ i96)));
                                                int i98 = i97 % 38;
                                                int i99 = (i98 | i97) & (~(i97 & i98));
                                                int i100 = i99 / 96;
                                                int i101 = ((~i99) & i100) | ((~i100) & i99);
                                                iArr[1] = i101 ^ (i101 % 3);
                                                return objArr3;
                                            }
                                            int i102 = ~(i | i16);
                                            int i103 = (i102 & i17) | (i17 ^ i102);
                                            int i104 = ~((i14 & i13) | (i14 ^ i13) | i2);
                                            int i105 = i15 + (((i104 & i103) | (i103 ^ i104)) * 164);
                                            int i106 = (i105 << 13) ^ i105;
                                            int i107 = i106 >>> 17;
                                            int i108 = ((~i106) & i107) | ((~i107) & i106);
                                            int i109 = i108 << 5;
                                            iArr2[0] = ((~i108) & i109) | ((~i109) & i108);
                                            return objArr3;
                                        } catch (Throwable th2) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            throw th2;
                                        }
                                    }
                                    int i110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i111 = ((i110 | 57) << 1) - (i110 ^ 57);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i111 % 128;
                                    int i112 = i111 % 2;
                                    objArr = new Object[]{new int[]{i}, new String[0]};
                                    int i113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i114 = ((i113 | 115) << 1) - (i113 ^ 115);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i114 % 128;
                                    int i115 = i114 % 2;
                                    int i710 = ((int[]) objArr[0])[0];
                                    int i711 = (~(i & i47)) & (i | i47);
                                    int i712 = (i711 | (-i711)) >> 31;
                                    int i713 = (~i712) & i710;
                                    int i714 = i47 & i712;
                                    int i715 = (i714 & i713) | (i713 ^ i714);
                                    strArr = (String[]) objArr[1];
                                    objArr2 = new Object[2];
                                    int i716 = (i710 | i) & (~(i & i710));
                                    int i717 = -i716;
                                    i6 = ((i716 & i717) | (i716 ^ i717)) >> 31;
                                    int i718 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i7 = (i718 & 83) + (i718 | 83);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        i8 = 1;
                                        objArr2[i6 & 1] = null;
                                        objArr2[0] = strArr;
                                        strArr2 = strArr;
                                        c = 0;
                                        i9 = 5;
                                    } else {
                                        i8 = 1;
                                        int i719 = i6 & 1;
                                        int i810 = -i719;
                                        int i811 = (~(((i810 & i719) | (i719 ^ i810)) >> 31)) & 1;
                                        objArr2[i719] = null;
                                        objArr2[i811] = strArr;
                                        c = 0;
                                        strArr2 = (String[]) objArr2[0];
                                        i9 = 4;
                                    }
                                    objArr3 = new Object[i9];
                                    iArr = new int[i8];
                                    objArr3[c] = iArr;
                                    iArr2 = new int[i8];
                                    objArr3[i8] = iArr2;
                                    iArr3 = new int[i8];
                                    objArr3[2] = iArr3;
                                    int i812 = ((~i715) & i) | (i715 & i34);
                                    i10 = (i812 | (-i812)) >> 31;
                                    i11 = ((i718 | 13) << 1) - (i718 ^ 13);
                                    int i813 = i11 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i813;
                                    if (i11 % 2 == 0) {
                                        i12 = i10 & 16;
                                        iArr2[1] = i;
                                        iArr4 = (int[]) objArr3[5];
                                        c2 = 0;
                                    } else {
                                        i12 = i10 & 16;
                                        c2 = 0;
                                        iArr[0] = i;
                                        iArr4 = iArr3;
                                    }
                                    iArr4[c2] = i715;
                                    objArr3[3] = strArr2;
                                    int i814 = (-549971510) + (((~(i | 562948286)) | 505549377) * 305) + (((~(562948286 | i34)) | 522638057) * 305);
                                    int i815 = -(-i12);
                                    i13 = (i814 & i815) + (i815 | i814);
                                    int i816 = i13 * 165;
                                    int i817 = -(-(i2 * (-163)));
                                    int i818 = ((i816 | i817) << 1) - (i816 ^ i817);
                                    i14 = ~i;
                                    int i819 = -(-(((~((i14 ^ i2) | (i14 & i2))) | i13) * (-328)));
                                    int i910 = ((i818 | i819) << 1) - (i819 ^ i818);
                                    int i911 = -(-(((i13 ^ i) | (i13 & i)) * 164));
                                    i15 = (i910 & i911) + (i911 | i910);
                                    int i912 = ~i13;
                                    i16 = ~i2;
                                    i17 = ~((i912 & i16) | (i912 ^ i16));
                                    i18 = (i813 & 25) + (i813 | 25);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        int i913 = ~((i16 ^ i) | (i & i16));
                                        int i914 = (i913 & i17) | (i17 ^ i913);
                                        int i915 = (i34 ^ i13) | (i34 & i13);
                                        int i916 = ~((i915 & i2) | (i915 ^ i2));
                                        int i917 = i15 / (164 << ((i914 & i916) | (i914 ^ i916)));
                                        int i918 = i917 % 38;
                                        int i919 = (i918 | i917) & (~(i917 & i918));
                                        int i1010 = i919 / 96;
                                        int i1011 = ((~i919) & i1010) | ((~i1010) & i919);
                                        iArr[1] = i1011 ^ (i1011 % 3);
                                        return objArr3;
                                    }
                                    int i1012 = ~(i | i16);
                                    int i1013 = (i1012 & i17) | (i17 ^ i1012);
                                    int i1014 = ~((i14 & i13) | (i14 ^ i13) | i2);
                                    int i1015 = i15 + (((i1014 & i1013) | (i1013 ^ i1014)) * 164);
                                    int i1016 = (i1015 << 13) ^ i1015;
                                    int i1017 = i1016 >>> 17;
                                    int i1018 = ((~i1016) & i1017) | ((~i1017) & i1016);
                                    int i1019 = i1018 << 5;
                                    iArr2[0] = ((~i1018) & i1019) | ((~i1019) & i1018);
                                    return objArr3;
                                } catch (Throwable th3) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th3;
                                }
                            }
                            int i116 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i117 = (i116 & 71) + (i116 | 71);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i117 % 128;
                            int i118 = i117 % 2;
                            Object[] objArr17 = new Object[1];
                            a(new int[]{96, 31, 0, 1}, true, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, objArr17);
                            file = new File((String) objArr17[0]);
                            if (!file.canRead()) {
                                fileReader = new FileReader(file);
                                bufferedReader = new BufferedReader(fileReader);
                                int i510 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i19 = (i510 ^ 55) + ((i510 & 55) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i19 % 128;
                                if (i19 % 2 == 0) {
                                    line2 = bufferedReader.readLine();
                                    Object[] objArr18 = new Object[1];
                                    a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr18);
                                    str = (String) objArr18[0];
                                    i20 = 1;
                                } else {
                                    line2 = bufferedReader.readLine();
                                    i20 = 1;
                                    Object[] objArr19 = new Object[1];
                                    a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr19);
                                    str = (String) objArr19[0];
                                }
                                int i511 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i512 = (i511 ^ 71) + ((i511 & 71) << i20);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i512 % 128;
                                int i513 = i512 % 2;
                                zEquals = line2.equals(str);
                                fileReader.close();
                                bufferedReader.close();
                                int i514 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i514 % 128;
                                int i613 = i514 % 2;
                                if (zEquals) {
                                    Object[] objArr110 = new Object[1];
                                    a(new int[]{128, 36, 0, 35}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1}, objArr110);
                                    file2 = new File((String) objArr110[0]);
                                    if (file2.canRead()) {
                                        int i614 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        i27 = ((i614 | 71) << 1) - (i614 ^ 71);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                                        if (i27 % 2 != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        int i615 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        i21 = (i615 ^ 81) + ((i615 & 81) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            line3 = bufferedReader2.readLine();
                                            Object[] objArr111 = new Object[1];
                                            a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr111);
                                            obj = objArr111[0];
                                        } else {
                                            line3 = bufferedReader2.readLine();
                                            Object[] objArr112 = new Object[1];
                                            a(new int[]{127, 1, 62, 0}, true, new byte[]{1}, objArr112);
                                            obj = objArr112[0];
                                        }
                                        str2 = (String) obj;
                                        i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            line3.equals(str2);
                                            fileReader2.close();
                                            bufferedReader2.close();
                                            Object obj4 = null;
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        boolean zEquals3 = line3.equals(str2);
                                        fileReader2.close();
                                        bufferedReader2.close();
                                        int i616 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i617 = (i616 ^ 67) + ((i616 & 67) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i617 % 128;
                                        int i618 = i617 % 2;
                                        z = zEquals3;
                                    }
                                    if (z) {
                                        i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                                        i24 = i23 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i24;
                                        if (i23 % 2 == 0) {
                                            c3 = 0;
                                            int i619 = 90 / 0;
                                            if (line != null) {
                                                objArr = new Object[2];
                                                objArr[c3] = new int[1];
                                                i25 = (i24 & 109) + (i24 | 109);
                                                int i6110 = i25 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6110;
                                                if (i25 % 2 != 0) {
                                                    i26 = (~(i & 80)) & (i | 80);
                                                    c4 = 1;
                                                    strArr3 = new String[1];
                                                    c5 = 1;
                                                } else {
                                                    c4 = 1;
                                                    i26 = (i & (-21)) | (i34 & 20);
                                                    strArr3 = new String[1];
                                                    c5 = 0;
                                                }
                                                strArr3[c5] = line;
                                                ((int[]) objArr[0])[0] = i26;
                                                objArr[c4] = strArr3;
                                                int i6111 = i6110 + 21;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6111 % 128;
                                                int i6112 = i6111 % 2;
                                            }
                                        } else {
                                            c3 = 0;
                                            if (line != null) {
                                                objArr = new Object[2];
                                                objArr[c3] = new int[1];
                                                i25 = (i24 & 109) + (i24 | 109);
                                                int i6113 = i25 % 128;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6113;
                                                if (i25 % 2 != 0) {
                                                    i26 = (~(i & 80)) & (i | 80);
                                                    c4 = 1;
                                                    strArr3 = new String[1];
                                                    c5 = 1;
                                                } else {
                                                    c4 = 1;
                                                    i26 = (i & (-21)) | (i34 & 20);
                                                    strArr3 = new String[1];
                                                    c5 = 0;
                                                }
                                                strArr3[c5] = line;
                                                ((int[]) objArr[0])[0] = i26;
                                                objArr[c4] = strArr3;
                                                int i6114 = i6113 + 21;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6114 % 128;
                                                int i6115 = i6114 % 2;
                                            }
                                        }
                                    }
                                }
                                int i7110 = ((int[]) objArr[0])[0];
                                int i7111 = (~(i & i47)) & (i | i47);
                                int i7112 = (i7111 | (-i7111)) >> 31;
                                int i7113 = (~i7112) & i7110;
                                int i7114 = i47 & i7112;
                                int i7115 = (i7114 & i7113) | (i7113 ^ i7114);
                                strArr = (String[]) objArr[1];
                                objArr2 = new Object[2];
                                int i7116 = (i7110 | i) & (~(i & i7110));
                                int i7117 = -i7116;
                                i6 = ((i7116 & i7117) | (i7116 ^ i7117)) >> 31;
                                int i7118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i7 = (i7118 & 83) + (i7118 | 83);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                if (i7 % 2 == 0) {
                                    i8 = 1;
                                    objArr2[i6 & 1] = null;
                                    objArr2[0] = strArr;
                                    strArr2 = strArr;
                                    c = 0;
                                    i9 = 5;
                                } else {
                                    i8 = 1;
                                    int i7119 = i6 & 1;
                                    int i8110 = -i7119;
                                    int i8111 = (~(((i8110 & i7119) | (i7119 ^ i8110)) >> 31)) & 1;
                                    objArr2[i7119] = null;
                                    objArr2[i8111] = strArr;
                                    c = 0;
                                    strArr2 = (String[]) objArr2[0];
                                    i9 = 4;
                                }
                                objArr3 = new Object[i9];
                                iArr = new int[i8];
                                objArr3[c] = iArr;
                                iArr2 = new int[i8];
                                objArr3[i8] = iArr2;
                                iArr3 = new int[i8];
                                objArr3[2] = iArr3;
                                int i8112 = ((~i7115) & i) | (i7115 & i34);
                                i10 = (i8112 | (-i8112)) >> 31;
                                i11 = ((i7118 | 13) << 1) - (i7118 ^ 13);
                                int i8113 = i11 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8113;
                                if (i11 % 2 == 0) {
                                    i12 = i10 & 16;
                                    iArr2[1] = i;
                                    iArr4 = (int[]) objArr3[5];
                                    c2 = 0;
                                } else {
                                    i12 = i10 & 16;
                                    c2 = 0;
                                    iArr[0] = i;
                                    iArr4 = iArr3;
                                }
                                iArr4[c2] = i7115;
                                objArr3[3] = strArr2;
                                int i8114 = (-549971510) + (((~(i | 562948286)) | 505549377) * 305) + (((~(562948286 | i34)) | 522638057) * 305);
                                int i8115 = -(-i12);
                                i13 = (i8114 & i8115) + (i8115 | i8114);
                                int i8116 = i13 * 165;
                                int i8117 = -(-(i2 * (-163)));
                                int i8118 = ((i8116 | i8117) << 1) - (i8116 ^ i8117);
                                i14 = ~i;
                                int i8119 = -(-(((~((i14 ^ i2) | (i14 & i2))) | i13) * (-328)));
                                int i9110 = ((i8118 | i8119) << 1) - (i8119 ^ i8118);
                                int i9111 = -(-(((i13 ^ i) | (i13 & i)) * 164));
                                i15 = (i9110 & i9111) + (i9111 | i9110);
                                int i9112 = ~i13;
                                i16 = ~i2;
                                i17 = ~((i9112 & i16) | (i9112 ^ i16));
                                i18 = (i8113 & 25) + (i8113 | 25);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    int i9113 = ~((i16 ^ i) | (i & i16));
                                    int i9114 = (i9113 & i17) | (i17 ^ i9113);
                                    int i9115 = (i34 ^ i13) | (i34 & i13);
                                    int i9116 = ~((i9115 & i2) | (i9115 ^ i2));
                                    int i9117 = i15 / (164 << ((i9114 & i9116) | (i9114 ^ i9116)));
                                    int i9118 = i9117 % 38;
                                    int i9119 = (i9118 | i9117) & (~(i9117 & i9118));
                                    int i10110 = i9119 / 96;
                                    int i10111 = ((~i9119) & i10110) | ((~i10110) & i9119);
                                    iArr[1] = i10111 ^ (i10111 % 3);
                                    return objArr3;
                                }
                                int i10112 = ~(i | i16);
                                int i10113 = (i10112 & i17) | (i17 ^ i10112);
                                int i10114 = ~((i14 & i13) | (i14 ^ i13) | i2);
                                int i10115 = i15 + (((i10114 & i10113) | (i10113 ^ i10114)) * 164);
                                int i10116 = (i10115 << 13) ^ i10115;
                                int i10117 = i10116 >>> 17;
                                int i10118 = ((~i10116) & i10117) | ((~i10117) & i10116);
                                int i10119 = i10118 << 5;
                                iArr2[0] = ((~i10118) & i10119) | ((~i10119) & i10118);
                                return objArr3;
                            }
                            int i119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i1110 = ((i119 | 57) << 1) - (i119 ^ 57);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1110 % 128;
                            int i1111 = i1110 % 2;
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                    line = null;
                    objArr = new Object[]{new int[]{i}, new String[0]};
                    int i1112 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i1113 = ((i1112 | 115) << 1) - (i1112 ^ 115);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1113 % 128;
                    int i1114 = i1113 % 2;
                    int i71110 = ((int[]) objArr[0])[0];
                    int i71111 = (~(i & i47)) & (i | i47);
                    int i71112 = (i71111 | (-i71111)) >> 31;
                    int i71113 = (~i71112) & i71110;
                    int i71114 = i47 & i71112;
                    int i71115 = (i71114 & i71113) | (i71113 ^ i71114);
                    strArr = (String[]) objArr[1];
                    objArr2 = new Object[2];
                    int i71116 = (i71110 | i) & (~(i & i71110));
                    int i71117 = -i71116;
                    i6 = ((i71116 & i71117) | (i71116 ^ i71117)) >> 31;
                    int i71118 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i7 = (i71118 & 83) + (i71118 | 83);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                    if (i7 % 2 == 0) {
                        i8 = 1;
                        objArr2[i6 & 1] = null;
                        objArr2[0] = strArr;
                        strArr2 = strArr;
                        c = 0;
                        i9 = 5;
                    } else {
                        i8 = 1;
                        int i71119 = i6 & 1;
                        int i81110 = -i71119;
                        int i81111 = (~(((i81110 & i71119) | (i71119 ^ i81110)) >> 31)) & 1;
                        objArr2[i71119] = null;
                        objArr2[i81111] = strArr;
                        c = 0;
                        strArr2 = (String[]) objArr2[0];
                        i9 = 4;
                    }
                    objArr3 = new Object[i9];
                    iArr = new int[i8];
                    objArr3[c] = iArr;
                    iArr2 = new int[i8];
                    objArr3[i8] = iArr2;
                    iArr3 = new int[i8];
                    objArr3[2] = iArr3;
                    int i81112 = ((~i71115) & i) | (i71115 & i34);
                    i10 = (i81112 | (-i81112)) >> 31;
                    i11 = ((i71118 | 13) << 1) - (i71118 ^ 13);
                    int i81113 = i11 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i81113;
                    if (i11 % 2 == 0) {
                        i12 = i10 & 16;
                        iArr2[1] = i;
                        iArr4 = (int[]) objArr3[5];
                        c2 = 0;
                    } else {
                        i12 = i10 & 16;
                        c2 = 0;
                        iArr[0] = i;
                        iArr4 = iArr3;
                    }
                    iArr4[c2] = i71115;
                    objArr3[3] = strArr2;
                    int i81114 = (-549971510) + (((~(i | 562948286)) | 505549377) * 305) + (((~(562948286 | i34)) | 522638057) * 305);
                    int i81115 = -(-i12);
                    i13 = (i81114 & i81115) + (i81115 | i81114);
                    int i81116 = i13 * 165;
                    int i81117 = -(-(i2 * (-163)));
                    int i81118 = ((i81116 | i81117) << 1) - (i81116 ^ i81117);
                    i14 = ~i;
                    int i81119 = -(-(((~((i14 ^ i2) | (i14 & i2))) | i13) * (-328)));
                    int i91110 = ((i81118 | i81119) << 1) - (i81119 ^ i81118);
                    int i91111 = -(-(((i13 ^ i) | (i13 & i)) * 164));
                    i15 = (i91110 & i91111) + (i91111 | i91110);
                    int i91112 = ~i13;
                    i16 = ~i2;
                    i17 = ~((i91112 & i16) | (i91112 ^ i16));
                    i18 = (i81113 & 25) + (i81113 | 25);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i91113 = ~((i16 ^ i) | (i & i16));
                        int i91114 = (i91113 & i17) | (i17 ^ i91113);
                        int i91115 = (i34 ^ i13) | (i34 & i13);
                        int i91116 = ~((i91115 & i2) | (i91115 ^ i2));
                        int i91117 = i15 / (164 << ((i91114 & i91116) | (i91114 ^ i91116)));
                        int i91118 = i91117 % 38;
                        int i91119 = (i91118 | i91117) & (~(i91117 & i91118));
                        int i101110 = i91119 / 96;
                        int i101111 = ((~i91119) & i101110) | ((~i101110) & i91119);
                        iArr[1] = i101111 ^ (i101111 % 3);
                        return objArr3;
                    }
                    int i101112 = ~(i | i16);
                    int i101113 = (i101112 & i17) | (i17 ^ i101112);
                    int i101114 = ~((i14 & i13) | (i14 ^ i13) | i2);
                    int i101115 = i15 + (((i101114 & i101113) | (i101113 ^ i101114)) * 164);
                    int i101116 = (i101115 << 13) ^ i101115;
                    int i101117 = i101116 >>> 17;
                    int i101118 = ((~i101116) & i101117) | ((~i101117) & i101116);
                    int i101119 = i101118 << 5;
                    iArr2[0] = ((~i101118) & i101119) | ((~i101119) & i101118);
                    return objArr3;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020  */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r5, int r6, short r7) {
                /*
                    int r6 = r6 + 99
                    byte[] r0 = defpackage.setEpicenterBounds.$$c
                    int r7 = r7 * 2
                    int r1 = r7 + 1
                    int r5 = r5 * 4
                    int r5 = 4 - r5
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r4 = r7
                    r3 = r2
                    goto L24
                L14:
                    r3 = r2
                L15:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L20
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L20:
                    int r3 = r3 + 1
                    r4 = r0[r5]
                L24:
                    int r6 = r6 + r4
                    int r5 = r5 + 1
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setEpicenterBounds.$$e(int, int, short):java.lang.String");
            }
        }));
        ((flushLollipops) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: createPopup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.notify(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((lambdaonVerticalScrollEvent0) this.INotificationSideChannel.getValue()).b.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: showPopup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.INotificationSideChannel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((IntegerRes) this.write.getValue()).INotificationSideChannelStub.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: MenuPopupHelper1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getRatioByPercentage) this.getInterfaceDescriptor.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: getGravity
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getRatioByPercentage) this.getInterfaceDescriptor.getValue()).asBinder.observe(refreshvisibility, new asInterface(new Function1() { // from class: MenuPresenterCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getRatioByPercentage) this.getInterfaceDescriptor.getValue()).asInterface.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: tryShow
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((getRatioByPercentage) this.getInterfaceDescriptor.getValue()).g.observe(refreshvisibility, new asInterface(new Function1() { // from class: MenuPresenter
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.asInterface.getValue()).onTransact.observe(refreshvisibility, new asInterface(new Function1() { // from class: MenuItemWrapperICSOnMenuItemClickListenerWrapper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.g(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.asInterface.getValue()).INotificationSideChannelStub.observe(refreshvisibility, new asInterface(new Function1() { // from class: measureIndividualMenuWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refreshVisibility.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    private final void getInterfaceDescriptor() {
        AvailabilityMenuItem availabilityMenuItem;
        List<AvailabilityMenuItem> list;
        Object next;
        setCurrentRunnable setcurrentrunnable = (setCurrentRunnable) this.d.getValue();
        if (setcurrentrunnable == null || (list = setcurrentrunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            availabilityMenuItem = null;
        } else {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next).getMenuCode(), "JM002"));
            availabilityMenuItem = (AvailabilityMenuItem) next;
        }
        if (!Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getActive() : null, "Y")) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(availabilityMenuItem);
            return;
        }
        User user = (User) this.connect.getValue();
        if (!Intrinsics.areEqual(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null), "-")) {
            AsikActiveParticipantSubmissionCheckActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = AsikActiveParticipantSubmissionCheckActivity.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            AsikActiveParticipantSubmissionCheckActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, AsikPointer.MENU.getType());
            return;
        }
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.message_verif_data);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.message_verif_handphone);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.ok);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_warning_2, string, string2, string3, null, 112);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        getstringornullB.INotificationSideChannel = new a();
    }

    private final void INotificationSideChannelDefault() {
        AvailabilityMenuItem availabilityMenuItem;
        List<AvailabilityMenuItem> list;
        Object next;
        setCurrentRunnable setcurrentrunnable = (setCurrentRunnable) this.d.getValue();
        if (setcurrentrunnable == null || (list = setcurrentrunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            availabilityMenuItem = null;
        } else {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((AvailabilityMenuItem) next).getMenuCode(), "JM006"));
            availabilityMenuItem = (AvailabilityMenuItem) next;
        }
        if (Intrinsics.areEqual(availabilityMenuItem != null ? availabilityMenuItem.getActive() : null, "Y")) {
            TuitionActivity.Companion tuitionPaymentFragmentbindingInflater1 = TuitionActivity.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            TuitionActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext);
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(availabilityMenuItem);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            ScholarPerson scholarPerson = (ScholarPerson) CollectionsKt.firstOrNull((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (scholarPerson != null) {
                ((getRatioByPercentage) refreshvisibility.getInterfaceDescriptor.getValue()).b.setValue(scholarPerson);
                getRatioByPercentage getratiobypercentage = (getRatioByPercentage) refreshvisibility.getInterfaceDescriptor.getValue();
                User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str = userAsBinder != null ? userAsBinder.b : null;
                String str2 = str == null ? "" : str;
                User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str3 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                String str4 = str3 == null ? "" : str3;
                String str5 = scholarPerson.b;
                String str6 = str5 == null ? "" : str5;
                String str7 = scholarPerson.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                User userAsBinder3 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str8 = userAsBinder3 != null ? userAsBinder3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                getratiobypercentage.TuitionPaymentFragmentbindingInflater1(new ScholarshipBenefitRequest(str2, str4, str6, str7, str8 == null ? "" : str8));
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string = refreshvisibility.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
            FragmentManager childFragmentManager = refreshvisibility.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        List<ScholarPersonDetail> listEmptyList;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (Intrinsics.areEqual(((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusCode(), "203")) {
                refreshvisibility.write();
                getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                String strReplace$default = StringsKt.replace$default(((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), "\t", "", false, 4, (Object) null);
                String string = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "Mohon maaf konfirmasi tidak dapat dilanjutkan", strReplace$default, string, null, 112);
                FragmentManager childFragmentManager = refreshvisibility.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                List<ScholarshipBenefitPerson> choosenScholarDetail = ((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getChoosenScholarDetail();
                if (choosenScholarDetail != null) {
                    String signature = ((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getSignature();
                    if (signature == null) {
                        signature = "";
                    }
                    listEmptyList = LocalOnBackPressedDispatcherOwnerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(choosenScholarDetail, signature);
                } else {
                    listEmptyList = null;
                }
                getRatioByPercentage getratiobypercentage = (getRatioByPercentage) refreshvisibility.getInterfaceDescriptor.getValue();
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Intrinsics.checkNotNullParameter(listEmptyList, "");
                getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listEmptyList);
                getRatioByPercentage getratiobypercentage2 = (getRatioByPercentage) refreshvisibility.getInterfaceDescriptor.getValue();
                getratiobypercentage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ScholarshipEligibleResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                refreshvisibility.write();
                refreshvisibility.startActivity(new Intent(refreshvisibility.requireActivity(), (Class<?>) ScholarshipGranteeActivity.class));
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            getCameraState.Companion bVar = getCameraState.INSTANCE;
            String string2 = refreshvisibility.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String string3 = refreshvisibility.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, string2, strValueOf, string3);
            FragmentManager childFragmentManager2 = refreshvisibility.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            Intrinsics.checkNotNullParameter(childFragmentManager2, "");
            if (childFragmentManager2.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getcamerastateB.show(childFragmentManager2, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                refreshvisibility.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                ScholarInsertResult scholarInsertResult = (ScholarInsertResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                List<ScholarshipDataDocumentForInsert> list = ((ScholarInsertResult) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).onTransact;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    ScholarshipDataDocumentForInsert scholarshipDataDocumentForInsert = (ScholarshipDataDocumentForInsert) obj;
                    if (Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D113") || Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D114") || Intrinsics.areEqual(scholarshipDataDocumentForInsert.getKode(), "D000")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                Intrinsics.checkNotNullParameter(arrayList2, "");
                scholarInsertResult.onTransact = arrayList2;
                ScholarConfirmActivity.Companion tuitionPaymentFragmentbindingInflater1 = ScholarConfirmActivity.INSTANCE;
                Context contextRequireContext = refreshvisibility.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ScholarConfirmActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                refreshvisibility.write();
                getCameraState.Companion bVar = getCameraState.INSTANCE;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                String string = refreshvisibility.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                getCameraState getcamerastateB = getCameraState.Companion.b(R.drawable.ic_info_blue, "", strValueOf, string);
                FragmentManager childFragmentManager = refreshvisibility.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getcamerastateB.show(childFragmentManager, getcamerastateB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            String str = ((ComponentActivityExternalSyntheticLambda10) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str.length() == 0) {
                refreshVisibility refreshvisibility2 = refreshvisibility;
                Intrinsics.checkNotNullParameter(refreshvisibility2, "");
                Intrinsics.checkNotNullParameter("Kode pengajuan tidak ditemukan", "");
                BaseActivity baseActivity = (BaseActivity) refreshvisibility2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, "Kode pengajuan tidak ditemukan", null);
                }
            } else {
                List<ClaimSegmenItem> list = refreshvisibility.f1338a;
                if (list.isEmpty()) {
                    refreshVisibility refreshvisibility3 = refreshvisibility;
                    String strConcat = "Data Segmen ".concat(String.valueOf(list.size()));
                    Intrinsics.checkNotNullParameter(refreshvisibility3, "");
                    Intrinsics.checkNotNullParameter(strConcat, "");
                    BaseActivity baseActivity2 = (BaseActivity) refreshvisibility3.getContext();
                    if (baseActivity2 != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strConcat, null);
                    }
                } else if (list.size() == 1) {
                    ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1;
                    Context contextRequireContext = refreshvisibility.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    ClaimOldDaySecurityTermsConditionActivity.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, list.get(0).b, str);
                } else {
                    ClaimChooseMembershipActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = ClaimChooseMembershipActivity.INSTANCE;
                    Context contextRequireContext2 = refreshvisibility.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    ClaimChooseMembershipActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, list, str);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            FragmentActivity activity = refreshvisibility.getActivity();
            BaseActivity baseActivity3 = activity instanceof BaseActivity ? (BaseActivity) activity : null;
            if (baseActivity3 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(baseActivity3, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            refreshvisibility.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            refreshvisibility.f1338a = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ((Camera2CameraControlImplExternalSyntheticLambda4) refreshvisibility.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            FragmentActivity activity = refreshvisibility.getActivity();
            BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentbindingInflater1(baseActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
            }
        } else {
            refreshvisibility.write();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(refreshVisibility refreshvisibility, r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4) {
        Intrinsics.checkNotNullParameter(r8lambdai2xi7mochmmaz9qzzewheaxs4, "");
        Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ WindowInsetsCompat b(refreshVisibility refreshvisibility, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), "");
        view.setPadding(0, 0, 0, 0);
        TextView textView = refreshvisibility.asInterface().tvServiceProgram;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = refreshvisibility.getResources().getDimensionPixelSize(R.dimen.dimen_16dp);
        textView.setLayoutParams(marginLayoutParams);
        return windowInsetsCompat;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    public static /* synthetic */ Unit a(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
            str = "loading_check_connect_motionpay";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            MotionCheckConnectResponse motionCheckConnectResponse = (MotionCheckConnectResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (Intrinsics.areEqual(motionCheckConnectResponse.isExists(), "true")) {
                String upperCase = motionCheckConnectResponse.getMessage().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (Intrinsics.areEqual(upperCase, "LINKED")) {
                    if (Intrinsics.areEqual(((CustomTabsSession1ExternalSyntheticLambda1) refreshvisibility.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue(), Boolean.TRUE)) {
                        ((CustomTabsSession1ExternalSyntheticLambda1) refreshvisibility.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.setValue(Boolean.FALSE);
                        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                        if (userAsBinder != null) {
                            CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1 = (CustomTabsSession1ExternalSyntheticLambda1) refreshvisibility.onTransact.getValue();
                            String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            String str3 = str2 == null ? "" : str2;
                            String str4 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            String str5 = str4 == null ? "" : str4;
                            String str6 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            String str7 = str6 == null ? "" : str6;
                            String str8 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            String str9 = str8 == null ? "" : str8;
                            String str10 = userAsBinder.b;
                            customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new MultiBillerTransactionRequest(str3, str5, str7, str9, str10 == null ? "" : str10));
                        }
                    } else {
                        ActivityResultLauncher<Intent> activityResultLauncher = refreshvisibility.read;
                        if (activityResultLauncher != null) {
                            TermsAndAgreementBillerActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TermsAndAgreementBillerActivity.INSTANCE;
                            Context contextRequireContext = refreshvisibility.requireContext();
                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                            activityResultLauncher.launch(TermsAndAgreementBillerActivity.Companion.b(contextRequireContext));
                        }
                    }
                } else {
                    refreshvisibility.TuitionPaymentFragmentbindingInflater1("Silahkan sambungkan akun MotionPay terlebih dahulu");
                }
            } else {
                refreshvisibility.TuitionPaymentFragmentbindingInflater1("Silahkan sambungkan akun MotionPay terlebih dahulu");
            }
            str = "success_check_connect_motionpay";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            refreshvisibility.TuitionPaymentFragmentbindingInflater1(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            str = "failed_check_connect_motionpay";
        } else {
            str = "";
        }
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_ewallet_motion_connect", str));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            AccountVerificationActivity.b bVar = AccountVerificationActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            User userAsBinder2 = ((ActivityResultContractsPickVisualMediaMediaCapabilities) refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str2 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
            if (str2 == null) {
                str2 = "";
            }
            AccountVerificationActivity.b.b(contextRequireContext, str, str2, 6, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, 32);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String strJoinToString$default;
        String str;
        d();
        asInterface().layoutProgramServiceGrid.cardJht.setOnClickListener(new View.OnClickListener() { // from class: AbsActionBarView1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                refreshVisibility.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        asInterface().layoutProgramServiceGrid.cardJkk.setOnClickListener(new View.OnClickListener() { // from class: onAnimationCancel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                refreshVisibility.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        asInterface().layoutProgramServiceGrid.cardJkm.setOnClickListener(new View.OnClickListener() { // from class: withFinalVisibility
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                refreshVisibility.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        asInterface().layoutProgramServiceGrid.cardJp.setOnClickListener(new View.OnClickListener() { // from class: getWrappedView
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                refreshVisibility.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        asInterface().layoutProgramServiceGrid.cardJkp.setOnClickListener(new MenuItemWrapperICSCollapsibleActionViewWrapper(this));
        asInterface().rvPrograms.setVisibility(8);
        RecyclerView recyclerView = asInterface().rvServices;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 4));
        recyclerView.addItemDecoration(new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        recyclerView.setAdapter((setActionBarHideOffset) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        requireActivity().findViewById(R.id.layoutMainToolbar).setVisibility(0);
        User user = (User) this.connect.getValue();
        if (user == null || (str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            strJoinToString$default = null;
        } else {
            String str2 = str;
            if (str2 == null || StringsKt.isBlank(str2)) {
                strJoinToString$default = "";
            } else {
                List<String> listSplit = new Regex("\\s+").split(StringsKt.trim((CharSequence) new Regex("[\\n\\r]+").replace(str2, " ")).toString(), 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listSplit) {
                    if (new Regex("^[a-zA-Z]+$").matches((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList, 2), " ", null, null, 0, null, null, 62, null);
            }
        }
        String strConcat = "Halo, ".concat(String.valueOf(strJoinToString$default != null ? strJoinToString$default : ""));
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#4DBB6C")), 6, strConcat.length(), 33);
        asInterface().tvServiceProgram.setText(spannableString);
        ViewCompat.setOnApplyWindowInsetsListener(asInterface().getRoot(), new OnApplyWindowInsetsListener() { // from class: ShowableListMenu
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return refreshVisibility.b(this.b, view, windowInsetsCompat);
            }
        });
    }

    public static /* synthetic */ Unit onTransact(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                refreshvisibility.write();
                MultiBillerTransactionResponse multiBillerTransactionResponse = (MultiBillerTransactionResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                MultiBillerTransactionItem data = multiBillerTransactionResponse.getData();
                String deepUrl = data != null ? data.getDeepUrl() : null;
                if (deepUrl != null && deepUrl.length() != 0) {
                    MultiBillerWebviewActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiBillerWebviewActivity.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = refreshvisibility.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    FragmentActivity fragmentActivity = fragmentActivityRequireActivity;
                    MultiBillerTransactionItem data2 = multiBillerTransactionResponse.getData();
                    String deepUrl2 = data2 != null ? data2.getDeepUrl() : null;
                    String str = deepUrl2 == null ? "" : deepUrl2;
                    MultiBillerAuthResponse value = ((CustomTabsSession1ExternalSyntheticLambda1) refreshvisibility.onTransact.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String accessToken = value != null ? value.getAccessToken() : null;
                    String str2 = accessToken == null ? "" : accessToken;
                    MultiBillerTransactionItem data3 = multiBillerTransactionResponse.getData();
                    String transactionId = data3 != null ? data3.getTransactionId() : null;
                    String str3 = transactionId == null ? "" : transactionId;
                    MultiBillerTransactionItem data4 = multiBillerTransactionResponse.getData();
                    String callbackUrl = data4 != null ? data4.getCallbackUrl() : null;
                    String str4 = callbackUrl == null ? "" : callbackUrl;
                    MultiBillerTransactionItem data5 = multiBillerTransactionResponse.getData();
                    String redirectUrl = data5 != null ? data5.getRedirectUrl() : null;
                    String str5 = redirectUrl == null ? "" : redirectUrl;
                    MultiBillerTransactionItem data6 = multiBillerTransactionResponse.getData();
                    String deepUrl3 = data6 != null ? data6.getDeepUrl() : null;
                    Intent intentB = MultiBillerWebviewActivity.Companion.b(fragmentActivity, str, "Belanja", str2, str3, str4, str5, deepUrl3 == null ? "" : deepUrl3);
                    ActivityResultLauncher<Intent> activityResultLauncher = refreshvisibility.read;
                    if (activityResultLauncher != null) {
                        activityResultLauncher.launch(intentB);
                    }
                } else {
                    refreshVisibility refreshvisibility2 = refreshvisibility;
                    String string = refreshvisibility.getString(R.string.error_invalid_response);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Intrinsics.checkNotNullParameter(refreshvisibility2, "");
                    Intrinsics.checkNotNullParameter(string, "");
                    BaseActivity baseActivity = (BaseActivity) refreshvisibility2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, string, null);
                    }
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                refreshvisibility.write();
                refreshVisibility refreshvisibility3 = refreshvisibility;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(refreshvisibility3, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity2 = (BaseActivity) refreshvisibility3.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(final refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MultiStateView multiStateView = refreshvisibility.asInterface().msvBanner;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setVisibility(0);
            MultiStateView multiStateView2 = refreshvisibility.asInterface().msvBanner;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.LOADING);
            str = "loading_view_banner";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            MultiStateView multiStateView3 = refreshvisibility.asInterface().msvBanner;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
            str = "empty_view_banner";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            MultiStateView multiStateView4 = refreshvisibility.asInterface().msvBanner;
            Intrinsics.checkNotNullExpressionValue(multiStateView4, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView4, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, refreshvisibility.getString(R.string.error_error_occured), null, new Pair(refreshvisibility.getString(R.string.action_retry), new Function0() { // from class: showOverflowMenu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }));
            str = "failure_view_banner";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            MultiStateView multiStateView5 = refreshvisibility.asInterface().msvBanner;
            Intrinsics.checkNotNullExpressionValue(multiStateView5, "");
            multiStateView5.setViewState(MultiStateView.ViewState.CONTENT);
            List listTake = CollectionsKt.take((Iterable) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, 4);
            RelativeLayout relativeLayout = refreshvisibility.asInterface().containerBanner;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(0);
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            setMenuPrepared setmenuprepared = new setMenuPrepared(contextRequireContext, listTake, true, null, new Function1() { // from class: MenuWrapperICS
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (String) obj);
                }
            }, 8, null);
            LoopingViewPager loopingViewPager = refreshvisibility.asInterface().vpPromoBanner;
            loopingViewPager.setAdapter(setmenuprepared);
            refreshvisibility.asInterface().dotsIndicatorBanner.setCount(listTake.size());
            refreshvisibility.asInterface().dotsIndicatorBanner.setSelection(0);
            loopingViewPager.addOnPageChangeListener(new g(listTake, refreshvisibility));
            str = "success_view_banner";
        } else {
            str = "";
        }
        FragmentActivity activity = refreshvisibility.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_result_view_banner", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            refreshvisibility.IconCompatParcelizer();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            MltItem mltItem = (MltItem) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
            Context contextRequireContext = refreshvisibility.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String str = mltItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String string = refreshvisibility.getString(R.string.label_additional_services);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, string, 0, null, false, 56);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            refreshVisibility refreshvisibility2 = refreshvisibility;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(refreshvisibility2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity = (BaseActivity) refreshvisibility2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static /* synthetic */ Unit d(refreshVisibility refreshvisibility) {
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        AddKpjActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = AddKpjActivity.INSTANCE;
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        AddKpjActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(refreshVisibility refreshvisibility) {
        FragmentActivity activity = refreshvisibility.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_queueing_type", "pengajuan_klaim"));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter("view_queueing_pengajuan_klaim", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_queueing_pengajuan_klaim", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_queueing_pengajuan_klaim", mapMutableMapOf);
        refreshvisibility.MediaBrowserCompat = true;
        refreshvisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(refreshVisibility refreshvisibility, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            refreshvisibility.write();
            String urlAntrianOnline = ((AntrianOnlineUrlResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getUrlAntrianOnline();
            String str = urlAntrianOnline;
            if (str == null || str.length() == 0) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Link antrean informasi belum tersedia", 0).show();
            } else {
                getStreamUseCaseSupportedCombinationList getstreamusecasesupportedcombinationlist = (getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue();
                Intrinsics.checkNotNullParameter(urlAntrianOnline, "");
                getstreamusecasesupportedcombinationlist.asBinder.saveString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", urlAntrianOnline);
                WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                Context contextRequireContext = refreshvisibility.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String string = refreshvisibility.getString(R.string.label_queueing_informasi);
                Intrinsics.checkNotNullExpressionValue(string, "");
                WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, urlAntrianOnline, string, 0, null, false, 56);
            }
            ((getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeObservers(refreshvisibility.getViewLifecycleOwner());
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            refreshvisibility.write();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal mengambil link antrean: ".concat(String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2)), 0).show();
            ((getStreamUseCaseSupportedCombinationList) refreshvisibility.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeObservers(refreshvisibility.getViewLifecycleOwner());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(BsuConfig bsuConfig, refreshVisibility refreshvisibility, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (bsuConfig != null && bsuConfig.getAppWebviewBsu()) {
            getMaxImages getmaximages = getMaxImages.INSTANCE;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (Intrinsics.areEqual(str, (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[0], -460582591, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 460582600))) {
                String appLinkPortalBsu = bsuConfig.getAppLinkPortalBsu();
                if (!StringsKt.isBlank(appLinkPortalBsu)) {
                    WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
                    Context contextRequireContext = refreshvisibility.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, appLinkPortalBsu, "BPJS Ketenagakerjaan", 0, (User) refreshvisibility.connect.getValue(), true, 8);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final BsuConfig bsuConfig;
        User user;
        User user2;
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        String extras = getMaxImages.getExtras();
        getMaxImages getmaximages2 = getMaxImages.INSTANCE;
        String strRemoteActionCompatParcelizer = getMaxImages.RemoteActionCompatParcelizer();
        getMaxImages getmaximages3 = getMaxImages.INSTANCE;
        String str = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], -460582591, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 460582600);
        getMaxImages getmaximages4 = getMaxImages.INSTANCE;
        String strSearch = getMaxImages.search();
        getMaxImages getmaximages5 = getMaxImages.INSTANCE;
        String str2 = (String) getMaxImages.b(AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[0], 1692949247, AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1692949236);
        getMaxImages getmaximages6 = getMaxImages.INSTANCE;
        String strOnTransact = getMaxImages.onTransact();
        String str3 = strOnTransact;
        if (str3 == null || StringsKt.isBlank(str3)) {
            bsuConfig = null;
        } else {
            try {
                bsuConfig = (BsuConfig) new Gson().fromJson(strOnTransact, BsuConfig.class);
            } catch (JsonSyntaxException unused) {
                bsuConfig = null;
            }
        }
        if (Intrinsics.areEqual(strRemoteActionCompatParcelizer, ExifInterface.GPS_MEASUREMENT_2D)) {
            this.INotificationSideChannelDefault.add(0, new Banner("", "", str));
            this.INotificationSideChannelDefault.add(1, new Banner("", "", strSearch));
        } else if (Intrinsics.areEqual(strRemoteActionCompatParcelizer, ExifInterface.GPS_MEASUREMENT_3D)) {
            this.INotificationSideChannelDefault.add(0, new Banner("", "", str));
            this.INotificationSideChannelDefault.add(1, new Banner("", "", strSearch));
            this.INotificationSideChannelDefault.add(2, new Banner("", "", str2));
        } else {
            this.INotificationSideChannelDefault.add(0, new Banner("", "", str));
        }
        if (!Intrinsics.areEqual(extras, "true")) {
            ((flushLollipops) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BannerRequest());
        } else {
            final List<Banner> list = this.INotificationSideChannelDefault;
            RelativeLayout relativeLayout = asInterface().containerBanner;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            relativeLayout.setVisibility(0);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            setMenuPrepared setmenuprepared = new setMenuPrepared(contextRequireContext, list, true, null, new Function1() { // from class: onMenuItemActionExpand
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bsuConfig, this, (String) obj);
                }
            }, 8, null);
            ((access000) this.cancelAll.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(getViewLifecycleOwner(), new asInterface(new Function1() { // from class: shouldPreserveIconSpacing
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, list, (Integer) obj);
                }
            }));
            LoopingViewPager loopingViewPager = asInterface().vpPromoBanner;
            loopingViewPager.setAdapter(setmenuprepared);
            asInterface().dotsIndicatorBanner.setCount(list.size());
            asInterface().dotsIndicatorBanner.setSelection(0);
            loopingViewPager.addOnPageChangeListener(new asBinder());
            asInterface().btnSeeAllPromo.setVisibility(8);
            asInterface().tvPromo.setText(getString(R.string.label_name_information));
        }
        String string = ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL", "");
        if (((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).asBinder.getString("ANTRIAN_ONLINE_URL_INFOPENGADUAN", "").length() == 0 && (user2 = (User) this.connect.getValue()) != null) {
            String str4 = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str4 == null) {
                str4 = "";
            }
            AntrianOnlineUrlRequest antrianOnlineUrlRequest = new AntrianOnlineUrlRequest(str4, "", "INFOPENGADUAN", "");
            ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observeForever(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(antrianOnlineUrlRequest);
        }
        if (string.length() != 0 || (user = (User) this.connect.getValue()) == null) {
            return;
        }
        String str5 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str5 == null) {
            str5 = "";
        }
        AntrianOnlineUrlRequest antrianOnlineUrlRequest2 = new AntrianOnlineUrlRequest(str5, "", "KLAIM", "");
        ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).b.observeForever(new TuitionPaymentFragmentbindingInflater1());
        ((getStreamUseCaseSupportedCombinationList) this.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(antrianOnlineUrlRequest2);
    }

    public static /* synthetic */ Unit b(refreshVisibility refreshvisibility, Ref.ObjectRef objectRef) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(refreshVisibility refreshvisibility, String str) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, str, "Appointment Online", 0, null, false, 56);
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(refreshVisibility refreshvisibility) {
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(refreshVisibility refreshvisibility) {
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(refreshVisibility refreshvisibility, Ref.ObjectRef objectRef) {
        WebviewCustomActivity.Companion companion = WebviewCustomActivity.INSTANCE;
        Context contextRequireContext = refreshvisibility.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebviewCustomActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (String) objectRef.element, "Appointment Online", 0, null, false, 56);
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(refreshVisibility refreshvisibility) {
        getStringOrNull getstringornull = refreshvisibility.INotificationSideChannelStubProxy;
        if (getstringornull != null) {
            getstringornull.dismiss();
        }
        return Unit.INSTANCE;
    }
}
