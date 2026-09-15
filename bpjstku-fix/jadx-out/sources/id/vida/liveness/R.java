package id.vida.liveness;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.chip.Chip;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionProcessor;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class R {

    public static final class anim {
        public static final int vida_anim_fade_out = 0x7f010034;
        public static final int vida_anim_slide_in = 0x7f010035;

        private anim() {
        }
    }

    public static final class attr {
        public static final int vida_bottom_sheet_dialog_round_corner_radius = 0x7f040612;
        public static final int vida_branding_logo = 0x7f040613;
        public static final int vida_branding_logo_visibility = 0x7f040614;
        public static final int vida_camera_screen_animation_stroke_color = 0x7f040615;
        public static final int vida_camera_screen_back_arrow_cta_color = 0x7f040616;
        public static final int vida_camera_screen_background_color = 0x7f040617;
        public static final int vida_camera_screen_instruction_text_color = 0x7f040618;
        public static final int vida_camera_screen_instructions_text__multiple_face_detected = 0x7f040619;
        public static final int vida_camera_screen_instructions_text_blink_your_eyes = 0x7f04061a;
        public static final int vida_camera_screen_instructions_text_eye_closed = 0x7f04061b;
        public static final int vida_camera_screen_instructions_text_eye_occlude = 0x7f04061c;
        public static final int vida_camera_screen_instructions_text_face_detected = 0x7f04061d;
        public static final int vida_camera_screen_instructions_text_face_not_straight = 0x7f04061e;
        public static final int vida_camera_screen_instructions_text_face_too_close = 0x7f04061f;
        public static final int vida_camera_screen_instructions_text_face_too_far = 0x7f040620;
        public static final int vida_camera_screen_instructions_text_font_family = 0x7f040621;
        public static final int vida_camera_screen_instructions_text_font_size = 0x7f040622;
        public static final int vida_camera_screen_instructions_text_frame_your_face_out_of_box = 0x7f040623;
        public static final int vida_camera_screen_instructions_text_image_too_dark = 0x7f040624;
        public static final int vida_camera_screen_instructions_text_left_eye_closed = 0x7f040625;
        public static final int vida_camera_screen_instructions_text_no_face = 0x7f040626;
        public static final int vida_camera_screen_instructions_text_no_face_font_family = 0x7f040627;
        public static final int vida_camera_screen_instructions_text_no_face_font_size = 0x7f040628;
        public static final int vida_camera_screen_instructions_text_right_eye_closed = 0x7f040629;
        public static final int vida_camera_screen_instructions_text_shake_head = 0x7f04062a;
        public static final int vida_camera_screen_instructions_text_smile = 0x7f04062b;
        public static final int vida_camera_screen_instructions_text_smile_and_blink_your_eyes = 0x7f04062c;
        public static final int vida_camera_screen_overlay_background_color = 0x7f04062d;
        public static final int vida_camera_screen_stroke_color = 0x7f04062e;
        public static final int vida_camera_screen_title_text = 0x7f04062f;
        public static final int vida_camera_screen_title_text_color = 0x7f040630;
        public static final int vida_camera_screen_title_text_font_family = 0x7f040631;
        public static final int vida_camera_screen_title_text_font_size = 0x7f040632;
        public static final int vida_consent_screen_back_arrow_cta_color = 0x7f040633;
        public static final int vida_consent_screen_background_color = 0x7f040634;
        public static final int vida_consent_screen_background_image = 0x7f040635;
        public static final int vida_consent_screen_background_image_visibility = 0x7f040636;
        public static final int vida_consent_screen_cta_text_continue_next_step = 0x7f040637;
        public static final int vida_consent_screen_cta_text_retake_selfie = 0x7f040638;
        public static final int vida_consent_screen_header_background_color = 0x7f040639;
        public static final int vida_consent_screen_primary_cta_text_font_family = 0x7f04063a;
        public static final int vida_consent_screen_primary_cta_text_font_size = 0x7f04063b;
        public static final int vida_consent_screen_progress_segment_color = 0x7f04063c;
        public static final int vida_consent_screen_progress_segment_text = 0x7f04063d;
        public static final int vida_consent_screen_progress_segment_text_font_family = 0x7f04063e;
        public static final int vida_consent_screen_progress_segment_text_font_size = 0x7f04063f;
        public static final int vida_consent_screen_progress_step_text_color = 0x7f040640;
        public static final int vida_consent_screen_secondary_cta_text_font_family = 0x7f040641;
        public static final int vida_consent_screen_secondary_cta_text_font_size = 0x7f040642;
        public static final int vida_consent_screen_title_text = 0x7f040643;
        public static final int vida_consent_screen_title_text_color = 0x7f040644;
        public static final int vida_consent_screen_title_text_font_family = 0x7f040645;
        public static final int vida_consent_screen_title_text_font_size = 0x7f040646;
        public static final int vida_consent_screen_total_segment_color = 0x7f040647;
        public static final int vida_error_dialog_screen_background_color = 0x7f040648;
        public static final int vida_error_dialog_screen_error_text_message_color = 0x7f040649;
        public static final int vida_error_dialog_screen_error_text_message_font_family = 0x7f04064a;
        public static final int vida_error_dialog_screen_error_text_message_font_size = 0x7f04064b;
        public static final int vida_error_dialog_screen_primary_cta_text = 0x7f04064c;
        public static final int vida_error_dialog_screen_primary_cta_text_font_size = 0x7f04064d;
        public static final int vida_error_dialog_screen_secondary_cta_text = 0x7f04064e;
        public static final int vida_error_dialog_screen_secondary_cta_text_font_size = 0x7f04064f;
        public static final int vida_image_view_border_color = 0x7f040650;
        public static final int vida_image_view_border_visibility = 0x7f040651;
        public static final int vida_image_view_border_width = 0x7f040652;
        public static final int vida_image_view_round_corner_radius = 0x7f040653;
        public static final int vida_permission_screen_background_color = 0x7f040654;
        public static final int vida_permission_screen_description_text = 0x7f040655;
        public static final int vida_permission_screen_description_text_color = 0x7f040656;
        public static final int vida_permission_screen_description_text_font_family = 0x7f040657;
        public static final int vida_permission_screen_description_text_font_size = 0x7f040658;
        public static final int vida_permission_screen_primary_cta_text = 0x7f040659;
        public static final int vida_permission_screen_primary_cta_text_font_family = 0x7f04065a;
        public static final int vida_permission_screen_primary_cta_text_font_size = 0x7f04065b;
        public static final int vida_permission_screen_secondary_cta_text = 0x7f04065c;
        public static final int vida_permission_screen_secondary_cta_text_font_family = 0x7f04065d;
        public static final int vida_permission_screen_secondary_cta_text_font_size = 0x7f04065e;
        public static final int vida_permission_screen_title_text = 0x7f04065f;
        public static final int vida_permission_screen_title_text_color = 0x7f040660;
        public static final int vida_permission_screen_title_text_font_family = 0x7f040661;
        public static final int vida_permission_screen_title_text_font_size = 0x7f040662;
        public static final int vida_primary_cta_background_color = 0x7f040663;
        public static final int vida_primary_cta_border_color = 0x7f040664;
        public static final int vida_primary_cta_text_color = 0x7f040665;
        public static final int vida_review_screen_back_arrow_cta_color = 0x7f040666;
        public static final int vida_review_screen_backend_error_message = 0x7f040667;
        public static final int vida_review_screen_backend_error_message_1041 = 0x7f040668;
        public static final int vida_review_screen_backend_error_message_1051 = 0x7f040669;
        public static final int vida_review_screen_backend_error_message_1052 = 0x7f04066a;
        public static final int vida_review_screen_backend_error_message_1053 = 0x7f04066b;
        public static final int vida_review_screen_backend_error_message_1054 = 0x7f04066c;
        public static final int vida_review_screen_backend_error_message_1055 = 0x7f04066d;
        public static final int vida_review_screen_backend_error_message_1058 = 0x7f04066e;
        public static final int vida_review_screen_backend_error_message_1059 = 0x7f04066f;
        public static final int vida_review_screen_backend_error_message_1060 = 0x7f040670;
        public static final int vida_review_screen_backend_error_message_1062 = 0x7f040671;
        public static final int vida_review_screen_backend_error_message_1063 = 0x7f040672;
        public static final int vida_review_screen_backend_error_message_1064 = 0x7f040673;
        public static final int vida_review_screen_backend_error_message_1065 = 0x7f040674;
        public static final int vida_review_screen_backend_error_message_1066 = 0x7f040675;
        public static final int vida_review_screen_background_color = 0x7f040676;
        public static final int vida_review_screen_cta_text_retake = 0x7f040677;
        public static final int vida_review_screen_cta_text_submit = 0x7f040678;
        public static final int vida_review_screen_cta_text_try_again = 0x7f040679;
        public static final int vida_review_screen_cta_text_try_later = 0x7f04067a;
        public static final int vida_review_screen_error_text_color = 0x7f04067b;
        public static final int vida_review_screen_guideline_link_color = 0x7f04067c;
        public static final int vida_review_screen_guideline_message_link = 0x7f04067d;
        public static final int vida_review_screen_guideline_message_link_font_family = 0x7f04067e;
        public static final int vida_review_screen_guideline_message_link_font_size = 0x7f04067f;
        public static final int vida_review_screen_guideline_text = 0x7f040680;
        public static final int vida_review_screen_guideline_text_color = 0x7f040681;
        public static final int vida_review_screen_guideline_text_font_family = 0x7f040682;
        public static final int vida_review_screen_guideline_text_font_size = 0x7f040683;
        public static final int vida_review_screen_instruction_text = 0x7f040684;
        public static final int vida_review_screen_instruction_text_color = 0x7f040685;
        public static final int vida_review_screen_instruction_text_font_family = 0x7f040686;
        public static final int vida_review_screen_instruction_text_font_size = 0x7f040687;
        public static final int vida_review_screen_primary_cta_text_font_family = 0x7f040688;
        public static final int vida_review_screen_primary_cta_text_font_size = 0x7f040689;
        public static final int vida_review_screen_secondary_cta_text_font_family = 0x7f04068a;
        public static final int vida_review_screen_secondary_cta_text_font_size = 0x7f04068b;
        public static final int vida_review_screen_title_text = 0x7f04068c;
        public static final int vida_review_screen_title_text_color = 0x7f04068d;
        public static final int vida_review_screen_title_text_font_family = 0x7f04068e;
        public static final int vida_review_screen_title_text_font_size = 0x7f04068f;
        public static final int vida_secondary_cta_background_color = 0x7f040690;
        public static final int vida_secondary_cta_border_color = 0x7f040691;
        public static final int vida_secondary_cta_text_color = 0x7f040692;
        public static final int vida_spinner_center_color = 0x7f040693;
        public static final int vida_spinner_end_color = 0x7f040694;
        public static final int vida_spinner_start_color = 0x7f040695;
        public static final int vida_tutorial_dialog_screen_background_color = 0x7f040696;
        public static final int vida_tutorial_dialog_screen_primary_cta_text = 0x7f040697;
        public static final int vida_tutorial_dialog_screen_sub_title_text_color = 0x7f040698;
        public static final int vida_tutorial_dialog_screen_sub_title_text_font_family = 0x7f040699;
        public static final int vida_tutorial_dialog_screen_sub_title_text_font_size = 0x7f04069a;
        public static final int vida_tutorial_dialog_screen_title_text = 0x7f04069b;
        public static final int vida_tutorial_dialog_screen_title_text_color = 0x7f04069c;
        public static final int vida_tutorial_dialog_screen_title_text_font_family = 0x7f04069d;
        public static final int vida_tutorial_dialog_screen_title_text_font_size = 0x7f04069e;
        public static final int vida_tutorial_dialog_screen_warning_text_blur_image = 0x7f04069f;
        public static final int vida_tutorial_dialog_screen_warning_text_color = 0x7f0406a0;
        public static final int vida_tutorial_dialog_screen_warning_text_font_family = 0x7f0406a1;
        public static final int vida_tutorial_dialog_screen_warning_text_font_size = 0x7f0406a2;
        public static final int vida_tutorial_dialog_screen_warning_text_head_movement = 0x7f0406a3;
        public static final int vida_tutorial_dialog_screen_warning_text_mask = 0x7f0406a4;
        public static final int vida_tutorial_dialog_screen_warning_text_multiple_face = 0x7f0406a5;
        public static final int vida_tutorial_dialog_sub_title_text = 0x7f0406a6;
        public static final int vida_tutorial_screen_back_arrow_cta_color = 0x7f0406a7;
        public static final int vida_tutorial_screen_background_color = 0x7f0406a8;
        public static final int vida_tutorial_screen_instruction_text = 0x7f0406a9;
        public static final int vida_tutorial_screen_instruction_text_color = 0x7f0406aa;
        public static final int vida_tutorial_screen_instruction_text_font_family = 0x7f0406ab;
        public static final int vida_tutorial_screen_instruction_text_font_size = 0x7f0406ac;
        public static final int vida_tutorial_screen_primary_cta_text = 0x7f0406ad;
        public static final int vida_tutorial_screen_primary_cta_text_font_family = 0x7f0406ae;
        public static final int vida_tutorial_screen_primary_cta_text_font_size = 0x7f0406af;
        public static final int vida_tutorial_screen_title_text = 0x7f0406b0;
        public static final int vida_tutorial_screen_title_text_color = 0x7f0406b1;
        public static final int vida_tutorial_screen_title_text_font_family = 0x7f0406b2;
        public static final int vida_tutorial_screen_title_text_font_size = 0x7f0406b3;
        public static final int vida_tutorial_screen_transaction_ID_background_color = 0x7f0406b4;
        public static final int vida_tutorial_screen_transaction_ID_text_color = 0x7f0406b5;
        public static final int vida_tutorial_screen_transaction_id_text = 0x7f0406b6;
        public static final int vida_tutorial_screen_transaction_id_text_font_family = 0x7f0406b7;
        public static final int vida_tutorial_screen_transaction_id_text_font_size = 0x7f0406b8;
        public static final int vida_tutorial_screen_warning_text = 0x7f0406b9;
        public static final int vida_tutorial_screen_warning_text_color = 0x7f0406ba;
        public static final int vida_tutorial_screen_warning_text_font_family = 0x7f0406bb;
        public static final int vida_tutorial_screen_warning_text_font_size = 0x7f0406bc;
        public static final int vida_tutorial_screen_wearable_text_color = 0x7f0406bd;
        public static final int vida_tutorial_screen_wearing_glass_text = 0x7f0406be;
        public static final int vida_tutorial_screen_wearing_glass_text_font_family = 0x7f0406bf;
        public static final int vida_tutorial_screen_wearing_glass_text_font_size = 0x7f0406c0;
        public static final int vida_tutorial_screen_wearing_hat_text = 0x7f0406c1;
        public static final int vida_tutorial_screen_wearing_hat_text_font_family = 0x7f0406c2;
        public static final int vida_tutorial_screen_wearing_hat_text_font_size = 0x7f0406c3;
        public static final int vida_tutorial_screen_wearing_mask_text = 0x7f0406c4;
        public static final int vida_tutorial_screen_wearing_mask_text_font_family = 0x7f0406c5;
        public static final int vida_tutorial_screen_wearing_mask_text_font_size = 0x7f0406c6;
        public static final int vida_tutorial_screen_wearing_scarf_text = 0x7f0406c7;
        public static final int vida_tutorial_screen_wearing_scarf_text_font_family = 0x7f0406c8;
        public static final int vida_tutorial_screen_wearing_scarf_text_font_size = 0x7f0406c9;
        public static final int vida_vida_error_dialog_screen_primary_cta_text_font_family = 0x7f0406ca;
        public static final int vida_vida_error_dialog_screen_secondary_cta_text_font_family = 0x7f0406cb;

        private attr() {
        }
    }

    public static final class color {
        public static final int vida_black = 0x7f060866;
        public static final int vida_black_292929 = 0x7f060867;
        public static final int vida_black_3D3D3D = 0x7f060868;
        public static final int vida_black_666666 = 0x7f060869;
        public static final int vida_black_italian_grape_443c4b = 0x7f06086a;
        public static final int vida_black_oak_4c4d4f = 0x7f06086b;
        public static final int vida_black_shark_skin_808184 = 0x7f06086c;
        public static final int vida_blue_clean_pool_59bdf1 = 0x7f06086d;
        public static final int vida_blue_clean_pool_with_alpha_50_8059bdf1 = 0x7f06086e;
        public static final int vida_blue_de_france_1078CA = 0x7f06086f;
        public static final int vida_blue_de_france_2e80e1 = 0x7f060870;
        public static final int vida_gray_EAEBEB = 0x7f060871;
        public static final int vida_gray_anthracite_cc363f41_with_alpha_80 = 0x7f060872;
        public static final int vida_gray_battle_7c8188 = 0x7f060873;
        public static final int vida_green_minty_paradise_07feb7 = 0x7f060874;
        public static final int vida_orange_F87304 = 0x7f060875;
        public static final int vida_red_pilati_ff3232 = 0x7f060876;
        public static final int vida_transparent_black = 0x7f060877;
        public static final int vida_transparent_grey = 0x7f060878;
        public static final int vida_white = 0x7f060879;
        public static final int vida_white_bleached_silk_f2f2f2 = 0x7f06087a;
        public static final int vida_white_with_alpha_100 = 0x7f06087b;
        public static final int vida_white_with_alpha_20 = 0x7f06087c;

        private color() {
        }
    }

    public static final class dimen {
        public static final int vida_layout_dim_0 = 0x7f0704b3;
        public static final int vida_layout_dim_1 = 0x7f0704b4;
        public static final int vida_layout_dim_10 = 0x7f0704b5;
        public static final int vida_layout_dim_110 = 0x7f0704b6;
        public static final int vida_layout_dim_15 = 0x7f0704b7;
        public static final int vida_layout_dim_16 = 0x7f0704b8;
        public static final int vida_layout_dim_17 = 0x7f0704b9;
        public static final int vida_layout_dim_19 = 0x7f0704ba;
        public static final int vida_layout_dim_21 = 0x7f0704bb;
        public static final int vida_layout_dim_24 = 0x7f0704bc;
        public static final int vida_layout_dim_27 = 0x7f0704bd;
        public static final int vida_layout_dim_318 = 0x7f0704be;
        public static final int vida_layout_dim_32 = 0x7f0704bf;
        public static final int vida_layout_dim_40 = 0x7f0704c0;
        public static final int vida_layout_dim_49 = 0x7f0704c1;
        public static final int vida_layout_dim_5 = 0x7f0704c2;
        public static final int vida_layout_dim_52 = 0x7f0704c3;
        public static final int vida_layout_dim_59 = 0x7f0704c4;
        public static final int vida_layout_dim_6 = 0x7f0704c5;
        public static final int vida_layout_dim_60 = 0x7f0704c6;
        public static final int vida_layout_dim_72 = 0x7f0704c7;
        public static final int vida_layout_dim_8 = 0x7f0704c8;
        public static final int vida_text_dim_10 = 0x7f0704c9;
        public static final int vida_text_dim_11 = 0x7f0704ca;
        public static final int vida_text_dim_12 = 0x7f0704cb;
        public static final int vida_text_dim_13 = 0x7f0704cc;
        public static final int vida_text_dim_14 = 0x7f0704cd;
        public static final int vida_text_dim_16 = 0x7f0704ce;
        public static final int vida_text_dim_18 = 0x7f0704cf;

        private dimen() {
        }
    }

    public static final class drawable {
        public static final int vida_background_image = 0x7f0803f7;
        public static final int vida_background_layer = 0x7f0803f8;
        public static final int vida_branding_logo = 0x7f0803f9;
        public static final int vida_detection_progress_bar_animation_green_check = 0x7f0803fa;
        public static final int vida_keyboard_backspace_arrow = 0x7f0803fb;
        public static final int vida_permission_screen_camera_image = 0x7f0803fc;
        public static final int vida_progressbar_animation = 0x7f0803fd;
        public static final int vida_ripple_effect = 0x7f0803fe;
        public static final int vida_round_button_blue_background = 0x7f0803ff;
        public static final int vida_round_button_gray_background = 0x7f080400;
        public static final int vida_tutorial_bottom_sheet_dialog_rounded_corners = 0x7f080401;
        public static final int vida_tutorial_dialog_screen_image_blur = 0x7f080402;
        public static final int vida_tutorial_dialog_screen_image_head_movement = 0x7f080403;
        public static final int vida_tutorial_dialog_screen_image_mask = 0x7f080404;
        public static final int vida_tutorial_dialog_screen_image_multiple_face = 0x7f080405;
        public static final int vida_tutorial_screen_animation = 0x7f080406;
        public static final int vida_tutorial_screen_image_glass = 0x7f080407;
        public static final int vida_tutorial_screen_image_green_tick = 0x7f080408;
        public static final int vida_tutorial_screen_image_hat = 0x7f080409;
        public static final int vida_tutorial_screen_image_mask = 0x7f08040a;
        public static final int vida_tutorial_screen_image_red_cross = 0x7f08040b;
        public static final int vida_tutorial_screen_image_scarf = 0x7f08040c;
        public static final int vida_tutorial_screen_instruction_background = 0x7f08040d;
        public static final int vida_tutorial_screen_text_background = 0x7f08040e;

        private drawable() {
        }
    }

    public static final class id {
        public static final int barrier_bottom = 0x7f0b00b9;
        public static final int cameraPreviewView = 0x7f0b0173;
        public static final int constraint_layout_content = 0x7f0b01be;
        public static final int cta_cancel = 0x7f0b0202;
        public static final int cta_enable = 0x7f0b0203;
        public static final int cta_primary = 0x7f0b0204;
        public static final int cta_proceed = 0x7f0b0205;
        public static final int cta_secondary = 0x7f0b0206;
        public static final int description = 0x7f0b0261;
        public static final int fragment_container_view = 0x7f0b03ab;
        public static final int guideline_bottom = 0x7f0b03db;
        public static final int guideline_left = 0x7f0b03dc;
        public static final int guideline_right = 0x7f0b03dd;
        public static final int image_view_animation = 0x7f0b040b;
        public static final int image_view_back_arrow = 0x7f0b040c;
        public static final int image_view_camera = 0x7f0b040d;
        public static final int image_view_glass = 0x7f0b040f;
        public static final int image_view_green_check = 0x7f0b0410;
        public static final int image_view_green_tick = 0x7f0b0411;
        public static final int image_view_hat = 0x7f0b0412;
        public static final int image_view_instruction = 0x7f0b0413;
        public static final int image_view_logo = 0x7f0b0414;
        public static final int image_view_mask = 0x7f0b0415;
        public static final int image_view_photo = 0x7f0b0416;
        public static final int image_view_red_cross = 0x7f0b0417;
        public static final int image_view_scarf = 0x7f0b0418;
        public static final int image_view_warning = 0x7f0b041c;
        public static final int instructions = 0x7f0b04f4;
        public static final int logo = 0x7f0b05b5;
        public static final int overlay_view = 0x7f0b0673;
        public static final int progressBar = 0x7f0b06e7;
        public static final int progress_bar = 0x7f0b06e8;
        public static final int progress_bar_overlay_view = 0x7f0b06eb;
        public static final int progress_overlay_view = 0x7f0b06ef;
        public static final int recyclerView = 0x7f0b072c;
        public static final int root = 0x7f0b075c;
        public static final int scrollView = 0x7f0b07ca;
        public static final int scrollview = 0x7f0b07ce;
        public static final int segmentedProgressBar = 0x7f0b07e3;
        public static final int text_error_message = 0x7f0b086c;
        public static final int text_view_cap = 0x7f0b0894;
        public static final int text_view_desc = 0x7f0b0896;
        public static final int text_view_glass = 0x7f0b0897;
        public static final int text_view_guideline_message = 0x7f0b0898;
        public static final int text_view_instruction = 0x7f0b0899;
        public static final int text_view_mask = 0x7f0b089a;
        public static final int text_view_scarf = 0x7f0b089d;
        public static final int text_view_segmented_progress_steps = 0x7f0b089e;
        public static final int text_view_sub_title = 0x7f0b089f;
        public static final int text_view_title = 0x7f0b08a0;
        public static final int text_view_transaction_id = 0x7f0b08a1;
        public static final int text_view_warning = 0x7f0b08a2;
        public static final int title = 0x7f0b096f;

        private id() {
        }
    }

    public static final class integer {
        public static final int vida_image_view_border_width = 0x7f0c004a;
        public static final int vida_image_view_round_corner_radius = 0x7f0c004b;
        public static final int vida_preview_height = 0x7f0c004c;
        public static final int vida_preview_width = 0x7f0c004d;

        private integer() {
        }
    }

    public static final class string {
        public static final int vida_app_name = 0x7f140bdf;
        public static final int vida_authentication_error = 0x7f140be0;
        public static final int vida_backend_liveness_is_not_configured = 0x7f140be1;
        public static final int vida_bad_response_server = 0x7f140be2;
        public static final int vida_camera_permission = 0x7f140be3;
        public static final int vida_camera_screen_instructions_blink_smile_and_your_eyes = 0x7f140be4;
        public static final int vida_camera_screen_instructions_blink_your_eyes = 0x7f140be5;
        public static final int vida_camera_screen_instructions_shake_head = 0x7f140be6;
        public static final int vida_camera_screen_instructions_smile = 0x7f140be7;
        public static final int vida_camera_screen_instructions_text__multiple_face_detected = 0x7f140be8;
        public static final int vida_camera_screen_instructions_text_eye_closed = 0x7f140be9;
        public static final int vida_camera_screen_instructions_text_eye_occlude = 0x7f140bea;
        public static final int vida_camera_screen_instructions_text_face_detected = 0x7f140beb;
        public static final int vida_camera_screen_instructions_text_face_not_straight = 0x7f140bec;
        public static final int vida_camera_screen_instructions_text_face_too_close = 0x7f140bee;
        public static final int vida_camera_screen_instructions_text_face_too_far = 0x7f140bef;
        public static final int vida_camera_screen_instructions_text_frame_your_face_out_of_box = 0x7f140bf0;
        public static final int vida_camera_screen_instructions_text_image_too_dark = 0x7f140bf2;
        public static final int vida_camera_screen_instructions_text_left_eye_closed = 0x7f140bf3;
        public static final int vida_camera_screen_instructions_text_no_face = 0x7f140bf4;
        public static final int vida_camera_screen_instructions_text_right_eye_closed = 0x7f140bf5;
        public static final int vida_camera_screen_title_text = 0x7f140bf6;
        public static final int vida_camera_start_failed = 0x7f140bf7;
        public static final int vida_consent_screen_cta_text_continue_next_step = 0x7f140bf8;
        public static final int vida_consent_screen_cta_text_retake_selfie = 0x7f140bf9;
        public static final int vida_consent_screen_progress_segment = 0x7f140bfa;
        public static final int vida_consent_screen_title_text = 0x7f140bfb;
        public static final int vida_copied_to_clipboard = 0x7f140bfc;
        public static final int vida_detection_timeout_error = 0x7f140bfd;
        public static final int vida_encryption_error = 0x7f140bfe;
        public static final int vida_encryption_error_empty = 0x7f140bff;
        public static final int vida_encryption_error_json_object = 0x7f140c00;
        public static final int vida_encryption_error_null_object = 0x7f140c01;
        public static final int vida_error_dialog_screen_primary_cta_text = 0x7f140c02;
        public static final int vida_error_dialog_screen_secondary_cta_text = 0x7f140c03;
        public static final int vida_error_image_signing_failed = 0x7f140c04;
        public static final int vida_error_license_key_not_found = 0x7f140c05;
        public static final int vida_error_unable_to_decrypt_message = 0x7f140c06;
        public static final int vida_face_detection_failed_with_error = 0x7f140c07;
        public static final int vida_general_network_error = 0x7f140c08;
        public static final int vida_general_network_error_timeout = 0x7f140c09;
        public static final int vida_image_captured_failed = 0x7f140c0a;
        public static final int vida_internal_detection_error_detected_image_is_null = 0x7f140c0b;
        public static final int vida_internal_server_error = 0x7f140c0c;
        public static final int vida_invalid_parameter = 0x7f140c0d;
        public static final int vida_liveliness_invalid_gesture_combination = 0x7f140c0e;
        public static final int vida_liveliness_invalid_progress_configuration = 0x7f140c0f;
        public static final int vida_liveliness_object_active = 0x7f140c10;
        public static final int vida_liveliness_sdk_not_initialized = 0x7f140c11;
        public static final int vida_liveness_check_has_failed = 0x7f140c12;
        public static final int vida_max_retry_exhausted = 0x7f140c13;
        public static final int vida_network_error = 0x7f140c14;
        public static final int vida_network_not_available = 0x7f140c15;
        public static final int vida_no_network_message = 0x7f140c16;
        public static final int vida_null_json_response_from_server = 0x7f140c17;
        public static final int vida_open_with = 0x7f140c18;
        public static final int vida_parse_error = 0x7f140c19;
        public static final int vida_permission_screen_description_text = 0x7f140c1a;
        public static final int vida_permission_screen_primary_cta_text = 0x7f140c1b;
        public static final int vida_permission_screen_secondary_cta_text = 0x7f140c1c;
        public static final int vida_permission_screen_title_text = 0x7f140c1d;
        public static final int vida_review_screen_backend_error_message = 0x7f140c1e;
        public static final int vida_review_screen_backend_error_message_1041 = 0x7f140c1f;
        public static final int vida_review_screen_backend_error_message_1051 = 0x7f140c20;
        public static final int vida_review_screen_backend_error_message_1052 = 0x7f140c21;
        public static final int vida_review_screen_backend_error_message_1053 = 0x7f140c22;
        public static final int vida_review_screen_backend_error_message_1054 = 0x7f140c23;
        public static final int vida_review_screen_backend_error_message_1055 = 0x7f140c24;
        public static final int vida_review_screen_backend_error_message_1058 = 0x7f140c25;
        public static final int vida_review_screen_backend_error_message_1059 = 0x7f140c26;
        public static final int vida_review_screen_backend_error_message_1060 = 0x7f140c27;
        public static final int vida_review_screen_backend_error_message_1062 = 0x7f140c28;
        public static final int vida_review_screen_backend_error_message_1063 = 0x7f140c29;
        public static final int vida_review_screen_backend_error_message_1064 = 0x7f140c2a;
        public static final int vida_review_screen_backend_error_message_1065 = 0x7f140c2b;
        public static final int vida_review_screen_backend_error_message_1066 = 0x7f140c2c;
        public static final int vida_review_screen_cta_text_retake = 0x7f140c2d;
        public static final int vida_review_screen_cta_text_submit = 0x7f140c2e;
        public static final int vida_review_screen_cta_text_try_again = 0x7f140c2f;
        public static final int vida_review_screen_cta_text_try_later = 0x7f140c30;
        public static final int vida_review_screen_guideline_message_link = 0x7f140c31;
        public static final int vida_review_screen_guideline_text = 0x7f140c32;
        public static final int vida_review_screen_instruction_text = 0x7f140c33;
        public static final int vida_review_screen_title_text = 0x7f140c34;
        public static final int vida_sdk_general_error = 0x7f140c35;
        public static final int vida_threat_detected_error = 0x7f140c36;
        public static final int vida_tutorial_dialog_screen_primary_cta_text = 0x7f140c37;
        public static final int vida_tutorial_dialog_screen_title_text = 0x7f140c38;
        public static final int vida_tutorial_dialog_screen_warning_text_blur_image = 0x7f140c39;
        public static final int vida_tutorial_dialog_screen_warning_text_head_movement = 0x7f140c3a;
        public static final int vida_tutorial_dialog_screen_warning_text_mask = 0x7f140c3b;
        public static final int vida_tutorial_dialog_screen_warning_text_multiple_face = 0x7f140c3c;
        public static final int vida_tutorial_dialog_sub_title_text = 0x7f140c3d;
        public static final int vida_tutorial_screen_instruction_text = 0x7f140c3e;
        public static final int vida_tutorial_screen_primary_cta_text = 0x7f140c3f;
        public static final int vida_tutorial_screen_title_text = 0x7f140c40;
        public static final int vida_tutorial_screen_transaction_id_text = 0x7f140c41;
        public static final int vida_tutorial_screen_warning_text = 0x7f140c42;
        public static final int vida_tutorial_screen_wearing_glass_text = 0x7f140c43;
        public static final int vida_tutorial_screen_wearing_hat_text = 0x7f140c44;
        public static final int vida_tutorial_screen_wearing_mask_text = 0x7f140c45;
        public static final int vida_tutorial_screen_wearing_scarf_text = 0x7f140c46;
        public static final int vida_unable_to_parse_information = 0x7f140c47;
        public static final int vida_unknown_error_encryption = 0x7f140c48;
        public static final int vida_unknown_error_processing_validate = 0x7f140c49;
        public static final int vida_unknown_error_sending_request = 0x7f140c4a;
        public static final int vida_unknown_error_while_decrypting_response = 0x7f140c4b;
        public static final int vida_unknown_error_while_encrypting_data = 0x7f140c4c;
        public static final int vida_unknown_error_while_fetching_store_key = 0x7f140c4d;
        public static final int vida_unknown_error_while_generating_key_hash = 0x7f140c4e;
        public static final int vida_user_canceled_liveness = 0x7f140c4f;
        public static final int vida_user_canceled_liveness_with_back = 0x7f140c50;
        public static final int vida_validate_in_progress = 0x7f140c51;

        private string() {
        }
    }

    public static final class style {
        public static final int VIDALivenessTheme = 0x7f1503ec;
        public static final int VIDA_Liveness_Theme_Default = 0x7f1503eb;
        public static final int VidaBottomSheetDialogTheme = 0x7f1503ee;
        public static final int VidaBottomSheetStyle = 0x7f1503ef;

        private style() {
        }
    }

    private R() {
    }

    public static final class raw {
        public static final int keep = 0x7f130005;
        private static final byte[] $$a = {67, -127, -109, 9};
        private static final int $$b = 176;
        private static int $10 = 0;
        private static int $11 = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1050a = 0;
        private static int asBinder = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 27901;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 20847;
        private static char TuitionPaymentFragmentbindingInflater1 = 56834;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 60825;
        private static int[] b = {-1441307681, 35771133, 1287862192, 1459778805, -610377229, -1615700309, 1881475924, -1997632935, -2095089075, 2029924324, 1796490826, 470705909, 1980957473, 227595165, 960030656, -941884753, 545531711, -1061283825};

        private raw() {
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i4 = $10 + 69;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 58224;
                    int i7 = 0;
                    while (i7 < 16) {
                        int i8 = $10 + 83;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                        int i11 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            objArr2[2] = Integer.valueOf(i11);
                            objArr2[1] = Integer.valueOf(i10);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c3 = (char) ((TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47773);
                                int i12 = (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 468;
                                int iIndexOf = 13 - TextUtils.indexOf("", "", i3, i3);
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, i12, iIndexOf, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            int i13 = i7;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16824989), 468 - KeyEvent.keyCodeFromString(""), 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                            i7 = i13 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2323 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 45, -1312321721, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
            }
        }

        private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = b;
            long j = 0;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 105;
                    $10 = i8 % 128;
                    int i9 = i8 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 3290, 31 - (ViewConfiguration.getTouchSlop() >> 8), 1948206109, false, $$c(b2, (byte) (b2 - 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i7++;
                        i2 = 2;
                        j = 0;
                        i4 = -1870535734;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = b;
            char c = '0';
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $10 + 123;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        try {
                            Object[] objArr3 = new Object[i5];
                            objArr3[i6] = Integer.valueOf(iArr5[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) i6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", c) + i5), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3291, View.MeasureSpec.makeMeasureSpec(i6, i6) + 31, 1948206109, false, $$c(b3, (byte) (b3 - 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i10 %= 0;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        length3 = length3;
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.blue(0) + 3291, 30 - MotionEvent.axisFromString(""), 1948206109, false, $$c(b4, (byte) (b4 - 1), (byte) $$a.length), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i10++;
                    }
                    length3 = length3;
                    c = '0';
                    i5 = 1;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            int i12 = i6;
            System.arraycopy(iArr5, i12, iArr4, i12, length2);
            int i13 = 2;
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i14 = $11 + 41;
                $10 = i14 % 128;
                int i15 = i14 % i13;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i16 = 17;
                for (int i17 = 1; i16 > i17; i17 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionType(0L) + 2559, View.MeasureSpec.getMode(0) + 29, 683220507, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i16--;
                }
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 28880), 348 - (ViewConfiguration.getWindowTouchSlop() >> 8), 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                int i20 = $11 + 115;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                i13 = 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2, types: [int] */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r7v25 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
            ?? NewInstance;
            int i3;
            int i4;
            int i5;
            int i6;
            Object obj;
            int i7 = 2 % 2;
            if (context != null) {
                int i8 = asBinder + 41;
                f1050a = i8 % 128;
                int i9 = i8 % 2;
                try {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                    int i10 = packedPositionChild * (-167);
                    int i11 = (i10 ^ (-5344)) + ((i10 & (-5344)) << 1);
                    int i12 = ~packedPositionChild;
                    int i13 = ~((i12 ^ (-33)) | (i12 & (-33)));
                    int i14 = ~i;
                    int i15 = ~((-33) | i14);
                    int i16 = ((i11 - (~(((i13 ^ i15) | (i13 & i15)) * 168))) - 1) + ((~((i12 ^ (-33)) | (i12 & (-33)) | i)) * 168);
                    int i17 = ~(i12 | i14);
                    int i18 = ~((~packedPositionChild) | 32);
                    int i19 = (i17 & i18) | (i17 ^ i18);
                    int i20 = ((-33) & packedPositionChild) | ((-33) ^ packedPositionChild);
                    int i21 = ~((i20 & i) | (i20 ^ i));
                    int i22 = i16 + (((i19 & i21) | (i19 ^ i21)) * 168);
                    Object[] objArr = new Object[1];
                    c(new char[]{58503, 58378, 63917, 4199, 18215, 52423, 19763, 35607, 42177, 23796, 56401, 35611, 44751, 34231, 44533, 8781, 8431, 38957, 7390, 50916, 29797, 40361, 14577, 59988, 43968, 28766, 54987, 35823, 64815, 47803, 40106, 19187, 61686, 54292}, i22, objArr);
                    NewInstance = (String) objArr[0];
                    try {
                        try {
                            Object[] objArr2 = new Object[1];
                            c(new char[]{1359, 53920, 1575, 20933, 54685, 61020, 4526, 35438, 34208, 47528, 9597, 47631, 37468, 62029, 7170, 40948, 24204, 35505, 30889, 2607, 43218, 227, 41618, 3586, 27434, 64395, 55027, 18640, 17889, 43906, 33418, 43453, 17624, 55181, 56174, 20166, 50453, 40811, 21834, 58322}, 37 - (~(-(-KeyEvent.normalizeMetaState(0)))), objArr2);
                            NewInstance = Class.forName((String) objArr2[0]).getDeclaredConstructor(String.class).newInstance(NewInstance);
                            int[] iArr = {484376533, -1821246008, -693883257, 1716799422, -506727627, 353635522, -1137199430, -1318413935, -1850797153, 1867544690, -1363934479, -354005630, 1984556648, -1398073725, 2120089421, -445891943, 811264959, -1833777016};
                            int i23 = f1050a + 19;
                            asBinder = i23 % 128;
                            int i24 = i23 % 2;
                            int iIndexOf = TextUtils.indexOf("", "", 0);
                            int i25 = iIndexOf * 530;
                            int i26 = (i25 ^ 1058) + ((i25 & 1058) << 1) + 16430;
                            int i27 = ~i;
                            int i28 = ~((i27 ^ iIndexOf) | (i27 & iIndexOf));
                            int i29 = asBinder;
                            int i30 = (i29 ^ 63) + ((i29 & 63) << 1);
                            f1050a = i30 % 128;
                            if (i30 % 2 != 0) {
                                int i31 = ~((iIndexOf ^ 31) | (iIndexOf & 31));
                                i5 = i26 << (529 >>> ((i28 ^ i31) | (i31 & i28)));
                            } else {
                                int i32 = ~((iIndexOf ^ 31) | (iIndexOf & 31));
                                int i33 = ((i28 ^ i32) | (i32 & i28)) * 529;
                                i5 = (i33 | i26) + (i26 & i33);
                            }
                            int i34 = ~(iIndexOf | i);
                            int i35 = 529 * ((i34 & (-32)) | ((-32) ^ i34));
                            int i36 = (i5 ^ i35) + ((i5 & i35) << 1);
                            Object[] objArr3 = new Object[1];
                            d(iArr, i36, objArr3);
                            String str = (String) objArr3[0];
                            int i37 = asBinder + 115;
                            f1050a = i37 % 128;
                            int i38 = i37 % 2;
                            try {
                                Object[] objArr4 = {str};
                                char[] cArr = {1359, 53920, 1575, 20933, 54685, 61020, 4526, 35438, 34208, 47528, 9597, 47631, 37468, 62029, 7170, 40948, 24204, 35505, 30889, 2607, 43218, 227, 41618, 3586, 27434, 64395, 55027, 18640, 17889, 43906, 33418, 43453, 17624, 55181, 56174, 20166, 50453, 40811, 21834, 58322};
                                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                int i39 = asBinder;
                                int i40 = ((i39 | 93) << 1) - (i39 ^ 93);
                                int i41 = i40 % 128;
                                f1050a = i41;
                                int i42 = i40 % 2;
                                int i43 = -keyRepeatTimeout;
                                int i44 = i43 * (-574);
                                int i45 = i41 + 73;
                                int i46 = i45 % 128;
                                asBinder = i46;
                                int i47 = i45 % 2;
                                int i48 = (i44 & (-21812)) + (i44 | (-21812));
                                int i49 = ~i43;
                                int i50 = i46 + 51;
                                int i51 = i50 % 128;
                                f1050a = i51;
                                int i52 = i50 % 2;
                                int i53 = ~((i49 ^ i14) | (i49 & i14));
                                int i54 = ~(((-39) ^ i) | ((-39) & i));
                                int i55 = i48 + (1150 * ((i53 ^ i54) | (i53 & i54)));
                                int i56 = ((~((i14 ^ 38) | (i14 & 38))) | i54) * (-575);
                                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                                int i58 = i51 + 73;
                                asBinder = i58 % 128;
                                int i59 = i58 % 2;
                                int i60 = ~i43;
                                int i61 = ((~((i43 & i27) | (i27 ^ i43))) | (~((i60 & i) | (i60 ^ i)))) * 575;
                                int i62 = (i57 & i61) + (i61 | i57);
                                Object[] objArr5 = new Object[1];
                                c(cArr, i62, objArr5);
                                Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr4);
                                try {
                                    char[] cArr2 = {2648, 5384, 28459, 24928, 52088, 55489, 46278, 41241, 15888, 21052, 50820, 51039, 42274, 28293, 28508, 41041, 58752, 46152, 59116, 27834, 41410, 41352, 48818, 38234, 12466, 5695};
                                    int i63 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    int i64 = i63 * 784;
                                    int i65 = asBinder;
                                    int i66 = (i65 ^ 51) + ((i65 & 51) << 1);
                                    f1050a = i66 % 128;
                                    if (i66 % 2 != 0) {
                                        i6 = ((i64 & 759) + (i64 | 759)) >>> (-807);
                                    } else {
                                        int i67 = i64 - 17986;
                                        i6 = ((i67 | 18792) << 1) - (i67 ^ 18792);
                                    }
                                    int i68 = i6 + ((-783) * (~((~i63) | i14 | 23)));
                                    int i69 = ~i63;
                                    int i70 = ~((i14 ^ 23) | (i14 & 23));
                                    int i71 = -(-(((i69 & i70) | (i69 ^ i70)) * 783));
                                    int i72 = (i68 & i71) + (i71 | i68);
                                    Object[] objArr6 = new Object[1];
                                    c(cArr2, i72, objArr6);
                                    Class<?> cls = Class.forName((String) objArr6[0]);
                                    char[] cArr3 = {51812, 9372, 60083, 28309, 10138, 41824, 50005, 56624, 24067, 18634, 22683, 65438, 23024, 30744, 9365, 53510, 1988, 5152, 37733, 43442};
                                    int i73 = asBinder;
                                    int i74 = (i73 & 45) + (i73 | 45);
                                    f1050a = i74 % 128;
                                    int i75 = i74 % 2;
                                    int i76 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                    int i77 = ((i76 | 17) << 1) - (i76 ^ 17);
                                    Object[] objArr7 = new Object[1];
                                    c(cArr3, i77, objArr7);
                                    Method method = cls.getMethod((String) objArr7[0], null);
                                    int i78 = f1050a + 109;
                                    asBinder = i78 % 128;
                                    int i79 = i78 % 2;
                                    Object objInvoke = method.invoke(context, null);
                                    int i80 = f1050a + 69;
                                    int i81 = i80 % 128;
                                    asBinder = i81;
                                    int i82 = i80 % 2;
                                    int i83 = i81 + 111;
                                    f1050a = i83 % 128;
                                    int i84 = i83 % 2;
                                    try {
                                        char[] cArr4 = {2648, 5384, 28459, 24928, 52088, 55489, 46278, 41241, 15888, 21052, 50820, 51039, 42274, 28293, 28508, 41041, 58752, 46152, 59116, 27834, 41410, 41352, 48818, 38234, 12466, 5695};
                                        int i85 = -(Process.myPid() >> 22);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i86 = i85 * (-1965);
                                        int i87 = f1050a + 69;
                                        int i88 = i87 % 128;
                                        asBinder = i88;
                                        int i89 = i87 % 2;
                                        int i90 = (i86 ^ 22632) + ((i86 & 22632) << 1) + ((i85 | (-24)) * 983);
                                        int i91 = ~i85;
                                        int i92 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i93 = ~(((-24) ^ i92) | ((-24) & i92));
                                        int i94 = -(-(((i91 ^ i93) | (i93 & i91)) * (-983)));
                                        int i95 = ((i90 | i94) << 1) - (i94 ^ i90);
                                        int i96 = ~i85;
                                        int i97 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i96);
                                        int i98 = (i88 & 3) + (i88 | 3);
                                        f1050a = i98 % 128;
                                        int i99 = i98 % 2;
                                        Object[] objArr8 = new Object[1];
                                        c(cArr4, i95 + (983 * ((~(i96 | 23)) | i97)), objArr8);
                                        Class<?> cls2 = Class.forName((String) objArr8[0]);
                                        char[] cArr5 = {1743, 31601, 38901, 26193, 8058, 5813, 61429, 49958, 10415, 24082, 20476, 51164, 24254, 12055, 39628, 38431};
                                        int i100 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                        int i101 = i100 * (-51);
                                        int i102 = (i101 ^ 742) + ((i101 & 742) << 1);
                                        int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i104 = i103 | i100;
                                        int i105 = i102 + ((~((i104 ^ 14) | (i104 & 14))) * 52);
                                        int i106 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                        int i107 = (~(((-15) ^ i106) | ((-15) & i106))) | (~(((-15) ^ i100) | ((-15) & i100)));
                                        int i108 = asBinder;
                                        int i109 = ((i108 | 95) << 1) - (i108 ^ 95);
                                        f1050a = i109 % 128;
                                        int i110 = i109 % 2;
                                        int i111 = (i105 - (~((-52) * (i107 | (~((i103 & i100) | (i103 ^ i100))))))) - 1;
                                        int i112 = ~i100;
                                        int i113 = i111 + (((~((i112 & i106) | (i112 ^ i106))) | (~((~i100) | 14))) * 52);
                                        try {
                                            Object[] objArr9 = new Object[1];
                                            c(cArr5, i113, objArr9);
                                            try {
                                                Object[] objArr10 = {cls2.getMethod((String) objArr9[0], null).invoke(context, null), 64};
                                                int i114 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                int i115 = ((i114 | 33) << 1) - (i114 ^ 33);
                                                Object[] objArr11 = new Object[1];
                                                c(new char[]{64190, 45589, 62262, 65032, 47823, 54317, 39359, 4936, 23235, 18834, 28002, 25519, 7720, 38927, 25560, 56631, 51210, 51738, 45737, 60973, 55545, 18331, 11898, 47120, 20498, 46189, 54930, 4329, 49175, 10029, 44214, 43571, 32609, 13395, 3152, 54168}, i115, objArr11);
                                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                                int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                int i116 = edgeSlop * (-575);
                                                int i117 = (i116 & (-8050)) + (i116 | (-8050));
                                                int i118 = ~edgeSlop;
                                                int i119 = ~((i118 ^ (-15)) | (i118 & (-15)));
                                                int i120 = ~(((-15) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-15) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                                int i121 = -(-(((i119 & i120) | (i119 ^ i120)) * 576));
                                                int i122 = ((i117 | i121) << 1) - (i117 ^ i121);
                                                int i123 = ~((i118 & 14) | (i118 ^ 14));
                                                int i124 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                int i125 = ~((i124 & (-15)) | ((-15) ^ i124) | edgeSlop);
                                                int i126 = ((i125 & i123) | (i123 ^ i125)) * 576;
                                                int i127 = (i122 ^ i126) + ((i126 & i122) << 1);
                                                int i128 = ~edgeSlop;
                                                int i129 = (~((i128 & (-15)) | (i128 ^ (-15)))) * 576;
                                                int i130 = ((i127 | i129) << 1) - (i129 ^ i127);
                                                Object[] objArr12 = new Object[1];
                                                d(new int[]{-773202307, 975535266, -456947751, 988171226, -738130597, 278547750, 1420886308, 141977918, -1304414912, -2011506468}, i130, objArr12);
                                                Object objInvoke2 = cls3.getMethod((String) objArr12[0], String.class, Integer.TYPE).invoke(objInvoke, objArr10);
                                                try {
                                                    int[] iArr2 = {1654940331, 2119452284, -1143163692, 370657025, 162109018, 1685417598, 895736063, 1104784544, 1678424975, 248455079, 1032883084, 1345115994, -2132248656, -1625957724, 1175104815, -1193764472, -1133854022, -970065443};
                                                    int i131 = f1050a + 73;
                                                    asBinder = i131 % 128;
                                                    int i132 = i131 % 2;
                                                    int i133 = -(-TextUtils.indexOf("", "", 0, 0));
                                                    int i134 = (i133 ^ 30) + ((i133 & 30) << 1);
                                                    Object[] objArr13 = new Object[1];
                                                    d(iArr2, i134, objArr13);
                                                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                                                    Object[] objArr14 = new Object[1];
                                                    d(new int[]{637810340, -1710833590, -460563492, -1267284393, 2087934180, 1688719513, 565129851, -158913569}, 9 - Process.getGidForName(""), objArr14);
                                                    Object[] objArr15 = (Object[]) cls4.getField((String) objArr14[0]).get(objInvoke2);
                                                    int length = objArr15.length;
                                                    int i135 = 0;
                                                    while (true) {
                                                        if (i135 < length) {
                                                            Object obj2 = objArr15[i135];
                                                            Object[] objArr16 = new Object[1];
                                                            d(new int[]{579232500, 890331687, 1105902302, 1170187416, 1634220764, -1345496540}, 4 - ExpandableListView.getPackedPositionChild(0L), objArr16);
                                                            try {
                                                                Object[] objArr17 = {(String) objArr16[0]};
                                                                int i136 = -Process.getGidForName("");
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                int i137 = i136 * 253;
                                                                int i138 = (i137 ^ 9108) + ((i137 & 9108) << 1);
                                                                int i139 = ~i136;
                                                                int i140 = ~((i139 & (-37)) | (i139 ^ (-37)));
                                                                int i141 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                int i142 = i140 | (~(((-37) ^ i141) | ((-37) & i141)));
                                                                int i143 = (i136 ^ 36) | (i136 & 36);
                                                                Object[] objArr18 = objArr15;
                                                                int i144 = ~(i143 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                                int i145 = i138 + (((i142 ^ i144) | (i144 & i142)) * (-252));
                                                                int i146 = -(-(i143 * (-252)));
                                                                int i147 = (i145 & i146) + (i146 | i145);
                                                                int i148 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                int i149 = (i148 & (-37)) | ((-37) ^ i148);
                                                                int i150 = ~((i149 & i136) | (i149 ^ i136));
                                                                int i151 = i136 | 36;
                                                                int i152 = ~((i151 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i151 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                                                int i153 = -(-(((i150 & i152) | (i150 ^ i152)) * 252));
                                                                int i154 = ((i147 | i153) << 1) - (i153 ^ i147);
                                                                Object[] objArr19 = new Object[1];
                                                                d(new int[]{1607231435, 219454270, 1176989729, 752866953, 2084759762, -1273028800, -1993657108, 1333734416, 1053609000, 1599732796, -1562637137, -1917412978, -626223358, -1258722863, -71580035, -1571181661, -14053935, 1884881811, -438520593, 640016433, 1564148670, -2052030779}, i154, objArr19);
                                                                Class<?> cls5 = Class.forName((String) objArr19[0]);
                                                                int i155 = -Color.rgb(0, 0, 0);
                                                                int i156 = ((i155 | (-16777205)) << 1) - (i155 ^ (-16777205));
                                                                Object[] objArr20 = new Object[1];
                                                                c(new char[]{29764, 56207, 44508, 33260, 50061, 19013, 16985, 3647, 33633, 4072, 28422, 21721, 18997, 25473}, i156, objArr20);
                                                                Object objInvoke3 = cls5.getMethod((String) objArr20[0], String.class).invoke(null, objArr17);
                                                                try {
                                                                    int i157 = -View.getDefaultSize(0, 0);
                                                                    int i158 = (i157 * (-721)) - 20188;
                                                                    int i159 = ~i157;
                                                                    int i160 = ((~((i159 ^ (-29)) | (i159 & (-29)))) | i27 | (~(i157 | 28))) * 1444;
                                                                    int i161 = ((i158 | i160) << 1) - (i158 ^ i160);
                                                                    int i162 = ~((i157 ^ 28) | (i157 & 28));
                                                                    int i163 = ~((i157 ^ i) | (i157 & i));
                                                                    int i164 = (i162 ^ i163) | (i162 & i163);
                                                                    int i165 = ~((i ^ 28) | (i & 28));
                                                                    int i166 = -(-(((i164 ^ i165) | (i164 & i165)) * (-1444)));
                                                                    int i167 = ((i161 | i166) << 1) - (i166 ^ i161);
                                                                    int i168 = ~((i159 ^ 28) | (i159 & 28));
                                                                    int i169 = ~((i157 & (-29)) | ((-29) ^ i157));
                                                                    int i170 = i167 + (((i169 & i168) | (i168 ^ i169)) * 722);
                                                                    Object[] objArr21 = new Object[1];
                                                                    c(new char[]{2337, 23392, 25319, 13620, 8550, 37111, 26239, 31538, 27009, 45875, 21117, 34216, 8874, 14955, 37986, 55155, 50045, 28145, 47334, 63752, 12455, 38075, 61844, 24991, 56186, 30843, 40966, 48375, 5651, 17735}, i170, objArr21);
                                                                    Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                                    int i171 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                    int i172 = (i171 * 659) - 7884;
                                                                    int i173 = ~i171;
                                                                    int i174 = ~((i173 & 12) | (i173 ^ 12));
                                                                    int i175 = ((-13) ^ i171) | ((-13) & i171);
                                                                    int i176 = length;
                                                                    int i177 = ~i175;
                                                                    int i178 = (i174 ^ i177) | (i177 & i174);
                                                                    int i179 = ~((i171 ^ i) | (i171 & i));
                                                                    int i180 = ((i178 ^ i179) | (i178 & i179)) * (-658);
                                                                    int i181 = (i172 & i180) + (i180 | i172);
                                                                    int i182 = (~i175) * 658;
                                                                    int i183 = (i181 ^ i182) + ((i181 & i182) << 1);
                                                                    int i184 = ~(((-13) & i171) | ((-13) ^ i171));
                                                                    int i185 = -(-(((i184 & i179) | (i184 ^ i179)) * 658));
                                                                    int i186 = (i183 & i185) + (i185 | i183);
                                                                    Object[] objArr22 = new Object[1];
                                                                    c(new char[]{23211, 20945, 24857, 58447, 19166, 36906, 36957, 46682, 26791, 63269, 59280, 822, 48098, 13105}, i186, objArr22);
                                                                    try {
                                                                        Object[] objArr23 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr22[0], null).invoke(obj2, null))};
                                                                        int i187 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                        int i188 = ~((~i187) | (-39));
                                                                        int i189 = ~(((-39) & i) | ((-39) ^ i));
                                                                        int i190 = ((i187 * (-103)) - 3914) + (((i188 & i189) | (i188 ^ i189)) * 104);
                                                                        int i191 = -(-((~((i27 ^ i187) | (i27 & i187) | 38)) * (-104)));
                                                                        int i192 = (((i190 & i191) + (i190 | i191)) - (~(-(-((i187 | i) * 104))))) - 1;
                                                                        Object[] objArr24 = new Object[1];
                                                                        d(new int[]{1607231435, 219454270, 1176989729, 752866953, 2084759762, -1273028800, -1993657108, 1333734416, 1053609000, 1599732796, -1562637137, -1917412978, -626223358, -1258722863, -71580035, -1571181661, -14053935, 1884881811, -438520593, 640016433, 1564148670, -2052030779}, i192, objArr24);
                                                                        Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                                        int i193 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                        int i194 = (i193 ^ 19) + ((i193 & 19) << 1);
                                                                        Object[] objArr25 = new Object[1];
                                                                        c(new char[]{15211, 35365, 64236, 39154, 49586, 30848, 4538, 47474, 41488, 64159, 64326, 23116, 36217, 37288, 44657, 21566, 6201, 61388, 29253, 23529, 47930, 40532}, i194, objArr25);
                                                                        Object objInvoke4 = cls7.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke3, objArr23);
                                                                        try {
                                                                            Object[] objArr26 = new Object[1];
                                                                            d(new int[]{-818821307, -2048758762, 841891096, 2010287119, -1787287146, -855802339, 116370881, -1108534102, -398922655, 2096879388, -1594192623, -665831636, 1340305610, -1195616613, 1787410985, -1164070679, -1197826129, -261793687, -1265910031, 1436235761}, 33 - ExpandableListView.getPackedPositionChild(0L), objArr26);
                                                                            Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                            int i195 = asBinder;
                                                                            int i196 = ((i195 | 67) << 1) - (i195 ^ 67);
                                                                            f1050a = i196 % 128;
                                                                            if (i196 % 2 != 0) {
                                                                                Object[] objArr27 = new Object[1];
                                                                                d(new int[]{1178612973, 1062500704, -1818571168, -1256207233, 869167598, -361074875, 128980116, 2122018248, -1442368262, -978594558, 1818529926, -154186594, 50596720, -1190491818}, 56 >> Color.red(1), objArr27);
                                                                                obj = objArr27[0];
                                                                            } else {
                                                                                Object[] objArr28 = new Object[1];
                                                                                d(new int[]{1178612973, 1062500704, -1818571168, -1256207233, 869167598, -361074875, 128980116, 2122018248, -1442368262, -978594558, 1818529926, -154186594, 50596720, -1190491818}, Color.red(0) + 23, objArr28);
                                                                                obj = objArr28[0];
                                                                            }
                                                                            if (!NewInstance.equals(cls8.getMethod((String) obj, null).invoke(objInvoke4, null))) {
                                                                                int i197 = f1050a;
                                                                                int i198 = (i197 ^ 81) + ((i197 & 81) << 1);
                                                                                asBinder = i198 % 128;
                                                                                if (i198 % 2 == 0) {
                                                                                    int i199 = 0 / 0;
                                                                                }
                                                                                int i200 = i197 + 21;
                                                                                asBinder = i200 % 128;
                                                                                int i201 = i200 % 2;
                                                                                try {
                                                                                    int i202 = -Color.blue(0);
                                                                                    int i203 = ((i202 | 34) << 1) - (i202 ^ 34);
                                                                                    Object[] objArr29 = new Object[1];
                                                                                    d(new int[]{-818821307, -2048758762, 841891096, 2010287119, -1787287146, -855802339, 116370881, -1108534102, -398922655, 2096879388, -1594192623, -665831636, 1340305610, -1195616613, 1787410985, -1164070679, -1197826129, -261793687, -1265910031, 1436235761}, i203, objArr29);
                                                                                    Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                                    int i204 = -Gravity.getAbsoluteGravity(0, 0);
                                                                                    Object[] objArr30 = new Object[1];
                                                                                    d(new int[]{1178612973, 1062500704, -1818571168, -1256207233, 869167598, -361074875, 128980116, 2122018248, -1442368262, -978594558, 1818529926, -154186594, 50596720, -1190491818}, (i204 & 23) + (i204 | 23), objArr30);
                                                                                    String str2 = (String) objArr30[0];
                                                                                    int i205 = f1050a;
                                                                                    int i206 = ((i205 | 25) << 1) - (i205 ^ 25);
                                                                                    asBinder = i206 % 128;
                                                                                    int i207 = i206 % 2;
                                                                                    if (!objNewInstance.equals(cls9.getMethod(str2, null).invoke(objInvoke4, null))) {
                                                                                        int i208 = i135 - 59;
                                                                                        i135 = (i208 ^ 60) + ((i208 & 60) << 1);
                                                                                        objArr15 = objArr18;
                                                                                        length = i176;
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    Throwable cause = th.getCause();
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                            int i209 = (i & (-2)) | (i14 & 1);
                                                                            Object[] objArr31 = new Object[4];
                                                                            int[] iArr3 = new int[1];
                                                                            objArr31[0] = iArr3;
                                                                            objArr31[1] = new int[1];
                                                                            int[] iArr4 = new int[1];
                                                                            objArr31[2] = iArr4;
                                                                            int i210 = asBinder;
                                                                            int i211 = (i210 ^ 125) + ((i210 & 125) << 1);
                                                                            int i212 = i211 % 128;
                                                                            f1050a = i212;
                                                                            int i213 = i211 % 2;
                                                                            iArr3[0] = i;
                                                                            iArr4[0] = i209;
                                                                            int i214 = i212 + 1;
                                                                            asBinder = i214 % 128;
                                                                            int i215 = i214 % 2;
                                                                            objArr31[3] = null;
                                                                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                                            int i216 = (((-585225656) + (((~((-42483929) | elapsedCpuTime)) | (~((-2173700) | elapsedCpuTime))) * 69)) + (((~(elapsedCpuTime | (-473279240))) | ((~((-513589469) | elapsedCpuTime)) | 471105540)) * (-69))) - 1227920224;
                                                                            int i217 = ~i216;
                                                                            int i218 = ~(((-17) ^ i217) | ((-17) & i217));
                                                                            int i219 = ~(i217 | i);
                                                                            int i220 = (-9200) + (i216 * (-575)) + (((i218 & i219) | (i218 ^ i219)) * 576);
                                                                            int i221 = ~(((-17) ^ i216) | ((-17) & i216));
                                                                            int i222 = (i217 & i27) | (i217 ^ i27);
                                                                            int i223 = ~((i222 & 16) | (i222 ^ 16));
                                                                            int i224 = ((i223 & i221) | (i221 ^ i223)) * 576;
                                                                            int i225 = (i220 & i224) + (i224 | i220);
                                                                            int i226 = -(-((~((~i216) | (-17))) * 576));
                                                                            int i227 = ((i225 | i226) << 1) - (i226 ^ i225);
                                                                            int i228 = ((i2 | i227) << 1) - (i227 ^ i2);
                                                                            int i229 = i228 ^ (i228 << 13);
                                                                            int i230 = i229 >>> 17;
                                                                            int i231 = ((~i229) & i230) | ((~i230) & i229);
                                                                            int i232 = i231 << 5;
                                                                            ((int[]) objArr31[1])[0] = ((~i231) & i232) | ((~i232) & i231);
                                                                            return objArr31;
                                                                        } catch (Throwable th2) {
                                                                            Throwable cause2 = th2.getCause();
                                                                            if (cause2 != null) {
                                                                                throw cause2;
                                                                            }
                                                                            throw th2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                Throwable cause5 = th5.getCause();
                                                                if (cause5 != null) {
                                                                    throw cause5;
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        NewInstance = i2;
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            } catch (Throwable th6) {
                                                Throwable cause6 = th6.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th6;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            Throwable cause7 = th.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            } catch (Throwable th10) {
                                Throwable cause9 = th10.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th10;
                            }
                        } catch (Throwable th11) {
                            Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    NewInstance = i2;
                }
            } else {
                NewInstance = i2;
            }
            Object[] objArr32 = {new int[]{i}, new int[1], new int[]{i}, null};
            int iNextInt = new Random().nextInt();
            int i233 = (-1443646167) + (((~(iNextInt | (-579628193))) | 619938421) * 191) + (((~((~iNextInt) | (-579628193))) | 545259552) * 191);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = FinderPatternFinder.CenterComparator.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i234 = i233 * (-563);
            int i235 = NewInstance * 565;
            int i236 = (i234 ^ i235) + ((i234 & i235) << 1);
            int i237 = ~i233;
            int i238 = ~NewInstance;
            int i239 = f1050a;
            int i240 = (i239 ^ 53) + ((i239 & 53) << 1);
            int i241 = i240 % 128;
            asBinder = i241;
            int i242 = i240 % 2;
            int i243 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            if (i242 == 0) {
                int i244 = ~((i238 & i243) | (i238 ^ i243));
                int i245 = (i244 & i237) | (i237 ^ i244);
                int i246 = ~((NewInstance ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (NewInstance & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                int i247 = -((i245 & i246) | (i245 ^ i246));
                int i248 = -((i247 & (-564)) + (i247 | (-564)));
                i3 = (i236 & i248) + (i236 | i248);
                i4 = ((i237 ^ NewInstance) == true ? 1 : 0) | ((i237 & NewInstance) == true ? 1 : 0);
            } else {
                int i249 = ~((i238 & i243) | (i238 ^ i243));
                int i250 = (i249 & i237) | (i237 ^ i249);
                int i251 = ~(NewInstance | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                int i252 = -(-(((i250 & i251) | (i250 ^ i251)) * (-564)));
                i3 = (i236 ^ i252) + ((i236 & i252) << 1);
                i4 = i237 | NewInstance;
            }
            int i253 = i3 + (1128 * (~((i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7))));
            int i254 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i255 = ~((i254 & i237) | (i237 ^ i254));
            int i256 = ~(((i233 ^ NewInstance) == true ? 1 : 0) | ((i233 & NewInstance) == true ? 1 : 0));
            int i257 = ((i255 & i256) | (i255 ^ i256)) * 564;
            int i258 = i241 + 83;
            f1050a = i258 % 128;
            if (i258 % 2 != 0) {
                int i259 = i253 - (~i257);
                int i260 = i259 - 1;
                int i261 = i259 - (-37);
                int i262 = (i260 | i261) & (~(i260 & i261));
                int i263 = i262 ^ (i262 >> 92);
                int i264 = i263 >> 5;
                ((int[]) objArr32[0])[0] = (i263 | i264) & (~(i263 & i264));
                return objArr32;
            }
            int i265 = (i253 & i257) + (i257 | i253);
            int i266 = i265 << 13;
            int i267 = (i266 | i265) & (~(i265 & i266));
            int i268 = i267 >>> 17;
            int i269 = (i267 | i268) & (~(i267 & i268));
            int i270 = i269 << 5;
            ((int[]) objArr32[1])[0] = (i269 | i270) & (~(i269 & i270));
            return objArr32;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(byte r6, short r7, short r8) {
            /*
                int r8 = r8 * 14
                int r8 = 122 - r8
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r7 = r7 + 4
                byte[] r1 = id.vida.liveness.R.raw.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: id.vida.liveness.R.raw.$$c(byte, short, short):java.lang.String");
        }
    }

    public static final class layout {
        public static final int vida_activity_host = 0x7f0e0311;
        public static final int vida_camera_fragment = 0x7f0e0312;
        public static final int vida_consent_fragment = 0x7f0e0313;
        public static final int vida_error_bottom_sheet_dialog_fragment = 0x7f0e0314;
        public static final int vida_permission_dialog_fragment = 0x7f0e0315;
        public static final int vida_review_fragment = 0x7f0e0316;
        public static final int vida_tutorial_bottom_dialog_fragment = 0x7f0e0317;
        public static final int vida_tutorial_bottom_dialog_item = 0x7f0e0318;
        public static final int vida_tutorial_fragment = 0x7f0e0319;
        private static final byte[] $$c = {83, -4, -55, -17};
        private static final int $$d = 61;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {67, -127, -109, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 235;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static long b = -6377398940819159759L;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -590129505;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 34097;

        private layout() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = id.vida.liveness.R.layout.$$a
                int r8 = r8 + 1
                int r7 = 144 - r7
                int r9 = r9 * 14
                int r9 = r9 + 84
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L13
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2a
            L13:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r9]
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: id.vida.liveness.R.layout.c(int, int, byte, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i3 = $10 + 39;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 8328), 1235 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 35 - Color.green(0), -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2764 - Color.alpha(0), 14 - ((Process.getThreadPriority(0) + 20) >> 6), 1504416861, false, $$e(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43325), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 252, 21 - TextUtils.indexOf((CharSequence) "", '0', 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myPid() >> 22) + 65200), 2891 - (ViewConfiguration.getLongPressTimeout() >> 16), 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2012627446, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
            int i5 = $10 + 89;
            $11 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:124:0x043c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x0418  */
        /* JADX WARN: Code duplicated, block: B:51:0x041e  */
        /* JADX WARN: Code duplicated, block: B:55:0x0442  */
        /* JADX WARN: Code duplicated, block: B:59:0x04a5  */
        /* JADX WARN: Code duplicated, block: B:61:0x04bf A[Catch: Exception -> 0x0733, TryCatch #6 {Exception -> 0x0733, blocks: (B:52:0x043c, B:56:0x044d, B:60:0x04b6, B:62:0x04db, B:64:0x051d, B:70:0x0580, B:61:0x04bf), top: B:124:0x043c }] */
        /* JADX WARN: Code duplicated, block: B:67:0x053a A[Catch: all -> 0x061d, TryCatch #5 {all -> 0x061d, blocks: (B:65:0x052d, B:67:0x053a, B:68:0x056f), top: B:122:0x052d, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x0629 A[Catch: Exception -> 0x0736, TRY_LEAVE, TryCatch #4 {Exception -> 0x0736, blocks: (B:77:0x0621, B:79:0x0627, B:80:0x0628, B:81:0x0629, B:86:0x0722, B:90:0x072b, B:92:0x0731, B:93:0x0732, B:82:0x06ce, B:84:0x06db, B:85:0x071b, B:65:0x052d, B:67:0x053a, B:68:0x056f), top: B:121:0x0440, inners: #3, #5 }] */
        /* JADX WARN: Code duplicated, block: B:84:0x06db A[Catch: all -> 0x072a, TryCatch #3 {all -> 0x072a, blocks: (B:82:0x06ce, B:84:0x06db, B:85:0x071b), top: B:119:0x06ce, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x0728  */
        /* JADX WARN: Code duplicated, block: B:95:0x0736 A[PHI: r2 r19
  0x0736: PHI (r2v22 int) = (r2v21 int), (r2v24 int), (r2v25 int), (r2v29 int) binds: [B:94:0x0733, B:112:0x0736, B:87:0x0726, B:74:0x0619] A[DONT_GENERATE, DONT_INLINE]
  0x0736: PHI (r19v2 ??) = (r19v1 ??), (r19v4 ??), (r19v5 ??), (r19v7 ??) binds: [B:94:0x0733, B:112:0x0736, B:87:0x0726, B:74:0x0619] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x0759  */
        /* JADX WARN: Code duplicated, block: B:99:0x0761  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r19v1 */
        /* JADX WARN: Type inference failed for: r19v11 */
        /* JADX WARN: Type inference failed for: r19v13 */
        /* JADX WARN: Type inference failed for: r19v14 */
        /* JADX WARN: Type inference failed for: r19v15 */
        /* JADX WARN: Type inference failed for: r19v16 */
        /* JADX WARN: Type inference failed for: r19v17 */
        /* JADX WARN: Type inference failed for: r19v2 */
        /* JADX WARN: Type inference failed for: r19v3 */
        /* JADX WARN: Type inference failed for: r19v4 */
        /* JADX WARN: Type inference failed for: r19v5 */
        /* JADX WARN: Type inference failed for: r19v7 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            ?? r1;
            ?? r19;
            int i6;
            ?? r110;
            int i7;
            int i8;
            int i9;
            String str;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i10;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            Class<?> cls;
            int maximumFlingVelocity;
            int i16;
            char[] cArr;
            char[] cArr2;
            int i17;
            int i18 = 2 % 2;
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i20 = ((i19 | 125) << 1) - (i19 ^ 125);
            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            int i21 = (i19 ^ 95) + ((i19 & 95) << 1);
            int i22 = i21 % 128;
            TuitionPaymentFragmentbindingInflater1 = i22;
            if (i21 % 2 != 0) {
                throw null;
            }
            if (context != null) {
                int i23 = ((i22 | 41) << 1) - (i22 ^ 41);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                int i24 = i23 % 2;
                try {
                    char[] cArr3 = {0, 0, 0, 0};
                    char[] cArr4 = {52539, 13254, 3323, 588};
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int i25 = -View.MeasureSpec.getSize(0);
                    int i26 = i25 * (-519);
                    int i27 = ((i26 | 1012897589) << 1) - (i26 ^ 1012897589);
                    int i28 = ~i25;
                    int i29 = TuitionPaymentFragmentbindingInflater1 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i29 % 128;
                    int i30 = i29 % 2;
                    int i31 = i28 | 80492850;
                    int i32 = ~i;
                    int i33 = ~((i31 ^ i32) | (i31 & i32));
                    int i34 = ~((-80492851) | i);
                    int i35 = i27 + (((i34 & i33) | (i33 ^ i34)) * 520);
                    int i36 = ~i;
                    int i37 = ~((80492850 ^ i36) | (80492850 & i36));
                    int i38 = (i25 ^ i) | (i25 & i);
                    int i39 = ~i38;
                    int i40 = -(-(((i37 ^ i39) | (i37 & i39)) * (-1040)));
                    int i41 = ((i35 | i40) << 1) - (i35 ^ i40);
                    int i42 = ~(((-815930392) ^ i) | ((-815930392) & i));
                    int i43 = -(-(((536875008 ^ i42) | (536875008 & i42)) * 305));
                    int i44 = (((-109240208) | i43) << 1) - ((-109240208) ^ i43);
                    int i45 = ~((-815930392) | i36);
                    int i46 = -(-((((-1405078712) ^ i45) | (i45 & (-1405078712))) * 305));
                    int i47 = (i44 & i46) + (i44 | i46);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i48 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i49 = (1902470827 | (~((i48 ^ 102671990) | (i48 & 102671990)))) * (-1042);
                    int i50 = ((-897500930) & i49) + ((-897500930) | i49);
                    int i51 = -(-(((102671990 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (102671990 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 521));
                    int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                    int i53 = ~((-1902470828) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    int i54 = (271906 ^ i53) | (i53 & 271906);
                    int i55 = (i48 & 1902470827) | (i48 ^ 1902470827);
                    int i56 = ~((i55 & 102671990) | (i55 ^ 102671990));
                    if (i47 > (i52 - (~(((i54 & i56) | (i54 ^ i56)) * 521))) - 1) {
                        int i57 = ~((i28 & i32) | (i28 ^ i32));
                        int i58 = ~((i25 & 80492850) | (80492850 ^ i25));
                        int i59 = i41 * (520 >>> ((~i38) | ((i58 & i57) | (i57 ^ i58))));
                        Object[] objArr2 = new Object[1];
                        char[] cArr5 = {17522, 11666, 45088, 37228, 2735, 10793, 18985, 62835, 7768, 63690, 42755, 57223, 37634, 33047, 58021, 57569, 21092, 56830, 27087, 24389, 3007, 5494, 34200};
                        a(cArr3, cArr4, cResolveSizeAndState, i59, cArr5, objArr2);
                        cls = Class.forName((String) objArr2[0]);
                        maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
                        i16 = 14344;
                        cArr = new char[]{0, 0, 0, 0};
                        i17 = 1;
                        cArr2 = new char[]{51874, 32401, 40806, 10835};
                        r19 = cArr5;
                    } else {
                        int i60 = ~((~i25) | i36);
                        int i61 = ~(i25 | 80492850);
                        int i62 = (i60 & i61) | (i60 ^ i61);
                        int i63 = -(-(((i62 & i39) | (i62 ^ i39)) * 520));
                        Object[] objArr3 = new Object[1];
                        char[] cArr6 = {17522, 11666, 45088, 37228, 2735, 10793, 18985, 62835, 7768, 63690, 42755, 57223, 37634, 33047, 58021, 57569, 21092, 56830, 27087, 24389, 3007, 5494, 34200};
                        a(cArr3, cArr4, cResolveSizeAndState, (i41 & i63) + (i41 | i63), cArr6, objArr3);
                        cls = Class.forName((String) objArr3[0]);
                        char[] cArr7 = {0, 0, 0, 0};
                        char[] cArr8 = {51874, 32401, 40806, 10835};
                        maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity();
                        i16 = 21407;
                        cArr = cArr7;
                        cArr2 = cArr8;
                        i17 = 16;
                        r19 = cArr6;
                    }
                    int i64 = TuitionPaymentFragmentbindingInflater1;
                    int i65 = ((i64 | 111) << 1) - (i64 ^ 111);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i65 % 128;
                    int i66 = i65 % 2;
                    int i67 = -(-(maximumFlingVelocity >> i17));
                    char c = (char) (((i16 | i67) << 1) - (i67 ^ i16));
                    Object[] objArr4 = new Object[1];
                    a(cArr, cArr2, c, ExpandableListView.getPackedPositionType(0L), new char[]{3423, 51252, 43506, 59115, 46622, 914, 7787, 17295, 'Q', 15801, 21039, 43037, 65480, 7020, 22441, 61147, 41892, 21260}, objArr4);
                    Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i68 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i69 = (i68 * 302) - 603;
                    int i70 = ~i68;
                    int i71 = ~(i70 | i32);
                    int i72 = -(-((i71 | (i71 ^ (-1))) * (-602)));
                    int i73 = (i69 & i72) + (i69 | i72);
                    int i74 = TuitionPaymentFragmentbindingInflater1 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i74 % 128;
                    int i75 = i74 % 2;
                    int i76 = ~i70;
                    int i77 = ~i68;
                    int i78 = ~((i77 & i) | (i77 ^ i));
                    int i79 = i68 | i36;
                    int i80 = -(-((-301) * ((~(i79 | (i79 ^ (-1)))) | (i76 & i78) | (i76 ^ i78))));
                    Object[] objArr5 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{22882, 40888, 25510, 25194}, keyRepeatTimeout, (i73 & i80) + (i80 | i73), new char[]{25780, 40238, 13368, 34445, 15722, 20965, 64484, 7693, 54049, 25083, 53709, 13750, 9103, 51506, 6449, 22577, 61159, 26776, 22815, 56658, 22622, 872, 53305, 38941, 32716, 54099, 28326, 60525, 54389, 24960, 25349, 12937, 31630, 963}, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                    TuitionPaymentFragmentbindingInflater1 = i81 % 128;
                    int i82 = i81 % 2;
                    char c2 = (char) (12979 - (~View.combineMeasuredStates(0, 0)));
                    int i83 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    Object[] objArr6 = new Object[1];
                    a(new char[]{0, 0, 0, 0}, new char[]{49740, 61841, 46288, 53298}, c2, (i83 ^ (-789474878)) + ((i83 & (-789474878)) << 1), new char[]{10839, 57851, 21053, 26594, 63467}, objArr6);
                    int i84 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                    int i85 = -i84;
                    int i86 = (i84 & i85) | (i84 ^ i85);
                    int i87 = TuitionPaymentFragmentbindingInflater1;
                    int i88 = ((i87 | 105) << 1) - (i87 ^ 105);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i88 % 128;
                    int i89 = i88 % 2;
                    int i90 = i86 >> 31;
                    int i91 = (~i90) & i;
                    int i92 = i90 & ((i & (-2)) | (i32 & 1));
                    i4 = (i92 & i91) | (i91 ^ i92);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) (16948 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i93 = 2740 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 13;
                    Object[] objArr7 = new Object[1];
                    c((short) 141, (byte) 52, $$a[7], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i93, capsMode, 1501733736, false, (String) objArr7[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                int i94 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
                TuitionPaymentFragmentbindingInflater1 = i94 % 128;
                int i95 = i94 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 16949);
                    int iResolveSize = 2739 - View.resolveSize(0, 0);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 14;
                    Object[] objArr8 = new Object[1];
                    c((short) 89, (byte) 52, $$a[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(longPressTimeout, iResolveSize, bitsPerPixel, 47863026, false, (String) objArr8[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    int i96 = TuitionPaymentFragmentbindingInflater1;
                    int i97 = (i96 ^ 87) + ((i96 & 87) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i97 % 128;
                    if (i97 % 2 == 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 16949);
                            int bitsPerPixel2 = 2738 - ImageFormat.getBitsPerPixel(0);
                            int i98 = 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            short s = (short) 37;
                            Object[] objArr9 = new Object[1];
                            c(s, (byte) s, $$a[7], objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, bitsPerPixel2, i98, 631063962, false, (String) objArr9[0], null);
                        }
                        Object obj = null;
                        set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                        obj.hashCode();
                        throw null;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 16950);
                        int iRed = Color.red(0) + 2739;
                        int defaultSize = View.getDefaultSize(0, 0) + 13;
                        short s2 = (short) 37;
                        Object[] objArr10 = new Object[1];
                        c(s2, (byte) s2, $$a[7], objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, iRed, defaultSize, 631063962, false, (String) objArr10[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i99 = TuitionPaymentFragmentbindingInflater1 + 113;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i99 % 128;
                            int i100 = i99 % 2;
                            char[] cArr9 = {0, 0, 0, 0};
                            char[] cArr10 = {49281, 53157, 57590, 42537};
                            i10 = -Gravity.getAbsoluteGravity(0, 0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i101 = ~i10;
                            int i102 = ~((i101 & (-10721)) | (i101 ^ (-10721)));
                            i11 = ~i10;
                            int i103 = TuitionPaymentFragmentbindingInflater1;
                            int i104 = ((i103 | 37) << 1) - (37 ^ i103);
                            int i105 = i104 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105;
                            int i106 = i104 % 2;
                            int i107 = ~((i11 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i11 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i108 = (i102 & i107) | (i102 ^ i107);
                            int i109 = ~(((-10721) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-10721) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            i12 = (((i10 * 881) + 9444320) - (~(-(-((-880) * ((i108 & i109) | (i108 ^ i109))))))) - 1;
                            i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i14 = i105 + 99;
                            TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i110 = ~(i11 | i13);
                                int i111 = (i110 & 10720) | (i110 ^ 10720);
                                int i112 = ~((i10 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i10 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                i15 = (i12 >>> ((-880) / ((i111 ^ i112) | (i111 & i112)))) * (880 << i112);
                            } else {
                                int i113 = ~((i11 ^ i13) | (i13 & i11));
                                int i114 = ~(i10 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                int i115 = ((i113 & 10720) | (i113 ^ 10720) | i114) * (-880);
                                int i116 = (i12 & i115) + (i115 | i12);
                                int i117 = -(-(i114 * 880));
                                i15 = (i116 ^ i117) + ((i117 & i116) << 1);
                            }
                            char c3 = (char) i15;
                            int i118 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i119 = i118 * (-947);
                            int i120 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                            TuitionPaymentFragmentbindingInflater1 = i120 % 128;
                            int i121 = i120 % 2;
                            int i122 = (i119 ^ (-949)) + ((i119 & (-949)) << 1);
                            int i123 = ~i118;
                            int i124 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i125 = -(-(((i124 & i123) | (i123 ^ i124)) * (-948)));
                            int i126 = (i122 ^ i125) + ((i122 & i125) << 1);
                            int i127 = -(-((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i123)) * (-948)));
                            int i128 = (i126 & i127) + (i127 | i126) + (i118 * 948);
                            Object[] objArr11 = new Object[1];
                            a(cArr9, cArr10, c3, i128, new char[]{35856, 32687, 10012, 48835, 51545, 2298, 60422, 39596, 33318, 27408, 26871, 38479, 10172, 42432, 47824, 17451, 40056, 20384, 36628, 39072, 57114, 26238, 60151, 57412, 20482, 42739, 47006, 62166}, objArr11);
                            Object[] objArr12 = {(String) objArr11[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cBlue = (char) Color.blue(0);
                                int iIndexOf = TextUtils.indexOf("", "") + 993;
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 8;
                                byte[] bArr = $$a;
                                short s3 = bArr[7];
                                Object[] objArr13 = new Object[1];
                                c(s3, (byte) s3, bArr[5], objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue, iIndexOf, iNormalizeMetaState, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                            long j = 394419438;
                            long j2 = 983;
                            long j3 = -1;
                            long j4 = jLongValue ^ j3;
                            long j5 = (((long) (-1965)) * j) + (((long) 984) * jLongValue) + ((j | j4) * j2);
                            r19 = i4;
                            long j6 = j ^ j3;
                            long jMyTid = ((long) Process.myTid()) ^ j3;
                            long j7 = j5 + (((long) (-983)) * (((j4 | jMyTid) ^ j3) | j6)) + (j2 * (((j6 | jMyTid) ^ j3) | ((j6 | jLongValue) ^ j3))) + ((long) (-595337675));
                            int i129 = (int) (j7 >> 32);
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i130 = i129 & (((384374654 + (((~((~startUptimeMillis) | (-421668895))) | 402663436) * 446)) + (((~(startUptimeMillis | (-19005459))) | 612894080) * 446)) - 800733976);
                            i4 = i;
                            int i131 = ~i4;
                            int i132 = ~((-2076707069) | i131);
                            int i133 = ((int) j7) & ((-1072396839) + ((639480658 | i132) * 764) + (((~(i131 | 639480658)) | (-2145238015)) * (-1528)) + (((-1574288303) | i132) * 764));
                            i6 = (i130 & i133) | (i130 ^ i133);
                            int i134 = TuitionPaymentFragmentbindingInflater1 + 95;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i134 % 128;
                            int i135 = i134 % 2;
                            r110 = r19;
                        } else {
                            r19 = i4;
                            i4 = i;
                            char cBlue2 = (char) (44221 - Color.blue(0));
                            int i136 = -(-Color.red(0));
                            Object[] objArr14 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{16908, 44397, 48588, 56236}, cBlue2, ((i136 | (-861049534)) << 1) - (i136 ^ (-861049534)), new char[]{5701}, objArr14);
                            str = (String) objArr14[0];
                            int iGreen = Color.green(0);
                            int i137 = (iGreen * (-501)) + 21689863;
                            int i138 = ((~(((-43122) ^ i4) | ((-43122) & i4))) | (~((43121 & iGreen) | (iGreen ^ 43121)))) * (-502);
                            int i139 = (i137 & i138) + (i137 | i138);
                            int i140 = (-43122) | (~i4);
                            int i141 = i139 + ((~((i140 & iGreen) | (i140 ^ iGreen))) * (-502));
                            int i142 = ~((~iGreen) | i4);
                            int i143 = ((i142 & (-43122)) | ((-43122) ^ i142)) * TypedValues.PositionType.TYPE_DRAWPATH;
                            char c4 = (char) ((i141 ^ i143) + ((i143 & i141) << 1));
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            Object[] objArr15 = new Object[1];
                            a(new char[]{0, 0, 0, 0}, new char[]{7398, 15713, 29034, 20648}, c4, ((iCombineMeasuredStates | 1782407452) << 1) - (1782407452 ^ iCombineMeasuredStates), new char[]{9754, 6711, 49043, 19297, 63660, 51006, 35965, 33352, 60576, 17712, 5183, 48932, 42383}, objArr15);
                            objArr = new Object[]{(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char doubleTapTimeout = (char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int iLastIndexOf = 3084 - TextUtils.lastIndexOf("", '0', 0);
                                int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                                byte[] bArr2 = $$a;
                                short s4 = bArr2[7];
                                Object[] objArr16 = new Object[1];
                                c(s4, (byte) s4, bArr2[5], objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, iLastIndexOf, iResolveSizeAndState, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                i6 = 1;
                                r110 = r19;
                            } else {
                                i6 = 0;
                                r110 = r19;
                            }
                        }
                        int i144 = (i4 & (-11)) | ((~i4) & 10);
                        int i145 = -i6;
                        int i146 = ((i6 & i145) | (i6 ^ i145)) >> 31;
                        int i147 = (~i146) & i4;
                        int i148 = i146 & i144;
                        int i149 = (i148 & i147) | (i147 ^ i148);
                        i7 = i2 & 32;
                        int i150 = TuitionPaymentFragmentbindingInflater1;
                        i8 = i150 + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i151 = -i7;
                            i9 = ((i7 & i151) | (i7 ^ i151)) + 63;
                        } else {
                            int i152 = -i7;
                            i9 = ((i7 & i152) | (i7 ^ i152)) >> 31;
                        }
                        i5 = (i149 & (~i9)) | (i9 & i4);
                        int i153 = ((i150 | 7) << 1) - (i150 ^ 7);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i153 % 128;
                        int i154 = i153 % 2;
                        r1 = r110;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i156 = ((i155 | 43) << 1) - (i155 ^ 43);
                        TuitionPaymentFragmentbindingInflater1 = i156 % 128;
                        int i157 = i156 % 2;
                        int i158 = ((i155 | 105) << 1) - (i155 ^ 105);
                        TuitionPaymentFragmentbindingInflater1 = i158 % 128;
                        int i159 = i158 % 2;
                        i5 = i;
                        r1 = i4;
                        i4 = i5;
                    } else {
                        try {
                            try {
                                if (Build.VERSION.SDK_INT > 33) {
                                    int i910 = TuitionPaymentFragmentbindingInflater1 + 113;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i910 % 128;
                                    int i1010 = i910 % 2;
                                    char[] cArr11 = {0, 0, 0, 0};
                                    char[] cArr12 = {49281, 53157, 57590, 42537};
                                    i10 = -Gravity.getAbsoluteGravity(0, 0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1011 = ~i10;
                                    int i1012 = ~((i1011 & (-10721)) | (i1011 ^ (-10721)));
                                    i11 = ~i10;
                                    int i1013 = TuitionPaymentFragmentbindingInflater1;
                                    int i1014 = ((i1013 | 37) << 1) - (37 ^ i1013);
                                    int i1015 = i1014 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1015;
                                    int i1016 = i1014 % 2;
                                    int i1017 = ~((i11 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i11 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i1018 = (i1012 & i1017) | (i1012 ^ i1017);
                                    int i1019 = ~(((-10721) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-10721) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    i12 = (((i10 * 881) + 9444320) - (~(-(-((-880) * ((i1018 & i1019) | (i1018 ^ i1019))))))) - 1;
                                    i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i14 = i1015 + 99;
                                    TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        int i1110 = ~(i11 | i13);
                                        int i1111 = (i1110 & 10720) | (i1110 ^ 10720);
                                        int i1112 = ~((i10 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i10 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                        i15 = (i12 >>> ((-880) / ((i1111 ^ i1112) | (i1111 & i1112)))) * (880 << i1112);
                                    } else {
                                        int i1113 = ~((i11 ^ i13) | (i13 & i11));
                                        int i1114 = ~(i10 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        int i1115 = ((i1113 & 10720) | (i1113 ^ 10720) | i1114) * (-880);
                                        int i1116 = (i12 & i1115) + (i1115 | i12);
                                        int i1117 = -(-(i1114 * 880));
                                        i15 = (i1116 ^ i1117) + ((i1117 & i1116) << 1);
                                    }
                                    char c5 = (char) i15;
                                    int i1118 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i1119 = i1118 * (-947);
                                    int i1210 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                                    TuitionPaymentFragmentbindingInflater1 = i1210 % 128;
                                    int i1211 = i1210 % 2;
                                    int i1212 = (i1119 ^ (-949)) + ((i1119 & (-949)) << 1);
                                    int i1213 = ~i1118;
                                    int i1214 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                    int i1215 = -(-(((i1214 & i1213) | (i1213 ^ i1214)) * (-948)));
                                    int i1216 = (i1212 ^ i1215) + ((i1212 & i1215) << 1);
                                    int i1217 = -(-((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i1213)) * (-948)));
                                    int i1218 = (i1216 & i1217) + (i1217 | i1216) + (i1118 * 948);
                                    Object[] objArr17 = new Object[1];
                                    a(cArr11, cArr12, c5, i1218, new char[]{35856, 32687, 10012, 48835, 51545, 2298, 60422, 39596, 33318, 27408, 26871, 38479, 10172, 42432, 47824, 17451, 40056, 20384, 36628, 39072, 57114, 26238, 60151, 57412, 20482, 42739, 47006, 62166}, objArr17);
                                    try {
                                        Object[] objArr18 = {(String) objArr17[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cBlue3 = (char) Color.blue(0);
                                            int iIndexOf2 = TextUtils.indexOf("", "") + 993;
                                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 8;
                                            byte[] bArr3 = $$a;
                                            short s5 = bArr3[7];
                                            Object[] objArr19 = new Object[1];
                                            c(s5, (byte) s5, bArr3[5], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue3, iIndexOf2, iNormalizeMetaState2, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                        }
                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                        long j8 = 394419438;
                                        long j9 = 983;
                                        long j10 = -1;
                                        long j11 = jLongValue2 ^ j10;
                                        long j12 = (((long) (-1965)) * j8) + (((long) 984) * jLongValue2) + ((j8 | j11) * j9);
                                        r19 = i4;
                                        long j13 = j8 ^ j10;
                                        long jMyTid2 = ((long) Process.myTid()) ^ j10;
                                        long j14 = j12 + (((long) (-983)) * (((j11 | jMyTid2) ^ j10) | j13)) + (j9 * (((j13 | jMyTid2) ^ j10) | ((j13 | jLongValue2) ^ j10))) + ((long) (-595337675));
                                        int i1219 = (int) (j14 >> 32);
                                        try {
                                            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                            int i1310 = i1219 & (((384374654 + (((~((~startUptimeMillis2) | (-421668895))) | 402663436) * 446)) + (((~(startUptimeMillis2 | (-19005459))) | 612894080) * 446)) - 800733976);
                                            i4 = i;
                                            int i1311 = ~i4;
                                            int i1312 = ~((-2076707069) | i1311);
                                            int i1313 = ((int) j14) & ((-1072396839) + ((639480658 | i1312) * 764) + (((~(i1311 | 639480658)) | (-2145238015)) * (-1528)) + (((-1574288303) | i1312) * 764));
                                            i6 = (i1310 & i1313) | (i1310 ^ i1313);
                                            int i1314 = TuitionPaymentFragmentbindingInflater1 + 95;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1314 % 128;
                                            int i1315 = i1314 % 2;
                                            r110 = r19;
                                        } catch (Exception unused) {
                                            i4 = i;
                                            i6 = 0;
                                            r110 = r19;
                                        }
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    r19 = i4;
                                    i4 = i;
                                    char cBlue4 = (char) (44221 - Color.blue(0));
                                    int i1316 = -(-Color.red(0));
                                    Object[] objArr110 = new Object[1];
                                    a(new char[]{0, 0, 0, 0}, new char[]{16908, 44397, 48588, 56236}, cBlue4, ((i1316 | (-861049534)) << 1) - (i1316 ^ (-861049534)), new char[]{5701}, objArr110);
                                    str = (String) objArr110[0];
                                    int iGreen2 = Color.green(0);
                                    int i1317 = (iGreen2 * (-501)) + 21689863;
                                    int i1318 = ((~(((-43122) ^ i4) | ((-43122) & i4))) | (~((43121 & iGreen2) | (iGreen2 ^ 43121)))) * (-502);
                                    int i1319 = (i1317 & i1318) + (i1317 | i1318);
                                    int i1410 = (-43122) | (~i4);
                                    int i1411 = i1319 + ((~((i1410 & iGreen2) | (i1410 ^ iGreen2))) * (-502));
                                    int i1412 = ~((~iGreen2) | i4);
                                    int i1413 = ((i1412 & (-43122)) | ((-43122) ^ i1412)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                    char c6 = (char) ((i1411 ^ i1413) + ((i1413 & i1411) << 1));
                                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                                    Object[] objArr111 = new Object[1];
                                    a(new char[]{0, 0, 0, 0}, new char[]{7398, 15713, 29034, 20648}, c6, ((iCombineMeasuredStates2 | 1782407452) << 1) - (1782407452 ^ iCombineMeasuredStates2), new char[]{9754, 6711, 49043, 19297, 63660, 51006, 35965, 33352, 60576, 17712, 5183, 48932, 42383}, objArr111);
                                    try {
                                        objArr = new Object[]{(String) objArr111[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char doubleTapTimeout2 = (char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                                            int iLastIndexOf2 = 3084 - TextUtils.lastIndexOf("", '0', 0);
                                            int iResolveSizeAndState2 = 26 - View.resolveSizeAndState(0, 0, 0);
                                            byte[] bArr4 = $$a;
                                            short s6 = bArr4[7];
                                            Object[] objArr112 = new Object[1];
                                            c(s6, (byte) s6, bArr4[5], objArr112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout2, iLastIndexOf2, iResolveSizeAndState2, 1411172903, false, (String) objArr112[0], new Class[]{String.class});
                                        }
                                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                            i6 = 1;
                                            r110 = r19;
                                        } else {
                                            i6 = 0;
                                            r110 = r19;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause3 = th3.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            r19 = i4;
                            i4 = i;
                        }
                        int i1414 = (i4 & (-11)) | ((~i4) & 10);
                        int i1415 = -i6;
                        int i1416 = ((i6 & i1415) | (i6 ^ i1415)) >> 31;
                        int i1417 = (~i1416) & i4;
                        int i1418 = i1416 & i1414;
                        int i1419 = (i1418 & i1417) | (i1417 ^ i1418);
                        i7 = i2 & 32;
                        int i1510 = TuitionPaymentFragmentbindingInflater1;
                        i8 = i1510 + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i1511 = -i7;
                            i9 = ((i7 & i1511) | (i7 ^ i1511)) + 63;
                        } else {
                            int i1512 = -i7;
                            i9 = ((i7 & i1512) | (i7 ^ i1512)) >> 31;
                        }
                        i5 = (i1419 & (~i9)) | (i9 & i4);
                        int i1513 = ((i1510 | 7) << 1) - (i1510 ^ 7);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1513 % 128;
                        int i1514 = i1513 % 2;
                        r1 = r110;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i1515 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i1516 = ((i1515 | 43) << 1) - (i1515 ^ 43);
                    TuitionPaymentFragmentbindingInflater1 = i1516 % 128;
                    int i1517 = i1516 % 2;
                    int i1518 = ((i1515 | 105) << 1) - (i1515 ^ 105);
                    TuitionPaymentFragmentbindingInflater1 = i1518 % 128;
                    int i1519 = i1518 % 2;
                    i5 = i;
                    r1 = i4;
                    i4 = i5;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i911 = TuitionPaymentFragmentbindingInflater1 + 113;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i911 % 128;
                        int i10110 = i911 % 2;
                        char[] cArr13 = {0, 0, 0, 0};
                        char[] cArr14 = {49281, 53157, 57590, 42537};
                        i10 = -Gravity.getAbsoluteGravity(0, 0);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i10111 = ~i10;
                        int i10112 = ~((i10111 & (-10721)) | (i10111 ^ (-10721)));
                        i11 = ~i10;
                        int i10113 = TuitionPaymentFragmentbindingInflater1;
                        int i10114 = ((i10113 | 37) << 1) - (37 ^ i10113);
                        int i10115 = i10114 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10115;
                        int i10116 = i10114 % 2;
                        int i10117 = ~((i11 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i11 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i10118 = (i10112 & i10117) | (i10112 ^ i10117);
                        int i10119 = ~(((-10721) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-10721) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        i12 = (((i10 * 881) + 9444320) - (~(-(-((-880) * ((i10118 & i10119) | (i10118 ^ i10119))))))) - 1;
                        i13 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        i14 = i10115 + 99;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i11110 = ~(i11 | i13);
                            int i11111 = (i11110 & 10720) | (i11110 ^ 10720);
                            int i11112 = ~((i10 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i10 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            i15 = (i12 >>> ((-880) / ((i11111 ^ i11112) | (i11111 & i11112)))) * (880 << i11112);
                        } else {
                            int i11113 = ~((i11 ^ i13) | (i13 & i11));
                            int i11114 = ~(i10 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            int i11115 = ((i11113 & 10720) | (i11113 ^ 10720) | i11114) * (-880);
                            int i11116 = (i12 & i11115) + (i11115 | i12);
                            int i11117 = -(-(i11114 * 880));
                            i15 = (i11116 ^ i11117) + ((i11117 & i11116) << 1);
                        }
                        char c7 = (char) i15;
                        int i11118 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Chip.AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i11119 = i11118 * (-947);
                        int i12110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                        TuitionPaymentFragmentbindingInflater1 = i12110 % 128;
                        int i12111 = i12110 % 2;
                        int i12112 = (i11119 ^ (-949)) + ((i11119 & (-949)) << 1);
                        int i12113 = ~i11118;
                        int i12114 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                        int i12115 = -(-(((i12114 & i12113) | (i12113 ^ i12114)) * (-948)));
                        int i12116 = (i12112 ^ i12115) + ((i12112 & i12115) << 1);
                        int i12117 = -(-((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | i12113)) * (-948)));
                        int i12118 = (i12116 & i12117) + (i12117 | i12116) + (i11118 * 948);
                        Object[] objArr113 = new Object[1];
                        a(cArr13, cArr14, c7, i12118, new char[]{35856, 32687, 10012, 48835, 51545, 2298, 60422, 39596, 33318, 27408, 26871, 38479, 10172, 42432, 47824, 17451, 40056, 20384, 36628, 39072, 57114, 26238, 60151, 57412, 20482, 42739, 47006, 62166}, objArr113);
                        Object[] objArr114 = {(String) objArr113[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cBlue5 = (char) Color.blue(0);
                            int iIndexOf3 = TextUtils.indexOf("", "") + 993;
                            int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 8;
                            byte[] bArr5 = $$a;
                            short s7 = bArr5[7];
                            Object[] objArr115 = new Object[1];
                            c(s7, (byte) s7, bArr5[5], objArr115);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cBlue5, iIndexOf3, iNormalizeMetaState3, 410748506, false, (String) objArr115[0], new Class[]{String.class});
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr114)).longValue();
                        long j15 = 394419438;
                        long j16 = 983;
                        long j17 = -1;
                        long j18 = jLongValue3 ^ j17;
                        long j19 = (((long) (-1965)) * j15) + (((long) 984) * jLongValue3) + ((j15 | j18) * j16);
                        r19 = i4;
                        long j110 = j15 ^ j17;
                        long jMyTid3 = ((long) Process.myTid()) ^ j17;
                        long j111 = j19 + (((long) (-983)) * (((j18 | jMyTid3) ^ j17) | j110)) + (j16 * (((j110 | jMyTid3) ^ j17) | ((j110 | jLongValue3) ^ j17))) + ((long) (-595337675));
                        int i12119 = (int) (j111 >> 32);
                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                        int i13110 = i12119 & (((384374654 + (((~((~startUptimeMillis3) | (-421668895))) | 402663436) * 446)) + (((~(startUptimeMillis3 | (-19005459))) | 612894080) * 446)) - 800733976);
                        i4 = i;
                        int i13111 = ~i4;
                        int i13112 = ~((-2076707069) | i13111);
                        int i13113 = ((int) j111) & ((-1072396839) + ((639480658 | i13112) * 764) + (((~(i13111 | 639480658)) | (-2145238015)) * (-1528)) + (((-1574288303) | i13112) * 764));
                        i6 = (i13110 & i13113) | (i13110 ^ i13113);
                        int i13114 = TuitionPaymentFragmentbindingInflater1 + 95;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13114 % 128;
                        int i13115 = i13114 % 2;
                        r110 = r19;
                    } else {
                        r19 = i4;
                        i4 = i;
                        char cBlue6 = (char) (44221 - Color.blue(0));
                        int i13116 = -(-Color.red(0));
                        Object[] objArr116 = new Object[1];
                        a(new char[]{0, 0, 0, 0}, new char[]{16908, 44397, 48588, 56236}, cBlue6, ((i13116 | (-861049534)) << 1) - (i13116 ^ (-861049534)), new char[]{5701}, objArr116);
                        str = (String) objArr116[0];
                        int iGreen3 = Color.green(0);
                        int i13117 = (iGreen3 * (-501)) + 21689863;
                        int i13118 = ((~(((-43122) ^ i4) | ((-43122) & i4))) | (~((43121 & iGreen3) | (iGreen3 ^ 43121)))) * (-502);
                        int i13119 = (i13117 & i13118) + (i13117 | i13118);
                        int i14110 = (-43122) | (~i4);
                        int i14111 = i13119 + ((~((i14110 & iGreen3) | (i14110 ^ iGreen3))) * (-502));
                        int i14112 = ~((~iGreen3) | i4);
                        int i14113 = ((i14112 & (-43122)) | ((-43122) ^ i14112)) * TypedValues.PositionType.TYPE_DRAWPATH;
                        char c8 = (char) ((i14111 ^ i14113) + ((i14113 & i14111) << 1));
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0);
                        Object[] objArr117 = new Object[1];
                        a(new char[]{0, 0, 0, 0}, new char[]{7398, 15713, 29034, 20648}, c8, ((iCombineMeasuredStates3 | 1782407452) << 1) - (1782407452 ^ iCombineMeasuredStates3), new char[]{9754, 6711, 49043, 19297, 63660, 51006, 35965, 33352, 60576, 17712, 5183, 48932, 42383}, objArr117);
                        objArr = new Object[]{(String) objArr117[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char doubleTapTimeout3 = (char) (33602 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int iLastIndexOf3 = 3084 - TextUtils.lastIndexOf("", '0', 0);
                            int iResolveSizeAndState3 = 26 - View.resolveSizeAndState(0, 0, 0);
                            byte[] bArr6 = $$a;
                            short s8 = bArr6[7];
                            Object[] objArr118 = new Object[1];
                            c(s8, (byte) s8, bArr6[5], objArr118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout3, iLastIndexOf3, iResolveSizeAndState3, 1411172903, false, (String) objArr118[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            i6 = 1;
                            r110 = r19;
                        } else {
                            i6 = 0;
                            r110 = r19;
                        }
                    }
                    int i14114 = (i4 & (-11)) | ((~i4) & 10);
                    int i14115 = -i6;
                    int i14116 = ((i6 & i14115) | (i6 ^ i14115)) >> 31;
                    int i14117 = (~i14116) & i4;
                    int i14118 = i14116 & i14114;
                    int i14119 = (i14118 & i14117) | (i14117 ^ i14118);
                    i7 = i2 & 32;
                    int i15110 = TuitionPaymentFragmentbindingInflater1;
                    i8 = i15110 + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i15111 = -i7;
                        i9 = ((i7 & i15111) | (i7 ^ i15111)) + 63;
                    } else {
                        int i15112 = -i7;
                        i9 = ((i7 & i15112) | (i7 ^ i15112)) >> 31;
                    }
                    i5 = (i14119 & (~i9)) | (i9 & i4);
                    int i15113 = ((i15110 | 7) << 1) - (i15110 ^ 7);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15113 % 128;
                    int i15114 = i15113 % 2;
                    r1 = r110;
                }
                int i160 = (~r1) & i4;
                int i161 = ~i4;
                int i162 = i160 | (r1 & i161);
                int i163 = -i162;
                int i164 = ((i162 & i163) | (i162 ^ i163)) >> 31;
                int i165 = i5 & (~i164);
                int i166 = r1 & i164;
                int i167 = (i165 & i166) | (i165 ^ i166);
                int i168 = (~(i4 & i167)) & (i4 | i167);
                int i169 = -i168;
                int i170 = (((i168 & i169) | (i168 ^ i169)) >> 31) & 16;
                Object[] objArr20 = {new int[]{i4}, new int[1], new int[]{i167}, null};
                int i171 = TuitionPaymentFragmentbindingInflater1 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i171 % 128;
                int i172 = i171 % 2;
                int i173 = ~((int) SystemClock.uptimeMillis());
                int i174 = (-942559356) + (((~((-33686094) | i173)) | 73996322) * (-828)) + ((i173 | (-33686094)) * (-828)) + 2122281228;
                int i175 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i176 = (i175 ^ 107) + ((i175 & 107) << 1);
                TuitionPaymentFragmentbindingInflater1 = i176 % 128;
                int i177 = i176 % 2;
                int i178 = ~i174;
                int i179 = (i170 ^ i174) | (i170 & i174);
                int i180 = (((i170 * 989) + ((-987) * i174)) - (~(-(-(((~((i161 | i178) | i170)) | (~((i179 & i4) | (i179 ^ i4)))) * 988))))) - 1;
                int i181 = ~i174;
                int i182 = (i180 - (~(-(-(((i170 ^ i181) | (i170 & i181)) * (-988)))))) - 1;
                int i183 = ~i170;
                int i184 = ~((i181 & i183) | (i183 ^ i181));
                int i185 = ~((i178 & i4) | (i178 ^ i4));
                int i186 = ~i4;
                int i187 = (i186 & i170) | (i186 ^ i170);
                int i188 = i182 + (((~((i187 & i174) | (i187 ^ i174))) | (i184 & i185) | (i184 ^ i185)) * 988);
                int i189 = (i3 ^ i188) + ((i3 & i188) << 1);
                int i190 = i189 << 13;
                int i191 = (i190 & (~i189)) | ((~i190) & i189);
                int i192 = i191 >>> 17;
                int i193 = ((~i191) & i192) | ((~i192) & i191);
                int i194 = i193 << 5;
                ((int[]) objArr20[1])[0] = ((~i193) & i194) | ((~i194) & i193);
                return objArr20;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, int r7, int r8) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 4
                byte[] r0 = id.vida.liveness.R.layout.$$c
                int r7 = r7 + 102
                int r6 = r6 * 2
                int r6 = 1 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r6
                r7 = r8
                r3 = r2
                goto L28
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r4 = r0[r7]
            L28:
                int r8 = r8 + r4
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: id.vida.liveness.R.layout.$$e(short, int, int):java.lang.String");
        }
    }
}
