package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;

import ir.zjafarian.colors.R;

public class ColorsActivity extends AppCompatActivity {
    public static final int DELAY_MILLIS = 5000;
    private Button mButton_red;
    private Button mButton_orange;
    private Button mButton_yellow;
    private Button mButton_green;
    private Button mButton_blue;
    private Button mButton_indigo;
    private Button mButton_violet;
    private final Handler handler = new Handler();


    private ScrollView mScrollView;
    private ViewGroup mLayout_main;
    private ViewGroup mLayout_inner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        setId();
        setClickListener();
    }


    private void setId() {
        mLayout_main = findViewById(R.id.main_layout);
        mLayout_inner = findViewById(R.id.layout_inner);
        mScrollView = findViewById(R.id.scrollView);
        mButton_red = findViewById(R.id.btn_red);
        mButton_orange = findViewById(R.id.btn_orange);
        mButton_yellow = findViewById(R.id.btn_yellow);
        mButton_green = findViewById(R.id.btn_green);
        mButton_blue = findViewById(R.id.btn_blue);
        mButton_indigo = findViewById(R.id.btn_indigo);
        mButton_violet = findViewById(R.id.btn_violet);
    }


    private void setClickListener() {
        mButton_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("red");
                try {
                    changeTextButtons("red");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }

            }
        });

        mButton_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("orange");
                try {
                    changeTextButtons("orange");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }
            }
        });

        mButton_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("yellow");
                try {
                    changeTextButtons("yellow");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }


            }
        });

        mButton_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("green");

                try {
                    changeTextButtons("green");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }

            }
        });

        mButton_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("blue");

                try {
                    changeTextButtons("blue");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }

            }
        });

        mButton_indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("indigo");

                try {
                    changeTextButtons("indigo");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }


            }
        });

        mButton_violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibility("violet");

                try {
                    changeTextButtons("violet");
                } finally {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            firstSetting();
                        }
                    }, DELAY_MILLIS);
                }

            }
        });

    }

    private void firstSetting() {
        mButton_red.setText(R.string.button_red);
        mButton_orange.setText(R.string.button_orange);
        mButton_yellow.setText(R.string.button_yellow);
        mButton_green.setText(R.string.button_green);
        mButton_blue.setText(R.string.button_blue);
        mButton_indigo.setText(R.string.button_indigo);
        mButton_violet.setText(R.string.button_violet);
    }


    private void changeTextButtons(String colorButton) {
        switch (colorButton) {
            case "red":
                mButton_orange.setText(R.string.button_red);
                mButton_yellow.setText(R.string.button_red);
                mButton_green.setText(R.string.button_red);
                mButton_blue.setText(R.string.button_red);
                mButton_indigo.setText(R.string.button_red);
                mButton_violet.setText(R.string.button_red);
                break;
            case "orange":
                mButton_red.setText(R.string.button_orange);
                mButton_yellow.setText(R.string.button_orange);
                mButton_green.setText(R.string.button_orange);
                mButton_blue.setText(R.string.button_orange);
                mButton_indigo.setText(R.string.button_orange);
                mButton_violet.setText(R.string.button_orange);
                break;
            case "yellow":
                mButton_orange.setText(R.string.button_yellow);
                mButton_red.setText(R.string.button_yellow);
                mButton_green.setText(R.string.button_yellow);
                mButton_blue.setText(R.string.button_yellow);
                mButton_indigo.setText(R.string.button_yellow);
                mButton_violet.setText(R.string.button_yellow);
                break;
            case "green":
                mButton_orange.setText(R.string.button_green);
                mButton_yellow.setText(R.string.button_green);
                mButton_red.setText(R.string.button_green);
                mButton_blue.setText(R.string.button_green);
                mButton_indigo.setText(R.string.button_green);
                mButton_violet.setText(R.string.button_green);
                break;
            case "blue":
                mButton_orange.setText(R.string.button_blue);
                mButton_yellow.setText(R.string.button_blue);
                mButton_green.setText(R.string.button_blue);
                mButton_red.setText(R.string.button_blue);
                mButton_indigo.setText(R.string.button_blue);
                mButton_violet.setText(R.string.button_blue);
                break;
            case "indigo":
                mButton_orange.setText(R.string.button_indigo);
                mButton_yellow.setText(R.string.button_indigo);
                mButton_green.setText(R.string.button_indigo);
                mButton_blue.setText(R.string.button_indigo);
                mButton_red.setText(R.string.button_indigo);
                mButton_violet.setText(R.string.button_indigo);
                break;
            case "violet":
                mButton_orange.setText(R.string.button_violet);
                mButton_yellow.setText(R.string.button_violet);
                mButton_green.setText(R.string.button_violet);
                mButton_blue.setText(R.string.button_violet);
                mButton_indigo.setText(R.string.button_violet);
                mButton_red.setText(R.string.button_violet);
                break;

            default:
                System.out.println("not found");
                break;
        }

    }


    private void setVisibility(String colorName) {
        switch (colorName) {

            case "red":
                mButton_red.setVisibility(View.GONE);
                mButton_orange.setVisibility(View.VISIBLE);
                mButton_yellow.setVisibility(View.VISIBLE);
                mButton_green.setVisibility(View.VISIBLE);
                mButton_blue.setVisibility(View.VISIBLE);
                mButton_indigo.setVisibility(View.VISIBLE);
                mButton_violet.setVisibility(View.VISIBLE);
                break;
            case "orange":
                mButton_orange.setVisibility(View.GONE);
                mButton_red.setVisibility(View.VISIBLE);
                mButton_yellow.setVisibility(View.VISIBLE);
                mButton_green.setVisibility(View.VISIBLE);
                mButton_blue.setVisibility(View.VISIBLE);
                mButton_indigo.setVisibility(View.VISIBLE);
                mButton_violet.setVisibility(View.VISIBLE);
                break;
            case "yellow":
                mButton_yellow.setVisibility(View.GONE);
                mButton_red.setVisibility(View.VISIBLE);
                mButton_orange.setVisibility(View.VISIBLE);
                mButton_green.setVisibility(View.VISIBLE);
                mButton_blue.setVisibility(View.VISIBLE);
                mButton_indigo.setVisibility(View.VISIBLE);
                mButton_violet.setVisibility(View.VISIBLE);
                break;
            case "green":
                mButton_green.setVisibility(View.GONE);
                mButton_red.setVisibility(View.VISIBLE);
                mButton_orange.setVisibility(View.VISIBLE);
                mButton_yellow.setVisibility(View.VISIBLE);
                mButton_blue.setVisibility(View.VISIBLE);
                mButton_indigo.setVisibility(View.VISIBLE);
                mButton_violet.setVisibility(View.VISIBLE);
                break;
            case "blue":
                mButton_blue.setVisibility(View.GONE);
                mButton_red.setVisibility(View.VISIBLE);
                mButton_orange.setVisibility(View.VISIBLE);
                mButton_yellow.setVisibility(View.VISIBLE);
                mButton_green.setVisibility(View.VISIBLE);
                mButton_indigo.setVisibility(View.VISIBLE);
                mButton_violet.setVisibility(View.VISIBLE);
                break;
            case "indigo":
                mButton_indigo.setVisibility(View.GONE);
                mButton_red.setVisibility(View.VISIBLE);
                mButton_orange.setVisibility(View.VISIBLE);
                mButton_yellow.setVisibility(View.VISIBLE);
                mButton_green.setVisibility(View.VISIBLE);
                mButton_blue.setVisibility(View.VISIBLE);
                mButton_violet.setVisibility(View.VISIBLE);
                break;
            case "violet":
                mButton_violet.setVisibility(View.GONE);
                mButton_red.setVisibility(View.VISIBLE);
                mButton_orange.setVisibility(View.VISIBLE);
                mButton_yellow.setVisibility(View.VISIBLE);
                mButton_green.setVisibility(View.VISIBLE);
                mButton_blue.setVisibility(View.VISIBLE);
                mButton_indigo.setVisibility(View.VISIBLE);

                break;
            default:
                System.out.println("not found");
                break;

        }
    }
}

