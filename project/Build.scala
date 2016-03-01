import sbt._
import Keys._


object FruitBuild extends Build {    
    
    lazy val root = Project(id = "Fruits",
                            base = file(".")) aggregate(fruitLib, 
                            apple, banana) dependsOn(apple, banana)

    lazy val fruitLib = Project(id = "fruitLib",
                           base = file("fruitLib")) 
                           
    lazy val apple = Project(id = "apple",
                           base = file("apple")) dependsOn(fruitLib)

    lazy val banana = Project(id = "banana",
                           base = file("banana")) dependsOn(fruitLib)
}
