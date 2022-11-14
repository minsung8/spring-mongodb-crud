package org.de.mongodb.model;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    @BsonId
    ObjectId id;
    String name;
    @BsonProperty("updated_at")
    LocalDateTime updatedAt;
    String contents;
    int price;
}
