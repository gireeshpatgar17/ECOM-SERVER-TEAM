public interface UserRepo extends MongoRepository <User, String>{
    Optional<User> findByEmail(String email);
}
