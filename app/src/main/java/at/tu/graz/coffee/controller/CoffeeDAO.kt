package at.tu.graz.coffee.controller

<<<<<<< HEAD
<<<<<<< HEAD
import androidx.room.*
import at.tu.graz.coffee.model.Coffee
import at.tu.graz.coffee.model.CoffeeWithReviews
import at.tu.graz.coffee.model.Review

@Dao
interface CoffeeDAO {
    @Transaction
    @Query("SELECT * FROM coffee")
    fun getAll(): List<CoffeeWithReviews>

    @Insert
    fun insertCoffee(coffee: Coffee): Long

    @Insert
    fun insertReviewList(reviews: List<Review>)

    @Transaction
    fun addCoffeeWithReviews(coffee: Coffee, reviews: List<Review>){
        val listId = insertCoffee(coffee)
        reviews.forEach{it.coffeeCreatorId = listId.toInt() }
        insertReviewList(reviews)
    }
/*
    @Query("SELECT * FROM coffee WHERE coffeeId IN (:coffeeIds)")
=======
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
=======
import androidx.room.*
>>>>>>> 44fef01... COFFEE-023-Room-Database created test, fixed DAO [GA,LS]
import at.tu.graz.coffee.model.Coffee
import at.tu.graz.coffee.model.CoffeeWithReviews

@Dao
interface CoffeeDAO {
    @Transaction
    @Query("SELECT * FROM coffee")
    fun getAll(): List<CoffeeWithReviews>

<<<<<<< HEAD
    @Query("SELECT * FROM coffee WHERE id IN (:coffeeIds)")
>>>>>>> 60c2900... COFFEE-023-Room-database entities, dao's, db [GA,LS]
=======
    @Insert
    fun insertCoffee(coffee: Coffee)
/*
    @Query("SELECT * FROM coffee WHERE coffeeId IN (:coffeeIds)")
>>>>>>> 44fef01... COFFEE-023-Room-Database created test, fixed DAO [GA,LS]
    fun loadAllByIds(coffeeIds: IntArray): List<Coffee>

    @Query("SELECT * FROM coffee WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): Coffee

    @Insert
<<<<<<< HEAD
<<<<<<< HEAD
    fun insertAll(vararg coffees: CoffeeWithReviews)

    @Delete
    fun delete(coffees: Coffee)*/
=======
    fun insertAll(vararg coffees: Coffee)

    @Delete
    fun delete(coffees: Coffee)
>>>>>>> 60c2900... COFFEE-023-Room-database entities, dao's, db [GA,LS]
=======
    fun insertAll(vararg coffees: CoffeeWithReviews)

    @Delete
    fun delete(coffees: Coffee)*/
>>>>>>> 44fef01... COFFEE-023-Room-Database created test, fixed DAO [GA,LS]


}