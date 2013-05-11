// Date: 3/19/2013 7:27:52 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.ModuleTailBasic;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelArmaldo extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;

	public ModelArmaldo() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 14, 0);
		PixelmonModelRenderer main_body = new PixelmonModelRenderer(this, 0, 50);
		main_body.addBox(-4.5F, -2F, -3.066667F, 9, 6, 8);
		main_body.setTextureSize(128, 64);
		main_body.mirror = true;
		setRotation(main_body, 0.122173F, 0F, 0F);
		PixelmonModelRenderer body_upper = new PixelmonModelRenderer(this, 0,
				33);
		body_upper.addBox(-5F, -8F, -3.2F, 10, 8, 8);
		body_upper.setTextureSize(128, 64);
		body_upper.mirror = true;
		setRotation(body_upper, 0.0523599F, 0F, 0F);
		PixelmonModelRenderer neck_base = new PixelmonModelRenderer(this, 1, 22);
		neck_base.addBox(-4F, -9.4F, -3.066667F, 8, 3, 6);
		neck_base.setTextureSize(128, 64);
		neck_base.mirror = true;
		setRotation(neck_base, -0.0872665F, 0F, 0F);
		PixelmonModelRenderer neck_2 = new PixelmonModelRenderer(this, 32, 51);
		neck_2.addBox(-3F, -16.86667F, -2.033333F, 6, 8, 5);
		neck_2.setTextureSize(128, 64);
		neck_2.mirror = true;
		setRotation(neck_2, -0.0174533F, 0F, 0F);
		PixelmonModelRenderer neck_fin_1_L = new PixelmonModelRenderer(this,
				-7, 0);
		neck_fin_1_L.addBox(-0.5F, -15.266667F, 0F, 7, 3, 0);
		neck_fin_1_L.setRotationPoint(3F, 0.4666667F, 9.992007E-16F);
		neck_fin_1_L.setTextureSize(128, 64);
		neck_fin_1_L.mirror = true;
		setRotation(neck_fin_1_L, 0F, 0F, -0.1047198F);
		PixelmonModelRenderer neck_fin_2_L = new PixelmonModelRenderer(this,
				-7, 0);
		neck_fin_2_L.addBox(-0.5F, -15.466667F, 0F, 7, 3, 0);
		neck_fin_2_L.setRotationPoint(3F, 3F, 0F);
		neck_fin_2_L.setTextureSize(128, 64);
		neck_fin_2_L.mirror = true;
		setRotation(neck_fin_2_L, 0F, -0.0523599F, -0.0523599F);
		PixelmonModelRenderer neck_fin_3_L = new PixelmonModelRenderer(this,
				-7, 0);
		neck_fin_3_L.addBox(-0.5F, -15.333333F, 0F, 7, 3, 0);
		neck_fin_3_L.setRotationPoint(3F, 5.733333F, 0F);
		neck_fin_3_L.setTextureSize(128, 64);
		neck_fin_3_L.mirror = true;
		setRotation(neck_fin_3_L, 0F, -0.0872665F, -0.0349066F);
		PixelmonModelRenderer neck_fin_1_R = new PixelmonModelRenderer(this, 0,
				0);
		neck_fin_1_R.addBox(-6.5F, -15.266667F, 0F, 7, 3, 0);
		neck_fin_1_R.setRotationPoint(-3F, 0.5F, 0F);
		neck_fin_1_R.setTextureSize(128, 64);
		neck_fin_1_R.mirror = true;
		setRotation(neck_fin_1_R, 0F, 0F, 0.1047198F);
		PixelmonModelRenderer neck_fin_2_R = new PixelmonModelRenderer(this, 0,
				0);
		neck_fin_2_R.addBox(-6.5F, -15.466667F, 0F, 7, 3, 0);
		neck_fin_2_R.setRotationPoint(-3F, 3F, 0F);
		neck_fin_2_R.setTextureSize(128, 64);
		neck_fin_2_R.mirror = true;
		setRotation(neck_fin_2_R, 0F, 0.0523599F, 0.0523599F);
		PixelmonModelRenderer neck_fin_3_R = new PixelmonModelRenderer(this, 0,
				0);
		neck_fin_3_R.addBox(-6.5F, -15.333333F, 0F, 7, 3, 0);
		neck_fin_3_R.setRotationPoint(-3F, 5.666667F, 0F);
		neck_fin_3_R.setTextureSize(128, 64);
		neck_fin_3_R.mirror = true;
		setRotation(neck_fin_3_R, 0F, 0.0872665F, 0.0349066F);
		PixelmonModelRenderer wing_base_top = new PixelmonModelRenderer(this,
				37, 32);
		wing_base_top.addBox(-2F, -26.13333F, 3.466667F, 4, 5, 3);
		wing_base_top.setRotationPoint(0F, 14F, 0F);
		wing_base_top.setTextureSize(128, 64);
		wing_base_top.mirror = true;
		setRotation(wing_base_top, 0.2443461F, 0F, 0F);
		PixelmonModelRenderer wing_base_main = new PixelmonModelRenderer(this,
				37, 41);
		wing_base_main.addBox(-3F, -22.133333F, 4.066667F, 6, 6, 3);
		wing_base_main.setRotationPoint(0F, 14F, 0F);
		wing_base_main.setTextureSize(128, 64);
		wing_base_main.mirror = true;
		setRotation(wing_base_main, 0.296706F, 0F, 0F);
		PixelmonModelRenderer wing_base_bottom = new PixelmonModelRenderer(
				this, 56, 45);
		wing_base_bottom.addBox(-1.5F, -19F, 1.666667F, 3, 3, 3);
		wing_base_bottom.setRotationPoint(0F, 14F, 0F);
		wing_base_bottom.setTextureSize(128, 64);
		wing_base_bottom.mirror = true;
		setRotation(wing_base_bottom, -0.1919862F, 0F, 0F);
		PixelmonModelRenderer wing_base_spike_L_1 = new PixelmonModelRenderer(
				this, 27, 5);
		wing_base_spike_L_1.addBox(1F, -21.133333F, 6.4F, 1, 1, 2);
		wing_base_spike_L_1.setRotationPoint(0F, 14F, 0F);
		wing_base_spike_L_1.setTextureSize(128, 64);
		wing_base_spike_L_1.mirror = true;
		setRotation(wing_base_spike_L_1, 0.3316126F, 0.1047198F, 0F);
		PixelmonModelRenderer wing_base_spike_L_2 = new PixelmonModelRenderer(
				this, 27, 5);
		wing_base_spike_L_2.addBox(0.6F, -19.4F, 5.866667F, 1, 1, 2);
		wing_base_spike_L_2.setRotationPoint(0F, 14F, 0F);
		wing_base_spike_L_2.setTextureSize(128, 64);
		wing_base_spike_L_2.mirror = true;
		setRotation(wing_base_spike_L_2, 0.1745329F, 0.1047198F, 0F);
		PixelmonModelRenderer wing_base_spike_R_2 = new PixelmonModelRenderer(
				this, 27, 5);
		wing_base_spike_R_2.addBox(-1.6F, -19.4F, 5.866667F, 1, 1, 2);
		wing_base_spike_R_2.setRotationPoint(0F, 14F, 0F);
		wing_base_spike_R_2.setTextureSize(128, 64);
		wing_base_spike_R_2.mirror = true;
		setRotation(wing_base_spike_R_2, 0.1745329F, -0.1047198F, 0F);
		PixelmonModelRenderer wing_base_spike_R_1 = new PixelmonModelRenderer(
				this, 27, 5);
		wing_base_spike_R_1.addBox(-2F, -21.133333F, 6.4F, 1, 1, 2);
		wing_base_spike_R_1.setRotationPoint(0F, 14F, 0F);
		wing_base_spike_R_1.setTextureSize(128, 64);
		wing_base_spike_R_1.mirror = true;
		setRotation(wing_base_spike_R_1, 0.3316126F, -0.1047198F, 0F);
		PixelmonModelRenderer wing_L = new PixelmonModelRenderer(this, 57, 25);
		wing_L.addBox(-3F, -2.133333F, 0.06666667F, 13, 18, 0);
		wing_L.setRotationPoint(3F, -8F, 4F);
		wing_L.setTextureSize(128, 64);
		wing_L.mirror = true;
		setRotation(wing_L, 0.296706F, -0.3141593F, -0.3141593F);
		PixelmonModelRenderer wing_R = new PixelmonModelRenderer(this, 71, 25);
		wing_R.addBox(-10F, -2.133333F, 0.06666667F, 13, 18, 0);
		wing_R.setRotationPoint(-3F, -8F, 4F);
		wing_R.setTextureSize(128, 64);
		wing_R.mirror = true;
		setRotation(wing_R, 0.296706F, 0.3141593F, 0.3141593F);
		Body.addChild(main_body);
		Body.addChild(body_upper);
		Body.addChild(neck_base);
		Body.addChild(neck_2);
		Body.addChild(neck_fin_1_L);
		Body.addChild(neck_fin_2_L);
		Body.addChild(neck_fin_3_L);
		Body.addChild(neck_fin_1_R);
		Body.addChild(neck_fin_2_R);
		Body.addChild(neck_fin_3_R);
		Body.addChild(wing_base_top);
		Body.addChild(wing_base_main);
		Body.addChild(wing_base_bottom);
		Body.addChild(wing_base_spike_L_1);
		Body.addChild(wing_base_spike_L_2);
		Body.addChild(wing_base_spike_R_2);
		Body.addChild(wing_base_spike_R_1);
		Body.addChild(wing_L);
		Body.addChild(wing_R);

		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 0, 0);
		PixelmonModelRenderer tail_base = new PixelmonModelRenderer(this, 102,
				54);
		tail_base.addBox(-3.5F, 2F, -3.666667F, 7, 4, 6);
		tail_base.setTextureSize(128, 64);
		tail_base.mirror = true;
		setRotation(tail_base, 0.7330383F, 0F, 0F);
		PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 106, 43);
		tail_1.addBox(-3F, -1F, -3.333333F, 6, 5, 5);
		tail_1.setRotationPoint(0F, 4F, 4F);
		tail_1.setTextureSize(128, 64);
		tail_1.mirror = true;
		setRotation(tail_1, 0.9948377F, 0F, 0F);
		PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 110, 33);
		tail_2.addBox(-2.5F, -0.6F, -1.8F, 5, 5, 4);
		tail_2.setRotationPoint(0F, 7F, 6.6F);
		tail_2.setTextureSize(128, 64);
		tail_2.mirror = true;
		setRotation(tail_2, 1.413717F, 0F, 0F);
		PixelmonModelRenderer tail_3 = new PixelmonModelRenderer(this, 114, 24);
		tail_3.addBox(-2F, -0.8666667F, -1.4F, 4, 5, 3);
		tail_3.setRotationPoint(0F, 7.33333F, 11F);
		tail_3.setTextureSize(128, 64);
		tail_3.mirror = true;
		setRotation(tail_3, 1.605703F, 0F, 0F);
		PixelmonModelRenderer tail_4 = new PixelmonModelRenderer(this, 118, 3);
		tail_4.addBox(-1.5F, -0.8666667F, -0.6F, 3, 5, 2);
		tail_4.setRotationPoint(0F, 7.26667F, 15F);
		tail_4.setTextureSize(128, 64);
		tail_4.mirror = true;
		setRotation(tail_4, 1.710423F, 0F, 0F);
		PixelmonModelRenderer tail_5 = new PixelmonModelRenderer(this, 122, 10);
		tail_5.addBox(-1F, -0.8666667F, -0.4F, 2, 4, 1);
		tail_5.setRotationPoint(0F, 6.26667F, 19F);
		tail_5.setTextureSize(128, 64);
		tail_5.mirror = true;
		setRotation(tail_5, 1.872157F, 0F, 0F);
		PixelmonModelRenderer tail_fin_L = new PixelmonModelRenderer(this, 107,
				15);
		tail_fin_L.addBox(-1F, -0.8666667F, 0.06666667F, 9, 8, 0);
		tail_fin_L.setRotationPoint(0F, 6.26667F, 19F);
		tail_fin_L.setTextureSize(128, 64);
		tail_fin_L.mirror = true;
		setRotation(tail_fin_L, 1.867502F, 0F, -0.7330383F);
		PixelmonModelRenderer tail_fin_R = new PixelmonModelRenderer(this, 99,
				15);
		tail_fin_R.addBox(-8F, -0.8666667F, 0.06666667F, 9, 8, 0);
		tail_fin_R.setRotationPoint(0F, 6.26667F, 19F);
		tail_fin_R.setTextureSize(128, 64);
		tail_fin_R.mirror = true;
		setRotation(tail_fin_R, 1.867502F, 0F, 0.7330383F);
		Tail.addChild(tail_base);
		Tail.addChild(tail_1);
		Tail.addChild(tail_2);
		Tail.addChild(tail_3);
		Tail.addChild(tail_4);
		Tail.addChild(tail_5);
		Tail.addChild(tail_fin_L);
		Tail.addChild(tail_fin_R);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -17, 0);
		PixelmonModelRenderer main_head = new PixelmonModelRenderer(this, 35, 0);
		main_head.addBox(-3.5F, -2F, -2F, 7, 4, 4);
		main_head.setTextureSize(128, 64);
		main_head.mirror = true;
		setRotation(main_head, 0.122173F, 0F, 0F);
		PixelmonModelRenderer head_front_1 = new PixelmonModelRenderer(this,
				39, 9);
		head_front_1.addBox(-1.533333F, -2.3F, -3.066667F, 3, 3, 2);
		head_front_1.setTextureSize(128, 64);
		head_front_1.mirror = true;
		setRotation(head_front_1, 0.5585054F, 0F, 0F);
		PixelmonModelRenderer head_front_2 = new PixelmonModelRenderer(this,
				79, 15);
		head_front_2.addBox(-1F, -2.933333F, -4.4F, 2, 2, 2);
		head_front_2.setTextureSize(128, 64);
		head_front_2.mirror = true;
		setRotation(head_front_2, 0.8726646F, 0F, 0F);
		PixelmonModelRenderer head_top = new PixelmonModelRenderer(this, 27, 20);
		head_top.addBox(-2.5F, -2.4F, -2.2F, 5, 2, 4);
		head_top.setTextureSize(128, 64);
		head_top.mirror = true;
		setRotation(head_top, 0.3141593F, 0F, 0F);
		PixelmonModelRenderer head_back = new PixelmonModelRenderer(this, 0, 11);
		head_back.addBox(-3F, -1.733333F, 1.8F, 6, 3, 1);
		head_back.setTextureSize(128, 64);
		head_back.mirror = true;
		setRotation(head_back, 0.122173F, 0F, 0F);
		PixelmonModelRenderer head_top_2 = new PixelmonModelRenderer(this, 30,
				27);
		head_top_2.addBox(-1.5F, -3.066667F, -2.933333F, 3, 2, 2);
		head_top_2.setTextureSize(128, 64);
		head_top_2.mirror = true;
		setRotation(head_top_2, 0.8028515F, 0F, 0F);
		PixelmonModelRenderer eye_R = new PixelmonModelRenderer(this, 58, 0);
		eye_R.addBox(-9.9F, -2.333333F, 0F, 7, 6, 0);
		eye_R.setTextureSize(128, 64);
		eye_R.mirror = true;
		setRotation(eye_R, 0.122173F, 0F, 0.3839724F);
		PixelmonModelRenderer eye_L = new PixelmonModelRenderer(this, 65, 0);
		eye_L.addBox(2.9F, -2.333333F, 0F, 7, 6, 0);
		eye_L.setTextureSize(128, 64);
		eye_L.mirror = true;
		setRotation(eye_L, 0.122173F, 0F, -0.3839724F);
		PixelmonModelRenderer eye_R_2 = new PixelmonModelRenderer(this, 104, 61);
		eye_R_2.addBox(-7.9F, -0.6F, 0.1333333F, 5, 2, 1);
		eye_R_2.setTextureSize(128, 64);
		eye_R_2.mirror = true;
		setRotation(eye_R_2, 0.122173F, 0F, 0.3839724F);
		PixelmonModelRenderer eye_L_2 = new PixelmonModelRenderer(this, 104, 61);
		eye_L_2.addBox(2.9F, -0.6F, 0.1333333F, 5, 2, 1);
		eye_L_2.setTextureSize(128, 64);
		eye_L_2.mirror = true;
		setRotation(eye_L_2, 0.122173F, 0F, -0.3839724F);
		PixelmonModelRenderer head_front_1_R = new PixelmonModelRenderer(this,
				58, 7);
		head_front_1_R.addBox(-3.333333F, -2.3F, -2.666667F, 2, 3, 3);
		head_front_1_R.setTextureSize(128, 64);
		head_front_1_R.mirror = true;
		setRotation(head_front_1_R, 0.6632251F, -0.4014257F, -0.1745329F);
		PixelmonModelRenderer head_front_1_L = new PixelmonModelRenderer(this,
				16, 7);
		head_front_1_L.addBox(-3.3F, -2.3F, -0.6666667F, 2, 3, 3);
		head_front_1_L.setTextureSize(128, 64);
		head_front_1_L.mirror = true;
		setRotation(head_front_1_L, -0.6632251F, -2.740167F, -0.1745329F);
		PixelmonModelRenderer head_front_2_R = new PixelmonModelRenderer(this,
				54, 15);
		head_front_2_R.addBox(-3.6F, -2.3F, -2.9F, 2, 2, 2);
		head_front_2_R.setTextureSize(128, 64);
		head_front_2_R.mirror = true;
		setRotation(head_front_2_R, 0.6981317F, -0.5934119F, -0.3490659F);
		PixelmonModelRenderer head_front_2_L = new PixelmonModelRenderer(this,
				54, 15);
		head_front_2_L.addBox(1.6F, -2.3F, -2.933333F, 2, 2, 2);
		head_front_2_L.setTextureSize(128, 64);
		head_front_2_L.mirror = true;
		setRotation(head_front_2_L, 0.6981317F, 0.5934119F, 0.3490659F);
		PixelmonModelRenderer bottom_jaw_L = new PixelmonModelRenderer(this,
				69, 9);
		bottom_jaw_L.addBox(2.333333F, -1.3F, -3F, 1, 1, 3);
		bottom_jaw_L.setTextureSize(128, 64);
		bottom_jaw_L.mirror = true;
		setRotation(bottom_jaw_L, 0F, 0.4886922F, 1.082104F);
		PixelmonModelRenderer bottom_jaw_R = new PixelmonModelRenderer(this,
				69, 9);
		bottom_jaw_R.addBox(-3.3F, -1.3F, -3F, 1, 1, 3);
		bottom_jaw_R.setTextureSize(128, 64);
		bottom_jaw_R.mirror = true;
		setRotation(bottom_jaw_R, 0F, -0.4886922F, -1.082104F);
		PixelmonModelRenderer bottom_jaw_center = new PixelmonModelRenderer(
				this, 66, 13);
		bottom_jaw_center.addBox(-1F, 1.7F, -3.533333F, 2, 1, 4);
		bottom_jaw_center.setTextureSize(128, 64);
		bottom_jaw_center.mirror = true;
		setRotation(bottom_jaw_center, 0.0349066F, 0F, 0F);
		Head.addChild(main_head);
		Head.addChild(head_front_1);
		Head.addChild(head_front_2);
		Head.addChild(head_top);
		Head.addChild(head_back);
		Head.addChild(head_top_2);
		Head.addChild(eye_R);
		Head.addChild(eye_L);
		Head.addChild(eye_R_2);
		Head.addChild(eye_L_2);
		Head.addChild(head_front_1_R);
		Head.addChild(head_front_1_L);
		Head.addChild(head_front_2_R);
		Head.addChild(head_front_2_L);
		Head.addChild(bottom_jaw_L);
		Head.addChild(bottom_jaw_R);
		Head.addChild(bottom_jaw_center);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this,
				"RightLeg");
		RightLeg.setRotationPoint(-4, 4, 0);
		PixelmonModelRenderer leg_1_R = new PixelmonModelRenderer(this, 54, 52);
		leg_1_R.addBox(-2F, -2F, -3.133333F, 4, 7, 5);
		leg_1_R.setTextureSize(128, 64);
		leg_1_R.mirror = true;
		setRotation(leg_1_R, 0.8203047F, 0.5585054F, 0.2094395F);
		PixelmonModelRenderer leg_3_R = new PixelmonModelRenderer(this, 73, 49);
		leg_3_R.addBox(-2.466667F, 2F, -3.466667F, 4, 4, 4);
		leg_3_R.setTextureSize(128, 64);
		leg_3_R.mirror = true;
		setRotation(leg_3_R, 0F, 0.4014257F, 0F);
		PixelmonModelRenderer leg_2_R = new PixelmonModelRenderer(this, 73, 58);
		leg_2_R.addBox(-2F, -0.4F, -5F, 3, 3, 3);
		leg_2_R.setTextureSize(128, 64);
		leg_2_R.mirror = true;
		setRotation(leg_2_R, 0.5410521F, 0.4014257F, 0F);
		PixelmonModelRenderer toe_1_R = new PixelmonModelRenderer(this, 27, 0);
		toe_1_R.addBox(-2F, 5F, -4.466667F, 1, 1, 2);
		toe_1_R.setTextureSize(128, 64);
		toe_1_R.mirror = true;
		setRotation(toe_1_R, 0F, 0.4014257F, 0F);
		PixelmonModelRenderer toe_2_R = new PixelmonModelRenderer(this, 27, 0);
		toe_2_R.addBox(0F, 5F, -4.466667F, 1, 1, 2);
		toe_2_R.setTextureSize(128, 64);
		toe_2_R.mirror = true;
		setRotation(toe_2_R, 0F, 0.4014257F, 0F);
		RightLeg.addChild(leg_1_R);
		RightLeg.addChild(leg_3_R);
		RightLeg.addChild(leg_2_R);
		RightLeg.addChild(toe_1_R);
		RightLeg.addChild(toe_2_R);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this,
				"Left Leg");
		LeftLeg.setRotationPoint(4, 4, 0);
		PixelmonModelRenderer leg_1_L = new PixelmonModelRenderer(this, 54, 52);
		leg_1_L.addBox(-2F, -2F, -3.133333F, 4, 7, 5);
		leg_1_L.setTextureSize(128, 64);
		leg_1_L.mirror = true;
		setRotation(leg_1_L, 0.8203047F, -0.5585054F, -0.2094395F);
		PixelmonModelRenderer leg_3_L = new PixelmonModelRenderer(this, 73, 49);
		leg_3_L.addBox(-1.466667F, 2F, -3.466667F, 4, 4, 4);
		leg_3_L.setTextureSize(128, 64);
		leg_3_L.mirror = true;
		setRotation(leg_3_L, 0F, -0.4014257F, 0F);
		PixelmonModelRenderer leg_2_L = new PixelmonModelRenderer(this, 73, 58);
		leg_2_L.addBox(-1F, -0.3666667F, -5F, 3, 3, 3);
		leg_2_L.setTextureSize(128, 64);
		leg_2_L.mirror = true;
		setRotation(leg_2_L, 0.5410521F, -0.4014257F, 0F);
		PixelmonModelRenderer toe_2_L = new PixelmonModelRenderer(this, 27, 0);
		toe_2_L.addBox(1F, 5F, -4.466667F, 1, 1, 2);
		toe_2_L.setTextureSize(128, 64);
		toe_2_L.mirror = true;
		setRotation(toe_2_L, 0F, -0.4014257F, 0F);
		PixelmonModelRenderer toe_1_L = new PixelmonModelRenderer(this, 27, 0);
		toe_1_L.addBox(-1F, 5F, -4.466667F, 1, 1, 2);
		toe_1_L.setTextureSize(128, 64);
		toe_1_L.mirror = true;
		setRotation(toe_1_L, 0F, -0.4014257F, 0F);
		LeftLeg.addChild(leg_1_L);
		LeftLeg.addChild(leg_3_L);
		LeftLeg.addChild(leg_2_L);
		LeftLeg.addChild(toe_2_L);
		LeftLeg.addChild(toe_1_L);

		PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this,
				"Left Arm");
		LeftArm.setRotationPoint(2, -5, -3);
		PixelmonModelRenderer arm_1_L = new PixelmonModelRenderer(this, 81, 3);
		arm_1_L.addBox(0F, 0F, -0.6666667F, 2, 2, 2);
		arm_1_L.setTextureSize(128, 64);
		arm_1_L.mirror = true;
		setRotation(arm_1_L, 0F, -0.1919862F, 0F);
		PixelmonModelRenderer arm_2_L = new PixelmonModelRenderer(this, 82, 0);
		arm_2_L.addBox(-0.1F, 0F, -1.333333F, 1, 1, 2);
		arm_2_L.setRotationPoint(1F, 1F, -1F);
		arm_2_L.setTextureSize(128, 64);
		arm_2_L.mirror = true;
		setRotation(arm_2_L, 0.2617994F, -0.2792527F, 0F);
		PixelmonModelRenderer arm_3_L = new PixelmonModelRenderer(this, 89, 0);
		arm_3_L.addBox(-1.166667F, -0.6666667F, -0.6F, 3, 5, 2);
		arm_3_L.setRotationPoint(2F, 1.46667F, -2.266667F);
		arm_3_L.setTextureSize(128, 64);
		arm_3_L.mirror = true;
		setRotation(arm_3_L, -0.7330383F, -0.4712389F, 0F);
		PixelmonModelRenderer arm_4_L = new PixelmonModelRenderer(this, 100, 0);
		arm_4_L.addBox(-1.633333F, 2.333333F, -0.6F, 4, 5, 2);
		arm_4_L.setRotationPoint(2F, 1.46667F, -2.266667F);
		arm_4_L.setTextureSize(128, 64);
		arm_4_L.mirror = true;
		setRotation(arm_4_L, -0.5235988F, -0.4712389F, 0F);
		PixelmonModelRenderer claw_L = new PixelmonModelRenderer(this, 94, 8);
		claw_L.addBox(-0.3F, 6.333333F, -1.4F, 1, 3, 1);
		claw_L.setRotationPoint(2F, 1.46667F, -2.266667F);
		claw_L.setTextureSize(128, 64);
		claw_L.mirror = true;
		setRotation(claw_L, -0.2792527F, -0.4712389F, 0F);
		PixelmonModelRenderer claw_L_2 = new PixelmonModelRenderer(this, 89, 8);
		claw_L_2.addBox(-0.3F, 6.333333F, -3.333333F, 1, 3, 1);
		claw_L_2.setRotationPoint(2F, 1.46667F, -2.266667F);
		claw_L_2.setTextureSize(128, 64);
		claw_L_2.mirror = true;
		setRotation(claw_L_2, -0.0698132F, -0.4712389F, 0F);
		LeftArm.addChild(arm_1_L);
		LeftArm.addChild(arm_2_L);
		LeftArm.addChild(arm_3_L);
		LeftArm.addChild(arm_4_L);
		LeftArm.addChild(claw_L);
		LeftArm.addChild(claw_L_2);

		PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this,
				"Right Arm");
		RightArm.setRotationPoint(-2, -5, -3);
		PixelmonModelRenderer arm_1_R = new PixelmonModelRenderer(this, 81, 3);
		arm_1_R.addBox(-2F, 0F, -0.6666667F, 2, 2, 2);
		arm_1_R.setTextureSize(128, 64);
		arm_1_R.mirror = true;
		setRotation(arm_1_R, 0F, 0.1919862F, 0F);
		PixelmonModelRenderer arm_2_R = new PixelmonModelRenderer(this, 82, 0);
		arm_2_R.addBox(-1.1F, 0F, -1.333333F, 1, 1, 2);
		arm_2_R.setRotationPoint(-1F, 1F, -1F);
		arm_2_R.setTextureSize(128, 64);
		arm_2_R.mirror = true;
		setRotation(arm_2_R, 0.2617994F, 0.2792527F, 0F);
		PixelmonModelRenderer arm_3_R = new PixelmonModelRenderer(this, 89, 0);
		arm_3_R.addBox(-1.766667F, -0.6666667F, -0.6F, 3, 5, 2);
		arm_3_R.setRotationPoint(-1F, 1.46667F, -2.266667F);
		arm_3_R.setTextureSize(128, 64);
		arm_3_R.mirror = true;
		setRotation(arm_3_R, -0.7330383F, 0.4712389F, 0F);
		PixelmonModelRenderer arm_4_R = new PixelmonModelRenderer(this, 100, 0);
		arm_4_R.addBox(-2.4F, 2.333333F, -0.6F, 4, 5, 2);
		arm_4_R.setRotationPoint(-2F, 1.46667F, -2.266667F);
		arm_4_R.setTextureSize(128, 64);
		arm_4_R.mirror = true;
		setRotation(arm_4_R, -0.5235988F, 0.4712389F, 0F);
		PixelmonModelRenderer claw_R = new PixelmonModelRenderer(this, 94, 8);
		claw_R.addBox(-0.7F, 6.333333F, -1.4F, 1, 3, 1);
		claw_R.setRotationPoint(-2F, 1.46667F, -2.266667F);
		claw_R.setTextureSize(128, 64);
		claw_R.mirror = true;
		setRotation(claw_R, -0.2792527F, 0.4712389F, 0F);
		PixelmonModelRenderer claw_R_2 = new PixelmonModelRenderer(this, 89, 8);
		claw_R_2.addBox(-0.7F, 6.333333F, -3.333333F, 1, 3, 1);
		claw_R_2.setRotationPoint(-2F, 1.46667F, -2.266667F);
		claw_R_2.setTextureSize(128, 64);
		claw_R_2.mirror = true;
		setRotation(claw_R_2, -0.0698132F, 0.4712389F, 0F);
		RightArm.addChild(arm_1_R);
		RightArm.addChild(arm_2_R);
		RightArm.addChild(arm_3_R);
		RightArm.addChild(arm_4_R);
		RightArm.addChild(claw_R);
		RightArm.addChild(claw_R_2);

		Body.addChild(Head);
		Body.addChild(Tail);
		Body.addChild(LeftArm);
		Body.addChild(RightArm);
		Body.addChild(LeftLeg);
		Body.addChild(RightLeg);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 0, 0);

		ModuleHead headModule = new ModuleHead(Head);
		
		float legspeed = 0.5F;
		float legRotationLimit = 1.4F;
		
		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleTailBasic tailModule = new ModuleTailBasic(Tail, .2F, .05F, legspeed);
		
		skeleton = new SkeletonBiped(Body, headModule, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule, tailModule);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5) {

	}

}
