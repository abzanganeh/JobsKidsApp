package edu.pcc.alizanganeh.jobsenspapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.teacher_text) TextView mTeacherText;
    @BindView(R.id.teacher_view) ImageView mTeacherView;
    @BindView(R.id.lawyer_text) TextView mLawyerText;
    @BindView(R.id.lawyer_view) ImageView mLawyerView;
    @BindView(R.id.engineer_text) TextView mEngineerText;
    @BindView(R.id.engineer_view) ImageView mEngineerView;
    @BindView(R.id.developer_text) TextView mDeveloperText;
    @BindView(R.id.developer_view) ImageView mDeveloperView;
    @BindView(R.id.chef_text) TextView mChefText;
    @BindView(R.id.chef_view) ImageView mChefView;
    @BindView(R.id.doctor_text) TextView mDoctorText;
    @BindView(R.id.doctor_view) ImageView mDoctorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mChefView.setOnClickListener(this);
        mDeveloperView.setOnClickListener(this);
        mDoctorView.setOnClickListener(this);
        mEngineerView.setOnClickListener(this);
        mLawyerView.setOnClickListener(this);
        mTeacherView.setOnClickListener(this);

        mChefText.setVisibility(View.INVISIBLE);
        mTeacherText.setVisibility(View.INVISIBLE);
        mEngineerText.setVisibility(View.INVISIBLE);
        mDeveloperText.setVisibility(View.INVISIBLE);
        mDoctorText.setVisibility(View.INVISIBLE);
        mLawyerText.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.teacher_view:
                mTeacherText.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayerTeacher = MediaPlayer.create(this, R.raw.teacher);
                mediaPlayerTeacher.start();
                break;
            case R.id.lawyer_view:
                mLawyerText.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayerLawyer = MediaPlayer.create(this, R.raw.lawyer);
                mediaPlayerLawyer.start();
                break;
            case R.id.doctor_view:
                mDoctorText.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayerDoctor = MediaPlayer.create(this, R.raw.doctor);
                mediaPlayerDoctor.start();
                break;
            case R.id.developer_view:
                mDeveloperText.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayerDeveloper = MediaPlayer.create(this, R.raw.developer);
                mediaPlayerDeveloper.start();
                break;
            case R.id.engineer_view:
                mEngineerText.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayerEngineer = MediaPlayer.create(this, R.raw.engineer);
                mediaPlayerEngineer.start();
                break;
            case R.id.chef_view:
                mChefText.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayerChef = MediaPlayer.create(this, R.raw.chef);
                mediaPlayerChef.start();
                break;
        }
    }
}
