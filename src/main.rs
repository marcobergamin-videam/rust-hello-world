use random::Source;

fn main() {
    println!("Hello, rusty world!");

    let mut source = random::default(42);

    println!("Here a Random Scalar for you: {:?}", source.read::<f64>());
}
