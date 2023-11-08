package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1, Utils.TITLE1,Utils.DESCRIPTION1,Utils.RECIPE1));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2, Utils.TITLE2,Utils.DESCRIPTION2,Utils.RECIPE2));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3, Utils.TITLE3,Utils.DESCRIPTION3,Utils.RECIPE3));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4, Utils.TITLE4,Utils.DESCRIPTION4,Utils.RECIPE4));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.TITLE5,Utils.DESCRIPTION5,Utils.RECIPE5));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6, Utils.TITLE6,Utils.DESCRIPTION6,Utils.RECIPE6));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza7, Utils.TITLE7,Utils.DESCRIPTION7,Utils.RECIPE7));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza8, Utils.TITLE8,Utils.DESCRIPTION8,Utils.RECIPE8));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza9, Utils.TITLE9,Utils.DESCRIPTION9,Utils.RECIPE9));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza10, Utils.TITLE10,Utils.DESCRIPTION10,Utils.RECIPE10));
    }
}