package com.example.diceappprac;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RadioGroup choiceDice;
    RadioButton dice_one, dice_two, dice_three, dice_four, dice_five, dice_six;
    Button throwDice;
    int whichRadioButton = 1;

    ImageView dice_image;
    ImageView dice_image2;

    ImageView dice_image3, dice_image4, dice_image5, dice_image6;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choiceDice =  findViewById(R.id.choicedice);
        dice_one =  findViewById(R.id.dice_one);
        dice_two =  findViewById(R.id.dice_two);
        dice_three =  findViewById(R.id.dice_three);
        dice_four =  findViewById(R.id.dice_four);
        dice_five =  findViewById(R.id.dice_five);
        dice_six =  findViewById(R.id.dice_six);
        throwDice = findViewById(R.id.throwdice);
        dice_image = findViewById(R.id.diceimage);
        dice_image2 = findViewById(R.id.diceimage2);
        dice_image3 = findViewById(R.id.diceimage3);
        dice_image4 = findViewById(R.id.diceimage4);
        dice_image5 = findViewById(R.id.diceimage5);
        dice_image6 = findViewById(R.id.diceimage6);

        choiceDice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.dice_one) {
                    whichRadioButton = 1;
                    dice_image2.setVisibility(View.INVISIBLE);
                    dice_image3.setVisibility(View.INVISIBLE);
                    dice_image4.setVisibility(View.INVISIBLE);
                    dice_image5.setVisibility(View.INVISIBLE);
                    dice_image6.setVisibility(View.INVISIBLE);

                }
                else if (checkedId == R.id.dice_two) {
                    whichRadioButton = 2;
                    dice_image2.setVisibility(View.VISIBLE);
                    dice_image3.setVisibility(View.INVISIBLE);
                    dice_image4.setVisibility(View.INVISIBLE);
                    dice_image5.setVisibility(View.INVISIBLE);
                    dice_image6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_three) {
                    whichRadioButton = 3;
                    dice_image2.setVisibility(View.VISIBLE);
                    dice_image3.setVisibility(View.VISIBLE);
                    dice_image4.setVisibility(View.INVISIBLE);
                    dice_image5.setVisibility(View.INVISIBLE);
                    dice_image6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_four) {
                    whichRadioButton = 4;
                    dice_image2.setVisibility(View.VISIBLE);
                    dice_image3.setVisibility(View.VISIBLE);
                    dice_image4.setVisibility(View.VISIBLE);
                    dice_image5.setVisibility(View.INVISIBLE);
                    dice_image6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_five) {
                    whichRadioButton = 5;
                    dice_image2.setVisibility(View.VISIBLE);
                    dice_image3.setVisibility(View.VISIBLE);
                    dice_image4.setVisibility(View.VISIBLE);
                    dice_image5.setVisibility(View.VISIBLE);
                    dice_image6.setVisibility(View.INVISIBLE);
                }
                else if (checkedId == R.id.dice_six) {
                    whichRadioButton = 6;
                    dice_image2.setVisibility(View.VISIBLE);
                    dice_image3.setVisibility(View.VISIBLE);
                    dice_image4.setVisibility(View.VISIBLE);
                    dice_image5.setVisibility(View.VISIBLE);
                    dice_image6.setVisibility(View.VISIBLE);
                }
            }
        });

        throwDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberOfDice = 1;
                int numberOfDice2 = 1;
                int numberOfDice3 = 1;
                int numberOfDice4 = 1;
                int numberOfDice5 = 1;
                int numberOfDice6 = 1;

                if (whichRadioButton == 1)
                    numberOfDice = random.nextInt(6) + 1;
                else if (whichRadioButton == 2){
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                }
                else if(whichRadioButton == 3){
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                }
                else if(whichRadioButton == 4){
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                    numberOfDice4 = random.nextInt(6) + 1;
                }
                else if(whichRadioButton == 5){
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                    numberOfDice4 = random.nextInt(6) + 1;
                    numberOfDice5 = random.nextInt(6) + 1;
                }
                else if(whichRadioButton == 6){
                    numberOfDice = random.nextInt(6) + 1;
                    numberOfDice2 = random.nextInt(6) + 1;
                    numberOfDice3 = random.nextInt(6) + 1;
                    numberOfDice4 = random.nextInt(6) + 1;
                    numberOfDice5 = random.nextInt(6) + 1;
                    numberOfDice6 = random.nextInt(6) + 1;
                }

                if (whichRadioButton == 1) {
                    switch (numberOfDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice6);
                            break;
                    }
                }

                if (whichRadioButton == 2) {
                    switch (numberOfDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice6);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            dice_image2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image2.setImageResource(R.drawable.dice6);
                            break;
                    }
                }

                if (whichRadioButton == 3) {
                    switch (numberOfDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice6);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            dice_image2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image2.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice3) {
                        case 1:
                            dice_image3.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image3.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image3.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image3.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image3.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image3.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
                if (whichRadioButton == 4) {
                    switch (numberOfDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice6);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            dice_image2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image2.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice3) {
                        case 1:
                            dice_image3.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image3.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image3.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image3.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image3.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image3.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice4) {
                        case 1:
                            dice_image4.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image4.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image4.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image4.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image4.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image4.setImageResource(R.drawable.dice6);
                            break;
                    }
                }

                if (whichRadioButton == 5) {
                    switch (numberOfDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice6);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            dice_image2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image2.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice3) {
                        case 1:
                            dice_image3.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image3.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image3.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image3.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image3.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image3.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice4) {
                        case 1:
                            dice_image4.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image4.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image4.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image4.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image4.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image4.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice5) {
                        case 1:
                            dice_image5.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image5.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image5.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image5.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image5.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image5.setImageResource(R.drawable.dice6);
                            break;
                    }
                }

                if (whichRadioButton == 6) {
                    switch (numberOfDice) {
                        case 1:
                            dice_image.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image.setImageResource(R.drawable.dice6);
                            break;
                    }

                    switch (numberOfDice2) {
                        case 1:
                            dice_image2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image2.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice3) {
                        case 1:
                            dice_image3.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image3.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image3.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image3.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image3.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image3.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice4) {
                        case 1:
                            dice_image4.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image4.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image4.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image4.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image4.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image4.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice5) {
                        case 1:
                            dice_image5.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image5.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image5.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image5.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image5.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image5.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (numberOfDice6) {
                        case 1:
                            dice_image6.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            dice_image6.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            dice_image6.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            dice_image6.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            dice_image6.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            dice_image6.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
            }   //end of onClick
        });
    }   //end of onCreate
}