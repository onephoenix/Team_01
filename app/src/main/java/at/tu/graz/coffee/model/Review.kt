package at.tu.graz.coffee.model

<<<<<<< HEAD
<<<<<<< HEAD
data class Review (var taste:Int=0, var cost:Int=0, var availability:Int=0, var comment:String = "")
=======
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Review(
    @ColumnInfo(name = "taste") var taste:Int=0,
    @ColumnInfo(name = "cost") var cost:Int=0,
    @ColumnInfo(name = "availability") var availability:Int=0,
    @ColumnInfo(name = "comment") var comment:String = "",
    @ColumnInfo(name = "coffeeCreatorId") var coffeeCreatorId: Int
) {
    @PrimaryKey(autoGenerate = true) var reviewId: Int = 0
}
>>>>>>> 2f8e57c... COFFEE-023-Room-Database added CoffeeWithReviews func. [GA,LS]
=======
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class Review (
    @ColumnInfo(name = "taste") var taste:Int=0,
    @ColumnInfo(name = "cost") var cost:Int=0,
    @ColumnInfo(name = "availability")var availability:Int=0,
    @ColumnInfo(name = "comment") var comment:String = "")
>>>>>>> 60c2900... COFFEE-023-Room-database entities, dao's, db [GA,LS]
