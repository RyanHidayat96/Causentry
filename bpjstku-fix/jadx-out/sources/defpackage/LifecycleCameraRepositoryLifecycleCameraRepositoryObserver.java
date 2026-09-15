package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.utils.exts.ViewExtKt$onTextChange$2;
import com.nbs.validacion.views.ValidacionCheckBox;
import com.nbs.validacion.views.ValidacionRadioGroup;
import com.nbs.validacion.views.ValidacionSpinner;
import com.nbs.validacion.views.ValidacionSpinner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
import defpackage.LifecycleCameraRepositoryLifecycleCameraRepositoryObserver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017@\u0017X\u0096\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0017X\u0097\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"LLifecycleCameraRepositoryLifecycleCameraRepositoryObserver;", "Lr8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY;", "", "LunregisterLifecycle;", "p0", "<init>", "(Ljava/util/List;)V", "", "TuitionPaymentFragmentbindingInflater1", "(LunregisterLifecycle;)V", "LProcessCameraProvider;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LProcessCameraProvider;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Z", "LProcessCameraProvider;", "", "I", "b", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0})
public final class LifecycleCameraRepositoryLifecycleCameraRepositoryObserver implements r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY {
    private int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public ProcessCameraProvider TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final List<unregisterLifecycle> b;

    public LifecycleCameraRepositoryLifecycleCameraRepositoryObserver(List<unregisterLifecycle> list) {
        this.b = list;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LifecycleCameraRepositoryLifecycleCameraRepositoryObserver lifecycleCameraRepositoryLifecycleCameraRepositoryObserver, unregisterLifecycle unregisterlifecycle) {
        int i;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = unregisterlifecycle.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            Boolean second = unregisterlifecycle.TuitionPaymentFragmentbindingInflater1.getSecond();
            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1 != (second != null ? second.booleanValue() : false)) {
                lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentbindingInflater1++;
            }
        } else {
            Boolean second2 = unregisterlifecycle.TuitionPaymentFragmentbindingInflater1.getSecond();
            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault1 != (second2 != null ? second2.booleanValue() : false) && (i = lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentbindingInflater1) > 0) {
                lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentbindingInflater1 = i - 1;
            }
        }
        if (lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentbindingInflater1 == lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.b.size()) {
            ProcessCameraProvider processCameraProvider = lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (processCameraProvider != null) {
                processCameraProvider.getInterfaceDescriptor();
                return;
            }
            return;
        }
        ProcessCameraProvider processCameraProvider2 = lifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (processCameraProvider2 != null) {
            processCameraProvider2.INotificationSideChannelStubProxy();
        }
    }

    @Override // defpackage.r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY
    public final void TuitionPaymentFragmentbindingInflater1(final unregisterLifecycle p0) {
        View view = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (!(view instanceof EditText)) {
            if (view instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.nbs.validacion.ReactiveValidator$addValidation$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(String str) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
                        return Unit.INSTANCE;
                    }

                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
                        LifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0, p0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                EditText editText = textInputLayout.getEditText();
                if (editText != null) {
                    editText.addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new ViewExtKt$onTextChange$2(function1)));
                }
            } else if (view instanceof ValidacionRadioGroup) {
                ValidacionRadioGroup validacionRadioGroup = (ValidacionRadioGroup) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                validacionRadioGroup.b.add(new Function1<Integer, Unit>() { // from class: com.nbs.validacion.ReactiveValidator$addValidation$3
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Integer num) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
                        LifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0, p0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                validacionRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.nbs.validacion.views.ValidacionRadioGroup.3
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                        Iterator it = ValidacionRadioGroup.this.b.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(Integer.valueOf(i));
                        }
                    }

                    public AnonymousClass3() {
                    }
                });
            } else if (view instanceof ValidacionCheckBox) {
                ValidacionCheckBox validacionCheckBox = (ValidacionCheckBox) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                validacionCheckBox.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new Function1<Boolean, Unit>() { // from class: com.nbs.validacion.ReactiveValidator$addValidation$4
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Boolean bool) {
                        TuitionPaymentFragmentbindingInflater1(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void TuitionPaymentFragmentbindingInflater1(boolean z) {
                        LifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0, p0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                validacionCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.nbs.validacion.views.ValidacionCheckBox.3
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        Iterator it = ValidacionCheckBox.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(Boolean.valueOf(z));
                        }
                    }

                    public AnonymousClass3() {
                    }
                });
            } else if (view instanceof ValidacionSpinner) {
                ValidacionSpinner validacionSpinner = (ValidacionSpinner) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                validacionSpinner.TuitionPaymentFragmentbindingInflater1.add(new Function1<Integer, Unit>() { // from class: com.nbs.validacion.ReactiveValidator$addValidation$5
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Integer num) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
                        LifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0, p0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                validacionSpinner.setOnItemSelectedListener(validacionSpinner.new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            } else {
                throw new IllegalArgumentException("This type of view is not supported yet, the only supported views are EditText, TextInputLayout, ValidacionRadioGroup, ValidacionCheckBox and Validacion Spinner including their subclasses");
            }
        } else {
            ((EditText) p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2).addTextChangedListener(new suspendUseCases.TuitionPaymentFragmentbindingInflater1(new Function1<String, Unit>() { // from class: com.nbs.validacion.ReactiveValidator$addValidation$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(String str) {
                    b(str);
                    return Unit.INSTANCE;
                }

                public final void b(String str) {
                    LifecycleCameraRepositoryLifecycleCameraRepositoryObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.this$0, p0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }));
        }
        this.b.add(p0);
    }

    @Override // defpackage.r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ProcessCameraProvider p0) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = p0;
    }

    @Override // defpackage.r8lambda4cDi3AAzKeyJxm5RcPVvEasZ0OY
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        boolean z = true;
        int i = 0;
        for (Object obj : this.b) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((unregisterLifecycle) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                z = false;
            }
            i++;
        }
        ProcessCameraProvider processCameraProvider = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (z) {
            if (processCameraProvider != null) {
                processCameraProvider.getInterfaceDescriptor();
                return z;
            }
        } else if (processCameraProvider != null) {
            processCameraProvider.INotificationSideChannelStubProxy();
        }
        return z;
    }
}
